package com.smartdigimkt.y;

import android.text.TextUtils;
import com.smartdigimkt.x.d;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c implements Serializable {
    private static final String s = "FailureReason";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40007c;
    private Throwable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f40008e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40010i = -1;
    private String j;
    private HashMap<Object, Object> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f40011l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f40012n;
    private String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f40013p;
    private String q;
    private String r;

    public c(int i2) {
        this.f40005a = i2;
        this.f40006b = b.b(i2);
    }

    public void a(int i2) {
        this.f40005a = i2;
    }

    public String b(String str) {
        String strD = d() + " # ";
        int i2 = this.f40005a;
        if (i2 != -1) {
            strD = b.a(i2);
        }
        if (!TextUtils.isEmpty(this.f40007c)) {
            StringBuilder sbX = android.support.v4.media.a.x(strD, " # ");
            sbX.append(this.f40007c);
            strD = sbX.toString();
        }
        Throwable th = this.d;
        if (th != null) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                strD = android.support.v4.media.a.D(strD, " # ", message);
            }
        }
        return !TextUtils.isEmpty(str) ? android.support.v4.media.a.D(strD, " # ", str) : strD;
    }

    public Throwable c() {
        return this.d;
    }

    public int d() {
        return this.f40005a;
    }

    public int e() {
        return this.f40006b;
    }

    public void f(String str) {
        this.f40007c = str;
    }

    public String g() {
        return this.o;
    }

    public String h() {
        if (this.k == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<Object, Object> entry : this.k.entrySet()) {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        return "";
    }

    public void i(String str) {
        this.f = str;
    }

    public String j() {
        int i2;
        String strA = !TextUtils.isEmpty(this.f40007c) ? this.f40007c : "";
        if (TextUtils.isEmpty(strA) && (i2 = this.f40005a) != -1) {
            strA = b.a(i2);
        }
        Throwable th = this.d;
        if (th == null) {
            return strA;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) ? android.support.v4.media.a.D(strA, " # ", message) : strA;
    }

    public void k(String str) {
        this.q = str;
    }

    public String l() {
        return this.j;
    }

    public String m() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public int n() {
        return this.f40011l;
    }

    public String o() {
        return this.f40012n;
    }

    public int p() {
        return this.f40010i;
    }

    public String q() {
        return this.q;
    }

    public boolean r() {
        return this.f40013p;
    }

    public boolean s() {
        return this.f40009h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MBFailureReason{errorCode=");
        sb.append(this.f40005a);
        sb.append(", errorSubType=");
        sb.append(this.f40006b);
        sb.append(", message='");
        sb.append(this.f40007c);
        sb.append("', cause=");
        sb.append(this.d);
        sb.append(", campaign=");
        sb.append(this.f40008e);
        sb.append(", requestId='");
        sb.append(this.f);
        sb.append("', localRequestId='");
        sb.append(this.g);
        sb.append("', isHeaderBidding=");
        sb.append(this.f40009h);
        sb.append(", typeD=");
        sb.append(this.f40010i);
        sb.append(", reasonD='");
        sb.append(this.j);
        sb.append("', extraMap=");
        sb.append(this.k);
        sb.append(", serverErrorCode=");
        sb.append(this.f40011l);
        sb.append(", errorUrl='");
        sb.append(this.m);
        sb.append("', serverErrorResponse='");
        sb.append(this.f40012n);
        sb.append("', unitId='");
        sb.append(this.q);
        sb.append("', placementId='");
        return android.support.v4.media.a.r(sb, this.r, "'}");
    }

    public void a(Throwable th) {
        this.d = th;
    }

    public void c(int i2) {
        this.f40011l = i2;
    }

    public void d(int i2) {
        this.f40010i = i2;
    }

    public void e(String str) {
        this.g = str;
    }

    public String f() {
        return this.m;
    }

    public void g(String str) {
        this.r = str;
    }

    public String i() {
        return this.g;
    }

    public String k() {
        return this.r;
    }

    public void a(d dVar) {
        this.f40008e = dVar;
    }

    public void c(String str) {
        this.m = str;
    }

    public void d(String str) {
        this.o = str;
    }

    public void a(Object obj, Object obj2) {
        if (this.k == null) {
            this.k = new HashMap<>();
        }
        this.k.put(obj, obj2);
    }

    public c(int i2, String str) {
        this.f40005a = i2;
        if (!TextUtils.isEmpty(str)) {
            a(com.smartdigimkt.q0.b.M, str);
        }
        this.f40007c = str;
        this.f40006b = b.b(i2);
    }

    public void h(String str) {
        this.j = str;
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.k;
        if (map != null && map.containsKey(obj)) {
            return this.k.get(obj);
        }
        return null;
    }

    public void a(boolean z2) {
        this.f40013p = z2;
    }

    public c(int i2, int i3, String str) {
        if (!TextUtils.isEmpty(str)) {
            a(com.smartdigimkt.q0.b.M, str);
            this.f40007c = str;
        } else {
            this.f40007c = b.a(i3);
        }
        this.f40011l = i2;
        this.f40006b = b.b(i3);
    }

    public void j(String str) {
        this.f40012n = str;
    }

    public c(int i2, Throwable th, d dVar) {
        this.f40005a = i2;
        this.d = th;
        this.f40008e = dVar;
        this.f40006b = b.b(i2);
    }

    public c(int i2, String str, Throwable th, d dVar) {
        this.f40005a = i2;
        this.f40007c = str;
        this.d = th;
        this.f40008e = dVar;
        this.f40006b = b.b(i2);
    }

    public d b() {
        return this.f40008e;
    }

    public void b(boolean z2) {
        this.f40009h = z2;
    }

    public void b(int i2) {
        this.f40006b = i2;
    }
}
