# Thermal Evaporation Plant
![](item:mekanism:thermal_evaporation_controller,mekanism:thermal_evaporation_block,mekanism:thermal_evaporation_valve,mekanism:structural_glass)

The Thermal Evaporation Plant is a multiblock structure with the purpose of using heat to convert Water to Brine, which can be further converted to Lithium by the use of a second Thermal Evaporation Plant.

## Construction

### Minimal Size
**Layer 1**

A 4x4 layer of Thermal Evaporation Blocks

    T T T T
    T T T T
    T T T T
    T T T T

**Layer 2**

A ring of Thermal Evaporation Blocks.

    T T T T
    T - - T
    T - - T
    T T T T

The Thermal Evaporation Controller (max 1) should be on this layer (instead of a Thermal Evaporation Block) in one of the inner 2 places, e.g. `C` below. Ensure the Controller screen faces outwards.

    T C C T
    C - - C
    C - - C
    T C C T

Structural Glass and Thermal Evaporation Valves can also replace Thermal Evaporation Blocks in the same positions.

**Layer 3** (top layer)

Another ring layer, however the 4 corners are not required, and the Controller cannot be on this layer.

    - T T -
    T - - T
    T - - T
    - T T -

Structural Glass can be used on this layer, however there must be at least 1 Thermal Evaporation Block or Valve on each face. **This is the only layer that can have Valves on the corners.**

    V G G V
    G - - G
    G - - G
    V G G V

**Complete**

Once the structure is correctly formed, the structure will emit redstone particle sparkles and the Controller will start glowing green.

If you forgot to add a Valve, now's the time to replace a Thermal Evaporation Block or Structural Glass block and check that the structure is still valid.

### Increasing Size
Layer 2 can be repeated up to 16 times (for a total height of 18 blocks). This will increase the input tank capacity.

## Heat
A Thermal Evaporation Plant requires heat in order to convert the input fluid to the output fluid.

### Advanced Solar Generator
Simply place an Advanced Solar Generator in the corners of the top layer of the Plant. During the day, heat will be generated in the Plant automatically. The generators are still fully functional and the power can be used elsewhere.

### External Heat Input
Heat can be inserted via a Valve - simply place a heat source (Fuelwood Heater, Resistive Heater, Fusion Reactor) next to the valve or connected via Thermodynamic Conductors (incurs losses).


