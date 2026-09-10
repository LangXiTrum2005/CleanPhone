package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.zzt;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 extends qh implements vx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt0 f12890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ut0 f12891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ku0 f12892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ug0 f12893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12894e;

    public bu0(yt0 yt0Var, ut0 ut0Var, ku0 ku0Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f12894e = false;
        this.f12890a = yt0Var;
        this.f12891b = ut0Var;
        this.f12892c = ku0Var;
    }

    public final synchronized void M(s9.a aVar) {
        k9.c0.d("pause must be called on the main UI thread.");
        if (this.f12893d != null) {
            Context context = aVar == null ? null : (Context) s9.b.y1(aVar);
            pa0 pa0Var = this.f12893d.f17336c;
            pa0Var.getClass();
            pa0Var.S0(new az0(context));
        }
    }

    public final synchronized void i1(s9.a aVar) {
        try {
            k9.c0.d("showAd must be called on the main UI thread.");
            if (this.f12893d != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objY1 = s9.b.y1(aVar);
                    if (objY1 instanceof Activity) {
                        activity = (Activity) objY1;
                    }
                }
                this.f12893d.c(activity, this.f12894e);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0219 A[Catch: all -> 0x020d, TryCatch #4 {, blocks: (B:141:0x01ee, B:145:0x0206, B:151:0x0210, B:152:0x0219, B:154:0x021f, B:158:0x0233), top: B:172:0x01ee, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x021f A[Catch: all -> 0x020d, TRY_LEAVE, TryCatch #4 {, blocks: (B:141:0x01ee, B:145:0x0206, B:151:0x0210, B:152:0x0219, B:154:0x021f, B:158:0x0233), top: B:172:0x01ee, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0231 A[DONT_GENERATE] */
    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        Bundle bundle;
        b30 b30Var;
        ug0 ug0Var;
        xx wxVar = null;
        aa0Var = null;
        aa0 aa0Var = null;
        ux uxVar = null;
        if (i10 == 1) {
            yx yxVar = (yx) rh.b(parcel, yx.CREATOR);
            rh.f(parcel);
            synchronized (this) {
                k9.c0.d("loadAd must be called on the main UI thread.");
                String str2 = yxVar.f22392b;
                String str3 = (String) zzba.zzc().a(am.C6);
                if (str3 == null || str2 == null) {
                    if (y1()) {
                        if (!((Boolean) zzba.zzc().a(am.E6)).booleanValue()) {
                        }
                    }
                    vt0 vt0Var = new vt0(22);
                    this.f12893d = null;
                    yt0 yt0Var = this.f12890a;
                    yt0Var.f22370h.f17970o.f38703b = 1;
                    yt0Var.a(yxVar.f22391a, yxVar.f22392b, vt0Var, new at0(this, 1));
                } else {
                    try {
                        if (!Pattern.matches(str3, str2)) {
                            if (y1()) {
                                if (!((Boolean) zzba.zzc().a(am.E6)).booleanValue()) {
                                }
                            }
                            vt0 vt0Var2 = new vt0(22);
                            this.f12893d = null;
                            yt0 yt0Var2 = this.f12890a;
                            yt0Var2.f22370h.f17970o.f38703b = 1;
                            yt0Var2.a(yxVar.f22391a, yxVar.f22392b, vt0Var2, new at0(this, 1));
                        }
                    } catch (RuntimeException e10) {
                        zzt.zzh().d("NonagonUtil.isPatternMatched", e10);
                    }
                }
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            synchronized (this) {
                i1(null);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                wxVar = iInterfaceQueryLocalInterface instanceof xx ? (xx) iInterfaceQueryLocalInterface : new wx(strongBinder);
            }
            rh.f(parcel);
            k9.c0.d("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f12891b.f20895e.set(wxVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 34) {
            boolean zA = rh.a(parcel);
            rh.f(parcel);
            synchronized (this) {
                k9.c0.d("setImmersiveMode must be called on the main UI thread.");
                this.f12894e = zA;
            }
            parcel2.writeNoException();
            return true;
        }
        int i11 = 0;
        switch (i10) {
            case 5:
                k9.c0.d("isLoaded must be called on the main UI thread.");
                boolean zY1 = y1();
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeInt(zY1 ? 1 : 0);
                return true;
            case 6:
                M(null);
                parcel2.writeNoException();
                return true;
            case 7:
                zzj(null);
                parcel2.writeNoException();
                return true;
            case 8:
                x1(null);
                parcel2.writeNoException();
                return true;
            case 9:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                M(aVarX1);
                parcel2.writeNoException();
                return true;
            case 10:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzj(aVarX2);
                parcel2.writeNoException();
                return true;
            case 11:
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                x1(aVarX3);
                parcel2.writeNoException();
                return true;
            case 12:
                synchronized (this) {
                    ug0 ug0Var2 = this.f12893d;
                    str = ug0Var2 != null ? ug0Var2.f17339f.f11954a : null;
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                String string = parcel.readString();
                rh.f(parcel);
                synchronized (this) {
                    k9.c0.d("setUserId must be called on the main UI thread.");
                    this.f12892c.f16524a = string;
                }
                parcel2.writeNoException();
                return true;
            case 14:
                zzby zzbyVarZzb = zzbx.zzb(parcel.readStrongBinder());
                rh.f(parcel);
                ut0 ut0Var = this.f12891b;
                k9.c0.d("setAdMetadataListener can only be called from the UI thread.");
                if (zzbyVarZzb == null) {
                    ut0Var.f20892b.set(null);
                } else {
                    ut0Var.f20892b.set(new zt0(this, zzbyVarZzb, 1));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                k9.c0.d("getAdMetadata can only be called from the UI thread.");
                ug0 ug0Var3 = this.f12893d;
                if (ug0Var3 != null) {
                    wa0 wa0Var = ug0Var3.f20780q;
                    synchronized (wa0Var) {
                        bundle = new Bundle(wa0Var.f21477c);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                rh.d(parcel2, bundle);
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    uxVar = iInterfaceQueryLocalInterface2 instanceof ux ? (ux) iInterfaceQueryLocalInterface2 : new ux(strongBinder2, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                }
                rh.f(parcel);
                k9.c0.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f12891b.f20897g.set(uxVar);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                rh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                i1(aVarX4);
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                rh.f(parcel);
                synchronized (this) {
                    k9.c0.d("#008 Must be called on the main UI thread.: setCustomData");
                    this.f12892c.f16525b = string2;
                }
                parcel2.writeNoException();
                return true;
            case 20:
                ug0 ug0Var4 = this.f12893d;
                if (ug0Var4 != null && (b30Var = (b30) ug0Var4.f20776m.get()) != null && !b30Var.o0()) {
                    i11 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = rh.f19590a;
                parcel2.writeInt(i11);
                return true;
            case 21:
                synchronized (this) {
                    if (((Boolean) zzba.zzc().a(am.O7)).booleanValue() && (ug0Var = this.f12893d) != null) {
                        aa0Var = ug0Var.f17339f;
                    }
                    break;
                }
                parcel2.writeNoException();
                rh.e(parcel2, aa0Var);
                return true;
            default:
                return false;
        }
    }

    public final synchronized void x1(s9.a aVar) {
        k9.c0.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f12891b.f20892b.set(null);
        if (this.f12893d != null) {
            if (aVar != null) {
                context = (Context) s9.b.y1(aVar);
            }
            pa0 pa0Var = this.f12893d.f17336c;
            pa0Var.getClass();
            pa0Var.S0(new zl(context, 1));
        }
    }

    public final synchronized boolean y1() {
        ug0 ug0Var = this.f12893d;
        return (ug0Var == null || ug0Var.f20781r.f20695b.get()) ? false : true;
    }

    public final synchronized void zzj(s9.a aVar) {
        k9.c0.d("resume must be called on the main UI thread.");
        if (this.f12893d != null) {
            Context context = aVar == null ? null : (Context) s9.b.y1(aVar);
            pa0 pa0Var = this.f12893d.f17336c;
            pa0Var.getClass();
            pa0Var.S0(new sl(context, 2));
        }
    }
}
