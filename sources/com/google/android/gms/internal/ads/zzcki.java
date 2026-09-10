package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcki {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String zza(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!zzb.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String zzb(zzfhr zzfhrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && zzfhrVar.zzT) {
            zzfin zzfinVar = zzfhrVar.zzV;
            if (zzfinVar.zzb() && zzfhrVar.zzb != 4) {
                zzeix zzeixVar = zzfinVar.zzc() == 1 ? zzeix.VIDEO : zzeix.HTML_DISPLAY;
                String str = zzfhrVar.zzal;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", zzeixVar.toString());
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build OMID ENV JSON", e2);
                }
            }
        }
        return null;
    }
}
