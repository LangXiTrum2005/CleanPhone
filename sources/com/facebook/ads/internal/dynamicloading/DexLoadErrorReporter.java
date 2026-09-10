package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p004ironsource.d9;
import com.p004ironsource.ko;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f15980a = new AtomicBoolean();

    public static void a(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", d9.d);
    }

    public static void reportDexLoadingIssue(final Context context, final String str, double d) {
        AtomicBoolean atomicBoolean = f15980a;
        if (atomicBoolean.get() || Math.random() >= d) {
            return;
        }
        atomicBoolean.set(true);
        new Thread() { // from class: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.1
            /* JADX WARN: Code duplicated, block: B:74:0x0189 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:84:0x017f A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                String str2;
                String str3;
                DataOutputStream dataOutputStream;
                HttpURLConnection httpURLConnection;
                InputStream inputStream;
                String str4;
                String str5;
                Context context2 = context;
                super.run();
                try {
                    httpURLConnection = (HttpURLConnection) new URL("https://www.facebook.com/adnw_logging/").openConnection();
                    try {
                        httpURLConnection.setRequestMethod(ko.f25535b);
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                        httpURLConnection.setRequestProperty("Accept", "application/json");
                        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
                        httpURLConnection.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        String string = UUID.randomUUID().toString();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("attempt", "0");
                        DexLoadErrorReporter.a(context2, jSONObject, string);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("subtype", "generic");
                        jSONObject2.put("subtype_code", "1320");
                        jSONObject2.put("caught_exception", "1");
                        jSONObject2.put("stacktrace", str);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("id", UUID.randomUUID().toString());
                        jSONObject3.put("type", "debug");
                        StringBuilder sb = new StringBuilder("");
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        str2 = "Can't close connection.";
                        str3 = AudienceNetworkAds.TAG;
                        try {
                            sb.append(jCurrentTimeMillis / 1000);
                            jSONObject3.put("session_time", sb.toString());
                            jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                            jSONObject3.put("session_id", string);
                            jSONObject3.put("data", jSONObject2);
                            jSONObject3.put("attempt", "0");
                            DexLoadErrorReporter.a(context2, jSONObject2, string);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject3);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("data", jSONObject);
                            jSONObject4.put("events", jSONArray);
                            String string2 = jSONObject4.toString();
                            DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                            try {
                                dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(string2, "UTF-8"));
                                dataOutputStream2.flush();
                                byte[] bArr = new byte[16384];
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    while (true) {
                                        try {
                                            int i2 = inputStream.read(bArr);
                                            if (i2 == -1) {
                                                break;
                                            }
                                            try {
                                                byteArrayOutputStream.write(bArr, 0, i2);
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        dataOutputStream = dataOutputStream2;
                                        try {
                                            Log.e(str3, "Can't send error.", th);
                                        } finally {
                                            if (dataOutputStream != null) {
                                                try {
                                                    dataOutputStream.close();
                                                } catch (Exception e2) {
                                                    Log.e(str3, str2, e2);
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e3) {
                                                    Log.e(str3, str2, e3);
                                                }
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                        }
                                    }
                                    inputStream.close();
                                } catch (Exception e4) {
                                    Log.e(str5, str4, e4);
                                }
                                byteArrayOutputStream.flush();
                                try {
                                    dataOutputStream2.close();
                                    str4 = str2;
                                    str5 = str3;
                                } catch (Exception e5) {
                                    str4 = str2;
                                    str5 = str3;
                                    Log.e(str5, str4, e5);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                str2 = str2;
                                str3 = str3;
                                dataOutputStream = dataOutputStream2;
                                inputStream = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str2 = str2;
                            str3 = str3;
                            dataOutputStream = null;
                            inputStream = null;
                            Log.e(str3, "Can't send error.", th);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = "Can't close connection.";
                        str3 = AudienceNetworkAds.TAG;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str2 = "Can't close connection.";
                    str3 = AudienceNetworkAds.TAG;
                    dataOutputStream = null;
                    httpURLConnection = null;
                }
            }
        }.start();
    }
}
