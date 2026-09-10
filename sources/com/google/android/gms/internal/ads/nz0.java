package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nz0 extends lz0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f18033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f18034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(md0 md0Var, HashSet hashSet, JSONObject jSONObject, long j10, int i10) {
        super(md0Var);
        this.f18036f = i10;
        this.f18033c = new HashSet(hashSet);
        this.f18034d = jSONObject;
        this.f18035e = j10;
    }

    @Override // com.google.android.gms.internal.ads.lz0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        vy0 vy0Var;
        switch (this.f18036f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (vy0Var = vy0.f21317c) != null) {
                    for (ky0 ky0Var : Collections.unmodifiableCollection(vy0Var.f21318a)) {
                        if (this.f18033c.contains(ky0Var.f16563g)) {
                            dz0 dz0Var = ky0Var.f16560d;
                            if (this.f18035e >= dz0Var.f13772c) {
                                dz0Var.f13773d = 2;
                                s6.f19863g.w(dz0Var.c(), "setNativeViewHierarchy", str, dz0Var.f13770a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        vy0 vy0Var = vy0.f21317c;
        if (vy0Var != null) {
            for (ky0 ky0Var : Collections.unmodifiableCollection(vy0Var.f21318a)) {
                if (this.f18033c.contains(ky0Var.f16563g)) {
                    dz0 dz0Var = ky0Var.f16560d;
                    if (this.f18035e >= dz0Var.f13772c && dz0Var.f13773d != 3) {
                        dz0Var.f13773d = 3;
                        s6.f19863g.w(dz0Var.c(), "setNativeViewHierarchy", str, dz0Var.f13770a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f18036f) {
            case 0:
                return this.f18034d.toString();
            default:
                md0 md0Var = this.f17164b;
                JSONObject jSONObject = (JSONObject) md0Var.f17399b;
                JSONObject jSONObject2 = this.f18034d;
                if (hz0.e(jSONObject2, jSONObject)) {
                    return null;
                }
                md0Var.f17399b = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.lz0, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f18036f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
