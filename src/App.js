import { useEffect, useState } from "react";
import axios from "axios";
import "./App.css";

function App() {
    const url = 'http://localhost:8080/api/Messages'
    const [Message, setMessages] = useState(null);
    useEffect(() => {
        axios.get(url)
            .then((response) => {
                setMessages(response.data)
            })
    }, [url]);

        if (Message) {
        return (
         <div>
              <h1> {Message.theMessage} </h1>
         </div>
        );
        }
    return (
        <div>
        </div>
        )
}

export default App;

export default App;
