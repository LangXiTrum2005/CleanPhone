package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f37109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f37111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37112d = 0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f37113a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f37113a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f37113a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f37113a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public void a() {
        a aVar = this.f37111c;
        if (aVar != null) {
            aVar.cancel();
            this.f37111c = null;
        }
    }

    public b b(long j10) {
        this.f37112d = j10;
        return this;
    }

    public void c() {
        if (this.f37111c == null) {
            b();
        }
        this.f37111c.start();
    }

    public void b() {
        a aVar = this.f37111c;
        if (aVar != null) {
            aVar.cancel();
            this.f37111c = null;
        }
        if (this.f37110b <= 0) {
            this.f37110b = this.f37112d + 1000;
        }
        a aVar2 = new a(this.f37112d, this.f37110b);
        this.f37111c = aVar2;
        aVar2.a(this.f37109a);
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f37110b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f37109a = aVar;
        return this;
    }
}
