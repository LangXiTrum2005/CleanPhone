package com.badlogic.gdx.graphics.g3d.utils.shapebuilders;

import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;

/* JADX INFO: loaded from: classes.dex */
public class BoxShapeBuilder extends BaseShapeBuilder {
    public static void build(MeshPartBuilder meshPartBuilder, BoundingBox boundingBox) {
        meshPartBuilder.box(boundingBox.getCorner000(BaseShapeBuilder.obtainV3()), boundingBox.getCorner010(BaseShapeBuilder.obtainV3()), boundingBox.getCorner100(BaseShapeBuilder.obtainV3()), boundingBox.getCorner110(BaseShapeBuilder.obtainV3()), boundingBox.getCorner001(BaseShapeBuilder.obtainV3()), boundingBox.getCorner011(BaseShapeBuilder.obtainV3()), boundingBox.getCorner101(BaseShapeBuilder.obtainV3()), boundingBox.getCorner111(BaseShapeBuilder.obtainV3()));
        BaseShapeBuilder.freeAll();
    }

    public static void build(MeshPartBuilder meshPartBuilder, MeshPartBuilder.VertexInfo vertexInfo, MeshPartBuilder.VertexInfo vertexInfo2, MeshPartBuilder.VertexInfo vertexInfo3, MeshPartBuilder.VertexInfo vertexInfo4, MeshPartBuilder.VertexInfo vertexInfo5, MeshPartBuilder.VertexInfo vertexInfo6, MeshPartBuilder.VertexInfo vertexInfo7, MeshPartBuilder.VertexInfo vertexInfo8) {
        meshPartBuilder.ensureVertices(8);
        short sVertex = meshPartBuilder.vertex(vertexInfo);
        short sVertex2 = meshPartBuilder.vertex(vertexInfo3);
        short sVertex3 = meshPartBuilder.vertex(vertexInfo4);
        short sVertex4 = meshPartBuilder.vertex(vertexInfo2);
        short sVertex5 = meshPartBuilder.vertex(vertexInfo5);
        short sVertex6 = meshPartBuilder.vertex(vertexInfo7);
        short sVertex7 = meshPartBuilder.vertex(vertexInfo8);
        short sVertex8 = meshPartBuilder.vertex(vertexInfo6);
        int primitiveType = meshPartBuilder.getPrimitiveType();
        if (primitiveType == 1) {
            meshPartBuilder.ensureIndices(24);
            meshPartBuilder.rect(sVertex, sVertex2, sVertex3, sVertex4);
            meshPartBuilder.rect(sVertex6, sVertex5, sVertex8, sVertex7);
            meshPartBuilder.index(sVertex, sVertex5, sVertex4, sVertex8, sVertex3, sVertex7, sVertex2, sVertex6);
            return;
        }
        if (primitiveType == 0) {
            meshPartBuilder.ensureRectangleIndices(2);
            meshPartBuilder.rect(sVertex, sVertex2, sVertex3, sVertex4);
            meshPartBuilder.rect(sVertex6, sVertex5, sVertex8, sVertex7);
            return;
        }
        meshPartBuilder.ensureRectangleIndices(6);
        meshPartBuilder.rect(sVertex, sVertex2, sVertex3, sVertex4);
        meshPartBuilder.rect(sVertex6, sVertex5, sVertex8, sVertex7);
        meshPartBuilder.rect(sVertex, sVertex4, sVertex8, sVertex5);
        meshPartBuilder.rect(sVertex6, sVertex7, sVertex3, sVertex2);
        meshPartBuilder.rect(sVertex6, sVertex2, sVertex, sVertex5);
        meshPartBuilder.rect(sVertex3, sVertex7, sVertex8, sVertex4);
    }

