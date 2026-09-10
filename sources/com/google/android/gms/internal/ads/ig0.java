package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.X3;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ig0 extends qh implements wp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0 f15736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je0 f15737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yh0 f15738d;

    public ig0(String str, ee0 ee0Var, je0 je0Var, yh0 yh0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f15735a = str;
        this.f15736b = ee0Var;
        this.f15737c = je0Var;
        this.f15738d = yh0Var;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void F0(zzdc zzdcVar) {
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            ee0Var.f13938n.o(zzdcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void H0(long j10) {
        n90 n90Var;
        ee0 ee0Var = this.f15736b;
        if (ee0Var == null || (n90Var = ee0Var.f17343j) == null) {
            return;
        }
        n90Var.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void U(Bundle bundle) {
        if (((Boolean) zzba.zzc().a(am.Ie)).booleanValue()) {
            ee0 ee0Var = this.f15736b;
            b30 b30VarH = ee0Var.f13937m.h();
            if (b30VarH == null) {
                int i10 = zze.zza;
                zzo.zzf("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                ee0Var.l.execute(new b70(b30VarH, jSONObject));
            } catch (JSONException e10) {
                int i11 = zze.zza;
                zzo.zzg("Error reading event signals", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void X(zzdq zzdqVar) {
        try {
            if (!zzdqVar.zzf()) {
                this.f15738d.b();
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
        }
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            ee0Var.G.f15812a.set(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void X0(Bundle bundle) {
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            ee0Var.f13938n.h(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void Z(zzdg zzdgVar) {
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            ee0Var.f13938n.k(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void c() {
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            ee0Var.f13938n.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final long d() {
        n90 n90Var;
        ee0 ee0Var = this.f15736b;
        if (ee0Var == null || (n90Var = ee0Var.f17343j) == null) {
            return 0L;
        }
        return n90Var.f17723a.get();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final boolean d1(Bundle bundle) {
        return this.f15736b.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final boolean h() {
        boolean zZzh;
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            zZzh = ee0Var.f13938n.zzh();
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void k1(Bundle bundle) {
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            ee0Var.f13938n.n(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void n1(up upVar) {
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            ee0Var.f13938n.i(upVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        List list;
        mo moVar;
        double d10;
        String strP;
        String strP2;
        s9.a aVar;
        up spVar;
        je0 je0Var = this.f15737c;
        switch (i10) {
            case 2:
                String strA = je0Var.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 3:
                synchronized (je0Var) {
                    list = je0Var.f16054e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String strC = je0Var.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 5:
                synchronized (je0Var) {
                    moVar = je0Var.f16067s;
                }
                parcel2.writeNoException();
                rh.e(parcel2, moVar);
                return true;
            case 6:
                String strE = je0Var.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 7:
                String strF = je0Var.f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 8:
                synchronized (je0Var) {
                    d10 = je0Var.f16066r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d10);
                return true;
            case 9:
                synchronized (je0Var) {
                    strP = je0Var.p(X3.i.U);
                }
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                synchronized (je0Var) {
                    strP2 = je0Var.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP2);
                return true;
            case 11:
                zzea zzeaVarR = je0Var.r();
                parcel2.writeNoException();
                rh.e(parcel2, zzeaVarR);
                return true;
            case 12:
                String str = this.f15735a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                ho hoVarS = je0Var.s();
                parcel2.writeNoException();
                rh.e(parcel2, hoVarS);
                return true;
            case 15:
                Bundle bundle = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                k1(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                boolean zO = this.f15736b.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                X0(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                s9.a aVarZzu = zzu();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzu);
                return true;
            case 19:
                synchronized (je0Var) {
                    aVar = je0Var.f16065q;
                }
                parcel2.writeNoException();
                rh.e(parcel2, aVar);
                return true;
            case 20:
                Bundle bundleD = je0Var.d();
                parcel2.writeNoException();
                rh.d(parcel2, bundleD);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    spVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    spVar = iInterfaceQueryLocalInterface instanceof up ? (up) iInterfaceQueryLocalInterface : new sp(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                }
                rh.f(parcel);
                n1(spVar);
                parcel2.writeNoException();
                return true;
            case 22:
                c();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeList(listZzz);
                return true;
            case 24:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 25:
                zzdg zzdgVarZzb = zzdf.zzb(parcel.readStrongBinder());
                rh.f(parcel);
                Z(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                zzdc zzdcVarZzb = zzdb.zzb(parcel.readStrongBinder());
                rh.f(parcel);
                F0(zzdcVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                zzE();
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                ko koVarZzF = zzF();
                parcel2.writeNoException();
                rh.e(parcel2, koVarZzF);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                boolean zH = h();
                parcel2.writeNoException();
                ClassLoader classLoader2 = rh.f19590a;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 31:
                zzdx zzdxVarZzH = zzH();
                parcel2.writeNoException();
                rh.e(parcel2, zzdxVarZzH);
                return true;
            case 32:
                zzdq zzdqVarZzb = zzdp.zzb(parcel.readStrongBinder());
                rh.f(parcel);
                X(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                U(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long jD = d();
                parcel2.writeNoException();
                parcel2.writeLong(jD);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                long j10 = parcel.readLong();
                rh.f(parcel);
                H0(j10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final boolean zzA() {
        List list;
        zzew zzewVar;
        je0 je0Var = this.f15737c;
        synchronized (je0Var) {
            list = je0Var.f16055f;
        }
        if (list.isEmpty()) {
            return false;
        }
        synchronized (je0Var) {
            zzewVar = je0Var.f16056g;
        }
        return zzewVar != null;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void zzD() {
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            ee0Var.f13938n.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void zzE() {
        ee0 ee0Var = this.f15736b;
        synchronized (ee0Var) {
            qh qhVar = ee0Var.f13947w;
            if (qhVar != null) {
                ee0Var.l.execute(new com.adjust.sdk.f0(2, ee0Var, qhVar instanceof pe0));
            } else {
                int i10 = zze.zza;
                zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final ko zzF() {
        ko koVar;
        ge0 ge0Var = this.f15736b.F;
        synchronized (ge0Var) {
            koVar = ge0Var.f14835a;
        }
        return koVar;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final zzdx zzH() {
        if (((Boolean) zzba.zzc().a(am.O7)).booleanValue()) {
            return this.f15736b.f17339f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zze() {
        return this.f15737c.a();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final List zzf() {
        List list;
        je0 je0Var = this.f15737c;
        synchronized (je0Var) {
            list = je0Var.f16054e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzg() {
        return this.f15737c.c();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final mo zzh() {
        mo moVar;
        je0 je0Var = this.f15737c;
        synchronized (je0Var) {
            moVar = je0Var.f16067s;
        }
        return moVar;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzi() {
        return this.f15737c.e();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzj() {
        return this.f15737c.f();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final double zzk() {
        double d10;
        je0 je0Var = this.f15737c;
        synchronized (je0Var) {
            d10 = je0Var.f16066r;
        }
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzl() {
        String strP;
        je0 je0Var = this.f15737c;
        synchronized (je0Var) {
            strP = je0Var.p(X3.i.U);
        }
        return strP;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzm() {
        String strP;
        je0 je0Var = this.f15737c;
        synchronized (je0Var) {
            strP = je0Var.p("price");
        }
        return strP;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final zzea zzn() {
        return this.f15737c.r();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void zzp() {
        this.f15736b.n();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final ho zzq() {
        return this.f15737c.s();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final s9.a zzu() {
        return new s9.b(this.f15736b);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final s9.a zzv() {
        s9.a aVar;
        je0 je0Var = this.f15737c;
        synchronized (je0Var) {
            aVar = je0Var.f16065q;
        }
        return aVar;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final Bundle zzw() {
        return this.f15737c.d();
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final List zzz() {
        List list;
        if (!zzA()) {
            return Collections.EMPTY_LIST;
        }
        je0 je0Var = this.f15737c;
        synchronized (je0Var) {
            list = je0Var.f16055f;
        }
        return list;
    }
}
