package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eb extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f23418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ta.v0 f23420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q6 f23421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Executor f23422e;

    public eb(AtomicBoolean atomicBoolean, Context context, ta.v0 v0Var, q6 q6Var, Executor executor) {
        this.f23418a = atomicBoolean;
        this.f23419b = context;
        this.f23420c = v0Var;
        this.f23421d = q6Var;
        this.f23422e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f23418a.compareAndSet(false, true)) {
            try {
                this.f23419b.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e10);
            }
            ta.v0 v0Var = this.f23420c;
            q6 q6Var = this.f23421d;
            Executor executor = this.f23422e;
            ta.x0 x0Var = new ta.x0();
            x0Var.f50672i = new ta.w0(x0Var, q6Var);
            executor.execute(x0Var);
            v0Var.o(x0Var);
        }
    }
}