    public static void build(MeshPartBuilder meshPartBuilder, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, Vector3 vector7, Vector3 vector8, Vector3 vector9, Vector3 vector10) {
        if ((meshPartBuilder.getAttributes().getMask() & 408) == 0) {
            build(meshPartBuilder, BaseShapeBuilder.vertTmp1.set(vector3, null, null, null), BaseShapeBuilder.vertTmp2.set(vector4, null, null, null), BaseShapeBuilder.vertTmp3.set(vector5, null, null, null), BaseShapeBuilder.vertTmp4.set(vector6, null, null, null), BaseShapeBuilder.vertTmp5.set(vector7, null, null, null), BaseShapeBuilder.vertTmp6.set(vector8, null, null, null), BaseShapeBuilder.vertTmp7.set(vector9, null, null, null), BaseShapeBuilder.vertTmp8.set(vector10, null, null, null));
            return;
        }
        meshPartBuilder.ensureVertices(24);
        meshPartBuilder.ensureRectangleIndices(6);
        Vector3 vector11 = BaseShapeBuilder.tmpV1;
        Vector3 vector3Lerp = vector11.set(vector3).lerp(vector6, 0.5f);
        Vector3 vector12 = BaseShapeBuilder.tmpV2;
        Vector3 vector3Nor = vector3Lerp.sub(vector12.set(vector7).lerp(vector10, 0.5f)).nor();
        meshPartBuilder.rect(vector3, vector4, vector6, vector5, vector3Nor);
        meshPartBuilder.rect(vector8, vector7, vector9, vector10, vector3Nor.scl(-1.0f));
        Vector3 vector3Nor2 = vector11.set(vector3).lerp(vector9, 0.5f).sub(vector12.set(vector4).lerp(vector10, 0.5f)).nor();
        meshPartBuilder.rect(vector7, vector3, vector5, vector9, vector3Nor2);
        meshPartBuilder.rect(vector4, vector8, vector10, vector6, vector3Nor2.scl(-1.0f));
        Vector3 vector3Nor3 = vector11.set(vector3).lerp(vector8, 0.5f).sub(vector12.set(vector5).lerp(vector10, 0.5f)).nor();
        meshPartBuilder.rect(vector7, vector8, vector4, vector3, vector3Nor3);
        meshPartBuilder.rect(vector5, vector6, vector10, vector9, vector3Nor3.scl(-1.0f));
    }

    public static void build(MeshPartBuilder meshPartBuilder, Matrix4 matrix4) {
        build(meshPartBuilder, BaseShapeBuilder.obtainV3().set(-0.5f, -0.5f, -0.5f).mul(matrix4), BaseShapeBuilder.obtainV3().set(-0.5f, 0.5f, -0.5f).mul(matrix4), BaseShapeBuilder.obtainV3().set(0.5f, -0.5f, -0.5f).mul(matrix4), BaseShapeBuilder.obtainV3().set(0.5f, 0.5f, -0.5f).mul(matrix4), BaseShapeBuilder.obtainV3().set(-0.5f, -0.5f, 0.5f).mul(matrix4), BaseShapeBuilder.obtainV3().set(-0.5f, 0.5f, 0.5f).mul(matrix4), BaseShapeBuilder.obtainV3().set(0.5f, -0.5f, 0.5f).mul(matrix4), BaseShapeBuilder.obtainV3().set(0.5f, 0.5f, 0.5f).mul(matrix4));
        BaseShapeBuilder.freeAll();
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, float f3) {
        build(meshPartBuilder, 0.0f, 0.0f, 0.0f, f, f2, f3);
    }

    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4 * 0.5f;
        float f8 = f5 * 0.5f;
        float f9 = 0.5f * f6;
        float f10 = f - f7;
        float f11 = f2 - f8;
        float f12 = f3 - f9;
        float f13 = f + f7;
        float f14 = f2 + f8;
        float f15 = f3 + f9;
        build(meshPartBuilder, BaseShapeBuilder.obtainV3().set(f10, f11, f12), BaseShapeBuilder.obtainV3().set(f10, f14, f12), BaseShapeBuilder.obtainV3().set(f13, f11, f12), BaseShapeBuilder.obtainV3().set(f13, f14, f12), BaseShapeBuilder.obtainV3().set(f10, f11, f15), BaseShapeBuilder.obtainV3().set(f10, f14, f15), BaseShapeBuilder.obtainV3().set(f13, f11, f15), BaseShapeBuilder.obtainV3().set(f13, f14, f15));
        BaseShapeBuilder.freeAll();
    }
}
