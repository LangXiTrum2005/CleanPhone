package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7294c;

    public /* synthetic */ zzc(JSONObject jSONObject) {
        this.f7292a = jSONObject.optString("productId");
        this.f7293b = jSONObject.optString(X3.i.f27802m);
        String strOptString = jSONObject.optString("offerToken");
        this.f7294c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return this.f7292a.equals(zzcVar.f7292a) && this.f7293b.equals(zzcVar.f7293b) && Objects.equals(this.f7294c, zzcVar.f7294c);
    }

    public final int hashCode() {
        return Objects.hash(this.f7292a, this.f7293b, this.f7294c);
    }

    public final String toString() {
        return defpackage.e.q(this.f7294c, "}", defpackage.e.v("{id: ", this.f7292a, ", type: ", this.f7293b, ", offer token: "));
    }
}
