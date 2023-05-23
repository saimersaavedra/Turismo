import React from 'react';

const FilaTurista = ({tie}) => {
    return (
        <tr>
                        <td>{tie.id}</td>
                        <td>{tie.nombre}</td>
                        <td>{tie.apellido}</td>
                        <td>{tie.numero}</td>
                        <td>{tie.direccion}</td>
                        <td>{tie.correo}</td>
                        <td>
                            <button>Editar</button>
                            <button>Eliminar</button>
                        </td>
        </tr>
    );
};
export default FilaTurista;
