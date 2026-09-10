package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dg0 extends qh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f13516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzea f13517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ee0 f13518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13520e;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        z1();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        z1();
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        ge0 ge0Var;
        zzea zzeaVar = null;
        koVar = null;
        koVar = null;
        ko koVar = null;
        es dsVar = null;
        if (i10 == 3) {
            k9.c0.d("#008 Must be called on the main UI thread.");
            if (this.f13519d) {
                int i11 = zze.zza;
                zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
            } else {
                zzeaVar = this.f13517b;
            }
            parcel2.writeNoException();
            rh.e(parcel2, zzeaVar);
        } else if (i10 == 4) {
            k9.c0.d("#008 Must be called on the main UI thread.");
            y1();
            ee0 ee0Var = this.f13518c;
            if (ee0Var != null) {
                ee0Var.n();
            }
            this.f13518c = null;
            this.f13516a = null;
            this.f13517b = null;
            this.f13519d = true;
            parcel2.writeNoException();
        } else if (i10 == 5) {
            s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                dsVar = iInterfaceQueryLocalInterface instanceof es ? (es) iInterfaceQueryLocalInterface : new ds(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            }
            rh.f(parcel);
            x1(aVarX1, dsVar);
            parcel2.writeNoException();
        } else if (i10 == 6) {
            s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
            rh.f(parcel);
            k9.c0.d("#008 Must be called on the main UI thread.");
            x1(aVarX2, new cg0("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i10 != 7) {
                return false;
            }
            k9.c0.d("#008 Must be called on the main UI thread.");
            if (this.f13519d) {
                int i12 = zze.zza;
                zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
            } else {
                ee0 ee0Var2 = this.f13518c;
                if (ee0Var2 != null && (ge0Var = ee0Var2.F) != null) {
                    synchronized (ge0Var) {
                        koVar = ge0Var.f14835a;
                    }
                }
            }
            parcel2.writeNoException();
            rh.e(parcel2, koVar);
        }
        return true;
    }

    public final void x1(s9.a aVar, es esVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        k9.c0.d("#008 Must be called on the main UI thread.");
        if (this.f13519d) {
            int i10 = zze.zza;
            zzo.zzf("Instream ad can not be shown after destroy().");
            try {
                esVar.zzf(2);
                return;
            } catch (RemoteException e10) {
                int i11 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
                return;
            }
        }
        View view = this.f13516a;
        if (view == null || this.f13517b == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i12 = zze.zza;
            zzo.zzf("Instream internal error: ".concat(str));
            try {
                esVar.zzf(0);
                return;
            } catch (RemoteException e11) {
                int i13 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e11);
                return;
            }
        }
        if (this.f13520e) {
            int i14 = zze.zza;
            zzo.zzf("Instream ad should not be used again.");
            try {
                esVar.zzf(1);
                return;
            } catch (RemoteException e12) {
                int i15 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e12);
                return;
            }
        }
        this.f13520e = true;
        y1();
        ((ViewGroup) s9.b.y1(aVar)).addView(this.f13516a, new ViewGroup.LayoutParams(-1, -1));
        zzt.zzC();
        s00 s00Var = new s00(this.f13516a, this);
        View view2 = (View) ((WeakReference) s00Var.f17550a).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            s00Var.X0(viewTreeObserver);
        }
        zzt.zzC();
        t00 t00Var = new t00(this.f13516a, this);
        View view3 = (View) ((WeakReference) t00Var.f17550a).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            t00Var.X0(viewTreeObserver3);
        }
        z1();
        try {
            esVar.zze();
        } catch (RemoteException e13) {
            int i16 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e13);
        }
    }

    public final void y1() {
        View view = this.f13516a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f13516a);
        }
    }

    public final void z1() {
        View view;
        ee0 ee0Var = this.f13518c;
        if (ee0Var == null || (view = this.f13516a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        ee0Var.s(view, map, map, ee0.d(view));
    }
}
