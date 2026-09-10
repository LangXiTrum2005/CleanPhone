package com.badlogic.gdx.graphics.g3d.utils.shapebuilders;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder;
import com.badlogic.gdx.math.Frustum;
import com.badlogic.gdx.math.Vector3;

/* JADX INFO: loaded from: classes.dex */
public class FrustumShapeBuilder extends BaseShapeBuilder {
    public static void build(MeshPartBuilder meshPartBuilder, Camera camera) {
        build(meshPartBuilder, camera, BaseShapeBuilder.tmpColor0.set(1.0f, 0.66f, 0.0f, 1.0f), BaseShapeBuilder.tmpColor1.set(1.0f, 0.0f, 0.0f, 1.0f), BaseShapeBuilder.tmpColor2.set(0.0f, 0.66f, 1.0f, 1.0f), BaseShapeBuilder.tmpColor3.set(1.0f, 1.0f, 1.0f, 1.0f), BaseShapeBuilder.tmpColor4.set(0.2f, 0.2f, 0.2f, 1.0f));
    }

    private static Vector3 centerPoint(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        Vector3 vector6 = BaseShapeBuilder.tmpV0;
        vector6.set(vector4).sub(vector3).scl(0.5f);
        Vector3 vector7 = BaseShapeBuilder.tmpV1;
        vector7.set(vector3).add(vector6);
        vector6.set(vector5).sub(vector4).scl(0.5f);
        return vector7.add(vector6);
    }

    private static Vector3 middlePoint(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = BaseShapeBuilder.tmpV0;
        vector5.set(vector4).sub(vector3).scl(0.5f);
        return BaseShapeBuilder.tmpV1.set(vector3).add(vector5);
    }

    public static void build(MeshPartBuilder meshPartBuilder, Camera camera, Color color, Color color2, Color color3, Color color4, Color color5) {
        Frustum frustum = camera.frustum;
        Vector3[] vector3Arr = frustum.planePoints;
        build(meshPartBuilder, frustum, color, color5);
        meshPartBuilder.line(vector3Arr[0], color2, camera.position, color2);
        meshPartBuilder.line(vector3Arr[1], color2, camera.position, color2);
        meshPartBuilder.line(vector3Arr[2], color2, camera.position, color2);
        meshPartBuilder.line(vector3Arr[3], color2, camera.position, color2);
        meshPartBuilder.line(camera.position, color4, centerPoint(vector3Arr[4], vector3Arr[5], vector3Arr[6]), color4);
        Vector3 vector3 = BaseShapeBuilder.tmpV0;
        float fLen = vector3.set(vector3Arr[1]).sub(vector3Arr[0]).scl(0.5f).len();
        Vector3 vector3CenterPoint = centerPoint(vector3Arr[0], vector3Arr[1], vector3Arr[2]);
        vector3.set(camera.up).scl(fLen * 2.0f);
        vector3CenterPoint.add(vector3);
        meshPartBuilder.line(vector3CenterPoint, color3, vector3Arr[2], color3);
        meshPartBuilder.line(vector3Arr[2], color3, vector3Arr[3], color3);
        meshPartBuilder.line(vector3Arr[3], color3, vector3CenterPoint, color3);
    }

    public static void build(MeshPartBuilder meshPartBuilder, Frustum frustum, Color color, Color color2) {
        Vector3[] vector3Arr = frustum.planePoints;
        meshPartBuilder.line(vector3Arr[0], color, vector3Arr[1], color);
        meshPartBuilder.line(vector3Arr[1], color, vector3Arr[2], color);
        meshPartBuilder.line(vector3Arr[2], color, vector3Arr[3], color);
        meshPartBuilder.line(vector3Arr[3], color, vector3Arr[0], color);
        meshPartBuilder.line(vector3Arr[4], color, vector3Arr[5], color);
        meshPartBuilder.line(vector3Arr[5], color, vector3Arr[6], color);
        meshPartBuilder.line(vector3Arr[6], color, vector3Arr[7], color);
        meshPartBuilder.line(vector3Arr[7], color, vector3Arr[4], color);
        meshPartBuilder.line(vector3Arr[0], color, vector3Arr[4], color);
        meshPartBuilder.line(vector3Arr[1], color, vector3Arr[5], color);
        meshPartBuilder.line(vector3Arr[2], color, vector3Arr[6], color);
        meshPartBuilder.line(vector3Arr[3], color, vector3Arr[7], color);
        meshPartBuilder.line(middlePoint(vector3Arr[1], vector3Arr[0]), color2, middlePoint(vector3Arr[3], vector3Arr[2]), color2);
        meshPartBuilder.line(middlePoint(vector3Arr[2], vector3Arr[1]), color2, middlePoint(vector3Arr[3], vector3Arr[0]), color2);
        meshPartBuilder.line(middlePoint(vector3Arr[5], vector3Arr[4]), color2, middlePoint(vector3Arr[7], vector3Arr[6]), color2);
        meshPartBuilder.line(middlePoint(vector3Arr[6], vector3Arr[5]), color2, middlePoint(vector3Arr[7], vector3Arr[4]), color2);
    }
}
