package com.smartdigimkt.r6;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38097c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38098e;
    private String f;

    public b(String str, String str2, boolean z2, long j, boolean z3) {
        this(str, str2, z2, j, z3, null);
    }

    public String a() {
        return this.d;
    }

    public boolean b() {
        return this.f38097c;
    }

    public long c() {
        return this.f38096b;
    }

    public String d() {
        return this.f38095a;
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.f38098e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ApkInspectResult{pkgName='");
        sb.append(this.f38095a);
        sb.append("', inspectTime=");
        sb.append(this.f38096b);
        sb.append(", inspectResult=");
        sb.append(this.f38097c);
        sb.append(", appVersion='");
        sb.append(this.d);
        sb.append("', isRealTimeInspect=");
        sb.append(this.f38098e);
        sb.append(", uploadKey='");
        return android.support.v4.media.a.r(sb, this.f, "'}");
    }

    public b(String str, String str2, boolean z2, long j, boolean z3, String str3) {
        this.f38095a = str;
        this.f = str2;
        this.f38098e = z2;
        this.f38096b = j;
        this.f38097c = z3;
        this.d = str3;
    }
}
