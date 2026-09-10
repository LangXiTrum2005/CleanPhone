package com.smartdigimkt.v3;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f39094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f39095b;

    public h(String str, String str2) {
        this.f39094a = str;
        this.f39095b = str2;
    }

    public String a() {
        return this.f39094a;
    }

    public String b() {
        return this.f39095b;
    }

    public String c() {
        StringBuilder sb = new StringBuilder("code[ ");
        sb.append(this.f39094a);
        sb.append(" ],desc[ ");
        return android.support.v4.media.a.r(sb, this.f39095b, " ]");
    }
}
