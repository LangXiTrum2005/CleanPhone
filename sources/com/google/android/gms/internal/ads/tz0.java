package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tz0 implements k9.b, k9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e01 f20533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hh f20536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f20537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerThread f20538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qz0 f20539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20540h;

    public tz0(Context context, hh hhVar, String str, String str2, qz0 qz0Var) {
        this.f20534b = str;
        this.f20536d = hhVar;
        this.f20535c = str2;
        this.f20539g = qz0Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f20538f = handlerThread;
        handlerThread.start();
        this.f20540h = System.currentTimeMillis();
        e01 e01Var = new e01(context, handlerThread.getLooper(), this, this, 19621000);
        this.f20533a = e01Var;
        this.f20537e = new LinkedBlockingQueue();
        e01Var.checkAvailabilityAndConnect();
    }

    public final void a() {
        e01 e01Var = this.f20533a;
        if (e01Var != null) {
            if (e01Var.isConnected() || e01Var.isConnecting()) {
                e01Var.disconnect();
            }
        }
    }

    public final void b(int i10, long j10, Exception exc) {
        qz0 qz0Var = this.f20539g;
        if (qz0Var != null) {
            qz0Var.c(i10, System.currentTimeMillis() - j10, exc);
        }
    }

    @Override // k9.b
    public final void d(Bundle bundle) {
        h01 h01Var;
        long j10 = this.f20540h;
        HandlerThread handlerThread = this.f20538f;
        try {
            h01Var = (h01) this.f20533a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            h01Var = null;
        }
        if (h01Var != null) {
            try {
                k01 k01Var = new k01(this.f20534b, 1, 1, this.f20536d.f15291a, this.f20535c);
                Parcel parcelQ = h01Var.q();
                rh.c(parcelQ, k01Var);
                Parcel parcelR = h01Var.r(parcelQ, 3);
                l01 l01Var = (l01) rh.b(parcelR, l01.CREATOR);
                parcelR.recycle();
                b(IronSourceConstants.errorCode_internal, j10, null);
                this.f20537e.put(l01Var);
            } catch (Throwable th2) {
                try {
                    b(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, j10, new Exception(th2));
                } finally {
                    a();
                    handlerThread.quit();
                }
            }
        }
    }

    @Override // k9.b
    public final void q(int i10) {
        try {
            b(4011, this.f20540h, null);
            this.f20537e.put(new l01());
        } catch (InterruptedException unused) {
        }
    }

    @Override // k9.c
    public final void r(ConnectionResult connectionResult) {
        try {
            b(4012, this.f20540h, null);
            this.f20537e.put(new l01());
        } catch (InterruptedException unused) {
        }
    }
}
