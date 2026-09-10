package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbgc {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final void zza(zzbgb zzbgbVar) {
        this.zza.add(zzbgbVar);
    }

    public final void zzb(zzbgb zzbgbVar) {
        this.zzb.add(zzbgbVar);
    }

    public final void zzc(zzbgb zzbgbVar) {
        this.zzc.add(zzbgbVar);
    }

    public final void zzd(SharedPreferences.Editor editor, int i2, JSONObject jSONObject) {
        for (zzbgb zzbgbVar : this.zza) {
            if (zzbgbVar.zzm() == 1) {
                zzbgbVar.zzb(editor, zzbgbVar.zzc(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Flag Json is null.");
        }
    }

    public final List zze() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd((zzbgb) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbgl.zza());
        return arrayList;
    }

    public final List zzf() {
        List listZze = zze();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd((zzbgb) it.next());
            if (!TextUtils.isEmpty(str)) {
                listZze.add(str);
            }
        }
        listZze.addAll(zzbgl.zzb());
        return listZze;
    }
}
