import React, { useEffect, useState } from 'react';
import TablaTurista from './TablaTurista';
import axios from 'axios';
import AgregarTurista from './AgregarTurista';
import CardTurista from './CardTurista';

const Turista = () => {
    const [list, setList] = useState([]);
    useEffect(() => {
        const fetchData = async () => {
            try{
                const response = await axios ({
                    url: "http://localhost:8080/Turismo-1152279/api/apiturista/turista",
                });
                setList(response.data);
            } catch(error){
                console.log(error);
            }
        };
        fetchData();

    }, [setList] );

    const createTurista = async (newTurista) => {
        try {
            console.log(newTurista);
          await axios.post("http://localhost:8080/Turismo-1152279/api/apiturista/turista",{newTurista,
                
        });
          //fetchData();
        } catch (error) {
          console.error(error);
        }
      };
    return (
        <div>
            <AgregarTurista createTurista={createTurista} />
            <TablaTurista data = {list} /> 
            <CardTurista data = {list} />             
        </div>
    );
};

export default Turista;