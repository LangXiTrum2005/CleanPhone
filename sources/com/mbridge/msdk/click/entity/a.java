package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31655h;

    public String a() {
        return "statusCode=" + this.f31653f + ", location=" + this.f31648a + ", contentType=" + this.f31649b + ", contentLength=" + this.f31652e + ", contentEncoding=" + this.f31650c + ", referer=" + this.f31651d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClickResponseHeader{location='");
        sb2.append(this.f31648a);
        sb2.append("', contentType='");
        sb2.append(this.f31649b);
        sb2.append("', contentEncoding='");
        sb2.append(this.f31650c);
        sb2.append("', referer='");
        sb2.append(this.f31651d);
        sb2.append("', contentLength=");
        sb2.append(this.f31652e);
        sb2.append(", statusCode=");
        sb2.append(this.f31653f);
        sb2.append(", url='");
        sb2.append(this.f31654g);
        sb2.append("', exception='");
        return e.q(this.f31655h, "'}", sb2);
    }
}
