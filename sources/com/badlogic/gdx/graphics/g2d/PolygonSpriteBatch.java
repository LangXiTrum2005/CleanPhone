package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class PolygonSpriteBatch implements PolygonBatch {
    private int blendDstFunc;
    private int blendDstFuncAlpha;
    private int blendSrcFunc;
    private int blendSrcFuncAlpha;
    private boolean blendingDisabled;
    private final Color color;
    float colorPacked;
    private final Matrix4 combinedMatrix;
    private ShaderProgram customShader;
    private boolean drawing;
    private float invTexHeight;
    private float invTexWidth;
    private Texture lastTexture;
    public int maxTrianglesInBatch;
    private Mesh mesh;
    private boolean ownsShader;
    private final Matrix4 projectionMatrix;
    public int renderCalls;
    private final ShaderProgram shader;
    public int totalRenderCalls;
    private final Matrix4 transformMatrix;
    private int triangleIndex;
    private final short[] triangles;
    private int vertexIndex;
    private final float[] vertices;

    public PolygonSpriteBatch() {
        this(2000, null);
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void begin() {
        if (this.drawing) {
            throw new IllegalStateException("PolygonSpriteBatch.end must be called before begin.");
        }
        this.renderCalls = 0;
        Gdx.gl.glDepthMask(false);
        ShaderProgram shaderProgram = this.customShader;
        if (shaderProgram != null) {
            shaderProgram.bind();
        } else {
            this.shader.bind();
        }
        setupMatrices();
        this.drawing = true;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void disableBlending() {
        flush();
        this.blendingDisabled = true;
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        ShaderProgram shaderProgram;
        this.mesh.dispose();
        if (!this.ownsShader || (shaderProgram = this.shader) == null) {
            return;
        }
        shaderProgram.dispose();
    }

    @Override // com.badlogic.gdx.graphics.g2d.PolygonBatch
    public void draw(PolygonRegion polygonRegion, float f, float f2) {
        if (!this.drawing) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.triangles;
        short[] sArr2 = polygonRegion.triangles;
        int length = sArr2.length;
        float[] fArr = polygonRegion.vertices;
        int length2 = fArr.length;
        Texture texture = polygonRegion.region.texture;
        if (texture != this.lastTexture) {
            switchTexture(texture);
        } else if (this.triangleIndex + length > sArr.length || AbstractC3950lJ.D(length2, 5, 2, this.vertexIndex) > this.vertices.length) {
            flush();
        }
        int i = this.triangleIndex;
        int i2 = this.vertexIndex;
        int i3 = i2 / 5;
        int i4 = 0;
        while (i4 < length) {
            sArr[i] = (short) (sArr2[i4] + i3);
            i4++;
            i++;
        }
        this.triangleIndex = i;
        float[] fArr2 = this.vertices;
        float f3 = this.colorPacked;
        float[] fArr3 = polygonRegion.textureCoords;
        for (int i5 = 0; i5 < length2; i5 += 2) {
            fArr2[i2] = fArr[i5] + f;
            int i6 = i5 + 1;
            fArr2[i2 + 1] = fArr[i6] + f2;
            fArr2[i2 + 2] = f3;
            int i7 = i2 + 4;
            fArr2[i2 + 3] = fArr3[i5];
            i2 += 5;
            fArr2[i7] = fArr3[i6];
        }
        this.vertexIndex = i2;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void enableBlending() {
        flush();
        this.blendingDisabled = false;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void end() {
        if (!this.drawing) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before end.");
        }
        if (this.vertexIndex > 0) {
            flush();
        }
        this.lastTexture = null;
        this.drawing = false;
        GL20 gl20 = Gdx.gl;
        gl20.glDepthMask(true);
        if (isBlendingEnabled()) {
            gl20.glDisable(GL20.GL_BLEND);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void flush() {
        if (this.vertexIndex == 0) {
            return;
        }
        this.renderCalls++;
        this.totalRenderCalls++;
        int i = this.triangleIndex;
        if (i > this.maxTrianglesInBatch) {
            this.maxTrianglesInBatch = i;
        }
        this.lastTexture.bind();
        Mesh mesh = this.mesh;
        mesh.setVertices(this.vertices, 0, this.vertexIndex);
        mesh.setIndices(this.triangles, 0, i);
        if (this.blendingDisabled) {
            Gdx.gl.glDisable(GL20.GL_BLEND);
        } else {
            Gdx.gl.glEnable(GL20.GL_BLEND);
            int i2 = this.blendSrcFunc;
            if (i2 != -1) {
                Gdx.gl.glBlendFuncSeparate(i2, this.blendDstFunc, this.blendSrcFuncAlpha, this.blendDstFuncAlpha);
            }
        }
        ShaderProgram shaderProgram = this.customShader;
        if (shaderProgram == null) {
            shaderProgram = this.shader;
        }
        mesh.render(shaderProgram, 4, 0, i);
        this.vertexIndex = 0;
        this.triangleIndex = 0;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public int getBlendDstFunc() {
        return this.blendDstFunc;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public int getBlendDstFuncAlpha() {
        return this.blendDstFuncAlpha;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public int getBlendSrcFunc() {
        return this.blendSrcFunc;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public int getBlendSrcFuncAlpha() {
        return this.blendSrcFuncAlpha;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public Color getColor() {
        return this.color;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public float getPackedColor() {
        return this.colorPacked;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public Matrix4 getProjectionMatrix() {
        return this.projectionMatrix;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public ShaderProgram getShader() {
        ShaderProgram shaderProgram = this.customShader;
        return shaderProgram == null ? this.shader : shaderProgram;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public Matrix4 getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public boolean isBlendingEnabled() {
        return !this.blendingDisabled;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public boolean isDrawing() {
        return this.drawing;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setBlendFunction(int i, int i2) {
        setBlendFunctionSeparate(i, i2, i, i2);
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setBlendFunctionSeparate(int i, int i2, int i3, int i4) {
        if (this.blendSrcFunc == i && this.blendDstFunc == i2 && this.blendSrcFuncAlpha == i3 && this.blendDstFuncAlpha == i4) {
            return;
        }
        flush();
        this.blendSrcFunc = i;
        this.blendDstFunc = i2;
        this.blendSrcFuncAlpha = i3;
        this.blendDstFuncAlpha = i4;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setColor(Color color) {
        this.color.set(color);
        this.colorPacked = color.toFloatBits();
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setPackedColor(float f) {
        Color.abgr8888ToColor(this.color, f);
        this.colorPacked = f;
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setProjectionMatrix(Matrix4 matrix4) {
        if (this.drawing) {
            flush();
        }
        this.projectionMatrix.set(matrix4);
        if (this.drawing) {
            setupMatrices();
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setShader(ShaderProgram shaderProgram) {
        if (this.drawing) {
            flush();
        }
        this.customShader = shaderProgram;
        if (this.drawing) {
            if (shaderProgram != null) {
                shaderProgram.bind();
            } else {
                this.shader.bind();
            }
            setupMatrices();
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setTransformMatrix(Matrix4 matrix4) {
        if (this.drawing) {
            flush();
        }
        this.transformMatrix.set(matrix4);
        if (this.drawing) {
            setupMatrices();
        }
    }

    public void setupMatrices() {
        this.combinedMatrix.set(this.projectionMatrix).mul(this.transformMatrix);
        ShaderProgram shaderProgram = this.customShader;
        if (shaderProgram != null) {
            shaderProgram.setUniformMatrix("u_projTrans", this.combinedMatrix);
            this.customShader.setUniformi("u_texture", 0);
        } else {
            this.shader.setUniformMatrix("u_projTrans", this.combinedMatrix);
            this.shader.setUniformi("u_texture", 0);
        }
    }

    public void switchTexture(Texture texture) {
        flush();
        this.lastTexture = texture;
        this.invTexWidth = 1.0f / texture.getWidth();
        this.invTexHeight = 1.0f / texture.getHeight();
    }

    public PolygonSpriteBatch(int i) {
        this(i, i * 2, null);
    }

    public PolygonSpriteBatch(int i, ShaderProgram shaderProgram) {
        this(i, i * 2, shaderProgram);
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void setColor(float f, float f2, float f3, float f4) {
        this.color.set(f, f2, f3, f4);
        this.colorPacked = this.color.toFloatBits();
    }

    public PolygonSpriteBatch(int i, int i2, ShaderProgram shaderProgram) {
        this.invTexWidth = 0.0f;
        this.invTexHeight = 0.0f;
        this.transformMatrix = new Matrix4();
        Matrix4 matrix4 = new Matrix4();
        this.projectionMatrix = matrix4;
        this.combinedMatrix = new Matrix4();
        this.blendSrcFunc = GL20.GL_SRC_ALPHA;
        this.blendDstFunc = GL20.GL_ONE_MINUS_SRC_ALPHA;
        this.blendSrcFuncAlpha = GL20.GL_SRC_ALPHA;
        this.blendDstFuncAlpha = GL20.GL_ONE_MINUS_SRC_ALPHA;
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.colorPacked = Color.WHITE_FLOAT_BITS;
        this.renderCalls = 0;
        this.totalRenderCalls = 0;
        this.maxTrianglesInBatch = 0;
        if (i <= 32767) {
            int i3 = i2 * 3;
            this.mesh = new Mesh(Gdx.gl30 != null ? Mesh.VertexDataType.VertexBufferObjectWithVAO : Mesh.VertexDataType.VertexArray, false, i, i3, new VertexAttribute(1, 2, ShaderProgram.POSITION_ATTRIBUTE), new VertexAttribute(4, 4, ShaderProgram.COLOR_ATTRIBUTE), new VertexAttribute(16, 2, "a_texCoord0"));
            this.vertices = new float[i * 5];
            this.triangles = new short[i3];
            if (shaderProgram == null) {
                this.shader = SpriteBatch.createDefaultShader();
                this.ownsShader = true;
            } else {
                this.shader = shaderProgram;
            }
            matrix4.setToOrtho2D(0.0f, 0.0f, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            return;
        }
        throw new IllegalArgumentException(AbstractC3950lJ.p("Can't have more than 32767 vertices per batch: ", i));
    }

    @Override // com.badlogic.gdx.graphics.g2d.PolygonBatch
    public void draw(PolygonRegion polygonRegion, float f, float f2, float f3, float f4) {
        if (this.drawing) {
            short[] sArr = this.triangles;
            short[] sArr2 = polygonRegion.triangles;
            int length = sArr2.length;
            float[] fArr = polygonRegion.vertices;
            int length2 = fArr.length;
            TextureRegion textureRegion = polygonRegion.region;
            Texture texture = textureRegion.texture;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + length > sArr.length || AbstractC3950lJ.D(length2, 5, 2, this.vertexIndex) > this.vertices.length) {
                flush();
            }
            int i = this.triangleIndex;
            int i2 = this.vertexIndex;
            int i3 = i2 / 5;
            int length3 = sArr2.length;
            int i4 = 0;
            while (i4 < length3) {
                sArr[i] = (short) (sArr2[i4] + i3);
                i4++;
                i++;
            }
            this.triangleIndex = i;
            float[] fArr2 = this.vertices;
            float f5 = this.colorPacked;
            float[] fArr3 = polygonRegion.textureCoords;
            float f6 = f3 / textureRegion.regionWidth;
            float f7 = f4 / textureRegion.regionHeight;
            for (int i5 = 0; i5 < length2; i5 += 2) {
                fArr2[i2] = (fArr[i5] * f6) + f;
                int i6 = i5 + 1;
                fArr2[i2 + 1] = (fArr[i6] * f7) + f2;
                fArr2[i2 + 2] = f5;
                int i7 = i2 + 4;
                fArr2[i2 + 3] = fArr3[i5];
                i2 += 5;
                fArr2[i7] = fArr3[i6];
            }
            this.vertexIndex = i2;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.PolygonBatch
    public void draw(PolygonRegion polygonRegion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (this.drawing) {
            short[] sArr = this.triangles;
            short[] sArr2 = polygonRegion.triangles;
            int length = sArr2.length;
            float[] fArr = polygonRegion.vertices;
            int length2 = fArr.length;
            TextureRegion textureRegion = polygonRegion.region;
            Texture texture = textureRegion.texture;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + length > sArr.length || AbstractC3950lJ.D(length2, 5, 2, this.vertexIndex) > this.vertices.length) {
                flush();
            }
            int i = this.triangleIndex;
            int i2 = this.vertexIndex;
            int i3 = i2 / 5;
            int i4 = 0;
            int i5 = 0;
            while (i5 < length) {
                sArr[i] = (short) (sArr2[i5] + i3);
                i5++;
                i++;
            }
            this.triangleIndex = i;
            float[] fArr2 = this.vertices;
            float f10 = this.colorPacked;
            float[] fArr3 = polygonRegion.textureCoords;
            float f11 = f + f3;
            float f12 = f2 + f4;
            float f13 = f5 / textureRegion.regionWidth;
            float f14 = f6 / textureRegion.regionHeight;
            float fCosDeg = MathUtils.cosDeg(f9);
            float fSinDeg = MathUtils.sinDeg(f9);
            while (i4 < length2) {
                float f15 = ((fArr[i4] * f13) - f3) * f7;
                int i6 = i4 + 1;
                float[] fArr4 = fArr;
                float f16 = ((fArr[i6] * f14) - f4) * f8;
                fArr2[i2] = ((fCosDeg * f15) - (fSinDeg * f16)) + f11;
                fArr2[i2 + 1] = AbstractC5044xl.d(fCosDeg, f16, f15 * fSinDeg, f12);
                fArr2[i2 + 2] = f10;
                int i7 = i2 + 4;
                fArr2[i2 + 3] = fArr3[i4];
                i2 += 5;
                fArr2[i7] = fArr3[i6];
                i4 += 2;
                fArr = fArr4;
            }
            this.vertexIndex = i2;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.PolygonBatch
    public void draw(Texture texture, float[] fArr, int i, int i2, short[] sArr, int i3, int i4) {
        if (this.drawing) {
            short[] sArr2 = this.triangles;
            float[] fArr2 = this.vertices;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + i4 > sArr2.length || this.vertexIndex + i2 > fArr2.length) {
                flush();
            }
            int i5 = this.triangleIndex;
            int i6 = this.vertexIndex;
            int i7 = i6 / 5;
            int i8 = i4 + i3;
            while (i3 < i8) {
                sArr2[i5] = (short) (sArr[i3] + i7);
                i3++;
                i5++;
            }
            this.triangleIndex = i5;
            System.arraycopy(fArr, i, fArr2, i6, i2);
            this.vertexIndex += i2;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i5 = this.triangleIndex;
            int i6 = this.vertexIndex / 5;
            short s = (short) i6;
            sArr[i5] = s;
            sArr[i5 + 1] = (short) (i6 + 1);
            short s2 = (short) (i6 + 2);
            sArr[i5 + 2] = s2;
            sArr[i5 + 3] = s2;
            sArr[i5 + 4] = (short) (i6 + 3);
            sArr[i5 + 5] = s;
            this.triangleIndex = i5 + 6;
            float f17 = f + f3;
            float f18 = f2 + f4;
            float f19 = -f3;
            float f20 = -f4;
            float f21 = f5 - f3;
            float f22 = f6 - f4;
            if (f7 != 1.0f || f8 != 1.0f) {
                f19 *= f7;
                f20 *= f8;
                f21 *= f7;
                f22 *= f8;
            }
            if (f9 != 0.0f) {
                float fCosDeg = MathUtils.cosDeg(f9);
                float fSinDeg = MathUtils.sinDeg(f9);
                float f23 = fCosDeg * f19;
                f11 = f23 - (fSinDeg * f20);
                float f24 = f19 * fSinDeg;
                float f25 = (f20 * fCosDeg) + f24;
                float f26 = fSinDeg * f22;
                f10 = f23 - f26;
                float f27 = f22 * fCosDeg;
                f14 = f24 + f27;
                float f28 = (fCosDeg * f21) - f26;
                float f29 = f27 + (fSinDeg * f21);
                f13 = f29 - (f14 - f25);
                f16 = (f28 - f10) + f11;
                f21 = f28;
                f12 = f25;
                f15 = f29;
            } else {
                f10 = f19;
                f11 = f10;
                f12 = f20;
                f13 = f12;
                f14 = f22;
                f15 = f14;
                f16 = f21;
            }
            float f30 = f11 + f17;
            float f31 = f12 + f18;
            float f32 = f10 + f17;
            float f33 = f14 + f18;
            float f34 = f21 + f17;
            float f35 = f15 + f18;
            float f36 = f16 + f17;
            float f37 = f13 + f18;
            float f38 = this.invTexWidth;
            float f39 = i * f38;
            float f40 = this.invTexHeight;
            float f41 = (i2 + i4) * f40;
            float f42 = (i + i3) * f38;
            float f43 = i2 * f40;
            if (z) {
                f39 = f42;
                f42 = f39;
            }
            if (z2) {
                f41 = f43;
                f43 = f41;
            }
            float f44 = this.colorPacked;
            int i7 = this.vertexIndex;
            fArr[i7] = f30;
            fArr[i7 + 1] = f31;
            fArr[i7 + 2] = f44;
            fArr[i7 + 3] = f39;
            fArr[i7 + 4] = f41;
            fArr[i7 + 5] = f32;
            fArr[i7 + 6] = f33;
            fArr[i7 + 7] = f44;
            fArr[i7 + 8] = f39;
            fArr[i7 + 9] = f43;
            fArr[i7 + 10] = f34;
            fArr[i7 + 11] = f35;
            fArr[i7 + 12] = f44;
            fArr[i7 + 13] = f42;
            fArr[i7 + 14] = f43;
            fArr[i7 + 15] = f36;
            fArr[i7 + 16] = f37;
            fArr[i7 + 17] = f44;
            fArr[i7 + 18] = f42;
            fArr[i7 + 19] = f41;
            this.vertexIndex = i7 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i5 = this.triangleIndex;
            int i6 = this.vertexIndex;
            int i7 = i6 / 5;
            short s = (short) i7;
            sArr[i5] = s;
            sArr[i5 + 1] = (short) (i7 + 1);
            short s2 = (short) (i7 + 2);
            sArr[i5 + 2] = s2;
            sArr[i5 + 3] = s2;
            sArr[i5 + 4] = (short) (i7 + 3);
            sArr[i5 + 5] = s;
            this.triangleIndex = i5 + 6;
            float f5 = this.invTexWidth;
            float f6 = i * f5;
            float f7 = this.invTexHeight;
            float f8 = (i2 + i4) * f7;
            float f9 = (i + i3) * f5;
            float f10 = i2 * f7;
            float f11 = f + f3;
            float f12 = f2 + f4;
            if (z) {
                f6 = f9;
                f9 = f6;
            }
            if (z2) {
                f8 = f10;
                f10 = f8;
            }
            float f13 = this.colorPacked;
            fArr[i6] = f;
            fArr[i6 + 1] = f2;
            fArr[i6 + 2] = f13;
            fArr[i6 + 3] = f6;
            fArr[i6 + 4] = f8;
            fArr[i6 + 5] = f;
            fArr[i6 + 6] = f12;
            fArr[i6 + 7] = f13;
            fArr[i6 + 8] = f6;
            fArr[i6 + 9] = f10;
            fArr[i6 + 10] = f11;
            fArr[i6 + 11] = f12;
            fArr[i6 + 12] = f13;
            fArr[i6 + 13] = f9;
            fArr[i6 + 14] = f10;
            fArr[i6 + 15] = f11;
            fArr[i6 + 16] = f2;
            fArr[i6 + 17] = f13;
            fArr[i6 + 18] = f9;
            fArr[i6 + 19] = f8;
            this.vertexIndex = i6 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, int i, int i2, int i3, int i4) {
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i5 = this.triangleIndex;
            int i6 = this.vertexIndex;
            int i7 = i6 / 5;
            short s = (short) i7;
            sArr[i5] = s;
            sArr[i5 + 1] = (short) (i7 + 1);
            short s2 = (short) (i7 + 2);
            sArr[i5 + 2] = s2;
            sArr[i5 + 3] = s2;
            sArr[i5 + 4] = (short) (i7 + 3);
            sArr[i5 + 5] = s;
            this.triangleIndex = i5 + 6;
            float f3 = this.invTexWidth;
            float f4 = i * f3;
            float f5 = this.invTexHeight;
            float f6 = (i2 + i4) * f5;
            float f7 = (i + i3) * f3;
            float f8 = i2 * f5;
            float f9 = i3 + f;
            float f10 = i4 + f2;
            float f11 = this.colorPacked;
            fArr[i6] = f;
            fArr[i6 + 1] = f2;
            fArr[i6 + 2] = f11;
            fArr[i6 + 3] = f4;
            fArr[i6 + 4] = f6;
            fArr[i6 + 5] = f;
            fArr[i6 + 6] = f10;
            fArr[i6 + 7] = f11;
            fArr[i6 + 8] = f4;
            fArr[i6 + 9] = f8;
            fArr[i6 + 10] = f9;
            fArr[i6 + 11] = f10;
            fArr[i6 + 12] = f11;
            fArr[i6 + 13] = f7;
            fArr[i6 + 14] = f8;
            fArr[i6 + 15] = f9;
            fArr[i6 + 16] = f2;
            fArr[i6 + 17] = f11;
            fArr[i6 + 18] = f7;
            fArr[i6 + 19] = f6;
            this.vertexIndex = i6 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i = this.triangleIndex;
            int i2 = this.vertexIndex;
            int i3 = i2 / 5;
            short s = (short) i3;
            sArr[i] = s;
            sArr[i + 1] = (short) (i3 + 1);
            short s2 = (short) (i3 + 2);
            sArr[i + 2] = s2;
            sArr[i + 3] = s2;
            sArr[i + 4] = (short) (i3 + 3);
            sArr[i + 5] = s;
            this.triangleIndex = i + 6;
            float f9 = f + f3;
            float f10 = f2 + f4;
            float f11 = this.colorPacked;
            fArr[i2] = f;
            fArr[i2 + 1] = f2;
            fArr[i2 + 2] = f11;
            fArr[i2 + 3] = f5;
            fArr[i2 + 4] = f6;
            fArr[i2 + 5] = f;
            fArr[i2 + 6] = f10;
            fArr[i2 + 7] = f11;
            fArr[i2 + 8] = f5;
            fArr[i2 + 9] = f8;
            fArr[i2 + 10] = f9;
            fArr[i2 + 11] = f10;
            fArr[i2 + 12] = f11;
            fArr[i2 + 13] = f7;
            fArr[i2 + 14] = f8;
            fArr[i2 + 15] = f9;
            fArr[i2 + 16] = f2;
            fArr[i2 + 17] = f11;
            fArr[i2 + 18] = f7;
            fArr[i2 + 19] = f6;
            this.vertexIndex = i2 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2) {
        draw(texture, f, f2, texture.getWidth(), texture.getHeight());
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float f, float f2, float f3, float f4) {
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i = this.triangleIndex;
            int i2 = this.vertexIndex;
            int i3 = i2 / 5;
            short s = (short) i3;
            sArr[i] = s;
            sArr[i + 1] = (short) (i3 + 1);
            short s2 = (short) (i3 + 2);
            sArr[i + 2] = s2;
            sArr[i + 3] = s2;
            sArr[i + 4] = (short) (i3 + 3);
            sArr[i + 5] = s;
            this.triangleIndex = i + 6;
            float f5 = f3 + f;
            float f6 = f4 + f2;
            float f7 = this.colorPacked;
            fArr[i2] = f;
            fArr[i2 + 1] = f2;
            fArr[i2 + 2] = f7;
            fArr[i2 + 3] = 0.0f;
            fArr[i2 + 4] = 1.0f;
            fArr[i2 + 5] = f;
            fArr[i2 + 6] = f6;
            fArr[i2 + 7] = f7;
            fArr[i2 + 8] = 0.0f;
            fArr[i2 + 9] = 0.0f;
            fArr[i2 + 10] = f5;
            fArr[i2 + 11] = f6;
            fArr[i2 + 12] = f7;
            fArr[i2 + 13] = 1.0f;
            fArr[i2 + 14] = 0.0f;
            fArr[i2 + 15] = f5;
            fArr[i2 + 16] = f2;
            fArr[i2 + 17] = f7;
            fArr[i2 + 18] = 1.0f;
            fArr[i2 + 19] = 1.0f;
            this.vertexIndex = i2 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b A[LOOP:0: B:16:0x0059->B:17:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[SYNTHETIC] */
    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(Texture texture, float[] fArr, int i, int i2) {
        int iMin;
        int i3;
        int i4;
        short s;
        int i5;
        int i6;
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr2 = this.vertices;
            int i7 = (i2 / 20) * 6;
            if (texture != this.lastTexture) {
                switchTexture(texture);
                iMin = Math.min(Math.min(i2, fArr2.length - (fArr2.length % 20)), (sArr.length / 6) * 20);
                i3 = iMin / 20;
            } else {
                if (this.triangleIndex + i7 > sArr.length || this.vertexIndex + i2 > fArr2.length) {
                    flush();
                    iMin = Math.min(Math.min(i2, fArr2.length - (fArr2.length % 20)), (sArr.length / 6) * 20);
                    i3 = iMin / 20;
                } else {
                    iMin = i2;
                }
                i4 = this.vertexIndex;
                s = (short) (i4 / 5);
                i5 = this.triangleIndex;
                i6 = i7 + i5;
                while (i5 < i6) {
                    sArr[i5] = s;
                    sArr[i5 + 1] = (short) (s + 1);
                    short s2 = (short) (s + 2);
                    sArr[i5 + 2] = s2;
                    sArr[i5 + 3] = s2;
                    sArr[i5 + 4] = (short) (s + 3);
                    sArr[i5 + 5] = s;
                    i5 += 6;
                    s = (short) (s + 4);
                }
                while (true) {
                    System.arraycopy(fArr, i, fArr2, i4, iMin);
                    this.vertexIndex = i4 + iMin;
                    this.triangleIndex = i5;
                    i2 -= iMin;
                    if (i2 == 0) {
                        return;
                    }
                    i += iMin;
                    flush();
                    i4 = 0;
                    if (iMin > i2) {
                        iMin = Math.min(i2, (sArr.length / 6) * 20);
                        i5 = (iMin / 20) * 6;
                    }
                }
            }
            i7 = i3 * 6;
            i4 = this.vertexIndex;
            s = (short) (i4 / 5);
            i5 = this.triangleIndex;
            i6 = i7 + i5;
            while (i5 < i6) {
                sArr[i5] = s;
                sArr[i5 + 1] = (short) (s + 1);
                short s3 = (short) (s + 2);
                sArr[i5 + 2] = s3;
                sArr[i5 + 3] = s3;
                sArr[i5 + 4] = (short) (s + 3);
                sArr[i5 + 5] = s;
                i5 += 6;
                s = (short) (s + 4);
            }
            while (true) {
                System.arraycopy(fArr, i, fArr2, i4, iMin);
                this.vertexIndex = i4 + iMin;
                this.triangleIndex = i5;
                i2 -= iMin;
                if (i2 == 0) {
                    return;
                }
                i += iMin;
                flush();
                i4 = 0;
                if (iMin > i2) {
                    iMin = Math.min(i2, (sArr.length / 6) * 20);
                    i5 = (iMin / 20) * 6;
                }
            }
        } else {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2) {
        draw(textureRegion, f, f2, textureRegion.getRegionWidth(), textureRegion.getRegionHeight());
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2, float f3, float f4) {
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            Texture texture = textureRegion.texture;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i = this.triangleIndex;
            int i2 = this.vertexIndex;
            int i3 = i2 / 5;
            short s = (short) i3;
            sArr[i] = s;
            sArr[i + 1] = (short) (i3 + 1);
            short s2 = (short) (i3 + 2);
            sArr[i + 2] = s2;
            sArr[i + 3] = s2;
            sArr[i + 4] = (short) (i3 + 3);
            sArr[i + 5] = s;
            this.triangleIndex = i + 6;
            float f5 = f3 + f;
            float f6 = f4 + f2;
            float f7 = textureRegion.u;
            float f8 = textureRegion.v2;
            float f9 = textureRegion.u2;
            float f10 = textureRegion.v;
            float f11 = this.colorPacked;
            fArr[i2] = f;
            fArr[i2 + 1] = f2;
            fArr[i2 + 2] = f11;
            fArr[i2 + 3] = f7;
            fArr[i2 + 4] = f8;
            fArr[i2 + 5] = f;
            fArr[i2 + 6] = f6;
            fArr[i2 + 7] = f11;
            fArr[i2 + 8] = f7;
            fArr[i2 + 9] = f10;
            fArr[i2 + 10] = f5;
            fArr[i2 + 11] = f6;
            fArr[i2 + 12] = f11;
            fArr[i2 + 13] = f9;
            fArr[i2 + 14] = f10;
            fArr[i2 + 15] = f5;
            fArr[i2 + 16] = f2;
            fArr[i2 + 17] = f11;
            fArr[i2 + 18] = f9;
            fArr[i2 + 19] = f8;
            this.vertexIndex = i2 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            Texture texture = textureRegion.texture;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i = this.triangleIndex;
            int i2 = this.vertexIndex / 5;
            short s = (short) i2;
            sArr[i] = s;
            sArr[i + 1] = (short) (i2 + 1);
            short s2 = (short) (i2 + 2);
            sArr[i + 2] = s2;
            sArr[i + 3] = s2;
            sArr[i + 4] = (short) (i2 + 3);
            sArr[i + 5] = s;
            this.triangleIndex = i + 6;
            float f17 = f + f3;
            float f18 = f2 + f4;
            float f19 = -f3;
            float f20 = -f4;
            float f21 = f5 - f3;
            float f22 = f6 - f4;
            if (f7 != 1.0f || f8 != 1.0f) {
                f19 *= f7;
                f20 *= f8;
                f21 *= f7;
                f22 *= f8;
            }
            if (f9 != 0.0f) {
                float fCosDeg = MathUtils.cosDeg(f9);
                float fSinDeg = MathUtils.sinDeg(f9);
                float f23 = fCosDeg * f19;
                f11 = f23 - (fSinDeg * f20);
                float f24 = f19 * fSinDeg;
                float f25 = (f20 * fCosDeg) + f24;
                float f26 = fSinDeg * f22;
                f10 = f23 - f26;
                float f27 = f22 * fCosDeg;
                f14 = f24 + f27;
                float f28 = (fCosDeg * f21) - f26;
                float f29 = f27 + (fSinDeg * f21);
                f13 = f29 - (f14 - f25);
                f16 = (f28 - f10) + f11;
                f21 = f28;
                f12 = f25;
                f15 = f29;
            } else {
                f10 = f19;
                f11 = f10;
                f12 = f20;
                f13 = f12;
                f14 = f22;
                f15 = f14;
                f16 = f21;
            }
            float f30 = f11 + f17;
            float f31 = f12 + f18;
            float f32 = f10 + f17;
            float f33 = f14 + f18;
            float f34 = f21 + f17;
            float f35 = f15 + f18;
            float f36 = f16 + f17;
            float f37 = f13 + f18;
            float f38 = textureRegion.u;
            float f39 = textureRegion.v2;
            float f40 = textureRegion.u2;
            float f41 = textureRegion.v;
            float f42 = this.colorPacked;
            int i3 = this.vertexIndex;
            fArr[i3] = f30;
            fArr[i3 + 1] = f31;
            fArr[i3 + 2] = f42;
            fArr[i3 + 3] = f38;
            fArr[i3 + 4] = f39;
            fArr[i3 + 5] = f32;
            fArr[i3 + 6] = f33;
            fArr[i3 + 7] = f42;
            fArr[i3 + 8] = f38;
            fArr[i3 + 9] = f41;
            fArr[i3 + 10] = f34;
            fArr[i3 + 11] = f35;
            fArr[i3 + 12] = f42;
            fArr[i3 + 13] = f40;
            fArr[i3 + 14] = f41;
            fArr[i3 + 15] = f36;
            fArr[i3 + 16] = f37;
            fArr[i3 + 17] = f42;
            fArr[i3 + 18] = f40;
            fArr[i3 + 19] = f39;
            this.vertexIndex = i3 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z) {
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
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            Texture texture = textureRegion.texture;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i = this.triangleIndex;
            int i2 = this.vertexIndex / 5;
            short s = (short) i2;
            sArr[i] = s;
            sArr[i + 1] = (short) (i2 + 1);
            short s2 = (short) (i2 + 2);
            sArr[i + 2] = s2;
            sArr[i + 3] = s2;
            sArr[i + 4] = (short) (i2 + 3);
            sArr[i + 5] = s;
            this.triangleIndex = i + 6;
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
            float f46 = this.colorPacked;
            int i3 = this.vertexIndex;
            fArr[i3] = f34;
            fArr[i3 + 1] = f35;
            fArr[i3 + 2] = f46;
            fArr[i3 + 3] = f45;
            fArr[i3 + 4] = f43;
            fArr[i3 + 5] = f36;
            fArr[i3 + 6] = f37;
            fArr[i3 + 7] = f46;
            fArr[i3 + 8] = f44;
            fArr[i3 + 9] = f43;
            fArr[i3 + 10] = f38;
            fArr[i3 + 11] = f39;
            fArr[i3 + 12] = f46;
            fArr[i3 + 13] = f44;
            fArr[i3 + 14] = f20;
            fArr[i3 + 15] = f40;
            fArr[i3 + 16] = f41;
            fArr[i3 + 17] = f46;
            fArr[i3 + 18] = f45;
            fArr[i3 + 19] = f42;
            this.vertexIndex = i3 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }

    @Override // com.badlogic.gdx.graphics.g2d.Batch
    public void draw(TextureRegion textureRegion, float f, float f2, Affine2 affine2) {
        if (this.drawing) {
            short[] sArr = this.triangles;
            float[] fArr = this.vertices;
            Texture texture = textureRegion.texture;
            if (texture != this.lastTexture) {
                switchTexture(texture);
            } else if (this.triangleIndex + 6 > sArr.length || this.vertexIndex + 20 > fArr.length) {
                flush();
            }
            int i = this.triangleIndex;
            int i2 = this.vertexIndex;
            int i3 = i2 / 5;
            short s = (short) i3;
            sArr[i] = s;
            sArr[i + 1] = (short) (i3 + 1);
            short s2 = (short) (i3 + 2);
            sArr[i + 2] = s2;
            sArr[i + 3] = s2;
            sArr[i + 4] = (short) (i3 + 3);
            sArr[i + 5] = s;
            this.triangleIndex = i + 6;
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
            float f11 = textureRegion.u;
            float f12 = textureRegion.v2;
            float f13 = textureRegion.u2;
            float f14 = textureRegion.v;
            float f15 = this.colorPacked;
            fArr[i2] = f3;
            fArr[i2 + 1] = f4;
            fArr[i2 + 2] = f15;
            fArr[i2 + 3] = f11;
            fArr[i2 + 4] = f12;
            fArr[i2 + 5] = f6;
            fArr[i2 + 6] = f8;
            fArr[i2 + 7] = f15;
            fArr[i2 + 8] = f11;
            fArr[i2 + 9] = f14;
            fArr[i2 + 10] = fD;
            fArr[i2 + 11] = fD2;
            fArr[i2 + 12] = f15;
            fArr[i2 + 13] = f13;
            fArr[i2 + 14] = f14;
            fArr[i2 + 15] = (f9 * f) + f3;
            fArr[i2 + 16] = (f10 * f) + f4;
            fArr[i2 + 17] = f15;
            fArr[i2 + 18] = f13;
            fArr[i2 + 19] = f12;
            this.vertexIndex = i2 + 20;
            return;
        }
        throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
    }
}
