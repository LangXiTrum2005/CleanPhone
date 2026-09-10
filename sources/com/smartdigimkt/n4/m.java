package com.smartdigimkt.n4;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements d, a0<Object> {
    public static final long k = 1000000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f37014l = 2000;
    private static final int m = 2000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f37015n = 524288;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f37016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a f37017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.p4.y f37018c;
    private final com.smartdigimkt.p4.c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37019e;
    private long f;
    private long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37021i;
    private long j;

    public class a implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ long f37022Y;
        final /* synthetic */ long Z;

        public a(int i2, long j, long j2) {
            this.X = i2;
            this.f37022Y = j;
            this.Z = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f37017b.b(this.X, this.f37022Y, this.Z);
        }
    }

    public /* synthetic */ m(Handler handler, d.a aVar, long j, int i2, com.smartdigimkt.p4.c cVar, a aVar2) {
        this(handler, aVar, j, i2, cVar);
    }

    public m() {
        this(null, null, 1000000L, 2000, com.smartdigimkt.p4.c.f37520a);
    }

    @Override // com.smartdigimkt.n4.d
    public synchronized long a() {
        return this.j;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f37023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d.a f37024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f37025c = 1000000;
        private int d = 2000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.smartdigimkt.p4.c f37026e = com.smartdigimkt.p4.c.f37520a;

        public b a(Handler handler, d.a aVar) {
            com.smartdigimkt.p4.a.a((handler == null || aVar == null) ? false : true);
            this.f37023a = handler;
            this.f37024b = aVar;
            return this;
        }

        public b a(int i2) {
            this.d = i2;
            return this;
        }

        public b a(long j) {
            this.f37025c = j;
            return this;
        }

        public b a(com.smartdigimkt.p4.c cVar) {
            this.f37026e = cVar;
            return this;
        }

        public m a() {
            return new m(this.f37023a, this.f37024b, this.f37025c, this.d, this.f37026e, null);
        }
    }

    @Deprecated
    public m(Handler handler, d.a aVar) {
        this(handler, aVar, 1000000L, 2000, com.smartdigimkt.p4.c.f37520a);
    }

    @Override // com.smartdigimkt.n4.a0
    public synchronized void a(Object obj, k kVar) {
        try {
            if (this.f37019e == 0) {
                this.f = this.d.b();
            }
            this.f37019e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public m(Handler handler, d.a aVar, int i2) {
        this(handler, aVar, 1000000L, i2, com.smartdigimkt.p4.c.f37520a);
    }

    private m(Handler handler, d.a aVar, long j, int i2, com.smartdigimkt.p4.c cVar) {
        this.f37016a = handler;
        this.f37017b = aVar;
        this.f37018c = new com.smartdigimkt.p4.y(i2);
        this.d = cVar;
        this.j = j;
    }

    @Override // com.smartdigimkt.n4.a0
    public synchronized void a(Object obj, int i2) {
        this.g += (long) i2;
    }

    @Override // com.smartdigimkt.n4.a0
    public synchronized void a(Object obj) throws Throwable {
        Throwable th;
        try {
            try {
                com.smartdigimkt.p4.a.b(this.f37019e > 0);
                long jB = this.d.b();
                int i2 = (int) (jB - this.f);
                long j = i2;
                this.f37020h += j;
                long j2 = this.f37021i;
                long j3 = this.g;
                this.f37021i = j2 + j3;
                if (i2 > 0) {
                    try {
                        this.f37018c.a((int) Math.sqrt(j3), (8000 * j3) / j);
                        if (this.f37020h >= 2000 || this.f37021i >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                            this.j = (long) this.f37018c.a(0.5f);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                a(i2, this.g, this.j);
                int i3 = this.f37019e - 1;
                this.f37019e = i3;
                if (i3 > 0) {
                    this.f = jB;
                }
                this.g = 0L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private void a(int i2, long j, long j2) {
        Handler handler = this.f37016a;
        if (handler == null || this.f37017b == null) {
            return;
        }
        handler.post(new a(i2, j, j2));
    }
}
