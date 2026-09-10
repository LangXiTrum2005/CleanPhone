package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.Z;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzqp;
import com.p004ironsource.dc;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhd {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzhd(zzhh zzhhVar, String str, Bundle bundle) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    public final Bundle zza() {
        byte b2;
        if (this.zzd == null) {
            zzhh zzhhVar = this.zza;
            String string = zzhhVar.zzd().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String string2 = jSONObject.getString(dc.q);
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b2 = 4;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b2 = 3;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (string3.equals("s")) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                            if (b2 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b2 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b2 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (b2 == 3) {
                                zzqp.zza();
                                if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaQ)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i3 = 0; i3 < length; i3++) {
                                        iArr[i3] = jSONArray2.optInt(i3);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (b2 != 4) {
                                zzhhVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                zzqp.zza();
                                if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaQ)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        jArr[i4] = jSONArray3.optLong(i4);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzu.zzaV().zzb().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    Z.u(this.zza.zzu, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new Bundle((Bundle) Preconditions.checkNotNull(this.zzd));
    }

    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhh zzhhVar = this.zza;
        SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(dc.q, str2);
                        zzqp.zza();
                        zzic zzicVar = zzhhVar.zzu;
                        if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                zzicVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzicVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e2) {
                        this.zza.zzu.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e2);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }
}
