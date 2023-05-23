import React from 'react';

const Card = ({tie}) => {
    return (
    <div class="col">
    <div class="card">
      
      <div class="card-body">
        <h5 class="card-title">{tie.nombre}</h5>
        <p class="card-text">{tie.apellido}</p>
        <button class="btn btn-primary">Editar</button>
        <button class="btn btn-secondary">Eliminar</button>
      </div>
    </div>
  </div>
    );
};

export default Card;