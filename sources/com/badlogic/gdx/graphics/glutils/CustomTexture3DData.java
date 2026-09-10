package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture3DData;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class CustomTexture3DData implements Texture3DData {
    private int depth;
    private int glFormat;
    private int glInternalFormat;
    private int glType;
    private int height;
    private int mipMapLevel;
    private ByteBuffer pixels;
    private int width;

    public CustomTexture3DData(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.width = i;
        this.height = i2;
        this.depth = i3;
        this.glFormat = i5;
        this.glInternalFormat = i6;
        this.glType = i7;
        this.mipMapLevel = i4;
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public void consume3DData() {
        Gdx.gl30.glTexImage3D(GL30.GL_TEXTURE_3D, this.mipMapLevel, this.glInternalFormat, this.width, this.height, this.depth, 0, this.glFormat, this.glType, this.pixels);
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public int getDepth() {
        return this.depth;
    }

    public int getGLFormat() {
        return this.glFormat;
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public int getGLType() {
        return this.glType;
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public int getHeight() {
        return this.height;
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public int getInternalFormat() {
        return this.glInternalFormat;
    }

    public int getMipMapLevel() {
        return this.mipMapLevel;
    }

    public ByteBuffer getPixels() {
        int i;
        if (this.pixels == null) {
            int i2 = this.glFormat;
            int i3 = 1;
            if (i2 == 6403 || i2 == 36244 || i2 == 6409 || i2 == 6406) {
                i = 1;
            } else if (i2 == 33319 || i2 == 33320 || i2 == 6410) {
                i = 2;
            } else if (i2 == 6407 || i2 == 36248) {
                i = 3;
            } else {
                if (i2 != 6408 && i2 != 36249) {
                    throw new GdxRuntimeException("unsupported glFormat: " + this.glFormat);
                }
                i = 4;
            }
            int i4 = this.glType;
            if (i4 != 5121 && i4 != 5120) {
                if (i4 == 5123 || i4 == 5122 || i4 == 5131) {
                    i3 = 2;
                } else {
                    if (i4 != 5125 && i4 != 5124 && i4 != 5126) {
                        throw new GdxRuntimeException("unsupported glType: " + this.glType);
                    }
                    i3 = 4;
                }
            }
            this.pixels = BufferUtils.newByteBuffer(this.width * this.height * this.depth * i * i3);
        }
        return this.pixels;
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public int getWidth() {
        return this.width;
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public boolean isManaged() {
        return this.pixels != null;
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public boolean isPrepared() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public void prepare() {
    }

    @Override // com.badlogic.gdx.graphics.Texture3DData
    public boolean useMipMaps() {
        return false;
    }
}
