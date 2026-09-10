package com.badlogic.gdx.graphics.g3d.utils.shapebuilders;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.RenderableProvider;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FlushablePool;

/* JADX INFO: loaded from: classes.dex */
public class RenderableShapeBuilder extends BaseShapeBuilder {
    private static final int FLOAT_BYTES = 4;
    private static short[] indices;
    private static float[] vertices;
    private static final RenderablePool renderablesPool = new RenderablePool();
    private static final Array<Renderable> renderables = new Array<>();

    public static class RenderablePool extends FlushablePool<Renderable> {
        @Override // com.badlogic.gdx.utils.Pool
        public Renderable newObject() {
            return new Renderable();
        }

        @Override // com.badlogic.gdx.utils.FlushablePool, com.badlogic.gdx.utils.Pool
        public Renderable obtain() {
            Renderable renderable = (Renderable) super.obtain();
            renderable.environment = null;
            renderable.material = null;
            renderable.meshPart.set("", null, 0, 0, 0);
            renderable.shader = null;
            renderable.userData = null;
            return renderable;
        }
    }

    public static void buildNormals(MeshPartBuilder meshPartBuilder, RenderableProvider renderableProvider, float f) {
        buildNormals(meshPartBuilder, renderableProvider, f, BaseShapeBuilder.tmpColor0.set(0.0f, 0.0f, 1.0f, 1.0f), BaseShapeBuilder.tmpColor1.set(1.0f, 0.0f, 0.0f, 1.0f), BaseShapeBuilder.tmpColor2.set(0.0f, 1.0f, 0.0f, 1.0f));
    }

    private static void ensureIndicesCapacity(int i) {
        short[] sArr = indices;
        if (sArr == null || sArr.length < i) {
            indices = new short[i];
        }
    }

    private static void ensureVerticesCapacity(int i) {
        float[] fArr = vertices;
        if (fArr == null || fArr.length < i) {
            vertices = new float[i];
        }
    }

    private static short maxVerticeInIndices() {
        short s = Short.MIN_VALUE;
        int i = 0;
        while (true) {
            short[] sArr = indices;
            if (i >= sArr.length) {
                return s;
            }
            short s2 = sArr[i];
            if (s2 > s) {
                s = s2;
            }
            i++;
        }
    }

    private static short minVerticeInIndices() {
        short s = Short.MAX_VALUE;
        int i = 0;
        while (true) {
            short[] sArr = indices;
            if (i >= sArr.length) {
                return s;
            }
            short s2 = sArr[i];
            if (s2 < s) {
                s = s2;
            }
            i++;
        }
    }

    public static void buildNormals(MeshPartBuilder meshPartBuilder, RenderableProvider renderableProvider, float f, Color color, Color color2, Color color3) {
        Array<Renderable> array = renderables;
        renderableProvider.getRenderables(array, renderablesPool);
        Array.ArrayIterator<Renderable> it = array.iterator();
        while (it.hasNext()) {
            buildNormals(meshPartBuilder, it.next(), f, color, color2, color3);
        }
        renderablesPool.flush();
        renderables.clear();
    }

    public static void buildNormals(MeshPartBuilder meshPartBuilder, Renderable renderable, float f, Color color, Color color2, Color color3) {
        int iMaxVerticeInIndices;
        int iMinVerticeInIndices;
        Mesh mesh = renderable.meshPart.mesh;
        int i = mesh.getVertexAttribute(1) != null ? mesh.getVertexAttribute(1).offset / 4 : -1;
        int i2 = mesh.getVertexAttribute(8) != null ? mesh.getVertexAttribute(8).offset / 4 : -1;
        int i3 = mesh.getVertexAttribute(128) != null ? mesh.getVertexAttribute(128).offset / 4 : -1;
        int i4 = mesh.getVertexAttribute(256) != null ? mesh.getVertexAttribute(256).offset / 4 : -1;
        int vertexSize = mesh.getVertexSize() / 4;
        if (mesh.getNumIndices() > 0) {
            ensureIndicesCapacity(mesh.getNumIndices());
            MeshPart meshPart = renderable.meshPart;
            mesh.getIndices(meshPart.offset, meshPart.size, indices, 0);
            iMinVerticeInIndices = minVerticeInIndices();
            iMaxVerticeInIndices = maxVerticeInIndices() - iMinVerticeInIndices;
        } else {
            MeshPart meshPart2 = renderable.meshPart;
            int i5 = meshPart2.offset;
            iMaxVerticeInIndices = meshPart2.size;
            iMinVerticeInIndices = i5;
        }
        int i6 = iMaxVerticeInIndices * vertexSize;
        ensureVerticesCapacity(i6);
        mesh.getVertices(iMinVerticeInIndices * vertexSize, i6, vertices, 0);
        while (iMinVerticeInIndices < iMaxVerticeInIndices) {
            int i7 = iMinVerticeInIndices * vertexSize;
            Vector3 vector3 = BaseShapeBuilder.tmpV0;
            float[] fArr = vertices;
            int i8 = i7 + i;
            vector3.set(fArr[i8], fArr[i8 + 1], fArr[i8 + 2]);
            if (i2 != -1) {
                Vector3 vector4 = BaseShapeBuilder.tmpV1;
                float[] fArr2 = vertices;
                int i9 = i7 + i2;
                vector4.set(fArr2[i9], fArr2[i9 + 1], fArr2[i9 + 2]);
                BaseShapeBuilder.tmpV2.set(vector3).add(vector4.scl(f));
            }
            int i10 = -1;
            if (i3 != -1) {
                Vector3 vector5 = BaseShapeBuilder.tmpV3;
                float[] fArr3 = vertices;
                int i11 = i7 + i3;
                vector5.set(fArr3[i11], fArr3[i11 + 1], fArr3[i11 + 2]);
                BaseShapeBuilder.tmpV4.set(vector3).add(vector5.scl(f));
                i10 = -1;
            }
            if (i4 != i10) {
                Vector3 vector6 = BaseShapeBuilder.tmpV5;
                float[] fArr4 = vertices;
                int i12 = i7 + i4;
                vector6.set(fArr4[i12], fArr4[i12 + 1], fArr4[i12 + 2]);
                BaseShapeBuilder.tmpV6.set(vector3).add(vector6.scl(f));
            }
            vector3.mul(renderable.worldTransform);
            Vector3 vector7 = BaseShapeBuilder.tmpV2;
            vector7.mul(renderable.worldTransform);
            Vector3 vector8 = BaseShapeBuilder.tmpV4;
            vector8.mul(renderable.worldTransform);
            Vector3 vector9 = BaseShapeBuilder.tmpV6;
            vector9.mul(renderable.worldTransform);
            if (i2 != -1) {
                meshPartBuilder.setColor(color);
                meshPartBuilder.line(vector3, vector7);
            }
            if (i3 != -1) {
                meshPartBuilder.setColor(color2);
                meshPartBuilder.line(vector3, vector8);
            }
            if (i4 != -1) {
                meshPartBuilder.setColor(color3);
                meshPartBuilder.line(vector3, vector9);
            }
            iMinVerticeInIndices++;
            i = i;
        }
    }
}
