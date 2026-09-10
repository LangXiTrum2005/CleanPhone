package com.badlogic.gdx.backends.android;

import com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy;
import com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy;
import com.badlogic.gdx.utils.GdxNativesLoader;

/* JADX INFO: loaded from: classes.dex */
public class AndroidApplicationConfiguration {
    public boolean renderUnderCutout;
    public int r = 8;
    public int g = 8;
    public int b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201a = 0;
    public int depth = 16;
    public int stencil = 0;
    public int numSamples = 0;
    public boolean useAccelerometer = true;
    public boolean useGyroscope = false;
    public boolean useCompass = true;
    public boolean useRotationVectorSensor = false;
    public int sensorDelay = 1;
    public int touchSleepTime = 0;
    public boolean useWakelock = false;
    public boolean disableAudio = false;
    public int maxSimultaneousSounds = 16;
    public ResolutionStrategy resolutionStrategy = new FillResolutionStrategy();
    public boolean getTouchEventsForLiveWallpaper = false;
    public boolean useImmersiveMode = true;
    public boolean useGL30 = false;
    public int maxNetThreads = Integer.MAX_VALUE;
    public GdxNativeLoader nativeLoader = new GdxNativeLoader() { // from class: com.badlogic.gdx.backends.android.AndroidApplicationConfiguration.1
        @Override // com.badlogic.gdx.backends.android.GdxNativeLoader
        public void load() {
            GdxNativesLoader.load();
        }
    };
}
