package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.yz1;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.u;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClientStateListener f7252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz1 f7253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yz1 f7254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f7256e;

    public d(a aVar, BillingClientStateListener billingClientStateListener, int i10) {
        this.f7256e = aVar;
        r9.b bVar = aVar.J;
        this.f7253b = new yz1(bVar);
        this.f7254c = new yz1(bVar);
        this.f7252a = billingClientStateListener;
        this.f7255d = i10;
    }

    public final Long a(boolean z10) {
        if (z10) {
            yz1 yz1Var = this.f7253b;
            if (!yz1Var.f22417b) {
                return null;
            }
            long jP = ((r9.b) yz1Var.f22420e).P();
            if (!yz1Var.f22417b) {
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            yz1Var.f22417b = false;
            long j10 = (jP - yz1Var.f22419d) + yz1Var.f22418c;
            yz1Var.f22418c = j10;
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
        }
        yz1 yz1Var2 = this.f7254c;
        if (!yz1Var2.f22417b) {
            return null;
        }
        long jP2 = ((r9.b) yz1Var2.f22420e).P();
        if (!yz1Var2.f22417b) {
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        yz1Var2.f22417b = false;
        long j11 = (jP2 - yz1Var2.f22419d) + yz1Var2.f22418c;
        yz1Var2.f22418c = j11;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
    }

    public final void b(BillingResult billingResult, j3 j3Var, String str, boolean z10) {
        try {
            i3 i3VarS = k3.s();
            i3VarS.e(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            i3VarS.c();
            k3.o((k3) i3VarS.f24469b, debugMessage);
            i3VarS.d(j3Var);
            if (str != null) {
                i3VarS.c();
                k3.n((k3) i3VarS.f24469b, str);
            }
            Long lA = a(z10);
            a aVar = this.f7256e;
            if (!z10) {
                a4 a4VarP = b4.p();
                a4VarP.c();
                b4.n((b4) a4VarP.f24469b, (k3) i3VarS.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    a4VarP.c();
                    b4.o((b4) a4VarP.f24469b, jLongValue);
                }
                aVar.f7230h.n((b4) a4VarP.a());
                return;
            }
            d4 d4VarR = e4.r();
            int i10 = this.f7255d;
            d4VarR.d(i10 > 0);
            d4VarR.e(i10);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                d4VarR.c();
                e4.p((e4) d4VarR.f24469b, jLongValue2);
            }
            e3 e3VarV = f3.v();
            e3VarV.d(i3VarS);
            e3VarV.f(6);
            e3VarV.e(d4VarR);
            aVar.m((f3) e3VarV.a());
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(BillingResult billingResult) {
        a aVar = this.f7256e;
        synchronized (aVar.f7223a) {
            try {
                if (aVar.f7224b == 3) {
                    return;
                }
                try {
                    this.f7252a.onBillingSetupFinished(billingResult);
                } catch (Throwable th2) {
                    u.i("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z10;
        boolean z11;
        u.h("BillingClient", "Billing service died.");
        try {
            a aVar = this.f7256e;
            synchronized (aVar.f7223a) {
                z10 = true;
                z11 = aVar.f7224b == 1;
            }
            if (z11) {
                wi.b bVar = aVar.f7230h;
                e3 e3VarV = f3.v();
                e3VarV.f(6);
                i3 i3VarS = k3.s();
                i3VarS.d(j3.BINDING_DIED);
                e3VarV.d(i3VarS);
                d4 d4VarR = e4.r();
                int i10 = this.f7255d;
                if (i10 <= 0) {
                    z10 = false;
                }
                d4VarR.d(z10);
                d4VarR.e(i10);
                e3VarV.e(d4VarR);
                bVar.c((f3) e3VarV.a());
            } else {
                aVar.f7230h.m(l3.n());
            }
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
        a aVar2 = this.f7256e;
        synchronized (aVar2.f7223a) {
            if (aVar2.f7224b != 3 && aVar2.f7224b != 0) {
                aVar2.p(0);
                aVar2.r();
                try {
                    this.f7252a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.d bVar;
        u.g("BillingClient", "Billing service connected.");
        a aVar = this.f7256e;
        synchronized (aVar.f7223a) {
            try {
                if (aVar.f7224b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.c.f24238b;
                if (iBinder == null) {
                    bVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    bVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.d ? (com.google.android.gms.internal.play_billing.d) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.b(iBinder, "com.android.vending.billing.IInAppBillingService", 2);
                }
                aVar.f7231i = bVar;
                if (a.b(new Callable() { // from class: com.android.billingclient.api.zzbd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        com.google.android.gms.internal.play_billing.d dVar;
                        j3 j3Var;
                        d dVar2 = this.zza;
                        a aVar2 = dVar2.f7256e;
                        synchronized (aVar2.f7223a) {
                            try {
                                if (aVar2.f7224b == 3) {
                                    return null;
                                }
                                boolean z10 = true;
                                boolean z11 = aVar2.f7224b == 1;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    u.b(aVar2.I.longValue(), bundle, aVar2.f7225c, aVar2.f7226d);
                                }
                                j3 j3Var2 = j3.REASON_UNSPECIFIED;
                                synchronized (aVar2.f7223a) {
                                    dVar = aVar2.f7231i;
                                }
                                if (dVar == null) {
                                    a aVar3 = dVar2.f7256e;
                                    aVar3.p(0);
                                    int i11 = dVar2.f7255d;
                                    j3 j3Var3 = j3.SERVICE_RESET_TO_NULL;
                                    BillingResult billingResult = k.f7276j;
                                    aVar3.o(i11, billingResult, j3Var3);
                                    dVar2.c(billingResult);
                                    return null;
                                }
                                a aVar4 = dVar2.f7256e;
                                String packageName = aVar4.f7229g.getPackageName();
                                int iC1 = 3;
                                int i12 = 25;
                                while (true) {
                                    if (i12 < 3) {
                                        i12 = 0;
                                        break;
                                    }
                                    if (bundle == null) {
                                        try {
                                            com.google.android.gms.internal.play_billing.b bVar2 = (com.google.android.gms.internal.play_billing.b) dVar;
                                            Parcel parcelY1 = bVar2.y1();
                                            parcelY1.writeInt(i12);
                                            parcelY1.writeString(packageName);
                                            parcelY1.writeString("subs");
                                            Parcel parcelZ1 = bVar2.z1(parcelY1, 1);
                                            int i13 = parcelZ1.readInt();
                                            parcelZ1.recycle();
                                            iC1 = i13;
                                        } catch (Exception e10) {
                                            u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                            boolean z12 = e10 instanceof DeadObjectException;
                                            if (z12) {
                                                j3Var = j3.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                            } else if (e10 instanceof RemoteException) {
                                                j3Var = j3.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                            } else {
                                                j3Var = e10 instanceof SecurityException ? j3.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : j3.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                            }
                                            String strZza = j3Var.equals(j3.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? zzcg.zza(e10) : null;
                                            dVar2.f7256e.p(0);
                                            dVar2.b(z12 ? k.f7276j : k.f7274h, j3Var, strZza, z11);
                                            dVar2.c(z12 ? k.f7276j : k.f7274h);
                                        }
                                    } else {
                                        iC1 = ((com.google.android.gms.internal.play_billing.b) dVar).C1(i12, packageName, "subs", bundle);
                                    }
                                    if (iC1 == 0) {
                                        u.g("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                        break;
                                    }
                                    i12--;
                                }
                                aVar4.l = i12 >= 5;
                                aVar4.f7233k = i12 >= 3;
                                if (i12 < 3) {
                                    j3Var2 = j3.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i14 = 25; i14 >= 3; i14--) {
                                    if (bundle == null) {
                                        com.google.android.gms.internal.play_billing.b bVar3 = (com.google.android.gms.internal.play_billing.b) dVar;
                                        Parcel parcelY2 = bVar3.y1();
                                        parcelY2.writeInt(i14);
                                        parcelY2.writeString(packageName);
                                        parcelY2.writeString("inapp");
                                        Parcel parcelZ2 = bVar3.z1(parcelY2, 1);
                                        iC1 = parcelZ2.readInt();
                                        parcelZ2.recycle();
                                    } else {
                                        iC1 = ((com.google.android.gms.internal.play_billing.b) dVar).C1(i14, packageName, "inapp", bundle);
                                    }
                                    if (iC1 == 0) {
                                        aVar4.f7234m = i14;
                                        u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                        break;
                                    }
                                }
                                a.v(aVar4, aVar4.f7234m);
                                if (aVar4.f7234m < 3) {
                                    j3Var2 = j3.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                a.w(aVar4, iC1);
                                if (iC1 != 0) {
                                    BillingResult billingResult2 = k.f7268b;
                                    dVar2.b(billingResult2, j3Var2, null, z11);
                                    dVar2.c(billingResult2);
                                    return null;
                                }
                                try {
                                    Long lA = dVar2.a(z11);
                                    if (z11) {
                                        g3 g3VarT = h3.t();
                                        g3VarT.c();
                                        h3.s((h3) g3VarT.f24469b, 6);
                                        d4 d4VarR = e4.r();
                                        int i15 = dVar2.f7255d;
                                        if (i15 <= 0) {
                                            z10 = false;
                                        }
                                        d4VarR.d(z10);
                                        d4VarR.e(i15);
                                        if (lA != null) {
                                            long jLongValue = lA.longValue();
                                            d4VarR.c();
                                            e4.p((e4) d4VarR.f24469b, jLongValue);
                                        }
                                        a aVar5 = dVar2.f7256e;
                                        g3VarT.c();
                                        h3.r((h3) g3VarT.f24469b, (e4) d4VarR.a());
                                        aVar5.n((h3) g3VarT.a());
                                    } else {
                                        a4 a4VarP = b4.p();
                                        i3 i3VarS = k3.s();
                                        i3VarS.e(0);
                                        a4VarP.c();
                                        b4.n((b4) a4VarP.f24469b, (k3) i3VarS.a());
                                        if (lA != null) {
                                            long jLongValue2 = lA.longValue();
                                            a4VarP.c();
                                            b4.o((b4) a4VarP.f24469b, jLongValue2);
                                        }
                                        dVar2.f7256e.f7230h.n((b4) a4VarP.a());
                                    }
                                } catch (Throwable th2) {
                                    u.i("BillingClient", "Unable to log.", th2);
                                }
                                dVar2.c(k.f7275i);
                                return null;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbe
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = this.zza;
                        a aVar2 = dVar.f7256e;
                        aVar2.p(0);
                        BillingResult billingResult = k.f7277k;
                        aVar2.o(dVar.f7255d, billingResult, j3.EXECUTE_ASYNC_TIMEOUT);
                        dVar.c(billingResult);
                    }
                }, aVar.x(), aVar.a()) == null) {
                    int i11 = this.f7255d;
                    BillingResult billingResultA = aVar.A();
                    aVar.o(i11, billingResultA, j3.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    c(billingResultA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        boolean z11;
        u.h("BillingClient", "Billing service disconnected.");
        try {
            a aVar = this.f7256e;
            synchronized (aVar.f7223a) {
                z10 = true;
                z11 = aVar.f7224b == 1;
            }
            if (z11) {
                wi.b bVar = aVar.f7230h;
                e3 e3VarV = f3.v();
                e3VarV.f(6);
                i3 i3VarS = k3.s();
                i3VarS.d(j3.SERVICE_DISCONNECTED);
                e3VarV.d(i3VarS);
                d4 d4VarR = e4.r();
                int i10 = this.f7255d;
                if (i10 <= 0) {
                    z10 = false;
                }
                d4VarR.d(z10);
                d4VarR.e(i10);
                e3VarV.e(d4VarR);
                bVar.c((f3) e3VarV.a());
            } else {
                aVar.f7230h.o(c4.n());
            }
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
        yz1 yz1Var = this.f7254c;
        yz1Var.f22418c = 0L;
        yz1Var.f22417b = false;
        yz1Var.b();
        a aVar2 = this.f7256e;
        synchronized (aVar2.f7223a) {
            try {
                if (aVar2.f7224b == 3) {
                    return;
                }
                aVar2.p(0);
                try {
                    this.f7252a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
