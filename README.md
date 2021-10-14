# MonsterVsPlayer
Monster Mayhem is a half-baked role-playing game, for groups of friends to play together. 
Part of the game is combat with monsters: Players are presented with one or more monster and must work together to defeat it in combat. 
One person is chosen as the Wrangler, whose role is to describe the behaviour of monsters, and interpret the actions of other players. 
The Wrangler does not participate in the combat, but manages all of the encounters. 
The Wrangler announces whose turn it is, and interprets the effect of each player’s actions on the monsters. 
The Wrangler also acts on behalf of the Monsters. You are tasked with creating a standalone software product that allows the Wrangler to manage combat in Monster Mayhem.
Rules of Monster Mayhem combat: 
• Each Player and Monster has four properties: Speed, Power, Life and Health 
• At the start of combat, all Players and Monsters are allocated a number of turns equal to their Speed. 
Each Monsters’ Health is set to be the same as their Life. 
The order in which these turns occur is randomized. 
• Once all turns are completed, a new set of turns is allocated in the same way.
• If a Monster or Player’s Health is reduced to zero, it is dead and cannot take any more turns. If all Monsters are dead or all Players are dead the combat is complete.
• On their turn, a Monster can only choose to Attack a Player. 
• On their turn, Players can choose to: - Attack a Monster - Heal a Player - Powerup 
• Each Monster can be one of three types: Ice, Fire and Water • Players can have an optional weapon. 
These weapons have the same three types as monsters, with the following effects: - 
Ice weapons do double damage to Water monsters; 
- Fire weapons do double damage to Ice monsters; 
- Water weapons do double damage to Fire monsters; 
The following are how each action works: Attack a Player (Monster only): Damages a player of the Wrangler’s choosing; it has a 75% chance of success. If successful, the Monster’s Power is subtracted from the Player’s Health. If not, nothing happens. 
Attack a Monster (Player only): Damages a Monster of the Wrangler’s choosing (they ask the Player which one). Has an 80% chance of success. If successful, the Player’s Power is subtracted from the Monster’s Health. 
Calculation must take the type of the Monster and the weapon the player is carrying into account. 
If a Player isn’t carrying a weapon, they do regular damage to all Monster types. Heal a Player (Player only): Has a 50% chance of success. 
If successful, the Player’s Power is added to another Player’s Health. 
A player’s Health cannot go above their Life. Power up (Player only): Has a 75% chance of success, and is only available if the Player’s Speed is greater than 1. If successful, the Player’s Power is doubled, but their Speed is halved (rounding up). 
Power up may performed in multiple turns, each time doubling Power and halving Speed. 
After combat, the Player’s Power and Speed both revert to their original values. 
There may be ambiguities or missing details in the above rules, please use your own judgement as appropriate. Your software is to be used by the Wrangler to manage the Combat process.
There are three distinct modes to the software: • Player Setup - The Wrangler enters the Player’s details (including weapon types). Each Player’s Health is initially set to their Life. • Combat Setup – The Wrangler chooses one or more Monsters from a list, with pre- configured attributes. It is ok to have multiple identical Monsters in combat. • Combat – When the Wrangler has completed selecting the Monster details, the software enters the game loop as described in the rules above. During this mode, the Wrangler can enter information as required, depending on which Player’s or Monster’s turn it is. 
After combat is complete, the software should return to the Setting up combat mode.
