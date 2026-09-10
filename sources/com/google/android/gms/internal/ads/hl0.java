package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hl0 extends qh implements gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f15323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21 f15324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a50 f15325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f15326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kw0 f15327f;

    public hl0(Context context, fe1 fe1Var, jq jqVar, a50 a50Var, b21 b21Var, ArrayDeque arrayDeque, kw0 kw0Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        am.a(context);
        this.f15322a = context;
        this.f15323b = fe1Var;
        this.f15324c = b21Var;
        this.f15325d = a50Var;
        this.f15326e = arrayDeque;
        this.f15327f = kw0Var;
    }

    public static uv0 B1(uv0 uv0Var, yv0 yv0Var, dt dtVar, jw0 jw0Var, fw0 fw0Var) {
        ft ftVarA = dtVar.a("AFMA_getAdDictionary", x10.f21684j, tc0.l);
        ps1.B(uv0Var, fw0Var);
        uv0 uv0VarM = yv0Var.a(uv0Var, vv0.BUILD_URL).g(ftVarA).m();
        if (!((Boolean) an.f12466c.o()).booleanValue()) {
            return uv0VarM;
        }
        vd1 vd1VarR = vd1.r(uv0VarM);
        iw0 iw0Var = new iw0(0, jw0Var, fw0Var);
        vd1VarR.addListener(new zd1(0, vd1VarR, iw0Var), l00.f16615h);
        return uv0VarM;
    }

    public final ListenableFuture A1(mx mxVar, int i10) {
        at atVarZzr = zzt.zzr();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        kw0 kw0Var = this.f15327f;
        Context context = this.f15322a;
        dt dtVarA = atVarZzr.a(context, versionInfoParcelForPackage, kw0Var);
        if (!((Boolean) rn.f19621a.o()).booleanValue()) {
            return zw1.l(new Exception("Signal collection disabled."));
        }
        a50 a50Var = this.f15325d;
        a50Var.getClass();
        b2.w wVar = new b2.w(i10, 6, mxVar);
        a50 a50Var2 = a50Var.f11854b;
        ps0 ps0Var = new ps0(wVar, 0);
        e60 e60Var = new e60(ps0Var, 21);
        fx1 fx1Var = a50Var2.f11858d;
        o40 o40Var = a50Var2.f11864g;
        w70 w70Var = new w70(fx1Var, o40Var, 10);
        ps0 ps0Var2 = new ps0(wVar, 1);
        ps0 ps0Var3 = new ps0(wVar, 2);
        ps0 ps0Var4 = new ps0(wVar, 3);
        d80 d80Var = new d80((kx1) o40Var, (kx1) fx1Var, (gx1) ps0Var2, (kx1) ps0Var3, (kx1) ps0Var4, 16);
        lr0 lr0Var = new lr0(1);
        er0 er0Var = new er0(o40Var, 9);
        fx1 fx1Var2 = a50Var2.E;
        fz fzVar = new fz(ps0Var, fx1Var2, fx1Var, 26);
        d80 d80Var2 = new d80((kx1) fx1Var2, (gx1) ps0Var4, (gx1) ps0Var, (kx1) fx1Var, (kx1) new ps0(wVar, 5), 17);
        fx1 fx1VarA = fx1.a(new er0(a50Var2.f11892w, 13));
        ps0 ps0Var5 = new ps0(wVar, 4);
        fx1 fx1VarA2 = fx1.a(x10.f21687n);
        fx1 fx1VarA3 = fx1.a(dv.f13736h);
        fx1 fx1VarA4 = fx1.a(rb0.f19505h);
        fx1 fx1VarA5 = fx1.a(v71.f21091o);
        int i11 = ix1.f15869b;
        LinkedHashMap linkedHashMapI = gc1.i(4);
        linkedHashMapI.put(vv0.GMS_SIGNALS, fx1VarA2);
        linkedHashMapI.put(vv0.BUILD_URL, fx1VarA3);
        linkedHashMapI.put(vv0.HTTP, fx1VarA4);
        linkedHashMapI.put(vv0.PRE_PROCESS, fx1VarA5);
        fx1 fx1VarA6 = fx1.a(new fz(ps0Var5, a50Var2.f11864g, new ix1(linkedHashMapI), 10));
        int i12 = lx1.f17149c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(fx1VarA6);
        fx1 fx1VarA7 = fx1.a(new cr0(a50Var2.f11858d, new ca0(new lx1(list, arrayList), 24)));
        fx1 fx1Var3 = a50Var2.O0;
        Context context2 = a50Var2.f11852a.f15966b;
        ic1.h(context2);
        Object objZzb = fx1Var3.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        String string = ((mx) wVar.f5411c).f17566a.getString("ms");
        if (string == null) {
            string = "";
        }
        jq0 jq0Var = new jq0(5, k00Var, string);
        k00 k00Var2 = l00.f16608a;
        ic1.h(k00Var2);
        List list2 = mxVar.f17570e;
        ic1.h(list2);
        jq0 jq0Var2 = new jq0(6, k00Var2, list2);
        dx1 dx1VarB = fx1.b(d80Var);
        dx1 dx1VarB2 = fx1.b(er0Var);
        fx1.b(e60Var);
        dx1 dx1VarB3 = fx1.b(w70Var);
        dx1 dx1VarB4 = fx1.b(lr0Var);
        fx1.b(d80Var2);
        dx1 dx1VarB5 = fx1.b(fzVar);
        ic1.h(k00Var2);
        jw0 jw0Var = (jw0) fx1VarA.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add((ms0) objZzb);
        hashSet.add(jq0Var);
        hashSet.add(jq0Var2);
        if (((Boolean) zzba.zzc().a(am.S6)).booleanValue()) {
            hashSet.add((bs0) dx1VarB.zzb());
        }
        if (((Boolean) zzba.zzc().a(am.T6)).booleanValue()) {
            hashSet.add((bs0) dx1VarB2.zzb());
        }
        if (((Boolean) zzba.zzc().a(am.V6)).booleanValue()) {
            hashSet.add((bs0) dx1VarB3.zzb());
        }
        if (((Boolean) zzba.zzc().a(am.W6)).booleanValue()) {
            hashSet.add((bs0) dx1VarB4.zzb());
        }
        if (((Boolean) zzba.zzc().a(am.c4)).booleanValue()) {
            hashSet.add((bs0) dx1VarB5.zzb());
        }
        hz hzVar = new hz(context2, k00Var2, hashSet, jw0Var);
        ft ftVarA = dtVarA.a("google.afma.request.getSignals", x10.f21684j, jq.f16133c);
        fw0 fw0VarF = fw0.f(context, 22);
        yv0 yv0Var = (yv0) fx1VarA7.zzb();
        Bundle bundle = mxVar.f17566a;
        v90 v90VarG = yv0Var.a(zw1.d(bundle), vv0.GET_SIGNALS).d(new wv0(fw0VarF, 1)).g(new ht(9, hzVar, mxVar));
        uv0 uv0VarM = ((yv0) v90VarG.f21140f).a(v90VarG.m(), vv0.JS_SIGNALS).g(ftVarA).m();
        jw0 jw0Var2 = (jw0) fx1VarA.zzb();
        jw0Var2.b(bundle.getStringArrayList("ad_types"));
        jw0Var2.d(bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS));
        ps1.a0(uv0VarM, jw0Var2, fw0VarF, true);
        if (((Boolean) fn.f14472j.o()).booleanValue()) {
            b21 b21Var = this.f15324c;
            Objects.requireNonNull(b21Var);
            uv0VarM.addListener(new gl0(b21Var, 0), this.f15323b);
        }
        return uv0VarM;
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void B0(mx mxVar, jx jxVar) {
        Bundle bundle;
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue() && (bundle = mxVar.f17577m) != null) {
            ((p9.b) zzt.zzk()).getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        uv0 uv0VarX1 = x1(mxVar, Binder.getCallingUid());
        C1(uv0VarX1, jxVar, mxVar);
        if (((Boolean) fn.f14471i.o()).booleanValue()) {
            b21 b21Var = this.f15324c;
            Objects.requireNonNull(b21Var);
            uv0VarX1.addListener(new gl0(b21Var, 1), this.f15323b);
        }
    }

    public final void C1(ListenableFuture listenableFuture, jx jxVar, mx mxVar) {
        fd1 fd1VarX = zw1.x(listenableFuture, new c60(7), l00.f16608a);
        md0 md0Var = new md0(this, mxVar, jxVar, 22);
        fd1VarX.addListener(new zd1(0, fd1VarX, md0Var), l00.f16615h);
    }

    public final synchronized el0 D1(String str) {
        Iterator it = this.f15326e.iterator();
        while (it.hasNext()) {
            el0 el0Var = (el0) it.next();
            if (el0Var.f14005c.equals(str)) {
                it.remove();
                return el0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void N0(mx mxVar, jx jxVar) {
        C1(y1(mxVar, Binder.getCallingUid()), jxVar, mxVar);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void V0(mx mxVar, jx jxVar) {
        Bundle bundle;
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue() && (bundle = mxVar.f17577m) != null) {
            ((p9.b) zzt.zzk()).getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        C1(A1(mxVar, Binder.getCallingUid()), jxVar, mxVar);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void e0(String str, jx jxVar) {
        C1(z1(str), jxVar, null);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        jx hxVar = null;
        kx kxVar = null;
        jx hxVar2 = null;
        jx hxVar3 = null;
        jx hxVar4 = null;
        switch (i10) {
            case 1:
                rh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                rh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                mx mxVar = (mx) rh.b(parcel, mx.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    hxVar = iInterfaceQueryLocalInterface instanceof jx ? (jx) iInterfaceQueryLocalInterface : new hx(strongBinder2);
                }
                rh.f(parcel);
                B0(mxVar, hxVar);
                parcel2.writeNoException();
                return true;
            case 5:
                mx mxVar2 = (mx) rh.b(parcel, mx.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    hxVar4 = iInterfaceQueryLocalInterface2 instanceof jx ? (jx) iInterfaceQueryLocalInterface2 : new hx(strongBinder3);
                }
                rh.f(parcel);
                V0(mxVar2, hxVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                mx mxVar3 = (mx) rh.b(parcel, mx.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    hxVar3 = iInterfaceQueryLocalInterface3 instanceof jx ? (jx) iInterfaceQueryLocalInterface3 : new hx(strongBinder4);
                }
                rh.f(parcel);
                N0(mxVar3, hxVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    hxVar2 = iInterfaceQueryLocalInterface4 instanceof jx ? (jx) iInterfaceQueryLocalInterface4 : new hx(strongBinder5);
                }
                rh.f(parcel);
                e0(string, hxVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                ex exVar = (ex) rh.b(parcel, ex.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    kxVar = iInterfaceQueryLocalInterface5 instanceof kx ? (kx) iInterfaceQueryLocalInterface5 : new kx(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                }
                rh.f(parcel);
                if (!((Boolean) tn.f20446a.o()).booleanValue()) {
                    try {
                        Parcel parcelQ = kxVar.q();
                        parcelQ.writeString("");
                        rh.c(parcelQ, exVar);
                        kxVar.m0(parcelQ, 1);
                    } catch (RemoteException e10) {
                        zze.zzb("Service can't call client", e10);
                    }
                    break;
                } else {
                    this.f15325d.getClass();
                    String str = exVar.f14101a;
                    be1 be1Var = be1.f12743b;
                    be1Var.addListener(new zd1(0, be1Var, new lj1(this, kxVar, exVar)), l00.f16615h);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                rh.f(parcel);
                zzi(string2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final uv0 x1(mx mxVar, int i10) {
        el0 el0VarD1;
        boolean z10;
        uv0 uv0VarM;
        rl rlVar = rl.f19607e;
        at atVarZzr = zzt.zzr();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        kw0 kw0Var = this.f15327f;
        Context context = this.f15322a;
        dt dtVarA = atVarZzr.a(context, versionInfoParcelForPackage, kw0Var);
        a50 a50Var = this.f15325d;
        a50Var.getClass();
        z40 z40Var = new z40(a50Var.f11854b, new b2.w(i10, 6, mxVar));
        ft ftVarA = dtVarA.a("google.afma.response.normalize", fl0.f14454d, jq.f16133c);
        Object obj = null;
        if (((Boolean) nn.f17865a.o()).booleanValue()) {
            el0VarD1 = D1(mxVar.f17573h);
            if (el0VarD1 == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = mxVar.f17575j;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
            el0VarD1 = null;
        }
        fw0 fw0VarF = el0VarD1 == null ? fw0.f(context, 9) : el0VarD1.f14006d;
        jw0 jw0Var = (jw0) ((fx1) z40Var.f22499i).zzb();
        jw0Var.b(mxVar.f17566a.getStringArrayList("ad_types"));
        ll0 ll0Var = new ll0(mxVar.f17572g, jw0Var, fw0VarF);
        vu0 vu0Var = new vu0(context, mxVar.f17567b.afmaVersion, obj, 20);
        yv0 yv0Var = (yv0) ((fx1) z40Var.f22500j).zzb();
        fw0 fw0VarF2 = fw0.f(context, 11);
        int i11 = 8;
        vv0 vv0Var = vv0.PRE_PROCESS;
        vv0 vv0Var2 = vv0.HTTP;
        if (el0VarD1 == null) {
            ht htVar = new ht(i11, z40Var, mxVar);
            tc0 tc0Var = tc0.f20293k;
            v90 v90VarA = yv0Var.a(zw1.d(mxVar.f17566a), vv0.GMS_SIGNALS);
            fe1 fe1Var = yv0Var.f22378a;
            uv0 uv0VarM2 = v90VarA.g(htVar).d(tc0Var).m();
            uv0 uv0VarB1 = B1(uv0VarM2, yv0Var, dtVarA, jw0Var, fw0VarF);
            fw0 fw0VarF3 = fw0.f(context, 10);
            List listAsList = Arrays.asList(uv0VarB1, uv0VarM2);
            r90 r90Var = new r90(uv0VarB1, mxVar, uv0VarM2);
            aa1 aa1Var = ca1.f13122b;
            listAsList.getClass();
            ca1 ca1VarY = ca1.y(listAsList);
            k00 k00Var = l00.f16615h;
            sd1 sd1Var = new sd1(ca1VarY, true, false);
            sd1Var.f19937p = new rd1(sd1Var, rlVar, k00Var);
            sd1Var.v();
            sd1 sd1Var2 = new sd1(ca1VarY, true, false);
            sd1Var2.f19937p = new rd1(sd1Var2, r90Var, fe1Var);
            sd1Var2.v();
            uv0 uv0VarM3 = new v90(yv0Var, vv0Var2, null, sd1Var, listAsList, sd1Var2).d(ll0Var).d(new wv0(fw0VarF3, 1)).d(vu0Var).m();
            ps1.a0(uv0VarM3, jw0Var, fw0VarF3, false);
            ps1.B(uv0VarM3, fw0VarF2);
            List listAsList2 = Arrays.asList(uv0VarM2, uv0VarB1, uv0VarM3);
            of0 of0Var = new of0(mxVar, uv0VarM3, uv0VarM2, uv0VarB1, 1);
            aa1 aa1Var2 = ca1.f13122b;
            listAsList2.getClass();
            ca1 ca1VarY2 = ca1.y(listAsList2);
            k00 k00Var2 = l00.f16615h;
            sd1 sd1Var3 = new sd1(ca1VarY2, true, false);
            sd1Var3.f19937p = new rd1(sd1Var3, rlVar, k00Var2);
            sd1Var3.v();
            sd1 sd1Var4 = new sd1(ca1VarY2, true, false);
            sd1Var4.f19937p = new rd1(sd1Var4, of0Var, fe1Var);
            sd1Var4.v();
            uv0VarM = new v90(yv0Var, vv0Var, null, sd1Var3, listAsList2, sd1Var4).g(ftVarA).m();
            z10 = false;
        } else {
            kl0 kl0Var = new kl0(el0VarD1.f14004b, el0VarD1.f14003a);
            fw0 fw0VarF4 = fw0.f(context, 10);
            uv0 uv0VarM4 = yv0Var.a(zw1.d(kl0Var), vv0Var2).d(ll0Var).d(new wv0(fw0VarF4, 1)).d(vu0Var).m();
            z10 = false;
            ps1.a0(uv0VarM4, jw0Var, fw0VarF4, false);
            be1 be1VarD = zw1.d(el0VarD1);
            ps1.B(uv0VarM4, fw0VarF2);
            List listAsList3 = Arrays.asList(uv0VarM4, be1VarD);
            ze zeVar = new ze(8, uv0VarM4, be1VarD);
            aa1 aa1Var3 = ca1.f13122b;
            listAsList3.getClass();
            ca1 ca1VarY3 = ca1.y(listAsList3);
            k00 k00Var3 = l00.f16615h;
            sd1 sd1Var5 = new sd1(ca1VarY3, true, false);
            sd1Var5.f19937p = new rd1(sd1Var5, rlVar, k00Var3);
            sd1Var5.v();
            fe1 fe1Var2 = yv0Var.f22378a;
            sd1 sd1Var6 = new sd1(ca1VarY3, true, false);
            sd1Var6.f19937p = new rd1(sd1Var6, zeVar, fe1Var2);
            sd1Var6.v();
            uv0VarM = new v90(yv0Var, vv0Var, null, sd1Var5, listAsList3, sd1Var6).g(ftVarA).m();
        }
        ps1.a0(uv0VarM, jw0Var, fw0VarF2, z10);
        return uv0VarM;
    }

    public final ListenableFuture y1(final mx mxVar, int i10) {
        if (!((Boolean) nn.f17865a.o()).booleanValue()) {
            return zw1.l(new Exception("Split request is disabled."));
        }
        ev0 ev0Var = mxVar.f17574i;
        if (ev0Var == null) {
            return zw1.l(new Exception("Pool configuration missing from request."));
        }
        if (ev0Var.f14094d == 0 || ev0Var.f14095e == 0) {
            return zw1.l(new Exception("Caching is disabled."));
        }
        at atVarZzr = zzt.zzr();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        Context context = this.f15322a;
        dt dtVarA = atVarZzr.a(context, versionInfoParcelForPackage, this.f15327f);
        a50 a50Var = this.f15325d;
        a50Var.getClass();
        z40 z40Var = new z40(a50Var.f11854b, new b2.w(i10, 6, mxVar));
        yv0 yv0Var = (yv0) ((fx1) z40Var.f22500j).zzb();
        final uv0 uv0VarM = yv0Var.a(zw1.d(mxVar.f17566a), vv0.GMS_SIGNALS).g(new ht(8, z40Var, mxVar)).d(tc0.f20293k).m();
        jw0 jw0Var = (jw0) ((fx1) z40Var.f22499i).zzb();
        final fw0 fw0VarF = fw0.f(context, 9);
        final uv0 uv0VarB1 = B1(uv0VarM, yv0Var, dtVarA, jw0Var, fw0VarF);
        List listAsList = Arrays.asList(uv0VarM, uv0VarB1);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.dl0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hl0 hl0Var = this.f13574a;
                uv0 uv0Var = uv0VarB1;
                uv0 uv0Var2 = uv0VarM;
                mx mxVar2 = mxVar;
                fw0 fw0Var = fw0VarF;
                String str = ((nx) uv0Var.f20915c.get()).f18013i;
                el0 el0Var = new el0((nx) uv0Var.f20915c.get(), (JSONObject) uv0Var2.f20915c.get(), mxVar2.f17573h, fw0Var);
                synchronized (hl0Var) {
                    synchronized (hl0Var) {
                        int iIntValue = ((Long) nn.f17866b.o()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = hl0Var.f15326e;
                            if (arrayDeque.size() >= iIntValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                hl0Var.f15326e.addLast(el0Var);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        aa1 aa1Var = ca1.f13122b;
        listAsList.getClass();
        ca1 ca1VarY = ca1.y(listAsList);
        rl rlVar = rl.f19607e;
        k00 k00Var = l00.f16615h;
        sd1 sd1Var = new sd1(ca1VarY, true, false);
        sd1Var.f19937p = new rd1(sd1Var, rlVar, k00Var);
        sd1Var.v();
        fe1 fe1Var = yv0Var.f22378a;
        sd1 sd1Var2 = new sd1(ca1VarY, true, false);
        sd1Var2.f19937p = new rd1(sd1Var2, callable, fe1Var);
        sd1Var2.v();
        return new v90(yv0Var, vv0.GET_URL_AND_CACHE_KEY, null, sd1Var, listAsList, sd1Var2).m();
    }

    public final ListenableFuture z1(String str) {
        if (((Boolean) nn.f17865a.o()).booleanValue()) {
            return D1(str) == null ? zw1.l(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zw1.d(new cl0());
        }
        return zw1.l(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void zzi(String str) {
        jl0 jl0VarK;
        Binder.getCallingUid();
        if (((Boolean) zzba.zzc().a(am.Mf)).booleanValue()) {
            String str2 = (String) zzba.zzc().a(am.Nf);
            if (str2.isEmpty()) {
                return;
            }
            t6.l lVarH = t6.l.h(new z71(','));
            zze.zza("AdRequestServiceImpl: Preconnecting");
            Iterator itE = ((p81) lVarH.f50551d).e(lVarH, str2);
            do {
                o81 o81Var = (o81) itE;
                if (!o81Var.hasNext()) {
                    return;
                }
                String str3 = (String) o81Var.next();
                Context context = this.f15322a;
                vu0 vu0Var = new vu0(context, str, "HEAD", 20);
                HashMap map = new HashMap();
                map.put(Command.HTTP_HEADER_USER_AGENT, zzt.zzc().zze(context, str));
                try {
                    jl0VarK = vu0Var.k(new il0(str3, 30000, map, new byte[0], ""));
                } catch (Exception e10) {
                    throw new RemoteException(e10.getMessage());
                }
            } while (jl0VarK.f16110a == 200);
            int i10 = jl0VarK.f16110a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
            sb2.append("Unexpected preconnect response: ");
            sb2.append(i10);
            throw new RemoteException(sb2.toString());
        }
    }
}
