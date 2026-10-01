import {useState,useEffect} from "react";
function App() {
const [date,setDate] = useState(null);
useEffect(() => {
  fetch("http://localhost:2222/retrieve")
  .then( )
}, []);
  return(
    <div>
      Welcome to Spring boot with react
    </div>
  );
}
export default App;