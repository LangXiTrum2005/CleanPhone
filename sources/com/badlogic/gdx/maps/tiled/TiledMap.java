package com.badlogic.gdx.maps.tiled;

import com.badlogic.gdx.maps.Map;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;

/* JADX INFO: loaded from: classes.dex */
public class TiledMap extends Map {
    private Array<? extends Disposable> ownedResources;
    private TiledMapTileSets tilesets = new TiledMapTileSets();

    @Override // com.badlogic.gdx.maps.Map, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        Array<? extends Disposable> array = this.ownedResources;
        if (array != null) {
            Array.ArrayIterator<? extends Disposable> it = array.iterator();
            while (it.hasNext()) {
                it.next().dispose();
            }
        }
    }

    public TiledMapTileSets getTileSets() {
        return this.tilesets;
    }

    public void setOwnedResources(Array<? extends Disposable> array) {
        this.ownedResources = array;
    }
}
