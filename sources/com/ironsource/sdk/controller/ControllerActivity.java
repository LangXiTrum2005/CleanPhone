package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.B5;
import com.ironsource.C0274c1;
import com.ironsource.C0377he;
import com.ironsource.C0415k;
import com.ironsource.C0433l;
import com.ironsource.C0460m8;
import com.ironsource.C0474n4;
import com.ironsource.C0549r8;
import com.ironsource.C0639w8;
import com.ironsource.C0669y2;
import com.ironsource.Dg;
import com.ironsource.InterfaceC0674y7;
import com.ironsource.Kb;
import com.ironsource.P9;
import com.ironsource.Qc;
import com.ironsource.X3;
import com.ironsource.hh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ControllerActivity extends Activity implements Qc, Dg {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f30216o = "ControllerActivity";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f30217p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f30218q = "removeWebViewContainerView | mContainer is null";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f30219r = "removeWebViewContainerView | view is null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f30221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f30222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f30223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0674y7 f30224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedCallback f30225f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f30227h;
    private C0274c1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30232n;
    public int currentRequestedRotation = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30226g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f30228i = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f30229j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final RelativeLayout.LayoutParams f30230k = new RelativeLayout.LayoutParams(-1, -1);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f30226g));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.f30228i.removeCallbacks(controllerActivity.f30229j);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.f30228i.postDelayed(controllerActivity2.f30229j, 500L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private void f() {
        runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Logger.i(f30216o, "OnBackInvokedCallback");
        if (C0669y2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    private void h() {
        if (Build.VERSION.SDK_INT < 33 || this.f30225f == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f30225f);
            Logger.i(f30216o, "OnBackInvokedCallback unregistered");
            this.f30225f = null;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e10);
        }
    }

    private void i() {
        ViewGroup viewGroup;
        try {
            if (this.f30222c == null) {
                throw new Exception(f30218q);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f30223d.getParent();
            View viewA = a(viewGroup2);
            if (viewA == null) {
                throw new Exception(f30219r);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewA.getParent()) != null) {
                viewGroup.removeView(viewA);
            }
            viewGroup2.removeView(this.f30223d);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            C0639w8.a(C0377he.f28819s, new C0549r8().a(B5.A, e10.getMessage()).a());
            Logger.i(f30216o, "removeWebViewContainerView fail " + e10.getMessage());
        }
    }

    private void j() {
        int iK = this.f30224e.K(this);
        String str = f30216o;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iK == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iK != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void k() {
        int iK = this.f30224e.K(this);
        String str = f30216o;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iK == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iK != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.Qc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f30216o, "onBackPressed");
        if (C0669y2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.Qc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30224e = Kb.Y().a();
        try {
            new C0433l(this).a();
            new C0415k(this).a();
            v vVar = (v) P9.b((Context) this).a().k();
            this.f30221b = vVar;
            vVar.s().setId(1);
            this.f30221b.a((Qc) this);
            this.f30221b.a((Dg) this);
            Intent intent = getIntent();
            this.f30227h = intent.getStringExtra(X3.i.f27802m);
            this.f30226g = intent.getBooleanExtra(X3.i.f27818v, false);
            this.f30220a = intent.getStringExtra("adViewId");
            this.f30231m = false;
            this.f30232n = intent.getBooleanExtra(X3.i.f27827z0, false);
            if (this.f30226g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f30229j);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f30222c = relativeLayout;
            setContentView(relativeLayout, this.f30230k);
            this.f30223d = a(this.f30220a);
            if (this.f30222c.findViewById(1) == null && this.f30223d.getParent() != null) {
                finish();
            }
            d();
            this.f30222c.addView(this.f30223d, this.f30230k);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        String str = f30216o;
        Logger.i(str, "onDestroy");
        h();
        i();
        if (this.f30231m) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f30221b.y()) {
            this.f30221b.x();
            return true;
        }
        if (this.f30226g && (i10 == 25 || i10 == 24)) {
            this.f30228i.removeCallbacks(this.f30229j);
            this.f30228i.postDelayed(this.f30229j, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.Qc
    public void onOrientationChanged(String str, int i10) {
        a(str, i10);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f30216o, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f30221b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.f30232n) {
                this.f30221b.E();
            }
            this.f30221b.b(false, X3.i.Z);
            this.f30221b.g(this.f30227h, X3.i.t0);
        }
        if (isFinishing()) {
            this.f30231m = true;
            c();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f30216o, X3.i.f27817u0);
        v vVar = this.f30221b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.f30232n) {
                this.f30221b.I();
            }
            this.f30221b.b(true, X3.i.Z);
            this.f30221b.g(this.f30227h, X3.i.f27817u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Logger.i(f30216o, "onStart");
        v vVar = this.f30221b;
        if (vVar != null) {
            vVar.g(this.f30227h, "onStart");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.i(f30216o, "onStop");
        v vVar = this.f30221b;
        if (vVar != null) {
            vVar.g(this.f30227h, "onStop");
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f30216o, "onUserLeaveHint");
        v vVar = this.f30221b;
        if (vVar != null) {
            vVar.g(this.f30227h, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.Dg
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.Dg
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.Dg
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.Dg
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.Dg
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f30226g && z10) {
            runOnUiThread(this.f30229j);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            String str = f30216o;
            StringBuilder sbU = defpackage.e.u(i10, "Rotation: Req = ", " Curr = ");
            sbU.append(this.currentRequestedRotation);
            Logger.i(str, sbU.toString());
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        if (z10) {
            f();
        } else {
            b();
        }
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f30225f = new w(this, 0);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f30225f);
        }
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void c() {
        String str = f30216o;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f30221b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.EnumC0089v.Gone);
        this.f30221b.F();
        this.f30221b.G();
        this.f30221b.g(this.f30227h, "onDestroy");
    }

    private void d() {
        Intent intent = getIntent();
        a(intent.getStringExtra(X3.i.A), intent.getIntExtra(X3.i.B, 0));
    }

    private boolean e() {
        return this.f30220a == null;
    }

    private void b() {
        runOnUiThread(new d());
    }

    private FrameLayout a(String str) {
        if (!b(str)) {
            return this.f30221b.s();
        }
        return hh.a(getApplicationContext(), C0460m8.a().a(str).getPresentingView());
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void a(String str, int i10) {
        if (str != null) {
            if (X3.i.C.equalsIgnoreCase(str)) {
                j();
                return;
            }
            if (X3.i.D.equalsIgnoreCase(str)) {
                k();
                return;
            }
            if (X3.i.G.equalsIgnoreCase(str)) {
                if (this.f30224e.x(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private View a(ViewGroup viewGroup) {
        if (e()) {
            return viewGroup.findViewById(1);
        }
        return C0460m8.a().a(this.f30220a).getPresentingView();
    }
}
