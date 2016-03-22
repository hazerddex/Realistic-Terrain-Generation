package rtg.world.gen.terrain;

import rtg.util.noise.CellNoise;
import rtg.util.noise.OpenSimplexNoise;

public class TerrainBeach extends TerrainBase {
    public TerrainBeach() {

    }

    @Override
    public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {
        return terrainBeach(x, y, simplex, river, 180f, 35f, 60f);
    }
}
