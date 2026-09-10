package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GLTexture;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultTextureBinder implements TextureBinder {
    public static final int LRU = 1;
    public static final int MAX_GLES_UNITS = 32;
    public static final int ROUNDROBIN = 0;
    private int bindCount;
    private final int count;
    private int currentTexture;
    private final int method;
    private final int offset;
    private int reuseCount;
    private boolean reused;
    private final TextureDescriptor tempDesc;
    private final GLTexture[] textures;
    private int[] unitsLRU;

    public DefaultTextureBinder(int i) {
        this(i, 0);
    }

    private final int bindTexture(TextureDescriptor textureDescriptor, boolean z) {
        int i;
        int iBindTextureRoundRobin;
        GLTexture gLTexture = textureDescriptor.texture;
        this.reused = false;
        int i2 = this.method;
        if (i2 == 0) {
            i = this.offset;
            iBindTextureRoundRobin = bindTextureRoundRobin(gLTexture);
        } else {
            if (i2 != 1) {
                return -1;
            }
            i = this.offset;
            iBindTextureRoundRobin = bindTextureLRU(gLTexture);
        }
        int i3 = i + iBindTextureRoundRobin;
        if (this.reused) {
            this.reuseCount++;
            if (z) {
                gLTexture.bind(i3);
            } else {
                Gdx.gl.glActiveTexture(GL20.GL_TEXTURE0 + i3);
            }
        } else {
            this.bindCount++;
        }
        gLTexture.unsafeSetWrap(textureDescriptor.uWrap, textureDescriptor.vWrap);
        gLTexture.unsafeSetFilter(textureDescriptor.minFilter, textureDescriptor.magFilter);
        return i3;
    }

    private final int bindTextureLRU(GLTexture gLTexture) {
        int i;
        int i2 = 0;
        while (true) {
            i = this.count;
            if (i2 >= i) {
                break;
            }
            GLTexture gLTexture2 = this.textures[this.unitsLRU[i2]];
            if (gLTexture2 == gLTexture) {
                this.reused = true;
                break;
            }
            if (gLTexture2 == null) {
                break;
            }
            i2++;
        }
        if (i2 >= i) {
            i2 = i - 1;
        }
        int i3 = this.unitsLRU[i2];
        while (i2 > 0) {
            int[] iArr = this.unitsLRU;
            iArr[i2] = iArr[i2 - 1];
            i2--;
        }
        this.unitsLRU[0] = i3;
        if (!this.reused) {
            this.textures[i3] = gLTexture;
            gLTexture.bind(this.offset + i3);
        }
        return i3;
    }

    private final int bindTextureRoundRobin(GLTexture gLTexture) {
        int i = 0;
        while (true) {
            int i2 = this.count;
            if (i >= i2) {
                int i3 = (this.currentTexture + 1) % i2;
                this.currentTexture = i3;
                this.textures[i3] = gLTexture;
                gLTexture.bind(this.offset + i3);
                return this.currentTexture;
            }
            int i4 = (this.currentTexture + i) % i2;
            if (this.textures[i4] == gLTexture) {
                this.reused = true;
                return i4;
            }
            i++;
        }
    }

    private static int getMaxTextureUnits() {
        IntBuffer intBufferNewIntBuffer = BufferUtils.newIntBuffer(16);
        Gdx.gl.glGetIntegerv(GL20.GL_MAX_TEXTURE_IMAGE_UNITS, intBufferNewIntBuffer);
        return intBufferNewIntBuffer.get(0);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.TextureBinder
    public void begin() {
        for (int i = 0; i < this.count; i++) {
            this.textures[i] = null;
            int[] iArr = this.unitsLRU;
            if (iArr != null) {
                iArr[i] = i;
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.TextureBinder
    public final int bind(TextureDescriptor textureDescriptor) {
        return bindTexture(textureDescriptor, false);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.TextureBinder
    public void end() {
        Gdx.gl.glActiveTexture(GL20.GL_TEXTURE0);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.TextureBinder
    public final int getBindCount() {
        return this.bindCount;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.TextureBinder
    public final int getReuseCount() {
        return this.reuseCount;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.TextureBinder
    public final void resetCounts() {
        this.reuseCount = 0;
        this.bindCount = 0;
    }

    public DefaultTextureBinder(int i, int i2) {
        this(i, i2, -1);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.TextureBinder
    public final int bind(GLTexture gLTexture) {
        this.tempDesc.set(gLTexture, null, null, null, null);
        return bindTexture(this.tempDesc, false);
    }

    public DefaultTextureBinder(int i, int i2, int i3) {
        this.reuseCount = 0;
        this.bindCount = 0;
        this.tempDesc = new TextureDescriptor();
        this.currentTexture = 0;
        int iMin = Math.min(getMaxTextureUnits(), 32);
        i3 = i3 < 0 ? iMin - i2 : i3;
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= iMin) {
            this.method = i;
            this.offset = i2;
            this.count = i3;
            this.textures = new GLTexture[i3];
            this.unitsLRU = i == 1 ? new int[i3] : null;
            return;
        }
        throw new GdxRuntimeException("Illegal arguments");
    }
}
