login(){  
if (typeof(Storage) !== "undefined") {
  localStorage.setItem("userId",this.state.user._id);
  localStorage.setItem("username", this.state.user.username);
  localStorage.setItem("email", this.state.user.email);
  localStorage.setItem("date", this.state.user.date); 
  this.setState({isLoggedIn: true}); 
  localStorage.setItem("isLoggedIn", this.state.isLoggedIn);
  if(localStorage.getItem("isLoggedIn")){
    console.log("Congratulations "+localStorage.getItem("username")+", you are now logged in."); 
    setTimeout(function () { 
      window.location.pathname="/user";
    }.bind(this),500);
  }
} 
else {
  console.log("No support for local storage");
}}