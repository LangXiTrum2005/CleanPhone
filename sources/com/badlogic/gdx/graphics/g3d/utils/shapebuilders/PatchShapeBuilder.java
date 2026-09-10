package com.badlogic.gdx.graphics.g3d.utils.shapebuilders;

import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes.dex */
public class PatchShapeBuilder extends BaseShapeBuilder {
    public static void build(MeshPartBuilder meshPartBuilder, MeshPartBuilder.VertexInfo vertexInfo, MeshPartBuilder.VertexInfo vertexInfo2, MeshPartBuilder.VertexInfo vertexInfo3, MeshPartBuilder.VertexInfo vertexInfo4, int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new GdxRuntimeException(AbstractC3888ke0.h("divisionsU and divisionV must be > 0, u,v: ", i, ", ", i2));
        }
        meshPartBuilder.ensureVertices((i + 1) * (i2 + 1));
        meshPartBuilder.ensureRectangleIndices(i2 * i);
        for (int i3 = 0; i3 <= i; i3++) {
            float f = i3 / i;
            BaseShapeBuilder.vertTmp5.set(vertexInfo).lerp(vertexInfo2, f);
            BaseShapeBuilder.vertTmp6.set(vertexInfo4).lerp(vertexInfo3, f);
            for (int i4 = 0; i4 <= i2; i4++) {
                short sVertex = meshPartBuilder.vertex(BaseShapeBuilder.vertTmp7.set(BaseShapeBuilder.vertTmp5).lerp(BaseShapeBuilder.vertTmp6, i4 / i2));
                if (i3 > 0 && i4 > 0) {
                    int i5 = sVertex - i2;
                    meshPartBuilder.rect((short) (i5 - 2), (short) (sVertex - 1), sVertex, (short) (i5 - 1));
                }
            }
        }
    }

    public static void build(MeshPartBuilder meshPartBuilder, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, Vector3 vector7, int i, int i2) {
        build(meshPartBuilder, BaseShapeBuilder.vertTmp1.set(vector3, vector7, null, null).setUV(0.0f, 1.0f), BaseShapeBuilder.vertTmp2.set(vector4, vector7, null, null).setUV(1.0f, 1.0f), BaseShapeBuilder.vertTmp3.set(vector5, vector7, null, null).setUV(1.0f, 0.0f), BaseShapeBuilder.vertTmp4.set(vector6, vector7, null, null).setUV(0.0f, 0.0f), i, i2);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, int i, int i2) {
        build(meshPartBuilder, BaseShapeBuilder.vertTmp1.set(null).setPos(f, f2, f3).setNor(f13, f14, f15).setUV(0.0f, 1.0f), BaseShapeBuilder.vertTmp2.set(null).setPos(f4, f5, f6).setNor(f13, f14, f15).setUV(1.0f, 1.0f), BaseShapeBuilder.vertTmp3.set(null).setPos(f7, f8, f9).setNor(f13, f14, f15).setUV(1.0f, 0.0f), BaseShapeBuilder.vertTmp4.set(null).setPos(f10, f11, f12).setNor(f13, f14, f15).setUV(0.0f, 0.0f), i, i2);
    }
}
