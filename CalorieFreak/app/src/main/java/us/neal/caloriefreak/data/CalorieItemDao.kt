package us.neal.caloriefreak.data

import androidx.room.*

@Dao
interface CalorieItemDao {

    @Query("SELECT * FROM calorieItem")
    fun getAllItem() : List<CalorieItem>

    @Insert
    fun addItem(calorieItem: CalorieItem) : Long

    @Delete
    fun deleteItem(calorieItem: CalorieItem)
}