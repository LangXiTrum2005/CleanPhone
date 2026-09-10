package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.p004ironsource.ko;
import com.smartdigimkt.f3.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseInstallationServiceClient {
    public static final Pattern d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f20887e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RequestLimiter f20890c = new RequestLimiter();

    public FirebaseInstallationServiceClient(Context context, Provider provider) {
        this.f20888a = context;
        this.f20889b = provider;
    }

    public static URL c(String str) throws FirebaseInstallationsException {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage());
        }
    }

    public static void d(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f20887e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", a.n("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : android.support.v4.media.a.C(", ", str)));
    }

    public static long f(String str) {
        Preconditions.checkArgument(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static InstallationResponse g(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20887e));
        AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
        builder.f20885b = 0L;
        builder.d = (byte) (builder.d | 1);
        AutoValue_InstallationResponse.Builder builder2 = new AutoValue_InstallationResponse.Builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                builder2.f20878a = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                builder2.f20879b = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                builder2.f20880c = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.f20884a = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.f20885b = f(jsonReader.nextString());
                        builder.d = (byte) (builder.d | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.d = builder.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new AutoValue_InstallationResponse(builder2.f20878a, builder2.f20879b, builder2.f20880c, builder2.d, InstallationResponse.ResponseCode.X);
    }

    public static TokenResult h(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20887e));
        AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
        builder.f20885b = 0L;
        builder.d = (byte) (builder.d | 1);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.f20884a = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                builder.f20885b = f(jsonReader.nextString());
                builder.d = (byte) (builder.d | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        builder.f20886c = TokenResult.ResponseCode.X;
        return builder.a();
    }

    public static void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(b.f35043u, str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.1");
            k(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void j(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            k(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final InstallationResponse a(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        RequestLimiter requestLimiter = this.f20890c;
        if (!requestLimiter.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlC = c("projects/" + str3 + "/installations");
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionE = e(urlC, str);
            try {
                try {
                    httpURLConnectionE.setRequestMethod(ko.f25535b);
                    httpURLConnectionE.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionE.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    try {
                        i(httpURLConnectionE, str2, str4);
                        int responseCode = httpURLConnectionE.getResponseCode();
                        requestLimiter.b(responseCode);
                        if (responseCode < 200 || responseCode >= 300) {
                            z2 = false;
                        }
                        if (z2) {
                            InstallationResponse installationResponseG = g(httpURLConnectionE);
                            httpURLConnectionE.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return installationResponseG;
                        }
                        d(httpURLConnectionE, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            AutoValue_InstallationResponse.Builder builder = new AutoValue_InstallationResponse.Builder();
                            AutoValue_InstallationResponse autoValue_InstallationResponse = new AutoValue_InstallationResponse(builder.f20878a, builder.f20879b, builder.f20880c, builder.d, InstallationResponse.ResponseCode.f20891Y);
                            httpURLConnectionE.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return autoValue_InstallationResponse;
                        }
                        httpURLConnectionE.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionE.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
    }

    public final TokenResult b(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        TokenResult tokenResultH;
        RequestLimiter requestLimiter = this.f20890c;
        if (!requestLimiter.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlC = c("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionE = e(urlC, str);
            try {
                try {
                    httpURLConnectionE.setRequestMethod(ko.f25535b);
                    httpURLConnectionE.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionE.setDoOutput(true);
                    j(httpURLConnectionE);
                    int responseCode = httpURLConnectionE.getResponseCode();
                    requestLimiter.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        tokenResultH = h(httpURLConnectionE);
                    } else {
                        d(httpURLConnectionE, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
                            builder.f20885b = 0L;
                            builder.d = (byte) (1 | builder.d);
                            builder.f20886c = TokenResult.ResponseCode.Z;
                            tokenResultH = builder.a();
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                AutoValue_TokenResult.Builder builder2 = new AutoValue_TokenResult.Builder();
                                builder2.f20885b = 0L;
                                builder2.d = (byte) (1 | builder2.d);
                                builder2.f20886c = TokenResult.ResponseCode.f20896Y;
                                tokenResultH = builder2.a();
                            }
                            httpURLConnectionE.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionE.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return tokenResultH;
                } catch (Throwable th) {
                    httpURLConnectionE.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final HttpURLConnection e(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", com.smartdigimkt.o0.b.d);
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f20888a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            HeartBeatController heartBeatController = (HeartBeatController) this.f20889b.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(heartBeatController.a()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e3) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            String strBytesToStringUppercase = null;
            try {
                byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
                if (packageCertificateHashBytes == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e4);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strBytesToStringUppercase);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
