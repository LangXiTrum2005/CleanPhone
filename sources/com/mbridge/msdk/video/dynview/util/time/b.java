package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f37451a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f37453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f37454d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f37455a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f37455a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f37455a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f37455a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f37452b = j10;
        return this;
    }

    public b b(long j10) {
        this.f37451a = j10;
        return this;
    }

    public void c() {
        if (this.f37454d == null) {
            b();
        }
        this.f37454d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f37453c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.f37454d;
        if (aVar != null) {
            aVar.cancel();
            this.f37454d = null;
        }
        if (this.f37452b <= 0) {
            this.f37452b = this.f37451a + 1000;
        }
        a aVar2 = new a(this.f37451a, this.f37452b);
        this.f37454d = aVar2;
        aVar2.a(this.f37453c);
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f37451a = j10;
        this.f37453c = aVar;
        b();
        a aVar2 = this.f37454d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.f37454d;
        if (aVar != null) {
            aVar.cancel();
            this.f37454d = null;
        }
    }
}
