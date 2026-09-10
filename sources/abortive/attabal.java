package abortive;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.ironsource.C3460cc;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gelandelaufer.competently;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: HttpGetRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f3239attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<String, String> f3240dern = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<String, String> f3241saneness;

    public attabal(String str, Map<String, String> map) {
        this.f3239attabal = str;
        this.f3241saneness = map;
    }

    public final String attabal(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append(X3.j.b);
        sb.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), C.UTF8_NAME) : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append(X3.j.c);
            sb.append(next2.getKey());
            sb.append(X3.j.b);
            sb.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), C.UTF8_NAME) : "");
        }
        return sb.toString();
    }

    public dern dern() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        CrashlyticsWorkers.wireman();
        InputStream inputStream = null;
        String strMarial = null;
        inputStream = null;
        try {
            String strSaneness = saneness(this.f3239attabal, this.f3241saneness);
            competently.beachfront().taiyuan("GET Request URL: " + strSaneness);
            httpsURLConnection = (HttpsURLConnection) new URL(strSaneness).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(C3460cc.a);
                for (Map.Entry<String, String> entry : this.f3240dern.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strMarial = marial(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new dern(responseCode, strMarial);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public final String marial(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    public final String saneness(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String strAttabal = attabal(map);
        if (strAttabal.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strAttabal;
        }
        if (!str.endsWith(X3.j.c)) {
            strAttabal = X3.j.c + strAttabal;
        }
        return str + strAttabal;
    }

    public attabal wireman(String str, String str2) {
        this.f3240dern.put(str, str2);
        return this;
    }
}
