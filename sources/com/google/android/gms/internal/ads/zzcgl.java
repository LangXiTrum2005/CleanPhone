package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.Z;
import com.mbridge.msdk.MBridgeConstans;
import com.smartdigimkt.m3.h;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcgl implements zzbnn {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i2) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            androidx.media3.extractor.text.ttml.a.C(sb, "Parse pixels for ", str, ", got string ", str2);
            sb.append(", int ");
            sb.append(i2);
            sb.append(mo.ono);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return i2;
    }

    private static void zzc(zzcey zzceyVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzceyVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String strN = androidx.datastore.preferences.protobuf.a.n("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strN);
                return;
            }
        }
        if (str2 != null) {
            zzceyVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzceyVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzceyVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzceyVar.zzB(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i2;
        Integer numValueOf;
        int i3;
        zzcfk zzcfkVar = (zzcfk) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZza = zzcfkVar.zzdm() != null ? zzcfkVar.zzdm().zza() : null;
        if (numValueOf2 != null && numZza != null && !numValueOf2.equals(numZza) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Event intended for player " + numValueOf2 + ", but sent to player " + numZza + " - event ignored");
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcfkVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcfkVar.zzv(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcfkVar.zze("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzcfkVar.zze("onVideoEvent", map4);
            return;
        }
        zzcez zzcezVarZzdm = zzcfkVar.zzdm();
        if (zzcezVarZzdm == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzcfkVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbgb zzbgbVar = zzbgk.zzeI;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcfkVar.zzy() : Math.min(iZzb3, zzcfkVar.zzy());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzy = zzcfkVar.zzy();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + Z.d(String.valueOf(iZzy), String.valueOf(iZzb3).length() + 72, 4) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iZzb3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iZzy);
                    sb2.append(", x ");
                    sb2.append(iZzb);
                    sb2.append(mo.ono);
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                }
                iMin = Math.min(iZzb3, zzcfkVar.zzy() - iZzb);
            }
            int iZzb4 = zzb(context, map, h.f36614b, -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcfkVar.zzx() : Math.min(iZzb4, zzcfkVar.zzx());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzx = zzcfkVar.zzx();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb2).length() + Z.d(String.valueOf(iZzx), String.valueOf(iZzb4).length() + 75, 4) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iZzb4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iZzx);
                    sb3.append(", y ");
                    sb3.append(iZzb2);
                    sb3.append(mo.ono);
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                iMin2 = Math.min(iZzb4, zzcfkVar.zzx() - iZzb2);
            }
            int i6 = iMin2;
            try {
                i2 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i2 = 0;
            }
            boolean z2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcezVarZzdm.zzd() != null) {
                zzcezVarZzdm.zzb(iZzb, iZzb2, iMin, i6);
                return;
            }
            zzcezVarZzdm.zzc(iZzb, iZzb2, iMin, i6, i2, z2, new zzcfj((String) map.get("flags")));
            zzcey zzceyVarZzd = zzcezVarZzdm.zzd();
            if (zzceyVarZzd != null) {
                zzc(zzceyVarZzd, map);
                return;
            }
            return;
        }
        zzcjx zzcjxVarZzh = zzcfkVar.zzh();
        if (zzcjxVarZzh != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcjxVarZzh.zzd(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcjxVarZzh.zzr();
                return;
            }
        }
        zzcey zzceyVarZzd2 = zzcezVarZzdm.zzd();
        if (zzceyVarZzd2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzcfkVar.zze("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcfkVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzceyVarZzd2.zzC(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzceyVarZzd2.zzt((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzceyVarZzd2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzceyVarZzd2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzceyVarZzd2.zzq(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzceyVarZzd2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzceyVarZzd2.zzu();
                return;
            } else {
                zzceyVarZzd2.zzv();
                return;
            }
        }
        if (str.equals("pause")) {
            zzceyVarZzd2.zzr();
            return;
        }
        if (str.equals("play")) {
            zzceyVarZzd2.zzs();
            return;
        }
        if (str.equals("show")) {
            zzceyVarZzd2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzcfkVar.getContext();
                zzceyVarZzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcfkVar.zzl();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                    zzceyVarZzd2.zzD();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzceyVarZzd2.zzw(Float.parseFloat(str8));
                return;
            } catch (NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcF)).booleanValue() && TextUtils.isEmpty(str9)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i3 = 1;
            } catch (NumberFormatException unused7) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                i3 = 1;
                numValueOf = null;
            }
        } else {
            i3 = 1;
            numValueOf = null;
        }
        String[] strArr = new String[i3];
        strArr[0] = str9;
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    String string2 = jSONArray.getString(i7);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcF)).booleanValue() || !TextUtils.isEmpty(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcF)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str10.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str10);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (numValueOf != null) {
            zzcfkVar.zzo(numValueOf.intValue());
        }
        zzceyVarZzd2.zzo(str9, strArr);
    }
}
