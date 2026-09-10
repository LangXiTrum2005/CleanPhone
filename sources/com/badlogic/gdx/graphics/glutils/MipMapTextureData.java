package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.GLTexture;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class MipMapTextureData implements TextureData {
    TextureData[] mips;

    public MipMapTextureData(TextureData... textureDataArr) {
        TextureData[] textureDataArr2 = new TextureData[textureDataArr.length];
        this.mips = textureDataArr2;
        System.arraycopy(textureDataArr, 0, textureDataArr2, 0, textureDataArr.length);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void consumeCustomData(int i) {
        int i2 = 0;
        while (true) {
            TextureData[] textureDataArr = this.mips;
            if (i2 >= textureDataArr.length) {
                return;
            }
            GLTexture.uploadImageData(i, textureDataArr[i2], i2);
            i2++;
        }
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap consumePixmap() {
        throw new GdxRuntimeException("It's compressed, use the compressed method");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean disposePixmap() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return this.mips[0].getFormat();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.mips[0].getHeight();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.mips[0].getWidth();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isManaged() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isPrepared() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean useMipMaps() {
        return false;
    }
}
