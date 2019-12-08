package us.neal.caloriefreak.data

import androidx.room.*

@Dao
interface WeightItemDao {

    @Query("SELECT * FROM weightItem")
    fun getAllItem() : List<WeightItem>

    @Insert
    fun addItem(weightItem: WeightItem) : Long

    @Delete
    fun deleteItem(weightItem: WeightItem)
}