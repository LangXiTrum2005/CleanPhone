package com.smartdigimkt.sdk.basead.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.f5.i;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.p6.p;
import com.smartdigimkt.r3.d;
import com.smartdigimkt.sdk.basead.ui.h5template.WTWebViewBaseScreenATView;
import com.smartdigimkt.w6.c;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class BaseATActivity extends Activity {
    public static final String A0 = "BaseATActivity";
    private BaseScreenATView X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private com.smartdigimkt.v6.a f38273Y;
    private f Z;
    private String e0;
    private com.smartdigimkt.f5.b.c f0;
    private String g0;
    private int h0;
    private int i0;
    private boolean j0;
    private boolean k0;
    private boolean l0;
    private boolean m0;
    boolean n0;
    com.smartdigimkt.v3.f o0;
    long p0 = 0;
    long q0 = 0;
    float r0 = 0.0f;
    boolean s0 = false;
    boolean t0 = false;
    com.smartdigimkt.m3.a.d u0 = new a();
    i v0;
    private boolean w0;
    long x0;
    long y0;
    long z0;

    public class a implements com.smartdigimkt.m3.a.d {
        public a() {
        }

        @Override // com.smartdigimkt.m3.a.d
        public void a(String str, Object obj) {
            if (!(obj instanceof com.smartdigimkt.v3.f) || BaseATActivity.this.Z == null) {
                return;
            }
            com.smartdigimkt.v3.f fVar = (com.smartdigimkt.v3.f) obj;
            if (fVar.a().X().equals(BaseATActivity.this.Z.X())) {
                BaseATActivity baseATActivity = BaseATActivity.this;
                if (baseATActivity.n0) {
                    fVar.a(baseATActivity);
                } else {
                    baseATActivity.o0 = fVar;
                }
            }
        }
    }

    private void d() {
        Intent intent = getIntent();
        try {
            if (intent == null) {
                Log.e("sdm", A0 + " Intent is null.");
                return;
            }
            this.e0 = intent.getStringExtra("extra_event_id");
            c cVarA = com.smartdigimkt.z5.a.a().a(this.e0);
            if (cVarA != null) {
                this.g0 = cVarA.f39468b;
                this.h0 = cVarA.f39467a;
                this.Z = cVarA.f39469c;
                this.f38273Y = cVarA.f39471h;
            }
            this.m0 = a(this.h0, this.f38273Y);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        BaseScreenATView baseScreenATView = this.X;
        if (baseScreenATView != null) {
            baseScreenATView.onActivityResult(i2, i3, intent);
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.smartdigimkt.m6.b.p().k() == null) {
            com.smartdigimkt.m6.b.p().d(getApplicationContext());
        }
        b(bundle);
        c();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.o0 = null;
        this.v0 = null;
        com.smartdigimkt.m3.a.a().b("1", this.u0);
        BaseScreenATView baseScreenATView = this.X;
        if (baseScreenATView != null) {
            baseScreenATView.removeAllViews();
            this.X.L();
            this.X = null;
        }
        f fVar = this.Z;
        if (fVar != null && fVar.r0() && !this.Z.w0()) {
            p.c().a();
        }
        if (this.f38273Y != null) {
            com.smartdigimkt.i7.a.a().a(this.f38273Y.f + this.f38273Y.f39166e);
        }
        if (!TextUtils.isEmpty(this.e0)) {
            com.smartdigimkt.f5.b.a().b(this.e0);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (4 == i2) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        long j = this.z0 + 1;
        this.z0 = j;
        if (j <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            i iVar = this.v0;
            sb.append(iVar != null ? iVar.g() : "0");
            a(sb.toString(), SystemClock.elapsedRealtime() - this.x0);
        }
        this.n0 = false;
        BaseScreenATView baseScreenATView = this.X;
        if (baseScreenATView != null) {
            baseScreenATView.N();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                super.onResume();
            } catch (Throwable unused) {
                a();
            }
        } else {
            super.onResume();
        }
        c();
        this.x0 = SystemClock.elapsedRealtime();
        long j = this.y0 + 1;
        this.y0 = j;
        if (j <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            i iVar = this.v0;
            sb.append(iVar != null ? iVar.g() : "0");
            a(sb.toString(), 0L);
        }
        this.n0 = true;
        BaseScreenATView baseScreenATView = this.X;
        if (baseScreenATView != null) {
            baseScreenATView.O();
        }
        com.smartdigimkt.v3.f fVar = this.o0;
        if (fVar != null) {
            fVar.a(this);
            this.o0 = null;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseScreenATView baseScreenATView = this.X;
        if (baseScreenATView != null) {
            if (baseScreenATView.isShowEndCard()) {
                bundle.putBoolean("extra_is_show_end_card", true);
            }
            bundle.putBoolean("extra_is_mute", this.X.isVideoMute());
            bundle.putBoolean("extra_has_reward_savestate", this.X.hasReward());
            bundle.putLong("extra_show_banner_time", this.X.getShowBannerTime());
            bundle.putLong("extra_hide_banner_time", this.X.getHideBannerTime());
            bundle.putFloat("extra_close_view_scale", this.X.getCloseButtonScaleFactor());
            bundle.putBoolean("extra_has_perform_click", this.X.getHasPerformClick());
            bundle.putBoolean("extra_is_showing_endcard_after_video_play", this.X.isShowingEndCardAfterVideoPlay());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            c();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setTheme(h.a(this, "myoffer_half_screen_fit_by_o", "style"));
        } else {
            super.setTheme(i2);
        }
    }

    public class b extends i {
        String d = "1";

        public b() {
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(com.smartdigimkt.v3.h hVar) {
            if (BaseATActivity.this.f0 != null) {
                BaseATActivity.this.f0.a(hVar);
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void b(j jVar) {
            if (BaseATActivity.this.f0 != null) {
                BaseATActivity.this.f0.b(jVar);
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void c() {
            if (BaseATActivity.this.f0 != null) {
                BaseATActivity.this.f0.a(b());
                BaseATActivity.this.f0.c();
            }
            BaseATActivity.this.a();
        }

        @Override // com.smartdigimkt.f5.b.c
        public void d() {
            if (BaseATActivity.this.f0 != null) {
                BaseATActivity.this.f0.d();
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void e() {
            if (BaseATActivity.this.f0 != null) {
                BaseATActivity.this.f0.e();
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void f() {
            if (BaseATActivity.this.f0 != null) {
                BaseATActivity.this.f0.f();
            }
        }

        @Override // com.smartdigimkt.f5.i
        public String g() {
            return this.d;
        }

        @Override // com.smartdigimkt.f5.i
        public void h() {
            if (TextUtils.equals(this.d, "1")) {
                this.d = "3";
                BaseATActivity baseATActivity = BaseATActivity.this;
                baseATActivity.a("6-".concat(baseATActivity.y0 - baseATActivity.z0 <= 0 ? "2" : "1"), 0L);
            }
        }

        @Override // com.smartdigimkt.f5.i
        public void i() {
            this.d = "1";
            BaseATActivity.this.a("4", 0L);
        }

        @Override // com.smartdigimkt.f5.i
        public void j() {
            if (TextUtils.equals(this.d, "1")) {
                this.d = "2";
            }
            BaseATActivity baseATActivity = BaseATActivity.this;
            baseATActivity.a("5-".concat(baseATActivity.y0 - baseATActivity.z0 <= 0 ? "2" : "1"), 0L);
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(j jVar) {
            if (BaseATActivity.this.f0 != null) {
                BaseATActivity.this.f0.a(jVar);
            }
        }

        @Override // com.smartdigimkt.f5.b.c
        public void a(boolean z2) {
            if (BaseATActivity.this.f0 != null) {
                BaseATActivity.this.f0.a(z2);
            }
        }
    }

    private BaseScreenATView b() {
        int i2 = this.h0;
        if (i2 != 1) {
            if (i2 == 3) {
                if (this.Z.N() == 3) {
                    if (d.b(this.Z)) {
                        return new WTWebViewBaseScreenATView(this, this.f38273Y, this.Z, this.g0, this.h0, this.i0);
                    }
                    if (this.Z.i().f0() != 1) {
                        com.smartdigimkt.f5.b.c cVar = this.f0;
                        if (cVar != null) {
                            cVar.a(com.smartdigimkt.v3.i.a("30009", "Adx template show fail without html file"));
                        }
                        a();
                        return null;
                    }
                }
                if (this.m0) {
                    return (this.f38273Y.t.E() == 1 && this.i0 == 1) ? new LetterHalfScreenATView(this, this.f38273Y, this.Z, this.g0, this.h0, this.i0) : new HalfScreenATView(this, this.f38273Y, this.Z, this.g0, this.h0, this.i0);
                }
                return (this.f38273Y.t.E() == 1 && this.i0 == 1) ? new LetterFullScreenATView(this, this.f38273Y, this.Z, this.g0, this.h0, this.i0) : new FullScreenATView(this, this.f38273Y, this.Z, this.g0, this.h0, this.i0);
            }
        } else if (this.Z.N() == 3) {
            if (d.b(this.Z)) {
                return new WTWebViewBaseScreenATView(this, this.f38273Y, this.Z, this.g0, this.h0, this.i0);
            }
            if (this.Z.i().f0() != 1) {
                com.smartdigimkt.f5.b.c cVar2 = this.f0;
                if (cVar2 != null) {
                    cVar2.a(com.smartdigimkt.v3.i.a("30009", "Adx template show fail without html file"));
                }
                a();
                return null;
            }
        }
        return new FullScreenATView(this, this.f38273Y, this.Z, this.g0, this.h0, this.i0);
    }

    private void c(Bundle bundle) {
        if (bundle != null) {
            this.j0 = bundle.getBoolean("extra_is_show_end_card");
            this.k0 = bundle.getBoolean("extra_is_mute");
            this.l0 = bundle.getBoolean("extra_has_reward_savestate");
            this.p0 = bundle.getLong("extra_show_banner_time");
            this.q0 = bundle.getLong("extra_hide_banner_time");
            this.r0 = bundle.getFloat("extra_close_view_scale");
            this.s0 = bundle.getBoolean("extra_has_perform_click", false);
            this.t0 = bundle.getBoolean("extra_is_showing_endcard_after_video_play", false);
        }
    }

    public static void a(Activity activity, c cVar) {
        Intent intent = new Intent();
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (activity == null || activity.isFinishing()) {
            Log.i(A0, "Activity is null");
        } else {
            contextK = activity;
        }
        boolean zA = a(cVar.f39467a, cVar.f39471h);
        if (cVar.f39470e == 2) {
            if (!zA && !cVar.j) {
                intent.setClass(contextK, ATLandscapeActivity.class);
            } else {
                intent.setClass(contextK, ATLandscapeTranslucentActivity.class);
            }
        } else if (!zA && !cVar.j) {
            intent.setClass(contextK, ATPortraitActivity.class);
        } else {
            intent.setClass(contextK, ATPortraitTranslucentActivity.class);
        }
        intent.putExtra("extra_event_id", cVar.d);
        com.smartdigimkt.z5.a.a().a(cVar.d, cVar);
        if (!(contextK instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            contextK.startActivity(intent);
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.overridePendingTransition(0, 0);
        } catch (Throwable th) {
            com.smartdigimkt.f5.b.c cVarA = com.smartdigimkt.f5.b.a().a(cVar.d);
            if (cVarA != null) {
                cVarA.a(com.smartdigimkt.v3.i.a("10000", th.getMessage()));
            }
        }
    }

    private void c() {
        try {
            f fVar = this.Z;
            if (fVar == null || fVar.i() == null || this.Z.i().h0() != 1) {
                return;
            }
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.systemUiVisibility = IronSourceError.ERROR_LEGACY_INIT_POST_FAILED;
            window.setAttributes(attributes);
            window.addFlags(1024);
        } catch (Throwable unused) {
        }
    }

    private static boolean a(int i2, com.smartdigimkt.v6.a aVar) {
        g gVar;
        if (aVar == null || (gVar = aVar.t) == null || i2 != 3) {
            return false;
        }
        return TextUtils.equals("2", gVar.q0());
    }

    public void b(Bundle bundle) {
        if (this instanceof ATLandscapeActivity) {
            this.i0 = 2;
        } else {
            this.i0 = 1;
        }
        d();
        this.f0 = com.smartdigimkt.f5.b.a().a(this.e0);
        a("1", 0L);
        com.smartdigimkt.v6.a aVar = this.f38273Y;
        if (aVar != null && aVar.t != null) {
            if (this.Z != null) {
                com.smartdigimkt.m3.a.a().a("1", this.u0);
                BaseScreenATView baseScreenATViewB = b();
                this.X = baseScreenATViewB;
                if (baseScreenATViewB == null) {
                    return;
                }
                setContentView(baseScreenATViewB);
                a(bundle);
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str = A0;
            sb.append(str);
            sb.append(" onCreate: OfferAd = null");
            Log.e("sdm", sb.toString());
            try {
                com.smartdigimkt.f5.b.c cVar = this.f0;
                if (cVar != null) {
                    cVar.a(com.smartdigimkt.v3.i.a("40002", str + " onCreate: OfferAd = null"));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            a();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = A0;
        sb2.append(str2);
        sb2.append("Start Screen Ad Error.");
        Log.e("sdm", sb2.toString());
        try {
            com.smartdigimkt.f5.b.c cVar2 = this.f0;
            if (cVar2 != null) {
                cVar2.a(com.smartdigimkt.v3.i.a("40002", str2 + "Start FullScreen Ad Error."));
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        a();
    }

    private void a(Bundle bundle) {
        b bVar = new b();
        this.v0 = bVar;
        this.X.setListener(bVar);
        c(bundle);
        this.X.setIsShowEndCard(this.j0);
        this.X.setHasReward(this.l0);
        if (bundle != null) {
            this.X.setVideoMute(this.k0);
            this.X.setShowBannerTime(this.p0);
            this.X.setHideBannerTime(this.q0);
            this.X.setCloseButtonScaleFactor(this.r0);
            this.X.setHasPerformClick(this.s0);
            this.X.setShowingEndCardAfterVideoPlay(this.t0);
        }
        try {
            this.X.init();
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                com.smartdigimkt.f5.b.c cVar = this.f0;
                if (cVar != null) {
                    cVar.a(com.smartdigimkt.v3.i.a("40002", h.a(th.getStackTrace())));
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            finish();
            overridePendingTransition(0, 0);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j) {
        com.smartdigimkt.v6.a aVar;
        String str2;
        if (this.Z == null || (aVar = this.f38273Y) == null) {
            return;
        }
        try {
            String str3 = aVar.f39166e;
            String str4 = this.f38273Y.f39164b + "";
            if (this.f38273Y != null) {
                str2 = this.f38273Y.j + "";
            } else {
                str2 = "";
            }
            f fVar = this.Z;
            int iO = fVar != null ? fVar.O() : -1;
            f fVar2 = this.Z;
            String strL = fVar2 != null ? fVar2.L() : "";
            f fVar3 = this.Z;
            com.smartdigimkt.i7.d.a(str, aVar, str3, str4, str2, iO, 0, strL, fVar3 instanceof com.smartdigimkt.w6.d ? ((com.smartdigimkt.w6.d) fVar3).I0() : "", com.smartdigimkt.m3.i.g(this.Z, this.f38273Y), j);
        } catch (Throwable unused) {
        }
    }
}
