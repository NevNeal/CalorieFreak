package us.neal.caloriefreak.data

import androidx.room.*
import java.io.Serializable

@Entity(tableName = "calorieItem")
data class CalorieItem (
    @PrimaryKey(autoGenerate = true) var calorieItemId: Long?,
    @ColumnInfo(name = "calorieItemName") var calorieItemName: String,
    @ColumnInfo(name = "calorieAmount") var calorieAmount: Int
    //date

) : Serializable