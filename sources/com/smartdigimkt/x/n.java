package com.smartdigimkt.x;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static final String k = "key";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f39789l = "time";
    public static final String m = "ad_source_id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f39790n = "num";
    public static final String o = "unit_id";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f39791p = "fb";
    public static final String q = "timeout";
    public static final String r = "network_type";
    public static final String s = "network_str";
    public static final String t = "2000006";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f39792u = "hb";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39795c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39796e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f39797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39798i;
    private String j;

    public n(int i2, String str, int i3, String str2, int i4, int i5, int i6) {
        this.f39793a = i2;
        this.f39794b = str;
        this.f39795c = i3;
        this.d = str2;
        this.f39796e = i4;
        this.f = i5;
        this.g = i6;
    }

    public int a() {
        return this.f39793a;
    }

    public int b() {
        return this.f39796e;
    }

    public void c(int i2) {
        this.f39798i = i2;
    }

    public void d(String str) {
        this.d = str;
    }

    public void e(int i2) {
        this.f39795c = i2;
    }

    public int f() {
        return this.f39795c;
    }

    public String g() {
        return this.f39794b;
    }

    public int h() {
        return this.f;
    }

    public String i() {
        return this.d;
    }

    public int j() {
        return this.f39798i;
    }

    public void a(int i2) {
        this.f39793a = i2;
    }

    public void b(int i2) {
        this.f39796e = i2;
    }

    public void c(String str) {
        this.f39794b = str;
    }

    public void d(int i2) {
        this.g = i2;
    }

    public int e() {
        return this.g;
    }

    public void f(int i2) {
        this.f = i2;
    }

    public void a(String str) {
        this.j = str;
    }

    public void b(String str) {
        this.f39797h = str;
    }

    public String c() {
        return this.j;
    }

    public String d() {
        return this.f39797h;
    }

    public static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("ad_source_id=" + nVar.a());
            stringBuffer.append("&time=" + nVar.g());
            stringBuffer.append("&num=" + nVar.f());
            stringBuffer.append("&unit_id=" + nVar.i());
            stringBuffer.append("&key=2000006");
            stringBuffer.append("&fb=" + nVar.b());
            if (nVar.j() == 1) {
                stringBuffer.append("&hb=1");
            }
            stringBuffer.append("&timeout=" + nVar.h() + IOUtils.LINE_SEPARATOR_UNIX);
        }
        return stringBuffer.toString();
    }

    public n() {
    }
}
