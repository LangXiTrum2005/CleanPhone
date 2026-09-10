package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureArrayData;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class FileTextureArrayData implements TextureArrayData {
    private int depth;
    private Pixmap.Format format;
    private boolean prepared;
    private TextureData[] textureDatas;
    boolean useMipMaps;

    public FileTextureArrayData(Pixmap.Format format, boolean z, FileHandle[] fileHandleArr) {
        this.format = format;
        this.useMipMaps = z;
        this.depth = fileHandleArr.length;
        this.textureDatas = new TextureData[fileHandleArr.length];
        for (int i = 0; i < fileHandleArr.length; i++) {
            this.textureDatas[i] = TextureData.Factory.loadFromFile(fileHandleArr[i], format, z);
        }
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public void consumeTextureArrayData() {
        Pixmap pixmap;
        boolean z;
        int i = 0;
        boolean z2 = false;
        while (true) {
            TextureData[] textureDataArr = this.textureDatas;
            if (i >= textureDataArr.length) {
                break;
            }
            if (textureDataArr[i].getType() == TextureData.TextureDataType.Custom) {
                this.textureDatas[i].consumeCustomData(GL30.GL_TEXTURE_2D_ARRAY);
                z2 = true;
            } else {
                TextureData textureData = this.textureDatas[i];
                Pixmap pixmapConsumePixmap = textureData.consumePixmap();
                boolean zDisposePixmap = textureData.disposePixmap();
                if (textureData.getFormat() != pixmapConsumePixmap.getFormat()) {
                    Pixmap pixmap2 = new Pixmap(pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight(), textureData.getFormat());
                    pixmap2.setBlending(Pixmap.Blending.None);
                    pixmap2.drawPixmap(pixmapConsumePixmap, 0, 0, 0, 0, pixmapConsumePixmap.getWidth(), pixmapConsumePixmap.getHeight());
                    if (textureData.disposePixmap()) {
                        pixmapConsumePixmap.dispose();
                    }
                    pixmap = pixmap2;
                    z = true;
                } else {
                    pixmap = pixmapConsumePixmap;
                    z = zDisposePixmap;
                }
                Gdx.gl30.glTexSubImage3D(GL30.GL_TEXTURE_2D_ARRAY, 0, 0, 0, i, pixmap.getWidth(), pixmap.getHeight(), 1, pixmap.getGLInternalFormat(), pixmap.getGLType(), pixmap.getPixels());
                if (z) {
                    pixmap.dispose();
                }
            }
            i++;
        }
        if (!this.useMipMaps || z2) {
            return;
        }
        Gdx.gl20.glGenerateMipmap(GL30.GL_TEXTURE_2D_ARRAY);
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public int getDepth() {
        return this.depth;
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public int getGLType() {
        return Pixmap.Format.toGlType(this.format);
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public int getHeight() {
        return this.textureDatas[0].getHeight();
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public int getInternalFormat() {
        return Pixmap.Format.toGlFormat(this.format);
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public int getWidth() {
        return this.textureDatas[0].getWidth();
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public boolean isManaged() {
        for (TextureData textureData : this.textureDatas) {
            if (!textureData.isManaged()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public boolean isPrepared() {
        return this.prepared;
    }

    @Override // com.badlogic.gdx.graphics.TextureArrayData
    public void prepare() {
        int width = -1;
        int height = -1;
        for (TextureData textureData : this.textureDatas) {
            textureData.prepare();
            if (width == -1) {
                width = textureData.getWidth();
                height = textureData.getHeight();
            } else if (width != textureData.getWidth() || height != textureData.getHeight()) {
                throw new GdxRuntimeException("Error whilst preparing TextureArray: TextureArray Textures must have equal dimensions.");
            }
        }
        this.prepared = true;
    }
}
