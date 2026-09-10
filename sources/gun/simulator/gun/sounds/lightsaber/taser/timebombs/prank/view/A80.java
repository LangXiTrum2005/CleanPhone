package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class A80 extends GLSurfaceView {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f2804a;
    public final SensorManager b;
    public final Sensor c;
    public final C3169cT d;
    public final Handler e;
    public final C3137c30 f;
    public SurfaceTexture g;
    public Surface h;
    public boolean i;
    public boolean j;
    public boolean k;

    public A80(Context context) {
        super(context, null);
        this.f2804a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService(com.umeng.analytics.pro.bc.ac);
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = Ug0.f3833a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C3137c30 c3137c30 = new C3137c30();
        this.f = c3137c30;
        C5169z80 c5169z80 = new C5169z80(this, c3137c30);
        View.OnTouchListener viewOnTouchListenerC3183cd0 = new ViewOnTouchListenerC3183cd0(context, c5169z80);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new C3169cT(windowManager.getDefaultDisplay(), viewOnTouchListenerC3183cd0, c5169z80);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(c5169z80);
        setOnTouchListener(viewOnTouchListenerC3183cd0);
    }

    public final void a() {
        boolean z = this.i && this.j;
        Sensor sensor = this.c;
        if (sensor == null || z == this.k) {
            return;
        }
        C3169cT c3169cT = this.d;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(c3169cT, sensor, 0);
        } else {
            sensorManager.unregisterListener(c3169cT);
        }
        this.k = z;
    }

    public InterfaceC2668Pc getCameraMotionListener() {
        return this.f;
    }

    public InterfaceC4685th0 getVideoFrameMetadataListener() {
        return this.f;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new RunnableC2928Zc(this, 14));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.k = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        a();
    }
}
