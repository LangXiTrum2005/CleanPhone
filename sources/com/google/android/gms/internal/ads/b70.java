package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b70 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12671a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b30 f12672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f12673c;

    public /* synthetic */ b70(b30 b30Var, JSONObject jSONObject) {
        this.f12672b = b30Var;
        this.f12673c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i10 = this.f12671a;
        JSONObject jSONObject = this.f12673c;
        b30 b30Var = this.f12672b;
        switch (i10) {
            case 0:
                String string = jSONObject.toString();
                String strJ = q4.a.j(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
                int i11 = zze.zza;
                zzo.zzd(strJ);
                b30Var.b("AFMA_updateActiveView", jSONObject);
                break;
            default:
                ya1 ya1Var = ee0.J;
                b30Var.f("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ b70(JSONObject jSONObject, b30 b30Var) {
        this.f12673c = jSONObject;
        this.f12672b = b30Var;
    }
}
