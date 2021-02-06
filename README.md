# TiltTray Sorters
Wikipedia: A tilt-tray sorter is a high-speed, continuous-loop sortation conveyor that uses a technique of tilting a tray at a chute to slide the object into the chute. It is used to expedite the process of Order fulfillment to consolidate line items of an order, and to process returned products for immediate updating of inventory in real time.

![Convetional TiltTray](https://github.com/RandomCoder987/TiltTray/blob/main/Conventional%20TiltTray.png)

![Tray1](https://github.com/RandomCoder987/TiltTray/blob/main/TiltTray1.png)

![Tray2](https://github.com/RandomCoder987/TiltTray/blob/main/TiltTray2.png)

If a sorter has 2,000 chutes (destinations), the product for 2,000 orders can be picked together, in a single pass through the pick zones to be inducted on the sorter. The mixed picked product is scanned on the trays and sorted by the sorter to the individual orders. This process significantly reduces the amount of walking that pickers need to do at the facility. Without a sorter, if pickers were picking single orders at a time, pickers could potentially walk 2,000 times more than pickers with a sorter.

Typically, sorters move at a rate of 10,000 trays per hour (mechanical capacity); meaning, the inductor would see this number of trays crossing in front of him/her every hour. Consequently, with one induction zone, the sorter can sort 10,000 items per hour if the inductor fills all the trays going by the induction zone.

The 10,000 items per hour capacity of a sorter may not be enough to process all the orders that companies shipping large number of orders need to sort. If more sorters are added to the operation, pickers need to pre-sort the picked product to the sorter to be used by the order; this pre-sorting could require extra walking or having the picker carrying more than one container to pick the products (error prone). Also, sorters are expensive.

Before adding a second sorter, for a limited increase in the capacity of a single sorter, beyond the 10,000 sorts per hour mechanical capacity, it is better to add induction zones.

![TiltTray with 2 induction zones](https://github.com/RandomCoder987/TiltTray/blob/main/TiltTray%20with%20two%20induction%20zones.png)

In the above drawing, trays that drop the product in the half of the sorter after their induction zone can be re-used by the other inductor; effectively, sorting more than the 10,000 items per hour that are achieved with only one induction zone.

## Questions
Always assuming that a sorted item has the same probability of going to any chute destination and that inductors can fill all empty trays going by the induction zone:
* What is the expected increase in sorted items per hour with 2 induction zones placed in opposite points of the sorter?
* What is the expected increase with 4 induction zones?
* What is the expected increase with “N” induction zones?

# Solution
Solution explaination is coming soon!

## How to run
Go to Simulator.java, compile and run the file.  
Adjust the values slots, slotsPerHour, inductionZones and detailedLogs flag as needed.

## Sample Output
Slots: 100 Rounds: 1000000 Induction Zones: 1  
Total trays filled: 1000000.0 Efficiency improvement: 1.0  

Slots: 100 Rounds: 1000000 Induction Zones: 2  
Total trays filled: 1333408.0 Efficiency improvement: 1.333408 

Slots: 100 Rounds: 1000000 Induction Zones: 4  
Total trays filled: 1599835.0 Efficiency improvement: 1.599835  

Slots: 100 Rounds: 1000000 Induction Zones: 5  
Total trays filled: 1667068.0 Efficiency improvement: 1.667068  

Slots: 100 Rounds: 1000000 Induction Zones: 10  
Total trays filled: 1818764.0 Efficiency improvement: 1.818764  

Slots: 100 Rounds: 1000000 Induction Zones: 20  
Total trays filled: 1905234.0 Efficiency improvement: 1.905234  

Slots: 100 Rounds: 1000000 Induction Zones: 50  
Total trays filled: 1960088.0 Efficiency improvement: 1.960088  

Slots: 100 Rounds: 1000000 Induction Zones: 100  
Total trays filled: 1980550.0 Efficiency improvement: 1.98055  
