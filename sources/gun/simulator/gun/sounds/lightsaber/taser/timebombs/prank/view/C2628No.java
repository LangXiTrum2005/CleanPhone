package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.No, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2628No extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3478a;
    public final /* synthetic */ String b;

    public C2628No(Context context, String str) {
        this.f3478a = context;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        DataOutputStream dataOutputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        Context context = this.f3478a;
        super.run();
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://www.facebook.com/adnw_logging/").openConnection();
            try {
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                httpURLConnection2.setRequestProperty(HttpRequestHeader.Accept, "application/json");
                httpURLConnection2.setRequestProperty(HttpRequestHeader.AcceptCharset, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.connect();
                String string = UUID.randomUUID().toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("attempt", "0");
                DexLoadErrorReporter.a(context, jSONObject, string);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("subtype", "generic");
                jSONObject2.put("subtype_code", "1320");
                jSONObject2.put("caught_exception", "1");
                jSONObject2.put("stacktrace", this.b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", UUID.randomUUID().toString());
                jSONObject3.put("type", "debug");
                StringBuilder sb = new StringBuilder("");
                httpURLConnection = httpURLConnection2;
                try {
                    sb.append(System.currentTimeMillis() / 1000);
                    jSONObject3.put("session_time", sb.toString());
                    jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                    jSONObject3.put("session_id", string);
                    jSONObject3.put("data", jSONObject2);
                    jSONObject3.put("attempt", "0");
                    DexLoadErrorReporter.a(context, jSONObject2, string);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject3);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("data", jSONObject);
                    jSONObject4.put(com.umeng.analytics.pro.f.ax, jSONArray);
                    String string2 = jSONObject4.toString();
                    DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                    try {
                        dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(string2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
                        dataOutputStream2.flush();
                        byte[] bArr = new byte[16384];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        while (true) {
                            try {
                                int i = inputStream2.read(bArr);
                                if (i == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                            } catch (Throwable unused) {
                                inputStream = inputStream2;
                                dataOutputStream = dataOutputStream2;
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                }
                                if (httpURLConnection == null) {
                                    return;
                                }
                            }
                        }
                        byteArrayOutputStream.flush();
                        try {
                            dataOutputStream2.close();
                        } catch (Exception unused4) {
                        }
                        try {
                            inputStream2.close();
                        } catch (Exception unused5) {
                        }
                    } catch (Throwable unused6) {
                        dataOutputStream = dataOutputStream2;
                        inputStream = null;
                        if (dataOutputStream != null) {
                            dataOutputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpURLConnection == null) {
                            return;
                        }
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable unused7) {
                    dataOutputStream = null;
                    inputStream = null;
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused8) {
                httpURLConnection = httpURLConnection2;
            }
        } catch (Throwable unused9) {
            dataOutputStream = null;
            inputStream = null;
            httpURLConnection = null;
        }
        httpURLConnection.disconnect();
    }
}
