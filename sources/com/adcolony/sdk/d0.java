package com.adcolony.sdk;

import com.p004ironsource.ko;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private URL f9127a;

    public d0(URL url) {
        this.f9127a = url;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    public int a(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        DataOutputStream dataOutputStream2 = null;
        httpURLConnection = null;
        boolean z2 = false;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f9127a.openConnection();
            try {
                httpURLConnection2.setRequestMethod(ko.f25535b);
                httpURLConnection2.setRequestProperty("Content-Encoding", com.smartdigimkt.o0.b.d);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                httpURLConnection2.setDoInput(true);
                gZIPOutputStream = new GZIPOutputStream(httpURLConnection2.getOutputStream());
                try {
                    dataOutputStream = new DataOutputStream(gZIPOutputStream);
                    try {
                        dataOutputStream.write(str.getBytes(h.f9168a));
                        dataOutputStream.close();
                        try {
                            int responseCode = httpURLConnection2.getResponseCode();
                            gZIPOutputStream.close();
                            if (httpURLConnection2.getInputStream() != null) {
                                httpURLConnection2.getInputStream().close();
                            }
                            httpURLConnection2.disconnect();
                            return responseCode;
                        } catch (IOException e2) {
                            e = e2;
                            z2 = true;
                            httpURLConnection = httpURLConnection2;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection2 = httpURLConnection;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 != null && !z2) {
                                    dataOutputStream2.close();
                                }
                                if (gZIPOutputStream != null) {
                                    gZIPOutputStream.close();
                                }
                                if (httpURLConnection2 != null) {
                                    if (httpURLConnection2.getInputStream() != null) {
                                        httpURLConnection2.getInputStream().close();
                                    }
                                    httpURLConnection2.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = true;
                            dataOutputStream2 = dataOutputStream;
                            if (dataOutputStream2 != null) {
                                dataOutputStream2.close();
                            }
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (httpURLConnection2 != null) {
                                if (httpURLConnection2.getInputStream() != null) {
                                    httpURLConnection2.getInputStream().close();
                                }
                                httpURLConnection2.disconnect();
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    dataOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    if (dataOutputStream2 != null) {
                        dataOutputStream2.close();
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    if (httpURLConnection2 != null) {
                        if (httpURLConnection2.getInputStream() != null) {
                            httpURLConnection2.getInputStream().close();
                        }
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                gZIPOutputStream = null;
                dataOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                gZIPOutputStream = null;
                dataOutputStream = null;
                httpURLConnection = httpURLConnection2;
                httpURLConnection2 = httpURLConnection;
                dataOutputStream2 = dataOutputStream;
                if (dataOutputStream2 != null) {
                    dataOutputStream2.close();
                }
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                if (httpURLConnection2 != null) {
                    if (httpURLConnection2.getInputStream() != null) {
                        httpURLConnection2.getInputStream().close();
                    }
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            gZIPOutputStream = null;
            dataOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            gZIPOutputStream = null;
            dataOutputStream = null;
        }
    }
}
