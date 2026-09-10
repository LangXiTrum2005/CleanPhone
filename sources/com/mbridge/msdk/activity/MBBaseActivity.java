package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MBBaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Display f31369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OrientationEventListener f31370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31371c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f31372d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f31373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.backdispatcher.a f31374f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e10) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends OrientationEventListener {
        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = MBBaseActivity.this.f31369a != null ? MBBaseActivity.this.f31369a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f31371c != 1) {
                MBBaseActivity.this.f31371c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f31371c != 2) {
                MBBaseActivity.this.f31371c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f31371c != 3) {
                MBBaseActivity.this.f31371c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f31371c == 4) {
                    return;
                }
                MBBaseActivity.this.f31371c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.config.activity.backdispatcher.b {
        public c() {
        }

        @Override // com.mbridge.msdk.config.activity.backdispatcher.b
        public void a() {
            MBBaseActivity.this.onBackDispatched();
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.f31370b = bVar;
        if (bVar.canDetectOrientation()) {
            this.f31370b.enable();
        } else {
            this.f31370b.disable();
            this.f31370b = null;
        }
    }

    public void getNotchParams() {
        if (this.f31372d) {
            return;
        }
        this.f31373e = new a();
        getWindow().getDecorView().postDelayed(this.f31373e, 500L);
    }

    public abstract void onBackDispatched();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31372d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
            if (Build.VERSION.SDK_INT >= 33) {
                registerBackInvokedDispatcher();
            }
        } catch (Exception e10) {
            q0.b("MBBaseActivity", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f31372d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f31370b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f31370b = null;
            }
            if (this.f31373e != null) {
                getWindow().getDecorView().removeCallbacks(this.f31373e);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                unRegisterBackInvokedDispatcher();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f33675f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c();
    }

    public void registerBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = new com.mbridge.msdk.config.activity.backdispatcher.a();
            this.f31374f = aVar;
            aVar.a(getWindow(), new c());
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    public void unRegisterBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = this.f31374f;
            if (aVar == null) {
                return;
            }
            aVar.a(getWindow());
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i10;
        int i11;
        int i12;
        int i13;
        int safeInsetBottom;
        DisplayCutout displayCutout;
        int i14;
        if (this.f31372d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i15 = -1;
        if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            this = this;
            i10 = -1;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            safeInsetBottom = 0;
        } else {
            int safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f31369a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.f31371c == -1) {
                if (rotation == 0) {
                    i14 = 3;
                } else if (rotation == 1) {
                    i14 = 1;
                } else if (rotation == 2) {
                    i14 = 4;
                } else {
                    i14 = rotation == 3 ? 2 : -1;
                }
                this.f31371c = i14;
                q0.b("MBBaseActivity", this.f31371c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i15 = 90;
                } else if (rotation == 2) {
                    i15 = 180;
                } else if (rotation == 3) {
                    i15 = 270;
                }
                i10 = i15;
            } else {
                i10 = 0;
            }
            i11 = safeInsetLeft;
            i12 = safeInsetRight;
            i13 = safeInsetTop;
        }
        this.setTopControllerPadding(i10, i11, i12, i13, safeInsetBottom);
        if (this.f31370b == null) {
            this.d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    private int a() {
        if (this.f31369a == null) {
            this.f31369a = getDisplay();
        }
        Display display = this.f31369a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }
}
