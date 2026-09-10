package com.smartdigimkt.y1;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f40020e = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f40021a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.y1.a f40023c;
    private a d;

    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.smartdigimkt.y1.a f40024a;

        public a(long j, long j2) {
            super(j, j2);
        }

        public void a(com.smartdigimkt.y1.a aVar) {
            this.f40024a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.smartdigimkt.y1.a aVar = this.f40024a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            com.smartdigimkt.y1.a aVar = this.f40024a;
            if (aVar != null) {
                aVar.a(j);
            }
        }
    }

    public b a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f40022b = j;
        return this;
    }

    public b b(long j) {
        this.f40021a = j;
        return this;
    }

    public void c() {
        if (this.d == null) {
            b();
        }
        this.d.start();
    }

    public b a(com.smartdigimkt.y1.a aVar) {
        this.f40023c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
        if (this.f40022b <= 0) {
            this.f40022b = this.f40021a + 1000;
        }
        a aVar2 = new a(this.f40021a, this.f40022b);
        this.d = aVar2;
        aVar2.a(this.f40023c);
    }

    public void a() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
    }
}
