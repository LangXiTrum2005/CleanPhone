package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ll0 implements qv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f17051d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw0 f17053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jw0 f17054c;

    public ll0(String str, jw0 jw0Var, fw0 fw0Var) {
        this.f17052a = str;
        this.f17054c = jw0Var;
        this.f17053b = fw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    @Override // com.google.android.gms.internal.ads.qv0
    public final Object zza(Object obj) throws ck0 {
        ck0 ck0Var;
        JSONObject jSONObject;
        String strConcat;
        kl0 kl0Var = (kl0) obj;
        int iOptInt = kl0Var.f16477a.optInt("http_timeout_millis", 60000);
        nx nxVar = kl0Var.f16478b;
        int i10 = nxVar.f18011g;
        String str = nxVar.f18016m;
        String str2 = nxVar.f18007c;
        fw0 fw0Var = this.f17053b;
        jw0 jw0Var = this.f17054c;
        int i11 = 1;
        String strJoin = "";
        if (i10 != -2) {
            if (i10 == 1) {
                List list = nxVar.f18005a;
                if (list != null) {
                    strJoin = TextUtils.join(", ", list);
                    int i12 = zze.zza;
                    zzo.zzf(strJoin);
                }
                ck0Var = new ck0(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                ck0Var = new ck0(1);
            }
            fw0Var.a(ck0Var);
            fw0Var.zzd(false);
            jw0Var.a(fw0Var);
            throw ck0Var;
        }
        HashMap map = new HashMap();
        if (nxVar.f18009e) {
            String str3 = this.f17052a;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) zzba.zzc().a(am.F1)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = f17051d.matcher(str3);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(i11);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                            i11 = 1;
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str3);
                }
            }
        }
        if (nxVar.f18008d && (jSONObject = kl0Var.f16477a) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                zze.zza("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (!TextUtils.isEmpty(str2)) {
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            if (nxVar.l) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException e10) {
                    zze.zzb("gzip compression failed, sending uncompressed.", e10);
                    zzt.zzh().d("PrepareRequestFunction.apply", e10);
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put("Content-Encoding", "gzip");
                } else {
                    byteArray = bytes;
                }
            } else {
                byteArray = bytes;
            }
        }
        String str4 = !TextUtils.isEmpty(str) ? str : "";
        fw0Var.zzd(true);
        jw0Var.a(fw0Var);
        return new il0(nxVar.f18010f, iOptInt, map, byteArray, str4);
    }
}
