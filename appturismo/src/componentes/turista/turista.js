import React, { useEffect, useState } from 'react';
import TablaTurista from './TablaTuristas';
import axios from 'axios';
import CardTurista from './CardTurista';

const Turista = () => {
    const [list, setList] = useState([]);
    useEffect(() => {
        const fetchData = async () => {
            try{
                const response = await axios ({
                    url: "http://localhost:8080/Turismo/api/apiturista/turista",
                });
                setList(response.data);
            } catch(error){
                console.log(error);
            }
        };
        fetchData();

    }, [setList] );
    return (
        <div>
            <TablaTurista data = {list} /> 
            <CardTurista data = {list} />             
        </div>
    );
};

export default Turista;

