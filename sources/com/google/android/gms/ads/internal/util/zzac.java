package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.a21;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.b21;
import com.google.android.gms.internal.ads.z11;
import com.google.android.gms.internal.ads.z71;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzac {
    public static void zza(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12269n7)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            z11 z11VarF = z11.f(context);
            a21 a21VarF = a21.f(context);
            b21 b21VarB = b21.b(context);
            z11VarF.getClass();
            synchronized (z11.class) {
                z11VarF.c(false);
            }
            synchronized (z11.class) {
                z11VarF.c(true);
            }
            a21VarF.g();
            b21VarB.l();
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().d("clearStorageOnIdlessMode", e10);
        }
    }

    @NonNull
    public static Bundle zzb(Context context, String str) {
        JSONArray jSONArray;
        int i10;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e10) {
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("JSON parsing error", e10);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i10 = 1;
            } else if (iOptInt != 1) {
                i10 = iOptInt != 2 ? 0 : 3;
            } else {
                i10 = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i10 != 0) {
                List listM = l.h(new z71('/')).m(strOptString2);
                if (listM.size() > 2 || listM.isEmpty()) {
                    obj = null;
                } else {
                    if (listM.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listM.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listM.get(0), 0);
                        str2 = (String) listM.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i13 = i10 - 1;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static Bundle zzc(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }
}
