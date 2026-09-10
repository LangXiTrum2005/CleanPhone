package com.p004ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p004ironsource.C3364k;
import com.p004ironsource.C3366l;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.p004ironsource.dk;
import com.p004ironsource.hs;
import com.p004ironsource.jh;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.oh;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.p004ironsource.th;
import com.p004ironsource.u5;
import com.p004ironsource.up;
import com.p004ironsource.ux;
import com.p004ironsource.vf;
import com.p004ironsource.ww;
import com.p004ironsource.y2;

/* JADX INFO: loaded from: classes5.dex */
public class ControllerActivity extends Activity implements up, ww {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f26797n = "ControllerActivity";
    private static final int o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f26798p = "removeWebViewContainerView | mContainer is null";
    private static String q = "removeWebViewContainerView | view is null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f26800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f26801c;
    private FrameLayout d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private vf f26802e;
    private String g;
    private y2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f26805l;
    private boolean m;
    public int currentRequestedRotation = -1;
    private boolean f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f26803h = new Handler();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f26804i = new a();
    final RelativeLayout.LayoutParams j = new RelativeLayout.LayoutParams(-1, -1);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f));
        }
    }

    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i2) {
            if ((i2 & 4098) == 0) {
                ControllerActivity.this.f26803h.removeCallbacks(ControllerActivity.this.f26804i);
                ControllerActivity.this.f26803h.postDelayed(ControllerActivity.this.f26804i, 500L);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private View a(ViewGroup viewGroup) {
        return d() ? viewGroup.findViewById(1) : jh.a().a(this.f26799a).getPresentingView();
    }

    private boolean d() {
        return this.f26799a == null;
    }

    private void e() {
        runOnUiThread(new c());
    }

    private void f() {
        ViewGroup viewGroup;
        try {
            if (this.f26801c == null) {
                throw new Exception(f26798p);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.d.getParent();
            View viewA = a(viewGroup2);
            if (viewA == null) {
                throw new Exception(q);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewA.getParent()) != null) {
                viewGroup.removeView(viewA);
            }
            viewGroup2.removeView(this.d);
        } catch (Exception e2) {
            q9.d().a(e2);
            th.a(hs.s, new oh().a(dc.f24769A, e2.getMessage()).a());
            Logger.i(f26797n, "removeWebViewContainerView fail " + e2.getMessage());
        }
    }

    private void g() {
        int iL = this.f26802e.L(this);
        String str = f26797n;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (iL == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iL == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iL == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iL != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    private void h() {
        int iL = this.f26802e.L(this);
        String str = f26797n;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (iL == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iL == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iL == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iL != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.p004ironsource.up
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f26797n, "onBackPressed");
        if (u5.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p004ironsource.up
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26802e = on.U().f();
        try {
            new C3366l(this).a();
            new C3364k(this).a();
            v vVar = (v) dk.b((Context) this).a().j();
            this.f26800b = vVar;
            vVar.s().setId(1);
            this.f26800b.a((up) this);
            this.f26800b.a((ww) this);
            Intent intent = getIntent();
            this.g = intent.getStringExtra(d9.h.m);
            this.f = intent.getBooleanExtra(d9.h.v, false);
            this.f26799a = intent.getStringExtra("adViewId");
            this.f26805l = false;
            this.m = intent.getBooleanExtra(d9.h.z0, false);
            if (this.f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f26804i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f26801c = relativeLayout;
            setContentView(relativeLayout, this.j);
            this.d = a(this.f26799a);
            if (this.f26801c.findViewById(1) == null && this.d.getParent() != null) {
                finish();
            }
            c();
            this.f26801c.addView(this.d, this.j);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        String str = f26797n;
        Logger.i(str, "onDestroy");
        f();
        if (this.f26805l) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && this.f26800b.y()) {
            this.f26800b.x();
            return true;
        }
        if (this.f && (i2 == 25 || i2 == 24)) {
            this.f26803h.removeCallbacks(this.f26804i);
            this.f26803h.postDelayed(this.f26804i, 500L);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // com.p004ironsource.up
    public void onOrientationChanged(String str, int i2) {
        a(str, i2);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f26797n, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f26800b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.m) {
                this.f26800b.B();
            }
            this.f26800b.a(false, d9.h.Z);
            this.f26800b.g(this.g, d9.h.t0);
        }
        if (isFinishing()) {
            this.f26805l = true;
            b();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f26797n, d9.h.u0);
        v vVar = this.f26800b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.m) {
                this.f26800b.F();
            }
            this.f26800b.a(true, d9.h.Z);
            this.f26800b.g(this.g, d9.h.u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Logger.i(f26797n, "onStart");
        v vVar = this.f26800b;
        if (vVar != null) {
            vVar.g(this.g, "onStart");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.i(f26797n, "onStop");
        v vVar = this.f26800b;
        if (vVar != null) {
            vVar.g(this.g, "onStop");
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f26797n, "onUserLeaveHint");
        v vVar = this.f26800b;
        if (vVar != null) {
            vVar.g(this.g, "onUserLeaveHint");
        }
    }

    @Override // com.p004ironsource.ww
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.p004ironsource.ww
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.p004ironsource.ww
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.p004ironsource.ww
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.p004ironsource.ww
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (this.f && z2) {
            runOnUiThread(this.f26804i);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i2) {
        if (this.currentRequestedRotation != i2) {
            String str = f26797n;
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Rotation: Req = ", " Curr = ");
            sbU.append(this.currentRequestedRotation);
            Logger.i(str, sbU.toString());
            this.currentRequestedRotation = i2;
            super.setRequestedOrientation(i2);
        }
    }

    public void toggleKeepScreen(boolean z2) {
        if (z2) {
            e();
        } else {
            a();
        }
    }

    private FrameLayout a(String str) {
        return !b(str) ? this.f26800b.s() : ux.a(getApplicationContext(), jh.a().a(str).getPresentingView());
    }

    private void b() {
        String str = f26797n;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f26800b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.u.Gone);
        this.f26800b.C();
        this.f26800b.D();
        this.f26800b.g(this.g, "onDestroy");
    }

    private void c() {
        Intent intent = getIntent();
        a(intent.getStringExtra(d9.h.f24706A), intent.getIntExtra(d9.h.f24707B, 0));
    }

    private void a() {
        runOnUiThread(new d());
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void a(String str, int i2) {
        int i3;
        if (str != null) {
            if (d9.h.C.equalsIgnoreCase(str)) {
                g();
                return;
            }
            if (d9.h.D.equalsIgnoreCase(str)) {
                h();
                return;
            }
            if (d9.h.G.equalsIgnoreCase(str)) {
                if (!this.f26802e.E(this)) {
                    return;
                } else {
                    i3 = 1;
                }
            } else if (getRequestedOrientation() != -1) {
                return;
            } else {
                i3 = 4;
            }
            setRequestedOrientation(i3);
        }
    }
}
