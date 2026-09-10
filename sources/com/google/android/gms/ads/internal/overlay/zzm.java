package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.bm0;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.fq;
import com.google.android.gms.internal.ads.g30;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.gw;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.jm0;
import com.google.android.gms.internal.ads.jy0;
import com.google.android.gms.internal.ads.ka0;
import com.google.android.gms.internal.ads.km0;
import com.google.android.gms.internal.ads.ky0;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.lj1;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.qc0;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.tc0;
import com.google.android.gms.internal.ads.tl0;
import com.google.android.gms.internal.ads.ul;
import com.google.android.gms.internal.ads.y01;
import com.google.android.gms.internal.ads.y30;
import com.google.android.gms.internal.ads.yh0;
import com.ironsource.mediationsdk.metadata.a;
import go.c;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class zzm extends gw implements zzah {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f10921x = Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzp = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f10922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdOverlayInfoParcel f10923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b30 f10924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzj f10925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzu f10926e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f10928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f10929h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zzi f10932k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f10936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10938r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Toolbar f10942v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10927f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10930i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10931j = false;
    public boolean l = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10943w = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10933m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f10934n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View.OnClickListener f10935o = new zzd(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10939s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10940t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10941u = true;

    public zzm(Activity activity) {
        this.f10922a = activity;
    }

    public static final void A1(View view, km0 km0Var) {
        if (km0Var == null || view == null) {
            return;
        }
        if (((Boolean) zzba.zzc().a(am.f12343s6)).booleanValue() && ((jy0) km0Var.f16481b.f11931g) == jy0.HTML) {
            return;
        }
        ((tc0) com.google.android.gms.ads.internal.zzt.zzu()).i(km0Var.f16480a, view);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    public final void B1(boolean z10) throws zzh {
        boolean z11;
        boolean z12;
        boolean z13;
        Window window;
        int i10;
        int i11;
        boolean z14;
        Activity activity = this.f10922a;
        if (!this.f10938r) {
            activity.requestWindowFeature(1);
        }
        Window window2 = activity.getWindow();
        if (window2 == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        b30 b30Var = this.f10923b.zzd;
        g30 g30VarZzP = b30Var != null ? b30Var.zzP() : null;
        if (g30VarZzP != null) {
            synchronized (g30VarZzP.f14697d) {
                z14 = g30VarZzP.f14709q;
            }
            if (z14) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.l = false;
        if (z11) {
            int i12 = this.f10923b.zzj;
            if (i12 == 6) {
                z12 = activity.getResources().getConfiguration().orientation == 1;
                this.l = z12;
            } else if (i12 == 7) {
                z12 = activity.getResources().getConfiguration().orientation == 2;
                this.l = z12;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(z12).length() + 41);
        sb2.append("Delay onShow to next orientation change: ");
        sb2.append(z12);
        String string = sb2.toString();
        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        zzw(this.f10923b.zzj);
        window2.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
        activity.setContentView(this.f10932k);
        this.f10938r = true;
        if (this.f10931j) {
            this.f10932k.setBackgroundColor(f10921x);
            if (((Boolean) zzba.zzc().a(am.f12447z1)).booleanValue() && Build.VERSION.SDK_INT >= 31) {
                window2.setBackgroundBlurRadius(this.f10933m);
            }
        } else {
            this.f10932k.setBackgroundColor(-16777216);
        }
        if (z10) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                b30 b30Var2 = this.f10923b.zzd;
                t0 t0VarZzN = b30Var2 != null ? b30Var2.zzN() : null;
                b30 b30Var3 = this.f10923b.zzd;
                String strN = b30Var3 != null ? b30Var3.n() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
                z13 = z11;
                String str = strN;
                VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                b30 b30Var4 = adOverlayInfoParcel.zzd;
                window = window2;
                i10 = 31;
                b30 b30VarA = l30.a(activity, t0VarZzN, str, true, z13, null, null, versionInfoParcel, null, b30Var4 != null ? b30Var4.zzk() : null, new pj(), null, null, null, null, null);
                this.f10924c = b30VarA;
                g30 g30VarZzP2 = b30VarA.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10923b;
                fq fqVar = adOverlayInfoParcel2.zzp;
                gq gqVar = adOverlayInfoParcel2.zze;
                zzad zzadVar = adOverlayInfoParcel2.zzi;
                b30 b30Var5 = adOverlayInfoParcel2.zzd;
                g30VarZzP2.J(null, fqVar, null, gqVar, zzadVar, true, null, b30Var5 != null ? b30Var5.zzP().f14715w : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                this.f10924c.zzP().f14700g = new y30() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                    @Override // com.google.android.gms.internal.ads.y30
                    public final /* synthetic */ void zza(boolean z15, int i14, String str2, String str3) {
                        b30 b30Var6 = this.f10915a.f10924c;
                        if (b30Var6 != null) {
                            b30Var6.m();
                        }
                    }
                };
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f10923b;
                String str2 = adOverlayInfoParcel3.zzl;
                if (str2 != null) {
                    this.f10924c.loadUrl(str2);
                } else {
                    String str3 = adOverlayInfoParcel3.zzh;
                    if (str3 == null) {
                        throw new zzh("No URL or HTML to display in ad overlay.");
                    }
                    this.f10924c.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str3, "text/html", "UTF-8", null);
                }
                b30 b30Var6 = this.f10923b.zzd;
                if (b30Var6 != null) {
                    b30Var6.g0(this);
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e10);
                throw new zzh("Could not obtain webview for the overlay.", e10);
            }
        } else {
            window = window2;
            z13 = z11;
            i10 = 31;
            b30 b30Var7 = this.f10923b.zzd;
            this.f10924c = b30Var7;
            b30Var7.u(activity);
        }
        if (this.f10923b.zzw) {
            i11 = 0;
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f10924c.zzD(), false);
            if (((Boolean) zzba.zzc().a(am.G1)).booleanValue()) {
                this.f10924c.zzD().setTextClassifier(TextClassifier.NO_OP);
            }
            if (((Boolean) zzba.zzc().a(am.H1)).booleanValue()) {
                this.f10924c.zzD().setDownloadListener(zze.f10913a);
            }
        } else {
            i11 = 0;
        }
        this.f10924c.q(this);
        b30 b30Var8 = this.f10923b.zzd;
        if (b30Var8 != null) {
            A1(this.f10932k, b30Var8.zzU());
        }
        if (this.f10923b.zzk != 5) {
            ViewParent parent = this.f10924c.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f10924c.zzE());
            }
            if (this.f10931j) {
                this.f10924c.l0();
                if (((Boolean) zzba.zzc().a(am.f12447z1)).booleanValue() && Build.VERSION.SDK_INT >= i10) {
                    window.setBackgroundBlurRadius(this.f10933m);
                }
            }
            if (this.f10923b.zzw) {
                Toolbar toolbar = new Toolbar(activity);
                this.f10942v = toolbar;
                toolbar.setId(View.generateViewId());
                this.f10924c.zzE().setId(View.generateViewId());
                this.f10942v.setBackgroundColor(-12303292);
                this.f10942v.setVisibility(i11);
                try {
                    this.f10942v.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().c().getDrawable(R.drawable.admob_close_button_white_cross, null));
                } catch (Resources.NotFoundException | NullPointerException e11) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e11);
                }
                this.f10942v.setNavigationOnClickListener(this.f10935o);
                this.f10942v.setTitleMarginStart(i11);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.f10932k.addView(this.f10942v, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f10942v.getId());
                layoutParams2.addRule(12);
                this.f10932k.addView(this.f10924c.zzE(), layoutParams2);
                z1(this.f10942v);
            } else {
                this.f10932k.addView(this.f10924c.zzE(), -1, -1);
            }
        }
        if (!z10 && !this.l) {
            this.f10924c.m();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.f10923b;
        if (adOverlayInfoParcel4.zzk == 5) {
            try {
                zzG(new tl0(activity, this, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzr));
            } catch (RemoteException | zzh e12) {
                throw new zzh(e12.getMessage(), e12);
            }
        } else {
            zzr(z13);
            if (this.f10924c.zzR()) {
                zzt(z13, true);
            }
        }
    }

    public final void x1() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.f10922a.isFinishing() || this.f10939s) {
            return;
        }
        this.f10939s = true;
        b30 b30Var = this.f10924c;
        if (b30Var != null) {
            b30Var.G(this.f10943w - 1);
            synchronized (this.f10934n) {
                try {
                    if (!this.f10937q && this.f10924c.s0()) {
                        if (((Boolean) zzba.zzc().a(am.f12164g6)).booleanValue() && !this.f10940t && (adOverlayInfoParcel = this.f10923b) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                            zzrVar.zzdT();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f10914a.y1();
                            }
                        };
                        this.f10936p = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzba.zzc().a(am.O1)).longValue());
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        y1();
    }

    public final void y1() {
        b30 b30Var;
        zzr zzrVar;
        if (this.f10940t) {
            return;
        }
        this.f10940t = true;
        b30 b30Var2 = this.f10924c;
        if (b30Var2 != null) {
            this.f10932k.removeView(b30Var2.zzE());
            zzj zzjVar = this.f10925d;
            if (zzjVar != null) {
                this.f10924c.u(zzjVar.zzd);
                this.f10924c.M(false);
                if (((Boolean) zzba.zzc().a(am.re)).booleanValue() && this.f10924c.getParent() != null) {
                    ((ViewGroup) this.f10924c.getParent()).removeView(this.f10924c.zzE());
                }
                ViewGroup viewGroup = this.f10925d.zzc;
                View viewZzE = this.f10924c.zzE();
                zzj zzjVar2 = this.f10925d;
                viewGroup.addView(viewZzE, zzjVar2.zza, zzjVar2.zzb);
                this.f10925d = null;
            } else {
                Activity activity = this.f10922a;
                if (activity.getApplicationContext() != null) {
                    this.f10924c.u(activity.getApplicationContext());
                }
            }
            this.f10924c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdU(this.f10943w);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10923b;
        if (adOverlayInfoParcel2 == null || (b30Var = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        A1(this.f10923b.zzd.zzE(), b30Var.zzU());
    }

    public final void z1(View view) {
        km0 km0VarZzU;
        jm0 jm0VarX;
        b30 b30Var = this.f10924c;
        if (b30Var == null) {
            return;
        }
        if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue() && (jm0VarX = b30Var.x()) != null) {
            jm0VarX.d(view);
            return;
        }
        if (((Boolean) zzba.zzc().a(am.f12343s6)).booleanValue() && (km0VarZzU = b30Var.zzU()) != null && ((jy0) km0VarZzU.f16481b.f11931g) == jy0.HTML) {
            im0 im0VarZzu = com.google.android.gms.ads.internal.zzt.zzu();
            ky0 ky0Var = km0VarZzU.f16480a;
            ((tc0) im0VarZzu).getClass();
            tc0.o(new fm0(ky0Var, view, 0));
        }
    }

    public final void zzC() {
        if (this.l) {
            this.l = false;
            this.f10924c.m();
        }
    }

    public final void zzE() {
        this.f10932k.f10917b = true;
    }

    public final void zzF() {
        synchronized (this.f10934n) {
            try {
                this.f10937q = true;
                Runnable runnable = this.f10936p;
                if (runnable != null) {
                    y01 y01Var = com.google.android.gms.ads.internal.util.zzs.zza;
                    y01Var.removeCallbacks(runnable);
                    y01Var.post(this.f10936p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzG(bm0 bm0Var) throws RemoteException, zzh {
        aw awVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel == null || (awVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzh("noioou");
        }
        awVar.i(new b(bm0Var));
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzH(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.f10922a;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
            if (adOverlayInfoParcel.zzk != 5) {
                this = null;
            }
            try {
                adOverlayInfoParcel.zzv.Y(strArr, iArr, new b(new tl0(activity, this, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.f10943w = 3;
        Activity activity = this.f10922a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        b30 b30Var = this.f10924c;
        if (b30Var != null) {
            b30Var.q(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel != null && this.f10927f) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.f10928g != null) {
            this.f10922a.setContentView(this.f10932k);
            this.f10938r = true;
            this.f10928g.removeAllViews();
            this.f10928g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f10929h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f10929h = null;
        }
        this.f10927f = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzd() {
        this.f10943w = 2;
        this.f10922a.finish();
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zze() {
        this.f10943w = 1;
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzf() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final boolean zzg() {
        this.f10943w = 1;
        if (this.f10924c == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue() && this.f10924c.canGoBack()) {
            this.f10924c.goBack();
            return false;
        }
        boolean zP = this.f10924c.P();
        if (!zP) {
            this.f10924c.e("onbackblocked", Collections.EMPTY_MAP);
        }
        return zP;
    }

    @Override // com.google.android.gms.internal.ads.hw
    public void zzh(Bundle bundle) {
        zzr zzrVar;
        if (!this.f10938r) {
            this.f10922a.requestWindowFeature(1);
        }
        this.f10930i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.f10922a;
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.f10923b = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                activity.setShowWhenLocked(true);
            }
            if (this.f10923b.zzm.clientJarVersion > 7500000) {
                this.f10943w = 4;
            }
            if (activity.getIntent() != null) {
                this.f10941u = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z10 = zzlVar.zza;
                this.f10931j = z10;
                this.f10933m = (int) zzlVar.zze;
                if (z10) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzl(this).zzb();
                    }
                }
                String message = e.getMessage();
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
                this.f10943w = 4;
                this.f10922a.finish();
            }
            if (adOverlayInfoParcel.zzk == 5) {
                this.f10931j = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzl(this).zzb();
                }
            } else {
                this.f10931j = false;
            }
            if (bundle == null) {
                if (this.f10941u) {
                    ka0 ka0Var = this.f10923b.zzt;
                    if (ka0Var != null) {
                        synchronized (ka0Var) {
                            ScheduledFuture scheduledFuture = ka0Var.f16397d;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(true);
                            }
                        }
                    }
                    zzr zzrVar2 = this.f10923b.zzc;
                    if (zzrVar2 != null) {
                        zzrVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10923b;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    qc0 qc0Var = this.f10923b.zzu;
                    if (qc0Var != null) {
                        qc0Var.C();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f10923b;
            if (adOverlayInfoParcel3 != null && (zzrVar = adOverlayInfoParcel3.zzc) != null) {
                zzrVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f10923b;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.f10932k = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzh(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.f10923b;
            int i11 = adOverlayInfoParcel5.zzk;
            if (i11 == 1) {
                B1(false);
                return;
            }
            if (i11 == 2) {
                this.f10925d = new zzj(adOverlayInfoParcel5.zzd);
                B1(false);
            } else if (i11 == 3) {
                B1(true);
            } else {
                if (i11 != 5) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                B1(false);
            }
        } catch (zzh e10) {
            String message2 = e10.getMessage();
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message2);
            this.f10943w = 4;
            this.f10922a.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzi() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzj() {
        zzr zzrVar;
        if (((Boolean) zzba.zzc().a(am.f12179h6)).booleanValue()) {
            b30 b30Var = this.f10924c;
            if (b30Var == null || b30Var.l()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.f10924c.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzk() {
        com.google.android.gms.ads.internal.zzl zzlVar;
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10923b;
        boolean z10 = false;
        if (adOverlayInfoParcel2 != null && (zzlVar = adOverlayInfoParcel2.zzo) != null && zzlVar.zzg) {
            z10 = true;
        }
        Window window = this.f10922a.getWindow();
        if (((Boolean) zzba.zzc().a(am.V1)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(true != z10 ? 5380 : 5894);
        } else {
            window.addFlags(1024);
            window.clearFlags(a.f29616n);
            if (z10) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
        if (((Boolean) zzba.zzc().a(am.ef)).booleanValue() && Build.VERSION.SDK_INT <= 34) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            c.F(window);
        }
        if (((Boolean) zzba.zzc().a(am.f12179h6)).booleanValue()) {
            return;
        }
        b30 b30Var = this.f10924c;
        if (b30Var != null && !b30Var.l()) {
            this.f10924c.onResume();
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzl() {
        zzr zzrVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((Boolean) zzba.zzc().a(am.f12179h6)).booleanValue() && this.f10924c != null && (!this.f10922a.isFinishing() || this.f10925d == null)) {
            this.f10924c.onPause();
        }
        x1();
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzm(int i10, int i11, Intent intent) {
        yh0 yh0Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i10 == 236) {
            ul ulVar = am.Pe;
            if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i11);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                b30 b30Var = this.f10924c;
                if (b30Var == null || b30Var.zzP() == null || (yh0Var = b30Var.zzP().f14718z) == null || (adOverlayInfoParcel = this.f10923b) == null || !((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                    return;
                }
                lj1 lj1VarA = yh0Var.a();
                lj1VarA.l("action", "hilca");
                String str = adOverlayInfoParcel.zzq;
                if (str == null) {
                    str = "";
                }
                lj1VarA.l("gqi", str);
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length());
                sb3.append(i11);
                lj1VarA.l("hilr", sb3.toString());
                if (i11 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        lj1VarA.l("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        lj1VarA.l("hills", stringExtra2);
                    }
                }
                lj1VarA.r();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f10930i);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzp() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((Boolean) zzba.zzc().a(am.f12179h6)).booleanValue() && this.f10924c != null && (!this.f10922a.isFinishing() || this.f10925d == null)) {
            this.f10924c.onPause();
        }
        x1();
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzq() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10923b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        b30 b30Var = this.f10924c;
        if (b30Var != null) {
            try {
                this.f10932k.removeView(b30Var.zzE());
            } catch (NullPointerException unused) {
            }
        }
        x1();
    }

    public final void zzr(boolean z10) {
        if (this.f10923b.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzba.zzc().a(am.f12209j6)).intValue();
        boolean z11 = ((Boolean) zzba.zzc().a(am.R1)).booleanValue() || z10;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z11 ? 0 : iIntValue;
        zztVar.zzb = true != z11 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.f10926e = new zzu(this.f10922a, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        zzt(z10, this.f10923b.zzg);
        this.f10932k.addView(this.f10926e, layoutParams);
        z1(this.f10926e);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzs() {
        this.f10938r = true;
    }

    public final void zzt(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) zzba.zzc().a(am.P1)).booleanValue() && (adOverlayInfoParcel2 = this.f10923b) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z14 = ((Boolean) zzba.zzc().a(am.Q1)).booleanValue() && (adOverlayInfoParcel = this.f10923b) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z10 && z11 && z13 && !z14) {
            b30 b30Var = this.f10924c;
            try {
                JSONObject jSONObjectPut = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (b30Var != null) {
                    b30Var.f("onError", jSONObjectPut);
                }
            } catch (JSONException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e10);
            }
        }
        zzu zzuVar = this.f10926e;
        if (zzuVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzuVar.zza(z12);
        }
    }

    public final void zzu(boolean z10, int i10) {
        if (!z10) {
            this.f10932k.setBackgroundColor(-16777216);
            return;
        }
        this.f10932k.setBackgroundColor(0);
        this.f10933m = i10;
        Window window = this.f10922a.getWindow();
        if (!((Boolean) zzba.zzc().a(am.f12447z1)).booleanValue() || Build.VERSION.SDK_INT < 31 || window == null) {
            return;
        }
        window.setBackgroundBlurRadius(i10);
    }

    public final void zzv() {
        this.f10932k.removeView(this.f10926e);
        zzr(true);
    }

    public final void zzw(int i10) {
        Activity activity = this.f10922a;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().a(am.f12083b7)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().a(am.f12098c7)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzba.zzc().a(am.f12116d7)).intValue()) {
                    if (i11 <= ((Integer) zzba.zzc().a(am.f12133e7)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().e("AdOverlay.setRequestedOrientation", th2);
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.f10922a;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f10928g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f10928g.addView(view, -1, -1);
        activity.setContentView(this.f10928g);
        this.f10938r = true;
        this.f10929h = customViewCallback;
        this.f10927f = true;
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.f10942v;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzn(s9.a aVar) {
    }
}
