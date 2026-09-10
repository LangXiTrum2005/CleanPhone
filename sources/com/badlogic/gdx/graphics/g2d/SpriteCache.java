package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.IntArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public class SpriteCache implements Disposable {
    private static final float[] tempVertices = new float[30];
    private Array<Cache> caches;
    private final Color color;
    private float colorPacked;
    private final Matrix4 combinedMatrix;
    private final IntArray counts;
    private Cache currentCache;
    private ShaderProgram customShader;
    private boolean drawing;
    private final Mesh mesh;
    private final Matrix4 projectionMatrix;
    public int renderCalls;
    private final ShaderProgram shader;
    private final Array<Texture> textures;
    public int totalRenderCalls;
    private final Matrix4 transformMatrix;

    public static class Cache {
        int[] counts;
        final int id;
        int maxCount;
        final int offset;
        int textureCount;
        Texture[] textures;

        public Cache(int i, int i2) {
            this.id = i;
            this.offset = i2;
        }
    }

    public SpriteCache() {
        this(1000, false);
    }

    public static ShaderProgram createDefaultShader() {
        ShaderProgram shaderProgram = new ShaderProgram("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projectionViewMatrix;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projectionViewMatrix * a_position;\n}\n", "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}");
        if (shaderProgram.isCompiled()) {
            return shaderProgram;
        }
        throw new IllegalArgumentException("Error compiling shader: " + shaderProgram.getLog());
    }

    public void add(Texture texture, float[] fArr, int i, int i2) {
        if (this.currentCache == null) {
            throw new IllegalStateException("beginCache must be called before add.");
        }
        int i3 = (i2 / ((this.mesh.getNumIndices() > 0 ? 4 : 6) * 5)) * 6;
        Array<Texture> array = this.textures;
        int i4 = array.size - 1;
        if (i4 < 0 || array.get(i4) != texture) {
            this.textures.add(texture);
            this.counts.add(i3);
        } else {
            this.counts.incr(i4, i3);
        }
        this.mesh.getVerticesBuffer(true).put(fArr, i, i2);
    }

    public void begin() {
        if (this.drawing) {
            throw new IllegalStateException("end must be called before begin.");
        }
        if (this.currentCache != null) {
            throw new IllegalStateException("endCache must be called before begin");
        }
        this.renderCalls = 0;
        this.combinedMatrix.set(this.projectionMatrix).mul(this.transformMatrix);
        Gdx.gl20.glDepthMask(false);
        ShaderProgram shaderProgram = this.customShader;
        if (shaderProgram != null) {
            shaderProgram.bind();
            this.customShader.setUniformMatrix("u_proj", this.projectionMatrix);
            this.customShader.setUniformMatrix("u_trans", this.transformMatrix);
            this.customShader.setUniformMatrix("u_projTrans", this.combinedMatrix);
            this.customShader.setUniformi("u_texture", 0);
            this.mesh.bind(this.customShader);
        } else {
            this.shader.bind();
            this.shader.setUniformMatrix("u_projectionViewMatrix", this.combinedMatrix);
            this.shader.setUniformi("u_texture", 0);
            this.mesh.bind(this.shader);
        }
        this.drawing = true;
    }

    public void beginCache() {
        if (this.drawing) {
            throw new IllegalStateException("end must be called before beginCache");
        }
        if (this.currentCache != null) {
            throw new IllegalStateException("endCache must be called before begin.");
        }
        this.mesh.getNumIndices();
        FloatBuffer verticesBuffer = this.mesh.getVerticesBuffer(true);
        Cache cache = new Cache(this.caches.size, verticesBuffer.limit());
        this.currentCache = cache;
        this.caches.add(cache);
        verticesBuffer.compact();
    }

    public void clear() {
        this.caches.clear();
        this.mesh.getVerticesBuffer(true).clear().flip();
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.mesh.dispose();
        ShaderProgram shaderProgram = this.shader;
        if (shaderProgram != null) {
            shaderProgram.dispose();
        }
    }

    public void draw(int i) {
        if (!this.drawing) {
            throw new IllegalStateException("SpriteCache.begin must be called before draw.");
        }
        Cache cache = this.caches.get(i);
        int i2 = (cache.offset / ((this.mesh.getNumIndices() > 0 ? 4 : 6) * 5)) * 6;
        Texture[] textureArr = cache.textures;
        int[] iArr = cache.counts;
        int i3 = cache.textureCount;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            textureArr[i4].bind();
            ShaderProgram shaderProgram = this.customShader;
            if (shaderProgram != null) {
                this.mesh.render(shaderProgram, 4, i2, i5);
            } else {
                this.mesh.render(this.shader, 4, i2, i5);
            }
            i2 += i5;
        }
        this.renderCalls += i3;
        this.totalRenderCalls += i3;
    }

    public void end() {
        if (!this.drawing) {
            throw new IllegalStateException("begin must be called before end.");
        }
        this.drawing = false;
        Gdx.gl20.glDepthMask(true);
        ShaderProgram shaderProgram = this.customShader;
        if (shaderProgram != null) {
            this.mesh.unbind(shaderProgram);
        } else {
            this.mesh.unbind(this.shader);
        }
    }

    public int endCache() {
        Cache cache = this.currentCache;
        if (cache == null) {
            throw new IllegalStateException("beginCache must be called before endCache.");
        }
        int iPosition = this.mesh.getVerticesBuffer(false).position() - cache.offset;
        Texture[] textureArr = cache.textures;
        if (textureArr == null) {
            cache.maxCount = iPosition;
            Array<Texture> array = this.textures;
            cache.textureCount = array.size;
            cache.textures = (Texture[]) array.toArray(Texture.class);
            cache.counts = new int[cache.textureCount];
            int i = this.counts.size;
            for (int i2 = 0; i2 < i; i2++) {
                cache.counts[i2] = this.counts.get(i2);
            }
            this.mesh.getVerticesBuffer(true).flip();
        } else {
            if (iPosition > cache.maxCount) {
                throw new GdxRuntimeException(AbstractC5044xl.o(AbstractC5044xl.q("If a cache is not the last created, it cannot be redefined with more entries than when it was first created: ", iPosition, " ("), cache.maxCount, " max)"));
            }
            int i3 = this.textures.size;
            cache.textureCount = i3;
            if (textureArr.length < i3) {
                cache.textures = new Texture[i3];
            }
            for (int i4 = 0; i4 < i3; i4++) {
                cache.textures[i4] = this.textures.get(i4);
            }
            int length = cache.counts.length;
            int i5 = cache.textureCount;
            if (length < i5) {
                cache.counts = new int[i5];
            }
            for (int i6 = 0; i6 < i5; i6++) {
                cache.counts[i6] = this.counts.get(i6);
            }
            FloatBuffer verticesBuffer = this.mesh.getVerticesBuffer(true);
            verticesBuffer.position(0);
            Array<Cache> array2 = this.caches;
            Cache cache2 = array2.get(array2.size - 1);
            verticesBuffer.limit(cache2.offset + cache2.maxCount);
        }
        this.currentCache = null;
        this.textures.clear();
        this.counts.clear();
        return cache.id;
    }

    public Color getColor() {
        return this.color;
    }

    public ShaderProgram getCustomShader() {
        return this.customShader;
    }

    public float getPackedColor() {
        return this.colorPacked;
    }

    public Matrix4 getProjectionMatrix() {
        return this.projectionMatrix;
    }

    public Matrix4 getTransformMatrix() {
        return this.transformMatrix;
    }

    public boolean isDrawing() {
        return this.drawing;
    }

    public void setColor(Color color) {
        this.color.set(color);
        this.colorPacked = color.toFloatBits();
    }

    public void setPackedColor(float f) {
        Color.abgr8888ToColor(this.color, f);
        this.colorPacked = f;
    }

    public void setProjectionMatrix(Matrix4 matrix4) {
        if (this.drawing) {
            throw new IllegalStateException("Can't set the matrix within begin/end.");
        }
        this.projectionMatrix.set(matrix4);
    }

    public void setShader(ShaderProgram shaderProgram) {
        this.customShader = shaderProgram;
    }

    public void setTransformMatrix(Matrix4 matrix4) {
        if (this.drawing) {
            throw new IllegalStateException("Can't set the matrix within begin/end.");
        }
        this.transformMatrix.set(matrix4);
    }

    public SpriteCache(int i, boolean z) {
        this(i, createDefaultShader(), z);
    }

    public SpriteCache(int i, ShaderProgram shaderProgram, boolean z) {
        this.transformMatrix = new Matrix4();
        this.projectionMatrix = new Matrix4();
        this.caches = new Array<>();
        this.combinedMatrix = new Matrix4();
        this.textures = new Array<>(8);
        this.counts = new IntArray(8);
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.colorPacked = Color.WHITE_FLOAT_BITS;
        this.customShader = null;
        int i2 = 0;
        this.renderCalls = 0;
        this.totalRenderCalls = 0;
        this.shader = shaderProgram;
        if (z && i > 8191) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("Can't have more than 8191 sprites per batch: ", i));
        }
        Mesh mesh = new Mesh(true, (z ? 4 : 6) * i, z ? i * 6 : 0, new VertexAttribute(1, 2, ShaderProgram.POSITION_ATTRIBUTE), new VertexAttribute(4, 4, ShaderProgram.COLOR_ATTRIBUTE), new VertexAttribute(16, 2, "a_texCoord0"));
        this.mesh = mesh;
        mesh.setAutoBind(false);
        if (z) {
            int i3 = i * 6;
            short[] sArr = new short[i3];
            short s = 0;
            while (i2 < i3) {
                sArr[i2] = s;
                sArr[i2 + 1] = (short) (s + 1);
                short s2 = (short) (s + 2);
                sArr[i2 + 2] = s2;
                sArr[i2 + 3] = s2;
                sArr[i2 + 4] = (short) (s + 3);
                sArr[i2 + 5] = s;
                i2 += 6;
                s = (short) (s + 4);
            }
            this.mesh.setIndices(sArr);
        }
        this.projectionMatrix.setToOrtho2D(0.0f, 0.0f, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    public void setColor(float f, float f2, float f3, float f4) {
        this.color.set(f, f2, f3, f4);
        this.colorPacked = this.color.toFloatBits();
    }

    public void beginCache(int i) {
        if (!this.drawing) {
            if (this.currentCache == null) {
                FloatBuffer verticesBuffer = this.mesh.getVerticesBuffer(true);
                Array<Cache> array = this.caches;
                if (i == array.size - 1) {
                    verticesBuffer.limit(array.removeIndex(i).offset);
                    beginCache();
                    return;
                } else {
                    Cache cache = array.get(i);
                    this.currentCache = cache;
                    verticesBuffer.position(cache.offset);
                    return;
                }
            }
            throw new IllegalStateException("endCache must be called before begin.");
        }
        throw new IllegalStateException("end must be called before beginCache");
    }

    public void add(Texture texture, float f, float f2) {
        float width = f + texture.getWidth();
        float height = f2 + texture.getHeight();
        float[] fArr = tempVertices;
        fArr[0] = f;
        fArr[1] = f2;
        float f3 = this.colorPacked;
        fArr[2] = f3;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = f;
        fArr[6] = height;
        fArr[7] = f3;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = width;
        fArr[11] = height;
        fArr[12] = f3;
        fArr[13] = 1.0f;
        fArr[14] = 0.0f;
        if (this.mesh.getNumIndices() > 0) {
            fArr[15] = width;
            fArr[16] = f2;
            fArr[17] = this.colorPacked;
            fArr[18] = 1.0f;
            fArr[19] = 1.0f;
            add(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = width;
        fArr[16] = height;
        float f4 = this.colorPacked;
        fArr[17] = f4;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[20] = width;
        fArr[21] = f2;
        fArr[22] = f4;
        fArr[23] = 1.0f;
        fArr[24] = 1.0f;
        fArr[25] = f;
        fArr[26] = f2;
        fArr[27] = f4;
        fArr[28] = 0.0f;
        fArr[29] = 1.0f;
        add(texture, fArr, 0, 30);
    }

    public void draw(int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.drawing) {
            Cache cache = this.caches.get(i);
            int i6 = (i2 * 6) + ((cache.offset / ((this.mesh.getNumIndices() > 0 ? 4 : 6) * 5)) * 6);
            int i7 = i3 * 6;
            Texture[] textureArr = cache.textures;
            int[] iArr = cache.counts;
            int i8 = cache.textureCount;
            int i9 = 0;
            while (i9 < i8) {
                textureArr[i9].bind();
                int i10 = iArr[i9];
                if (i10 > i7) {
                    i4 = i7;
                    i5 = i8;
                } else {
                    int i11 = i9;
                    i4 = i7 - i10;
                    i7 = i10;
                    i5 = i11;
                }
                ShaderProgram shaderProgram = this.customShader;
                if (shaderProgram != null) {
                    this.mesh.render(shaderProgram, 4, i6, i7);
                } else {
                    this.mesh.render(this.shader, 4, i6, i7);
                }
                i6 += i7;
                int i12 = i4;
                i9 = i5 + 1;
                i7 = i12;
            }
            this.renderCalls += cache.textureCount;
            this.totalRenderCalls += i8;
            return;
        }
        throw new IllegalStateException("SpriteCache.begin must be called before draw.");
    }

    public void add(Texture texture, float f, float f2, int i, int i2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = i + f;
        float f9 = f2 + i2;
        float[] fArr = tempVertices;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f7;
        fArr[3] = f3;
        fArr[4] = f4;
        fArr[5] = f;
        fArr[6] = f9;
        fArr[7] = f7;
        fArr[8] = f3;
        fArr[9] = f6;
        fArr[10] = f8;
        fArr[11] = f9;
        fArr[12] = f7;
        fArr[13] = f5;
        fArr[14] = f6;
        if (this.mesh.getNumIndices() > 0) {
            fArr[15] = f8;
            fArr[16] = f2;
            fArr[17] = f7;
            fArr[18] = f5;
            fArr[19] = f4;
            add(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f8;
        fArr[16] = f9;
        fArr[17] = f7;
        fArr[18] = f5;
        fArr[19] = f6;
        fArr[20] = f8;
        fArr[21] = f2;
        fArr[22] = f7;
        fArr[23] = f5;
        fArr[24] = f4;
        fArr[25] = f;
        fArr[26] = f2;
        fArr[27] = f7;
        fArr[28] = f3;
        fArr[29] = f4;
        add(texture, fArr, 0, 30);
    }

    public void add(Texture texture, float f, float f2, int i, int i2, int i3, int i4) {
        float width = 1.0f / texture.getWidth();
        float height = 1.0f / texture.getHeight();
        float f3 = i * width;
        float f4 = (i2 + i4) * height;
        float f5 = (i + i3) * width;
        float f6 = i2 * height;
        float f7 = f + i3;
        float f8 = f2 + i4;
        float[] fArr = tempVertices;
        fArr[0] = f;
        fArr[1] = f2;
        float f9 = this.colorPacked;
        fArr[2] = f9;
        fArr[3] = f3;
        fArr[4] = f4;
        fArr[5] = f;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f3;
        fArr[9] = f6;
        fArr[10] = f7;
        fArr[11] = f8;
        fArr[12] = f9;
        fArr[13] = f5;
        fArr[14] = f6;
        if (this.mesh.getNumIndices() > 0) {
            fArr[15] = f7;
            fArr[16] = f2;
            fArr[17] = this.colorPacked;
            fArr[18] = f5;
            fArr[19] = f4;
            add(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f7;
        fArr[16] = f8;
        float f10 = this.colorPacked;
        fArr[17] = f10;
        fArr[18] = f5;
        fArr[19] = f6;
        fArr[20] = f7;
        fArr[21] = f2;
        fArr[22] = f10;
        fArr[23] = f5;
        fArr[24] = f4;
        fArr[25] = f;
        fArr[26] = f2;
        fArr[27] = f10;
        fArr[28] = f3;
        fArr[29] = f4;
        add(texture, fArr, 0, 30);
    }

    public void add(Texture texture, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float width = 1.0f / texture.getWidth();
        float height = 1.0f / texture.getHeight();
        float f5 = i * width;
        float f6 = (i2 + i4) * height;
        float f7 = (i + i3) * width;
        float f8 = i2 * height;
        float f9 = f + f3;
        float f10 = f2 + f4;
        if (!z) {
            f5 = f7;
            f7 = f5;
        }
        if (z2) {
            f6 = f8;
            f8 = f6;
        }
        float[] fArr = tempVertices;
        fArr[0] = f;
        fArr[1] = f2;
        float f11 = this.colorPacked;
        fArr[2] = f11;
        fArr[3] = f7;
        fArr[4] = f6;
        fArr[5] = f;
        fArr[6] = f10;
        fArr[7] = f11;
        fArr[8] = f7;
        fArr[9] = f8;
        fArr[10] = f9;
        fArr[11] = f10;
        fArr[12] = f11;
        fArr[13] = f5;
        fArr[14] = f8;
        if (this.mesh.getNumIndices() > 0) {
            fArr[15] = f9;
            fArr[16] = f2;
            fArr[17] = this.colorPacked;
            fArr[18] = f5;
            fArr[19] = f6;
            add(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f9;
        fArr[16] = f10;
        float f12 = this.colorPacked;
        fArr[17] = f12;
        fArr[18] = f5;
        fArr[19] = f8;
        fArr[20] = f9;
        fArr[21] = f2;
        fArr[22] = f12;
        fArr[23] = f5;
        fArr[24] = f6;
        fArr[25] = f;
        fArr[26] = f2;
        fArr[27] = f12;
        fArr[28] = f7;
        fArr[29] = f6;
        add(texture, fArr, 0, 30);
    }

    public void add(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
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
        float width = 1.0f / texture.getWidth();
        float height = 1.0f / texture.getHeight();
        float f38 = i * width;
        float f39 = (i2 + i4) * height;
        float f40 = (i + i3) * width;
        float f41 = i2 * height;
        if (z) {
            f38 = f40;
            f40 = f38;
        }
        if (z2) {
            f39 = f41;
            f41 = f39;
        }
        float[] fArr = tempVertices;
        fArr[0] = f30;
        fArr[1] = f31;
        float f42 = this.colorPacked;
        fArr[2] = f42;
        fArr[3] = f38;
        fArr[4] = f39;
        fArr[5] = f32;
        fArr[6] = f33;
        fArr[7] = f42;
        fArr[8] = f38;
        fArr[9] = f41;
        fArr[10] = f34;
        fArr[11] = f35;
        fArr[12] = f42;
        fArr[13] = f40;
        fArr[14] = f41;
        if (this.mesh.getNumIndices() > 0) {
            fArr[15] = f36;
            fArr[16] = f37;
            fArr[17] = this.colorPacked;
            fArr[18] = f40;
            fArr[19] = f39;
            add(texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f34;
        fArr[16] = f35;
        float f43 = this.colorPacked;
        fArr[17] = f43;
        fArr[18] = f40;
        fArr[19] = f41;
        fArr[20] = f36;
        fArr[21] = f37;
        fArr[22] = f43;
        fArr[23] = f40;
        fArr[24] = f39;
        fArr[25] = f30;
        fArr[26] = f31;
        fArr[27] = f43;
        fArr[28] = f38;
        fArr[29] = f39;
        add(texture, fArr, 0, 30);
    }

    public void add(TextureRegion textureRegion, float f, float f2) {
        add(textureRegion, f, f2, textureRegion.getRegionWidth(), textureRegion.getRegionHeight());
    }

    public void add(TextureRegion textureRegion, float f, float f2, float f3, float f4) {
        float f5 = f + f3;
        float f6 = f2 + f4;
        float f7 = textureRegion.u;
        float f8 = textureRegion.v2;
        float f9 = textureRegion.u2;
        float f10 = textureRegion.v;
        float[] fArr = tempVertices;
        fArr[0] = f;
        fArr[1] = f2;
        float f11 = this.colorPacked;
        fArr[2] = f11;
        fArr[3] = f7;
        fArr[4] = f8;
        fArr[5] = f;
        fArr[6] = f6;
        fArr[7] = f11;
        fArr[8] = f7;
        fArr[9] = f10;
        fArr[10] = f5;
        fArr[11] = f6;
        fArr[12] = f11;
        fArr[13] = f9;
        fArr[14] = f10;
        if (this.mesh.getNumIndices() > 0) {
            fArr[15] = f5;
            fArr[16] = f2;
            fArr[17] = this.colorPacked;
            fArr[18] = f9;
            fArr[19] = f8;
            add(textureRegion.texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f5;
        fArr[16] = f6;
        float f12 = this.colorPacked;
        fArr[17] = f12;
        fArr[18] = f9;
        fArr[19] = f10;
        fArr[20] = f5;
        fArr[21] = f2;
        fArr[22] = f12;
        fArr[23] = f9;
        fArr[24] = f8;
        fArr[25] = f;
        fArr[26] = f2;
        fArr[27] = f12;
        fArr[28] = f7;
        fArr[29] = f8;
        add(textureRegion.texture, fArr, 0, 30);
    }

    public void add(TextureRegion textureRegion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
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
        float[] fArr = tempVertices;
        fArr[0] = f30;
        fArr[1] = f31;
        float f42 = this.colorPacked;
        fArr[2] = f42;
        fArr[3] = f38;
        fArr[4] = f39;
        fArr[5] = f32;
        fArr[6] = f33;
        fArr[7] = f42;
        fArr[8] = f38;
        fArr[9] = f41;
        fArr[10] = f34;
        fArr[11] = f35;
        fArr[12] = f42;
        fArr[13] = f40;
        fArr[14] = f41;
        if (this.mesh.getNumIndices() > 0) {
            fArr[15] = f36;
            fArr[16] = f37;
            fArr[17] = this.colorPacked;
            fArr[18] = f40;
            fArr[19] = f39;
            add(textureRegion.texture, fArr, 0, 20);
            return;
        }
        fArr[15] = f34;
        fArr[16] = f35;
        float f43 = this.colorPacked;
        fArr[17] = f43;
        fArr[18] = f40;
        fArr[19] = f41;
        fArr[20] = f36;
        fArr[21] = f37;
        fArr[22] = f43;
        fArr[23] = f40;
        fArr[24] = f39;
        fArr[25] = f30;
        fArr[26] = f31;
        fArr[27] = f43;
        fArr[28] = f38;
        fArr[29] = f39;
        add(textureRegion.texture, fArr, 0, 30);
    }

    public void add(Sprite sprite) {
        if (this.mesh.getNumIndices() > 0) {
            add(sprite.getTexture(), sprite.getVertices(), 0, 20);
            return;
        }
        float[] vertices = sprite.getVertices();
        float[] fArr = tempVertices;
        System.arraycopy(vertices, 0, fArr, 0, 15);
        System.arraycopy(vertices, 10, fArr, 15, 5);
        System.arraycopy(vertices, 15, fArr, 20, 5);
        System.arraycopy(vertices, 0, fArr, 25, 5);
        add(sprite.getTexture(), fArr, 0, 30);
    }
}
