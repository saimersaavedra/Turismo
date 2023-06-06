import React, { useEffect, useState } from 'react';
import TablaTurista from './TablaTurista';
import axios from 'axios';
import AgregarTurista from './AgregarTurista';
import CardTurista from './CardTurista';

const Turista = () => {

    const [list, setList] = useState([]);
    useEffect(() => {
        fetchData();
    }, [setList] );

    const fetchData = async () => {
        try{
            const response = await axios ({
                url: "http://localhost:8080/TURISMO_1152280_POO2/api/apiturista/turista",
            });
            setList(response.data);
        } catch(error){
            console.log(error);
        }
    };

    const createTurista = async (newTurista) => {
        try {
            console.log(newTurista);
          await axios.post("http://localhost:8080/TURISMO_1152280_POO2/api/apiturista/turista",newTurista,{
            headers: {
              'Content-Type': 'application/json',
            },
        });
          fetchData();
        } catch (error) {
          console.error(error);
        }

      };
      const deleteTurista = async (id) => {
        let isDelete = window.confirm(
            `¿Estás seguro de eliminar el registro con el id '${id}'?`
          );
          if (isDelete){
            try {
                await axios.delete(
                  `http://localhost:8080/TURISMO_1152280_POO2/api/apiturista/turista/${id}`
                );
                console.log("si");
              } catch (error) {
                console.log(error);
              }
            };
            fetchData();
      };
    return (
        <div>
            <AgregarTurista createTurista={createTurista} />
            <TablaTurista data={list} deleteTurista={deleteTurista} /> 
            <CardTurista data = {list} deleteTurista={deleteTurista} />             
        </div>
    );
};

export default Turista;