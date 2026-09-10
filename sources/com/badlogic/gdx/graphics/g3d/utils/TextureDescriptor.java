package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.GLTexture;
import com.badlogic.gdx.graphics.Texture;

/* JADX INFO: loaded from: classes.dex */
public class TextureDescriptor<T extends GLTexture> implements Comparable<TextureDescriptor<T>> {
    public Texture.TextureFilter magFilter;
    public Texture.TextureFilter minFilter;
    public T texture;
    public Texture.TextureWrap uWrap;
    public Texture.TextureWrap vWrap;

    public TextureDescriptor(T t, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.texture = null;
        set(t, textureFilter, textureFilter2, textureWrap, textureWrap2);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextureDescriptor)) {
            return false;
        }
        TextureDescriptor textureDescriptor = (TextureDescriptor) obj;
        return textureDescriptor.texture == this.texture && textureDescriptor.minFilter == this.minFilter && textureDescriptor.magFilter == this.magFilter && textureDescriptor.uWrap == this.uWrap && textureDescriptor.vWrap == this.vWrap;
    }

    public int hashCode() {
        T t = this.texture;
        long textureObjectHandle = ((((long) (t == null ? 0 : t.glTarget)) * 811) + ((long) (t == null ? 0 : t.getTextureObjectHandle()))) * 811;
        Texture.TextureFilter textureFilter = this.minFilter;
        long gLEnum = (textureObjectHandle + ((long) (textureFilter == null ? 0 : textureFilter.getGLEnum()))) * 811;
        Texture.TextureFilter textureFilter2 = this.magFilter;
        long gLEnum2 = (gLEnum + ((long) (textureFilter2 == null ? 0 : textureFilter2.getGLEnum()))) * 811;
        Texture.TextureWrap textureWrap = this.uWrap;
        long gLEnum3 = (gLEnum2 + ((long) (textureWrap == null ? 0 : textureWrap.getGLEnum()))) * 811;
        Texture.TextureWrap textureWrap2 = this.vWrap;
        long gLEnum4 = gLEnum3 + ((long) (textureWrap2 != null ? textureWrap2.getGLEnum() : 0));
        return (int) ((gLEnum4 >> 32) ^ gLEnum4);
    }

    public void set(T t, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.texture = t;
        this.minFilter = textureFilter;
        this.magFilter = textureFilter2;
        this.uWrap = textureWrap;
        this.vWrap = textureWrap2;
    }

    @Override // java.lang.Comparable
    public int compareTo(TextureDescriptor<T> textureDescriptor) {
        if (textureDescriptor == this) {
            return 0;
        }
        T t = this.texture;
        int i = t == null ? 0 : t.glTarget;
        T t2 = textureDescriptor.texture;
        int i2 = t2 == null ? 0 : t2.glTarget;
        if (i != i2) {
            return i - i2;
        }
        int textureObjectHandle = t == null ? 0 : t.getTextureObjectHandle();
        T t3 = textureDescriptor.texture;
        int textureObjectHandle2 = t3 == null ? 0 : t3.getTextureObjectHandle();
        if (textureObjectHandle != textureObjectHandle2) {
            return textureObjectHandle - textureObjectHandle2;
        }
        Texture.TextureFilter textureFilter = this.minFilter;
        if (textureFilter != textureDescriptor.minFilter) {
            int gLEnum = textureFilter == null ? 0 : textureFilter.getGLEnum();
            Texture.TextureFilter textureFilter2 = textureDescriptor.minFilter;
            return gLEnum - (textureFilter2 != null ? textureFilter2.getGLEnum() : 0);
        }
        Texture.TextureFilter textureFilter3 = this.magFilter;
        if (textureFilter3 != textureDescriptor.magFilter) {
            int gLEnum2 = textureFilter3 == null ? 0 : textureFilter3.getGLEnum();
            Texture.TextureFilter textureFilter4 = textureDescriptor.magFilter;
            return gLEnum2 - (textureFilter4 != null ? textureFilter4.getGLEnum() : 0);
        }
        Texture.TextureWrap textureWrap = this.uWrap;
        if (textureWrap != textureDescriptor.uWrap) {
            int gLEnum3 = textureWrap == null ? 0 : textureWrap.getGLEnum();
            Texture.TextureWrap textureWrap2 = textureDescriptor.uWrap;
            return gLEnum3 - (textureWrap2 != null ? textureWrap2.getGLEnum() : 0);
        }
        Texture.TextureWrap textureWrap3 = this.vWrap;
        if (textureWrap3 == textureDescriptor.vWrap) {
            return 0;
        }
        int gLEnum4 = textureWrap3 == null ? 0 : textureWrap3.getGLEnum();
        Texture.TextureWrap textureWrap4 = textureDescriptor.vWrap;
        return gLEnum4 - (textureWrap4 != null ? textureWrap4.getGLEnum() : 0);
    }

    public TextureDescriptor(T t) {
        this(t, null, null, null, null);
    }

    public TextureDescriptor() {
        this.texture = null;
    }

    public <V extends T> void set(TextureDescriptor<V> textureDescriptor) {
        this.texture = textureDescriptor.texture;
        this.minFilter = textureDescriptor.minFilter;
        this.magFilter = textureDescriptor.magFilter;
        this.uWrap = textureDescriptor.uWrap;
        this.vWrap = textureDescriptor.vWrap;
    }
}
