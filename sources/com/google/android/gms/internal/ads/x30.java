package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f21720a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f21721b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f21720a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb2.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb2.append(str3);
            }
            sb2.append(str.substring(iEnd));
        } else {
            if (!f21721b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb2.append(str2);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String b(du0 du0Var) {
        if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue() && du0Var.T) {
            x11 x11Var = du0Var.V;
            x11Var.getClass();
            if (((JSONObject) x11Var.f21703b).optBoolean((String) zzba.zzc().a(am.f12390v6), true) && du0Var.f13677b != 4) {
                int i10 = x11Var.Q() == 1 ? 3 : 1;
                String str = du0Var.f13696l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", com.applovin.impl.ca.c(i10));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e10) {
                    int i11 = zze.zza;
                    zzo.zzj("Unable to build OMID ENV JSON", e10);
                }
            }
        }
        return null;
    }
}
