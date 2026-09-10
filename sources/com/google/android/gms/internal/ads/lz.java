package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lz implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17162c;

    public /* synthetic */ lz(ci0 ci0Var, String str) {
        this.f17160a = 1;
        this.f17162c = ci0Var;
        this.f17161b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f17160a) {
            case 0:
                nz nzVar = (nz) this.f17162c;
                synchronized (nzVar) {
                    try {
                        for (mz mzVar : nzVar.f18030b) {
                            String str2 = (String) this.f17161b;
                            nz nzVar2 = mzVar.f17592a;
                            Map map = mzVar.f17593b;
                            nzVar2.getClass();
                            if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                                lj1 lj1Var = nzVar2.f18032d;
                                ((p9.b) ((p9.a) lj1Var.f17036b)).getClass();
                                ((ez) lj1Var.f17037c).a(-1, System.currentTimeMillis());
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 1:
                ci0 ci0Var = (ci0) this.f17162c;
                String str3 = (String) this.f17161b;
                ci0Var.f13177i.set(zzac.zzb(ci0Var.f13170b, str3));
                return;
            default:
                JSONObject jSONObject = (JSONObject) this.f17161b;
                if (str != null && ((List) this.f17162c).contains(str)) {
                    try {
                        Object obj = sharedPreferences.getAll().get(str);
                        if (obj == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj);
                        }
                        return;
                    } catch (JSONException e10) {
                        zzt.zzh().e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e10);
                        return;
                    }
                }
                return;
        }
    }

    public lz() {
        this.f17160a = 2;
        this.f17161b = new JSONObject();
    }

    public lz(nz nzVar, String str) {
        this.f17160a = 0;
        Objects.requireNonNull(nzVar);
        this.f17162c = nzVar;
        this.f17161b = str;
    }
}
