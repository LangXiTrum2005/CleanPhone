package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class FrameBufferCubemap extends GLFrameBuffer<Cubemap> {
    private static final Cubemap.CubemapSide[] cubemapSides = Cubemap.CubemapSide.values();
    private int currentSide;

    public FrameBufferCubemap() {
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    public void bind() {
        this.currentSide = -1;
        super.bind();
    }

    public void bindSide(Cubemap.CubemapSide cubemapSide) {
        Gdx.gl20.glFramebufferTexture2D(GL20.GL_FRAMEBUFFER, GL20.GL_COLOR_ATTACHMENT0, cubemapSide.glEnum, getColorBufferTexture().getTextureObjectHandle(), 0);
    }

    public Cubemap.CubemapSide getSide() {
        int i = this.currentSide;
        if (i < 0) {
            return null;
        }
        return cubemapSides[i];
    }

    public boolean nextSide() {
        int i = this.currentSide;
        if (i > 5) {
            throw new GdxRuntimeException("No remaining sides.");
        }
        if (i == 5) {
            return false;
        }
        this.currentSide = i + 1;
        bindSide(getSide());
        return true;
    }

    public FrameBufferCubemap(GLFrameBuffer.GLFrameBufferBuilder<? extends GLFrameBuffer<Cubemap>> gLFrameBufferBuilder) {
        super(gLFrameBufferBuilder);
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    public void attachFrameBufferColorTexture(Cubemap cubemap) {
        GL20 gl20 = Gdx.gl20;
        int textureObjectHandle = cubemap.getTextureObjectHandle();
        for (Cubemap.CubemapSide cubemapSide : Cubemap.CubemapSide.values()) {
            gl20.glFramebufferTexture2D(GL20.GL_FRAMEBUFFER, GL20.GL_COLOR_ATTACHMENT0, cubemapSide.glEnum, textureObjectHandle, 0);
        }
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    public Cubemap createTexture(GLFrameBuffer.FrameBufferTextureAttachmentSpec frameBufferTextureAttachmentSpec) {
        GLFrameBuffer.GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder = this.bufferBuilder;
        GLOnlyTextureData gLOnlyTextureData = new GLOnlyTextureData(gLFrameBufferBuilder.width, gLFrameBufferBuilder.height, 0, frameBufferTextureAttachmentSpec.internalFormat, frameBufferTextureAttachmentSpec.format, frameBufferTextureAttachmentSpec.type);
        Cubemap cubemap = new Cubemap(gLOnlyTextureData, gLOnlyTextureData, gLOnlyTextureData, gLOnlyTextureData, gLOnlyTextureData, gLOnlyTextureData);
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
        cubemap.setFilter(textureFilter, textureFilter);
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        cubemap.setWrap(textureWrap, textureWrap);
        return cubemap;
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    public void disposeColorTexture(Cubemap cubemap) {
        cubemap.dispose();
    }

    public FrameBufferCubemap(Pixmap.Format format, int i, int i2, boolean z) {
        this(format, i, i2, z, false);
    }

    public FrameBufferCubemap(Pixmap.Format format, int i, int i2, boolean z, boolean z2) {
        GLFrameBuffer.FrameBufferCubemapBuilder frameBufferCubemapBuilder = new GLFrameBuffer.FrameBufferCubemapBuilder(i, i2);
        frameBufferCubemapBuilder.addBasicColorTextureAttachment(format);
        if (z) {
            frameBufferCubemapBuilder.addBasicDepthRenderBuffer();
        }
        if (z2) {
            frameBufferCubemapBuilder.addBasicStencilRenderBuffer();
        }
        this.bufferBuilder = frameBufferCubemapBuilder;
        build();
    }
}
