package com.badlogic.gdx.backends.android;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import com.badlogic.gdx.AbstractGraphics;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.LifecycleListener;
import com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20;
import com.badlogic.gdx.backends.android.surfaceview.GdxEglConfigChooser;
import com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy;
import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.GL31;
import com.badlogic.gdx.graphics.GL32;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureArray;
import com.badlogic.gdx.graphics.glutils.GLFrameBuffer;
import com.badlogic.gdx.graphics.glutils.GLVersion;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.SnapshotArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public class AndroidGraphics extends AbstractGraphics implements GLSurfaceView.Renderer {
    private static final String LOG_TAG = "AndroidGraphics";
    static volatile boolean enforceContinuousRendering = false;
    AndroidApplicationBase app;
    private Graphics.BufferFormat bufferFormat;
    protected final AndroidApplicationConfiguration config;
    volatile boolean created;
    protected float deltaTime;
    private float density;
    volatile boolean destroy;
    EGLContext eglContext;
    String extensions;
    protected int fps;
    protected long frameId;
    protected long frameStart;
    protected int frames;
    GL20 gl20;
    GL30 gl30;
    GLVersion glVersion;
    int height;
    private boolean isContinuous;
    protected long lastFrameTime;
    volatile boolean pause;
    private float ppcX;
    private float ppcY;
    private float ppiX;
    private float ppiY;
    volatile boolean resume;
    volatile boolean running;
    int safeInsetBottom;
    int safeInsetLeft;
    int safeInsetRight;
    int safeInsetTop;
    Object synch;
    int[] value;
    final GLSurfaceView20 view;
    int width;

    public class AndroidDisplayMode extends Graphics.DisplayMode {
        public AndroidDisplayMode(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4);
        }
    }

    public class AndroidMonitor extends Graphics.Monitor {
        public AndroidMonitor(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    public AndroidGraphics(AndroidApplicationBase androidApplicationBase, AndroidApplicationConfiguration androidApplicationConfiguration, ResolutionStrategy resolutionStrategy) {
        this(androidApplicationBase, androidApplicationConfiguration, resolutionStrategy, true);
    }

    private int getAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.value) ? this.value[0] : i2;
    }

    public boolean checkGL20() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344}, new EGLConfig[10], 10, iArr);
        egl10.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr[0] > 0;
    }

    public void clearManagedCaches() {
        Mesh.clearAllMeshes(this.app);
        Texture.clearAllTextures(this.app);
        Cubemap.clearAllCubemaps(this.app);
        TextureArray.clearAllTextureArrays(this.app);
        ShaderProgram.clearAllShaderPrograms(this.app);
        GLFrameBuffer.clearAllFrameBuffers(this.app);
        logManagedCachesStatus();
    }

    public GLSurfaceView20 createGLSurfaceView(AndroidApplicationBase androidApplicationBase, ResolutionStrategy resolutionStrategy) {
        if (!checkGL20()) {
            throw new GdxRuntimeException("libGDX requires OpenGL ES 2.0");
        }
        GLSurfaceView.EGLConfigChooser eglConfigChooser = getEglConfigChooser();
        GLSurfaceView20 gLSurfaceView20 = new GLSurfaceView20(androidApplicationBase.getContext(), resolutionStrategy, this.config.useGL30 ? 3 : 2);
        if (eglConfigChooser != null) {
            gLSurfaceView20.setEGLConfigChooser(eglConfigChooser);
        } else {
            AndroidApplicationConfiguration androidApplicationConfiguration = this.config;
            gLSurfaceView20.setEGLConfigChooser(androidApplicationConfiguration.r, androidApplicationConfiguration.g, androidApplicationConfiguration.b, androidApplicationConfiguration.f201a, androidApplicationConfiguration.depth, androidApplicationConfiguration.stencil);
        }
        gLSurfaceView20.setRenderer(this);
        return gLSurfaceView20;
    }

    public void destroy() {
        synchronized (this.synch) {
            this.running = false;
            this.destroy = true;
            while (this.destroy) {
                try {
                    this.synch.wait();
                } catch (InterruptedException unused) {
                    Gdx.app.log(LOG_TAG, "waiting for destroy synchronization failed!");
                }
            }
        }
    }

    @Override // com.badlogic.gdx.Graphics
    public int getBackBufferHeight() {
        return this.height;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getBackBufferWidth() {
        return this.width;
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.BufferFormat getBufferFormat() {
        return this.bufferFormat;
    }

    @Override // com.badlogic.gdx.Graphics
    public float getDeltaTime() {
        return this.deltaTime;
    }

    @Override // com.badlogic.gdx.AbstractGraphics, com.badlogic.gdx.Graphics
    public float getDensity() {
        return this.density;
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.DisplayMode getDisplayMode(Graphics.Monitor monitor) {
        return getDisplayMode();
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.DisplayMode[] getDisplayModes(Graphics.Monitor monitor) {
        return getDisplayModes();
    }

    public GLSurfaceView.EGLConfigChooser getEglConfigChooser() {
        AndroidApplicationConfiguration androidApplicationConfiguration = this.config;
        return new GdxEglConfigChooser(androidApplicationConfiguration.r, androidApplicationConfiguration.g, androidApplicationConfiguration.b, androidApplicationConfiguration.f201a, androidApplicationConfiguration.depth, androidApplicationConfiguration.stencil, androidApplicationConfiguration.numSamples);
    }

    @Override // com.badlogic.gdx.Graphics
    public long getFrameId() {
        return this.frameId;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getFramesPerSecond() {
        return this.fps;
    }

    @Override // com.badlogic.gdx.Graphics
    public GL20 getGL20() {
        return this.gl20;
    }

    @Override // com.badlogic.gdx.Graphics
    public GL30 getGL30() {
        return this.gl30;
    }

    @Override // com.badlogic.gdx.Graphics
    public GL31 getGL31() {
        return null;
    }

    @Override // com.badlogic.gdx.Graphics
    public GL32 getGL32() {
        return null;
    }

    @Override // com.badlogic.gdx.Graphics
    public GLVersion getGLVersion() {
        return this.glVersion;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getHeight() {
        return this.height;
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.Monitor getMonitor() {
        return getPrimaryMonitor();
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.Monitor[] getMonitors() {
        return new Graphics.Monitor[]{getPrimaryMonitor()};
    }

    @Override // com.badlogic.gdx.Graphics
    public float getPpcX() {
        return this.ppcX;
    }

    @Override // com.badlogic.gdx.Graphics
    public float getPpcY() {
        return this.ppcY;
    }

    @Override // com.badlogic.gdx.Graphics
    public float getPpiX() {
        return this.ppiX;
    }

    @Override // com.badlogic.gdx.Graphics
    public float getPpiY() {
        return this.ppiY;
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.Monitor getPrimaryMonitor() {
        return new AndroidMonitor(0, 0, "Primary Monitor");
    }

    @Override // com.badlogic.gdx.Graphics
    public int getSafeInsetBottom() {
        return this.safeInsetBottom;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getSafeInsetLeft() {
        return this.safeInsetLeft;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getSafeInsetRight() {
        return this.safeInsetRight;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getSafeInsetTop() {
        return this.safeInsetTop;
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.GraphicsType getType() {
        return Graphics.GraphicsType.AndroidGL;
    }

    public View getView() {
        return this.view;
    }

    @Override // com.badlogic.gdx.Graphics
    public int getWidth() {
        return this.width;
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean isContinuousRendering() {
        return this.isContinuous;
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean isFullscreen() {
        return true;
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean isGL30Available() {
        return this.gl30 != null;
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean isGL31Available() {
        return false;
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean isGL32Available() {
        return false;
    }

    public void logConfig(EGLConfig eGLConfig) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        int attrib = getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12324, 0);
        int attrib2 = getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12323, 0);
        int attrib3 = getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12322, 0);
        int attrib4 = getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12321, 0);
        int attrib5 = getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12325, 0);
        int attrib6 = getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12326, 0);
        int iMax = Math.max(getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, 12337, 0), getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, GdxEglConfigChooser.EGL_COVERAGE_SAMPLES_NV, 0));
        boolean z = getAttrib(egl10, eGLDisplayEglGetDisplay, eGLConfig, GdxEglConfigChooser.EGL_COVERAGE_SAMPLES_NV, 0) != 0;
        Application application = Gdx.app;
        StringBuilder sbT = AbstractC3950lJ.t("framebuffer: (", attrib, ", ", attrib2, ", ");
        sbT.append(attrib3);
        sbT.append(", ");
        sbT.append(attrib4);
        sbT.append(")");
        application.log(LOG_TAG, sbT.toString());
        Gdx.app.log(LOG_TAG, "depthbuffer: (" + attrib5 + ")");
        Gdx.app.log(LOG_TAG, "stencilbuffer: (" + attrib6 + ")");
        Gdx.app.log(LOG_TAG, "samples: (" + iMax + ")");
        Gdx.app.log(LOG_TAG, "coverage sampling: (" + z + ")");
        this.bufferFormat = new Graphics.BufferFormat(attrib, attrib2, attrib3, attrib4, attrib5, attrib6, iMax, z);
    }

    public void logManagedCachesStatus() {
        Gdx.app.log(LOG_TAG, Mesh.getManagedStatus());
        Gdx.app.log(LOG_TAG, Texture.getManagedStatus());
        Gdx.app.log(LOG_TAG, Cubemap.getManagedStatus());
        Gdx.app.log(LOG_TAG, ShaderProgram.getManagedStatus());
        Gdx.app.log(LOG_TAG, GLFrameBuffer.getManagedStatus());
    }

    @Override // com.badlogic.gdx.Graphics
    public Cursor newCursor(Pixmap pixmap, int i, int i2) {
        return null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long jNanoTime = System.nanoTime();
        if (this.resume) {
            this.deltaTime = 0.0f;
        } else {
            this.deltaTime = (jNanoTime - this.lastFrameTime) / 1.0E9f;
        }
        this.lastFrameTime = jNanoTime;
        synchronized (this.synch) {
            try {
                z = this.running;
                z2 = this.pause;
                z3 = this.destroy;
                z4 = this.resume;
                if (this.resume) {
                    this.resume = false;
                }
                if (this.pause) {
                    this.pause = false;
                    this.synch.notifyAll();
                }
                if (this.destroy) {
                    this.destroy = false;
                    this.synch.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            SnapshotArray<LifecycleListener> lifecycleListeners = this.app.getLifecycleListeners();
            synchronized (lifecycleListeners) {
                try {
                    LifecycleListener[] lifecycleListenerArrBegin = lifecycleListeners.begin();
                    int i = lifecycleListeners.size;
                    for (int i2 = 0; i2 < i; i2++) {
                        lifecycleListenerArrBegin[i2].resume();
                    }
                    lifecycleListeners.end();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.app.getApplicationListener().resume();
            Gdx.app.log(LOG_TAG, "resumed");
        }
        if (z) {
            synchronized (this.app.getRunnables()) {
                this.app.getExecutedRunnables().clear();
                this.app.getExecutedRunnables().addAll(this.app.getRunnables());
                this.app.getRunnables().clear();
            }
            for (int i3 = 0; i3 < this.app.getExecutedRunnables().size; i3++) {
                this.app.getExecutedRunnables().get(i3).run();
            }
            this.app.getInput().processEvents();
            this.frameId++;
            this.app.getApplicationListener().render();
        }
        if (z2) {
            SnapshotArray<LifecycleListener> lifecycleListeners2 = this.app.getLifecycleListeners();
            synchronized (lifecycleListeners2) {
                try {
                    LifecycleListener[] lifecycleListenerArrBegin2 = lifecycleListeners2.begin();
                    int i4 = lifecycleListeners2.size;
                    for (int i5 = 0; i5 < i4; i5++) {
                        lifecycleListenerArrBegin2[i5].pause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.app.getApplicationListener().pause();
            Gdx.app.log(LOG_TAG, "paused");
        }
        if (z3) {
            SnapshotArray<LifecycleListener> lifecycleListeners3 = this.app.getLifecycleListeners();
            synchronized (lifecycleListeners3) {
                try {
                    LifecycleListener[] lifecycleListenerArrBegin3 = lifecycleListeners3.begin();
                    int i6 = lifecycleListeners3.size;
                    for (int i7 = 0; i7 < i6; i7++) {
                        lifecycleListenerArrBegin3[i7].dispose();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            this.app.getApplicationListener().dispose();
            Gdx.app.log(LOG_TAG, "destroyed");
        }
        if (jNanoTime - this.frameStart > C.NANOS_PER_SECOND) {
            this.fps = this.frames;
            this.frames = 0;
            this.frameStart = jNanoTime;
        }
        this.frames++;
    }

    public void onPauseGLSurfaceView() {
        GLSurfaceView20 gLSurfaceView20 = this.view;
        if (gLSurfaceView20 != null) {
            gLSurfaceView20.onPause();
        }
    }

    public void onResumeGLSurfaceView() {
        GLSurfaceView20 gLSurfaceView20 = this.view;
        if (gLSurfaceView20 != null) {
            gLSurfaceView20.onResume();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        try {
            this.width = i;
            this.height = i2;
            updatePpi();
            updateSafeAreaInsets();
            gl10.glViewport(0, 0, this.width, this.height);
            if (!this.created) {
                this.app.getApplicationListener().create();
                this.created = true;
                synchronized (this) {
                    this.running = true;
                }
            }
            this.app.getApplicationListener().resize(i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.eglContext = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        setupGL(gl10);
        logConfig(eGLConfig);
        updatePpi();
        updateSafeAreaInsets();
        Mesh.invalidateAllMeshes(this.app);
        Texture.invalidateAllTextures(this.app);
        Cubemap.invalidateAllCubemaps(this.app);
        TextureArray.invalidateAllTextureArrays(this.app);
        ShaderProgram.invalidateAllShaderPrograms(this.app);
        GLFrameBuffer.invalidateAllFrameBuffers(this.app);
        logManagedCachesStatus();
        Display defaultDisplay = this.app.getWindowManager().getDefaultDisplay();
        this.width = defaultDisplay.getWidth();
        this.height = defaultDisplay.getHeight();
        this.lastFrameTime = System.nanoTime();
        gl10.glViewport(0, 0, this.width, this.height);
    }

    public void pause() {
        synchronized (this.synch) {
            try {
                if (this.running) {
                    this.running = false;
                    this.pause = true;
                    this.view.queueEvent(new Runnable() { // from class: com.badlogic.gdx.backends.android.AndroidGraphics.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (AndroidGraphics.this.pause) {
                                AndroidGraphics.this.onDrawFrame(null);
                            }
                        }
                    });
                    while (this.pause) {
                        try {
                            this.synch.wait(4000L);
                            if (this.pause) {
                                Gdx.app.error(LOG_TAG, "waiting for pause synchronization took too long; assuming deadlock and killing");
                                Process.killProcess(Process.myPid());
                            }
                        } catch (InterruptedException unused) {
                            Gdx.app.log(LOG_TAG, "waiting for pause synchronization failed!");
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void preserveEGLContextOnPause() {
        this.view.setPreserveEGLContextOnPause(true);
    }

    @Override // com.badlogic.gdx.Graphics
    public void requestRendering() {
        GLSurfaceView20 gLSurfaceView20 = this.view;
        if (gLSurfaceView20 != null) {
            gLSurfaceView20.requestRender();
        }
    }

    public void resume() {
        synchronized (this.synch) {
            this.running = true;
            this.resume = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.badlogic.gdx.Graphics
    public void setContinuousRendering(boolean z) {
        if (this.view != null) {
            ?? r2 = (enforceContinuousRendering || z) ? 1 : 0;
            this.isContinuous = r2;
            this.view.setRenderMode(r2);
        }
    }

    @Override // com.badlogic.gdx.Graphics
    public void setCursor(Cursor cursor) {
    }

    @Override // com.badlogic.gdx.Graphics
    public void setForegroundFPS(int i) {
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean setFullscreenMode(Graphics.DisplayMode displayMode) {
        return false;
    }

    @Override // com.badlogic.gdx.Graphics
    public void setGL20(GL20 gl20) {
        this.gl20 = gl20;
        if (this.gl30 == null) {
            Gdx.gl = gl20;
            Gdx.gl20 = gl20;
        }
    }

    @Override // com.badlogic.gdx.Graphics
    public void setGL30(GL30 gl30) {
        this.gl30 = gl30;
        if (gl30 != null) {
            this.gl20 = gl30;
            Gdx.gl = gl30;
            Gdx.gl20 = gl30;
            Gdx.gl30 = gl30;
        }
    }

    @Override // com.badlogic.gdx.Graphics
    public void setGL31(GL31 gl31) {
    }

    @Override // com.badlogic.gdx.Graphics
    public void setGL32(GL32 gl32) {
    }

    @Override // com.badlogic.gdx.Graphics
    public void setResizable(boolean z) {
    }

    @Override // com.badlogic.gdx.Graphics
    public void setSystemCursor(Cursor.SystemCursor systemCursor) {
        AndroidCursor.setSystemCursor(((AndroidGraphics) this.app.getGraphics()).getView(), systemCursor);
    }

    @Override // com.badlogic.gdx.Graphics
    public void setTitle(String str) {
    }

    @Override // com.badlogic.gdx.Graphics
    public void setUndecorated(boolean z) {
        this.app.getApplicationWindow().setFlags(1024, z ? 1 : 0);
    }

    @Override // com.badlogic.gdx.Graphics
    public void setVSync(boolean z) {
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean setWindowedMode(int i, int i2) {
        return false;
    }

    public void setupGL(GL10 gl10) {
        GLVersion gLVersion = new GLVersion(Application.ApplicationType.Android, gl10.glGetString(GL20.GL_VERSION), gl10.glGetString(GL20.GL_VENDOR), gl10.glGetString(GL20.GL_RENDERER));
        this.glVersion = gLVersion;
        if (!this.config.useGL30 || gLVersion.getMajorVersion() <= 2) {
            if (this.gl20 != null) {
                return;
            }
            AndroidGL20 androidGL20 = new AndroidGL20();
            this.gl20 = androidGL20;
            Gdx.gl = androidGL20;
            Gdx.gl20 = androidGL20;
        } else {
            if (this.gl30 != null) {
                return;
            }
            AndroidGL30 androidGL30 = new AndroidGL30();
            this.gl30 = androidGL30;
            this.gl20 = androidGL30;
            Gdx.gl = androidGL30;
            Gdx.gl20 = androidGL30;
            Gdx.gl30 = androidGL30;
        }
        Gdx.app.log(LOG_TAG, "OGL renderer: " + gl10.glGetString(GL20.GL_RENDERER));
        Gdx.app.log(LOG_TAG, "OGL vendor: " + gl10.glGetString(GL20.GL_VENDOR));
        Gdx.app.log(LOG_TAG, "OGL version: " + gl10.glGetString(GL20.GL_VERSION));
        Gdx.app.log(LOG_TAG, "OGL extensions: " + gl10.glGetString(GL20.GL_EXTENSIONS));
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean supportsDisplayModeChange() {
        return false;
    }

    @Override // com.badlogic.gdx.Graphics
    public boolean supportsExtension(String str) {
        if (this.extensions == null) {
            this.extensions = Gdx.gl.glGetString(GL20.GL_EXTENSIONS);
        }
        return this.extensions.contains(str);
    }

    public void updatePpi() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.app.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.xdpi;
        this.ppiX = f;
        float f2 = displayMetrics.ydpi;
        this.ppiY = f2;
        this.ppcX = f / 2.54f;
        this.ppcY = f2 / 2.54f;
        this.density = displayMetrics.density;
    }

    @TargetApi(28)
    public void updateSafeAreaInsets() {
        this.safeInsetLeft = 0;
        this.safeInsetTop = 0;
        this.safeInsetRight = 0;
        this.safeInsetBottom = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                DisplayCutout displayCutout = this.app.getApplicationWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
                if (displayCutout != null) {
                    this.safeInsetRight = displayCutout.getSafeInsetRight();
                    this.safeInsetBottom = displayCutout.getSafeInsetBottom();
                    this.safeInsetTop = displayCutout.getSafeInsetTop();
                    this.safeInsetLeft = displayCutout.getSafeInsetLeft();
                }
            } catch (UnsupportedOperationException unused) {
                Gdx.app.log(LOG_TAG, "Unable to get safe area insets");
            }
        }
    }

    public AndroidGraphics(AndroidApplicationBase androidApplicationBase, AndroidApplicationConfiguration androidApplicationConfiguration, ResolutionStrategy resolutionStrategy, boolean z) {
        this.lastFrameTime = System.nanoTime();
        this.deltaTime = 0.0f;
        this.frameStart = System.nanoTime();
        this.frameId = -1L;
        this.frames = 0;
        this.created = false;
        this.running = false;
        this.pause = false;
        this.resume = false;
        this.destroy = false;
        this.ppiX = 0.0f;
        this.ppiY = 0.0f;
        this.ppcX = 0.0f;
        this.ppcY = 0.0f;
        this.density = 1.0f;
        this.bufferFormat = new Graphics.BufferFormat(8, 8, 8, 0, 16, 0, 0, false);
        this.isContinuous = true;
        this.value = new int[1];
        this.synch = new Object();
        this.config = androidApplicationConfiguration;
        this.app = androidApplicationBase;
        GLSurfaceView20 gLSurfaceView20CreateGLSurfaceView = createGLSurfaceView(androidApplicationBase, resolutionStrategy);
        this.view = gLSurfaceView20CreateGLSurfaceView;
        preserveEGLContextOnPause();
        if (z) {
            gLSurfaceView20CreateGLSurfaceView.setFocusable(true);
            gLSurfaceView20CreateGLSurfaceView.setFocusableInTouchMode(true);
        }
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.DisplayMode getDisplayMode() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = ((DisplayManager) this.app.getContext().getSystemService("display")).getDisplay(0);
        display.getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int iRoundPositive = MathUtils.roundPositive(display.getRefreshRate());
        AndroidApplicationConfiguration androidApplicationConfiguration = this.config;
        return new AndroidDisplayMode(i, i2, iRoundPositive, androidApplicationConfiguration.r + androidApplicationConfiguration.g + androidApplicationConfiguration.b + androidApplicationConfiguration.f201a);
    }

    @Override // com.badlogic.gdx.Graphics
    public Graphics.DisplayMode[] getDisplayModes() {
        return new Graphics.DisplayMode[]{getDisplayMode()};
    }
}
