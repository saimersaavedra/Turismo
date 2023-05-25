import React from 'react';
import FilaTabla from './FilaTabla';

const TablaTurista = ({data}) => {
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
                </thead>
                <tbody>
                    {
                    data.length > 0 ? (
                        data.map((tie) => (
                            <FilaTabla
                            key ={tie.id}
                            tie = {tie}             
                                                     />
                        ))

                    ) : (
                        <tr>
                            <td colSpan="6"><img alt = 'cargando' src = 'https://cdn.dribbble.com/users/4011649/screenshots/9633550/media/910c31b314bcaf943a4055253c6c25ec.gif'/></td>
                        </tr>
                    )
                }   
                </tbody>
            </table>
            
        </div>
    );
};

export default TablaTurista;