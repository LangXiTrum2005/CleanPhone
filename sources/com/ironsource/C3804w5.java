package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3804w5 {
    static final String e = "euid";
    static final String f = "esat";
    static final String g = "esfr";
    static final int h = 1;
    private int a;
    private long b;
    private int c;
    private final JSONObject d;

    public C3804w5(EnumC3821x5 enumC3821x5, JSONObject jSONObject) {
        this(enumC3821x5.b(), jSONObject);
    }

    public String a() {
        return this.d.toString();
    }

    public JSONObject b() {
        return this.d;
    }

    public int c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3804w5 c3804w5 = (C3804w5) obj;
        return this.a == c3804w5.a && this.b == c3804w5.b && this.c == c3804w5.c && C3708qa.a(this.d, c3804w5.d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + this.d.toString().hashCode()) * 31) + this.c;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }

    public C3804w5(int i, JSONObject jSONObject) {
        this(i, new InterfaceC3667o4.a().a(), jSONObject);
    }

    public void a(int i) {
        this.a = i;
    }

    public C3804w5(int i, long j, String str) throws JSONException {
        this(i, j, new JSONObject(str));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.d.put(str, obj);
        } catch (JSONException e2) {
            C3631m4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public C3804w5(EnumC3821x5 enumC3821x5, long j, JSONObject jSONObject) {
        this(enumC3821x5.b(), j, jSONObject);
    }

    public C3804w5(int i, long j, JSONObject jSONObject) {
        this.c = 1;
        this.a = i;
        this.b = j;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.d = jSONObject;
        if (!jSONObject.has(e)) {
            a(e, UUID.randomUUID().toString());
        }
        if (!jSONObject.has(f)) {
            a(f, Integer.valueOf(this.c));
        } else {
            this.c = jSONObject.optInt(f, 1);
        }
    }

    public void a(String str) {
        a(g, str);
        int i = this.c + 1;
        this.c = i;
        a(f, Integer.valueOf(i));
    }
}
