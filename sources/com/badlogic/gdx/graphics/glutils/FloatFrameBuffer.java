package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class FloatFrameBuffer extends FrameBuffer {
    public FloatFrameBuffer() {
        checkExtensions();
    }

    private void checkExtensions() {
        if (Gdx.graphics.isGL30Available() && Gdx.app.getType() == Application.ApplicationType.WebGL && !Gdx.graphics.supportsExtension("EXT_color_buffer_float")) {
            throw new GdxRuntimeException("Extension EXT_color_buffer_float not supported!");
        }
    }

    @Override // com.badlogic.gdx.graphics.glutils.FrameBuffer, com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    public Texture createTexture(GLFrameBuffer.FrameBufferTextureAttachmentSpec frameBufferTextureAttachmentSpec) {
        GLFrameBuffer.GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder = this.bufferBuilder;
        Texture texture = new Texture(new FloatTextureData(gLFrameBufferBuilder.width, gLFrameBufferBuilder.height, frameBufferTextureAttachmentSpec.internalFormat, frameBufferTextureAttachmentSpec.format, frameBufferTextureAttachmentSpec.type, frameBufferTextureAttachmentSpec.isGpuOnly));
        if (Gdx.app.getType() == Application.ApplicationType.Desktop || Gdx.app.getType() == Application.ApplicationType.Applet) {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
            texture.setFilter(textureFilter, textureFilter);
        } else {
            Texture.TextureFilter textureFilter2 = Texture.TextureFilter.Nearest;
            texture.setFilter(textureFilter2, textureFilter2);
        }
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        texture.setWrap(textureWrap, textureWrap);
        return texture;
    }

    public FloatFrameBuffer(GLFrameBuffer.GLFrameBufferBuilder<? extends GLFrameBuffer<Texture>> gLFrameBufferBuilder) {
        super(gLFrameBufferBuilder);
        checkExtensions();
    }

    public FloatFrameBuffer(int i, int i2, boolean z) {
        checkExtensions();
        GLFrameBuffer.FloatFrameBufferBuilder floatFrameBufferBuilder = new GLFrameBuffer.FloatFrameBufferBuilder(i, i2);
        floatFrameBufferBuilder.addFloatAttachment(GL30.GL_RGBA32F, GL20.GL_RGBA, GL20.GL_FLOAT, false);
        if (z) {
            floatFrameBufferBuilder.addBasicDepthRenderBuffer();
        }
        this.bufferBuilder = floatFrameBufferBuilder;
        build();
    }
}
