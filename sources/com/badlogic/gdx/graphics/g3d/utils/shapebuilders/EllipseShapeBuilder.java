package com.badlogic.gdx.graphics.g3d.utils.shapebuilders;

import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class EllipseShapeBuilder extends BaseShapeBuilder {
    public static void build(MeshPartBuilder meshPartBuilder, float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        build(meshPartBuilder, f, i, f2, f3, f4, f5, f6, f7, 0.0f, 360.0f);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, int i, Vector3 vector3, Vector3 vector4) {
        build(meshPartBuilder, f, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, int i, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6) {
        build(meshPartBuilder, f, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, vector5.x, vector5.y, vector5.z, vector6.x, vector6.y, vector6.z);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        build(meshPartBuilder, f, i, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, 0.0f, 360.0f);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f * 2.0f;
        build(meshPartBuilder, f10, f10, i, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, int i, Vector3 vector3, Vector3 vector4, float f2, float f3) {
        build(meshPartBuilder, f, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, f2, f3);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, int i, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, float f2, float f3) {
        build(meshPartBuilder, f, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, vector5.x, vector5.y, vector5.z, vector6.x, vector6.y, vector6.z, f2, f3);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f * 2.0f;
        build(meshPartBuilder, f16, f16, 0.0f, 0.0f, i, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8) {
        build(meshPartBuilder, f, f2, i, f3, f4, f5, f6, f7, f8, 0.0f, 360.0f);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, int i, Vector3 vector3, Vector3 vector4) {
        build(meshPartBuilder, f, f2, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, int i, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6) {
        build(meshPartBuilder, f, f2, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, vector5.x, vector5.y, vector5.z, vector6.x, vector6.y, vector6.z);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        build(meshPartBuilder, f, f2, i, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, 0.0f, 360.0f);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        build(meshPartBuilder, f, f2, 0.0f, 0.0f, i, f3, f4, f5, f6, f7, f8, f9, f10);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, int i, Vector3 vector3, Vector3 vector4, float f3, float f4) {
        build(meshPartBuilder, f, f2, 0.0f, 0.0f, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, f3, f4);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, int i, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, float f3, float f4) {
        build(meshPartBuilder, f, f2, 0.0f, 0.0f, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, vector5.x, vector5.y, vector5.z, vector6.x, vector6.y, vector6.z, f3, f4);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        build(meshPartBuilder, f, f2, 0.0f, 0.0f, i, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        Vector3 vector3 = BaseShapeBuilder.tmpV1;
        vector3.set(f8, f9, f10).crs(0.0f, 0.0f, 1.0f);
        Vector3 vector4 = BaseShapeBuilder.tmpV2;
        vector4.set(f8, f9, f10).crs(0.0f, 1.0f, 0.0f);
        if (vector4.len2() > vector3.len2()) {
            vector3.set(vector4);
        }
        vector4.set(vector3.nor()).crs(f8, f9, f10).nor();
        build(meshPartBuilder, f, f2, f3, f4, i, f5, f6, f7, f8, f9, f10, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, f11, f12);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8, float f9, float f10) {
        build(meshPartBuilder, f, f2, f3, f4, i, f5, f6, f7, f8, f9, f10, 0.0f, 360.0f);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, float f3, float f4, int i, Vector3 vector3, Vector3 vector4) {
        build(meshPartBuilder, f, f2, f3, f4, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, 0.0f, 360.0f);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        short s;
        Vector3 vector3;
        Vector3 vector4;
        short s2;
        short s3;
        if (f3 <= 0.0f || f4 <= 0.0f) {
            meshPartBuilder.ensureVertices(i + 2);
            meshPartBuilder.ensureTriangleIndices(i);
        } else if (f3 == f && f4 == f2) {
            int i2 = i + 1;
            meshPartBuilder.ensureVertices(i2);
            meshPartBuilder.ensureIndices(i2);
            if (meshPartBuilder.getPrimitiveType() != 1) {
                throw new GdxRuntimeException("Incorrect primitive type : expect GL_LINES because innerWidth == width && innerHeight == height");
            }
        } else {
            int i3 = i + 1;
            meshPartBuilder.ensureVertices(i3 * 2);
            meshPartBuilder.ensureRectangleIndices(i3);
        }
        float f19 = f17 * 0.017453292f;
        float f20 = ((f18 - f17) * 0.017453292f) / i;
        Vector3 vector3Scl = BaseShapeBuilder.tmpV1.set(f11, f12, f13).scl(f * 0.5f);
        Vector3 vector3Scl2 = BaseShapeBuilder.tmpV2.set(f14, f15, f16).scl(f2 * 0.5f);
        Vector3 vector3Scl3 = BaseShapeBuilder.tmpV3.set(f11, f12, f13).scl(f3 * 0.5f);
        Vector3 vector3Scl4 = BaseShapeBuilder.tmpV4.set(f14, f15, f16).scl(f4 * 0.5f);
        MeshPartBuilder.VertexInfo vertexInfo = BaseShapeBuilder.vertTmp3.set(null, null, null, null);
        vertexInfo.hasNormal = true;
        vertexInfo.hasPosition = true;
        vertexInfo.hasUV = true;
        vertexInfo.uv.set(0.5f, 0.5f);
        vertexInfo.position.set(f5, f6, f7);
        vertexInfo.normal.set(f8, f9, f10);
        MeshPartBuilder.VertexInfo vertexInfo2 = BaseShapeBuilder.vertTmp4.set(null, null, null, null);
        vertexInfo2.hasNormal = true;
        vertexInfo2.hasPosition = true;
        vertexInfo2.hasUV = true;
        vertexInfo2.uv.set(0.5f, 0.5f);
        vertexInfo2.position.set(f5, f6, f7);
        vertexInfo2.normal.set(f8, f9, f10);
        short sVertex = meshPartBuilder.vertex(vertexInfo2);
        float f21 = (f3 / f) * 0.5f;
        float f22 = (f4 / f2) * 0.5f;
        int i4 = 0;
        short s4 = 0;
        short s5 = 0;
        short s6 = 0;
        while (i4 <= i) {
            float f23 = (i4 * f20) + f19;
            float fCos = MathUtils.cos(f23);
            float fSin = MathUtils.sin(f23);
            short s7 = sVertex;
            float f24 = f22;
            short s8 = s5;
            float f25 = f21;
            Vector3 vector5 = vector3Scl4;
            vertexInfo2.position.set(f5, f6, f7).add((vector3Scl2.x * fSin) + (vector3Scl.x * fCos), (vector3Scl2.y * fSin) + (vector3Scl.y * fCos), (vector3Scl2.z * fSin) + (vector3Scl.z * fCos));
            vertexInfo2.uv.set((fCos * 0.5f) + 0.5f, (fSin * 0.5f) + 0.5f);
            short sVertex2 = meshPartBuilder.vertex(vertexInfo2);
            if (f3 <= 0.0f || f4 <= 0.0f) {
                s = s8;
                vector3 = vector5;
                vector4 = vector3Scl2;
                s2 = s6;
                s3 = s7;
                if (i4 != 0) {
                    meshPartBuilder.triangle(sVertex2, s4, s3);
                }
            } else {
                if (f3 == f && f4 == f2) {
                    if (i4 != 0) {
                        meshPartBuilder.line(sVertex2, s4);
                    }
                    s = s8;
                    vector3 = vector5;
                    vector4 = vector3Scl2;
                    s2 = s6;
                    s3 = s7;
                } else {
                    vector3 = vector5;
                    vector4 = vector3Scl2;
                    vertexInfo.position.set(f5, f6, f7).add((vector3.x * fSin) + (vector3Scl3.x * fCos), (vector3.y * fSin) + (vector3Scl3.y * fCos), (vector3.z * fSin) + (vector3Scl3.z * fCos));
                    vertexInfo.uv.set((f25 * fCos) + 0.5f, (f24 * fSin) + 0.5f);
                    short sVertex3 = meshPartBuilder.vertex(vertexInfo);
                    if (i4 != 0) {
                        meshPartBuilder.rect(sVertex3, sVertex2, s6, s8);
                    }
                    s = sVertex3;
                    s6 = sVertex2;
                    s3 = s7;
                }
                i4++;
                f22 = f24;
                s4 = sVertex2;
                vector3Scl4 = vector3;
                sVertex = s3;
                s5 = s;
                vector3Scl2 = vector4;
                f21 = f25;
            }
            s6 = s2;
            i4++;
            f22 = f24;
            s4 = sVertex2;
            vector3Scl4 = vector3;
            sVertex = s3;
            s5 = s;
            vector3Scl2 = vector4;
            f21 = f25;
        }
    }
}
