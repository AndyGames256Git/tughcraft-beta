
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  3 : 4  @  3 : 4

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;

> CHANGE  492 : 493  @  492 : 493

~ 	public void randomTick(World world, BlockPos blockpos, IBlockState iblockstate, EaglercraftRandom random) {

> CHANGE  3 : 4  @  3 : 4

~ 	public void updateTick(World var1, BlockPos var2, IBlockState var3, EaglercraftRandom var4) {

> CHANGE  2 : 3  @  2 : 3

~ 	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, EaglercraftRandom rand) {

> CHANGE  18 : 19  @  18 : 19

~ 	public int quantityDropped(EaglercraftRandom random) {

> CHANGE  3 : 4  @  3 : 4

~ 	public Item getItemDropped(IBlockState var1, EaglercraftRandom var2, int var3) {

> CHANGE  15 : 16  @  15 : 16

~ 		{

> DELETE  10  @  10 : 11

> CHANGE  4 : 5  @  4 : 5

~ 		if (worldIn.getGameRules().getBoolean("doTileDrops")) {

> CHANGE  12 : 13  @  12 : 13

~ 		{

> DELETE  7  @  7 : 8

> CHANGE  251 : 252  @  251 : 252

~ 	public int quantityDroppedWithBonus(int fortune, EaglercraftRandom random) {

> INSERT  136 : 137  @  136

+ 		bootstrapStates();

> INSERT  468 : 508  @  468

+ 	public static void bootstrapStates() {
+ 		BlockBed.bootstrapStates();
+ 		BlockDirt.bootstrapStates();
+ 		BlockDoor.bootstrapStates();
+ 		BlockDoublePlant.bootstrapStates();
+ 		BlockFlowerPot.bootstrapStates();
+ 		BlockHugeMushroom.bootstrapStates();
+ 		BlockLever.bootstrapStates();
+ 		BlockLog.bootstrapStates();
+ 		BlockNewLeaf.bootstrapStates();
+ 		BlockNewLog.bootstrapStates();
+ 		BlockOldLeaf.bootstrapStates();
+ 		BlockOldLog.bootstrapStates();
+ 		BlockPistonExtension.bootstrapStates();
+ 		BlockPistonMoving.bootstrapStates();
+ 		BlockPlanks.bootstrapStates();
+ 		BlockPrismarine.bootstrapStates();
+ 		BlockQuartz.bootstrapStates();
+ 		BlockRail.bootstrapStates();
+ 		BlockRailDetector.bootstrapStates();
+ 		BlockRailPowered.bootstrapStates();
+ 		BlockRedSandstone.bootstrapStates();
+ 		BlockRedstoneComparator.bootstrapStates();
+ 		BlockRedstoneWire.bootstrapStates();
+ 		BlockSand.bootstrapStates();
+ 		BlockSandStone.bootstrapStates();
+ 		BlockSapling.bootstrapStates();
+ 		BlockSilverfish.bootstrapStates();
+ 		BlockSlab.bootstrapStates();
+ 		BlockStairs.bootstrapStates();
+ 		BlockStone.bootstrapStates();
+ 		BlockStoneBrick.bootstrapStates();
+ 		BlockStoneSlab.bootstrapStates();
+ 		BlockStoneSlabNew.bootstrapStates();
+ 		BlockTallGrass.bootstrapStates();
+ 		BlockTrapDoor.bootstrapStates();
+ 		BlockWall.bootstrapStates();
+ 		BlockWoodSlab.bootstrapStates();
+ 	}
+ 

> EOF
