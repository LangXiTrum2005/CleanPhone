package com.badlogic.gdx.graphics.g3d.utils.shapebuilders;

import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

/* JADX INFO: loaded from: classes.dex */
public class ArrowShapeBuilder extends BaseShapeBuilder {
    public static void build(MeshPartBuilder meshPartBuilder, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        Vector3 vector3 = BaseShapeBuilder.obtainV3().set(f, f2, f3);
        Vector3 vector4 = BaseShapeBuilder.obtainV3().set(f4, f5, f6);
        float fDst = vector3.dst(vector4);
        float f9 = fDst * f7;
        float fSqrt = ((float) (Math.sqrt(0.3333333432674408d) * ((double) f9))) * 2.0f;
        float f10 = fDst - f9;
        float f11 = fSqrt * f8;
        Vector3 vector3Nor = BaseShapeBuilder.obtainV3().set(vector4).sub(vector3).nor();
        Vector3 vector3Crs = BaseShapeBuilder.obtainV3().set(vector3Nor).crs(Vector3.Z);
        if (vector3Crs.isZero()) {
            vector3Crs.set(Vector3.X);
        }
        vector3Crs.crs(vector3Nor).nor();
        Vector3 vector3Nor2 = BaseShapeBuilder.obtainV3().set(vector3Nor).crs(vector3Crs).nor();
        Vector3 vector3Nor3 = BaseShapeBuilder.obtainV3().set(vector4).sub(vector3).nor();
        Matrix4 vertexTransform = meshPartBuilder.getVertexTransform(BaseShapeBuilder.obtainM4());
        Matrix4 matrix4ObtainM4 = BaseShapeBuilder.obtainM4();
        float[] fArr = matrix4ObtainM4.val;
        fArr[0] = vector3Nor2.x;
        fArr[4] = vector3Nor.x;
        fArr[8] = vector3Crs.x;
        fArr[1] = vector3Nor2.y;
        fArr[5] = vector3Nor.y;
        fArr[9] = vector3Crs.y;
        fArr[2] = vector3Nor2.z;
        fArr[6] = vector3Nor.z;
        fArr[10] = vector3Crs.z;
        Matrix4 matrix4ObtainM5 = BaseShapeBuilder.obtainM4();
        matrix4ObtainM4.setTranslation(BaseShapeBuilder.obtainV3().set(vector3Nor3).scl(f10 / 2.0f).add(f, f2, f3));
        meshPartBuilder.setVertexTransform(matrix4ObtainM5.set(matrix4ObtainM4).mul(vertexTransform));
        CylinderShapeBuilder.build(meshPartBuilder, f11, f10, f11, i);
        matrix4ObtainM4.setTranslation(BaseShapeBuilder.obtainV3().set(vector3Nor3).scl(f10).add(f, f2, f3));
        meshPartBuilder.setVertexTransform(matrix4ObtainM5.set(matrix4ObtainM4).mul(vertexTransform));
        ConeShapeBuilder.build(meshPartBuilder, fSqrt, f9, fSqrt, i);
        meshPartBuilder.setVertexTransform(vertexTransform);
        BaseShapeBuilder.freeAll();
    }
}
