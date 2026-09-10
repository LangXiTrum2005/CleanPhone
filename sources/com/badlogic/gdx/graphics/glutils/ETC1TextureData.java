package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class ETC1TextureData implements TextureData {
    ETC1.ETC1Data data;
    FileHandle file;
    int height;
    boolean isPrepared;
    boolean useMipMaps;
    int width;

    public ETC1TextureData(FileHandle fileHandle) {
        this(fileHandle, false);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void consumeCustomData(int i) {
        if (!this.isPrepared) {
            throw new GdxRuntimeException("Call prepare() before calling consumeCompressedData()");
        }
        if (Gdx.graphics.supportsExtension("GL_OES_compressed_ETC1_RGB8_texture")) {
            GL20 gl20 = Gdx.gl;
            int i2 = ETC1.ETC1_RGB8_OES;
            int i3 = this.width;
            int i4 = this.height;
            int iCapacity = this.data.compressedData.capacity();
            ETC1.ETC1Data eTC1Data = this.data;
            gl20.glCompressedTexImage2D(i, 0, i2, i3, i4, 0, iCapacity - eTC1Data.dataOffset, eTC1Data.compressedData);
            if (useMipMaps()) {
                Gdx.gl20.glGenerateMipmap(GL20.GL_TEXTURE_2D);
            }
        } else {
            Pixmap pixmapDecodeImage = ETC1.decodeImage(this.data, Pixmap.Format.RGB565);
            Gdx.gl.glTexImage2D(i, 0, pixmapDecodeImage.getGLInternalFormat(), pixmapDecodeImage.getWidth(), pixmapDecodeImage.getHeight(), 0, pixmapDecodeImage.getGLFormat(), pixmapDecodeImage.getGLType(), pixmapDecodeImage.getPixels());
            if (this.useMipMaps) {
                MipMapGenerator.generateMipMap(i, pixmapDecodeImage, pixmapDecodeImage.getWidth(), pixmapDecodeImage.getHeight());
            }
            pixmapDecodeImage.dispose();
            this.useMipMaps = false;
        }
        this.data.dispose();
        this.data = null;
        this.isPrepared = false;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap consumePixmap() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean disposePixmap() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return Pixmap.Format.RGB565;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.height;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.width;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isManaged() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isPrepared() {
        return this.isPrepared;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        if (this.isPrepared) {
            throw new GdxRuntimeException("Already prepared");
        }
        FileHandle fileHandle = this.file;
        if (fileHandle == null && this.data == null) {
            throw new GdxRuntimeException("Can only load once from ETC1Data");
        }
        if (fileHandle != null) {
            this.data = new ETC1.ETC1Data(fileHandle);
        }
        ETC1.ETC1Data eTC1Data = this.data;
        this.width = eTC1Data.width;
        this.height = eTC1Data.height;
        this.isPrepared = true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean useMipMaps() {
        return this.useMipMaps;
    }

    public ETC1TextureData(FileHandle fileHandle, boolean z) {
        this.width = 0;
        this.height = 0;
        this.isPrepared = false;
        this.file = fileHandle;
        this.useMipMaps = z;
    }

    public ETC1TextureData(ETC1.ETC1Data eTC1Data, boolean z) {
        this.width = 0;
        this.height = 0;
        this.isPrepared = false;
        this.data = eTC1Data;
        this.useMipMaps = z;
    }
}
