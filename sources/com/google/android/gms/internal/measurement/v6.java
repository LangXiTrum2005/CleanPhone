package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v6 extends l6 implements a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f24077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24078b;

    public v6() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f24077a = new AtomicReference();
    }

    public static final Object u1(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", l1.d.g("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void e1(Bundle bundle) {
        AtomicReference atomicReference = this.f24077a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f24078b = true;
                    this.f24077a.notify();
                } catch (Throwable th2) {
                    this.f24077a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Bundle m0(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f24077a;
        synchronized (atomicReference) {
            if (!this.f24078b) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f24077a.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final boolean q(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) m6.a(parcel, Bundle.CREATOR);
        m6.d(parcel);
        e1(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final String r(long j10) {
        return (String) u1(String.class, m0(j10));
    }
}
