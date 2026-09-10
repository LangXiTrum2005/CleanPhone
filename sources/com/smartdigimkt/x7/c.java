package com.smartdigimkt.x7;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39953a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39954b = "";

    private c() {
    }

    public static c a() {
        return new c();
    }

    public String b() {
        return this.f39954b;
    }

    public String c() {
        return this.f39953a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpReqEntity{urlType='");
        sb.append(this.f39953a);
        sb.append("', interceptKey='");
        return android.support.v4.media.a.r(sb, this.f39954b, "'}");
    }

    public static c a(String str) {
        c cVar = new c();
        cVar.f39953a = str;
        return cVar;
    }

    public void b(String str) {
        this.f39954b = str;
    }

    public static c a(String str, String str2) {
        c cVar = new c();
        cVar.f39953a = str;
        cVar.f39954b = str2;
        return cVar;
    }
}
