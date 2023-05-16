import React from 'react';
import FilaTurista from './FilaTurista';


const TablaTuristas = () => {
    return (
        <div>
            <table>
                <thead>
                    <th>CC</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Telefono</th>
                    <th>Dirección</th>
                    <th>Correo</th>
                </thead>
                <tbody>
                   <FilaTurista/>
                </tbody>

            </table>            
        </div>
    );
};

export default TablaTuristas;