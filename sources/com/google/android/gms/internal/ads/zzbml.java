package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.smartdigimkt.f3.b;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzbml implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(b.f35043u))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgon zzgonVarZzl = zzgoo.zzl();
        zzgonVarZzl.zzb((String) map.get(b.f35043u));
        zzgonVarZzl.zzg(zzcirVar.getWidth());
        zzgonVarZzl.zza(zzcirVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzgonVarZzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzgonVarZzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzgonVarZzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzgonVarZzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzgonVarZzl.zzh((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzcirVar, zzgonVarZzl.zzi());
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
