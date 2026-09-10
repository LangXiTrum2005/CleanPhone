package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.bh;
import com.umeng.analytics.pro.bl;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2659a = "10.0.0.172";
    private int b = 80;
    private Context c;

    public c(Context context) {
        this.c = context;
    }

    public void a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.c, "sl_domain_p", "");
        if (TextUtils.isEmpty(strImprintProperty)) {
            return;
        }
        a.h = DataHelper.assembleStatelessURL(strImprintProperty);
    }

    public void b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.c, "sl_domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            a.g = DataHelper.assembleStatelessURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            a.j = DataHelper.assembleStatelessURL(strImprintProperty2);
        }
        a.h = a.j;
        if (TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.b)) {
            return;
        }
        if (com.umeng.commonsdk.statistics.b.b.startsWith("460") || com.umeng.commonsdk.statistics.b.b.startsWith("461")) {
            a.h = a.g;
        }
    }

    public boolean a(byte[] bArr, String str, String str2, String str3) throws Throwable {
        String strI = DM.i(str2, "/", str);
        if (SdkVersion.SDK_TYPE == 1) {
            return a(bArr, strI, str3);
        }
        if (bh.a().b()) {
            String strReplace = strI.replace("ulogs", "cnlogs");
            String strC = bl.b().c();
            if (!TextUtils.isEmpty(strC)) {
                strReplace = bh.a(strC, str);
            }
            boolean zA = a(bArr, strReplace, str3);
            if (!zA) {
                String strA = bh.a().a(str);
                if (!TextUtils.isEmpty(strA) && !strReplace.equalsIgnoreCase(strA)) {
                    return a(bArr, strA, str3);
                }
            }
            return zA;
        }
        return a(bArr, strI, str3);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[SYNTHETIC] */
    private boolean a(byte[] bArr, String str, String str2) throws Throwable {
        OutputStream outputStream;
        HttpsURLConnection httpsURLConnection;
        boolean z = true;
        if (bArr != null && !TextUtils.isEmpty(str)) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "[无状态] 上报url：" + str);
            HttpsURLConnection httpsURLConnection2 = null;
            outputStream = null;
            outputStream = null;
            OutputStream outputStream2 = null;
            try {
                try {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                    try {
                        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                        httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                        httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                        httpsURLConnection.setRequestProperty("Content-Type", bc.aW + str2);
                        httpsURLConnection.setRequestProperty("SM-IMP", "1");
                        httpsURLConnection.setRequestProperty("User-Agent", DeviceConfig.getCustomAgt());
                        httpsURLConnection.setConnectTimeout(30000);
                        httpsURLConnection.setReadTimeout(30000);
                        httpsURLConnection.setRequestMethod("POST");
                        httpsURLConnection.setDoOutput(true);
                        httpsURLConnection.setDoInput(true);
                        httpsURLConnection.setUseCaches(false);
                        outputStream2 = httpsURLConnection.getOutputStream();
                        outputStream2.write(bArr);
                        outputStream2.flush();
                        httpsURLConnection.connect();
                        if (httpsURLConnection.getResponseCode() == 200) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send stateless message success : " + str);
                        } else {
                            z = false;
                        }
                        try {
                            outputStream2.close();
                        } catch (Exception unused) {
                        }
                        try {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                            httpsURLConnection.disconnect();
                        } catch (Throwable unused2) {
                        }
                        return z;
                    } catch (SSLHandshakeException e) {
                        e = e;
                        try {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "SSLHandshakeException, Failed to send message.\n" + e);
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (httpsURLConnection == null) {
                                return false;
                            }
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                            httpsURLConnection.disconnect();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            outputStream = outputStream2;
                            httpsURLConnection2 = httpsURLConnection;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Exception unused4) {
                                }
                            }
                            if (httpsURLConnection2 != null) {
                                try {
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                                    httpsURLConnection2.disconnect();
                                    throw th;
                                } catch (Throwable unused5) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = outputStream2;
                        httpsURLConnection2 = httpsURLConnection;
                        try {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "Exception,Failed to send message.\n" + th);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Exception unused6) {
                                }
                            }
                            if (httpsURLConnection2 == null) {
                                return false;
                            }
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                            httpsURLConnection2.disconnect();
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpsURLConnection2 != null) {
                                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                                httpsURLConnection2.disconnect();
                                throw th;
                            }
                            throw th;
                        }
                    }
                } catch (SSLHandshakeException e2) {
                    e = e2;
                    httpsURLConnection = null;
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = null;
                }
            } catch (Throwable unused7) {
                return false;
            }
        } else {
            ULog.i("walle", "[stateless] sendMessage, envelopeByte == null || url is empty ");
            return false;
        }
    }
}
