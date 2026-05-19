import Car from './components/Car'
import { useState } from 'react'

function App(){
  const car1 ={price: 10, model: 'tribut',company: 'tata'}
  const car2 ={price:20, model:'i10', company:'Mahindra'}
  const car3={price:30, model:'i8',company:'suzuki'}
 
  
  return(
    <div>
      <h1>App Component</h1>
      <car>
      model={car1.model}
      price={car1.price}
      company={car1.company}
      </car>
      <hr />
      <car>
      model={car2.model}
      price={car2.price}
      company={car2.company}
      </car>
      <hr />
      <car>
      price={car3.model}
      model={car3.price}
      company={car3.company}
      </car>
    </div>
  )
}
export default App