package us.neal.caloriefreak.data

import androidx.room.*
import java.io.Serializable

@Entity(tableName = "weightItem")
data class WeightItem (
    @PrimaryKey(autoGenerate = true) var weightItemId: Long?,
    @ColumnInfo(name = "weightItemName") var weightItemName: String,
    @ColumnInfo(name = "weightAmount") var weightAmount: Int
    //date??
): Serializable