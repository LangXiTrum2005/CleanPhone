package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.efs.sdk.base.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.mbbid.out.BidResponsed;
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

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4442qu {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4907a;
    public final AW b;
    public final SY c = new SY();

    public C4442qu(Context context, AW aw) {
        this.f4907a = context;
        this.b = aw;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e2) {
            throw new C4793uu(e2.getMessage(), 1);
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
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
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            return;
        }
        new StringBuilder(", ").append(str);
    }

    public static long d(String str) {
        Preconditions.checkArgument(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static C3058b8 e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        C4568sM c4568sMA = C4113n8.a();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        C4113n8 c4113n8 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals(BidResponsed.KEY_TOKEN)) {
                        c4568sMA.b = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        c4568sMA.c = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                C4113n8 c4113n8I = c4568sMA.i();
                jsonReader.endObject();
                c4113n8 = c4113n8I;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C3058b8(strNextString, strNextString2, strNextString3, c4113n8, EnumC4471rD.f4922a);
    }

    public static C4113n8 f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        C4568sM c4568sMA = C4113n8.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(BidResponsed.KEY_TOKEN)) {
                c4568sMA.b = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                c4568sMA.c = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        c4568sMA.d = Pc0.f3559a;
        return c4568sMA.i();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.4");
            i(httpURLConnection, jSONObject.toString().getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.4");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
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

    public final HttpURLConnection c(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty(HttpRequestHeader.Accept, "application/json");
            httpURLConnection.addRequestProperty(HttpResponseHeader.ContentEncoding, Constants.CP_GZIP);
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f4907a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            InterfaceC4798uz interfaceC4798uz = (InterfaceC4798uz) this.b.get();
            if (interfaceC4798uz != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((C3379en) interfaceC4798uz).b()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String strBytesToStringUppercase = null;
            try {
                byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
                if (packageCertificateHashBytes == null) {
                    context.getPackageName();
                } else {
                    strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                context.getPackageName();
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strBytesToStringUppercase);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused4) {
            throw new C4793uu("Firebase Installations Service is unavailable. Please try again later.", 1);
        }
    }
}
