package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import d1.a;
import ea.e4;
import ea.k3;
import ea.m1;
import ea.s0;
import ea.s1;
import n5.f;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f24513a;

    @Override // ea.k3
    public final boolean a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // ea.k3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.f38618a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f38618a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ea.k3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final f d() {
        if (this.f24513a == null) {
            this.f24513a = new f(this, 8);
        }
        return this.f24513a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        f fVarD = d();
        fVarD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new s1(e4.z((Service) fVarD.f46523b));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f46523b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f46523b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, final int i11) {
        final f fVarD = d();
        if (intent == null) {
            fVarD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) fVarD.f46523b;
        final s0 s0Var = m1.n(service, null, null, null).f39587f;
        m1.h(s0Var);
        String action = intent.getAction();
        s0Var.f39760n.d("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: ea.l3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) fVarD.f46523b;
                k3 k3Var = (k3) service2;
                int i12 = i11;
                if (k3Var.a(i12)) {
                    s0Var.f39760n.c(Integer.valueOf(i12), "Local AppMeasurementService processed last upload request. StartId");
                    s0 s0Var2 = m1.n(service2, null, null, null).f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39760n.b("Completed wakeful intent.");
                    k3Var.b(intent);
                }
            }
        };
        e4 e4VarZ = e4.z(service);
        e4VarZ.P().P0(new i0(fVarD, e4VarZ, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
