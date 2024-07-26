'use client';
import { useState, useEffect } from 'react';
import Card from './card';

// async function getData(){
//     const response = await fetch("http://localhost:8080/api/items");
//     return response.json();
// }

const styles = {
    height:'100vh',
    display: "flex",
    flex: "1",
    justifyContent: "space-around",
    alignItems:'center'
}

export default function Props(){
    const [data, setData] = useState(null)
    const [isLoading, setLoading] = useState(true)

    useEffect(() => {
        fetch('http://localhost:8080/api/items')
          .then((res) => res.json())
          .then((data) => {
            setData(data)
            setLoading(false)
          })
      }, [])

      if (isLoading) return <p>Loading...</p>
      if (!data) return <p>No data</p>

    return (
        <div style={styles}>
            {data.map((e) => (
                <Card>
                    <img width="100vh" src={e.url} alt="" />
                </Card>
            ))}
        </div>
    );
} 


