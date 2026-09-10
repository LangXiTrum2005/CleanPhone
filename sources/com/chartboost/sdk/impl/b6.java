package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b6 implements tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f13487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5 f13488c;
    public final String d;

    public b6(Context context, p2 identity, x5 x5Var) {
        Intrinsics.f(context, "context");
        Intrinsics.f(identity, "identity");
        this.f13486a = context;
        this.f13487b = identity;
        this.f13488c = x5Var;
        this.d = com.ironsource.d9.h.G;
    }

    @Override // com.chartboost.sdk.impl.tg
    public JSONObject a() throws JSONException {
        y8 y8VarH = this.f13487b.h();
        p3 p3VarA = new q3().a(this.f13486a);
        String strB = z4.g(this.f13486a).b();
        x5 x5Var = this.f13488c;
        Integer numValueOf = x5Var != null ? Integer.valueOf(x5Var.f()) : null;
        x5 x5Var2 = this.f13488c;
        Integer numValueOf2 = x5Var2 != null ? Integer.valueOf(x5Var2.e()) : null;
        x5 x5Var3 = this.f13488c;
        Integer numValueOf3 = x5Var3 != null ? Integer.valueOf(x5Var3.j()) : null;
        String strF = t6.f15176a.f();
        int i2 = y8VarH.f() == kh.TRACKING_LIMITED ? 1 : 0;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String strC = android.support.v4.media.a.C("Android ", Build.VERSION.RELEASE);
        x5 x5Var4 = this.f13488c;
        Float fValueOf = x5Var4 != null ? Float.valueOf(x5Var4.h()) : null;
        String strA = vh.f15428b.a();
        String strC2 = y8VarH.c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.p004ironsource.ne.O0, p3VarA != null ? p3VarA.d() : null);
        jSONObject.put("connection_type", strB);
        jSONObject.put("device_type", numValueOf);
        jSONObject.put("display_height", numValueOf2);
        jSONObject.put("display_width", numValueOf3);
        jSONObject.put("language", strF);
        jSONObject.put("lmt", i2);
        jSONObject.put(com.p004ironsource.ne.t, str);
        jSONObject.put("model", str2);
        jSONObject.put(com.p004ironsource.ne.f26256E, com.p004ironsource.d9.d);
        jSONObject.put(com.smartdigimkt.b0.a.h1, strC);
        jSONObject.put("pixel_ratio", fValueOf);
        jSONObject.put("user_agent", strA);
        jSONObject.put("instance_id", strC2);
        return jSONObject;
    }
}
