package com.smartdigimkt.l8;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36447c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36448e;
    private String f;

    public static c a() {
        return new c();
    }

    public void b(String str) {
        this.f36446b = str;
    }

    public int c() {
        return this.d;
    }

    public void d(String str) {
        this.f36445a = str;
    }

    public String e() {
        return this.f36446b;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.f36445a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EcpmEncDecInfo{uniqueId='");
        sb.append(this.f36445a);
        sb.append("', ecpmEncryptInfo='");
        sb.append(this.f36446b);
        sb.append("', ecpmEncPubKey='");
        sb.append(this.f36447c);
        sb.append("', ecpmDecPvtKeyServerId=");
        sb.append(this.d);
        sb.append(", ecpmDecPvtKeyClientId=");
        sb.append(this.f36448e);
        sb.append(", ecpmRmbEncryptInfo='");
        return android.support.v4.media.a.r(sb, this.f, "'}");
    }

    public void a(String str) {
        this.f36447c = str;
    }

    public void b(int i2) {
        this.d = i2;
    }

    public void c(String str) {
        this.f = str;
    }

    public String d() {
        return this.f36447c;
    }

    public void a(int i2) {
        this.f36448e = i2;
    }

    public int b() {
        return this.f36448e;
    }
}
