package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2312Bj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4864vj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2286Aj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5128yj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5216zj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzu {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzam zzd;
    private final zzbk zze;
    private final zzl zzf;
    private final zzx zzg;
    private final zze zzh;

    public zzu(Application application, zzab zzabVar, Handler handler, Executor executor, zzam zzamVar, zzbk zzbkVar, zzl zzlVar, zzx zzxVar, zze zzeVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzamVar;
        this.zze = zzbkVar;
        this.zzf = zzlVar;
        this.zzg = zzxVar;
        this.zzh = zzeVar;
    }

    @WorkerThread
    private final zzch zzd(zzcf zzcfVar) throws zzg {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), C.UTF8_NAME);
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzcfVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    zzcb zzcbVar = zzcfVar.zzb;
                    if (zzcbVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = zzcbVar.zzc;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = zzcbVar.zza;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = zzcbVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = zzcfVar.zzc;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = zzcfVar.zzd;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzcfVar.zze;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzcd zzcdVar = zzcfVar.zzf;
                    if (zzcdVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzcdVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzcdVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = zzcdVar.zzc;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<zzcc> list = zzcdVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzcc zzccVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzccVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzccVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name(TtmlNode.LEFT);
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzccVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name(TtmlNode.RIGHT);
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzccVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzbz zzbzVar = zzcfVar.zzg;
                    if (zzbzVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = zzbzVar.zza;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = zzbzVar.zzb;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zzbzVar.zzc;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    zzce zzceVar = zzcfVar.zzh;
                    if (zzceVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = zzceVar.zza;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzcfVar.zzi;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch ((zzca) it.next()) {
                                case DEBUG_PARAM_UNKNOWN:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case ALWAYS_SHOW:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case GEO_OVERRIDE_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case GEO_OVERRIDE_REGULATED_US_STATE:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case GEO_OVERRIDE_OTHER:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case GEO_OVERRIDE_NON_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case PREVIEWING_DEBUG_MESSAGES:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzch zzchVarZza = zzch.zza(new JsonReader(new StringReader(headerField)));
                        zzchVarZza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zzchVarZza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), C.UTF8_NAME));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzch zzchVarZza2 = zzch.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zzchVarZza2;
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        jsonWriter.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (SocketTimeoutException e) {
            throw new zzg(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzg(2, "Error making request.", e2);
        }
    }

    public final /* synthetic */ void zza(final InterfaceC5216zj interfaceC5216zj, zzz zzzVar) {
        Objects.requireNonNull(interfaceC5216zj);
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC5216zj.onConsentInfoUpdateSuccess();
            }
        });
        if (zzzVar.zzb != EnumC2286Aj.b) {
            this.zze.zzc();
        }
    }

    public final void zzb(Activity activity, C2312Bj c2312Bj, final InterfaceC5216zj interfaceC5216zj, final InterfaceC5128yj interfaceC5128yj) {
        try {
            C4864vj c4864vj = c2312Bj.c;
            if (c4864vj == null || !c4864vj.f5147a) {
                zzci.zza(this.zza);
            }
            final zzz zzzVarZza = new zzw(this.zzg, zzd(this.zzf.zzc(activity, c2312Bj))).zza();
            this.zzd.zzg(zzzVarZza.zza);
            this.zzd.zzi(zzzVarZza.zzb);
            this.zze.zzd(zzzVarZza.zzc);
            this.zzh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(interfaceC5216zj, zzzVarZza);
                }
            });
        } catch (zzg e) {
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzp
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC5128yj.onConsentInfoUpdateFailure(e.zza());
                }
            });
        } catch (RuntimeException e2) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzq
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC5128yj.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    public final void zzc(@Nullable final Activity activity, final C2312Bj c2312Bj, final InterfaceC5216zj interfaceC5216zj, final InterfaceC5128yj interfaceC5128yj) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(activity, c2312Bj, interfaceC5216zj, interfaceC5128yj);
            }
        });
    }
}
