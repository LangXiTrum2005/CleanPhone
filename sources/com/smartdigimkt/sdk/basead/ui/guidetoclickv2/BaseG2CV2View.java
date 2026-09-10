package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseG2CV2View extends RelativeLayout {
    private long e0;
    protected c f0;
    private long g0;
    protected Runnable h0;
    protected com.smartdigimkt.w5.c.a i0;
    private boolean j0;
    private boolean k0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseG2CV2View.this.a();
        }
    }

    public class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38489b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f38490c = 2;
        public static final int d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f38491e = 4;
        public static final int f = 5;
        public static final int g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f38492h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f38493i = 8;
        public static final int j = 9;
        public static final int k = 10;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f38494l = 11;
        public static final int m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f38495n = 13;

        public b() {
        }
    }

    public interface c {
        void a();

        void b();
    }

    public BaseG2CV2View(Context context) {
        this(context, null);
    }

    public void a() {
        if (this.f0 == null || this.j0 || !canStartNextAnim()) {
            return;
        }
        this.j0 = true;
        this.f0.b();
        b();
    }

    public abstract void a(int i2, int i3);

    public void b() {
    }

    public void c() {
    }

    public boolean canStartNextAnim() {
        return true;
    }

    public void init(long j, int i2, int i3, com.smartdigimkt.w5.c.a aVar, c cVar) {
        this.e0 = j;
        this.i0 = aVar;
        this.f0 = cVar;
        this.j0 = false;
        this.h0 = new a();
        a(i2, i3);
    }

    public void pauseAnimPlay() {
        if (this.k0) {
            this.k0 = false;
            long j = this.e0;
            if (j > 0) {
                this.e0 = Math.max(j - (SystemClock.elapsedRealtime() - this.g0), 0L);
            }
            com.smartdigimkt.l7.b.a().a(this.h0);
            b();
        }
    }

    public void release() {
    }

    public void resumeAnimPlay() {
        if (this.k0) {
            return;
        }
        this.k0 = true;
        this.g0 = SystemClock.elapsedRealtime();
        if (this.e0 <= 0) {
            this.f0.b();
        } else {
            c();
            com.smartdigimkt.l7.b.a().b(this.h0, this.e0);
        }
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = 5000L;
        this.k0 = false;
    }
}
