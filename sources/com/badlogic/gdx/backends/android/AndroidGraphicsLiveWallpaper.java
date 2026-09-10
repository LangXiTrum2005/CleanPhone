package com.badlogic.gdx.backends.android;

import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20;
import com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidGraphicsLiveWallpaper extends AndroidGraphics {
    public AndroidGraphicsLiveWallpaper(AndroidLiveWallpaper androidLiveWallpaper, AndroidApplicationConfiguration androidApplicationConfiguration, ResolutionStrategy resolutionStrategy) {
        super(androidLiveWallpaper, androidApplicationConfiguration, resolutionStrategy, false);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidGraphics
    public GLSurfaceView20 createGLSurfaceView(AndroidApplicationBase androidApplicationBase, ResolutionStrategy resolutionStrategy) {
        if (!checkGL20()) {
            throw new GdxRuntimeException("libGDX requires OpenGL ES 2.0");
        }
        GLSurfaceView.EGLConfigChooser eglConfigChooser = getEglConfigChooser();
        GLSurfaceView20 gLSurfaceView20 = new GLSurfaceView20(androidApplicationBase.getContext(), resolutionStrategy) { // from class: com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper.1
            @Override // android.view.SurfaceView
            public SurfaceHolder getHolder() {
                return AndroidGraphicsLiveWallpaper.this.getSurfaceHolder();
            }
        };
        if (eglConfigChooser != null) {
            gLSurfaceView20.setEGLConfigChooser(eglConfigChooser);
        } else {
            AndroidApplicationConfiguration androidApplicationConfiguration = this.config;
            gLSurfaceView20.setEGLConfigChooser(androidApplicationConfiguration.r, androidApplicationConfiguration.g, androidApplicationConfiguration.b, androidApplicationConfiguration.f201a, androidApplicationConfiguration.depth, androidApplicationConfiguration.stencil);
        }
        gLSurfaceView20.setRenderer(this);
        return gLSurfaceView20;
    }

    public SurfaceHolder getSurfaceHolder() {
        SurfaceHolder surfaceHolder;
        synchronized (((AndroidLiveWallpaper) this.app).service.sync) {
            surfaceHolder = ((AndroidLiveWallpaper) this.app).service.getSurfaceHolder();
        }
        return surfaceHolder;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidGraphics
    public void logManagedCachesStatus() {
        if (AndroidLiveWallpaperService.DEBUG) {
            super.logManagedCachesStatus();
        }
    }

    public void onDestroyGLSurfaceView() {
        GLSurfaceView20 gLSurfaceView20 = this.view;
        if (gLSurfaceView20 != null) {
            try {
                gLSurfaceView20.onDetachedFromWindow();
                String str = AndroidLiveWallpaperService.TAG;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidGraphics, android.opengl.GLSurfaceView.Renderer
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
                    this.synch.notifyAll();
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
            this.app.getApplicationListener().resume();
            Gdx.app.log("AndroidGraphics", "resumed");
        }
        if (z) {
            synchronized (this.app.getRunnables()) {
                try {
                    this.app.getExecutedRunnables().clear();
                    this.app.getExecutedRunnables().addAll(this.app.getRunnables());
                    this.app.getRunnables().clear();
                    for (int i = 0; i < this.app.getExecutedRunnables().size; i++) {
                        try {
                            this.app.getExecutedRunnables().get(i).run();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.app.getInput().processEvents();
            this.frameId++;
            this.app.getApplicationListener().render();
        }
        if (z2) {
            this.app.getApplicationListener().pause();
            Gdx.app.log("AndroidGraphics", "paused");
        }
        if (z3) {
            this.app.getApplicationListener().dispose();
            Gdx.app.log("AndroidGraphics", "destroyed");
        }
        if (jNanoTime - this.frameStart > C.NANOS_PER_SECOND) {
            this.fps = this.frames;
            this.frames = 0;
            this.frameStart = jNanoTime;
        }
        this.frames++;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidGraphics
    public void resume() {
        synchronized (this.synch) {
            this.running = true;
            this.resume = true;
            while (this.resume) {
                try {
                    requestRendering();
                    this.synch.wait();
                } catch (InterruptedException unused) {
                    Gdx.app.log("AndroidGraphics", "waiting for resume synchronization failed!");
                }
            }
        }
    }
}
