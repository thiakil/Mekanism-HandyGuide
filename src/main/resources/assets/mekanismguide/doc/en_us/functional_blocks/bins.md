# Bins
![](item:mekanism:basic_bin,mekanism:advanced_bin,mekanism:elite_bin,mekanism:ultimate_bin)

Bins are storage blocks that can store a large quantity of a single item; the amount of which depends on its tier. It will retain its inventory when broken with a pickaxe or removed using a Configurator (or other wrench).

Bins have a single storage slot that ignores normal item stacking limits, allowing a large amount of a single type of item to be stored in them.

However, bins do not bypass the requirement for every item in the stack to share the same NBT data. As a result, renamed, enchanted, or damaged items can not be stacked in the bin; nor can most other items which don't stack in your inventory.

### Portable Inventory
As bins retain their inventory when picked up, they can be used as portable item storage, similar to how Shulker Boxes act in vanilla. Unlike Shulker Boxes, bins permit items to be both inserted and extracted without needing to place it down in the world.

To insert items, the bin can be placed into a crafting grid along with the items the player desires to add, and then removing the bin from the output slot, as long as the items to be inserted are the same as what is already in the bin. To extract items, the bin can be placed in a crafting grid with no other items; from there items can be extracted one stack at a time from the output slot.

### Comparator Interaction
The amount of items inside a bin can be measured using a redstone comparator. The signal strength is based on a percentage of the total capacity used, with 15 being completely full.

Note that in the case of the Creative Bin, either 0 or 15 will be outputted depending on whether there is an item in the bin, as the Creative Bin contains an infinite amount of the given item.

### Automation
Items can be inserted and extracted from any side of the Bin using Hoppers, Logistical Transporters, or any item pipe from another mod.

By sneak right-clicking a bin with a Configurator set to any Configurate mode, auto-output can be toggled. When enabled, items will automatically be ejected one stack at a time into any inventory or Logistical Transporter on the bottom of the bin, assuming that the destination can accept the item. It will not dump items as entities into the world in the event that the block below is not a suitable inventory. A bin will glow when auto-output is enabled.

### Upgrading Tier
It is possible to upgrade a bin by using it in place of an empty bin in the crafting recipe for the next tier of bin. This will not result in the loss of the contents of the bin used in the upgrade.

Similar to machines, bins can also be upgraded through the use of tier installers. By holding the installer in the main hand and sneak right-clicking the bin, the current bin will be replaced with the next tier of bin while keeping its current inventory. Note that this method is more expensive and tiers can not be skipped.
