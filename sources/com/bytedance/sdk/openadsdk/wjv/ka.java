package com.bytedance.sdk.openadsdk.wjv;

import android.text.TextUtils;
import com.ironsource.A5;
import com.ironsource.C3460cc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private di ik;
    private ri ka;
    private ik lr;
    private final String ri = "StrategyCenter";
    private int fi = 0;
    private final ConcurrentHashMap<String, Object> di = new ConcurrentHashMap<>();
    private Runnable xha = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wjv.ka.2
        @Override // java.lang.Runnable
        public void run() {
            ka.this.lr();
        }
    };

    public ka(di diVar) {
        this.lr = null;
        xha xhaVar = new xha(diVar);
        this.ik = xhaVar;
        String strIk = xhaVar.ik();
        if (!TextUtils.isEmpty(strIk) && !strIk.startsWith("pag")) {
            strIk = "pag_".concat(strIk);
        }
        this.lr = new ik(this.ik.lr(), strIk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik() {
        this.di.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        di diVar = this.ik;
        if (diVar == null || diVar.fi() == null || this.ik.di() == null || this.ik.mj()) {
            return;
        }
        this.ik.ri().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wjv.ka.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                ka.this.fi++;
                try {
                    if (ka.this.ka != null) {
                        ka.this.ka.ri();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ka.this.ik.fi()).openConnection();
                    if (ka.this.ik.xha() != null && ka.this.ik.xha().size() > 0) {
                        for (Map.Entry<String, String> entry : ka.this.ik.xha().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod(C3460cc.b);
                    httpURLConnection.setRequestProperty("Content-Type", A5.M);
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(ka.this.ik.di().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectRi = ka.this.ik.ri(new JSONObject(stringBuffer.toString()));
                                ka.this.lr.ri();
                                ka.this.ik();
                                ka.this.lr.ri(jSONObjectRi);
                                if (ka.this.ka != null) {
                                    ka.this.ka.lr();
                                }
                            } else if (ka.this.ka != null) {
                                ka.this.ka.ri(responseCode, httpURLConnection.getResponseMessage());
                            }
                            ka.this.lr.ri("local_last_update_time", System.currentTimeMillis());
                            ka.this.ri();
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (Throwable th3) {
                    if (th3.getMessage() != null) {
                        th3.getMessage();
                    }
                    if (ka.this.ka != null) {
                        ka.this.ka.ri(-1, th3.getMessage());
                    }
                }
            }
        });
    }

    public void ri(ri riVar) {
        this.ka = riVar;
    }

    public void ri() {
        if (this.ik != null) {
            int i = 3600000;
            int iRi = this.lr.ri("req_interval", 3600000);
            long j = 0;
            long jLr = this.lr.lr("local_last_update_time", 0L);
            if (iRi >= 600000 && iRi <= 86400000) {
                i = iRi;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jLr;
            "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis));
            if (jCurrentTimeMillis >= 0) {
                long j2 = i;
                if (jCurrentTimeMillis <= j2) {
                    j = j2 - jCurrentTimeMillis;
                }
            }
            "after  realInterval=".concat(String.valueOf(j));
            this.ik.ka().removeCallbacks(this.xha);
            if (this.fi > 24) {
                return;
            }
            this.ik.ka().postDelayed(this.xha, j);
        }
    }

    public int ri(String str, int i) {
        ik ikVar = this.lr;
        return ikVar == null ? i : ikVar.ri(str, i);
    }

    public String ri(String str, String str2) {
        ik ikVar = this.lr;
        return ikVar == null ? str2 : ikVar.ri(str, str2);
    }

    public boolean ri(String str, boolean z) {
        ik ikVar = this.lr;
        return ikVar == null ? z : ikVar.ri(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r4.getClass().isInstance(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T ri(java.lang.String r3, T r4, com.bytedance.sdk.openadsdk.wjv.lr.ri<T> r5) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.wjv.ik r0 = r2.lr
            if (r0 == 0) goto L2c
            if (r3 != 0) goto L7
            goto L2c
        L7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.di
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L1c
            if (r4 == 0) goto L1b
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L1c
            boolean r1 = r1.isInstance(r0)     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L1c
        L1b:
            return r0
        L1c:
            if (r5 == 0) goto L2c
            com.bytedance.sdk.openadsdk.wjv.ik r0 = r2.lr     // Catch: java.lang.Exception -> L2c
            java.lang.Object r5 = r0.ri(r3, r4, r5)     // Catch: java.lang.Exception -> L2c
            if (r5 == 0) goto L2c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.di     // Catch: java.lang.Exception -> L2c
            r0.put(r3, r5)     // Catch: java.lang.Exception -> L2c
            return r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.wjv.ka.ri(java.lang.String, java.lang.Object, com.bytedance.sdk.openadsdk.wjv.lr$ri):java.lang.Object");
    }
}
