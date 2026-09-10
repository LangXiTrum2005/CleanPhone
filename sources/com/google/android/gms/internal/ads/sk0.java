package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sk0 implements k9.b, k9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f19986a = new m00();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19987b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19988c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19989d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mx f19990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hj f19991f;

    public static void b(Context context, m00 m00Var, Executor executor) {
        if (((Boolean) zm.f22668j.o()).booleanValue() || ((Boolean) zm.f22666h.o()).booleanValue()) {
            m00Var.addListener(new zd1(0, m00Var, new az0(context)), executor);
        }
    }

    public final void a() {
        synchronized (this.f19987b) {
            try {
                this.f19989d = true;
                if (this.f19991f.isConnected() || this.f19991f.isConnecting()) {
                    this.f19991f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k9.b
    public void q(int i10) {
        int i11 = zze.zza;
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
    }

    public void r(ConnectionResult connectionResult) {
        int i10 = zze.zza;
        zzo.zzd("Disconnected from remote ad request service.");
        this.f19986a.zzd(new yk0(1));
    }
}
