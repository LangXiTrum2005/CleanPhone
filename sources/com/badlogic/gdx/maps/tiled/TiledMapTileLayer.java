package com.badlogic.gdx.maps.tiled;

import com.badlogic.gdx.maps.MapLayer;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class TiledMapTileLayer extends MapLayer {
    private Cell[][] cells;
    private int height;
    private int tileHeight;
    private int tileWidth;
    private int width;

    public static class Cell {
        public static final int ROTATE_0 = 0;
        public static final int ROTATE_180 = 2;
        public static final int ROTATE_270 = 3;
        public static final int ROTATE_90 = 1;
        private boolean flipHorizontally;
        private boolean flipVertically;
        private int rotation;
        private TiledMapTile tile;

        public boolean getFlipHorizontally() {
            return this.flipHorizontally;
        }

        public boolean getFlipVertically() {
            return this.flipVertically;
        }

        public int getRotation() {
            return this.rotation;
        }

        public TiledMapTile getTile() {
            return this.tile;
        }

        public Cell setFlipHorizontally(boolean z) {
            this.flipHorizontally = z;
            return this;
        }

        public Cell setFlipVertically(boolean z) {
            this.flipVertically = z;
            return this;
        }

        public Cell setRotation(int i) {
            this.rotation = i;
            return this;
        }

        public Cell setTile(TiledMapTile tiledMapTile) {
            this.tile = tiledMapTile;
            return this;
        }
    }

    public TiledMapTileLayer(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.tileWidth = i3;
        this.tileHeight = i4;
        this.cells = (Cell[][]) Array.newInstance((Class<?>) Cell.class, i, i2);
    }

    public Cell getCell(int i, int i2) {
        if (i < 0 || i >= this.width || i2 < 0 || i2 >= this.height) {
            return null;
        }
        return this.cells[i][i2];
    }

    public int getHeight() {
        return this.height;
    }

    public int getTileHeight() {
        return this.tileHeight;
    }

    public int getTileWidth() {
        return this.tileWidth;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCell(int i, int i2, Cell cell) {
        if (i < 0 || i >= this.width || i2 < 0 || i2 >= this.height) {
            return;
        }
        this.cells[i][i2] = cell;
    }
}
