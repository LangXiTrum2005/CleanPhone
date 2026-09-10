package com.badlogic.gdx.backends.android;

import android.app.WallpaperColors;
import android.os.Build;
import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4544s4;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class AndroidLiveWallpaperService extends WallpaperService {
    static boolean DEBUG = false;
    static final String TAG = "WallpaperService";
    protected int viewFormat;
    protected int viewHeight;
    protected int viewWidth;
    protected volatile AndroidLiveWallpaper app = null;
    protected SurfaceHolder.Callback view = null;
    protected int engines = 0;
    protected int visibleEngines = 0;
    protected volatile AndroidWallpaperEngine linkedEngine = null;
    protected volatile boolean isPreviewNotified = false;
    protected volatile boolean notifiedPreviewState = false;
    volatile int[] sync = new int[0];

    public class AndroidWallpaperEngine extends WallpaperService.Engine {
        protected int engineFormat;
        protected int engineHeight;
        protected boolean engineIsVisible;
        protected int engineWidth;
        boolean iconDropConsumed;
        boolean offsetsConsumed;
        int xIconDrop;
        float xOffset;
        float xOffsetStep;
        int xPixelOffset;
        int yIconDrop;
        float yOffset;
        float yOffsetStep;
        int yPixelOffset;

        public AndroidWallpaperEngine() {
            super(AndroidLiveWallpaperService.this);
            this.engineIsVisible = false;
            this.iconDropConsumed = true;
            this.offsetsConsumed = true;
            this.xOffset = 0.0f;
            this.yOffset = 0.0f;
            this.xOffsetStep = 0.0f;
            this.yOffsetStep = 0.0f;
            this.xPixelOffset = 0;
            this.yPixelOffset = 0;
            if (AndroidLiveWallpaperService.DEBUG) {
                hashCode();
            }
        }

        private void notifySurfaceChanged(int i, int i2, int i3, boolean z) {
            if (!z) {
                AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
                if (i == androidLiveWallpaperService.viewFormat && i2 == androidLiveWallpaperService.viewWidth && i3 == androidLiveWallpaperService.viewHeight) {
                    String str = AndroidLiveWallpaperService.TAG;
                    return;
                }
            }
            this.engineFormat = i;
            this.engineWidth = i2;
            this.engineHeight = i3;
            if (AndroidLiveWallpaperService.this.linkedEngine != this) {
                String str2 = AndroidLiveWallpaperService.TAG;
                return;
            }
            AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
            androidLiveWallpaperService2.viewFormat = this.engineFormat;
            androidLiveWallpaperService2.viewWidth = this.engineWidth;
            androidLiveWallpaperService2.viewHeight = this.engineHeight;
            SurfaceHolder.Callback callback = androidLiveWallpaperService2.view;
            SurfaceHolder surfaceHolder = getSurfaceHolder();
            AndroidLiveWallpaperService androidLiveWallpaperService3 = AndroidLiveWallpaperService.this;
            callback.surfaceChanged(surfaceHolder, androidLiveWallpaperService3.viewFormat, androidLiveWallpaperService3.viewWidth, androidLiveWallpaperService3.viewHeight);
        }

        private void notifyVisibilityChanged(boolean z) {
            if (this.engineIsVisible == z) {
                String str = AndroidLiveWallpaperService.TAG;
                return;
            }
            this.engineIsVisible = z;
            if (z) {
                onResume();
            } else {
                onPause();
            }
        }

        public void notifyIconDropped() {
            if (AndroidLiveWallpaperService.this.linkedEngine == this && (AndroidLiveWallpaperService.this.app.listener instanceof AndroidWallpaperListener) && !this.iconDropConsumed) {
                this.iconDropConsumed = true;
                AndroidLiveWallpaperService.this.app.postRunnable(new Runnable() { // from class: com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.AndroidWallpaperEngine.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AndroidWallpaperEngine androidWallpaperEngine;
                        boolean z;
                        synchronized (AndroidLiveWallpaperService.this.sync) {
                            AndroidWallpaperEngine androidWallpaperEngine2 = AndroidLiveWallpaperService.this.linkedEngine;
                            androidWallpaperEngine = AndroidWallpaperEngine.this;
                            z = androidWallpaperEngine2 == androidWallpaperEngine;
                        }
                        if (z) {
                            AndroidWallpaperListener androidWallpaperListener = (AndroidWallpaperListener) AndroidLiveWallpaperService.this.app.listener;
                            AndroidWallpaperEngine androidWallpaperEngine3 = AndroidWallpaperEngine.this;
                            androidWallpaperListener.iconDropped(androidWallpaperEngine3.xIconDrop, androidWallpaperEngine3.yIconDrop);
                        }
                    }
                });
            }
        }

        public void notifyOffsetsChanged() {
            if (AndroidLiveWallpaperService.this.linkedEngine == this && (AndroidLiveWallpaperService.this.app.listener instanceof AndroidWallpaperListener) && !this.offsetsConsumed) {
                this.offsetsConsumed = true;
                AndroidLiveWallpaperService.this.app.postRunnable(new Runnable() { // from class: com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.AndroidWallpaperEngine.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AndroidWallpaperEngine androidWallpaperEngine;
                        boolean z;
                        synchronized (AndroidLiveWallpaperService.this.sync) {
                            AndroidWallpaperEngine androidWallpaperEngine2 = AndroidLiveWallpaperService.this.linkedEngine;
                            androidWallpaperEngine = AndroidWallpaperEngine.this;
                            z = androidWallpaperEngine2 == androidWallpaperEngine;
                        }
                        if (z) {
                            AndroidWallpaperListener androidWallpaperListener = (AndroidWallpaperListener) AndroidLiveWallpaperService.this.app.listener;
                            AndroidWallpaperEngine androidWallpaperEngine3 = AndroidWallpaperEngine.this;
                            androidWallpaperListener.offsetChange(androidWallpaperEngine3.xOffset, androidWallpaperEngine3.yOffset, androidWallpaperEngine3.xOffsetStep, androidWallpaperEngine3.yOffsetStep, androidWallpaperEngine3.xPixelOffset, androidWallpaperEngine3.yPixelOffset);
                        }
                    }
                });
            }
        }

        public void notifyPreviewState() {
            if (AndroidLiveWallpaperService.this.linkedEngine == this && (AndroidLiveWallpaperService.this.app.listener instanceof AndroidWallpaperListener)) {
                final boolean zIsPreview = AndroidLiveWallpaperService.this.linkedEngine.isPreview();
                AndroidLiveWallpaperService.this.app.postRunnable(new Runnable() { // from class: com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.AndroidWallpaperEngine.3
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z;
                        AndroidLiveWallpaper androidLiveWallpaper;
                        synchronized (AndroidLiveWallpaperService.this.sync) {
                            try {
                                if (AndroidLiveWallpaperService.this.isPreviewNotified && AndroidLiveWallpaperService.this.notifiedPreviewState == zIsPreview) {
                                    z = false;
                                } else {
                                    AndroidLiveWallpaperService.this.notifiedPreviewState = zIsPreview;
                                    AndroidLiveWallpaperService.this.isPreviewNotified = true;
                                    z = true;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (!z || (androidLiveWallpaper = AndroidLiveWallpaperService.this.app) == null) {
                            return;
                        }
                        ((AndroidWallpaperListener) androidLiveWallpaper.listener).previewStateChange(zIsPreview);
                    }
                });
            }
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public Bundle onCommand(String str, int i, int i2, int i3, Bundle bundle, boolean z) {
            if (AndroidLiveWallpaperService.DEBUG) {
                Objects.toString(bundle);
                AndroidWallpaperEngine androidWallpaperEngine = AndroidLiveWallpaperService.this.linkedEngine;
            }
            if (str.equals("android.home.drop")) {
                this.iconDropConsumed = false;
                this.xIconDrop = i;
                this.yIconDrop = i2;
                notifyIconDropped();
            }
            return super.onCommand(str, i, i2, i3, bundle, z);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public WallpaperColors onComputeColors() {
            Color[] colorArr;
            Application application = Gdx.app;
            if (Build.VERSION.SDK_INT < 27 || !(application instanceof AndroidLiveWallpaper) || (colorArr = ((AndroidLiveWallpaper) application).wallpaperColors) == null) {
                return super.onComputeColors();
            }
            AbstractC4544s4.f();
            Color color = colorArr[0];
            android.graphics.Color colorValueOf = android.graphics.Color.valueOf(color.r, color.g, color.b, color.f202a);
            Color color2 = colorArr[1];
            android.graphics.Color colorValueOf2 = android.graphics.Color.valueOf(color2.r, color2.g, color2.b, color2.f202a);
            Color color3 = colorArr[2];
            return AbstractC4544s4.a(colorValueOf, colorValueOf2, android.graphics.Color.valueOf(color3.r, color3.g, color3.b, color3.f202a));
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onCreate(SurfaceHolder surfaceHolder) {
            if (AndroidLiveWallpaperService.DEBUG) {
                hashCode();
                AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
                int i = androidLiveWallpaperService.engines;
                AndroidWallpaperEngine androidWallpaperEngine = androidLiveWallpaperService.linkedEngine;
                Thread.currentThread().toString();
            }
            super.onCreate(surfaceHolder);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onDestroy() {
            super.onDestroy();
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onOffsetsChanged(float f, float f2, float f3, float f4, int i, int i2) {
            this.offsetsConsumed = false;
            this.xOffset = f;
            this.yOffset = f2;
            this.xOffsetStep = f3;
            this.yOffsetStep = f4;
            this.xPixelOffset = i;
            this.yPixelOffset = i2;
            notifyOffsetsChanged();
            if (!Gdx.graphics.isContinuousRendering()) {
                Gdx.graphics.requestRendering();
            }
            super.onOffsetsChanged(f, f2, f3, f4, i, i2);
        }

        public void onPause() {
            AndroidLiveWallpaperService.this.visibleEngines--;
            if (AndroidLiveWallpaperService.DEBUG) {
                hashCode();
                AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
                int i = androidLiveWallpaperService.engines;
                AndroidWallpaperEngine androidWallpaperEngine = androidLiveWallpaperService.linkedEngine;
                int i2 = AndroidLiveWallpaperService.this.visibleEngines;
            }
            AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
            int i3 = androidLiveWallpaperService2.visibleEngines;
            int i4 = androidLiveWallpaperService2.engines;
            if (i3 >= i4) {
                androidLiveWallpaperService2.visibleEngines = Math.max(i4 - 1, 0);
            }
            if (AndroidLiveWallpaperService.this.linkedEngine != null) {
                AndroidLiveWallpaperService androidLiveWallpaperService3 = AndroidLiveWallpaperService.this;
                if (androidLiveWallpaperService3.visibleEngines == 0) {
                    androidLiveWallpaperService3.app.onPause();
                }
            }
            String str = AndroidLiveWallpaperService.TAG;
        }

        public void onResume() {
            AndroidLiveWallpaperService.this.visibleEngines++;
            if (AndroidLiveWallpaperService.DEBUG) {
                hashCode();
                AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
                int i = androidLiveWallpaperService.engines;
                AndroidWallpaperEngine androidWallpaperEngine = androidLiveWallpaperService.linkedEngine;
                int i2 = AndroidLiveWallpaperService.this.visibleEngines;
            }
            if (AndroidLiveWallpaperService.this.linkedEngine != null) {
                if (AndroidLiveWallpaperService.this.linkedEngine != this) {
                    AndroidLiveWallpaperService.this.setLinkedEngine(this);
                    AndroidLiveWallpaperService.this.view.surfaceDestroyed(getSurfaceHolder());
                    notifySurfaceChanged(this.engineFormat, this.engineWidth, this.engineHeight, false);
                    AndroidLiveWallpaperService.this.view.surfaceCreated(getSurfaceHolder());
                } else {
                    notifySurfaceChanged(this.engineFormat, this.engineWidth, this.engineHeight, false);
                }
                AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
                if (androidLiveWallpaperService2.visibleEngines == 1) {
                    androidLiveWallpaperService2.app.onResume();
                }
                notifyPreviewState();
                notifyOffsetsChanged();
                if (Gdx.graphics.isContinuousRendering()) {
                    return;
                }
                Gdx.graphics.requestRendering();
            }
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (AndroidLiveWallpaperService.DEBUG) {
                isPreview();
                hashCode();
                AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
                int i4 = androidLiveWallpaperService.engines;
                AndroidWallpaperEngine androidWallpaperEngine = androidLiveWallpaperService.linkedEngine;
                getSurfaceHolder().getSurface().isValid();
            }
            super.onSurfaceChanged(surfaceHolder, i, i2, i3);
            notifySurfaceChanged(i, i2, i3, true);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
            androidLiveWallpaperService.engines++;
            androidLiveWallpaperService.setLinkedEngine(this);
            if (AndroidLiveWallpaperService.DEBUG) {
                hashCode();
                AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
                int i = androidLiveWallpaperService2.engines;
                AndroidWallpaperEngine androidWallpaperEngine = androidLiveWallpaperService2.linkedEngine;
            }
            super.onSurfaceCreated(surfaceHolder);
            AndroidLiveWallpaperService androidLiveWallpaperService3 = AndroidLiveWallpaperService.this;
            int i2 = androidLiveWallpaperService3.engines;
            if (i2 == 1) {
                androidLiveWallpaperService3.visibleEngines = 0;
            }
            if (i2 == 1 && androidLiveWallpaperService3.app == null) {
                AndroidLiveWallpaperService androidLiveWallpaperService4 = AndroidLiveWallpaperService.this;
                androidLiveWallpaperService4.viewFormat = 0;
                androidLiveWallpaperService4.viewWidth = 0;
                androidLiveWallpaperService4.viewHeight = 0;
                androidLiveWallpaperService4.app = new AndroidLiveWallpaper(androidLiveWallpaperService4);
                AndroidLiveWallpaperService.this.onCreateApplication();
                if (AndroidLiveWallpaperService.this.app.graphics == null) {
                    throw new Error("You must override 'AndroidLiveWallpaperService.onCreateApplication' method and call 'initialize' from its body.");
                }
            }
            AndroidLiveWallpaperService androidLiveWallpaperService5 = AndroidLiveWallpaperService.this;
            androidLiveWallpaperService5.view = androidLiveWallpaperService5.app.graphics.view;
            getSurfaceHolder().removeCallback(AndroidLiveWallpaperService.this.view);
            AndroidLiveWallpaperService androidLiveWallpaperService6 = AndroidLiveWallpaperService.this;
            this.engineFormat = androidLiveWallpaperService6.viewFormat;
            this.engineWidth = androidLiveWallpaperService6.viewWidth;
            this.engineHeight = androidLiveWallpaperService6.viewHeight;
            if (androidLiveWallpaperService6.engines == 1) {
                androidLiveWallpaperService6.view.surfaceCreated(surfaceHolder);
            } else {
                androidLiveWallpaperService6.view.surfaceDestroyed(surfaceHolder);
                notifySurfaceChanged(this.engineFormat, this.engineWidth, this.engineHeight, false);
                AndroidLiveWallpaperService.this.view.surfaceCreated(surfaceHolder);
            }
            notifyPreviewState();
            notifyOffsetsChanged();
            if (Gdx.graphics.isContinuousRendering()) {
                return;
            }
            Gdx.graphics.requestRendering();
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
            SurfaceHolder.Callback callback;
            AndroidLiveWallpaperService.this.engines--;
            if (AndroidLiveWallpaperService.DEBUG) {
                hashCode();
                AndroidLiveWallpaperService androidLiveWallpaperService = AndroidLiveWallpaperService.this;
                int i = androidLiveWallpaperService.engines;
                AndroidWallpaperEngine androidWallpaperEngine = androidLiveWallpaperService.linkedEngine;
            }
            AndroidLiveWallpaperService androidLiveWallpaperService2 = AndroidLiveWallpaperService.this;
            if (androidLiveWallpaperService2.engines == 0) {
                androidLiveWallpaperService2.onDeepPauseApplication();
            }
            if (AndroidLiveWallpaperService.this.linkedEngine == this && (callback = AndroidLiveWallpaperService.this.view) != null) {
                callback.surfaceDestroyed(surfaceHolder);
            }
            this.engineFormat = 0;
            this.engineWidth = 0;
            this.engineHeight = 0;
            AndroidLiveWallpaperService androidLiveWallpaperService3 = AndroidLiveWallpaperService.this;
            if (androidLiveWallpaperService3.engines == 0) {
                androidLiveWallpaperService3.linkedEngine = null;
            }
            super.onSurfaceDestroyed(surfaceHolder);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onTouchEvent(MotionEvent motionEvent) {
            if (AndroidLiveWallpaperService.this.linkedEngine == this) {
                AndroidLiveWallpaperService.this.app.input.onTouch(null, motionEvent);
            }
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onVisibilityChanged(boolean z) {
            boolean zIsVisible = isVisible();
            if (AndroidLiveWallpaperService.DEBUG) {
                hashCode();
                getSurfaceHolder().getSurface().isValid();
            }
            super.onVisibilityChanged(z);
            if (zIsVisible || !z) {
                notifyVisibilityChanged(z);
            } else {
                String str = AndroidLiveWallpaperService.TAG;
            }
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public AndroidLiveWallpaper getLiveWallpaper() {
        return this.app;
    }

    public SurfaceHolder getSurfaceHolder() {
        synchronized (this.sync) {
            try {
                if (this.linkedEngine == null) {
                    return null;
                }
                return this.linkedEngine.getSurfaceHolder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WindowManager getWindowManager() {
        return (WindowManager) getSystemService("window");
    }

    public void initialize(ApplicationListener applicationListener) {
        initialize(applicationListener, new AndroidApplicationConfiguration());
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public void onCreate() {
        if (DEBUG) {
            hashCode();
        }
        super.onCreate();
    }

    public void onCreateApplication() {
    }

    @Override // android.service.wallpaper.WallpaperService
    public WallpaperService.Engine onCreateEngine() {
        return new AndroidWallpaperEngine();
    }

    public void onDeepPauseApplication() {
        if (this.app != null) {
            this.app.graphics.clearManagedCaches();
        }
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public void onDestroy() {
        if (DEBUG) {
            hashCode();
        }
        super.onDestroy();
        if (this.app != null) {
            this.app.onDestroy();
            this.app = null;
            this.view = null;
        }
    }

    public void setLinkedEngine(AndroidWallpaperEngine androidWallpaperEngine) {
        synchronized (this.sync) {
            this.linkedEngine = androidWallpaperEngine;
        }
    }

    public void initialize(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration) {
        this.app.initialize(applicationListener, androidApplicationConfiguration);
        if (!androidApplicationConfiguration.getTouchEventsForLiveWallpaper || Integer.parseInt(Build.VERSION.SDK) < 7) {
            return;
        }
        this.linkedEngine.setTouchEventsEnabled(true);
    }
}
