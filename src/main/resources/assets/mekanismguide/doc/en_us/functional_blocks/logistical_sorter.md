# Logistical Sorter
![logistical_sorter](item:mekanism:logistical_sorter)

Filter which items you are sending and where they go.

Connect the larger side to a block with an inventory and the smaller side with a Logistical Transporter network.

Add colours to Logistical Transporter outputs with the Configurator to control where items are routed to.

## Main options
### Single
Sends a single item instead of a whole stack each time (overrides min and max set in ItemStack filters)

### RR (Round Robin)
Turning on this mode will make the Sorter cycle through available destinations when sending items. When this option is off, items will be sent to the closest available inventory.

### Auto ( Auto-Eject )
Turning on auto-eject will cause all items to be pumped out. Turning off auto-eject will cause only items that match a filter to be pumped.

### Default
The default color tag for items. Filtered items that do not have a color tag set will use the default color tag. Left and right click will cycle forwards and backwards through the color list

### Item Filters
Any item filters you create will appear in the main section of the GUI. You can edit existing filters by clicking them.

### New Filter
Click to create a new item filter.


## Common Filter Configuration
### Color (bottom left slot)
Assign a specific color to this filter. Left and right click will cycle forwards and backwards through the color list.

### Allow Default
When turned on, the filtered item will use the default color tag instead if no inventory is available. Note that 'Auto-Eject' must be turned on for this to work

### Size Mode, Min, &amp; Max
Size mode will force the sorter to send a precise amount of items

### Fuzzy Mode
The sorter will ignore if a tool, weapon or armor is damaged or not.


## Filter Types
### ItemStack (Item)
Matches specific Item types. Click an item into the top-left slot.

### Tag
Uses the tag system to search for Items in a group. You can use a Dictionary to find these.

Type a name and click the green tick to check your entry.

#### Some examples
- `forge:ores` - All ores
- `forge:ores/iron` - All Iron ore variants
- `forge:sand` - Sand
- `minecraft:logs` - Wood Logs
- `minecraft:seeds` - Seeds

### Mod ID
Searches for any item from a specific mod. Mod IDs are all lowercase and can often be found online on wikis.
