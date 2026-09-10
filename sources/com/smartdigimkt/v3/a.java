package com.smartdigimkt.v3;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39063c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39064e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39066i;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f39067l;
    public float[] m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f39069p;
    public int j = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39068n = 0;
    public int o = 13;

    /* JADX INFO: renamed from: com.smartdigimkt.v3.a$a, reason: collision with other inner class name */
    public static class C0631a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f39070a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39071b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f39072c = 3;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f39073a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39074b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f39075c = 2;
        public static final int d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f39076e = 4;
    }

    public boolean a() {
        return this.f39061a > 0 || this.f39062b > 0 || this.f39063c > 0 || this.d > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdClickRecord{clickDownX=");
        sb.append(this.f39061a);
        sb.append(", clickDownY=");
        sb.append(this.f39062b);
        sb.append(", clickUpX=");
        sb.append(this.f39063c);
        sb.append(", clickUpY=");
        sb.append(this.d);
        sb.append(", clickRelateDownX=");
        sb.append(this.f39064e);
        sb.append(", clickRelateDownY=");
        sb.append(this.f);
        sb.append(", clickRelateUpX=");
        sb.append(this.g);
        sb.append(", clickRelateUpY=");
        sb.append(this.f39065h);
        sb.append(", isDeeplinkClick=");
        sb.append(this.f39066i);
        sb.append(", downloadType=");
        sb.append(this.j);
        sb.append(", clickDownTimeMs=");
        sb.append(this.k);
        sb.append(", clickUpTimeMs=");
        sb.append(this.f39067l);
        sb.append(", trackingClickType=");
        sb.append(this.f39068n);
        sb.append(", shakeMaxAccValues=");
        sb.append(this.m);
        sb.append(", innerAdClickRecord=[");
        a aVar = this.f39069p;
        return android.support.v4.media.a.r(sb, aVar == null ? AbstractJsonLexerKt.NULL : aVar.toString(), "]}");
    }
}
