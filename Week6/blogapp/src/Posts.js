import React from 'react';
export default class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
      hasError: false,
    };
  }
  loadPosts=async() => {
    try{
        const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const data = await response.json();
      this.setState({ posts: data });
    } catch (error) {
      console.error("Failed to fetch posts:", error);
      this.setState({ error: error, hasError: true });
    }
  }
  componentDidMount() {
    this.loadPosts();
  }
  componentDidCatch(error, info) {
    console.error("Caught an error:", error, info);
    this.setState({ hasError: true, error: error });
    alert(`An error occurred: ${error.message}`);
  }
  render() {
    if (this.state.hasError) {
      return <h1>Something went wrong. Please try again later.</h1>;
    }

    const { posts } = this.state;
    return (
      <div>
        <h1>Posts</h1>
        {posts.length > 0 ? (
          posts.map(post => (
            <div key={post.id}>
              <h2>{post.title}</h2>
              <p>{post.body}</p>
              <hr />
            </div>
          ))
        ) : (
          <p>Loading posts...</p>
        )}
      </div>
    );
  }
}
