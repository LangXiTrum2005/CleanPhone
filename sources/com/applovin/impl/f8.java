package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C0594u;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f8 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f7938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f7939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f7940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7944g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        Progressive,
        Streaming
    }

    private f8() {
    }

    public static f8 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = q8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                lVar.Q();
                if (!com.applovin.impl.sdk.p.a()) {
                    return null;
                }
                lVar.Q().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            f8 f8Var = new f8();
            f8Var.f7938a = uri;
            f8Var.f7939b = uri;
            f8Var.f7944g = a(q8Var);
            f8Var.f7940c = a((String) q8Var.a().get(C0594u.f30743g));
            f8Var.f7943f = StringUtils.parseInt((String) q8Var.a().get("height"));
            f8Var.f7942e = StringUtils.parseInt((String) q8Var.a().get("width"));
            f8Var.f7941d = ((String) q8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return f8Var;
        } catch (Throwable th2) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastVideoFile", "Error occurred while initializing", th2);
            }
            lVar.E().a("VastVideoFile", th2);
            return null;
        }
    }

    public long b() {
        return this.f7944g;
    }

    public String c() {
        return this.f7941d;
    }

    public Uri d() {
        return this.f7938a;
    }

    public Uri e() {
        return this.f7939b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        if (this.f7942e != f8Var.f7942e || this.f7943f != f8Var.f7943f || this.f7944g != f8Var.f7944g) {
            return false;
        }
        Uri uri = this.f7938a;
        if (uri == null ? f8Var.f7938a != null : !uri.equals(f8Var.f7938a)) {
            return false;
        }
        Uri uri2 = this.f7939b;
        if (uri2 == null ? f8Var.f7939b != null : !uri2.equals(f8Var.f7939b)) {
            return false;
        }
        if (this.f7940c != f8Var.f7940c) {
            return false;
        }
        String str = this.f7941d;
        if (str != null) {
            return str.equals(f8Var.f7941d);
        }
        return f8Var.f7941d == null;
    }

    public int hashCode() {
        Uri uri = this.f7938a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f7939b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f7940c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f7941d;
        return Long.valueOf(this.f7944g).hashCode() + ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f7942e) * 31) + this.f7943f) * 31);
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f7938a + ", videoUri=" + this.f7939b + ", deliveryType=" + this.f7940c + ", fileType='" + this.f7941d + "', width=" + this.f7942e + ", height=" + this.f7943f + ", bitrate=" + this.f7944g + '}';
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(q8 q8Var) {
        Map mapA = q8Var.a();
        long j10 = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        if (j10 != 0) {
            return j10;
        }
        return (StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("minBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f7939b = uri;
    }

    public static f8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        int i12 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        f8 f8Var = new f8();
        f8Var.f7938a = uri;
        f8Var.f7939b = uri2;
        f8Var.f7940c = aVarValueOf;
        f8Var.f7941d = string2;
        f8Var.f7942e = i10;
        f8Var.f7943f = i11;
        f8Var.f7944g = i12;
        return f8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f7938a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f7939b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f7940c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f7941d);
        JsonUtils.putInt(jSONObject, "width", this.f7942e);
        JsonUtils.putInt(jSONObject, "height", this.f7943f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f7944g);
        return jSONObject;
    }
}
