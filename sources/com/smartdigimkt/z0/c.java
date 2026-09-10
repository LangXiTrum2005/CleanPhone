package com.smartdigimkt.z0;

import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.v0.n;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static final String k = "2000067";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f40290l = "2000068";
    public static final String m = "2000069";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40293c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f40294e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f40295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40296i;
    private boolean j;

    private c() {
    }

    public static c b() {
        return new c();
    }

    public c a(boolean z2) {
        this.j = z2;
        return this;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.f40291a;
    }

    public String e() {
        return this.g;
    }

    public String f() {
        return this.f40293c;
    }

    public c g(String str) {
        this.f = str;
        return this;
    }

    public c h(String str) {
        this.f40292b = str;
        return this;
    }

    public String i() {
        return this.f;
    }

    public int j() {
        return this.f40296i;
    }

    public String k() {
        return this.f40292b;
    }

    public c a(String str) {
        this.d = str;
        return this;
    }

    public c b(String str) {
        this.f40291a = str;
        return this;
    }

    public c c(String str) {
        this.g = str;
        return this;
    }

    public c d(String str) {
        this.f40293c = str;
        return this;
    }

    public c e(String str) {
        this.f40295h = str;
        return this;
    }

    public c f(String str) {
        this.f40294e = str;
        return this;
    }

    public String g() {
        return this.f40295h;
    }

    public String h() {
        return this.f40294e;
    }

    public c a(int i2) {
        this.f40296i = i2;
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f40292b)) {
            sb.append("unit_id=");
            sb.append(this.f40292b);
            sb.append(d9.i.f24749c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            sb.append("cid=");
            sb.append(this.d);
            sb.append(d9.i.f24749c);
        }
        if (!TextUtils.isEmpty(this.f40294e)) {
            sb.append("rid=");
            sb.append(this.f40294e);
            sb.append(d9.i.f24749c);
        }
        if (!TextUtils.isEmpty(this.f)) {
            sb.append("rid_n=");
            sb.append(this.f);
            sb.append(d9.i.f24749c);
        }
        if (!TextUtils.isEmpty(this.g)) {
            sb.append("creative_id=");
            sb.append(this.g);
            sb.append(d9.i.f24749c);
        }
        if (!TextUtils.isEmpty(this.f40295h)) {
            sb.append("reason=");
            sb.append(this.f40295h);
            sb.append(d9.i.f24749c);
        }
        if (this.f40296i != 0) {
            sb.append("result=");
            sb.append(this.f40296i);
            sb.append(d9.i.f24749c);
        }
        if (this.j) {
            sb.append("hb=1&");
        }
        sb.append("network_type=");
        sb.append(n.h(com.smartdigimkt.m6.b.p().k()));
        sb.append(d9.i.f24749c);
        if (!TextUtils.isEmpty(this.f40291a)) {
            sb.append("key=");
            sb.append(this.f40291a);
        }
        return sb.toString();
    }
}
