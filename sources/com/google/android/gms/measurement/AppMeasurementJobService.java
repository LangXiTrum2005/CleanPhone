package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.p7;
import ea.e4;
import ea.k3;
import ea.s0;
import fd.b;
import java.util.Objects;
import k9.c0;
import n5.f;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f24511a;

    @Override // ea.k3
    public final boolean a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // ea.k3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final f d() {
        if (this.f24511a == null) {
            this.f24511a = new f(this, 8);
        }
        return this.f24511a;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        f fVarD = d();
        Service service = (Service) fVarD.f46523b;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            c0.h(string);
            e4 e4VarZ = e4.z(service);
            s0 s0VarT = e4VarZ.t();
            b bVar = e4VarZ.l.f39584c;
            s0VarT.f39760n.c(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            e4VarZ.P().P0(new i0(fVarD, e4VarZ, new m0(fVarD, s0VarT, jobParameters2, false, 16)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        c0.h(string);
        c8 c8VarE = c8.e(service, null);
        i0 i0Var = new i0(19, fVarD, jobParameters2);
        c8VarE.getClass();
        c8VarE.c(new p7(c8VarE, i0Var, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // ea.k3
    public final void b(Intent intent) {
    }
}
