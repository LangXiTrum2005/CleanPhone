package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzear implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final JSONObject zza = new JSONObject();
    private List zzb;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null && this.zzb.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.zza.remove(str);
                } else {
                    this.zza.put(str, obj);
                }
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }

    public final void zza(SharedPreferences sharedPreferences, List list) {
        this.zzb = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (String) it.next());
        }
    }

    public final JSONObject zzb() throws JSONException {
        return this.zza;
    }
}
