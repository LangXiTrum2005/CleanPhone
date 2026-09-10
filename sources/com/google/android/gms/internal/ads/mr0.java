package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17526b;

    public /* synthetic */ mr0(Object obj, int i10) {
        this.f17525a = i10;
        this.f17526b = obj;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f17525a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                cu0 cu0Var = (cu0) this.f17526b;
                if (cu0Var != null) {
                    if (((Boolean) zzba.zzc().a(am.Ed)).booleanValue()) {
                        return;
                    }
                    synchronized (cu0Var.f13253c) {
                        cu0Var.b();
                        z10 = cu0Var.f13255e == 2;
                        break;
                    }
                    bundle.putBoolean("render_in_browser", z10);
                    synchronized (cu0Var.f13253c) {
                        cu0Var.b();
                        z11 = cu0Var.f13255e == 3;
                        break;
                    }
                    bundle.putBoolean("disable_ml", z11);
                    return;
                }
                return;
            case 1:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f17526b);
                    return;
                } catch (JSONException unused) {
                    zze.zza("Unable to get cache_state");
                    return;
                }
            case 2:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((ms0) this.f17526b).f17536a);
                    return;
                } catch (JSONException unused2) {
                    zze.zza("Failed putting version constants.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f17526b));
                    return;
                } catch (JSONException unused3) {
                    zze.zza("Failed putting experiment ids.");
                    return;
                }
        }
    }
}
