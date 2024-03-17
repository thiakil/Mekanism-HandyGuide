# Chemical Tanks
![](item:mekanism:basic_chemical_tank,mekanism:advanced_chemical_tank,mekanism:elite_chemical_tank,mekanism:ultimate_chemical_tank)

Chemical Tanks (previously Gas Tanks) are used to store Gases, Slurries, Pigments, and Infusion elements. They can be placed as a block and can interact with Pressurized Tubes.

They come in the four tiers, each tier being double the capacity and output rate of its predecessor.

## Configurations
By default, the chemical tank will be set input on all sides, barring the front which will be set to output, (all substances). Auto eject will also be On by default, so substances will be inserted into connected Pressurized tubes on the output side(s).

## Dumping
Chemical tanks have a dump feature, which can be toggled via the button in the GUI

### Idle
The chemical tank will not dump anything.

### Dump Excess
The chemical tank will limit its storage to only 99.5% of its full capacity while voiding any excess, causing the tank to never be full.

### Dump
The chemical tank will continuously dump (void) its entire inventory, attempting to leave none left. Dumping is not instantaneous.

## Item Inventory
The Chemical Tank, when placed in the world, has two slots in its inventory.

The slot with a blue negative sign is the input slot. If you place something that contains a chemical (e.g. a chemical tank containing Oxygen) into this slot, the chemical tank will drain the item of its content as much as possible.

The slot with a red positive sign is the output slot. If you place something that can store a chemical (e.g. a chemical tank) into this slot, the chemical tank will fill the item as much as possible.
