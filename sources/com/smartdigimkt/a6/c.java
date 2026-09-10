package com.smartdigimkt.a6;

import android.view.View;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    public static final int m = -999;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f33689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f33690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f33691c;
    int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f33692e;
    int f;
    int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f33693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33694i;
    private long j;
    public com.smartdigimkt.v3.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.smartdigimkt.w6.f f33695l;

    public c(com.smartdigimkt.w6.f fVar) {
        this.f33695l = fVar;
    }

    public static int b(int i2, int i3) {
        if (i2 == 4) {
            return 2;
        }
        switch (i2) {
            case 11:
                return (i3 == 15 || i3 == 16 || i3 == 21 || i3 == 48 || i3 == 45 || i3 == 46) ? 1 : 0;
            case 12:
            case 13:
                return 1;
            default:
                return 0;
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f33689a = i2;
        this.f33690b = i3;
        this.f33692e = i4;
        this.f = i5;
        this.f33694i = System.currentTimeMillis();
        if (this.f33691c == 0 && this.d == 0 && this.g == 0 && this.f33693h == 0 && this.j == 0) {
            this.f33691c = i2;
            this.d = i3;
            this.g = i4;
            this.f33693h = i5;
            this.j = System.currentTimeMillis() + ((long) (new Random().nextInt(10) + 5));
        }
    }

    public void c(View view) {
        b(view);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.f33691c = i2;
        this.d = i3;
        this.g = i4;
        this.f33693h = i5;
        this.j = System.currentTimeMillis();
    }

    private void b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0) {
            width = com.smartdigimkt.n8.c.j(com.smartdigimkt.m6.b.p().k());
            i3 = 0;
        }
        if (height == 0) {
            height = com.smartdigimkt.n8.c.i(com.smartdigimkt.m6.b.p().k());
        } else {
            i2 = i4;
        }
        int iB = b(width);
        int iB2 = b(height);
        int i5 = i3 + iB;
        int i6 = i2 + iB2;
        int iRandom = ((int) (Math.random() * 15.0d)) + i5;
        int iRandom2 = ((int) (Math.random() * 15.0d)) + i6;
        a(i5, i6, iB, iB2);
        b(iRandom, iRandom2, iRandom - i3, iRandom2 - i2);
    }

    public com.smartdigimkt.v3.a a(int i2) {
        return a(0, i2);
    }

    public com.smartdigimkt.v3.a a(int i2, int i3) {
        com.smartdigimkt.v3.a aVar = new com.smartdigimkt.v3.a();
        aVar.f39061a = this.f33689a;
        aVar.f39062b = this.f33690b;
        aVar.f39063c = this.f33691c;
        aVar.d = this.d;
        aVar.f39064e = this.f33692e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.f39065h = this.f33693h;
        aVar.k = this.f33694i;
        aVar.f39067l = this.j;
        aVar.f39068n = i2;
        aVar.o = i3;
        if (i2 == 2) {
            aVar.m = com.smartdigimkt.t4.a.a().b();
        }
        aVar.f39069p = this.k;
        return aVar;
    }

    private int b(int i2) {
        Random random = new Random();
        if (i2 <= 0) {
            return 0;
        }
        double d = i2;
        int i3 = (int) (0.1d * d);
        return random.nextInt((((int) (d * 0.9d)) - i3) + 1) + i3;
    }

    public com.smartdigimkt.v3.a a(View view, int i2, int i3) {
        com.smartdigimkt.w6.f fVar;
        int iB = b(i2, i3);
        if (i2 == 4 && (fVar = this.f33695l) != null && fVar.e0() == 1) {
            this.k = a(view);
        }
        if (i2 == 5 || i2 == 6 || i2 == 7) {
            b(view);
            iB = 0;
        }
        return a(iB, i3);
    }

    private com.smartdigimkt.v3.a a(View view) {
        c cVar = new c(this.f33695l);
        cVar.b(view);
        return cVar.a(0, 13);
    }
}
