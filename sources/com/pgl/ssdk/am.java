package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.ko;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f33418a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f33420c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33421e;
    private byte[] f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f33419b = null;
    private int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f33422h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33423i = 10000;
    private int j = 0;
    private int k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f33424l = true;
    private Runnable m = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.c() || am.this.j >= am.this.k) {
                return;
            }
            am.c(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.f33420c = context;
    }

    public static /* synthetic */ int c(am amVar) {
        int i2 = amVar.j;
        amVar.j = i2 + 1;
        return i2;
    }

    public abstract String a();

    public abstract void a(int i2, byte[] bArr);

    public static synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f33418a)) {
            f33418a = str;
        }
    }

    private void b() {
        Object obj;
        if (this.f33419b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f33418a)) {
                jSONObject.put("ipv6", f33418a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put("gaid", com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put(TtmlNode.TAG_REGION, an.a());
            Pair<Integer, String> pairA = aq.a(jSONObject.toString());
            if (pairA == null || (obj = pairA.first) == null || pairA.second == null) {
                return;
            }
            this.f33419b.addRequestProperty("cypher", String.valueOf(obj));
            this.f33419b.addRequestProperty("transfer-param", (String) pairA.second);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[Catch: all -> 0x00ca, PHI: r0
  0x00b6: PHI (r0v14 java.io.InputStream) = (r0v13 java.io.InputStream), (r0v20 java.io.InputStream) binds: [B:30:0x00b3, B:27:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ca, blocks: (B:3:0x0004, B:5:0x0010, B:10:0x001f, B:12:0x0038, B:14:0x0040, B:15:0x0044, B:17:0x004d, B:19:0x0060, B:21:0x007d, B:23:0x0080, B:24:0x0096, B:33:0x00b9, B:32:0x00b6, B:18:0x0058), top: B:48:0x0004 }] */
    public boolean c() {
        InputStream inputStream;
        try {
            String strA = an.a(this.f33420c);
            if (TextUtils.isEmpty(strA)) {
                an.b(this.f33420c);
                HttpURLConnection httpURLConnection = this.f33419b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    this.f33419b = null;
                }
                return false;
            }
            String strConcat = strA + a();
            if (!strConcat.startsWith("https://") && !strConcat.startsWith("http://")) {
                strConcat = "https://".concat(strConcat);
            }
            URL url = new URL(strConcat);
            if (this.f33424l) {
                this.f33419b = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            } else {
                this.f33419b = (HttpURLConnection) url.openConnection();
            }
            this.f33419b.setConnectTimeout(this.f33423i);
            this.f33419b.setReadTimeout(this.f33423i);
            a(this.d);
            b(this.f33421e);
            byte[] bArr = this.f;
            if (bArr != null && bArr.length > 0) {
                this.f33419b.setDoOutput(true);
                OutputStream outputStream = this.f33419b.getOutputStream();
                outputStream.write(this.f);
                outputStream.flush();
                outputStream.close();
            }
            this.f33419b.connect();
            try {
                this.g = this.f33419b.getResponseCode();
                inputStream = this.f33419b.getInputStream();
                try {
                    this.f33422h = a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable unused) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                inputStream = null;
            }
            a(this.g, this.f33422h);
            HttpURLConnection httpURLConnection2 = this.f33419b;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.f33419b = null;
            }
            return true;
        } catch (Throwable unused3) {
            HttpURLConnection httpURLConnection3 = this.f33419b;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
                this.f33419b = null;
            }
            an.b(this.f33420c);
            return false;
        }
    }

    private void a(int i2) throws ProtocolException {
        String str;
        if (i2 == 1) {
            str = ko.f25535b;
        } else if (i2 == 3) {
            str = "PUT";
        } else if (i2 == 4) {
            str = "DELETE";
        } else if (i2 != 5) {
            str = i2 != 6 ? ko.f25534a : "TRACE";
        } else {
            str = "HEAD";
        }
        this.f33419b.setRequestMethod(str);
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr, 0, 1024);
            if (i2 > 0) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public void a(int i2, int i3, byte[] bArr) {
        b(i2, i3, bArr);
        ar.a(this.m);
    }

    private void b(int i2) {
        String str;
        if (i2 != 1) {
            str = i2 != 2 ? "" : "application/octet-stream";
        } else {
            str = "application/json; charset=utf-8";
        }
        if (!str.isEmpty()) {
            this.f33419b.addRequestProperty("Content-Type", str);
        }
        String strB = an.b();
        if (strB != null) {
            this.f33419b.addRequestProperty("x-pangle-target-idc", strB);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase(com.smartdigimkt.d2.a.S)) {
                this.f33419b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            this.f33419b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    private void b(int i2, int i3, byte[] bArr) {
        this.d = i2;
        this.f33421e = i3;
        this.f = bArr;
    }
}
