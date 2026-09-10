package com.smartdigimkt.p2;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f37505e = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f37506a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.p2.a f37508c;
    private a d;

    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.smartdigimkt.p2.a f37509a;

        public a(long j, long j2) {
            super(j, j2);
        }

        public void a(com.smartdigimkt.p2.a aVar) {
            this.f37509a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.smartdigimkt.p2.a aVar = this.f37509a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            com.smartdigimkt.p2.a aVar = this.f37509a;
            if (aVar != null) {
                aVar.a(j);
            }
        }
    }

    public b a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f37507b = j;
        return this;
    }

    public b b(long j) {
        this.f37506a = j;
        return this;
    }

    public void c() {
        if (this.d == null) {
            b();
        }
        this.d.start();
    }

    public b a(com.smartdigimkt.p2.a aVar) {
        this.f37508c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
        if (this.f37507b <= 0) {
            this.f37507b = this.f37506a + 1000;
        }
        a aVar2 = new a(this.f37506a, this.f37507b);
        this.d = aVar2;
        aVar2.a(this.f37508c);
    }

    public void a(long j, com.smartdigimkt.p2.a aVar) {
        this.f37506a = j;
        this.f37508c = aVar;
        b();
        a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
    }
}
