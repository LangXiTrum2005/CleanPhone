package com.smartdigimkt.o;

import android.net.Uri;
import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.download.Command;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k {
    private static final String d = "SocketSpider";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f37256e = 2;
    private static final byte f = 3;
    private static volatile AtomicInteger g = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.n1.a f37257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37259c = 9377;

    public k() {
        com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
        this.f37257a = aVarC;
        if (aVarC == null) {
            this.f37257a = com.smartdigimkt.n1.b.b().a();
        }
    }

    private JSONObject b(String str, com.smartdigimkt.x.d dVar, boolean z2, boolean z3) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                String encodedQuery = uri.getEncodedQuery();
                this.f37258b = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z2 && !z3) {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.c.w());
            }
            if (dVar != null) {
                if (z2 && dVar.z2() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.c.w());
                }
                if (z3 && dVar.O0() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.c.w());
                }
            } else {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.c.w());
            }
            jSONObject2.put("Accept-Encoding", com.smartdigimkt.o0.b.d);
            if (this.f37257a.u1() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put(com.smartdigimkt.x.g.f39716B, jSONObject2);
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return jSONObject;
    }

    public com.smartdigimkt.p.a a(String str, com.smartdigimkt.x.d dVar, boolean z2, boolean z3) {
        com.smartdigimkt.p.a aVar = new com.smartdigimkt.p.a();
        aVar.g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f37478h = "request url can not null.";
            return aVar;
        }
        String strReplace = str.replace(" ", "%20");
        JSONObject jSONObjectB = b(strReplace, dVar, z2, z3);
        if (jSONObjectB.length() == 0) {
            aVar.f37478h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(jSONObjectB.optString("uri"))) {
            aVar.f37478h = "request url parse error.";
            return aVar;
        }
        if (dVar != null) {
            int iH2 = dVar.h2();
            if (iH2 == 0) {
                iH2 = 9377;
            }
            this.f37259c = iH2;
        }
        if (!TextUtils.isEmpty(this.f37258b)) {
            return a(strReplace, jSONObjectB.toString());
        }
        aVar.f37478h = "request url parse error.";
        return aVar;
    }

    private com.smartdigimkt.p.a a(String str, String str2) {
        OutputStream outputStream;
        String str3;
        com.smartdigimkt.p.a aVar = new com.smartdigimkt.p.a();
        Socket socket = null;
        OutputStream outputStream2 = null;
        try {
            Socket socket2 = new Socket(this.f37258b, this.f37259c);
            try {
                socket2.setSoTimeout(15000);
                outputStream2 = socket2.getOutputStream();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferWrap.order(byteOrder);
                byteBufferWrap.put((byte) 2);
                byteBufferWrap.put((byte) 3);
                byteBufferWrap.putShort((short) g.getAndIncrement());
                if (TextUtils.isEmpty(str2)) {
                    byteBufferWrap.putInt(0);
                    outputStream2.write(byteBufferWrap.array());
                } else {
                    byte[] bArrA = a(str2);
                    byteBufferWrap.putInt(bArrA.length);
                    outputStream2.write(byteBufferWrap.array());
                    outputStream2.write(bArrA);
                }
                outputStream2.flush();
                Arrays.toString(byteBufferWrap.array());
                InputStream inputStream = socket2.getInputStream();
                byte[] bArr = new byte[8];
                inputStream.read(bArr, 0, 8);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                byteBufferWrap2.order(byteOrder);
                int i2 = byteBufferWrap2.getInt(4);
                byte b2 = bArr[1];
                boolean z2 = b2 == 3;
                boolean z3 = b2 == 2;
                Arrays.toString(bArr);
                byte[] bArr2 = new byte[i2];
                new DataInputStream(socket2.getInputStream()).readFully(bArr2);
                boolean z4 = z2;
                z4 = z2;
                if (!z2 && i2 > 2 && ((bArr2[0] << 8) | (bArr2[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 8075) {
                    z4 = z2;
                    z4 = true;
                }
                z4 = z2;
                if (z3 && i2 == 0) {
                    aVar.f = 200;
                    aVar.g = str;
                    aVar.f37477e = 0;
                    try {
                        socket2.close();
                        outputStream2.close();
                        return aVar;
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                } else if (i2 < 1) {
                    aVar.f = 200;
                    aVar.g = str;
                    aVar.f37477e = 0;
                    try {
                        socket2.close();
                        outputStream2.close();
                        return aVar;
                    } catch (Exception e3) {
                        e3.getMessage();
                    }
                } else {
                    try {
                        if (z4) {
                            str3 = a(bArr2);
                        } else {
                            str3 = new String(bArr2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            aVar.f = 200;
                            aVar.g = str;
                            aVar.f37477e = 0;
                            try {
                                JSONObject jSONObjectOptJSONObject = new JSONObject(str3).optJSONObject("data");
                                if (jSONObjectOptJSONObject != null) {
                                    String strOptString = jSONObjectOptJSONObject.optString("location");
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        aVar.f = 302;
                                        aVar.f37474a = strOptString;
                                    }
                                }
                            } catch (Throwable th) {
                                th.getMessage();
                            }
                            try {
                                socket2.close();
                                outputStream2.close();
                            } catch (Exception e4) {
                                e4.getMessage();
                            }
                        } else {
                            inputStream.close();
                            try {
                                socket2.close();
                                outputStream2.close();
                            } catch (Exception e5) {
                                e5.getMessage();
                            }
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                        aVar.f37478h = th2.getMessage();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = outputStream2;
                socket = socket2;
                try {
                    th.getMessage();
                    aVar.f37478h = th.getMessage();
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Exception e6) {
                            e6.getMessage();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
        return aVar;
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i2 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i2 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i2);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
