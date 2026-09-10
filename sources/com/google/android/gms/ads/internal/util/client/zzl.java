package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.ironsource.C0375hc;
import com.ironsource.X3;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f10989c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f10990d = false;
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f10988b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f10991e = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static void a(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!f10991e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzo.zzf("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name(X3.i.X).value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name(X3.i.X).value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public static void zzg() {
        synchronized (f10988b) {
            f10989c = false;
            f10990d = false;
            zzo.zzi("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzh(boolean z10) {
        synchronized (f10988b) {
            f10989c = true;
            f10990d = z10;
        }
    }

    public static boolean zzi() {
        boolean z10;
        synchronized (f10988b) {
            z10 = f10989c;
        }
        return z10;
    }

    public static boolean zzj() {
        boolean z10;
        synchronized (f10988b) {
            try {
                z10 = false;
                if (f10989c && f10990d) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final void b(String str, zzk zzkVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f10992a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            zzo.zzg("unable to log", e10);
        }
        String string = stringWriter.toString();
        synchronized (zzl.class) {
            try {
                zzo.zzh("GMA Debug BEGIN");
                int i10 = 0;
                while (i10 < string.length()) {
                    int i11 = i10 + 4000;
                    zzo.zzh("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i10, Math.min(i11, string.length())))));
                    i10 = i11;
                }
                zzo.zzh("GMA Debug FINISH");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        if (zzj()) {
            b("onNetworkRequest", new zzj(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void zzb(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        if (zzj()) {
            b("onNetworkRequest", new zzj(str, C0375hc.f28788a, map, bArr));
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, int i10) {
        if (zzj()) {
            String responseMessage = null;
            b("onNetworkResponse", new zzg(i10, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i10 < 200 || i10 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    zzo.zzi("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
                }
                b("onNetworkRequestError", new zzi(responseMessage));
            }
        }
    }

    public final void zzd(@Nullable Map map, int i10) {
        if (zzj()) {
            b("onNetworkResponse", new zzg(i10, map));
            if (i10 < 200 || i10 >= 300) {
                b("onNetworkRequestError", new zzi(null));
            }
        }
    }

    public final void zze(@Nullable String str) {
        if (zzj() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(final byte[] bArr) {
        b("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) throws IOException {
                Object obj = zzl.f10988b;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncodeToString = Base64.encodeToString(bArr2, 0);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncodeToString);
                } else {
                    String strZzg = zzf.zzg(strEncodeToString);
                    if (strZzg != null) {
                        jsonWriter.name("bodydigest").value(strZzg);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzl(@Nullable String str) {
        this.f10992a = !zzj() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }
}
