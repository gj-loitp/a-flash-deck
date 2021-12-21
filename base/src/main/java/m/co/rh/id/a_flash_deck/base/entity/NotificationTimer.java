/*
 *     Copyright (C) 2021 Ruby Hartono
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package m.co.rh.id.a_flash_deck.base.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "notification_timer")
public class NotificationTimer implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public Long id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "period_minutes")
    public int periodInMinutes = 15;

    /**
     * JsonArray string that stores list of selected deck ids
     */
    @ColumnInfo(name = "selected_deck_ids")
    public String selectedDeckIds;

    /**
     * JsonArray string that stores list of card that has been shown by notification
     */
    @ColumnInfo(name = "displayed_card_ids")
    public String displayedCardIds;

    /**
     * Current card ID that is displayed
     */
    public Long currentCardId;
}
