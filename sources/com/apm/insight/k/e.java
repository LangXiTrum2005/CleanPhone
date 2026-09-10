package com.apm.insight.k;

import android.text.TextUtils;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.p004ironsource.ko;
import com.p004ironsource.ne;
import com.zg.adlib.storage.AppPreferencesKeys;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10186a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.apm.insight.b.h.a f10187b;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        private int d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static a f10190c = new a("NONE", 0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10188a = new a("GZIP", 1, 1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10189b = new a("DEFLATER", 2, 2);

        private a(String str, int i2, int i3) {
            super(str, i2);
            this.d = i3;
        }
    }

    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f10197l;

        b(int i2) {
            this.f10197l = i2;
        }
    }

    public static boolean a() {
        return false;
    }

    public static boolean b() {
        return false;
    }

    private static String c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str.concat("?");
                }
            } else if (!str.endsWith(d9.i.f24749c)) {
                str = str.concat(d9.i.f24749c);
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String d() {
        return com.apm.insight.e.i().getAlogUploadUrl();
    }

    public static String e() {
        return com.apm.insight.e.i().getLaunchCrashUploadUrl();
    }

    public static String f() {
        return com.apm.insight.e.i().getExceptionUploadUrl();
    }

    public static String g() {
        return com.apm.insight.e.i().getNativeCrashUploadUrl();
    }

    private static com.apm.insight.l.f a(String str, byte[] bArr, a aVar, String str2) throws IOException {
        String str3;
        if (Npth.isStopUpload()) {
            return new com.apm.insight.l.f(201);
        }
        if (str == null) {
            return new com.apm.insight.l.f(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (a.f10188a == aVar && length > 128) {
            bArr = a(bArr);
            str3 = com.smartdigimkt.o0.b.d;
        } else if (a.f10189b != aVar || length <= 128) {
            str3 = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Segment.SIZE);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[Segment.SIZE];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream.toByteArray();
            str3 = "deflate";
        }
        return bArr == null ? new com.apm.insight.l.f(202) : a(str, bArr, str2, str3, ko.f25535b);
    }

    public static com.apm.insight.l.f b(String str, String str2) {
        return d(str, str2);
    }

    private static com.apm.insight.l.f d(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return a(str, str2.getBytes(), a.f10188a, "application/json; charset=utf-8");
            }
            return new com.apm.insight.l.f(201);
        } catch (Throwable th) {
            com.apm.insight.a.b(th);
            return new com.apm.insight.l.f(207, th);
        }
    }

    private static com.apm.insight.l.f b(String str, String str2, File... fileArr) throws Throwable {
        if (Npth.isStopUpload()) {
            return new com.apm.insight.l.f(201);
        }
        try {
            i iVar = new i(c(str, "have_dump=true"), "UTF-8", true);
            iVar.b("json", str2);
            iVar.a(d9.h.f24719b, fileArr);
            try {
                return new com.apm.insight.l.f(new JSONObject(iVar.a()));
            } catch (JSONException e2) {
                return new com.apm.insight.l.f(0, e2);
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return new com.apm.insight.l.f(207);
        }
    }

    public static String c() {
        return com.apm.insight.e.i().getJavaCrashUploadUrl();
    }

    private static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Segment.SIZE);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                com.apm.insight.a.b(th);
                return null;
            } finally {
                gZIPOutputStream.close();
            }
        }
    }

    public static void a(com.apm.insight.b.h.a aVar) {
        f10187b = aVar;
    }

    private static com.apm.insight.l.f a(String str, byte[] bArr, String str2, String str3, String str4) {
        InputStream inputStream;
        byte[] bArrA;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream = null;
        try {
            com.apm.insight.b.h.a aVar = f10187b;
            if (aVar != null) {
                try {
                    str = aVar.c();
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setDoOutput(true);
                CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
                if (customRequestHeader != null) {
                    customRequestHeader.addRequestHeader(httpURLConnection2);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", com.smartdigimkt.o0.b.d);
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            com.apm.insight.a.a((Closeable) dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            com.apm.insight.a.a((Closeable) dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream2 = httpURLConnection2.getInputStream();
                    try {
                        if (com.smartdigimkt.o0.b.d.equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                            try {
                                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream2);
                                try {
                                    bArrA = a(gZIPInputStream2);
                                    com.apm.insight.a.a((Closeable) gZIPInputStream2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    gZIPInputStream = gZIPInputStream2;
                                    com.apm.insight.a.a((Closeable) gZIPInputStream);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            bArrA = a(inputStream2);
                        }
                        com.apm.insight.l.f fVar = new com.apm.insight.l.f(bArrA);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                        com.apm.insight.a.a((Closeable) inputStream2);
                        return fVar;
                    } catch (Throwable th5) {
                        httpURLConnection = httpURLConnection2;
                        inputStream = inputStream2;
                        th = th5;
                        try {
                            com.apm.insight.a.a(th);
                            return new com.apm.insight.l.f(207, th);
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused3) {
                                }
                            }
                            com.apm.insight.a.a((Closeable) inputStream);
                        }
                    }
                }
                com.apm.insight.l.f fVar2 = new com.apm.insight.l.f("http response code ".concat(String.valueOf(responseCode)));
                try {
                    httpURLConnection2.disconnect();
                } catch (Exception unused4) {
                }
                com.apm.insight.a.a((Closeable) null);
                return fVar2;
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    public static com.apm.insight.l.f a(String str, String str2) {
        return d(str, str2);
    }

    public static com.apm.insight.l.f a(String str, String str2, File... fileArr) {
        return b(str, str2, fileArr);
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            i iVar = new i(str, "UTF-8", false);
            iVar.a(fl.SESSION_HISTORY_KEY_AD_ID, str2);
            iVar.a(AppPreferencesKeys.DEVICE_ID, str3);
            iVar.a(ne.f26256E, d9.d);
            iVar.a("process_name", str4);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    HashMap map = new HashMap();
                    map.put("logtype", "alog");
                    map.put("scene", "Crash");
                    iVar.a(file.getName(), file, map);
                }
            }
            try {
                return new JSONObject(iVar.a()).optInt("errno", -1) == 200;
            } catch (JSONException unused) {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (-1 != i2) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    com.apm.insight.a.a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    public static byte[] a(String str, byte[] bArr) {
        try {
            TextUtils.isDigitsOnly(str);
            return a(str, bArr, a.f10188a, "application/json; charset=utf-8").b();
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
