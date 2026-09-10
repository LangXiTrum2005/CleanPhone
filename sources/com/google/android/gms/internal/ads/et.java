package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class et implements yq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us f14075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00 f14076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ft f14077c;

    public et(ft ftVar, us usVar, m00 m00Var) {
        Objects.requireNonNull(ftVar);
        this.f14077c = ftVar;
        this.f14075a = usVar;
        this.f14076b = m00Var;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final void b(String str) {
        us usVar = this.f14075a;
        m00 m00Var = this.f14076b;
        try {
            if (str == null) {
                m00Var.zzd(new zs(0));
            } else {
                m00Var.zzd(new zs(str, 0));
            }
        } catch (IllegalStateException unused) {
        } finally {
            usVar.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final void c(JSONObject jSONObject) {
        us usVar = this.f14075a;
        m00 m00Var = this.f14076b;
        try {
            try {
                m00Var.zzc(((bt) this.f14077c.f14528c).c(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                m00Var.zzd(e10);
            }
        } finally {
            usVar.t();
        }
    }
}
