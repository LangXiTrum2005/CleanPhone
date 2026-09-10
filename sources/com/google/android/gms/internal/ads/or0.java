package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class or0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18349b;

    public /* synthetic */ or0(HashMap map, int i10) {
        this.f18348a = i10;
        this.f18349b = map;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        switch (this.f18348a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                HashMap map = this.f18349b;
                if (!map.isEmpty()) {
                    if (((Boolean) zzba.zzc().a(am.T8)).booleanValue()) {
                        te1 te1VarA = we1.A();
                        for (Map.Entry entry : map.entrySet()) {
                            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                            if (!arrayDeque.isEmpty()) {
                                ii0 ii0Var = (ii0) entry.getKey();
                                int i10 = ii0Var.f15757b;
                                int i11 = 1;
                                if (i10 != 0) {
                                    if (i10 != 1) {
                                        i11 = 3;
                                        if (i10 != 2) {
                                            i11 = i10 != 3 ? 0 : 4;
                                        }
                                    } else {
                                        i11 = 2;
                                    }
                                }
                                if (i11 != 0) {
                                    re1 re1VarZ = se1.z();
                                    long j10 = ii0Var.f15756a;
                                    re1VarZ.b();
                                    ((se1) re1VarZ.f19193b).A(j10);
                                    re1VarZ.b();
                                    ((se1) re1VarZ.f19193b).B(i11);
                                    se1 se1Var = (se1) re1VarZ.e();
                                    ue1 ue1VarZ = ve1.z();
                                    ue1VarZ.b();
                                    ((ve1) ue1VarZ.f19193b).A(se1Var);
                                    ue1VarZ.b();
                                    ((ve1) ue1VarZ.f19193b).B(arrayDeque);
                                    te1VarA.b();
                                    ((we1) te1VarA.f19193b).B((ve1) ue1VarZ.e());
                                }
                            }
                        }
                        we1 we1Var = (we1) te1VarA.e();
                        if (we1Var.z() > 0) {
                            bundle.putString("ods", Base64.encodeToString(we1Var.b(), 11));
                        }
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry entry2 : map.entrySet()) {
                            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
                            if (!arrayDeque2.isEmpty()) {
                                ii0 ii0Var2 = (ii0) entry2.getKey();
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("id", ii0Var2.f15756a);
                                    jSONObject.put("event_type", ii0Var2.f15757b);
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayDeque2.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((Long) it.next());
                                    }
                                    jSONObject.put("timestamps", jSONArray2);
                                    jSONArray.put(jSONObject);
                                } catch (JSONException e10) {
                                    zze.zzb("Failed putting the on-device storage record.", e10);
                                }
                            }
                        }
                        if (jSONArray.length() > 0) {
                            bundle.putString("on_device_storage_records", jSONArray.toString());
                        }
                    }
                    break;
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", zzay.zza().zzm(this.f18349b));
                } catch (JSONException e11) {
                    zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e11.getMessage())));
                }
                break;
        }
    }
}
