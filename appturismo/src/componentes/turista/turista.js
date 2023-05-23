import React, { useEffect, useState } from 'react';
import TablaTuristas from './TablaTuristas';
import axios from 'axios';

const Turista = () => {
    const [list, setList] = useState([]);
    useEffect(() => {

        const fetchData = async() => {
          
                const response = await axios({
                    url: "http://localhost:8080/TURISMO_1152280_POO2/api/apiturista/turista"
                });
                setList(response.data);
            
        };
        fetchData();
    },[setList] );
    return (
        <div>
            <TablaTuristas/>
        </div>
    );
};
export default Turista;

