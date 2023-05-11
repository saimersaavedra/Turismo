import React from 'react';

const tabla = props => {
    return (
        <div>
            <table>
                <thead>
                <th>CC</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Telefono</th>
                <th>Correo</th>
                <th>Dirección</th>
                </thead>
                <tbody>
                    <tr>
                    <td>100025553</td>
                    <td>Ximena</td>
                    <td>Barnicio</td>
                    <td>31158845</td>
                    <td>xbar@gmail.com</td>
                    <td>Av 19 6-53</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
};
export default tabla;