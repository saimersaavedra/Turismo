import React, { useState } from 'react';


const AgregarTurista = ({ createTurista}) => {
  const [newTurista, setNewTurista] = useState({ id: '', name: '', apellido: '', telefono: '', gmail: '', direction: '' });

  const handleInputChange = (e) => {
    setNewTurista({ ...newTurista, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    createTurista(newTurista);
    setNewTurista({ id: '', name: '', apellido: '', telefono: '', gmail: '', direction: ''});
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        name="id"
        value={newTurista.id}
        onChange={handleInputChange}
        placeholder="Id"
      />
      <input
        type="text"
        name="name"
        value={newTurista.nombre}
        onChange={handleInputChange}
        placeholder="Nombre"
      />
      <input
        type="text"
        name="apellido"
        value={newTurista.apellido}
        onChange={handleInputChange}
        placeholder="Apellido"
      />
      <input
        type="text"
        name="telefono"
        value={newTurista.telefono}
        onChange={handleInputChange}
        placeholder="Telefono"
      />
      <input
        type="text"
        name="gmail"
        value={newTurista.correo}
        onChange={handleInputChange}
        placeholder="Gmail"
      />
      <input
        type="text"
        name="direction"
        value={newTurista.direccion}
        onChange={handleInputChange}
        placeholder="Direccion"
      />
      <button type="submit">Agregar</button>
    </form>
  );
};

export default AgregarTurista;