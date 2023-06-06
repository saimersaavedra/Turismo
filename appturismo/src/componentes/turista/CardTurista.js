import React from 'react';
import Card from './Card';

const CardTurista = ({data, deleteTurista}) => {
    return (
        <div>
            <div class="text-bg-primary p-3"><h3>LISTA DE TURISTAS</h3></div>
            <div class="row row-cols-1 row-cols-md-3 g-4">
                {
                    data.length > 0 ? (
                        data.map((tie) => (
                            <Card
                            key ={tie.id}
                            tie = {tie}   
                            deleteTurista = {deleteTurista}         
                                                     />
                        ))

                    ) : (
                        <h3><img alt = 'cargando' src = 'https://media.tenor.com/mJj_aSgWvYQAAAAC/cargando-xd.gif'/></h3>
                    )
                }   
             
          </div>  
        </div>
    );
};

export default CardTurista;