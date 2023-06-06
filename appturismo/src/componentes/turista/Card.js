import React from 'react';

const Card = ({tie, deleteTurista}) => {
    return (
    <div class="col">
    <div class="card">
      
      <div class="card-body">
        <h5 class="card-title">{tie.name}</h5>
        <p class="card-text">{tie.apellido}</p>
        <button class="btn btn-primary">Editar</button>
        <button class="btn btn-secondary" onClick={() => deleteTurista(tie.id)}>Eliminar</button>
      </div>
    </div>
  </div>
    );
};

export default Card;