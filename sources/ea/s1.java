package ea;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.consent_sdk.m7;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.m6;
import com.ironsource.Xa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends l6 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4 f39761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f39762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39763c;

    public s1(e4 e4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        k9.c0.h(e4Var);
        this.f39761a = e4Var;
        this.f39763c = null;
    }

    @Override // ea.g0
    public final void A(e eVar, n4 n4Var) {
        k9.c0.h(eVar);
        k9.c0.h(eVar.f39354c);
        m0(n4Var);
        e eVar2 = new e(eVar);
        eVar2.f39352a = n4Var.f39628a;
        v1(new com.google.android.gms.common.api.internal.m0(this, eVar2, n4Var, 8));
    }

    @Override // ea.g0
    public final byte[] A0(u uVar, String str) {
        k9.c0.e(str);
        k9.c0.h(uVar);
        u1(str, true);
        e4 e4Var = this.f39761a;
        bo.b bVar = e4Var.t().f39759m;
        m1 m1Var = e4Var.l;
        o0 o0Var = m1Var.f39591j;
        String str2 = uVar.f39771a;
        bVar.c(o0Var.a(str2), "Log and bundle. event");
        ((p9.b) e4Var.i0()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) e4Var.P().O0(new c6.a(this, uVar, str)).get();
            if (bArr == null) {
                e4Var.t().f39753f.c(s0.O0(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((p9.b) e4Var.i0()).getClass();
            e4Var.t().f39759m.e("Log and bundle processed. event, size, time_ms", m1Var.f39591j.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            e4Var.t().f39753f.e("Failed to log and bundle. appId, event, error", s0.O0(str), m1Var.f39591j.a(str2), e10);
            return null;
        }
    }

    @Override // ea.g0
    public final void D0(long j10, String str, String str2, String str3) {
        v1(new p1(this, str2, str3, str, j10, 0));
    }

    @Override // ea.g0
    public final List F(String str, String str2, String str3) {
        u1(str, true);
        e4 e4Var = this.f39761a;
        try {
            return (List) e4Var.P().N0(new q1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            e4Var.t().f39753f.c(e10, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ea.g0
    public final void I(n4 n4Var, x3 x3Var, k0 k0Var) {
        m0(n4Var);
        String str = n4Var.f39628a;
        k9.c0.h(str);
        this.f39761a.P().P0(new com.adjust.sdk.t0(this, str, x3Var, k0Var, 1, false));
    }

    @Override // ea.g0
    public final void J0(n4 n4Var) {
        k9.c0.e(n4Var.f39628a);
        k9.c0.h(n4Var.f39645s);
        r(new o1(this, n4Var, 6));
    }

    @Override // ea.g0
    public final void O0(n4 n4Var) {
        m0(n4Var);
        v1(new o1(this, n4Var, 0));
    }

    @Override // ea.g0
    public final List P0(String str, String str2, n4 n4Var) {
        m0(n4Var);
        String str3 = n4Var.f39628a;
        k9.c0.h(str3);
        e4 e4Var = this.f39761a;
        try {
            return (List) e4Var.P().N0(new q1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            e4Var.t().f39753f.c(e10, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ea.g0
    public final i T0(n4 n4Var) {
        m0(n4Var);
        String str = n4Var.f39628a;
        k9.c0.e(str);
        e4 e4Var = this.f39761a;
        try {
            return (i) e4Var.P().O0(new n1(1, this, n4Var)).get(Xa.f27908s, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            e4Var.t().f39753f.d("Failed to get consent. appId", s0.O0(str), e10);
            return new i(null);
        }
    }

    @Override // ea.g0
    public final void W0(n4 n4Var, d dVar) {
        m0(n4Var);
        v1(new com.google.android.gms.common.api.internal.m0(this, n4Var, dVar, false, 12));
    }

    @Override // ea.g0
    public final String b0(n4 n4Var) {
        m0(n4Var);
        e4 e4Var = this.f39761a;
        try {
            return (String) e4Var.P().N0(new n1(e4Var, n4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            e4Var.t().f39753f.d("Failed to get app instance id. appId", s0.O0(n4Var.f39628a), e10);
            return null;
        }
    }

    @Override // ea.g0
    public final void b1(n4 n4Var) {
        k9.c0.e(n4Var.f39628a);
        k9.c0.h(n4Var.f39645s);
        r(new o1(this, n4Var, 4));
    }

    @Override // ea.g0
    public final void g0(n4 n4Var, Bundle bundle, i0 i0Var) {
        m0(n4Var);
        String str = n4Var.f39628a;
        k9.c0.h(str);
        this.f39761a.P().P0(new m7(this, n4Var, bundle, i0Var, str, 1));
    }

    @Override // ea.g0
    public final void h1(Bundle bundle, n4 n4Var) {
        m0(n4Var);
        String str = n4Var.f39628a;
        k9.c0.h(str);
        v1(new com.adjust.sdk.t0(this, bundle, str, n4Var, 3, false));
    }

    @Override // ea.g0
    public final List j1(String str, String str2, boolean z10, n4 n4Var) {
        m0(n4Var);
        String str3 = n4Var.f39628a;
        k9.c0.h(str3);
        e4 e4Var = this.f39761a;
        try {
            List<j4> list = (List) e4Var.P().N0(new q1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j4 j4Var : list) {
                if (z10 || !l4.j1(j4Var.f39519c)) {
                    arrayList.add(new i4(j4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            e4Var.t().f39753f.d("Failed to query user properties. appId", s0.O0(str3), e10);
            return Collections.EMPTY_LIST;
        }
    }

    public final void m0(n4 n4Var) {
        k9.c0.h(n4Var);
        String str = n4Var.f39628a;
        k9.c0.e(str);
        u1(str, false);
        this.f39761a.l0().M0(n4Var.f39629b);
    }

    @Override // ea.g0
    public final void m1(n4 n4Var) {
        m0(n4Var);
        v1(new o1(this, n4Var, 1));
    }

    @Override // ea.g0
    public final void p1(n4 n4Var) {
        String str = n4Var.f39628a;
        k9.c0.e(str);
        u1(str, false);
        v1(new o1(this, n4Var, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.l6
    public final boolean q(int i10, Parcel parcel, Parcel parcel2) {
        List list;
        e4 e4Var = this.f39761a;
        ArrayList arrayList = null;
        i0 h0Var = null;
        k0 j0Var = null;
        boolean z10 = false;
        int i11 = 1;
        switch (i10) {
            case 1:
                u uVar = (u) m6.a(parcel, u.CREATOR);
                n4 n4Var = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                r1(uVar, n4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                i4 i4Var = (i4) m6.a(parcel, i4.CREATOR);
                n4 n4Var2 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                v0(i4Var, n4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            default:
                return false;
            case 4:
                n4 n4Var3 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                O0(n4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                u uVar2 = (u) m6.a(parcel, u.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                m6.d(parcel);
                k9.c0.h(uVar2);
                k9.c0.e(string);
                u1(string, true);
                v1(new com.google.android.gms.common.api.internal.m0(this, uVar2, string, 10));
                parcel2.writeNoException();
                return true;
            case 6:
                n4 n4Var4 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                x0(n4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                n4 n4Var5 = (n4) m6.a(parcel, n4.CREATOR);
                byte b10 = parcel.readInt() != 0;
                m6.d(parcel);
                m0(n4Var5);
                String str = n4Var5.f39628a;
                k9.c0.h(str);
                try {
                    List<j4> list2 = (List) e4Var.P().N0(new n1(z10 ? 1 : 0, this, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (j4 j4Var : list2) {
                        if (b10 != false || !l4.j1(j4Var.f39519c)) {
                            arrayList2.add(new i4(j4Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e10) {
                    e4Var.t().f39753f.d("Failed to get user properties. appId", s0.O0(str), e10);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                u uVar3 = (u) m6.a(parcel, u.CREATOR);
                String string2 = parcel.readString();
                m6.d(parcel);
                byte[] bArrA0 = A0(uVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrA0);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                m6.d(parcel);
                D0(j10, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                n4 n4Var6 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                String strB0 = b0(n4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strB0);
                return true;
            case 12:
                e eVar = (e) m6.a(parcel, e.CREATOR);
                n4 n4Var7 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                A(eVar, n4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) m6.a(parcel, e.CREATOR);
                m6.d(parcel);
                k9.c0.h(eVar2);
                k9.c0.h(eVar2.f39354c);
                k9.c0.e(eVar2.f39352a);
                u1(eVar2.f39352a, true);
                v1(new ta.i0(this, z10, new e(eVar2), 8));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = m6.f23729a;
                z10 = parcel.readInt() != 0;
                n4 n4Var8 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                List listJ1 = j1(string6, string7, z10, n4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ1);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = m6.f23729a;
                boolean z11 = parcel.readInt() != 0;
                m6.d(parcel);
                List listT = t(string8, string9, string10, z11);
                parcel2.writeNoException();
                parcel2.writeTypedList(listT);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                n4 n4Var9 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                List listP0 = P0(string11, string12, n4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP0);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                m6.d(parcel);
                List listF = F(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listF);
                return true;
            case 18:
                n4 n4Var10 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                p1(n4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) m6.a(parcel, Bundle.CREATOR);
                n4 n4Var11 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                h1(bundle, n4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                n4 n4Var12 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                b1(n4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                n4 n4Var13 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                i iVarT0 = T0(n4Var13);
                parcel2.writeNoException();
                if (iVarT0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarT0.writeToParcel(parcel2, 1);
                return true;
            case 24:
                n4 n4Var14 = (n4) m6.a(parcel, n4.CREATOR);
                Bundle bundle2 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                m6.d(parcel);
                m0(n4Var14);
                String str2 = n4Var14.f39628a;
                k9.c0.h(str2);
                if (!e4Var.e0().R0(null, d0.T0)) {
                    try {
                        list = (List) e4Var.P().N0(new r1(this, n4Var14, bundle2, i11)).get();
                    } catch (InterruptedException | ExecutionException e11) {
                        e4Var.t().f39753f.d("Failed to get trigger URIs. appId", s0.O0(str2), e11);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) e4Var.P().O0(new r1(this, n4Var14, bundle2, z10 ? 1 : 0)).get(Xa.f27908s, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e12) {
                        e4Var.t().f39753f.d("Failed to get trigger URIs. appId", s0.O0(str2), e12);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                n4 n4Var15 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                J0(n4Var15);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                n4 n4Var16 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                y0(n4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                n4 n4Var17 = (n4) m6.a(parcel, n4.CREATOR);
                m6.d(parcel);
                m1(n4Var17);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                n4 n4Var18 = (n4) m6.a(parcel, n4.CREATOR);
                x3 x3Var = (x3) m6.a(parcel, x3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    j0Var = iInterfaceQueryLocalInterface instanceof k0 ? (k0) iInterfaceQueryLocalInterface : new j0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 1);
                }
                m6.d(parcel);
                I(n4Var18, x3Var, j0Var);
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                n4 n4Var19 = (n4) m6.a(parcel, n4.CREATOR);
                d dVar = (d) m6.a(parcel, d.CREATOR);
                m6.d(parcel);
                W0(n4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                n4 n4Var20 = (n4) m6.a(parcel, n4.CREATOR);
                Bundle bundle3 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    h0Var = iInterfaceQueryLocalInterface2 instanceof i0 ? (i0) iInterfaceQueryLocalInterface2 : new h0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 1);
                }
                m6.d(parcel);
                g0(n4Var20, bundle3, h0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void r(Runnable runnable) {
        e4 e4Var = this.f39761a;
        if (e4Var.P().M0()) {
            runnable.run();
        } else {
            e4Var.P().R0(runnable);
        }
    }

    @Override // ea.g0
    public final void r1(u uVar, n4 n4Var) {
        k9.c0.h(uVar);
        m0(n4Var);
        v1(new com.google.android.gms.common.api.internal.m0(this, uVar, n4Var, 9));
    }

    @Override // ea.g0
    public final List t(String str, String str2, String str3, boolean z10) {
        u1(str, true);
        e4 e4Var = this.f39761a;
        try {
            List<j4> list = (List) e4Var.P().N0(new q1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j4 j4Var : list) {
                if (z10 || !l4.j1(j4Var.f39519c)) {
                    arrayList.add(new i4(j4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            e4Var.t().f39753f.d("Failed to get user properties as. appId", s0.O0(str), e10);
            return Collections.EMPTY_LIST;
        }
    }

    public final void u1(String str, boolean z10) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        e4 e4Var = this.f39761a;
        if (zIsEmpty) {
            e4Var.t().f39753f.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f39762b == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f39763c) && !p9.c.g(e4Var.l.f39582a, Binder.getCallingUid()) && !i9.i.b(e4Var.l.f39582a).c(Binder.getCallingUid())) {
                        z11 = false;
                    }
                    this.f39762b = Boolean.valueOf(z11);
                }
                if (this.f39762b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                e4Var.t().f39753f.c(s0.O0(str), "Measurement Service called with invalid calling package. appId");
                throw e10;
            }
        }
        if (this.f39763c == null) {
            Context context = e4Var.l.f39582a;
            int callingUid = Binder.getCallingUid();
            int i10 = i9.h.f42935e;
            if (p9.c.k(context, callingUid, str)) {
                this.f39763c = str;
            }
        }
        if (str.equals(this.f39763c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // ea.g0
    public final void v0(i4 i4Var, n4 n4Var) {
        k9.c0.h(i4Var);
        m0(n4Var);
        v1(new com.google.android.gms.common.api.internal.m0(this, i4Var, n4Var, 11));
    }

    public final void v1(Runnable runnable) {
        e4 e4Var = this.f39761a;
        if (e4Var.P().M0()) {
            runnable.run();
        } else {
            e4Var.P().P0(runnable);
        }
    }

    @Override // ea.g0
    public final void x0(n4 n4Var) {
        m0(n4Var);
        v1(new o1(this, n4Var, 2));
    }

    @Override // ea.g0
    public final void y0(n4 n4Var) {
        k9.c0.e(n4Var.f39628a);
        k9.c0.h(n4Var.f39645s);
        r(new o1(this, n4Var, 5));
    }
}
