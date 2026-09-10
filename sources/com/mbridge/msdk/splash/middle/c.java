package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.mbridge.msdk.setting.m;
import com.mbridge.msdk.splash.manager.e;
import com.mbridge.msdk.splash.manager.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static String D = "SplashProvider";
    private CampaignEx A;
    private MBSplashPopView B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f35891c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f35893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f35894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f35895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f35896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBSplashShowListener f35897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f35898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBSplashView f35899k;
    private ViewGroup l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f35900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private m f35901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f35902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewGroup f35903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private k f35904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35905r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Activity f35912y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f35913z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35892d = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35906s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35907t = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35908u = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f35909v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f35910w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f35911x = false;
    private boolean C = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35916c;

        public a(CampaignEx campaignEx, int i10, boolean z10) {
            this.f35914a = campaignEx;
            this.f35915b = i10;
            this.f35916c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f35914a, this.f35915b - 1, this.f35916c);
        }
    }

    public c(Activity activity, String str, String str2) {
        this.f35890b = TextUtils.isEmpty(str) ? "" : str;
        this.f35889a = str2;
        this.f35891c = new MBridgeIds(str, str2);
        this.f35912y = activity;
        b(activity);
    }

    public void b(boolean z10) {
        this.f35902o = z10;
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        } else if (this.f35896h != null) {
            this.f35896h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
        }
    }

    public int d() {
        return this.f35892d;
    }

    public long e() {
        return this.f35893e;
    }

    public boolean f() {
        return this.f35905r;
    }

    public boolean g() {
        return this.f35902o;
    }

    public void h() {
        f fVar = this.f35895g;
        if (fVar != null) {
            fVar.f();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.f35895g;
        if (fVar != null) {
            fVar.g();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public void j() {
        this.C = true;
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.C = false;
        MBSplashShowListener mBSplashShowListener = this.f35897i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f35890b, this.f35889a));
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f35903p = viewGroup;
    }

    public void b(String str) {
        a(str, 1);
    }

    public void d(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            d(str, viewGroupA);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f35897i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f35891c, "activity is except,please check it");
        }
    }

    public void a(int i10) {
        this.f35906s = i10;
    }

    public void b(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f35896h != null) {
                this.f35896h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        b(str, viewGroupA);
    }

    public void a(long j10) {
        this.f35893e = j10;
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f35896h == null) {
            this.f35896h = new b(this, this.f35891c);
        }
        this.f35896h.a(mBSplashLoadListener);
    }

    public void c(boolean z10) {
        this.f35905r = z10;
    }

    public void d(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.f35897i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f35891c, "token is null or empty");
                return;
            }
            return;
        }
        c(str, viewGroup);
    }

    public String c() {
        if (!this.f35911x) {
            e eVar = this.f35894f;
            if (eVar != null) {
                return eVar.d();
            }
            return "";
        }
        f fVar = this.f35895g;
        if (fVar != null) {
            return fVar.d();
        }
        return "";
    }

    public void a(MBSplashShowListener mBSplashShowListener) {
        this.f35897i = mBSplashShowListener;
    }

    public void b(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.f35896h != null) {
                this.f35896h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
                return;
            }
            return;
        }
        a(str, viewGroup);
    }

    public void a(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f35896h != null) {
                this.f35896h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        a(str, viewGroupA);
    }

    public void d(boolean z10) {
        this.f35913z = z10;
    }

    public void b(int i10) {
        this.f35892d = i10;
    }

    public void c(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            MBSplashShowListener mBSplashShowListener = this.f35897i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f35891c, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, viewGroupA);
    }

    public void a(String str, ViewGroup viewGroup) {
        this.l = viewGroup;
        MBSplashView mBSplashView = this.f35899k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public void b(int i10, int i11) {
        a(i11, i10);
    }

    public String b() {
        if (!this.f35911x) {
            e eVar = this.f35894f;
            if (eVar != null) {
                return eVar.c();
            }
            return "";
        }
        f fVar = this.f35895g;
        if (fVar != null) {
            return fVar.c();
        }
        return "";
    }

    public void c(String str, ViewGroup viewGroup) {
        this.l = viewGroup;
        MBSplashView mBSplashView = this.f35899k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f35899k, this.f35890b, this.f35889a, str, this.f35905r, this.f35892d, true, false);
        if (campaignExA != null) {
            if (this.f35901n == null) {
                this.f35901n = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35889a);
            }
            d dVar = new d(this, this.f35897i, campaignExA);
            this.f35898j = dVar;
            if (this.f35907t != 0 && this.f35908u != 0) {
                int i10 = this.f35892d;
                if (i10 >= 2 && i10 <= 10) {
                    b(campaignExA, this.f35901n.E(), false);
                    return;
                }
                dVar.a(this.f35891c, "countDownTime must in 2 - 10 ,but now is " + this.f35892d);
                return;
            }
            dVar.a(this.f35891c, "width or height is 0  or width or height is too small");
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f35897i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f35891c, "campaignEx is vali");
        }
    }

    public boolean a(String str) {
        return com.mbridge.msdk.splash.manager.d.a(this.f35899k, this.f35890b, this.f35889a, str, this.f35905r, this.f35892d, false, true) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, boolean z10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f35899k, campaignEx)) {
            if (i10 > 0) {
                this.f35895g.f35791y.postDelayed(new a(campaignEx, i10, z10), 1L);
                return;
            }
            d dVar = this.f35898j;
            if (dVar != null) {
                dVar.a(this.f35891c, "campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.l.setLayoutParams(layoutParams);
        this.l.removeAllViews();
        this.f35895g.c(this.f35892d);
        this.f35895g.a(this.f35903p);
        this.f35895g.a(this.f35898j);
        q0.b(D, "start show process");
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            f1.a(this.f35899k);
            this.l.addView(this.f35899k);
        }
        this.f35895g.a(this.f35905r);
        this.f35895g.a(campaignEx, this.f35899k);
    }

    public void b(CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx != null && z10) {
            if (this.f35901n == null) {
                this.f35901n = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35889a);
            }
            this.f35898j = new d(this, this.f35897i, campaignEx);
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            d dVar = this.f35898j;
            if (dVar != null) {
                dVar.a(this.f35891c, "container is null");
                return;
            }
            return;
        }
        if (this.f35895g == null) {
            this.f35895g = new f(viewGroup.getContext(), this.f35890b, this.f35889a);
        }
        this.A = campaignEx;
        a(campaignEx, i10, z10);
    }

    private void b(Activity activity) {
        if (this.f35895g == null) {
            if (activity != null) {
                this.f35895g = new f(activity, this.f35890b, this.f35889a);
            } else {
                this.f35895g = new f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35890b, this.f35889a);
            }
        }
        if (this.f35899k == null) {
            if (activity != null) {
                this.f35899k = new MBSplashView(activity);
            } else {
                this.f35899k = new MBSplashView(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        }
        if (this.f35904q == null) {
            this.f35904q = new k();
        }
        this.f35904q.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f35889a);
    }

    private void a(String str, int i10) {
        boolean zB;
        synchronized (this.f35909v) {
            try {
                if (this.f35902o) {
                    if (this.f35896h != null) {
                        this.f35896h.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f35902o = true;
                    }
                    return;
                }
                this.f35902o = true;
                int i11 = this.f35892d;
                if (i11 >= 2 && i11 <= 10) {
                    if (this.f35907t != 0 && this.f35908u != 0) {
                        try {
                            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                        } catch (Exception unused) {
                            zB = false;
                        }
                        if (!zB) {
                            if (this.f35896h != null) {
                                this.f35896h.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                                return;
                            }
                            return;
                        }
                        this.f35899k.clearResState();
                        this.f35901n = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35889a);
                        if (this.f35894f == null) {
                            this.f35894f = new e(this.f35890b, this.f35889a, this.f35893e * 1000);
                        }
                        b bVar = this.f35896h;
                        if (bVar != null) {
                            bVar.a(str);
                            this.f35894f.a(this.f35896h);
                        }
                        this.f35899k.resetLoadState();
                        this.f35894f.a(this.f35892d);
                        this.f35894f.a(this.f35899k);
                        this.f35894f.a(this.f35901n);
                        this.f35894f.a(this.f35907t, this.f35908u);
                        this.f35894f.a(this.f35905r);
                        this.f35894f.b(this.f35906s);
                        this.f35894f.a(str, i10);
                        return;
                    }
                    if (this.f35896h != null) {
                        this.f35896h.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                        return;
                    }
                    return;
                }
                if (this.f35896h != null) {
                    com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880037);
                    bVar2.c("countDownTime must in 2 - 10");
                    this.f35896h.a(bVar2, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f35900m = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f35899k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.n().d(), new BaseSplashPopView.i(this.f35890b, this.f35889a, zoomOutTypeEnum.getIndex(), this.A), this.f35898j);
        this.B = mBSplashPopView;
        return mBSplashPopView;
    }

    private void a(int i10, int i11) {
        int iN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
        int iM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
        int i12 = this.f35906s;
        if (i12 == 1) {
            if (iM >= i11 * 4) {
                this.f35908u = iM - i11;
                this.f35907t = iN;
                return;
            } else {
                this.f35908u = 0;
                this.f35907t = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (iN >= i10 * 4) {
                this.f35907t = iN - i10;
                this.f35908u = iM;
            } else {
                this.f35908u = 0;
                this.f35907t = 0;
            }
        }
    }

    public void a(boolean z10) {
        MBSplashView mBSplashView = this.f35899k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z10);
        }
    }

    private ViewGroup a(Activity activity) {
        ViewGroup viewGroup;
        Throwable th2;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            q0.d(D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
            try {
                try {
                    return (ViewGroup) viewGroup.getChildAt(0);
                } catch (Throwable th3) {
                    th2 = th3;
                    th2.printStackTrace();
                    return viewGroup;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th4) {
            viewGroup = null;
            th2 = th4;
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        try {
            MBSplashView mBSplashView = this.f35899k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i10, i11, i12, i13);
            }
        } catch (Throwable th2) {
            q0.b(D, th2.getMessage());
        }
    }

    public void a() {
        this.A = null;
        if (this.f35897i != null) {
            this.f35897i = null;
        }
        if (this.f35896h != null) {
            this.f35896h = null;
        }
        if (this.f35898j != null) {
            this.f35898j = null;
        }
        e eVar = this.f35894f;
        if (eVar != null) {
            eVar.e();
        }
        f fVar = this.f35895g;
        if (fVar != null) {
            fVar.h();
        }
        if (this.f35912y != null) {
            this.f35912y = null;
        }
    }
}
