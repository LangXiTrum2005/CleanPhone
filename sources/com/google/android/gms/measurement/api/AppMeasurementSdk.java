package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.u7;
import com.google.android.gms.internal.measurement.v6;
import com.google.android.gms.internal.measurement.z7;
import java.util.ArrayList;
import rb.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8 f24514a;

    public AppMeasurementSdk(c8 c8Var) {
        this.f24514a = c8Var;
    }

    @NonNull
    @Keep
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return c8.e(context, null).f23354b;
    }

    public final void a(b bVar) {
        c8 c8Var = this.f24514a;
        ArrayList arrayList = c8Var.f23355c;
        synchronized (arrayList) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i10)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z7 z7Var = new z7(bVar);
            arrayList.add(new Pair(bVar, z7Var));
            if (c8Var.f23358f != null) {
                try {
                    c8Var.f23358f.registerOnMeasurementEventListener(z7Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c8Var.c(new p7(c8Var, z7Var, 3));
        }
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        c8 c8Var = this.f24514a;
        c8Var.c(new o7(c8Var, str, 1));
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        c8 c8Var = this.f24514a;
        c8Var.c(new o7(c8Var, str, 2));
    }

    @Keep
    public long generateEventId() {
        return this.f24514a.g();
    }

    @Nullable
    @Keep
    public String getAppInstanceId() {
        v6 v6Var = new v6();
        c8 c8Var = this.f24514a;
        c8Var.c(new u7(c8Var, v6Var, 1));
        return v6Var.r(50L);
    }

    @Nullable
    @Keep
    public String getGmpAppId() {
        v6 v6Var = new v6();
        c8 c8Var = this.f24514a;
        c8Var.c(new u7(c8Var, v6Var, 0));
        return v6Var.r(500L);
    }

    @Keep
    public void logEvent(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        c8 c8Var = this.f24514a;
        c8Var.c(new l7(c8Var, str, str2, bundle, true));
    }
}
