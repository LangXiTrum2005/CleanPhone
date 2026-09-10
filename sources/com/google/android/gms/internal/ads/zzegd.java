package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.smartdigimkt.o0.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegd implements zzflu {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfne zzb;
    private final zzfno zzc;

    public zzegd(String str, zzfno zzfnoVar, zzfne zzfneVar) {
        this.zza = str;
        this.zzc = zzfnoVar;
        this.zzb = zzfneVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzebr zzebrVar;
        String strJoin;
        byte[] bArr;
        JSONObject jSONObjectZza;
        String strConcat;
        zzegc zzegcVar = (zzegc) obj;
        int iOptInt = zzegcVar.zza().optInt("http_timeout_millis", 60000);
        zzbzc zzbzcVarZzb = zzegcVar.zzb();
        if (zzbzcVarZzb.zza() != -2) {
            if (zzbzcVarZzb.zza() == 1) {
                if (zzbzcVarZzb.zzb() != null) {
                    strJoin = TextUtils.join(", ", zzbzcVarZzb.zzb());
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strJoin);
                } else {
                    strJoin = "";
                }
                zzebrVar = new zzebr(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzebrVar = new zzebr(1);
            }
            zzfno zzfnoVar = this.zzc;
            zzfne zzfneVar = this.zzb;
            zzfneVar.zzj(zzebrVar);
            zzfneVar.zzd(false);
            zzfnoVar.zza(zzfneVar);
            throw zzebrVar;
        }
        HashMap map = new HashMap();
        if (zzegcVar.zzb().zzg()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbt)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = zzd.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (zzegcVar.zzb().zzf() && (jSONObjectZza = zzegcVar.zza()) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectZza.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (TextUtils.isEmpty(zzegcVar.zzb().zzd())) {
            bArr = byteArray;
        } else {
            byte[] bytes = zzegcVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzegcVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e2);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PrepareRequestFunction.apply");
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put("Content-Encoding", b.d);
                    bArr = byteArray;
                }
            }
            bArr = bytes;
        }
        String strZzl = !TextUtils.isEmpty(zzegcVar.zzb().zzl()) ? zzegcVar.zzb().zzl() : "";
        zzfno zzfnoVar2 = this.zzc;
        zzfne zzfneVar2 = this.zzb;
        zzfneVar2.zzd(true);
        zzfnoVar2.zza(zzfneVar2);
        return new zzefy(zzegcVar.zzb().zze(), iOptInt, map, bArr, strZzl, zzegcVar.zzb().zzf());
    }
}
