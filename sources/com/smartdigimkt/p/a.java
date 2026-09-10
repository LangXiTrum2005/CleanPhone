package com.smartdigimkt.p;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37476c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37477e;
    public int f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37478h;

    public String a() {
        return "statusCode=" + this.f + ", location=" + this.f37474a + ", contentType=" + this.f37475b + ", contentLength=" + this.f37477e + ", contentEncoding=" + this.f37476c + ", referer=" + this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClickResponseHeader{location='");
        sb.append(this.f37474a);
        sb.append("', contentType='");
        sb.append(this.f37475b);
        sb.append("', contentEncoding='");
        sb.append(this.f37476c);
        sb.append("', referer='");
        sb.append(this.d);
        sb.append("', contentLength=");
        sb.append(this.f37477e);
        sb.append(", statusCode=");
        sb.append(this.f);
        sb.append(", url='");
        sb.append(this.g);
        sb.append("', exception='");
        return android.support.v4.media.a.r(sb, this.f37478h, "'}");
    }
}
