import React from 'react';


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
                    <tr>
                        <td>654789</td>
                        <td>Ximena</td>
                        <td>Contreras</td>
                        <td>321456987</td>
                        <td>Av</td>
                        <td>xc@gmail.com</td>
                    </tr>
                </tbody>

            </table>            
        </div>
    );
};

export default TablaTuristas;