# Digital Miner
![digital_miner](item:mekanism:digital_miner)

A highly-advanced, filter-based, auto-miner that can mine just about whatever block you tell it to.

## Usage
To begin, the Digital Miner needs a source of power. It can be powered through its energy slot (green border in the GUI) or by one of its three energy ports (indicated by a green square), which are situated on the sides and bottom.

In the main interface, click on the Config button to specify the area and filters for it to use. If you do not wish to leave empty spaces where ore blocks used to be, fill the block replacement slot with any block, turn on the requirement in the filters, and supply the necessary blocks in the machine's inventory.

Once powered and your filters made, hit the Start button back in the main interface to start mining. You will need to stop it and press the Reset button to change the configuration.

The Digital Miner has two item ports (indicated by a yellowish-tan square) - the one on the back, where output items go (auto-eject or pulled) and the one on the top to insert replacement blocks. Replacement items can be pulled from an inventory attached to the top port when Auto-Pull is turned on.

To speed up the miner, use speed upgrades. To increase the energy capacity and efficiency of the miner, install energy upgrades. Up to 8 can be used for a 10x effect for both upgrades.

Please note that if the Miner is unable to mine blocks, there may be a protection mod in place which does not allow the Miner to function (i.e. Chunk Protection). The miner will make best efforts to use the owner's permissions but compatibility cannot be guaranteed.

## Modes/Toggles
### Inverse Mode
Inverse mode mines everything that is not in the filter list. When Inverse is turned on, the replacement block and required replacement options are configured below the Inverse toggle.

### Silk Touch Mode
Emulates the silk touch enchantment. This mode requires 6x the usual amount of energy.

### Auto-Eject
When a block is mined, the block will automatically be sent to a connected Logistical Transporter or Inventory connected to the rear item port. If ejection is not possible, the item will remain in the Miner's inventory and be pushed out when possible. Note that space in the Miner's Inventory is always required to mine.

### Auto-Pull
Combined with Block Replacement mode, the Auto-Pull function will attempt to pull replacement blocks from an Inventory connected to the top item port. Without this, replacement blocks must be present in the Miner's inventory (which must also have room for mined blocks).

### Block Replacement
When a block is mined, you can choose to leave another block in its it by specifying a block in the filter. The replacement can be required (the miner will stop until it can replace the block), or optional (miner will continue without replacement). Using Auto-Pull mode with this feature is highly recommended.

## Other Options
Remember to click the tick button (or the return key) after entering a number for these settings.

### Radi (Radius)
Sets the radius of the area to mine, i.e. this distance in each horizontal direction around the miner.

### Min & Max
Sets the minimum and maximum Y-level for the mining area

## Filter Types
### ItemStack (Item)
Searches for this specific Block. This does **not** search for an item dropped from a block.

### Tag
Uses the tag system to search for Blocks in a group. You can use a [Dictionary](../gear/dictionary.md) to find these.

Type a name and click the green tick to check your entry.

#### Some examples
- `forge:ores` - All ores
- `forge:ores/iron` - All Iron ore variants
- `forge:sand` - Sand
- `minecraft:logs` - Wood Logs

More examples can be found [online](https://forge.gemwire.uk/wiki/Tags#Blocks)

### Mod ID
Searches for any block from a specific mod. Mod IDs are all lowercase and can often be found online on wikis.
