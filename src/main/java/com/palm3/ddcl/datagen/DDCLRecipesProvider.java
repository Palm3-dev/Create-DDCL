package com.palm3.ddcl.datagen;

import com.palm3.ddcl.DDCLBlocks;
import com.simibubi.create.AllItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class DDCLRecipesProvider extends RecipeProvider {
    public DDCLRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.GREEN_ANDESITE_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', AllItems.ANDESITE_ALLOY)
                .define('R', Items.REDSTONE)
                .define('L', Items.GLOW_BERRIES)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/andesite")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.YELLOW_ANDESITE_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', AllItems.ANDESITE_ALLOY)
                .define('R', Items.REDSTONE)
                .define('L', Items.TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/andesite")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.RED_ANDESITE_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', AllItems.ANDESITE_ALLOY)
                .define('R', Items.REDSTONE)
                .define('L', Items.REDSTONE_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/andesite")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.BLUE_ANDESITE_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', AllItems.ANDESITE_ALLOY)
                .define('R', Items.REDSTONE)
                .define('L', Items.SOUL_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/andesite")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.GREEN_IRON_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/iron")))
                .define('R', Items.REDSTONE)
                .define('L', Items.GLOW_BERRIES)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/iron")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.YELLOW_IRON_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/iron")))
                .define('R', Items.REDSTONE)
                .define('L', Items.TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/iron")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.RED_IRON_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/iron")))
                .define('R', Items.REDSTONE)
                .define('L', Items.REDSTONE_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/iron")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.BLUE_IRON_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/iron")))
                .define('R', Items.REDSTONE)
                .define('L', Items.SOUL_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/iron")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.GREEN_INDUSTRIAL_IRON_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/industrial_iron")))
                .define('R', Items.REDSTONE)
                .define('L', Items.GLOW_BERRIES)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/industrial_iron")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.YELLOW_INDUSTRIAL_IRON_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/industrial_iron")))
                .define('R', Items.REDSTONE)
                .define('L', Items.TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/industrial_iron")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.RED_INDUSTRIAL_IRON_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/industrial_iron")))
                .define('R', Items.REDSTONE)
                .define('L', Items.REDSTONE_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/industrial_iron")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.BLUE_INDUSTRIAL_IRON_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/industrial_iron")))
                .define('R', Items.REDSTONE)
                .define('L', Items.SOUL_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/industrial_iron")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.GREEN_BRASS_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/brass")))
                .define('R', Items.REDSTONE)
                .define('L', Items.GLOW_BERRIES)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/brass")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.YELLOW_BRASS_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/brass")))
                .define('R', Items.REDSTONE)
                .define('L', Items.TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/brass")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.RED_BRASS_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/brass")))
                .define('R', Items.REDSTONE)
                .define('L', Items.REDSTONE_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/brass")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.BLUE_BRASS_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/brass")))
                .define('R', Items.REDSTONE)
                .define('L', Items.SOUL_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/brass")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.GREEN_COPPER_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/copper")))
                .define('R', Items.REDSTONE)
                .define('L', Items.GLOW_BERRIES)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/copper")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.YELLOW_COPPER_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/copper")))
                .define('R', Items.REDSTONE)
                .define('L', Items.TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/copper")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.RED_COPPER_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/copper")))
                .define('R', Items.REDSTONE)
                .define('L', Items.REDSTONE_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/copper")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.BLUE_COPPER_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/copper")))
                .define('R', Items.REDSTONE)
                .define('L', Items.SOUL_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/copper")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.GREEN_ZINC_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/zinc")))
                .define('R', Items.REDSTONE)
                .define('L', Items.GLOW_BERRIES)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/zinc")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.YELLOW_ZINC_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/zinc")))
                .define('R', Items.REDSTONE)
                .define('L', Items.TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/zinc")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.RED_ZINC_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/zinc")))
                .define('R', Items.REDSTONE)
                .define('L', Items.REDSTONE_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/zinc")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, DDCLBlocks.BLUE_ZINC_DIMM_LAMP.get())
                .pattern(" N ")
                .pattern(" L ")
                .pattern("RPR")
                .define('N', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/zinc")))
                .define('R', Items.REDSTONE)
                .define('L', Items.SOUL_TORCH)
                .define('P', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/zinc")))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(output);
    }
}
