package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20816e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul(int i10, String str, Object obj, Object obj2, int i11) {
        this(i10, obj, obj2, str);
        this.f20816e = i11;
    }

    public static ul e(int i10, int i11, String str) {
        return new ul(1, str, Integer.valueOf(i10), Integer.valueOf(i11), 1);
    }

    public static ul f(long j10, long j11, String str) {
        return new ul(1, str, Long.valueOf(j10), Long.valueOf(j11), 2);
    }

    public static ul g(String str, float f10, float f11) {
        return new ul(1, str, Float.valueOf(f10), Float.valueOf(f11), 3);
    }

    public static void h() {
        Object obj = null;
        zzba.zzb().f21195b.add(new ul(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public static void i() {
        Object obj = null;
        zzba.zzb().f21196c.add(new ul(1, "gads:sdk_core_constants_service:experiment_id", obj, obj, 4));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.f20816e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f20813b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f20813b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f20813b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f20813b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.f20813b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.f20816e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f20813b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f20813b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f20813b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f20813b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.f20813b, (String) c());
        }
    }

    public final Object c() {
        return zzba.zzc().f22298i ? this.f20815d : this.f20814c;
    }

    public final Object d() {
        return zzba.zzc().a(this);
    }

    public ul(int i10, Object obj, Object obj2, String str) {
        this.f20812a = i10;
        this.f20813b = str;
        this.f20814c = obj;
        this.f20815d = obj2;
        zzba.zzb().f21194a.add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ul(String str, String str2, String str3) {
        this(1, str2, str3, str);
        this.f20816e = 4;
    }
}
