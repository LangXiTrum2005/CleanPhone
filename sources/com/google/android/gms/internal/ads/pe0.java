package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pe0 extends qh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, df0, uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f18589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ee0 f18593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bi f18594f;

    public pe0(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        this.f18590b = new HashMap();
        this.f18591c = new HashMap();
        this.f18592d = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzt.zzC();
        s00 s00Var = new s00(view, this);
        View view2 = (View) ((WeakReference) s00Var.f17550a).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            s00Var.X0(viewTreeObserver3);
        }
        zzt.zzC();
        t00 t00Var = new t00(view, this);
        View view3 = (View) ((WeakReference) t00Var.f17550a).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            t00Var.X0(viewTreeObserver2);
        }
        this.f18589a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f18590b.put(str, new WeakReference(view4));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f18592d.putAll(this.f18590b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f18591c.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f18592d.putAll(this.f18591c);
        this.f18594f = new bi(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ee0 ee0Var = this.f18593e;
        if (ee0Var != null) {
            ee0Var.r(view, w1(), zzi(), zzj(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ee0 ee0Var = this.f18593e;
        if (ee0Var != null) {
            ee0Var.s(w1(), zzi(), zzj(), ee0.d(w1()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ee0 ee0Var = this.f18593e;
        if (ee0Var != null) {
            ee0Var.s(w1(), zzi(), zzj(), ee0.d(w1()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ee0 ee0Var = this.f18593e;
        if (ee0Var != null) {
            View viewW1 = w1();
            synchronized (ee0Var) {
                ee0Var.f13938n.l(motionEvent, viewW1);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized View q(String str) {
        WeakReference weakReference = (WeakReference) this.f18592d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized void r(View view, String str) {
        this.f18592d.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.f18590b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
            rh.f(parcel);
            synchronized (this) {
                Object objY1 = s9.b.y1(aVarX1);
                if (objY1 instanceof ee0) {
                    ee0 ee0Var = this.f18593e;
                    if (ee0Var != null) {
                        ee0Var.q(this);
                    }
                    ee0 ee0Var2 = (ee0) objY1;
                    if (ee0Var2.f13940p.b()) {
                        this.f18593e = ee0Var2;
                        ee0Var2.p(this);
                        this.f18593e.f(w1());
                    } else {
                        int i11 = zze.zza;
                        zzo.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    int i12 = zze.zza;
                    zzo.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i10 == 2) {
            synchronized (this) {
                ee0 ee0Var3 = this.f18593e;
                if (ee0Var3 != null) {
                    ee0Var3.q(this);
                    this.f18593e = null;
                }
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
            rh.f(parcel);
            synchronized (this) {
                try {
                    if (this.f18593e != null) {
                        Object objY2 = s9.b.y1(aVarX2);
                        if (!(objY2 instanceof View)) {
                            int i13 = zze.zza;
                            zzo.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        ee0 ee0Var4 = this.f18593e;
                        View view = (View) objY2;
                        synchronized (ee0Var4) {
                            ee0Var4.f13938n.b(view);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final FrameLayout v1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final View w1() {
        return (View) this.f18589a.get();
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final bi zzg() {
        return this.f18594f;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized Map zzi() {
        return this.f18592d;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized Map zzj() {
        return this.f18590b;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized Map zzk() {
        return this.f18591c;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized String zzm() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized s9.a zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.df0
    public final synchronized JSONObject zzp() {
        JSONObject jSONObjectE;
        ee0 ee0Var = this.f18593e;
        if (ee0Var == null) {
            return null;
        }
        View viewW1 = w1();
        Map mapZzi = zzi();
        Map mapZzj = zzj();
        synchronized (ee0Var) {
            jSONObjectE = ee0Var.f13938n.e(viewW1, mapZzi, mapZzj, ee0Var.k());
        }
        return jSONObjectE;
    }
}
