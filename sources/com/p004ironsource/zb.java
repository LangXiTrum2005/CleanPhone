package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class zb {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f27880e = "euid";
    static final String f = "esat";
    static final String g = "esfr";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f27881h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f27883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27884c;
    private final JSONObject d;

    public zb(int i2, long j, String str) throws JSONException {
        this(i2, j, new JSONObject(str));
    }

    public String a() {
        return this.d.toString();
    }

    public JSONObject b() {
        return this.d;
    }

    public int c() {
        return this.f27882a;
    }

    public long d() {
        return this.f27883b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zb zbVar = (zb) obj;
        return this.f27882a == zbVar.f27882a && this.f27883b == zbVar.f27883b && this.f27884c == zbVar.f27884c && C3353el.a(this.d, zbVar.d);
    }

    public int hashCode() {
        return ((this.d.toString().hashCode() + a.b(Integer.hashCode(this.f27882a) * 31, 31, this.f27883b)) * 31) + this.f27884c;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", IOUtils.LINE_SEPARATOR_UNIX);
    }

    public zb(int i2, long j, JSONObject jSONObject) {
        this.f27884c = 1;
        this.f27882a = i2;
        this.f27883b = j;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.d = jSONObject;
        if (!jSONObject.has(f27880e)) {
            a(f27880e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f)) {
            this.f27884c = jSONObject.optInt(f, 1);
        } else {
            a(f, Integer.valueOf(this.f27884c));
        }
    }

    public void a(int i2) {
        this.f27882a = i2;
    }

    public zb(int i2, JSONObject jSONObject) {
        this(i2, new s9.a().a(), jSONObject);
    }

    public void a(String str) {
        a(g, str);
        int i2 = this.f27884c + 1;
        this.f27884c = i2;
        a(f, Integer.valueOf(i2));
    }

    public zb(ac acVar, long j, JSONObject jSONObject) {
        this(acVar.getId(), j, jSONObject);
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.d.put(str, obj);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public zb(ac acVar, JSONObject jSONObject) {
        this(acVar.getId(), jSONObject);
    }
}
