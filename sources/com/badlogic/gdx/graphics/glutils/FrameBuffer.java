package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

/* JADX INFO: loaded from: classes.dex */
public class FrameBuffer extends GLFrameBuffer<Texture> {
    public FrameBuffer() {
    }

    public static void unbind() {
        GLFrameBuffer.unbind();
    }

    public FrameBuffer(GLFrameBuffer.GLFrameBufferBuilder<? extends GLFrameBuffer<Texture>> gLFrameBufferBuilder) {
        super(gLFrameBufferBuilder);
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    public void attachFrameBufferColorTexture(Texture texture) {
        Gdx.gl20.glFramebufferTexture2D(GL20.GL_FRAMEBUFFER, GL20.GL_COLOR_ATTACHMENT0, GL20.GL_TEXTURE_2D, texture.getTextureObjectHandle(), 0);
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    public Texture createTexture(GLFrameBuffer.FrameBufferTextureAttachmentSpec frameBufferTextureAttachmentSpec) {
        GLFrameBuffer.GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder = this.bufferBuilder;
        Texture texture = new Texture(new GLOnlyTextureData(gLFrameBufferBuilder.width, gLFrameBufferBuilder.height, 0, frameBufferTextureAttachmentSpec.internalFormat, frameBufferTextureAttachmentSpec.format, frameBufferTextureAttachmentSpec.type));
        if (!frameBufferTextureAttachmentSpec.isDepth || Gdx.app.getType() != Application.ApplicationType.WebGL) {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
            texture.setFilter(textureFilter, textureFilter);
        }
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        texture.setWrap(textureWrap, textureWrap);
        return texture;
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    public void disposeColorTexture(Texture texture) {
        texture.dispose();
    }

    public FrameBuffer(Pixmap.Format format, int i, int i2, boolean z) {
        this(format, i, i2, z, false);
    }

    public FrameBuffer(Pixmap.Format format, int i, int i2, boolean z, boolean z2) {
        GLFrameBuffer.FrameBufferBuilder frameBufferBuilder = new GLFrameBuffer.FrameBufferBuilder(i, i2);
        frameBufferBuilder.addBasicColorTextureAttachment(format);
        if (z) {
            frameBufferBuilder.addBasicDepthRenderBuffer();
        }
        if (z2) {
            frameBufferBuilder.addBasicStencilRenderBuffer();
        }
        this.bufferBuilder = frameBufferBuilder;
        build();
    }
}
