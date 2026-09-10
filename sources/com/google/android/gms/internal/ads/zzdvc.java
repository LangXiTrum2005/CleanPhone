package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdvc implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final JSONObject zza = new JSONObject();
    private List zzb;

    @VisibleForTesting
    public zzdvc() {
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, @Nullable String str) {
        if (str != null && this.zzb.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.zza.remove(str);
                } else {
                    this.zza.put(str, obj);
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }

    public final JSONObject zza() throws JSONException {
        return this.zza;
    }

    public final void zzb(SharedPreferences sharedPreferences, List list) {
        this.zzb = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (String) it.next());
        }
    }
}
