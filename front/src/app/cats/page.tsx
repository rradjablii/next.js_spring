"use client";
import { useEffect, useState } from "react";
import FullWidthContainer from "../component/FullWidthContainer";

export default function Cats() {
    const [fact, setFact]=useState("");
    const [loading,setLoading]=useState(true);
    useEffect(() => {
        fetch('http://localhost:8080/api/cats')
            .then((res) => res.json())
            .then((data) => {
                setFact(data.fact);
                setLoading(false);
            });
    }, []);

    if(loading){
        return <FullWidthContainer>Loading...</FullWidthContainer>
    }

    else return (
        <>
        <FullWidthContainer>{fact}</FullWidthContainer>
        </>
    );
}
