package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.CubemapData;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class FacedCubemapData implements CubemapData {
    protected final TextureData[] data;

    public FacedCubemapData() {
        this((TextureData) null, (TextureData) null, (TextureData) null, (TextureData) null, (TextureData) null, (TextureData) null);
    }

    @Override // com.badlogic.gdx.graphics.CubemapData
    public void consumeCubemapData() {
        int i = 0;
        while (true) {
            TextureData[] textureDataArr = this.data;
            if (i >= textureDataArr.length) {
                return;
            }
            if (textureDataArr[i].getType() == TextureData.TextureDataType.Custom) {
                this.data[i].consumeCustomData(GL20.GL_TEXTURE_CUBE_MAP_POSITIVE_X + i);
            } else {
                Pixmap pixmapConsumePixmap = this.data[i].consumePixmap();
                boolean zDisposePixmap = this.data[i].disposePixmap();
                if (this.data[i].getFormat() != pixmapConsumePixmap.getFormat()) {
                    Pixmap pixmap = new Pixmap(pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight(), this.data[i].getFormat());
                    pixmap.setBlending(Pixmap.Blending.None);
                    pixmap.drawPixmap(pixmapConsumePixmap, 0, 0, 0, 0, pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight());
                    if (this.data[i].disposePixmap()) {
                        pixmapConsumePixmap.dispose();
                    }
                    pixmapConsumePixmap = pixmap;
                    zDisposePixmap = true;
                }
                Gdx.gl.glPixelStorei(GL20.GL_UNPACK_ALIGNMENT, 1);
                Gdx.gl.glTexImage2D(i + GL20.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, pixmapConsumePixmap.getGLInternalFormat(), pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight(), 0, pixmapConsumePixmap.getGLFormat(), pixmapConsumePixmap.getGLType(), pixmapConsumePixmap.getPixels());
                if (zDisposePixmap) {
                    pixmapConsumePixmap.dispose();
                }
            }
            i++;
        }
    }

    @Override // com.badlogic.gdx.graphics.CubemapData
    public int getHeight() {
        int height;
        int height2;
        int height3;
        int height4;
        TextureData textureData = this.data[Cubemap.CubemapSide.PositiveZ.index];
        if (textureData == null || (height = textureData.getHeight()) <= 0) {
            height = 0;
        }
        TextureData textureData2 = this.data[Cubemap.CubemapSide.NegativeZ.index];
        if (textureData2 != null && (height4 = textureData2.getHeight()) > height) {
            height = height4;
        }
        TextureData textureData3 = this.data[Cubemap.CubemapSide.PositiveX.index];
        if (textureData3 != null && (height3 = textureData3.getHeight()) > height) {
            height = height3;
        }
        TextureData textureData4 = this.data[Cubemap.CubemapSide.NegativeX.index];
        return (textureData4 == null || (height2 = textureData4.getHeight()) <= height) ? height : height2;
    }

    public TextureData getTextureData(Cubemap.CubemapSide cubemapSide) {
        return this.data[cubemapSide.index];
    }

    @Override // com.badlogic.gdx.graphics.CubemapData
    public int getWidth() {
        int width;
        int width2;
        int width3;
        int width4;
        TextureData textureData = this.data[Cubemap.CubemapSide.PositiveZ.index];
        if (textureData == null || (width = textureData.getWidth()) <= 0) {
            width = 0;
        }
        TextureData textureData2 = this.data[Cubemap.CubemapSide.NegativeZ.index];
        if (textureData2 != null && (width4 = textureData2.getWidth()) > width) {
            width = width4;
        }
        TextureData textureData3 = this.data[Cubemap.CubemapSide.PositiveY.index];
        if (textureData3 != null && (width3 = textureData3.getWidth()) > width) {
            width = width3;
        }
        TextureData textureData4 = this.data[Cubemap.CubemapSide.NegativeY.index];
        return (textureData4 == null || (width2 = textureData4.getWidth()) <= width) ? width : width2;
    }

    public boolean isComplete() {
        int i = 0;
        while (true) {
            TextureData[] textureDataArr = this.data;
            if (i >= textureDataArr.length) {
                return true;
            }
            if (textureDataArr[i] == null) {
                return false;
            }
            i++;
        }
    }

    @Override // com.badlogic.gdx.graphics.CubemapData
    public boolean isManaged() {
        for (TextureData textureData : this.data) {
            if (!textureData.isManaged()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.badlogic.gdx.graphics.CubemapData
    public boolean isPrepared() {
        return false;
    }

    public void load(Cubemap.CubemapSide cubemapSide, FileHandle fileHandle) {
        this.data[cubemapSide.index] = TextureData.Factory.loadFromFile(fileHandle, false);
    }

    @Override // com.badlogic.gdx.graphics.CubemapData
    public void prepare() {
        if (!isComplete()) {
            throw new GdxRuntimeException("You need to complete your cubemap data before using it");
        }
        int i = 0;
        while (true) {
            TextureData[] textureDataArr = this.data;
            if (i >= textureDataArr.length) {
                return;
            }
            if (!textureDataArr[i].isPrepared()) {
                this.data[i].prepare();
            }
            i++;
        }
    }

    public FacedCubemapData(FileHandle fileHandle, FileHandle fileHandle2, FileHandle fileHandle3, FileHandle fileHandle4, FileHandle fileHandle5, FileHandle fileHandle6) {
        this(TextureData.Factory.loadFromFile(fileHandle, false), TextureData.Factory.loadFromFile(fileHandle2, false), TextureData.Factory.loadFromFile(fileHandle3, false), TextureData.Factory.loadFromFile(fileHandle4, false), TextureData.Factory.loadFromFile(fileHandle5, false), TextureData.Factory.loadFromFile(fileHandle6, false));
    }

    public void load(Cubemap.CubemapSide cubemapSide, Pixmap pixmap) {
        this.data[cubemapSide.index] = pixmap != null ? new PixmapTextureData(pixmap, null, false, false) : null;
    }

    public FacedCubemapData(FileHandle fileHandle, FileHandle fileHandle2, FileHandle fileHandle3, FileHandle fileHandle4, FileHandle fileHandle5, FileHandle fileHandle6, boolean z) {
        this(TextureData.Factory.loadFromFile(fileHandle, z), TextureData.Factory.loadFromFile(fileHandle2, z), TextureData.Factory.loadFromFile(fileHandle3, z), TextureData.Factory.loadFromFile(fileHandle4, z), TextureData.Factory.loadFromFile(fileHandle5, z), TextureData.Factory.loadFromFile(fileHandle6, z));
    }

    public FacedCubemapData(Pixmap pixmap, Pixmap pixmap2, Pixmap pixmap3, Pixmap pixmap4, Pixmap pixmap5, Pixmap pixmap6) {
        this(pixmap, pixmap2, pixmap3, pixmap4, pixmap5, pixmap6, false);
    }

    public FacedCubemapData(Pixmap pixmap, Pixmap pixmap2, Pixmap pixmap3, Pixmap pixmap4, Pixmap pixmap5, Pixmap pixmap6, boolean z) {
        this(pixmap == null ? null : new PixmapTextureData(pixmap, null, z, false), pixmap2 == null ? null : new PixmapTextureData(pixmap2, null, z, false), pixmap3 == null ? null : new PixmapTextureData(pixmap3, null, z, false), pixmap4 == null ? null : new PixmapTextureData(pixmap4, null, z, false), pixmap5 == null ? null : new PixmapTextureData(pixmap5, null, z, false), pixmap6 == null ? null : new PixmapTextureData(pixmap6, null, z, false));
    }

    public FacedCubemapData(int i, int i2, int i3, Pixmap.Format format) {
        this(new PixmapTextureData(new Pixmap(i3, i2, format), null, false, true), new PixmapTextureData(new Pixmap(i3, i2, format), null, false, true), new PixmapTextureData(new Pixmap(i, i3, format), null, false, true), new PixmapTextureData(new Pixmap(i, i3, format), null, false, true), new PixmapTextureData(new Pixmap(i, i2, format), null, false, true), new PixmapTextureData(new Pixmap(i, i2, format), null, false, true));
    }

    public FacedCubemapData(TextureData textureData, TextureData textureData2, TextureData textureData3, TextureData textureData4, TextureData textureData5, TextureData textureData6) {
        this.data = new TextureData[]{textureData, textureData2, textureData3, textureData4, textureData5, textureData6};
    }
}
