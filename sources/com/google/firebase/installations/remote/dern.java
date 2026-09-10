package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.ironsource.A5;
import com.ironsource.C3460cc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import polonize.impromptu;

/* JADX INFO: compiled from: FirebaseInstallationServiceClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f22522attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final hotbox.attabal f22523dern = new hotbox.attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final friedmanite.saneness<impromptu> f22524saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Pattern f22521wireman = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Charset f22520marial = Charset.forName(C.UTF8_NAME);

    public dern(Context context, friedmanite.saneness<impromptu> sanenessVar) {
        this.f22522attabal = context;
        this.f22524saneness = sanenessVar;
    }

    public static void apical(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (TextUtils.isEmpty(kowloon(httpURLConnection))) {
            return;
        }
        attabal(str, str2, str3);
    }

    public static String attabal(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    public static JSONObject dern() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static long impassible(String str) {
        Preconditions.checkArgument(f22521wireman.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static byte[] impromptu(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes(C.UTF8_NAME);
    }

    public static String kowloon(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f22520marial));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                    return null;
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
        }
    }

    public static void molybdenite(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
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

    public static JSONObject saneness(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean taiyuan(int i) {
        return i >= 200 && i < 300;
    }

    public final TokenResult arytenoidectomy(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f22520marial));
        TokenResult.attabal attabalVarAttabal = TokenResult.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                attabalVarAttabal.dern(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                attabalVarAttabal.wireman(impassible(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return attabalVarAttabal.saneness(TokenResult.ResponseCode.OK).attabal();
    }

    public final String beachfront() {
        try {
            Context context = this.f22522attabal;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.f22522attabal.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f22522attabal.getPackageName();
            return null;
        }
    }

    public final URL competently(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public final HttpURLConnection formularize(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", A5.M);
            httpURLConnection.addRequestProperty("Accept", A5.M);
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f22522attabal.getPackageName());
            impromptu impromptuVar = this.f22524saneness.get();
            if (impromptuVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(impromptuVar.attabal()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", beachfront());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public TokenResult marial(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        TokenResult tokenResultArytenoidectomy;
        if (!this.f22523dern.saneness()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL urlCompetently = competently(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionFormularize = formularize(urlCompetently, str);
            try {
                try {
                    httpURLConnectionFormularize.setRequestMethod(C3460cc.b);
                    httpURLConnectionFormularize.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionFormularize.setDoOutput(true);
                    polloi(httpURLConnectionFormularize);
                    int responseCode = httpURLConnectionFormularize.getResponseCode();
                    this.f22523dern.beachfront(responseCode);
                    if (taiyuan(responseCode)) {
                        tokenResultArytenoidectomy = arytenoidectomy(httpURLConnectionFormularize);
                    } else {
                        apical(httpURLConnectionFormularize, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            tokenResultArytenoidectomy = TokenResult.attabal().saneness(TokenResult.ResponseCode.AUTH_ERROR).attabal();
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                cutely();
                                tokenResultArytenoidectomy = TokenResult.attabal().saneness(TokenResult.ResponseCode.BAD_CONFIG).attabal();
                            }
                            httpURLConnectionFormularize.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionFormularize.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return tokenResultArytenoidectomy;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionFormularize.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final void monoploid(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        molybdenite(httpURLConnection, impromptu(saneness(str, str2)));
    }

    public final void polloi(HttpURLConnection httpURLConnection) throws IOException {
        molybdenite(httpURLConnection, impromptu(dern()));
    }

    public final InstallationResponse triweekly(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f22520marial));
        TokenResult.attabal attabalVarAttabal = TokenResult.attabal();
        InstallationResponse.attabal attabalVarAttabal2 = InstallationResponse.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                attabalVarAttabal2.beachfront(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                attabalVarAttabal2.dern(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                attabalVarAttabal2.wireman(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        attabalVarAttabal.dern(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        attabalVarAttabal.wireman(impassible(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                attabalVarAttabal2.saneness(attabalVarAttabal.attabal());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return attabalVarAttabal2.marial(InstallationResponse.ResponseCode.OK).attabal();
    }

    public InstallationResponse wireman(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        InstallationResponse installationResponseTriweekly;
        if (!this.f22523dern.saneness()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL urlCompetently = competently(String.format("projects/%s/installations", str3));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionFormularize = formularize(urlCompetently, str);
            try {
                try {
                    httpURLConnectionFormularize.setRequestMethod(C3460cc.b);
                    httpURLConnectionFormularize.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionFormularize.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    monoploid(httpURLConnectionFormularize, str2, str4);
                    int responseCode = httpURLConnectionFormularize.getResponseCode();
                    this.f22523dern.beachfront(responseCode);
                    if (taiyuan(responseCode)) {
                        installationResponseTriweekly = triweekly(httpURLConnectionFormularize);
                    } else {
                        apical(httpURLConnectionFormularize, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            cutely();
                            installationResponseTriweekly = InstallationResponse.attabal().marial(InstallationResponse.ResponseCode.BAD_CONFIG).attabal();
                        }
                        httpURLConnectionFormularize.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    httpURLConnectionFormularize.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return installationResponseTriweekly;
                } catch (Throwable th) {
                    httpURLConnectionFormularize.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public static void cutely() {
    }
}
