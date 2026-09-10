package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f20114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20115b = C.TIME_UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20116c = C.TIME_UNSET;

    public void a(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f20114a == null) {
            this.f20114a = exc;
        }
        if (this.f20115b == C.TIME_UNSET && r1.a0.f49222c0.get() <= 0) {
            this.f20115b = 200 + jElapsedRealtime;
        }
        long j10 = this.f20115b;
        if (j10 == C.TIME_UNSET || jElapsedRealtime < j10) {
            this.f20116c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f20114a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f20114a;
        this.f20114a = null;
        this.f20115b = C.TIME_UNSET;
        this.f20116c = C.TIME_UNSET;
        throw exc3;
    }

    public void b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f20114a == null) {
            this.f20114a = exc;
        }
        if (this.f20115b == C.TIME_UNSET && u12.Y.get() <= 0) {
            this.f20115b = 200 + jElapsedRealtime;
        }
        long j10 = this.f20115b;
        if (j10 == C.TIME_UNSET || jElapsedRealtime < j10) {
            this.f20116c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f20114a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f20114a;
        this.f20114a = null;
        this.f20115b = C.TIME_UNSET;
        this.f20116c = C.TIME_UNSET;
        throw exc3;
    }
}
