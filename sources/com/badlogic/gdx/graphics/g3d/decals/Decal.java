package com.badlogic.gdx.graphics.g3d.decals;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.NumberUtils;

/* JADX INFO: loaded from: classes.dex */
public class Decal {
    public static final int C1 = 3;
    public static final int C2 = 9;
    public static final int C3 = 15;
    public static final int C4 = 21;
    public static final int SIZE = 24;
    public static final int U1 = 4;
    public static final int U2 = 10;
    public static final int U3 = 16;
    public static final int U4 = 22;
    public static final int V1 = 5;
    public static final int V2 = 11;
    public static final int V3 = 17;
    public static final int V4 = 23;
    private static final int VERTEX_SIZE = 6;
    public static final int X1 = 0;
    public static final int X2 = 6;
    public static final int X3 = 12;
    public static final int X4 = 18;
    public static final int Y1 = 1;
    public static final int Y2 = 7;
    public static final int Y3 = 13;
    public static final int Y4 = 19;
    public static final int Z1 = 2;
    public static final int Z2 = 8;
    public static final int Z3 = 14;
    public static final int Z4 = 20;
    protected Color color;
    protected Vector2 dimensions;
    protected DecalMaterial material;
    protected Vector3 position;
    protected Quaternion rotation;
    protected Vector2 scale;
    public Vector2 transformationOffset;
    protected boolean updated;
    public int value;
    protected float[] vertices;
    private static Vector3 tmp = new Vector3();
    private static Vector3 tmp2 = new Vector3();
    static final Vector3 dir = new Vector3();
    protected static Quaternion rotator = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);

    public Decal() {
        this.vertices = new float[24];
        this.position = new Vector3();
        this.rotation = new Quaternion();
        this.scale = new Vector2(1.0f, 1.0f);
        this.color = new Color();
        this.transformationOffset = null;
        this.dimensions = new Vector2();
        this.updated = false;
        this.material = new DecalMaterial();
    }

    public static Decal newDecal(TextureRegion textureRegion) {
        return newDecal(textureRegion.getRegionWidth(), textureRegion.getRegionHeight(), textureRegion, -1, -1);
    }

    public Color getColor() {
        return this.color;
    }

    public float getHeight() {
        return this.dimensions.y;
    }

    public DecalMaterial getMaterial() {
        return this.material;
    }

    public Vector3 getPosition() {
        return this.position;
    }

    public Quaternion getRotation() {
        return this.rotation;
    }

    public float getScaleX() {
        return this.scale.x;
    }

    public float getScaleY() {
        return this.scale.y;
    }

    public TextureRegion getTextureRegion() {
        return this.material.textureRegion;
    }

    public float[] getVertices() {
        update();
        return this.vertices;
    }

    public float getWidth() {
        return this.dimensions.x;
    }

    public float getX() {
        return this.position.x;
    }

    public float getY() {
        return this.position.y;
    }

    public float getZ() {
        return this.position.z;
    }

    public void lookAt(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = dir;
        vector5.set(vector3).sub(this.position).nor();
        setRotation(vector5, vector4);
    }

    public void resetVertices() {
        Vector2 vector2 = this.dimensions;
        float f = vector2.x;
        float f2 = (-f) / 2.0f;
        float f3 = f + f2;
        float f4 = vector2.y;
        float f5 = f4 / 2.0f;
        float f6 = f5 - f4;
        float[] fArr = this.vertices;
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[6] = f3;
        fArr[7] = f5;
        fArr[8] = 0.0f;
        fArr[12] = f2;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[18] = f3;
        fArr[19] = f6;
        fArr[20] = 0.0f;
        this.updated = false;
    }

    public void rotateX(float f) {
        rotator.set(Vector3.X, f);
        this.rotation.mul(rotator);
        this.updated = false;
    }

    public void rotateY(float f) {
        rotator.set(Vector3.Y, f);
        this.rotation.mul(rotator);
        this.updated = false;
    }

    public void rotateZ(float f) {
        rotator.set(Vector3.Z, f);
        this.rotation.mul(rotator);
        this.updated = false;
    }

    public void setBlending(int i, int i2) {
        DecalMaterial decalMaterial = this.material;
        decalMaterial.srcBlendFactor = i;
        decalMaterial.dstBlendFactor = i2;
    }

    public void setColor(float f, float f2, float f3, float f4) {
        this.color.set(f, f2, f3, f4);
        int i = ((int) (f2 * 255.0f)) << 8;
        int i2 = (int) (f * 255.0f);
        float fIntToFloatColor = NumberUtils.intToFloatColor(i2 | i | (((int) (f3 * 255.0f)) << 16) | (((int) (f4 * 255.0f)) << 24));
        float[] fArr = this.vertices;
        fArr[3] = fIntToFloatColor;
        fArr[9] = fIntToFloatColor;
        fArr[15] = fIntToFloatColor;
        fArr[21] = fIntToFloatColor;
    }

    public void setDimensions(float f, float f2) {
        this.dimensions.set(f, f2);
        this.updated = false;
    }

    public void setHeight(float f) {
        this.dimensions.y = f;
        this.updated = false;
    }

    public void setMaterial(DecalMaterial decalMaterial) {
        this.material = decalMaterial;
    }

    public void setPackedColor(float f) {
        Color.abgr8888ToColor(this.color, f);
        float[] fArr = this.vertices;
        fArr[3] = f;
        fArr[9] = f;
        fArr[15] = f;
        fArr[21] = f;
    }

    public void setPosition(float f, float f2, float f3) {
        this.position.set(f, f2, f3);
        this.updated = false;
    }

    public void setRotation(float f, float f2, float f3) {
        this.rotation.setEulerAngles(f, f2, f3);
        this.updated = false;
    }

    public void setRotationX(float f) {
        this.rotation.set(Vector3.X, f);
        this.updated = false;
    }

    public void setRotationY(float f) {
        this.rotation.set(Vector3.Y, f);
        this.updated = false;
    }

    public void setRotationZ(float f) {
        this.rotation.set(Vector3.Z, f);
        this.updated = false;
    }

    public void setScale(float f, float f2) {
        this.scale.set(f, f2);
        this.updated = false;
    }

    public void setScaleX(float f) {
        this.scale.x = f;
        this.updated = false;
    }

    public void setScaleY(float f) {
        this.scale.y = f;
        this.updated = false;
    }

    public void setTextureRegion(TextureRegion textureRegion) {
        this.material.textureRegion = textureRegion;
        updateUVs();
    }

    public void setWidth(float f) {
        this.dimensions.x = f;
        this.updated = false;
    }

    public void setX(float f) {
        this.position.x = f;
        this.updated = false;
    }

    public void setY(float f) {
        this.position.y = f;
        this.updated = false;
    }

    public void setZ(float f) {
        this.position.z = f;
        this.updated = false;
    }

    public void transformVertices() {
        float f;
        float f2;
        Vector2 vector2 = this.transformationOffset;
        if (vector2 != null) {
            f = -vector2.x;
            f2 = -vector2.y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        float[] fArr = this.vertices;
        float f3 = fArr[0] + f;
        Vector2 vector3 = this.scale;
        float f4 = f3 * vector3.x;
        float f5 = (fArr[1] + f2) * vector3.y;
        float f6 = fArr[2];
        Quaternion quaternion = this.rotation;
        float f7 = quaternion.w;
        float f8 = quaternion.y;
        float f9 = quaternion.z;
        fArr[0] = ((f8 * f6) + (f7 * f4)) - (f9 * f5);
        float f10 = quaternion.x;
        fArr[1] = ((f9 * f4) + (f7 * f5)) - (f10 * f6);
        fArr[2] = ((f10 * f5) + (f7 * f6)) - (f8 * f4);
        float f11 = (((-f10) * f4) - (f8 * f5)) - (f9 * f6);
        quaternion.conjugate();
        float[] fArr2 = this.vertices;
        float f12 = fArr2[0];
        float f13 = fArr2[1];
        float f14 = fArr2[2];
        Quaternion quaternion2 = this.rotation;
        float f15 = quaternion2.x;
        float f16 = quaternion2.w;
        float f17 = quaternion2.z;
        float f18 = (f13 * f17) + (f12 * f16) + (f11 * f15);
        float f19 = quaternion2.y;
        fArr2[0] = f18 - (f14 * f19);
        fArr2[1] = ((f14 * f15) + ((f13 * f16) + (f11 * f19))) - (f12 * f17);
        float f20 = f12 * f19;
        fArr2[2] = (f20 + ((f14 * f16) + (f11 * f17))) - (f13 * f15);
        quaternion2.conjugate();
        float[] fArr3 = this.vertices;
        float f21 = fArr3[0];
        Vector3 vector4 = this.position;
        fArr3[0] = (vector4.x - f) + f21;
        fArr3[1] = (vector4.y - f2) + fArr3[1];
        fArr3[2] = fArr3[2] + vector4.z;
        float f22 = fArr3[6] + f;
        Vector2 vector5 = this.scale;
        float f23 = f22 * vector5.x;
        float f24 = (fArr3[7] + f2) * vector5.y;
        float f25 = fArr3[8];
        Quaternion quaternion3 = this.rotation;
        float f26 = quaternion3.w;
        float f27 = quaternion3.y;
        float f28 = quaternion3.z;
        fArr3[6] = ((f27 * f25) + (f26 * f23)) - (f28 * f24);
        float f29 = quaternion3.x;
        fArr3[7] = ((f28 * f23) + (f26 * f24)) - (f29 * f25);
        fArr3[8] = ((f29 * f24) + (f26 * f25)) - (f27 * f23);
        float f30 = (((-f29) * f23) - (f27 * f24)) - (f28 * f25);
        quaternion3.conjugate();
        float[] fArr4 = this.vertices;
        float f31 = fArr4[6];
        float f32 = fArr4[7];
        float f33 = fArr4[8];
        Quaternion quaternion4 = this.rotation;
        float f34 = quaternion4.x;
        float f35 = quaternion4.w;
        float f36 = quaternion4.z;
        float f37 = quaternion4.y;
        fArr4[6] = ((f32 * f36) + ((f31 * f35) + (f30 * f34))) - (f33 * f37);
        fArr4[7] = ((f33 * f34) + ((f32 * f35) + (f30 * f37))) - (f31 * f36);
        float f38 = f31 * f37;
        fArr4[8] = (f38 + ((f33 * f35) + (f30 * f36))) - (f32 * f34);
        quaternion4.conjugate();
        float[] fArr5 = this.vertices;
        float f39 = fArr5[6];
        Vector3 vector6 = this.position;
        fArr5[6] = (vector6.x - f) + f39;
        fArr5[7] = (vector6.y - f2) + fArr5[7];
        fArr5[8] = fArr5[8] + vector6.z;
        float f40 = fArr5[12] + f;
        Vector2 vector7 = this.scale;
        float f41 = f40 * vector7.x;
        float f42 = (fArr5[13] + f2) * vector7.y;
        float f43 = fArr5[14];
        Quaternion quaternion5 = this.rotation;
        float f44 = quaternion5.w;
        float f45 = quaternion5.y;
        float f46 = quaternion5.z;
        fArr5[12] = ((f45 * f43) + (f44 * f41)) - (f46 * f42);
        float f47 = quaternion5.x;
        fArr5[13] = ((f46 * f41) + (f44 * f42)) - (f47 * f43);
        fArr5[14] = ((f47 * f42) + (f44 * f43)) - (f45 * f41);
        float f48 = (((-f47) * f41) - (f45 * f42)) - (f46 * f43);
        quaternion5.conjugate();
        float[] fArr6 = this.vertices;
        float f49 = fArr6[12];
        float f50 = fArr6[13];
        float f51 = fArr6[14];
        Quaternion quaternion6 = this.rotation;
        float f52 = quaternion6.x;
        float f53 = quaternion6.w;
        float f54 = quaternion6.z;
        float f55 = (f50 * f54) + (f49 * f53) + (f48 * f52);
        float f56 = quaternion6.y;
        fArr6[12] = f55 - (f51 * f56);
        fArr6[13] = ((f51 * f52) + ((f50 * f53) + (f48 * f56))) - (f49 * f54);
        float f57 = f49 * f56;
        fArr6[14] = (f57 + ((f51 * f53) + (f48 * f54))) - (f50 * f52);
        quaternion6.conjugate();
        float[] fArr7 = this.vertices;
        float f58 = fArr7[12];
        Vector3 vector8 = this.position;
        fArr7[12] = (vector8.x - f) + f58;
        fArr7[13] = (vector8.y - f2) + fArr7[13];
        fArr7[14] = fArr7[14] + vector8.z;
        float f59 = fArr7[18] + f;
        Vector2 vector9 = this.scale;
        float f60 = f59 * vector9.x;
        float f61 = (fArr7[19] + f2) * vector9.y;
        float f62 = fArr7[20];
        Quaternion quaternion7 = this.rotation;
        float f63 = quaternion7.w;
        float f64 = quaternion7.y;
        float f65 = quaternion7.z;
        fArr7[18] = ((f64 * f62) + (f63 * f60)) - (f65 * f61);
        float f66 = quaternion7.x;
        fArr7[19] = ((f65 * f60) + (f63 * f61)) - (f66 * f62);
        fArr7[20] = ((f66 * f61) + (f63 * f62)) - (f64 * f60);
        float f67 = (((-f66) * f60) - (f64 * f61)) - (f65 * f62);
        quaternion7.conjugate();
        float[] fArr8 = this.vertices;
        float f68 = fArr8[18];
        float f69 = fArr8[19];
        float f70 = fArr8[20];
        Quaternion quaternion8 = this.rotation;
        float f71 = quaternion8.x;
        float f72 = quaternion8.w;
        float f73 = quaternion8.z;
        float f74 = (f69 * f73) + (f68 * f72) + (f67 * f71);
        float f75 = quaternion8.y;
        fArr8[18] = f74 - (f70 * f75);
        fArr8[19] = ((f70 * f71) + ((f69 * f72) + (f67 * f75))) - (f68 * f73);
        float f76 = f68 * f75;
        fArr8[20] = (f76 + ((f70 * f72) + (f67 * f73))) - (f69 * f71);
        quaternion8.conjugate();
        float[] fArr9 = this.vertices;
        float f77 = fArr9[18];
        Vector3 vector10 = this.position;
        fArr9[18] = (vector10.x - f) + f77;
        fArr9[19] = (vector10.y - f2) + fArr9[19];
        fArr9[20] = fArr9[20] + vector10.z;
        this.updated = true;
    }

    public void translate(float f, float f2, float f3) {
        this.position.add(f, f2, f3);
        this.updated = false;
    }

    public void translateX(float f) {
        this.position.x += f;
        this.updated = false;
    }

    public void translateY(float f) {
        this.position.y += f;
        this.updated = false;
    }

    public void translateZ(float f) {
        this.position.z += f;
        this.updated = false;
    }

    public void update() {
        if (this.updated) {
            return;
        }
        resetVertices();
        transformVertices();
    }

    public void updateUVs() {
        TextureRegion textureRegion = this.material.textureRegion;
        this.vertices[4] = textureRegion.getU();
        this.vertices[5] = textureRegion.getV();
        this.vertices[10] = textureRegion.getU2();
        this.vertices[11] = textureRegion.getV();
        this.vertices[16] = textureRegion.getU();
        this.vertices[17] = textureRegion.getV2();
        this.vertices[22] = textureRegion.getU2();
        this.vertices[23] = textureRegion.getV2();
    }

    public static Decal newDecal(TextureRegion textureRegion, boolean z) {
        return newDecal(textureRegion.getRegionWidth(), textureRegion.getRegionHeight(), textureRegion, z ? GL20.GL_SRC_ALPHA : -1, z ? GL20.GL_ONE_MINUS_SRC_ALPHA : -1);
    }

    public static Decal newDecal(float f, float f2, TextureRegion textureRegion) {
        return newDecal(f, f2, textureRegion, -1, -1);
    }

    public void setPosition(Vector3 vector3) {
        this.position.set(vector3);
        this.updated = false;
    }

    public void setRotation(Vector3 vector3, Vector3 vector4) {
        tmp.set(vector4).crs(vector3).nor();
        tmp2.set(vector3).crs(tmp).nor();
        Quaternion quaternion = this.rotation;
        Vector3 vector5 = tmp;
        float f = vector5.x;
        Vector3 vector6 = tmp2;
        quaternion.setFromAxes(f, vector6.x, vector3.x, vector5.y, vector6.y, vector3.y, vector5.z, vector6.z, vector3.z);
        this.updated = false;
    }

    public void setScale(float f) {
        this.scale.set(f, f);
        this.updated = false;
    }

    public void translate(Vector3 vector3) {
        this.position.add(vector3);
        this.updated = false;
    }

    public static Decal newDecal(float f, float f2, TextureRegion textureRegion, boolean z) {
        return newDecal(f, f2, textureRegion, z ? GL20.GL_SRC_ALPHA : -1, z ? GL20.GL_ONE_MINUS_SRC_ALPHA : -1);
    }

    public static Decal newDecal(float f, float f2, TextureRegion textureRegion, int i, int i2) {
        Decal decal = new Decal();
        decal.setTextureRegion(textureRegion);
        decal.setBlending(i, i2);
        Vector2 vector2 = decal.dimensions;
        vector2.x = f;
        vector2.y = f2;
        decal.setColor(1.0f, 1.0f, 1.0f, 1.0f);
        return decal;
    }

    public void setColor(Color color) {
        this.color.set(color);
        float floatBits = color.toFloatBits();
        float[] fArr = this.vertices;
        fArr[3] = floatBits;
        fArr[9] = floatBits;
        fArr[15] = floatBits;
        fArr[21] = floatBits;
    }

    public void setRotation(Quaternion quaternion) {
        this.rotation.set(quaternion);
        this.updated = false;
    }

    public Decal(DecalMaterial decalMaterial) {
        this.vertices = new float[24];
        this.position = new Vector3();
        this.rotation = new Quaternion();
        this.scale = new Vector2(1.0f, 1.0f);
        this.color = new Color();
        this.transformationOffset = null;
        this.dimensions = new Vector2();
        this.updated = false;
        this.material = decalMaterial;
    }

    public static Decal newDecal(float f, float f2, TextureRegion textureRegion, int i, int i2, DecalMaterial decalMaterial) {
        Decal decal = new Decal(decalMaterial);
        decal.setTextureRegion(textureRegion);
        decal.setBlending(i, i2);
        Vector2 vector2 = decal.dimensions;
        vector2.x = f;
        vector2.y = f2;
        decal.setColor(1.0f, 1.0f, 1.0f, 1.0f);
        return decal;
    }
}
