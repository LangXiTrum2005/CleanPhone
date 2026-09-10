package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbp;
import com.ironsource.Y3;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ke0 extends le0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f16413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f16419h;

    public ke0(du0 du0Var, JSONObject jSONObject) {
        super(du0Var);
        this.f16413b = zzbp.zzi(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f16414c = zzbp.zzj(false, jSONObject, "allow_pub_owned_ad_view");
        this.f16415d = zzbp.zzj(false, jSONObject, Y3.f27960c, "allow_pub_rendering");
        this.f16416e = zzbp.zzj(false, jSONObject, "enable_omid");
        this.f16418g = zzbp.zzk("", jSONObject, "watermark_overlay_png_base64");
        this.f16417f = jSONObject.optJSONObject("overlay") != null;
        this.f16419h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final boolean a() {
        return this.f16417f;
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final boolean b() {
        return this.f16414c;
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final boolean c() {
        return this.f16416e;
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final boolean d() {
        return this.f16415d;
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final String e() {
        return this.f16418g;
    }

    @Override // com.google.android.gms.internal.ads.le0
    public final x11 f() {
        JSONObject jSONObject = this.f16419h;
        return jSONObject != null ? new x11(jSONObject, 25) : this.f16874a.V;
    }
}
