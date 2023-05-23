import React from 'react';
import FilaTurista from './FilaTurista';


const TablaTuristas = ({data}) => {
    return (
        <div>
            <div class="text-bg-primary p-3">
            <h3>LISTA DE TURISTAS</h3>
            </div> 
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
             { data.length > 0 ? ( data.map((tie) => ( 
             <FilaTurista key ={tie.id} tie = {tie}              
             />   ))  ) : 
             ( <tr> <td colSpan="6">Sin Datos</td> </tr> ) }    
                </tbody>

            </table>            
        </div>
    );
};

export default TablaTuristas;

