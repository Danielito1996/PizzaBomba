package com.elitec.dulcinea.Data.Models.Factory

import com.elitec.dulcinea.Data.IEntity
import javax.inject.Inject

class GenericsFactory<T: IEntity> @Inject constructor() {
	fun createEntity(constructor: (Int) -> T, id: Int): T {
		return constructor(id)
	}
}
/*-----IMPLEMENTACION------
       val factory = EntityFactory<Platos>()
       val plato = factory.createEntity({ id -> Platos(id, "Paella", 15.0, null) }, 1)
*/