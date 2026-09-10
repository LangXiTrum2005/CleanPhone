package com.thinkup.core.common.ooo;

import android.os.CountDownTimer;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0m {
    private static final String o = "CountDownTimerExt";
    private CountDownTimer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f42344n;
    private boolean o0 = true;
    private long om;
    private long oo;

    private o0m(long j, long j2) {
        this.f42344n = j2;
        this.oo = j;
        this.om = j;
    }

    private void m(long j) {
        this.oo = j;
    }

    private void m0() {
        if (this.o0) {
            return;
        }
        try {
            this.m.cancel();
        } catch (Throwable unused) {
        }
        this.o0 = true;
    }

    private boolean mm() {
        return !this.o0;
    }

    private void mo() throws Throwable {
        if (this.o0) {
            o(this.om, this.f42344n);
        }
    }

    private void o(boolean z2) {
        this.o0 = z2;
    }

    private boolean o0() {
        return this.o0;
    }

    private long om() {
        return this.om;
    }

    private void on() throws Throwable {
        o(this.om, this.f42344n);
    }

    private long oo() {
        return this.oo;
    }

    public abstract void m();

    public abstract void n();

    public final void o(long j) {
        this.om = j;
    }

    private void o(long j, long j2, long j3) throws Throwable {
        this.oo = j;
        this.om = j2;
        this.f42344n = j3;
        o(j2, j3);
    }

    private synchronized void o(long j, long j2) throws Throwable {
        Throwable th;
        try {
            try {
                this.om = j;
                this.f42344n = j2;
                if (this.oo > 0 && j2 > 0) {
                    if (!this.o0) {
                        try {
                            o();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    if (this.o0) {
                        CountDownTimer countDownTimer = new CountDownTimer(this.om, this.f42344n) { // from class: com.thinkup.core.common.ooo.o0m.1
                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                o0m.this.o();
                            }

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j3) {
                                o0m.this.o(j3);
                            }
                        };
                        this.m = countDownTimer;
                        try {
                            countDownTimer.start();
                        } catch (Throwable unused) {
                        }
                        this.o0 = false;
                        return;
                    }
                    Log.d(o, "ignore start");
                    return;
                }
                Log.d(o, "invalid parameter");
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final void o() {
        try {
            this.m.cancel();
        } catch (Throwable unused) {
        }
        this.o0 = true;
        this.om = this.oo;
    }
}
