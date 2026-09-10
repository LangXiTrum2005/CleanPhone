package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qe0 extends po implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, df0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ya1 f19028o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19029a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f19031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout f19032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k00 f19033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f19034f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ee0 f19036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bi f19037i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ko f19039k;
    public boolean l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GestureDetector f19041n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f19030b = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s9.a f19038j = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19040m = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19035g = 261710000;

    static {
        aa1 aa1Var = ca1.f13122b;
        Object[] objArr = {"2011", "1009", "3010"};
        ps1.s(3, objArr);
        f19028o = ca1.A(3, objArr);
    }

    public qe0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f19031c = frameLayout;
        this.f19032d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f19029a = str;
        zzt.zzC();
        s00 s00Var = new s00(frameLayout, this);
        View view = (View) ((WeakReference) s00Var.f17550a).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            s00Var.X0(viewTreeObserver3);
        }
        zzt.zzC();
        t00 t00Var = new t00(frameLayout, this);
        View view2 = (View) ((WeakReference) t00Var.f17550a).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            t00Var.X0(viewTreeObserver2);
        }
        this.f19033e = l00.f16613f;
        this.f19037i = new bi(this.f19031c.getContext(), this.f19031c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean zZzv;
        ee0 ee0Var = this.f19036h;
        if (ee0Var != null) {
            synchronized (ee0Var) {
                zZzv = ee0Var.f13938n.zzv();
            }
            if (zZzv) {
                ee0 ee0Var2 = this.f19036h;
                synchronized (ee0Var2) {
                    ee0Var2.f13938n.zzq();
                }
                this.f19036h.r(view, this.f19031c, zzi(), zzj(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ee0 ee0Var = this.f19036h;
        if (ee0Var != null) {
            FrameLayout frameLayout = this.f19031c;
            ee0Var.s(frameLayout, zzi(), zzj(), ee0.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ee0 ee0Var = this.f19036h;
        if (ee0Var != null) {
            FrameLayout frameLayout = this.f19031c;
            ee0Var.s(frameLayout, zzi(), zzj(), ee0.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int iZzu;
        ee0 ee0Var = this.f19036h;
        if (ee0Var != null) {
            FrameLayout frameLayout = this.f19031c;
            synchronized (ee0Var) {
                ee0Var.f13938n.l(motionEvent, frameLayout);
            }
            if (((Boolean) zzba.zzc().a(am.f12216jd)).booleanValue() && this.f19041n != null) {
                ee0 ee0Var2 = this.f19036h;
                synchronized (ee0Var2) {
                    iZzu = ee0Var2.f13938n.zzu();
                }
                if (iZzu != 0) {
                    this.f19041n.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized View q(String str) {
        WeakReference weakReference;
        if (!this.f19040m && (weakReference = (WeakReference) this.f19030b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized void r(View view, String str) {
        if (!this.f19040m) {
            if (view == null) {
                this.f19030b.remove(str);
                return;
            }
            this.f19030b.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (zzbs.zza(this.f19035g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final FrameLayout v1() {
        return this.f19032d;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final /* synthetic */ View w1() {
        return this.f19031c;
    }

    public final synchronized void x1() {
        int iZzu;
        if (((Boolean) zzba.zzc().a(am.f12216jd)).booleanValue()) {
            ee0 ee0Var = this.f19036h;
            synchronized (ee0Var) {
                iZzu = ee0Var.f13938n.zzu();
            }
            if (iZzu != 0) {
                this.f19041n = new GestureDetector(this.f19031c.getContext(), new ve0(this.f19036h, this));
            }
        }
    }

    public final synchronized void y1(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f19032d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f19032d.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e10) {
                        zzo.zzj("Encountered invalid base64 watermark.", e10);
                    }
                }
            }
            this.f19032d.addView(frameLayout);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final synchronized void zzb(String str, s9.a aVar) {
        r((View) s9.b.y1(aVar), str);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final synchronized s9.a zzc(String str) {
        return new s9.b(q(str));
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final synchronized void zzd(s9.a aVar) {
        if (this.f19040m) {
            return;
        }
        Object objY1 = s9.b.y1(aVar);
        if (!(objY1 instanceof ee0)) {
            int i10 = zze.zza;
            zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        ee0 ee0Var = this.f19036h;
        if (ee0Var != null) {
            ee0Var.q(this);
        }
        synchronized (this) {
            this.f19033e.execute(new x60(this, 8));
            ee0 ee0Var2 = (ee0) objY1;
            this.f19036h = ee0Var2;
            ee0Var2.p(this);
            this.f19036h.f(this.f19031c);
            ee0 ee0Var3 = this.f19036h;
            FrameLayout frameLayout = this.f19032d;
            km0 km0VarK = ee0Var3.f13937m.k();
            if (ee0Var3.f13940p.c() && km0VarK != null && frameLayout != null) {
                im0 im0VarZzu = zzt.zzu();
                ky0 ky0Var = km0VarK.f16480a;
                ((tc0) im0VarZzu).getClass();
                tc0.o(new fm0(ky0Var, frameLayout, 0));
            }
            if (this.l) {
                ge0 ge0Var = this.f19036h.F;
                ko koVar = this.f19039k;
                synchronized (ge0Var) {
                    ge0Var.f14835a = koVar;
                }
            }
            if (((Boolean) zzba.zzc().a(am.V4)).booleanValue() && !TextUtils.isEmpty(this.f19036h.f13940p.e())) {
                y1(this.f19036h.f13940p.e());
            }
            x1();
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final synchronized void zzdB(s9.a aVar) {
        ee0 ee0Var = this.f19036h;
        View view = (View) s9.b.y1(aVar);
        synchronized (ee0Var) {
            ee0Var.f13938n.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final synchronized void zzdC(s9.a aVar) {
        if (this.f19040m) {
            return;
        }
        this.f19038j = aVar;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zzdD(s9.a aVar) {
        onTouch(this.f19031c, (MotionEvent) s9.b.y1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final synchronized void zzdE(ko koVar) {
        if (!this.f19040m) {
            this.l = true;
            this.f19039k = koVar;
            ee0 ee0Var = this.f19036h;
            if (ee0Var != null) {
                ge0 ge0Var = ee0Var.F;
                synchronized (ge0Var) {
                    ge0Var.f14835a = koVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final synchronized void zze() {
        try {
            if (this.f19040m) {
                return;
            }
            ee0 ee0Var = this.f19036h;
            if (ee0Var != null) {
                ee0Var.q(this);
                this.f19036h = null;
            }
            this.f19030b.clear();
            this.f19031c.removeAllViews();
            this.f19032d.removeAllViews();
            this.f19030b = null;
            this.f19031c = null;
            this.f19032d = null;
            this.f19034f = null;
            this.f19037i = null;
            this.f19040m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final synchronized void zzf(s9.a aVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final bi zzg() {
        return this.f19037i;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized Map zzi() {
        return this.f19030b;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized Map zzj() {
        return this.f19030b;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized Map zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized String zzm() {
        return this.f19029a;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final s9.a zzn() {
        return this.f19038j;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized JSONObject zzo() {
        JSONObject jSONObjectM;
        ee0 ee0Var = this.f19036h;
        if (ee0Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.f19031c;
        Map mapZzi = zzi();
        Map mapZzj = zzj();
        synchronized (ee0Var) {
            jSONObjectM = ee0Var.f13938n.m(frameLayout, mapZzi, mapZzj, ee0Var.k());
        }
        return jSONObjectM;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized JSONObject zzp() {
        JSONObject jSONObjectE;
        ee0 ee0Var = this.f19036h;
        if (ee0Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.f19031c;
        Map mapZzi = zzi();
        Map mapZzj = zzj();
        synchronized (ee0Var) {
            jSONObjectE = ee0Var.f13938n.e(frameLayout, mapZzi, mapZzj, ee0Var.k());
        }
        return jSONObjectE;
    }
}
