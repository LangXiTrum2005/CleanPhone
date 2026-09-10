package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class za extends w7 implements View.OnClickListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f41769E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public vd f41770F;
    public boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f41771I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Runnable f41772J;
    public WebView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f41773w;
    public ImageButton x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ag f41774z;
    public long y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f41767A = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f41768B = false;
    public int C = 0;
    public boolean D = false;
    public y0 G = new ya(this);
    public final oa K = new oa(this);
    public final pa L = new pa(this);
    public final qa M = new qa(this);

    @Override // com.startapp.sdk.internal.w7
    public void a(Bundle bundle) {
        zb.a(this.f41606a).a(this.f41608c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            if (bundle.containsKey("postrollHtml")) {
                a(bundle.getString("postrollHtml"));
            }
            this.f41768B = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.C = bundle.getInt("replayNum");
        }
    }

    @Override // com.startapp.sdk.internal.w7
    public final void b(Bundle bundle) {
        String str = this.f41612l;
        if (str != null) {
            bundle.putString("postrollHtml", str);
        }
        bundle.putBoolean("videoCompletedBroadcastSent", this.f41768B);
        bundle.putInt("replayNum", this.C);
    }

    @Override // com.startapp.sdk.internal.w7
    public boolean c() {
        if (this.G.c()) {
            return true;
        }
        if (this.t != null && SystemClock.uptimeMillis() - this.f41769E < this.t.longValue()) {
            return true;
        }
        i();
        ih.f41097a.getClass();
        ag agVar = this.f41774z;
        if (agVar == null) {
            return false;
        }
        agVar.a("AD_CLOSED_TOO_QUICKLY", null);
        return false;
    }

    @Override // com.startapp.sdk.internal.w7
    public final void d() {
        this.G.e();
    }

    @Override // com.startapp.sdk.internal.w7
    public final void e() {
        super.e();
        vd vdVar = this.f41770F;
        if (vdVar != null) {
            AdSession adSession = vdVar.f41579a;
            if (adSession != null) {
                adSession.finish();
            }
            this.f41770F = null;
        }
        WebView webView = this.v;
        long jN = MetaData.E().N();
        WeakHashMap weakHashMap = vi.f41589a;
        new Handler(Looper.getMainLooper()).postDelayed(new ri(webView), jN);
    }

    @Override // com.startapp.sdk.internal.w7
    public void f() {
        this.H = false;
        this.f41771I = true;
        this.G.f();
        ag agVar = this.f41774z;
        if (agVar != null) {
            agVar.a();
        }
        WebView webView = this.v;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // com.startapp.sdk.internal.w7
    public void g() {
        this.H = true;
        this.f41771I = false;
        Ad ad = this.k;
        if (ad instanceof na ? ((na) ad).hasAdCacheTtlPassed() : false) {
            b();
        } else {
            ih.f41097a.getClass();
            WebView webView = this.v;
            if (webView == null) {
                RelativeLayout relativeLayout = new RelativeLayout(this.f41606a);
                this.f41773w = relativeLayout;
                relativeLayout.setFitsSystemWindows(true);
                this.f41773w.setContentDescription("StartApp Ad");
                this.f41773w.setId(i0.f41076h);
                this.f41606a.setContentView(this.f41773w);
                try {
                    this.v = ((tk) com.startapp.sdk.components.a.a(this.f41606a).f40735b.a()).c();
                    this.y = SystemClock.uptimeMillis();
                    this.v.setBackgroundColor(-16777216);
                    this.f41606a.getWindow().getDecorView().findViewById(R.id.content).setBackgroundColor(7829367);
                    this.v.setVerticalScrollBarEnabled(false);
                    this.v.setHorizontalScrollBarEnabled(false);
                    this.v.getSettings().setJavaScriptEnabled(true);
                    q0.a(this.v);
                    if (this.f41615u) {
                        this.v.setLayerType(1, null);
                    }
                    this.v.setOnLongClickListener(new ra());
                    this.v.setLongClickable(false);
                    this.v.addJavascriptInterface(l(), "startappwall");
                    a(this.v);
                    this.v.setWebViewClient(new xa(this));
                    this.v.setWebChromeClient(new sa());
                    vi.a(this.v, this.f41612l);
                    Log.println(2, "StartAppSDK", "Interstitial start rendering the ad content");
                    this.D = com.p004ironsource.mediationsdk.metadata.a.g.equals(vi.a(this.f41612l, "@jsTag@", "@jsTag@"));
                    this.f41773w.addView(this.v, new RelativeLayout.LayoutParams(-1, -1));
                    a(this.f41773w);
                } catch (Throwable th) {
                    g9.a(th);
                    b();
                }
            } else {
                webView.onResume();
                ag agVar = this.f41774z;
                if (agVar != null) {
                    agVar.c();
                }
            }
        }
        this.G.g();
    }

    public void i() {
        String str;
        String[] strArr = this.d;
        if (strArr == null || strArr.length <= 0 || (str = strArr[0]) == null) {
            return;
        }
        h0.a(this.f41606a, str, new CloseTrackingParams(this.o, k()));
    }

    public final void j() {
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f41606a);
            ImageButton imageButton = new ImageButton(this.f41606a);
            this.x = imageButton;
            imageButton.setBackgroundColor(0);
            this.x.setOnClickListener(this);
            int iA = li.a(this.f41606a, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.addRule(13);
            relativeLayout.addView(this.x, layoutParams);
            this.G.a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f41773w.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.y) / 1000;
    }

    public fb l() {
        OverlayActivity overlayActivity = this.f41606a;
        oa oaVar = this.K;
        pa paVar = this.L;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.o, k());
        boolean[] zArr = this.f;
        boolean z2 = (zArr == null || zArr.length <= 0) ? true : zArr[0];
        fb fbVar = new fb(overlayActivity, oaVar, closeTrackingParams);
        fbVar.f40964b = z2;
        fbVar.d = oaVar;
        fbVar.f40966e = paVar;
        return fbVar;
    }

    public long m() {
        Long l2 = this.f41614p;
        return l2 != null ? TimeUnit.SECONDS.toMillis(l2.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
    }

    public TrackingParams n() {
        TrackingParams trackingParams = new TrackingParams(this.o);
        y0 y0Var = this.G;
        y0Var.getClass();
        trackingParams.a(y0Var instanceof xc);
        return trackingParams;
    }

    public boolean o() {
        return this.G.b();
    }

    public void onClick(View view) {
        this.G.d();
    }

    public void p() {
        ag agVar = this.f41774z;
        if (agVar != null) {
            agVar.c();
        }
    }

    public void q() {
        a(this.x);
        this.f41769E = SystemClock.uptimeMillis();
    }

    public void r() {
    }

    public final void s() {
        if (o() && !this.f41768B && this.C == 0) {
            this.f41768B = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", a());
            zb.a(this.f41606a).a(intent);
            r();
        }
    }

    public final void t() {
        try {
            if (this.x != null) {
                this.x.setImageDrawable(l2.a(this.f41606a.getResources()));
                this.x.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.x.setVisibility(0);
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v2 */
    public final void b(String str, int i2, boolean z2) {
        String str2;
        Boolean bool;
        boolean zP = MetaData.E().p();
        OverlayActivity overlayActivity = this.f41606a;
        String[] strArr = this.f41611i;
        boolean z3 = true;
        String[] strArr2 = i2 < strArr.length ? new String[]{strArr[i2]} : null;
        String[] strArr3 = this.j;
        if (i2 < strArr3.length) {
            str2 = strArr3[i2];
            bool = null;
        } else {
            str2 = null;
            bool = null;
        }
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.o, k());
        long jY = AdsCommonMetaData.k().y();
        long jX = AdsCommonMetaData.k().x();
        boolean[] zArr = this.f;
        if (zArr != null && i2 >= 0 && i2 < zArr.length) {
            z3 = zArr[i2];
        }
        Boolean[] boolArr = this.q;
        h0.a(overlayActivity, str, strArr2, str2, closeTrackingParams, jY, jX, z3, (boolArr == null || i2 < 0 || i2 >= boolArr.length) ? bool : boolArr[i2], z2, zP ? new va(this) : bool);
    }

    public void a(WebView webView) {
        this.f41767A = false;
        webView.setOnTouchListener(new ta(this));
        webView.setBackgroundColor(0);
    }

    public void a(ImageButton imageButton) {
        AdInformationView adInformationView;
        if (MetaData.E().j0()) {
            try {
                vd vdVar = new vd(this.v);
                this.f41770F = vdVar;
                AdSession adSession = vdVar.f41579a;
                if (adSession != null) {
                    if (adSession != null) {
                        adSession.start();
                    }
                    com.startapp.sdk.adsbase.adinformation.a aVar = this.f41607b;
                    if (aVar != null && (adInformationView = aVar.f40608b) != null) {
                        vd vdVar2 = this.f41770F;
                        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                        AdSession adSession2 = vdVar2.f41579a;
                        if (adSession2 != null) {
                            adSession2.addFriendlyObstruction(adInformationView, friendlyObstructionPurpose, null);
                        }
                    }
                    if (imageButton != null) {
                        vd vdVar3 = this.f41770F;
                        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.CLOSE_AD;
                        AdSession adSession3 = vdVar3.f41579a;
                        if (adSession3 != null) {
                            adSession3.addFriendlyObstruction(imageButton, friendlyObstructionPurpose2, null);
                        }
                    }
                    vd vdVar4 = this.f41770F;
                    WebView webView = this.v;
                    AdSession adSession4 = vdVar4.f41579a;
                    if (adSession4 != null) {
                        adSession4.registerAdView(webView);
                    }
                    vd vdVar5 = this.f41770F;
                    if (vdVar5.f41580b != null && vdVar5.f41582e.compareAndSet(false, true)) {
                        vdVar5.f41580b.loaded();
                    }
                    this.f41770F.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.w7
    public void b() {
        super.b();
        ih.f41097a.getClass();
        ag agVar = this.f41774z;
        if (agVar != null) {
            agVar.a("AD_CLOSED_TOO_QUICKLY", null);
        }
        this.f41606a.runOnUiThread(new wa(this));
    }

    public boolean a(String str, boolean z2) {
        this.G.a();
        ag agVar = this.f41774z;
        if (agVar != null) {
            agVar.a(null, null);
        }
        Context contextA = x0.a(this.f41606a);
        if (contextA == null) {
            contextA = this.f41606a;
        }
        boolean zA = h0.a(contextA);
        if (this.G.a(str)) {
            try {
                String[] strArrSplit = str.split(com.ironsource.d9.i.f24749c);
                int i2 = Integer.parseInt(strArrSplit[strArrSplit.length - 1].split(com.ironsource.d9.i.f24747b)[1]);
                if (this.f41609e[i2] && !zA) {
                    b(str, i2, z2);
                } else {
                    a(str, i2, z2);
                }
            } catch (Throwable th) {
                g9.a(th);
                return false;
            }
        } else if (this.f41609e[0] && !zA) {
            b(str, 0, z2);
        } else {
            a(str, 0, z2);
        }
        return true;
    }

    public final void a(String str, int i2, boolean z2) {
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", a());
        zb.a(this.f41606a).a(intent);
        Context contextA = x0.a(this.f41606a);
        if (contextA == null) {
            contextA = this.f41606a;
        }
        boolean zA = h0.a(contextA);
        OverlayActivity overlayActivity = this.f41606a;
        String[] strArr = this.f41611i;
        boolean z3 = true;
        String[] strArr2 = i2 < strArr.length ? new String[]{strArr[i2]} : null;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.o, k());
        boolean[] zArr = this.f;
        if (!((zArr == null || i2 < 0 || i2 >= zArr.length) ? true : zArr[i2]) || zA) {
            z3 = false;
        }
        h0.a(overlayActivity, str, strArr2, closeTrackingParams, z3, z2);
        if (MetaData.E().p()) {
            b();
        }
    }
}
