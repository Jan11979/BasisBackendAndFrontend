import axios from "axios";

//https://jpshoplist.herokuapp.com/sl/miau
export async function getAll(src:string) {
    let uml = "http://localhost:8080/api";
    uml += src;
    const response = await fetch(uml);
    const body = await response.text();//json();
    const result = body;
    console.log("Vom Server Miau :", result);
    return result;
}

//
export const getServiceInfo = () =>
    axios.get(`http://localhost:8080/api/info`).then(response => response.data)