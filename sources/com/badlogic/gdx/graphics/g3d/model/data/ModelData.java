package com.badlogic.gdx.graphics.g3d.model.data;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class ModelData {
    public String id;
    public final short[] version = new short[2];
    public final Array<ModelMesh> meshes = new Array<>();
    public final Array<ModelMaterial> materials = new Array<>();
    public final Array<ModelNode> nodes = new Array<>();
    public final Array<ModelAnimation> animations = new Array<>();

    public void addMesh(ModelMesh modelMesh) {
        Array.ArrayIterator<ModelMesh> it = this.meshes.iterator();
        while (it.hasNext()) {
            ModelMesh next = it.next();
            if (next.id.equals(modelMesh.id)) {
                throw new GdxRuntimeException(DM.m(new StringBuilder("Mesh with id '"), next.id, "' already in model"));
            }
        }
        this.meshes.add(modelMesh);
    }
}
