package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.MipMapGenerator;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class GLTexture implements Disposable {
    private static float maxAnisotropicFilterLevel;
    protected float anisotropicFilterLevel;
    protected int glHandle;
    public final int glTarget;
    protected Texture.TextureFilter magFilter;
    protected Texture.TextureFilter minFilter;
    protected Texture.TextureWrap uWrap;
    protected Texture.TextureWrap vWrap;

    public GLTexture(int i) {
        this(i, Gdx.gl.glGenTexture());
    }

    public static float getMaxAnisotropicFilterLevel() {
        float f = maxAnisotropicFilterLevel;
        if (f > 0.0f) {
            return f;
        }
        if (!Gdx.graphics.supportsExtension("GL_EXT_texture_filter_anisotropic")) {
            maxAnisotropicFilterLevel = 1.0f;
            return 1.0f;
        }
        FloatBuffer floatBufferNewFloatBuffer = BufferUtils.newFloatBuffer(16);
        floatBufferNewFloatBuffer.position(0);
        floatBufferNewFloatBuffer.limit(floatBufferNewFloatBuffer.capacity());
        Gdx.gl20.glGetFloatv(GL20.GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT, floatBufferNewFloatBuffer);
        float f2 = floatBufferNewFloatBuffer.get(0);
        maxAnisotropicFilterLevel = f2;
        return f2;
    }

    public static void uploadImageData(int i, TextureData textureData) {
        uploadImageData(i, textureData, 0);
    }

    public void bind() {
        Gdx.gl.glBindTexture(this.glTarget, this.glHandle);
    }

    public void delete() {
        int i = this.glHandle;
        if (i != 0) {
            Gdx.gl.glDeleteTexture(i);
            this.glHandle = 0;
        }
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        delete();
    }

    public float getAnisotropicFilter() {
        return this.anisotropicFilterLevel;
    }

    public abstract int getDepth();

    public abstract int getHeight();

    public Texture.TextureFilter getMagFilter() {
        return this.magFilter;
    }

    public Texture.TextureFilter getMinFilter() {
        return this.minFilter;
    }

    public int getTextureObjectHandle() {
        return this.glHandle;
    }

    public Texture.TextureWrap getUWrap() {
        return this.uWrap;
    }

    public Texture.TextureWrap getVWrap() {
        return this.vWrap;
    }

    public abstract int getWidth();

    public abstract boolean isManaged();

    public abstract void reload();

    public float setAnisotropicFilter(float f) {
        float maxAnisotropicFilterLevel2 = getMaxAnisotropicFilterLevel();
        if (maxAnisotropicFilterLevel2 == 1.0f) {
            return 1.0f;
        }
        float fMin = Math.min(f, maxAnisotropicFilterLevel2);
        if (MathUtils.isEqual(fMin, this.anisotropicFilterLevel, 0.1f)) {
            return fMin;
        }
        bind();
        Gdx.gl20.glTexParameterf(GL20.GL_TEXTURE_2D, GL20.GL_TEXTURE_MAX_ANISOTROPY_EXT, fMin);
        this.anisotropicFilterLevel = fMin;
        return fMin;
    }

    public void setFilter(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2) {
        this.minFilter = textureFilter;
        this.magFilter = textureFilter2;
        bind();
        Gdx.gl.glTexParameteri(this.glTarget, GL20.GL_TEXTURE_MIN_FILTER, textureFilter.getGLEnum());
        Gdx.gl.glTexParameteri(this.glTarget, 10240, textureFilter2.getGLEnum());
    }

    public void setWrap(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.uWrap = textureWrap;
        this.vWrap = textureWrap2;
        bind();
        Gdx.gl.glTexParameteri(this.glTarget, GL20.GL_TEXTURE_WRAP_S, textureWrap.getGLEnum());
        Gdx.gl.glTexParameteri(this.glTarget, GL20.GL_TEXTURE_WRAP_T, textureWrap2.getGLEnum());
    }

    public float unsafeSetAnisotropicFilter(float f) {
        return unsafeSetAnisotropicFilter(f, false);
    }

    public void unsafeSetFilter(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2) {
        unsafeSetFilter(textureFilter, textureFilter2, false);
    }

    public void unsafeSetWrap(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        unsafeSetWrap(textureWrap, textureWrap2, false);
    }

    public GLTexture(int i, int i2) {
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
        this.minFilter = textureFilter;
        this.magFilter = textureFilter;
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        this.uWrap = textureWrap;
        this.vWrap = textureWrap;
        this.anisotropicFilterLevel = 1.0f;
        this.glTarget = i;
        this.glHandle = i2;
    }

    public static void uploadImageData(int i, TextureData textureData, int i2) {
        if (textureData == null) {
            return;
        }
        if (!textureData.isPrepared()) {
            textureData.prepare();
        }
        if (textureData.getType() == TextureData.TextureDataType.Custom) {
            textureData.consumeCustomData(i);
            return;
        }
        Pixmap pixmapConsumePixmap = textureData.consumePixmap();
        boolean zDisposePixmap = textureData.disposePixmap();
        if (textureData.getFormat() != pixmapConsumePixmap.getFormat()) {
            Pixmap pixmap = new Pixmap(pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight(), textureData.getFormat());
            pixmap.setBlending(Pixmap.Blending.None);
            pixmap.drawPixmap(pixmapConsumePixmap, 0, 0, 0, 0, pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight());
            if (textureData.disposePixmap()) {
                pixmapConsumePixmap.dispose();
            }
            pixmapConsumePixmap = pixmap;
            zDisposePixmap = true;
        }
        Gdx.gl.glPixelStorei(GL20.GL_UNPACK_ALIGNMENT, 1);
        if (textureData.useMipMaps()) {
            MipMapGenerator.generateMipMap(i, pixmapConsumePixmap, pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight());
        } else {
            Gdx.gl.glTexImage2D(i, i2, pixmapConsumePixmap.getGLInternalFormat(), pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight(), 0, pixmapConsumePixmap.getGLFormat(), pixmapConsumePixmap.getGLType(), pixmapConsumePixmap.getPixels());
        }
        if (zDisposePixmap) {
            pixmapConsumePixmap.dispose();
        }
    }

    public void bind(int i) {
        Gdx.gl.glActiveTexture(i + GL20.GL_TEXTURE0);
        Gdx.gl.glBindTexture(this.glTarget, this.glHandle);
    }

    public float unsafeSetAnisotropicFilter(float f, boolean z) {
        float maxAnisotropicFilterLevel2 = getMaxAnisotropicFilterLevel();
        if (maxAnisotropicFilterLevel2 == 1.0f) {
            return 1.0f;
        }
        float fMin = Math.min(f, maxAnisotropicFilterLevel2);
        if (!z && MathUtils.isEqual(fMin, this.anisotropicFilterLevel, 0.1f)) {
            return this.anisotropicFilterLevel;
        }
        Gdx.gl20.glTexParameterf(GL20.GL_TEXTURE_2D, GL20.GL_TEXTURE_MAX_ANISOTROPY_EXT, fMin);
        this.anisotropicFilterLevel = fMin;
        return fMin;
    }

    public void unsafeSetFilter(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z) {
        if (textureFilter != null && (z || this.minFilter != textureFilter)) {
            Gdx.gl.glTexParameteri(this.glTarget, GL20.GL_TEXTURE_MIN_FILTER, textureFilter.getGLEnum());
            this.minFilter = textureFilter;
        }
        if (textureFilter2 != null) {
            if (z || this.magFilter != textureFilter2) {
                Gdx.gl.glTexParameteri(this.glTarget, 10240, textureFilter2.getGLEnum());
                this.magFilter = textureFilter2;
            }
        }
    }

    public void unsafeSetWrap(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2, boolean z) {
        if (textureWrap != null && (z || this.uWrap != textureWrap)) {
            Gdx.gl.glTexParameteri(this.glTarget, GL20.GL_TEXTURE_WRAP_S, textureWrap.getGLEnum());
            this.uWrap = textureWrap;
        }
        if (textureWrap2 != null) {
            if (z || this.vWrap != textureWrap2) {
                Gdx.gl.glTexParameteri(this.glTarget, GL20.GL_TEXTURE_WRAP_T, textureWrap2.getGLEnum());
                this.vWrap = textureWrap2;
            }
        }
    }
}
