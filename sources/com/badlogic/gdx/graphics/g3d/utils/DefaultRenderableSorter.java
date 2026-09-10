package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRenderableSorter implements RenderableSorter, Comparator<Renderable> {
    private Camera camera;
    private final Vector3 tmpV1 = new Vector3();
    private final Vector3 tmpV2 = new Vector3();

    private Vector3 getTranslation(Matrix4 matrix4, Vector3 vector3, Vector3 vector4) {
        if (vector3.isZero()) {
            matrix4.getTranslation(vector4);
        } else if (matrix4.hasRotationOrScaling()) {
            vector4.set(vector3).mul(matrix4);
        } else {
            matrix4.getTranslation(vector4).add(vector3);
        }
        return vector4;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.RenderableSorter
    public void sort(Camera camera, Array<Renderable> array) {
        this.camera = camera;
        array.sort(this);
    }

    @Override // java.util.Comparator
    public int compare(Renderable renderable, Renderable renderable2) {
        Material material = renderable.material;
        long j = BlendingAttribute.Type;
        int i = 0;
        boolean z = material.has(j) && ((BlendingAttribute) renderable.material.get(j)).blended;
        if (z != (renderable2.material.has(j) && ((BlendingAttribute) renderable2.material.get(j)).blended)) {
            return z ? 1 : -1;
        }
        getTranslation(renderable.worldTransform, renderable.meshPart.center, this.tmpV1);
        getTranslation(renderable2.worldTransform, renderable2.meshPart.center, this.tmpV2);
        float fDst2 = ((int) (this.camera.position.dst2(this.tmpV1) * 1000.0f)) - ((int) (this.camera.position.dst2(this.tmpV2) * 1000.0f));
        if (fDst2 < 0.0f) {
            i = -1;
        } else if (fDst2 > 0.0f) {
            i = 1;
        }
        return z ? -i : i;
    }
}
