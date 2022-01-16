import logo from "../logo.svg";
import React, {useEffect, useState} from "react";
import {getServiceInfo} from "../Controller/Fetching";
import {FetchString} from "../Controller/DataService";

import DrawInfo from "./Info";

function DrawFrameSet() {

    let tmpString: string[] = ["No Service!!"];
    const [serviceInfo, setServiceInfo] = useState(tmpString);

    useEffect(() => {
        getServiceInfo()
            .then(data => setServiceInfo( FetchString(data) ) )
        console.log("useEffect getServiceInfo Called :", serviceInfo);
    }, [])


    return (
        <div className="App">
            <header className="App-header">
                    < DrawInfo list={ serviceInfo } />
            </header>
        </div>
    );
}
export default DrawFrameSet;