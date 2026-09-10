package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xq implements yq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21964a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00 f21965b;

    public xq(lq lqVar, m00 m00Var) {
        this.f21965b = m00Var;
        Objects.requireNonNull(lqVar);
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final void b(String str) {
        switch (this.f21964a) {
            case 0:
                this.f21965b.zzd(new zs(str, 0));
                break;
            default:
                m00 m00Var = this.f21965b;
                try {
                    if (str == null) {
                        m00Var.zzd(new zs(0));
                    } else {
                        m00Var.zzd(new zs(str, 0));
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final void c(JSONObject jSONObject) {
        switch (this.f21964a) {
            case 0:
                this.f21965b.zzc(jSONObject);
                break;
            default:
                m00 m00Var = this.f21965b;
                try {
                    m00Var.zzc(jSONObject);
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e10) {
                    m00Var.zzd(e10);
                }
                break;
        }
    }

    public xq(mt mtVar, m00 m00Var) {
        this.f21965b = m00Var;
    }
}
