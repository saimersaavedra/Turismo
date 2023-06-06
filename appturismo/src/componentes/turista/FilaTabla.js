import React from 'react';
const FilaTabla =({tie, deleteTurista}) => {
    return (
       <tr>
        <td>{tie.id}</td>
        <td>{tie.name}</td>
        <td>{tie.apellido}</td>
        <td>{tie.gmail}</td>
        <td>{tie.telefono}</td>
        <td>{tie.direction}</td>
        <td>
            <button class="btn btn-primary" >Editar</button>
            <button class="btn btn-secondary" onClick={() => deleteTurista(tie.id)}>Eliminar</button>
        </td>
       </tr>
    );
};
export default FilaTabla;