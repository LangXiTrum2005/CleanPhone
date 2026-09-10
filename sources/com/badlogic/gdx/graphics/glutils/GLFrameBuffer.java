package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.GLTexture;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.IntArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class GLFrameBuffer<T extends GLTexture> implements Disposable {
    protected static final int GL_DEPTH24_STENCIL8_OES = 35056;
    protected static int defaultFramebufferHandle;
    protected GLFrameBufferBuilder<? extends GLFrameBuffer<T>> bufferBuilder;
    private IntBuffer defaultDrawBuffers;
    protected int depthStencilPackedBufferHandle;
    protected int depthbufferHandle;
    protected int framebufferHandle;
    protected boolean hasDepthStencilPackedBuffer;
    protected boolean isMRT;
    protected int stencilbufferHandle;
    protected static final Map<Application, Array<GLFrameBuffer>> buffers = new HashMap();
    protected static boolean defaultFramebufferHandleInitialized = false;
    static final IntBuffer singleInt = BufferUtils.newIntBuffer(1);
    protected Array<T> textureAttachments = new Array<>();
    protected final IntArray colorBufferHandles = new IntArray();

    public static class FloatFrameBufferBuilder extends GLFrameBufferBuilder<FloatFrameBuffer> {
        public FloatFrameBufferBuilder(int i, int i2) {
            super(i, i2);
        }

        public FloatFrameBufferBuilder(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder
        public FloatFrameBuffer build() {
            return new FloatFrameBuffer(this);
        }
    }

    public static class FrameBufferBuilder extends GLFrameBufferBuilder<FrameBuffer> {
        public FrameBufferBuilder(int i, int i2) {
            super(i, i2);
        }

        public FrameBufferBuilder(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder
        public FrameBuffer build() {
            return new FrameBuffer(this);
        }
    }

    public static class FrameBufferCubemapBuilder extends GLFrameBufferBuilder<FrameBufferCubemap> {
        public FrameBufferCubemapBuilder(int i, int i2) {
            super(i, i2);
        }

        public FrameBufferCubemapBuilder(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder
        public FrameBufferCubemap build() {
            return new FrameBufferCubemap(this);
        }
    }

    public static class FrameBufferRenderBufferAttachmentSpec {
        int internalFormat;

        public FrameBufferRenderBufferAttachmentSpec(int i) {
            this.internalFormat = i;
        }
    }

    public static class FrameBufferTextureAttachmentSpec {
        int format;
        int internalFormat;
        boolean isDepth;
        boolean isFloat;
        boolean isGpuOnly;
        boolean isStencil;
        int type;

        public FrameBufferTextureAttachmentSpec(int i, int i2, int i3) {
            this.internalFormat = i;
            this.format = i2;
            this.type = i3;
        }

        public boolean isColorTexture() {
            return (this.isDepth || this.isStencil) ? false : true;
        }
    }

    public static abstract class GLFrameBufferBuilder<U extends GLFrameBuffer<? extends GLTexture>> {
        protected Array<FrameBufferRenderBufferAttachmentSpec> colorRenderBufferSpecs;
        protected FrameBufferRenderBufferAttachmentSpec depthRenderBufferSpec;
        protected boolean hasDepthRenderBuffer;
        protected boolean hasPackedStencilDepthRenderBuffer;
        protected boolean hasStencilRenderBuffer;
        protected int height;
        protected FrameBufferRenderBufferAttachmentSpec packedStencilDepthRenderBufferSpec;
        protected int samples;
        protected FrameBufferRenderBufferAttachmentSpec stencilRenderBufferSpec;
        protected Array<FrameBufferTextureAttachmentSpec> textureAttachmentSpecs;
        protected int width;

        public GLFrameBufferBuilder(int i, int i2) {
            this(i, i2, 0);
        }

        public GLFrameBufferBuilder<U> addBasicColorTextureAttachment(Pixmap.Format format) {
            int glFormat = Pixmap.Format.toGlFormat(format);
            return addColorTextureAttachment(glFormat, glFormat, Pixmap.Format.toGlType(format));
        }

        public GLFrameBufferBuilder<U> addBasicDepthRenderBuffer() {
            return addDepthRenderBuffer(GL20.GL_DEPTH_COMPONENT16);
        }

        public GLFrameBufferBuilder<U> addBasicStencilDepthPackedRenderBuffer() {
            return addStencilDepthPackedRenderBuffer(35056);
        }

        public GLFrameBufferBuilder<U> addBasicStencilRenderBuffer() {
            return addStencilRenderBuffer(GL20.GL_STENCIL_INDEX8);
        }

        public GLFrameBufferBuilder<U> addColorRenderBuffer(int i) {
            this.colorRenderBufferSpecs.add(new FrameBufferRenderBufferAttachmentSpec(i));
            return this;
        }

        public GLFrameBufferBuilder<U> addColorTextureAttachment(int i, int i2, int i3) {
            this.textureAttachmentSpecs.add(new FrameBufferTextureAttachmentSpec(i, i2, i3));
            return this;
        }

        public GLFrameBufferBuilder<U> addDepthRenderBuffer(int i) {
            this.depthRenderBufferSpec = new FrameBufferRenderBufferAttachmentSpec(i);
            this.hasDepthRenderBuffer = true;
            return this;
        }

        public GLFrameBufferBuilder<U> addDepthTextureAttachment(int i, int i2) {
            FrameBufferTextureAttachmentSpec frameBufferTextureAttachmentSpec = new FrameBufferTextureAttachmentSpec(i, GL20.GL_DEPTH_COMPONENT, i2);
            frameBufferTextureAttachmentSpec.isDepth = true;
            this.textureAttachmentSpecs.add(frameBufferTextureAttachmentSpec);
            return this;
        }

        public GLFrameBufferBuilder<U> addFloatAttachment(int i, int i2, int i3, boolean z) {
            FrameBufferTextureAttachmentSpec frameBufferTextureAttachmentSpec = new FrameBufferTextureAttachmentSpec(i, i2, i3);
            frameBufferTextureAttachmentSpec.isFloat = true;
            frameBufferTextureAttachmentSpec.isGpuOnly = z;
            this.textureAttachmentSpecs.add(frameBufferTextureAttachmentSpec);
            return this;
        }

        public GLFrameBufferBuilder<U> addStencilDepthPackedRenderBuffer(int i) {
            this.packedStencilDepthRenderBufferSpec = new FrameBufferRenderBufferAttachmentSpec(i);
            this.hasPackedStencilDepthRenderBuffer = true;
            return this;
        }

        public GLFrameBufferBuilder<U> addStencilRenderBuffer(int i) {
            this.stencilRenderBufferSpec = new FrameBufferRenderBufferAttachmentSpec(i);
            this.hasStencilRenderBuffer = true;
            return this;
        }

        public GLFrameBufferBuilder<U> addStencilTextureAttachment(int i, int i2) {
            FrameBufferTextureAttachmentSpec frameBufferTextureAttachmentSpec = new FrameBufferTextureAttachmentSpec(i, GL20.GL_STENCIL_ATTACHMENT, i2);
            frameBufferTextureAttachmentSpec.isStencil = true;
            this.textureAttachmentSpecs.add(frameBufferTextureAttachmentSpec);
            return this;
        }

        public abstract U build();

        public GLFrameBufferBuilder(int i, int i2, int i3) {
            this.textureAttachmentSpecs = new Array<>();
            this.colorRenderBufferSpecs = new Array<>();
            this.width = i;
            this.height = i2;
            this.samples = i3;
        }
    }

    public GLFrameBuffer() {
    }

    private static void addManagedFrameBuffer(Application application, GLFrameBuffer gLFrameBuffer) {
        Map<Application, Array<GLFrameBuffer>> map = buffers;
        Array<GLFrameBuffer> array = map.get(application);
        if (array == null) {
            array = new Array<>();
        }
        array.add(gLFrameBuffer);
        map.put(application, array);
    }

    private void checkValidBuilder() {
        if (this.bufferBuilder.samples > 0 && !Gdx.graphics.isGL31Available()) {
            throw new GdxRuntimeException("Framebuffer multisample requires GLES 3.1+");
        }
        GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder = this.bufferBuilder;
        if (gLFrameBufferBuilder.samples > 0 && gLFrameBufferBuilder.textureAttachmentSpecs.size > 0) {
            throw new GdxRuntimeException("Framebuffer multisample with texture attachments not yet supported");
        }
        if (!Gdx.graphics.isGL30Available()) {
            boolean z = Gdx.graphics.supportsExtension("GL_OES_packed_depth_stencil") || Gdx.graphics.supportsExtension("GL_EXT_packed_depth_stencil");
            GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder2 = this.bufferBuilder;
            if (gLFrameBufferBuilder2.hasPackedStencilDepthRenderBuffer && !z) {
                throw new GdxRuntimeException("Packed Stencil/Render render buffers are not available on GLES 2.0");
            }
            Array<FrameBufferTextureAttachmentSpec> array = gLFrameBufferBuilder2.textureAttachmentSpecs;
            if (array.size > 1) {
                throw new GdxRuntimeException("Multiple render targets not available on GLES 2.0");
            }
            Array.ArrayIterator<FrameBufferTextureAttachmentSpec> it = array.iterator();
            while (it.hasNext()) {
                FrameBufferTextureAttachmentSpec next = it.next();
                if (next.isDepth) {
                    throw new GdxRuntimeException("Depth texture FrameBuffer Attachment not available on GLES 2.0");
                }
                if (next.isStencil) {
                    throw new GdxRuntimeException("Stencil texture FrameBuffer Attachment not available on GLES 2.0");
                }
                if (next.isFloat && !Gdx.graphics.supportsExtension("OES_texture_float")) {
                    throw new GdxRuntimeException("Float texture FrameBuffer Attachment not available on GLES 2.0");
                }
            }
        }
        GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder3 = this.bufferBuilder;
        if (gLFrameBufferBuilder3.hasPackedStencilDepthRenderBuffer) {
            if (gLFrameBufferBuilder3.hasDepthRenderBuffer || gLFrameBufferBuilder3.hasStencilRenderBuffer) {
                throw new GdxRuntimeException("Frame buffer couldn't be constructed: packed stencil depth buffer cannot be specified together with separated depth or stencil buffer");
            }
        }
    }

    public static void clearAllFrameBuffers(Application application) {
        buffers.remove(application);
    }

    public static StringBuilder getManagedStatus(StringBuilder sb) {
        sb.append("Managed buffers/app: { ");
        Iterator<Application> it = buffers.keySet().iterator();
        while (it.hasNext()) {
            sb.append(buffers.get(it.next()).size);
            sb.append(" ");
        }
        sb.append("}");
        return sb;
    }

    public static void invalidateAllFrameBuffers(Application application) {
        Array<GLFrameBuffer> array;
        if (Gdx.gl20 == null || (array = buffers.get(application)) == null) {
            return;
        }
        for (int i = 0; i < array.size; i++) {
            array.get(i).build();
        }
    }

    public static void unbind() {
        Gdx.gl20.glBindFramebuffer(GL20.GL_FRAMEBUFFER, defaultFramebufferHandle);
    }

    public abstract void attachFrameBufferColorTexture(T t);

    public void begin() {
        bind();
        setFrameBufferViewport();
    }

    public void bind() {
        Gdx.gl20.glBindFramebuffer(GL20.GL_FRAMEBUFFER, this.framebufferHandle);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f0 A[LOOP:4: B:68:0x01ee->B:69:0x01f0, LOOP_END] */
    public void build() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        GL20 gl20 = Gdx.gl20;
        checkValidBuilder();
        if (!defaultFramebufferHandleInitialized) {
            defaultFramebufferHandleInitialized = true;
            if (Gdx.app.getType() == Application.ApplicationType.iOS) {
                IntBuffer intBufferAsIntBuffer = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asIntBuffer();
                gl20.glGetIntegerv(36006, intBufferAsIntBuffer);
                defaultFramebufferHandle = intBufferAsIntBuffer.get(0);
            } else {
                defaultFramebufferHandle = 0;
            }
        }
        int iGlGenFramebuffer = gl20.glGenFramebuffer();
        this.framebufferHandle = iGlGenFramebuffer;
        gl20.glBindFramebuffer(GL20.GL_FRAMEBUFFER, iGlGenFramebuffer);
        GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder = this.bufferBuilder;
        int i10 = gLFrameBufferBuilder.width;
        int i11 = gLFrameBufferBuilder.height;
        if (gLFrameBufferBuilder.hasDepthRenderBuffer) {
            int iGlGenRenderbuffer = gl20.glGenRenderbuffer();
            this.depthbufferHandle = iGlGenRenderbuffer;
            gl20.glBindRenderbuffer(GL20.GL_RENDERBUFFER, iGlGenRenderbuffer);
            GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder2 = this.bufferBuilder;
            int i12 = gLFrameBufferBuilder2.samples;
            if (i12 > 0) {
                Gdx.gl31.glRenderbufferStorageMultisample(GL20.GL_RENDERBUFFER, i12, gLFrameBufferBuilder2.depthRenderBufferSpec.internalFormat, i10, i11);
            } else {
                gl20.glRenderbufferStorage(GL20.GL_RENDERBUFFER, gLFrameBufferBuilder2.depthRenderBufferSpec.internalFormat, i10, i11);
            }
        }
        if (this.bufferBuilder.hasStencilRenderBuffer) {
            int iGlGenRenderbuffer2 = gl20.glGenRenderbuffer();
            this.stencilbufferHandle = iGlGenRenderbuffer2;
            gl20.glBindRenderbuffer(GL20.GL_RENDERBUFFER, iGlGenRenderbuffer2);
            GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder3 = this.bufferBuilder;
            int i13 = gLFrameBufferBuilder3.samples;
            if (i13 > 0) {
                Gdx.gl31.glRenderbufferStorageMultisample(GL20.GL_RENDERBUFFER, i13, gLFrameBufferBuilder3.stencilRenderBufferSpec.internalFormat, i10, i11);
            } else {
                gl20.glRenderbufferStorage(GL20.GL_RENDERBUFFER, gLFrameBufferBuilder3.stencilRenderBufferSpec.internalFormat, i10, i11);
            }
        }
        if (this.bufferBuilder.hasPackedStencilDepthRenderBuffer) {
            int iGlGenRenderbuffer3 = gl20.glGenRenderbuffer();
            this.depthStencilPackedBufferHandle = iGlGenRenderbuffer3;
            gl20.glBindRenderbuffer(GL20.GL_RENDERBUFFER, iGlGenRenderbuffer3);
            GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder4 = this.bufferBuilder;
            int i14 = gLFrameBufferBuilder4.samples;
            if (i14 > 0) {
                Gdx.gl31.glRenderbufferStorageMultisample(GL20.GL_RENDERBUFFER, i14, gLFrameBufferBuilder4.packedStencilDepthRenderBufferSpec.internalFormat, i10, i11);
            } else {
                gl20.glRenderbufferStorage(GL20.GL_RENDERBUFFER, gLFrameBufferBuilder4.packedStencilDepthRenderBufferSpec.internalFormat, i10, i11);
            }
            this.hasDepthStencilPackedBuffer = true;
        }
        Array<FrameBufferTextureAttachmentSpec> array = this.bufferBuilder.textureAttachmentSpecs;
        int i15 = array.size;
        boolean z = i15 > 1;
        this.isMRT = z;
        if (z) {
            Array.ArrayIterator<FrameBufferTextureAttachmentSpec> it = array.iterator();
            i4 = 0;
            while (it.hasNext()) {
                FrameBufferTextureAttachmentSpec next = it.next();
                GLTexture gLTextureCreateTexture = createTexture(next);
                this.textureAttachments.add((T) gLTextureCreateTexture);
                if (next.isColorTexture()) {
                    i8 = i11;
                    i9 = i10;
                    gl20.glFramebufferTexture2D(GL20.GL_FRAMEBUFFER, i4 + GL20.GL_COLOR_ATTACHMENT0, GL20.GL_TEXTURE_2D, gLTextureCreateTexture.getTextureObjectHandle(), 0);
                    i4++;
                } else {
                    i8 = i11;
                    i9 = i10;
                    if (next.isDepth) {
                        gl20.glFramebufferTexture2D(GL20.GL_FRAMEBUFFER, GL20.GL_DEPTH_ATTACHMENT, GL20.GL_TEXTURE_2D, gLTextureCreateTexture.getTextureObjectHandle(), 0);
                    } else if (next.isStencil) {
                        gl20.glFramebufferTexture2D(GL20.GL_FRAMEBUFFER, GL20.GL_STENCIL_ATTACHMENT, GL20.GL_TEXTURE_2D, gLTextureCreateTexture.getTextureObjectHandle(), 0);
                    }
                }
                i10 = i9;
                i11 = i8;
            }
            i = i11;
            i2 = i10;
            i3 = GL20.GL_RENDERBUFFER;
        } else {
            i = i11;
            i2 = i10;
            i3 = GL20.GL_RENDERBUFFER;
            if (i15 > 0) {
                GLTexture gLTextureCreateTexture2 = createTexture(array.first());
                this.textureAttachments.add((T) gLTextureCreateTexture2);
                gl20.glBindTexture(gLTextureCreateTexture2.glTarget, gLTextureCreateTexture2.getTextureObjectHandle());
            }
            i4 = 0;
        }
        Array.ArrayIterator<FrameBufferRenderBufferAttachmentSpec> it2 = this.bufferBuilder.colorRenderBufferSpecs.iterator();
        int i16 = i4;
        while (it2.hasNext()) {
            FrameBufferRenderBufferAttachmentSpec next2 = it2.next();
            int iGlGenRenderbuffer4 = gl20.glGenRenderbuffer();
            gl20.glBindRenderbuffer(i3, iGlGenRenderbuffer4);
            int i17 = this.bufferBuilder.samples;
            if (i17 > 0) {
                i6 = i2;
                i7 = i;
                Gdx.gl31.glRenderbufferStorageMultisample(GL20.GL_RENDERBUFFER, i17, next2.internalFormat, i6, i7);
            } else {
                i6 = i2;
                i7 = i;
                gl20.glRenderbufferStorage(i3, next2.internalFormat, i6, i7);
            }
            Gdx.gl.glFramebufferRenderbuffer(GL20.GL_FRAMEBUFFER, i16 + GL20.GL_COLOR_ATTACHMENT0, i3, iGlGenRenderbuffer4);
            this.colorBufferHandles.add(iGlGenRenderbuffer4);
            i16++;
            i = i7;
            i2 = i6;
        }
        int i18 = i2;
        int i19 = i;
        if (this.isMRT) {
            this.defaultDrawBuffers = BufferUtils.newIntBuffer(i16);
            for (i5 = 0; i5 < i16; i5++) {
                this.defaultDrawBuffers.put(i5 + GL20.GL_COLOR_ATTACHMENT0);
            }
            this.defaultDrawBuffers.position(0);
            Gdx.gl30.glDrawBuffers(i16, this.defaultDrawBuffers);
        } else {
            GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder5 = this.bufferBuilder;
            if (gLFrameBufferBuilder5.samples > 0) {
                this.defaultDrawBuffers = BufferUtils.newIntBuffer(i16);
                while (i5 < i16) {
                    this.defaultDrawBuffers.put(i5 + GL20.GL_COLOR_ATTACHMENT0);
                }
                this.defaultDrawBuffers.position(0);
                Gdx.gl30.glDrawBuffers(i16, this.defaultDrawBuffers);
            } else if (gLFrameBufferBuilder5.textureAttachmentSpecs.size > 0) {
                attachFrameBufferColorTexture(this.textureAttachments.first());
            }
        }
        if (this.bufferBuilder.hasDepthRenderBuffer) {
            gl20.glFramebufferRenderbuffer(GL20.GL_FRAMEBUFFER, GL20.GL_DEPTH_ATTACHMENT, i3, this.depthbufferHandle);
        }
        if (this.bufferBuilder.hasStencilRenderBuffer) {
            gl20.glFramebufferRenderbuffer(GL20.GL_FRAMEBUFFER, GL20.GL_STENCIL_ATTACHMENT, i3, this.stencilbufferHandle);
        }
        if (this.bufferBuilder.hasPackedStencilDepthRenderBuffer) {
            gl20.glFramebufferRenderbuffer(GL20.GL_FRAMEBUFFER, GL30.GL_DEPTH_STENCIL_ATTACHMENT, i3, this.depthStencilPackedBufferHandle);
        }
        gl20.glBindRenderbuffer(i3, 0);
        Array.ArrayIterator<T> it3 = this.textureAttachments.iterator();
        while (it3.hasNext()) {
            gl20.glBindTexture(it3.next().glTarget, 0);
        }
        int iGlCheckFramebufferStatus = gl20.glCheckFramebufferStatus(GL20.GL_FRAMEBUFFER);
        if (iGlCheckFramebufferStatus == 36061) {
            GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder6 = this.bufferBuilder;
            if (gLFrameBufferBuilder6.hasDepthRenderBuffer && gLFrameBufferBuilder6.hasStencilRenderBuffer && (Gdx.graphics.supportsExtension("GL_OES_packed_depth_stencil") || Gdx.graphics.supportsExtension("GL_EXT_packed_depth_stencil"))) {
                if (this.bufferBuilder.hasDepthRenderBuffer) {
                    gl20.glDeleteRenderbuffer(this.depthbufferHandle);
                    this.depthbufferHandle = 0;
                }
                if (this.bufferBuilder.hasStencilRenderBuffer) {
                    gl20.glDeleteRenderbuffer(this.stencilbufferHandle);
                    this.stencilbufferHandle = 0;
                }
                if (this.bufferBuilder.hasPackedStencilDepthRenderBuffer) {
                    gl20.glDeleteRenderbuffer(this.depthStencilPackedBufferHandle);
                    this.depthStencilPackedBufferHandle = 0;
                }
                int iGlGenRenderbuffer5 = gl20.glGenRenderbuffer();
                this.depthStencilPackedBufferHandle = iGlGenRenderbuffer5;
                this.hasDepthStencilPackedBuffer = true;
                gl20.glBindRenderbuffer(i3, iGlGenRenderbuffer5);
                int i20 = this.bufferBuilder.samples;
                if (i20 > 0) {
                    Gdx.gl31.glRenderbufferStorageMultisample(GL20.GL_RENDERBUFFER, i20, 35056, i18, i19);
                } else {
                    gl20.glRenderbufferStorage(i3, 35056, i18, i19);
                }
                gl20.glBindRenderbuffer(i3, 0);
                gl20.glFramebufferRenderbuffer(GL20.GL_FRAMEBUFFER, GL20.GL_DEPTH_ATTACHMENT, i3, this.depthStencilPackedBufferHandle);
                gl20.glFramebufferRenderbuffer(GL20.GL_FRAMEBUFFER, GL20.GL_STENCIL_ATTACHMENT, i3, this.depthStencilPackedBufferHandle);
                iGlCheckFramebufferStatus = gl20.glCheckFramebufferStatus(GL20.GL_FRAMEBUFFER);
            }
        }
        gl20.glBindFramebuffer(GL20.GL_FRAMEBUFFER, defaultFramebufferHandle);
        if (iGlCheckFramebufferStatus == 36053) {
            addManagedFrameBuffer(Gdx.app, this);
            return;
        }
        Array.ArrayIterator<T> it4 = this.textureAttachments.iterator();
        while (it4.hasNext()) {
            disposeColorTexture(it4.next());
        }
        if (this.hasDepthStencilPackedBuffer) {
            gl20.glDeleteBuffer(this.depthStencilPackedBufferHandle);
        } else {
            if (this.bufferBuilder.hasDepthRenderBuffer) {
                gl20.glDeleteRenderbuffer(this.depthbufferHandle);
            }
            if (this.bufferBuilder.hasStencilRenderBuffer) {
                gl20.glDeleteRenderbuffer(this.stencilbufferHandle);
            }
        }
        gl20.glDeleteFramebuffer(this.framebufferHandle);
        if (iGlCheckFramebufferStatus == 36054) {
            throw new IllegalStateException("Frame buffer couldn't be constructed: incomplete attachment");
        }
        if (iGlCheckFramebufferStatus == 36057) {
            throw new IllegalStateException("Frame buffer couldn't be constructed: incomplete dimensions");
        }
        if (iGlCheckFramebufferStatus == 36055) {
            throw new IllegalStateException("Frame buffer couldn't be constructed: missing attachment");
        }
        if (iGlCheckFramebufferStatus == 36061) {
            throw new IllegalStateException("Frame buffer couldn't be constructed: unsupported combination of formats");
        }
        if (iGlCheckFramebufferStatus != 36182) {
            throw new IllegalStateException(AbstractC3950lJ.p("Frame buffer couldn't be constructed: unknown error ", iGlCheckFramebufferStatus));
        }
        throw new IllegalStateException("Frame buffer couldn't be constructed: multisample mismatch");
    }

    public abstract T createTexture(FrameBufferTextureAttachmentSpec frameBufferTextureAttachmentSpec);

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        GL20 gl20 = Gdx.gl20;
        Array.ArrayIterator<T> it = this.textureAttachments.iterator();
        while (it.hasNext()) {
            disposeColorTexture(it.next());
        }
        gl20.glDeleteRenderbuffer(this.depthStencilPackedBufferHandle);
        gl20.glDeleteRenderbuffer(this.depthbufferHandle);
        gl20.glDeleteRenderbuffer(this.stencilbufferHandle);
        gl20.glDeleteFramebuffer(this.framebufferHandle);
        Map<Application, Array<GLFrameBuffer>> map = buffers;
        if (map.get(Gdx.app) != null) {
            map.get(Gdx.app).removeValue(this, true);
        }
    }

    public abstract void disposeColorTexture(T t);

    public void end() {
        end(0, 0, Gdx.graphics.getBackBufferWidth(), Gdx.graphics.getBackBufferHeight());
    }

    public int getColorBufferHandle(int i) {
        return this.colorBufferHandles.get(i);
    }

    public T getColorBufferTexture() {
        return this.textureAttachments.first();
    }

    public int getDepthBufferHandle() {
        return this.depthbufferHandle;
    }

    public int getDepthStencilPackedBuffer() {
        return this.depthStencilPackedBufferHandle;
    }

    public int getFramebufferHandle() {
        return this.framebufferHandle;
    }

    public int getHeight() {
        return this.bufferBuilder.height;
    }

    public int getStencilBufferHandle() {
        return this.stencilbufferHandle;
    }

    public Array<T> getTextureAttachments() {
        return this.textureAttachments;
    }

    public int getWidth() {
        return this.bufferBuilder.width;
    }

    public void setFrameBufferViewport() {
        GL20 gl20 = Gdx.gl20;
        GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder = this.bufferBuilder;
        gl20.glViewport(0, 0, gLFrameBufferBuilder.width, gLFrameBufferBuilder.height);
    }

    public void transfer(GLFrameBuffer<T> gLFrameBuffer) {
        Array.ArrayIterator<FrameBufferTextureAttachmentSpec> it = gLFrameBuffer.bufferBuilder.textureAttachmentSpecs.iterator();
        int i = 0;
        while (it.hasNext()) {
            FrameBufferTextureAttachmentSpec next = it.next();
            if (next.isDepth) {
                GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder = this.bufferBuilder;
                if (gLFrameBufferBuilder.hasDepthRenderBuffer || gLFrameBufferBuilder.hasPackedStencilDepthRenderBuffer) {
                    i |= 256;
                }
            }
            if (next.isStencil) {
                GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder2 = this.bufferBuilder;
                if (gLFrameBufferBuilder2.hasStencilRenderBuffer || gLFrameBufferBuilder2.hasPackedStencilDepthRenderBuffer) {
                    i |= 1024;
                }
            }
            if (this.colorBufferHandles.size > 0) {
                i |= 16384;
            }
        }
        transfer(gLFrameBuffer, i);
    }

    public void end(int i, int i2, int i3, int i4) {
        unbind();
        Gdx.gl20.glViewport(i, i2, i3, i4);
    }

    public GLFrameBuffer(GLFrameBufferBuilder<? extends GLFrameBuffer<T>> gLFrameBufferBuilder) {
        this.bufferBuilder = gLFrameBufferBuilder;
        build();
    }

    public static String getManagedStatus() {
        return getManagedStatus(new StringBuilder()).toString();
    }

    public void transfer(GLFrameBuffer<T> gLFrameBuffer, int i) {
        if (gLFrameBuffer.getWidth() == getWidth() && gLFrameBuffer.getHeight() == getHeight()) {
            Gdx.gl.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, this.framebufferHandle);
            Gdx.gl.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, gLFrameBuffer.framebufferHandle);
            Array.ArrayIterator<FrameBufferTextureAttachmentSpec> it = gLFrameBuffer.bufferBuilder.textureAttachmentSpecs.iterator();
            int i2 = i;
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                if (it.next().isColorTexture()) {
                    Gdx.gl30.glReadBuffer(i3 + GL20.GL_COLOR_ATTACHMENT0);
                    IntBuffer intBuffer = singleInt;
                    intBuffer.clear();
                    intBuffer.put(i4 + GL20.GL_COLOR_ATTACHMENT0);
                    intBuffer.flip();
                    Gdx.gl30.glDrawBuffers(1, intBuffer);
                    Gdx.gl30.glBlitFramebuffer(0, 0, getWidth(), getHeight(), 0, 0, gLFrameBuffer.getWidth(), gLFrameBuffer.getHeight(), i2, GL20.GL_NEAREST);
                    i3++;
                    i2 = 16384;
                }
                i4++;
            }
            if (i2 != 16384) {
                Gdx.gl30.glBlitFramebuffer(0, 0, getWidth(), getHeight(), 0, 0, gLFrameBuffer.getWidth(), gLFrameBuffer.getHeight(), i2, GL20.GL_NEAREST);
            }
            IntBuffer intBuffer2 = gLFrameBuffer.defaultDrawBuffers;
            if (intBuffer2 != null) {
                Gdx.gl30.glDrawBuffers(intBuffer2.limit(), gLFrameBuffer.defaultDrawBuffers);
            }
            Gdx.gl.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, 0);
            Gdx.gl.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, 0);
            return;
        }
        throw new IllegalArgumentException("source and destination frame buffers must have same size.");
    }
}
