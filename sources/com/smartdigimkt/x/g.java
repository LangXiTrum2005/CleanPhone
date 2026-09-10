package com.smartdigimkt.x;

import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f39715A = "exception";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f39716B = "header";
    public static final String C = "content";
    public static final String D = "network_type";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f39717E = "rid";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f39718F = "key";
    public static final String G = "rid_n";
    public static final String H = "unit_id";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f39719I = "landing_type";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f39720J = "link_type";
    public static final String K = "click_time";
    public static final String L = "market_result";
    public static final String M = "2000013";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f39721N = "2000012";
    public static final String s = "cid";
    public static final String t = "click_type";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f39722u = "network_type";
    public static final String v = "network_str";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f39723w = "click_duration";
    public static final String x = "last_url";
    public static final String y = "type";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f39724z = "code";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39727c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f39728e;
    private int f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f39729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f39730i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f39731l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39732n;
    private String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39733p;
    private String q;
    private int r;

    public g() {
    }

    public void a(int i2) {
        this.k = i2;
    }

    public String b() {
        return this.o;
    }

    public int c() {
        return this.k;
    }

    public void d(int i2) {
        this.m = i2;
    }

    public void e(int i2) {
        this.f39732n = i2;
    }

    public void f(int i2) {
        this.r = i2;
    }

    public void g(int i2) {
        this.f39733p = i2;
    }

    public void h(String str) {
        this.q = str;
    }

    public int i() {
        return this.f39725a;
    }

    public void j(String str) {
        this.f39731l = str;
    }

    public String k() {
        return this.f39728e;
    }

    public int l() {
        return this.f39732n;
    }

    public int m() {
        return this.r;
    }

    public String n() {
        return this.q;
    }

    public int o() {
        return this.f39733p;
    }

    public String p() {
        return this.f39726b;
    }

    public int q() {
        return this.j;
    }

    public String r() {
        return this.f39731l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClickTime [campaignId=");
        sb.append(this.f39727c);
        sb.append(", click_duration=");
        sb.append(this.d);
        sb.append(", lastUrl=");
        sb.append(this.f39728e);
        sb.append(", code=");
        sb.append(this.f);
        sb.append(", excepiton=");
        sb.append(this.g);
        sb.append(", header=");
        sb.append(this.f39729h);
        sb.append(", content=");
        sb.append(this.f39730i);
        sb.append(", type=");
        sb.append(this.j);
        sb.append(", click_type=");
        return android.support.v4.media.a.i(this.k, d9.i.f24752e, sb);
    }

    public g(String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, int i3, int i4, String str8, int i5, int i6, String str9, int i7, int i8, String str10) {
        this.f39726b = str;
        this.f39727c = str2;
        this.d = str3;
        this.f39728e = str4;
        this.f = i2;
        this.g = str5;
        this.f39729h = str6;
        this.f39730i = str7;
        this.j = i3;
        this.k = i4;
        this.f39731l = str8;
        this.m = i5;
        this.f39732n = i6;
        this.o = str9;
        this.f39733p = i7;
        this.q = str10;
        this.r = i8;
    }

    public String a() {
        return this.f39727c;
    }

    public void b(String str) {
        this.o = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.f39730i = str;
    }

    public void e(String str) {
        this.g = str;
    }

    public void f(String str) {
        this.f39729h = str;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.f39729h;
    }

    public void i(String str) {
        this.f39726b = str;
    }

    public int j() {
        return this.m;
    }

    public void a(String str) {
        this.f39727c = str;
    }

    public void b(int i2) {
        this.f = i2;
    }

    public void c(int i2) {
        this.f39725a = i2;
    }

    public String d() {
        return this.d;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.f39730i;
    }

    public void g(String str) {
        this.f39728e = str;
    }

    public void h(int i2) {
        this.j = i2;
    }

    public static String a(List<g> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (g gVar : list) {
            sb.append("rid_n=" + gVar.p());
            sb.append("&cid=" + gVar.a());
            sb.append("&click_type=" + gVar.c());
            sb.append("&type=" + gVar.q());
            sb.append("&click_duration=" + gVar.d());
            sb.append("&key=2000013");
            sb.append("&unit_id=" + gVar.r());
            sb.append("&last_url=" + gVar.k());
            sb.append("&content=" + gVar.f());
            sb.append("&code=" + gVar.e());
            sb.append("&exception=" + gVar.g());
            sb.append("&header=" + gVar.h());
            sb.append("&landing_type=" + gVar.j());
            sb.append("&link_type=" + gVar.l());
            sb.append("&click_time=" + gVar.b() + IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public static String a(g gVar) {
        if (gVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String strK = gVar.k();
        sb.append("rid_n=" + gVar.p());
        sb.append("&click_type=" + gVar.c());
        sb.append("&type=" + gVar.q());
        sb.append("&cid=" + gVar.a());
        sb.append("&click_duration=" + gVar.d());
        sb.append("&key=2000012");
        sb.append("&unit_id=" + gVar.r());
        sb.append("&last_url=" + strK);
        sb.append("&code=" + gVar.e());
        sb.append("&exception=" + gVar.g());
        sb.append("&landing_type=" + gVar.j());
        sb.append("&link_type=" + gVar.l());
        sb.append("&click_time=" + gVar.b() + IOUtils.LINE_SEPARATOR_UNIX);
        return sb.toString();
    }
}
