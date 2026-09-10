package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.l;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f9590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f9591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f9592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f9593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f9597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f9598k;
    private final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f9600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f9601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w4.a f9602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f9603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f9604r;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0018a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f9605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f9606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f9607c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map f9609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        JSONObject f9610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f9611g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f9613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f9614j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f9615k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f9616m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f9617n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f9618o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f9619p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        w4.a f9620q;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f9612h = 1;
        boolean l = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Map f9608d = new HashMap();

        public C0018a(l lVar) {
            this.f9613i = ((Integer) lVar.a(z4.Y2)).intValue();
            this.f9614j = ((Integer) lVar.a(z4.X2)).intValue();
            this.f9616m = ((Boolean) lVar.a(z4.f10262u3)).booleanValue();
            this.f9617n = ((Boolean) lVar.a(z4.f10227p5)).booleanValue();
            this.f9620q = w4.a.a(((Integer) lVar.a(z4.f10236q5)).intValue());
            this.f9619p = ((Boolean) lVar.a(z4.Q5)).booleanValue();
        }

        public C0018a a(Map map) {
            this.f9609e = map;
            return this;
        }

        public C0018a b(String str) {
            this.f9606b = str;
            return this;
        }

        public C0018a c(String str) {
            this.f9605a = str;
            return this;
        }

        public C0018a d(boolean z10) {
            this.l = z10;
            return this;
        }

        public C0018a e(boolean z10) {
            this.f9616m = z10;
            return this;
        }

        public C0018a f(boolean z10) {
            this.f9618o = z10;
            return this;
        }

        public C0018a a(JSONObject jSONObject) {
            this.f9610f = jSONObject;
            return this;
        }

        public C0018a b(Map map) {
            this.f9608d = map;
            return this;
        }

        public C0018a c(int i10) {
            this.f9613i = i10;
            return this;
        }

        public C0018a a(String str) {
            this.f9607c = str;
            return this;
        }

        public C0018a b(int i10) {
            this.f9614j = i10;
            return this;
        }

        public C0018a c(boolean z10) {
            this.f9615k = z10;
            return this;
        }

        public C0018a a(Object obj) {
            this.f9611g = obj;
            return this;
        }

        public C0018a b(boolean z10) {
            this.f9619p = z10;
            return this;
        }

        public C0018a a(int i10) {
            this.f9612h = i10;
            return this;
        }

        public C0018a a(boolean z10) {
            this.f9617n = z10;
            return this;
        }

        public C0018a a(w4.a aVar) {
            this.f9620q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0018a c0018a) {
        this.f9588a = c0018a.f9606b;
        this.f9589b = c0018a.f9605a;
        this.f9590c = c0018a.f9608d;
        this.f9591d = c0018a.f9609e;
        this.f9592e = c0018a.f9610f;
        this.f9593f = c0018a.f9607c;
        this.f9594g = c0018a.f9611g;
        int i10 = c0018a.f9612h;
        this.f9595h = i10;
        this.f9596i = i10;
        this.f9597j = c0018a.f9613i;
        this.f9598k = c0018a.f9614j;
        this.l = c0018a.f9615k;
        this.f9599m = c0018a.l;
        this.f9600n = c0018a.f9616m;
        this.f9601o = c0018a.f9617n;
        this.f9602p = c0018a.f9620q;
        this.f9603q = c0018a.f9618o;
        this.f9604r = c0018a.f9619p;
    }

    public String a() {
        return this.f9593f;
    }

    public void b(String str) {
        this.f9588a = str;
    }

    public void c(String str) {
        this.f9589b = str;
    }

    public Object d() {
        return this.f9594g;
    }

    public w4.a e() {
        return this.f9602p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f9588a;
        if (str == null ? aVar.f9588a != null : !str.equals(aVar.f9588a)) {
            return false;
        }
        Map map = this.f9590c;
        if (map == null ? aVar.f9590c != null : !map.equals(aVar.f9590c)) {
            return false;
        }
        Map map2 = this.f9591d;
        if (map2 == null ? aVar.f9591d != null : !map2.equals(aVar.f9591d)) {
            return false;
        }
        String str2 = this.f9593f;
        if (str2 == null ? aVar.f9593f != null : !str2.equals(aVar.f9593f)) {
            return false;
        }
        String str3 = this.f9589b;
        if (str3 == null ? aVar.f9589b != null : !str3.equals(aVar.f9589b)) {
            return false;
        }
        JSONObject jSONObject = this.f9592e;
        if (jSONObject == null ? aVar.f9592e != null : !jSONObject.equals(aVar.f9592e)) {
            return false;
        }
        Object obj2 = this.f9594g;
        if (obj2 == null ? aVar.f9594g == null : obj2.equals(aVar.f9594g)) {
            return this.f9595h == aVar.f9595h && this.f9596i == aVar.f9596i && this.f9597j == aVar.f9597j && this.f9598k == aVar.f9598k && this.l == aVar.l && this.f9599m == aVar.f9599m && this.f9600n == aVar.f9600n && this.f9601o == aVar.f9601o && this.f9602p == aVar.f9602p && this.f9603q == aVar.f9603q && this.f9604r == aVar.f9604r;
        }
        return false;
    }

    public String f() {
        return this.f9588a;
    }

    public Map g() {
        return this.f9591d;
    }

    public String h() {
        return this.f9589b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f9588a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9593f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9589b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f9594g;
        int iB = ((((this.f9602p.b() + ((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f9595h) * 31) + this.f9596i) * 31) + this.f9597j) * 31) + this.f9598k) * 31) + (this.l ? 1 : 0)) * 31) + (this.f9599m ? 1 : 0)) * 31) + (this.f9600n ? 1 : 0)) * 31) + (this.f9601o ? 1 : 0)) * 31)) * 31) + (this.f9603q ? 1 : 0)) * 31) + (this.f9604r ? 1 : 0);
        Map map = this.f9590c;
        if (map != null) {
            iB = (iB * 31) + map.hashCode();
        }
        Map map2 = this.f9591d;
        if (map2 != null) {
            iB = (iB * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f9592e;
        if (jSONObject == null) {
            return iB;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray).hashCode() + (iB * 31);
    }

    public Map i() {
        return this.f9590c;
    }

    public int j() {
        return this.f9596i;
    }

    public int k() {
        return this.f9598k;
    }

    public int l() {
        return this.f9597j;
    }

    public boolean m() {
        return this.f9601o;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.f9604r;
    }

    public boolean p() {
        return this.f9599m;
    }

    public boolean q() {
        return this.f9600n;
    }

    public boolean r() {
        return this.f9603q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest {endpoint=");
        sb2.append(this.f9588a);
        sb2.append(", backupEndpoint=");
        sb2.append(this.f9593f);
        sb2.append(", httpMethod=");
        sb2.append(this.f9589b);
        sb2.append(", httpHeaders=");
        sb2.append(this.f9591d);
        sb2.append(", body=");
        sb2.append(this.f9592e);
        sb2.append(", emptyResponse=");
        sb2.append(this.f9594g);
        sb2.append(", initialRetryAttempts=");
        sb2.append(this.f9595h);
        sb2.append(", retryAttemptsLeft=");
        sb2.append(this.f9596i);
        sb2.append(", timeoutMillis=");
        sb2.append(this.f9597j);
        sb2.append(", retryDelayMillis=");
        sb2.append(this.f9598k);
        sb2.append(", exponentialRetries=");
        sb2.append(this.l);
        sb2.append(", retryOnAllErrors=");
        sb2.append(this.f9599m);
        sb2.append(", retryOnNoConnection=");
        sb2.append(this.f9600n);
        sb2.append(", encodingEnabled=");
        sb2.append(this.f9601o);
        sb2.append(", encodingType=");
        sb2.append(this.f9602p);
        sb2.append(", trackConnectionSpeed=");
        sb2.append(this.f9603q);
        sb2.append(", gzipBodyEncoding=");
        return defpackage.e.t(sb2, this.f9604r, '}');
    }

    public void a(String str) {
        this.f9593f = str;
    }

    public JSONObject b() {
        return this.f9592e;
    }

    public int c() {
        return this.f9595h - this.f9596i;
    }

    public void a(int i10) {
        this.f9596i = i10;
    }

    public static C0018a a(l lVar) {
        return new C0018a(lVar);
    }
}
