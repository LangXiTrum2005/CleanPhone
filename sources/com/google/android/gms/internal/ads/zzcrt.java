package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.ch;
import com.p004ironsource.d9;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrt implements zzbry {
    private final Context zza;
    private final zzbch zzb;
    private final PowerManager zzc;

    public zzcrt(Context context, zzbch zzbchVar) {
        this.zza = context;
        this.zzb = zzbchVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcrw zzcrwVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbcj zzbcjVar = zzcrwVar.zzf;
        if (zzbcjVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbch zzbchVar = this.zzb;
            if (zzbchVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z2 = zzbcjVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzbchVar.zzb()).put("activeViewJSON", zzbchVar.zzc()).put("timestamp", zzcrwVar.zzd).put("adFormat", zzbchVar.zza()).put("hashCode", zzbchVar.zzd()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcrwVar.zzb).put("isNative", zzbchVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.zza;
            jSONObjectPut.put(d9.i.f24741P, com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zzbcjVar.zzb).put("isAttachedToWindow", z2);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbcjVar.zzc;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put(TtmlNode.LEFT, rect.left).put(TtmlNode.RIGHT, rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbcjVar.zzd;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put(TtmlNode.LEFT, rect2.left).put(TtmlNode.RIGHT, rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbcjVar.zze;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put(TtmlNode.LEFT, rect3.left).put(TtmlNode.RIGHT, rect3.right)).put("globalVisibleBoxVisible", zzbcjVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbcjVar.zzg;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put(TtmlNode.LEFT, rect4.left).put(TtmlNode.RIGHT, rect4.right)).put("localVisibleBoxVisible", zzbcjVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbcjVar.zzi;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put(TtmlNode.LEFT, rect5.left).put(TtmlNode.RIGHT, rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(ch.k, zzcrwVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbU)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbcjVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put(TtmlNode.LEFT, rect6.left).put(TtmlNode.RIGHT, rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcrwVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
