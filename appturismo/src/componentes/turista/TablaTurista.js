import React from 'react';
import FilaTabla from './FilaTabla';

const TablaTurista = ({data, deleteTurista}) => {
    return (
        <div>
            <div class="text-bg-primary p-3"><h3>LISTA DE TURISTAS</h3></div>
            <table class="table table-striped-columns">
                <thead>
                    <th>Nit</th>
                    <th>nombre</th>
                    <th>apellido</th>
                    <th>gmail</th>
                    <th>telefono</th>
                    <th>dirección</th>
                    <th>acciones</th>
                </thead>
                <tbody>
                    {
                    data.length > 0 ? (
                        data.map((tie) => (
                            <FilaTabla
                            key ={tie.id}
                            tie = {tie}
                            deleteTurista = {deleteTurista}             
                                                     />
                        ))
                    ) : (
                        <tr>
                            <td colSpan="6"><img alt = 'cargando' src = 'https://media.tenor.com/mJj_aSgWvYQAAAAC/cargando-xd.gif'/></td>
                        </tr>
                    )
                }   
                </tbody>
            </table>
            
        </div>
    );
};

export default TablaTurista;