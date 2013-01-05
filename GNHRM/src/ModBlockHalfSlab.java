/*package GNHRM.src;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class ModBlockHalfSlab extends BlockHalfSlab
{
    public BlockHalfSlab(int texture, boolean par2, Material par3Material)
    {
        super(par1, par2, par3Material);
        this.blockIndexInTexture = texture;
    }

    public int damageDropped(int par1)
    {
        return par1 & 7;
    }

    @SideOnly(Side.CLIENT)
    private static boolean isBlockSingleSlab(int par0)
    {
        return par0 == Block.stoneSingleSlab.blockID || par0 == Block.woodSingleSlab.blockID;
    }

    @SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return isBlockSingleSlab(this.blockID) ? this.blockID : (this.blockID == Block.stoneDoubleSlab.blockID ? Block.stoneSingleSlab.blockID : (this.blockID == Block.woodDoubleSlab.blockID ? Block.woodSingleSlab.blockID : Block.stoneSingleSlab.blockID));
    }
}
*/
