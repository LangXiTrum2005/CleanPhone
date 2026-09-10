package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0654x5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f31039e = "euid";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f31040f = "esat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f31041g = "esfr";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f31042h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f31046d;

    public C0654x5(EnumC0672y5 enumC0672y5, JSONObject jSONObject) {
        this(enumC0672y5.b(), jSONObject);
    }

    public String a() {
        return this.f31046d.toString();
    }

    public JSONObject b() {
        return this.f31046d;
    }

    public int c() {
        return this.f31043a;
    }

    public long d() {
        return this.f31044b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0654x5 c0654x5 = (C0654x5) obj;
        return this.f31043a == c0654x5.f31043a && this.f31044b == c0654x5.f31044b && this.f31045c == c0654x5.f31045c && C0587ta.a(this.f31046d, c0654x5.f31046d);
    }

    public int hashCode() {
        return ((this.f31046d.toString().hashCode() + com.applovin.impl.ca.j(this.f31044b, Integer.hashCode(this.f31043a) * 31, 31)) * 31) + this.f31045c;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }

    public C0654x5(int i10, JSONObject jSONObject) {
        this(i10, new InterfaceC0510p4.a().a(), jSONObject);
    }

    public void a(int i10) {
        this.f31043a = i10;
    }

    public C0654x5(int i10, long j10, String str) throws JSONException {
        this(i10, j10, new JSONObject(str));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f31046d.put(str, obj);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C0654x5(EnumC0672y5 enumC0672y5, long j10, JSONObject jSONObject) {
        this(enumC0672y5.b(), j10, jSONObject);
    }

    public C0654x5(int i10, long j10, JSONObject jSONObject) {
        this.f31045c = 1;
        this.f31043a = i10;
        this.f31044b = j10;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f31046d = jSONObject;
        if (!jSONObject.has(f31039e)) {
            a(f31039e, UUID.randomUUID().toString());
        }
        if (!jSONObject.has(f31040f)) {
            a(f31040f, Integer.valueOf(this.f31045c));
        } else {
            this.f31045c = jSONObject.optInt(f31040f, 1);
        }
    }

    public void a(String str) {
        a(f31041g, str);
        int i10 = this.f31045c + 1;
        this.f31045c = i10;
        a(f31040f, Integer.valueOf(i10));
    }
}
