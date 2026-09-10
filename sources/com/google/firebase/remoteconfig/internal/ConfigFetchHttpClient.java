package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.k42;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pd.c;
import pd.d;
import qd.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f24727h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f24734g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f24728a = context;
        this.f24729b = str;
        this.f24730c = str2;
        Matcher matcher = f24727h.matcher(str);
        this.f24731d = matcher.matches() ? matcher.group(1) : null;
        this.f24732e = str3;
        this.f24733f = j10;
        this.f24734g = j11;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), B5.O));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l, Map map2) throws c {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new c("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f24729b);
        Context context = this.f24728a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i10));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put(X3.j.W, packageInfo.versionName);
                map3.put("appBuild", Long.toString(packageInfo.getLongVersionCode()));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.1.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f24731d + "/namespaces/" + this.f24732e + ":fetch").openConnection();
        } catch (IOException e10) {
            throw new d(e10.getMessage());
        }
    }

    @Keep
    public f fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) throws d {
        String strC;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z10;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f24733f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f24734g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f24730c);
        Context context = this.f24728a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrF = p9.c.f(context, context.getPackageName());
            if (bArrF == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strC = null;
            } else {
                strC = p9.c.c(bArrF);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e10);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strC);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", B5.M);
        httpURLConnection.setRequestProperty("Accept", B5.M);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        try {
            try {
                d(httpURLConnection, a(str, str2, map, l, map3).toString().getBytes(B5.O));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new pd.f(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField(Command.HTTP_HEADER_ETAG);
                JSONObject jSONObjectC = c(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                try {
                    k42 k42VarD = qd.c.d();
                    k42VarD.f16313c = date;
                    try {
                        jSONObject = jSONObjectC.getJSONObject("entries");
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            k42VarD.f16312b = new JSONObject(jSONObject.toString());
                        } catch (JSONException unused3) {
                        }
                    }
                    try {
                        jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                    } catch (JSONException unused4) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        try {
                            k42VarD.f16314d = new JSONArray(jSONArray.toString());
                        } catch (JSONException unused5) {
                        }
                    }
                    try {
                        jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                    } catch (JSONException unused6) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        try {
                            k42VarD.f16315e = new JSONObject(jSONObject2.toString());
                        } catch (JSONException unused7) {
                        }
                    }
                    String string = jSONObjectC.has("templateVersion") ? jSONObjectC.getString("templateVersion") : null;
                    if (string != null) {
                        k42VarD.f16311a = Long.parseLong(string);
                    }
                    try {
                        jSONArray2 = jSONObjectC.getJSONArray("rolloutMetadata");
                    } catch (JSONException unused8) {
                        jSONArray2 = null;
                    }
                    if (jSONArray2 != null) {
                        try {
                            k42VarD.f16316f = new JSONArray(jSONArray2.toString());
                        } catch (JSONException unused9) {
                        }
                    }
                    qd.c cVar = new qd.c((JSONObject) k42VarD.f16312b, (Date) k42VarD.f16313c, (JSONArray) k42VarD.f16314d, (JSONObject) k42VarD.f16315e, k42VarD.f16311a, (JSONArray) k42VarD.f16316f);
                    try {
                        z10 = !jSONObjectC.get("state").equals("NO_CHANGE");
                    } catch (JSONException unused10) {
                        z10 = true;
                    }
                    return !z10 ? new f(1, cVar, null) : new f(0, cVar, headerField);
                } catch (JSONException e11) {
                    throw new c("Fetch failed: fetch response could not be parsed.", e11);
                }
            } catch (IOException | JSONException e12) {
                throw new c("The client had an error while calling the backend!", e12);
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused11) {
            }
            throw th2;
        }
    }
}
