package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C0335f8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r30 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, b30 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f19324c0 = 0;
    public t30 A;
    public boolean B;
    public boolean C;
    public ao D;
    public dg0 E;
    public ri F;
    public int G;
    public int H;
    public em I;
    public final em J;
    public em K;
    public final lj1 L;
    public int M;
    public zzm N;
    public boolean O;
    public final zzci P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public HashMap V;
    public final WindowManager W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c40 f19325a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final pj f19326a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf f19327b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f19328b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pu0 f19329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sm f19330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VersionInfoParcel f19331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzn f19332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zza f19333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DisplayMetrics f19334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public du0 f19336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fu0 f19337k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g30 f19339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zzm f19340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public km0 f19341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public jm0 f19342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t0 f19343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f19344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19346u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19347v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f19349x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f19350y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f19351z;

    public r30(c40 c40Var, t0 t0Var, String str, boolean z10, qf qfVar, sm smVar, VersionInfoParcel versionInfoParcel, zzn zznVar, zza zzaVar, pj pjVar, du0 du0Var, fu0 fu0Var, pu0 pu0Var) {
        fu0 fu0Var2;
        String str2;
        super(c40Var);
        this.l = false;
        this.f19338m = false;
        this.f19350y = true;
        this.f19351z = "";
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.f19325a = c40Var;
        this.f19343r = t0Var;
        this.f19344s = str;
        this.f19347v = z10;
        this.f19327b = qfVar;
        this.f19329c = pu0Var;
        this.f19330d = smVar;
        this.f19331e = versionInfoParcel;
        this.f19332f = zznVar;
        this.f19333g = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.W = windowManager;
        zzt.zzc();
        DisplayMetrics displayMetricsZzv = zzs.zzv(windowManager);
        this.f19334h = displayMetricsZzv;
        this.f19335i = displayMetricsZzv.density;
        this.f19326a0 = pjVar;
        this.f19336j = du0Var;
        this.f19337k = fu0Var;
        this.P = new zzci(c40Var.f13031a, this, this, null);
        this.f19328b0 = false;
        setBackgroundColor(0);
        if (((Boolean) zzba.zzc().a(am.f12260md)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            int i10 = zze.zza;
            zzo.zzg("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) zzba.zzc().a(am.f12245ld)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) zzba.zzc().a(am.Se)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(zzt.zzc().zze(c40Var, versionInfoParcel.afmaVersion));
        zzt.zzc();
        zzs.zzp(getContext(), settings);
        setDownloadListener(this);
        u0();
        addJavascriptInterface(new u30(this, new vf(this, 14)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        lj1 lj1Var = this.L;
        if (lj1Var != null) {
            gm gmVar = (gm) lj1Var.f17037c;
            com.google.android.gms.internal.consent_sdk.d dVarA = zzt.zzh().a();
            if (dVarA != null) {
                ((ArrayBlockingQueue) dVarA.f22981a).offer(gmVar);
            }
        }
        gm gmVar2 = new gm(this.f19344s);
        lj1 lj1Var2 = new lj1(gmVar2);
        this.L = lj1Var2;
        synchronized (gmVar2.f14898c) {
        }
        if (((Boolean) zzba.zzc().a(am.G2)).booleanValue() && (fu0Var2 = this.f19337k) != null && (str2 = fu0Var2.f14546b) != null) {
            gmVar2.c("gqi", str2);
        }
        em emVarD = gm.d();
        this.J = emVarD;
        ((HashMap) lj1Var2.f17036b).put("native:view_create", emVarD);
        this.K = null;
        this.I = null;
        zzce.zza().zzb(c40Var);
        zzt.zzh().f14139k.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void A(boolean z10) {
        zzm zzmVar;
        int i10 = this.G + (true != z10 ? -1 : 1);
        this.G = i10;
        if (i10 > 0 || (zzmVar = this.f19340o) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void B(long j10, boolean z10) {
        HashMap map = new HashMap(2);
        map.put("success", true != z10 ? "0" : "1");
        map.put(IronSourceConstants.EVENTS_DURATION, Long.toString(j10));
        e("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void C() {
        g30 g30Var = this.f19339n;
        if (g30Var != null) {
            g30Var.C();
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void D(String str, oq oqVar) {
        g30 g30Var = this.f19339n;
        if (g30Var != null) {
            g30Var.b(str, oqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void E(du0 du0Var, fu0 fu0Var) {
        this.f19336j = du0Var;
        this.f19337k = fu0Var;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void F(t0 t0Var) {
        this.f19343r = t0Var;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void G(int i10) {
        em emVar = this.J;
        lj1 lj1Var = this.L;
        if (i10 == 0) {
            pi1.j((gm) lj1Var.f17037c, emVar, "aebb2");
        }
        pi1.j((gm) lj1Var.f17037c, emVar, "aeh2");
        lj1Var.getClass();
        ((gm) lj1Var.f17037c).c("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put("version", this.f19331e.afmaVersion);
        e("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean H(final int i10, final boolean z10) {
        destroy();
        oj ojVar = new oj() { // from class: com.google.android.gms.internal.ads.q30
            @Override // com.google.android.gms.internal.ads.oj
            public final void a(ml mlVar) {
                int i11 = r30.f19324c0;
                al alVarA = bl.A();
                boolean z11 = ((bl) alVarA.f19193b).z();
                boolean z12 = z10;
                if (z11 != z12) {
                    alVarA.b();
                    ((bl) alVarA.f19193b).B(z12);
                }
                alVarA.b();
                ((bl) alVarA.f19193b).C(i10);
                bl blVar = (bl) alVarA.e();
                mlVar.b();
                ((nl) mlVar.f19193b).I(blVar);
            }
        };
        pj pjVar = this.f19326a0;
        pjVar.a(ojVar);
        pjVar.b(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void I(boolean z10) {
        this.f19339n.E = z10;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r10.U != r9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.g30 r0 = r10.f19339n
            java.lang.Object r1 = r0.f14697d
            monitor-enter(r1)
            boolean r0 = r0.f14709q     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc1
            r1 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.internal.ads.g30 r0 = r10.f19339n
            boolean r0 = r0.v0()
            if (r0 != 0) goto L15
            goto L88
        L15:
            com.google.android.gms.ads.internal.client.zzay.zza()
            android.util.DisplayMetrics r0 = r10.f19334h
            int r2 = r0.widthPixels
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r0, r2)
            com.google.android.gms.ads.internal.client.zzay.zza()
            int r2 = r0.heightPixels
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r0, r2)
            com.google.android.gms.internal.ads.c40 r2 = r10.f19325a
            android.app.Activity r2 = r2.f13031a
            r3 = 1
            if (r2 == 0) goto L52
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L37
            goto L52
        L37:
            com.google.android.gms.ads.internal.zzt.zzc()
            int[] r2 = com.google.android.gms.ads.internal.util.zzs.zzV(r2)
            com.google.android.gms.ads.internal.client.zzay.zza()
            r6 = r2[r1]
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r0, r6)
            com.google.android.gms.ads.internal.client.zzay.zza()
            r2 = r2[r3]
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r0, r2)
            r7 = r2
            goto L54
        L52:
            r6 = r4
            r7 = r5
        L54:
            com.google.android.gms.ads.internal.zzt.zzc()
            android.view.WindowManager r2 = r10.W
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.R
            if (r2 != r4) goto L89
            int r2 = r10.Q
            if (r2 != r5) goto L89
            int r2 = r10.S
            if (r2 != r6) goto L89
            int r2 = r10.T
            if (r2 != r7) goto L89
            com.google.android.gms.internal.ads.ul r2 = com.google.android.gms.internal.ads.am.K0
            com.google.android.gms.internal.ads.yl r8 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r8.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L88
            int r2 = r10.U
            if (r2 == r9) goto L88
            goto L89
        L88:
            return r1
        L89:
            int r2 = r10.R
            if (r2 != r4) goto La7
            int r2 = r10.Q
            if (r2 != r5) goto La7
            com.google.android.gms.internal.ads.ul r2 = com.google.android.gms.internal.ads.am.K0
            com.google.android.gms.internal.ads.yl r8 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r8.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La8
            int r2 = r10.U
            if (r2 == r9) goto La8
        La7:
            r1 = r3
        La8:
            r10.R = r4
            r10.Q = r5
            r10.S = r6
            r10.T = r7
            r10.U = r9
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.md0 r3 = new com.google.android.gms.internal.ads.md0
            r8 = 10
            r3.<init>(r8, r10, r2)
            float r8 = r0.density
            r3.l(r4, r5, r6, r7, r8, r9)
            return r1
        Lc1:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc1
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r30.J():boolean");
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void K() {
        zze.zza("Destroying WebView!");
        v0();
        zzs.zza.post(new o30(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void L() {
        this.f19328b0 = true;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void M(boolean z10) {
        try {
            boolean z11 = this.f19347v;
            this.f19347v = z10;
            u0();
            if (z10 != z11) {
                if (((Boolean) zzba.zzc().a(am.I0)).booleanValue()) {
                    if (!this.f19343r.b()) {
                    }
                }
                try {
                    f("onStateChanged", new JSONObject().put("state", true != z10 ? BuildConfig.FLAVOR : "expanded"));
                } catch (JSONException e10) {
                    int i10 = zze.zza;
                    zzo.zzg("Error occurred while dispatching state change.", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void N(t30 t30Var) {
        if (this.A == null) {
            this.A = t30Var;
        } else {
            int i10 = zze.zza;
            zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void O() {
        g30 g30Var = this.f19339n;
        if (g30Var != null) {
            g30Var.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized boolean P() {
        return this.f19350y;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #4 {, blocks: (B:33:0x003b, B:35:0x0041, B:40:0x0048), top: B:74:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0048 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:33:0x003b, B:35:0x0041, B:40:0x0048), top: B:74:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0053  */
    /* JADX WARN: Code duplicated, block: B:49:0x0060 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #2 {, blocks: (B:47:0x005a, B:49:0x0060, B:54:0x0067), top: B:69:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0067 A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:47:0x005a, B:49:0x0060, B:54:0x0067), top: B:69:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void Q(String str) {
        Boolean bool;
        Boolean bool2;
        String strConcat;
        Boolean bool3;
        synchronized (this) {
            bool = this.f19349x;
        }
        if (bool == null) {
            synchronized (this) {
                f00 f00VarZzh = zzt.zzh();
                synchronized (f00VarZzh.f14129a) {
                    bool3 = f00VarZzh.f14138j;
                }
                this.f19349x = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        Y(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        Y(Boolean.FALSE);
                    }
                }
            }
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (l()) {
                        int i10 = zze.zza;
                        zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (l()) {
                    int i11 = zze.zza;
                    zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                } else {
                    loadUrl(strConcat);
                }
            }
        }
        synchronized (this) {
            bool2 = this.f19349x;
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (l()) {
                        evaluateJavascript(str, null);
                    } else {
                        int i12 = zze.zza;
                        zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    }
                    return;
                }
            }
            strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (l()) {
                    loadUrl(strConcat);
                } else {
                    int i13 = zze.zza;
                    zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void R(dg0 dg0Var) {
        this.E = dg0Var;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void S(boolean z10, int i10, String str, String str2, boolean z11) {
        g30 g30Var = this.f19339n;
        b30 b30Var = g30Var.f14694a;
        boolean zI = b30Var.i();
        boolean zN0 = g30.n0(zI, b30Var);
        boolean z12 = true;
        if (!zN0 && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zN0 ? null : g30Var.f14698e;
        f30 f30Var = zI ? null : new f30(b30Var, g30Var.f14699f);
        fq fqVar = g30Var.f14702i;
        zl0 zl0Var = null;
        gq gqVar = g30Var.f14703j;
        boolean z13 = z12;
        f30 f30Var2 = f30Var;
        zzad zzadVar = g30Var.f14713u;
        VersionInfoParcel versionInfoParcelZzs = b30Var.zzs();
        qc0 qc0Var = z13 ? null : g30Var.f14704k;
        if (g30.j0(b30Var)) {
            zl0Var = g30Var.G;
        }
        g30Var.a(new AdOverlayInfoParcel(zzaVar, f30Var2, fqVar, gqVar, zzadVar, b30Var, z10, i10, str, str2, versionInfoParcelZzs, qc0Var, zl0Var));
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void T(jm0 jm0Var) {
        this.f19342q = jm0Var;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void U(int i10) {
        zzm zzmVar = this.f19340o;
        if (zzmVar != null) {
            zzmVar.zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void V(String str, String str2) {
        g30 g30Var = this.f19339n;
        zl0 zl0Var = g30Var.G;
        b30 b30Var = g30Var.f14694a;
        g30Var.a(new AdOverlayInfoParcel(b30Var, b30Var.zzs(), str, str2, 14, zl0Var));
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void W() {
        if (this.K == null) {
            lj1 lj1Var = this.L;
            lj1Var.getClass();
            em emVarD = gm.d();
            this.K = emVarD;
            ((HashMap) lj1Var.f17036b).put("native:view_load", emVarD);
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void X(ri riVar) {
        this.F = riVar;
    }

    public final void Y(Boolean bool) {
        synchronized (this) {
            this.f19349x = bool;
        }
        f00 f00VarZzh = zzt.zzh();
        synchronized (f00VarZzh.f14129a) {
            f00VarZzh.f14138j = bool;
        }
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void a(String str, String str2) {
        Q(d5.u.h(new StringBuilder(com.applovin.impl.ca.i(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void a0(km0 km0Var) {
        this.f19341p = km0Var;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void b(String str, JSONObject jSONObject) {
        a(str, jSONObject.toString());
    }

    public final /* synthetic */ void b0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final int c() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void c0(boolean z10) {
        boolean z11;
        zzm zzmVar = this.f19340o;
        if (zzmVar == null) {
            this.f19345t = z10;
            return;
        }
        g30 g30Var = this.f19339n;
        synchronized (g30Var.f14697d) {
            z11 = g30Var.f14709q;
        }
        zzmVar.zzt(z11, z10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final Context d() {
        return this.f19325a.f13033c;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void d0(int i10, boolean z10) {
        if (z10) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzm zzmVar = this.f19340o;
        if (zzmVar != null) {
            zzmVar.zzu(z10, i10);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.b30
    public final synchronized void destroy() {
        try {
            lj1 lj1Var = this.L;
            if (lj1Var != null) {
                gm gmVar = (gm) lj1Var.f17037c;
                com.google.android.gms.internal.consent_sdk.d dVarA = zzt.zzh().a();
                if (dVarA != null) {
                    ((ArrayBlockingQueue) dVarA.f22981a).offer(gmVar);
                }
            }
            this.P.zzc();
            zzm zzmVar = this.f19340o;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.f19340o.zzq();
                this.f19340o = null;
            }
            this.f19341p = null;
            this.f19342q = null;
            this.f19339n.f();
            this.F = null;
            this.f19332f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f19346u) {
                return;
            }
            zzt.zzB().b(this);
            y0();
            this.f19346u = true;
            if (!((Boolean) zzba.zzc().a(am.f12365tc)).booleanValue()) {
                zze.zza("Destroying the WebView immediately...");
                K();
                return;
            }
            Activity activity = this.f19325a.f13031a;
            if (activity != null && activity.isDestroyed()) {
                zze.zza("Destroying the WebView immediately...");
                K();
            } else {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                q0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void e(String str, Map map) {
        try {
            f(str, zzay.zza().zzm(map));
        } catch (JSONException unused) {
            int i10 = zze.zza;
            zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void e0(String str, e20 e20Var) {
        try {
            if (this.V == null) {
                this.V = new HashMap();
            }
            this.V.put(str, e20Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (l()) {
            int i10 = zze.zza;
            zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) zzba.zzc().a(am.f12380uc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            l00.f16613f.a(new o1(this, str, valueCallback, 5));
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void f(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbV = defpackage.e.v("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbV.toString();
        int i10 = zze.zza;
        zzo.zzd("Dispatching AFMA event: ".concat(string));
        Q(sbV.toString());
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized zzm f0() {
        return this.N;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f19346u) {
                        this.f19339n.f();
                        zzt.zzB().b(this);
                        y0();
                        v0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            super.finalize();
        } catch (Throwable th3) {
            super.finalize();
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized e20 g(String str) {
        HashMap map = this.V;
        if (map == null) {
            return null;
        }
        return (e20) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void g0(zzm zzmVar) {
        this.N = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void h() {
        pi1.j((gm) this.L.f17037c, this.J, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f19331e.afmaVersion);
        e("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void h0(String str, x11 x11Var) {
        g30 g30Var = this.f19339n;
        if (g30Var != null) {
            synchronized (g30Var.f14697d) {
                try {
                    List<oq> list = (List) g30Var.f14696c.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (oq oqVar : list) {
                        if (oqVar instanceof ks) {
                            if (((ks) oqVar).f16514a.equals((oq) x11Var.f21703b)) {
                                arrayList.add(oqVar);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized boolean i() {
        return this.f19347v;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void i0(zzc zzcVar, boolean z10, boolean z11, String str) {
        this.f19339n.A0(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized ri j() {
        return this.F;
    }

    public final /* synthetic */ void j0(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void k0(boolean z10, int i10, String str, boolean z11, boolean z12) {
        g30 g30Var = this.f19339n;
        b30 b30Var = g30Var.f14694a;
        boolean zI = b30Var.i();
        boolean zN0 = g30.n0(zI, b30Var);
        boolean z13 = true;
        if (!zN0 && z11) {
            z13 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zN0 ? null : g30Var.f14698e;
        f30 f30Var = zI ? null : new f30(b30Var, g30Var.f14699f);
        fq fqVar = g30Var.f14702i;
        zl0 zl0Var = null;
        gq gqVar = g30Var.f14703j;
        boolean z14 = z13;
        f30 f30Var2 = f30Var;
        zzad zzadVar = g30Var.f14713u;
        VersionInfoParcel versionInfoParcelZzs = b30Var.zzs();
        qc0 qc0Var = z14 ? null : g30Var.f14704k;
        if (g30.j0(b30Var)) {
            zl0Var = g30Var.G;
        }
        g30Var.a(new AdOverlayInfoParcel(zzaVar, f30Var2, fqVar, gqVar, zzadVar, b30Var, z10, i10, str, versionInfoParcelZzs, qc0Var, zl0Var, z12));
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized boolean l() {
        return this.f19346u;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void l0() {
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.b30
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!l()) {
            super.loadData(str, str2, str3);
        } else {
            int i10 = zze.zza;
            zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.b30
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!l()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            int i10 = zze.zza;
            zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.b30
    public final synchronized void loadUrl(String str) {
        if (l()) {
            int i10 = zze.zza;
            zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            zzs.zza.post(new zd1(16, this, str));
        } catch (Throwable th2) {
            zzt.zzh().d("AdWebViewImpl.loadUrl", th2);
            int i11 = zze.zza;
            zzo.zzj("Could not call loadUrl. ", th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void m() {
        if (this.I == null) {
            lj1 lj1Var = this.L;
            pi1.j((gm) lj1Var.f17037c, this.J, "aes2");
            em emVarD = gm.d();
            this.I = emVarD;
            ((HashMap) lj1Var.f17036b).put("native:view_show", emVarD);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f19331e.afmaVersion);
        e("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final qf m0() {
        return this.f19327b;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized String n() {
        return this.f19344s;
    }

    public final /* synthetic */ void n0() {
        super.loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final ListenableFuture o() {
        sm smVar = this.f19330d;
        return smVar == null ? be1.f12743b : (vd1) zw1.v(vd1.r(be1.f12743b), ((Long) en.f14019c.o()).longValue(), TimeUnit.MILLISECONDS, smVar.f19999c);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean o0() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        g30 g30Var = this.f19339n;
        if (g30Var != null) {
            g30Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!l()) {
                this.P.zzd();
            }
            if (this.f19328b0) {
                onResume();
                this.f19328b0 = false;
            }
            boolean z10 = this.B;
            g30 g30Var = this.f19339n;
            if (g30Var != null && g30Var.v0()) {
                if (!this.C) {
                    synchronized (this.f19339n.f14697d) {
                    }
                    synchronized (this.f19339n.f14697d) {
                    }
                    this.C = true;
                }
                J();
                z10 = true;
            }
            z0(z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g30 g30Var;
        synchronized (this) {
            try {
                if (!l()) {
                    this.P.zze();
                }
                super.onDetachedFromWindow();
                if (this.C && (g30Var = this.f19339n) != null && g30Var.v0() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.f19339n.f14697d) {
                    }
                    synchronized (this.f19339n.f14697d) {
                    }
                    this.C = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) zzba.zzc().a(am.Ic)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zzt.zzc();
            zzs.zzY(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            String strH = d5.u.h(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i10 = zze.zza;
            zzo.zzd(strH);
            zzt.zzh().d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (l()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zJ = J();
        zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zJ) {
            return;
        }
        zzmVarZzL.zzC();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0077 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:19:0x0025, B:24:0x002d, B:26:0x003f, B:29:0x0044, B:31:0x004b, B:35:0x0055, B:38:0x005a, B:41:0x006b, B:49:0x0083, B:43:0x0072, B:46:0x0077, B:54:0x0093, B:56:0x00a5, B:59:0x00aa, B:61:0x00c7, B:63:0x00cf, B:62:0x00cb, B:66:0x00d4, B:68:0x00da, B:71:0x00e5, B:80:0x0109, B:82:0x0110, B:86:0x0117, B:88:0x0129, B:90:0x0137, B:94:0x0144, B:97:0x0149, B:99:0x01bd, B:100:0x01c0, B:102:0x01c7, B:107:0x01d4, B:109:0x01da, B:110:0x01dd, B:112:0x01e1, B:113:0x01ea, B:116:0x01f5), top: B:121:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        t0 t0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (l()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f19347v && (i12 = (t0Var = this.f19343r).f20103a) != 0) {
            if (i12 == 5) {
                super.onMeasure(i10, i11);
                return;
            }
            if (i12 == 4) {
                if (((Boolean) zzba.zzc().a(am.S4)).booleanValue()) {
                    super.onMeasure(i10, i11);
                    return;
                }
                t30 t30VarZzh = zzh();
                float fZzm = t30VarZzh != null ? t30VarZzh.zzm() : 0.0f;
                if (fZzm == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                float f10 = size2 * fZzm;
                int i17 = (int) (size / fZzm);
                if (size2 != 0) {
                    i13 = (int) f10;
                    if (size == 0) {
                        i16 = size;
                    } else if (i13 != 0) {
                        i17 = (int) (i13 / fZzm);
                        i14 = size2;
                        i15 = i13;
                        i16 = i15;
                    }
                    i14 = size2;
                    i15 = i13;
                } else if (i17 != 0) {
                    i15 = (int) (i17 * fZzm);
                    i16 = size;
                    i14 = i17;
                } else {
                    size2 = 0;
                    i13 = (int) f10;
                    if (size == 0) {
                        i16 = size;
                    } else if (i13 != 0) {
                        i17 = (int) (i13 / fZzm);
                        i14 = size2;
                        i15 = i13;
                        i16 = i15;
                    }
                    i14 = size2;
                    i15 = i13;
                }
                setMeasuredDimension(Math.min(i15, i16), Math.min(i17, i14));
                return;
            }
            if (i12 == 2) {
                if (((Boolean) zzba.zzc().a(am.f12064a5)).booleanValue()) {
                    super.onMeasure(i10, i11);
                    return;
                }
                D("/contentHeight", new eq(this, 7));
                Q("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f11 = this.f19334h.density;
                int size3 = View.MeasureSpec.getSize(i10);
                int i18 = this.H;
                setMeasuredDimension(size3, i18 != -1 ? (int) (i18 * f11) : View.MeasureSpec.getSize(i11));
                return;
            }
            if (t0Var.b()) {
                DisplayMetrics displayMetrics = this.f19334h;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int size4 = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size5 = View.MeasureSpec.getSize(i11);
            int i19 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i20 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            t0 t0Var2 = this.f19343r;
            boolean z10 = t0Var2.f20105c > i19 || t0Var2.f20104b > i20;
            if (((Boolean) zzba.zzc().a(am.D6)).booleanValue()) {
                t0 t0Var3 = this.f19343r;
                float f12 = t0Var3.f20105c;
                float f13 = this.f19335i;
                z10 &= f12 / f13 <= ((float) i19) / f13 && ((float) t0Var3.f20104b) / f13 <= ((float) i20) / f13;
            }
            if (!z10) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.f19338m) {
                    this.f19326a0.b(10002);
                    this.f19338m = true;
                }
                t0 t0Var4 = this.f19343r;
                setMeasuredDimension(t0Var4.f20105c, t0Var4.f20104b);
                return;
            }
            t0 t0Var5 = this.f19343r;
            float f14 = t0Var5.f20105c;
            float f15 = this.f19335i;
            int i21 = (int) (f14 / f15);
            int i22 = (int) (t0Var5.f20104b / f15);
            int i23 = (int) (size4 / f15);
            int i24 = (int) (size5 / f15);
            StringBuilder sb2 = new StringBuilder(String.valueOf(i21).length() + 36 + String.valueOf(i22).length() + 18 + String.valueOf(i23).length() + 1 + String.valueOf(i24).length() + 4);
            sb2.append("Not enough space to show ad. Needs ");
            sb2.append(i21);
            sb2.append("x");
            sb2.append(i22);
            sb2.append(" dp, but only has ");
            sb2.append(i23);
            sb2.append("x");
            sb2.append(i24);
            sb2.append(" dp.");
            String string = sb2.toString();
            int i25 = zze.zza;
            zzo.zzi(string);
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.l) {
                return;
            }
            this.f19326a0.b(10001);
            this.l = true;
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.b30
    public final void onPause() {
        if (l()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) zzba.zzc().a(am.me)).booleanValue() && a.a.x("MUTE_AUDIO")) {
                int i10 = zze.zza;
                zzo.zzd("Muting webview");
                WeakHashMap weakHashMap = r4.g.f49404a;
                if (!s4.m.f50122h.a()) {
                    throw s4.m.a();
                }
                r4.g.b(this).f50127a.setAudioMuted(true);
            }
        } catch (Exception e10) {
            int i11 = zze.zza;
            zzo.zzg("Could not pause webview.", e10);
            if (((Boolean) zzba.zzc().a(am.pe)).booleanValue()) {
                zzt.zzh().d("AdWebViewImpl.onPause", e10);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.b30
    public final void onResume() {
        if (l()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) zzba.zzc().a(am.me)).booleanValue() && a.a.x("MUTE_AUDIO")) {
                int i10 = zze.zza;
                zzo.zzd("Unmuting webview");
                WeakHashMap weakHashMap = r4.g.f49404a;
                if (!s4.m.f50122h.a()) {
                    throw s4.m.a();
                }
                r4.g.b(this).f50127a.setAudioMuted(false);
            }
        } catch (Exception e10) {
            int i11 = zze.zza;
            zzo.zzg("Could not resume webview.", e10);
            if (((Boolean) zzba.zzc().a(am.pe)).booleanValue()) {
                zzt.zzh().d("AdWebViewImpl.onResume", e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0042 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:27:0x003e, B:29:0x0042, B:32:0x0048), top: B:58:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x004c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0050  */
    /* JADX WARN: Code duplicated, block: B:41:0x0059  */
    /* JADX WARN: Code duplicated, block: B:46:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:58:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        qf qfVar;
        sm smVar;
        ao aoVar;
        boolean z11;
        boolean z12;
        if (((Boolean) zzba.zzc().a(am.A4)).booleanValue()) {
            g30 g30Var = this.f19339n;
            synchronized (g30Var.f14697d) {
                z12 = g30Var.f14711s;
            }
            if (z12) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (this.f19339n.v0()) {
            g30 g30Var2 = this.f19339n;
            synchronized (g30Var2.f14697d) {
                z11 = g30Var2.f14712t;
            }
            if (!z11) {
                synchronized (this) {
                    aoVar = this.D;
                    if (aoVar != null) {
                        aoVar.h(motionEvent);
                    }
                }
            } else if (z10) {
                synchronized (this) {
                    try {
                        aoVar = this.D;
                        if (aoVar != null) {
                            aoVar.h(motionEvent);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                qfVar = this.f19327b;
                if (qfVar != null) {
                    qfVar.f19044b.zzd(motionEvent);
                }
                smVar = this.f19330d;
                if (smVar != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getEventTime() > smVar.f19997a.getEventTime()) {
                        smVar.f19997a = MotionEvent.obtain(motionEvent);
                    } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > smVar.f19998b.getEventTime()) {
                        smVar.f19998b = MotionEvent.obtain(motionEvent);
                    }
                }
            }
        } else if (z10) {
            synchronized (this) {
                aoVar = this.D;
                if (aoVar != null) {
                    aoVar.h(motionEvent);
                }
            }
        } else {
            qfVar = this.f19327b;
            if (qfVar != null) {
                qfVar.f19044b.zzd(motionEvent);
            }
            smVar = this.f19330d;
            if (smVar != null) {
                if (motionEvent.getAction() != 1) {
                    if (motionEvent.getAction() == 0) {
                        smVar.f19998b = MotionEvent.obtain(motionEvent);
                    }
                } else if (motionEvent.getAction() == 0) {
                    smVar.f19998b = MotionEvent.obtain(motionEvent);
                }
            }
        }
        if (l()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void p() {
        this.P.zzb();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final o8 p0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void q(zzm zzmVar) {
        this.f19340o = zzmVar;
    }

    public final synchronized void q0() {
        try {
            zzs.zza.post(new o30(this, 1));
        } catch (Throwable th2) {
            zzt.zzh().d("AdWebViewImpl.loadUrlUnsafe", th2);
            int i10 = zze.zza;
            zzo.zzj("Could not call loadUrl in destroy(). ", th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final fu0 r() {
        return this.f19337k;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void r0(int i10) {
        this.M = i10;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void s() {
        zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized boolean s0() {
        return this.G > 0;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.b30
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof g30) {
            this.f19339n = (g30) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (l()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            int i10 = zze.zza;
            zzo.zzg("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void t(String str, String str2) throws Throwable {
        Throwable th2;
        String str3;
        try {
            try {
                if (l()) {
                    int i10 = zze.zza;
                    zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) zzba.zzc().a(am.H0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e10) {
                        int i11 = zze.zza;
                        zzo.zzj("Unable to build MRAID_ENV", e10);
                        str3 = null;
                    }
                    super.loadDataWithBaseURL(str, x30.a(str2, str3), "text/html", "UTF-8", null);
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized ao t0() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void u(Context context) {
        c40 c40Var = this.f19325a;
        c40Var.setBaseContext(context);
        this.P.zza(c40Var.f13031a);
    }

    public final synchronized void u0() {
        try {
            du0 du0Var = this.f19336j;
            if (du0Var != null && du0Var.f13698m0) {
                int i10 = zze.zza;
                zzo.zzd("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.f19348w) {
                            setLayerType(1, null);
                        }
                        this.f19348w = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            if (this.f19347v || this.f19343r.b()) {
                int i11 = zze.zza;
                zzo.zzd("Enabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (this.f19348w) {
                            setLayerType(0, null);
                        }
                        this.f19348w = false;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            }
            int i12 = zze.zza;
            zzo.zzd("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                try {
                    if (this.f19348w) {
                        setLayerType(0, null);
                    }
                    this.f19348w = false;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return;
        } catch (Throwable th5) {
            throw th5;
        }
        throw th5;
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void v(zh zhVar) {
        boolean z10;
        synchronized (this) {
            z10 = zhVar.f22617j;
            this.B = z10;
        }
        z0(z10);
    }

    public final synchronized void v0() {
        if (this.O) {
            return;
        }
        this.O = true;
        zzt.zzh().f14139k.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void w(String str, oq oqVar) {
        g30 g30Var = this.f19339n;
        if (g30Var != null) {
            synchronized (g30Var.f14697d) {
                try {
                    List list = (List) g30Var.f14696c.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(oqVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void w0(boolean z10) {
        this.f19350y = z10;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized jm0 x() {
        return this.f19342q;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void x0(ao aoVar) {
        this.D = aoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.aw] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // com.google.android.gms.internal.ads.b30
    public final void y(int i10, boolean z10, boolean z11) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        qc0 qc0Var;
        g30 g30Var = this.f19339n;
        b30 b30Var = g30Var.f14694a;
        boolean zN0 = g30.n0(b30Var.i(), b30Var);
        boolean z12 = true;
        if (!zN0 && z11) {
            z12 = false;
        }
        if (zN0) {
            zzaVar = null;
            qc0Var = null;
        } else {
            zzaVar = g30Var.f14698e;
            qc0Var = null;
        }
        qc0 qc0Var2 = qc0Var;
        g30Var.a(new AdOverlayInfoParcel(zzaVar, g30Var.f14699f, g30Var.f14713u, b30Var, z10, i10, b30Var.zzs(), z12 ? qc0Var2 : g30Var.f14704k, g30.j0(b30Var) ? g30Var.G : qc0Var2));
    }

    public final synchronized void y0() {
        try {
            HashMap map = this.V;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((e20) it.next()).g();
                }
            }
            this.V = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void z0(boolean z10) {
        HashMap map = new HashMap();
        map.put(C0335f8.f28653k, true != z10 ? "0" : "1");
        e("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final du0 zzC() {
        return this.f19336j;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final ArrayList zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void zzJ() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(zzt.zzi().zzd()));
        map.put("app_volume", String.valueOf(zzt.zzi().zzb()));
        map.put("device_volume", String.valueOf(zzaa.zze(getContext())));
        e("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized zzm zzL() {
        return this.f19340o;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized t0 zzN() {
        return this.f19343r;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final /* synthetic */ g30 zzP() {
        return this.f19339n;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized boolean zzR() {
        return this.f19345t;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final pu0 zzT() {
        return this.f19329c;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized km0 zzU() {
        return this.f19341p;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zza(String str) {
        Q(str);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        zzn zznVar = this.f19332f;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        zzn zznVar = this.f19332f;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized t30 zzh() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final em zzi() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final Activity zzj() {
        return this.f19325a.f13031a;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final zza zzk() {
        return this.f19333g;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void zzl() {
        zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized String zzm() {
        return this.f19351z;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized String zzn() {
        fu0 fu0Var = this.f19337k;
        if (fu0Var == null) {
            return null;
        }
        return fu0Var.f14546b;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized int zzp() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final lj1 zzq() {
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final VersionInfoParcel zzs() {
        return this.f19331e;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final synchronized void zzz() {
        dg0 dg0Var = this.E;
        if (dg0Var != null) {
            zzs.zza.post(new x60(dg0Var, 9));
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void zzv(int i10) {
    }
}
