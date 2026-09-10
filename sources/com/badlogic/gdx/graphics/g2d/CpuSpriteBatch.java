package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class CpuSpriteBatch extends SpriteBatch {
    private final Affine2 adjustAffine;
    private boolean adjustNeeded;
    private boolean haveIdentityRealMatrix;
    private final Affine2 tmpAffine;
    private final Matrix4 virtualMatrix;

    public CpuSpriteBatch() {
        this(1000);
    }

    private static boolean checkEqual(Matrix4 matrix4, Matrix4 matrix5) {
        if (matrix4 == matrix5) {
            return true;
        }
        float[] fArr = matrix4.val;
        float f = fArr[0];
        float[] fArr2 = matrix5.val;
        return f == fArr2[0] && fArr[1] == fArr2[1] && fArr[4] == fArr2[4] && fArr[5] == fArr2[5] && fArr[12] == fArr2[12] && fArr[13] == fArr2[13];
    }

    private static boolean checkIdt(Matrix4 matrix4) {
        float[] values = matrix4.getValues();
        return values[0] == 1.0f && values[1] == 0.0f && values[4] == 0.0f && values[5] == 1.0f && values[12] == 0.0f && values[13] == 0.0f;
    }

    private void drawAdjusted(TextureRegion textureRegion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        drawAdjustedUV(textureRegion.texture, f, f2, f3, f4, f5, f6, f7, f8, f9, textureRegion.u, textureRegion.v2, textureRegion.u2, textureRegion.v, false, false);
    }

    private void drawAdjustedUV(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, boolean z, boolean z2) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        if (!this.drawing) {
            throw new IllegalStateException("CpuSpriteBatch.begin must be called before draw.");
        }
        if (texture != this.lastTexture) {
            switchTexture(texture);
        } else if (this.idx == this.vertices.length) {
            super.flush();
        }
        float f25 = f + f3;
        float f26 = f2 + f4;
        float f27 = -f3;
        float f28 = -f4;
        float f29 = f5 - f3;
        float f30 = f6 - f4;
        if (f7 != 1.0f || f8 != 1.0f) {
            f27 *= f7;
            f28 *= f8;
            f29 *= f7;
            f30 *= f8;
        }
        if (f9 != 0.0f) {
            float fCosDeg = MathUtils.cosDeg(f9);
            float fSinDeg = MathUtils.sinDeg(f9);
            float f31 = fCosDeg * f27;
            f15 = f31 - (fSinDeg * f28);
            float f32 = f27 * fSinDeg;
            float f33 = (f28 * fCosDeg) + f32;
            float f34 = fSinDeg * f30;
            f14 = f31 - f34;
            float f35 = f30 * fCosDeg;
            f18 = f32 + f35;
            float f36 = (fCosDeg * f29) - f34;
            float f37 = f35 + (fSinDeg * f29);
            f17 = f37 - (f18 - f33);
            f20 = (f36 - f14) + f15;
            f29 = f36;
            f16 = f33;
            f19 = f37;
        } else {
            f14 = f27;
            f15 = f14;
            f16 = f28;
            f17 = f16;
            f18 = f30;
            f19 = f18;
            f20 = f29;
        }
        float f38 = f15 + f25;
        float f39 = f16 + f26;
        float f40 = f14 + f25;
        float f41 = f18 + f26;
        float f42 = f29 + f25;
        float f43 = f19 + f26;
        float f44 = f20 + f25;
        float f45 = f17 + f26;
        if (z) {
            f22 = f10;
            f21 = f12;
        } else {
            f21 = f10;
            f22 = f12;
        }
        if (z2) {
            f24 = f11;
            f23 = f13;
        } else {
            f23 = f11;
            f24 = f13;
        }
        Affine2 affine2 = this.adjustAffine;
        float[] fArr = this.vertices;
        int i = this.idx;
        float f46 = affine2.m00;
        float f47 = affine2.m01;
        float f48 = f22;
        float f49 = affine2.m02;
        fArr[i] = (f47 * f39) + (f46 * f38) + f49;
        float f50 = affine2.m10;
        float f51 = affine2.m11;
        float f52 = (f39 * f51) + (f38 * f50);
        float f53 = affine2.m12;
        fArr[i + 1] = f52 + f53;
        float f54 = this.colorPacked;
        fArr[i + 2] = f54;
        fArr[i + 3] = f21;
        fArr[i + 4] = f23;
        fArr[i + 5] = AbstractC5044xl.d(f47, f41, f46 * f40, f49);
        fArr[i + 6] = AbstractC5044xl.d(f51, f41, f40 * f50, f53);
        fArr[i + 7] = f54;
        fArr[i + 8] = f21;
        fArr[i + 9] = f24;
        fArr[i + 10] = AbstractC5044xl.d(f47, f43, f46 * f42, f49);
        fArr[i + 11] = AbstractC5044xl.d(f51, f43, f50 * f42, f53);
        fArr[i + 12] = f54;
        fArr[i + 13] = f48;
        fArr[i + 14] = f24;
        fArr[i + 15] = AbstractC5044xl.d(f47, f45, f46 * f44, f49);
        fArr[i + 16] = AbstractC5044xl.d(f51, f45, f50 * f44, f53);
        fArr[i + 17] = f54;
        fArr[i + 18] = f48;
        fArr[i + 19] = f23;
        this.idx = i + 20;
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (this.adjustNeeded) {
            drawAdjusted(texture, f, f2, f3, f4, f5, f6, f7, f8, f9, i, i2, i3, i4, z, z2);
        } else {
            super.draw(texture, f, f2, f3, f4, f5, f6, f7, f8, f9, i, i2, i3, i4, z, z2);
        }
    }

    public void flushAndSyncTransformMatrix() {
        flush();
        if (this.adjustNeeded) {
            boolean zCheckIdt = checkIdt(this.virtualMatrix);
            this.haveIdentityRealMatrix = zCheckIdt;
            if (!zCheckIdt && this.virtualMatrix.det() == 0.0f) {
                throw new GdxRuntimeException("Transform matrix is singular, can't sync");
            }
            this.adjustNeeded = false;
            super.setTransformMatrix(this.virtualMatrix);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public Matrix4 getTransformMatrix() {
        return this.adjustNeeded ? this.virtualMatrix : super.getTransformMatrix();
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void setTransformMatrix(Matrix4 matrix4) {
        Matrix4 transformMatrix = super.getTransformMatrix();
        if (checkEqual(transformMatrix, matrix4)) {
            this.adjustNeeded = false;
            return;
        }
        if (!isDrawing()) {
            transformMatrix.setAsAffine(matrix4);
            this.haveIdentityRealMatrix = checkIdt(transformMatrix);
            return;
        }
        this.virtualMatrix.setAsAffine(matrix4);
        this.adjustNeeded = true;
        if (this.haveIdentityRealMatrix) {
            this.adjustAffine.set(matrix4);
        } else {
            this.tmpAffine.set(matrix4);
            this.adjustAffine.set(transformMatrix).inv().mul(this.tmpAffine);
        }
    }

    public CpuSpriteBatch(int i) {
        this(i, null);
    }

    private static boolean checkEqual(Matrix4 matrix4, Affine2 affine2) {
        float[] values = matrix4.getValues();
        return values[0] == affine2.m00 && values[1] == affine2.m10 && values[4] == affine2.m01 && values[5] == affine2.m11 && values[12] == affine2.m02 && values[13] == affine2.m12;
    }

    private void drawAdjusted(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float width = 1.0f / texture.getWidth();
        float height = 1.0f / texture.getHeight();
        drawAdjustedUV(texture, f, f2, f3, f4, f5, f6, f7, f8, f9, i * width, (i2 + i4) * height, width * (i + i3), height * i2, z, z2);
    }

    public CpuSpriteBatch(int i, ShaderProgram shaderProgram) {
        super(i, shaderProgram);
        this.virtualMatrix = new Matrix4();
        this.adjustAffine = new Affine2();
        this.haveIdentityRealMatrix = true;
        this.tmpAffine = new Affine2();
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (!this.adjustNeeded) {
            super.draw(texture, f, f2, f3, f4, i, i2, i3, i4, z, z2);
        } else {
            drawAdjusted(texture, f, f2, 0.0f, 0.0f, f3, f4, 1.0f, 1.0f, 0.0f, i, i2, i3, i4, z, z2);
        }
    }

    private void drawAdjusted(TextureRegion textureRegion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (this.drawing) {
            Texture texture = textureRegion.texture;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.idx == this.vertices.length) {
                super.flush();
            }
            float f21 = f + f3;
            float f22 = f2 + f4;
            float f23 = -f3;
            float f24 = -f4;
            float f25 = f5 - f3;
            float f26 = f6 - f4;
            if (f7 != 1.0f || f8 != 1.0f) {
                f23 *= f7;
                f24 *= f8;
                f25 *= f7;
                f26 *= f8;
            }
            if (f9 != 0.0f) {
                float fCosDeg = MathUtils.cosDeg(f9);
                float fSinDeg = MathUtils.sinDeg(f9);
                float f27 = fCosDeg * f23;
                f11 = f27 - (fSinDeg * f24);
                float f28 = f23 * fSinDeg;
                float f29 = (f24 * fCosDeg) + f28;
                float f30 = fSinDeg * f26;
                f10 = f27 - f30;
                float f31 = f26 * fCosDeg;
                f14 = f28 + f31;
                float f32 = (fCosDeg * f25) - f30;
                float f33 = f31 + (fSinDeg * f25);
                f13 = f33 - (f14 - f29);
                f16 = (f32 - f10) + f11;
                f25 = f32;
                f12 = f29;
                f15 = f33;
            } else {
                f10 = f23;
                f11 = f10;
                f12 = f24;
                f13 = f12;
                f14 = f26;
                f15 = f14;
                f16 = f25;
            }
            float f34 = f11 + f21;
            float f35 = f12 + f22;
            float f36 = f10 + f21;
            float f37 = f14 + f22;
            float f38 = f25 + f21;
            float f39 = f15 + f22;
            float f40 = f16 + f21;
            float f41 = f13 + f22;
            if (z) {
                f17 = textureRegion.u2;
                f18 = textureRegion.v2;
                f19 = textureRegion.u;
                f20 = textureRegion.v;
            } else {
                f17 = textureRegion.u;
                f18 = textureRegion.v;
                f19 = textureRegion.u2;
                f20 = textureRegion.v2;
            }
            float f42 = f20;
            float f43 = f18;
            float f44 = f19;
            float f45 = f17;
            Affine2 affine2 = this.adjustAffine;
            float[] fArr = this.vertices;
            int i = this.idx;
            float f46 = affine2.m00;
            float f47 = f20;
            float f48 = affine2.m01;
            float f49 = affine2.m02;
            fArr[i] = (f48 * f35) + (f46 * f34) + f49;
            float f50 = affine2.m10;
            float f51 = affine2.m11;
            float f52 = affine2.m12;
            fArr[i + 1] = (f35 * f51) + (f34 * f50) + f52;
            float f53 = this.colorPacked;
            fArr[i + 2] = f53;
            fArr[i + 3] = f45;
            fArr[i + 4] = f43;
            fArr[i + 5] = AbstractC5044xl.d(f48, f37, f46 * f36, f49);
            fArr[i + 6] = AbstractC5044xl.d(f51, f37, f36 * f50, f52);
            fArr[i + 7] = f53;
            fArr[i + 8] = f44;
            fArr[i + 9] = f43;
            fArr[i + 10] = AbstractC5044xl.d(f48, f39, f46 * f38, f49);
            fArr[i + 11] = AbstractC5044xl.d(f51, f39, f50 * f38, f52);
            fArr[i + 12] = f53;
            fArr[i + 13] = f44;
            fArr[i + 14] = f47;
            fArr[i + 15] = AbstractC5044xl.d(f48, f41, f46 * f40, f49);
            fArr[i + 16] = AbstractC5044xl.d(f51, f41, f50 * f40, f52);
            fArr[i + 17] = f53;
            fArr[i + 18] = f45;
            fArr[i + 19] = f42;
            this.idx = i + 20;
            return;
        }
        throw new IllegalStateException("CpuSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, int i, int i2, int i3, int i4) {
        if (!this.adjustNeeded) {
            super.draw(texture, f, f2, i, i2, i3, i4);
        } else {
            drawAdjusted(texture, f, f2, 0.0f, 0.0f, i3, i4, 1.0f, 1.0f, 0.0f, i, i2, i3, i4, false, false);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!this.adjustNeeded) {
            super.draw(texture, f, f2, f3, f4, f5, f6, f7, f8);
        } else {
            drawAdjustedUV(texture, f, f2, 0.0f, 0.0f, f3, f4, 1.0f, 1.0f, 0.0f, f5, f6, f7, f8, false, false);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2) {
        if (!this.adjustNeeded) {
            super.draw(texture, f, f2);
        } else {
            drawAdjusted(texture, f, f2, 0.0f, 0.0f, texture.getWidth(), texture.getHeight(), 1.0f, 1.0f, 0.0f, 0, 1, 1, 0, false, false);
        }
    }

    public void setTransformMatrix(Affine2 affine2) {
        Matrix4 transformMatrix = super.getTransformMatrix();
        if (checkEqual(transformMatrix, affine2)) {
            this.adjustNeeded = false;
            return;
        }
        this.virtualMatrix.setAsAffine(affine2);
        if (isDrawing()) {
            this.adjustNeeded = true;
            if (this.haveIdentityRealMatrix) {
                this.adjustAffine.set(affine2);
                return;
            } else {
                this.adjustAffine.set(transformMatrix).inv().mul(affine2);
                return;
            }
        }
        transformMatrix.setAsAffine(affine2);
        this.haveIdentityRealMatrix = checkIdt(transformMatrix);
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, float f3, float f4) {
        if (!this.adjustNeeded) {
            super.draw(texture, f, f2, f3, f4);
        } else {
            drawAdjusted(texture, f, f2, 0.0f, 0.0f, f3, f4, 1.0f, 1.0f, 0.0f, 0, 1, 1, 0, false, false);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2) {
        if (!this.adjustNeeded) {
            super.draw(textureRegion, f, f2);
        } else {
            drawAdjusted(textureRegion, f, f2, 0.0f, 0.0f, textureRegion.getRegionWidth(), textureRegion.getRegionHeight(), 1.0f, 1.0f, 0.0f);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2, float f3, float f4) {
        if (!this.adjustNeeded) {
            super.draw(textureRegion, f, f2, f3, f4);
        } else {
            drawAdjusted(textureRegion, f, f2, 0.0f, 0.0f, f3, f4, 1.0f, 1.0f, 0.0f);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (!this.adjustNeeded) {
            super.draw(textureRegion, f, f2, f3, f4, f5, f6, f7, f8, f9);
        } else {
            drawAdjusted(textureRegion, f, f2, f3, f4, f5, f6, f7, f8, f9);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z) {
        if (!this.adjustNeeded) {
            super.draw(textureRegion, f, f2, f3, f4, f5, f6, f7, f8, f9, z);
        } else {
            drawAdjusted(textureRegion, f, f2, f3, f4, f5, f6, f7, f8, f9, z);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float[] fArr, int i, int i2) {
        if (i2 % 20 == 0) {
            if (!this.adjustNeeded) {
                super.draw(texture, fArr, i, i2);
                return;
            } else {
                drawAdjusted(texture, fArr, i, i2);
                return;
            }
        }
        throw new GdxRuntimeException("invalid vertex count");
    }

    @Override // com.badlogic.gdx.graphics.g2d.SpriteBatch, com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2, Affine2 affine2) {
        if (!this.adjustNeeded) {
            super.draw(textureRegion, f, f2, affine2);
        } else {
            drawAdjusted(textureRegion, f, f2, affine2);
        }
    }

    private void drawAdjusted(TextureRegion textureRegion, float f, float f2, Affine2 affine2) {
        if (this.drawing) {
            Texture texture = textureRegion.texture;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.idx == this.vertices.length) {
                super.flush();
            }
            float f3 = affine2.m02;
            float f4 = affine2.m12;
            float f5 = affine2.m01;
            float f6 = (f5 * f2) + f3;
            float f7 = affine2.m11;
            float f8 = (f7 * f2) + f4;
            float f9 = affine2.m00;
            float fD = AbstractC5044xl.d(f5, f2, f9 * f, f3);
            float f10 = affine2.m10;
            float fD2 = AbstractC5044xl.d(f7, f2, f10 * f, f4);
            float f11 = (f9 * f) + f3;
            float f12 = (f10 * f) + f4;
            float f13 = textureRegion.u;
            float f14 = textureRegion.v2;
            float f15 = textureRegion.u2;
            float f16 = textureRegion.v;
            Affine2 affine3 = this.adjustAffine;
            float[] fArr = this.vertices;
            int i = this.idx;
            float f17 = affine3.m00;
            float f18 = affine3.m01;
            float f19 = affine3.m02;
            fArr[i] = (f18 * f4) + (f17 * f3) + f19;
            float f20 = affine3.m10;
            float f21 = affine3.m11;
            float f22 = (f4 * f21) + (f3 * f20);
            float f23 = affine3.m12;
            fArr[i + 1] = f22 + f23;
            float f24 = this.colorPacked;
            fArr[i + 2] = f24;
            fArr[i + 3] = f13;
            fArr[i + 4] = f14;
            fArr[i + 5] = AbstractC5044xl.d(f18, f8, f17 * f6, f19);
            fArr[i + 6] = AbstractC5044xl.d(f21, f8, f6 * f20, f23);
            fArr[i + 7] = f24;
            fArr[i + 8] = f13;
            fArr[i + 9] = f16;
            fArr[i + 10] = AbstractC5044xl.d(f18, fD2, f17 * fD, f19);
            fArr[i + 11] = AbstractC5044xl.d(f21, fD2, f20 * fD, f23);
            fArr[i + 12] = f24;
            fArr[i + 13] = f15;
            fArr[i + 14] = f16;
            fArr[i + 15] = AbstractC5044xl.d(f18, f12, f17 * f11, f19);
            fArr[i + 16] = AbstractC5044xl.d(f21, f12, f20 * f11, f23);
            fArr[i + 17] = f24;
            fArr[i + 18] = f15;
            fArr[i + 19] = f14;
            this.idx = i + 20;
            return;
        }
        throw new IllegalStateException("CpuSpriteBatch.begin must be called before draw.");
    }

    private void drawAdjusted(Texture texture, float[] fArr, int i, int i2) {
        if (this.drawing) {
            if (texture != this.lastTexture) {
                switchTexture(texture);
            }
            Affine2 affine2 = this.adjustAffine;
            int iMin = Math.min(this.vertices.length - this.idx, i2);
            do {
                i2 -= iMin;
                while (iMin > 0) {
                    float f = fArr[i];
                    float f2 = fArr[i + 1];
                    float[] fArr2 = this.vertices;
                    int i3 = this.idx;
                    fArr2[i3] = (affine2.m01 * f2) + (affine2.m00 * f) + affine2.m02;
                    fArr2[i3 + 1] = (affine2.m11 * f2) + (affine2.m10 * f) + affine2.m12;
                    fArr2[i3 + 2] = fArr[i + 2];
                    fArr2[i3 + 3] = fArr[i + 3];
                    fArr2[i3 + 4] = fArr[i + 4];
                    this.idx = i3 + 5;
                    i += 5;
                    iMin -= 5;
                }
                if (i2 > 0) {
                    super.flush();
                    iMin = Math.min(this.vertices.length, i2);
                }
            } while (i2 > 0);
            return;
        }
        throw new IllegalStateException("CpuSpriteBatch.begin must be called before draw.");
    }
}
