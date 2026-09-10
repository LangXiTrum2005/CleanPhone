package com.bytedance.sdk.openadsdk.Sfi;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private LD LD;
    private Lxb ZU;
    private ZU lk;
    private final String Lxb = "StrategyCenter";
    private int JXs = 0;
    private Runnable lc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.Sfi.lk.2
        @Override // java.lang.Runnable
        public void run() {
            lk.this.LD();
        }
    };

    public lk(ZU zu) {
        this.LD = null;
        JXs jXs = new JXs(zu);
        this.lk = jXs;
        String strLk = jXs.lk();
        if (!TextUtils.isEmpty(strLk) && !strLk.startsWith("pag")) {
            strLk = "pag_".concat(strLk);
        }
        this.LD = new LD(this.lk.LD(), strLk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD() {
        ZU zu = this.lk;
        if (zu == null || zu.JXs() == null || this.lk.lc() == null) {
            return;
        }
        this.lk.Lxb().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Sfi.lk.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                lk.this.JXs++;
                try {
                    if (lk.this.ZU != null) {
                        lk.this.ZU.Lxb();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(lk.this.lk.JXs()).openConnection();
                    if (lk.this.lk.ebl() != null && lk.this.lk.ebl().size() > 0) {
                        for (Map.Entry<String, String> entry : lk.this.lk.ebl().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(lk.this.lk.lc().toString().getBytes());
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
                                JSONObject jSONObjectLxb = lk.this.lk.Lxb(new JSONObject(stringBuffer.toString()));
                                lk.this.LD.Lxb();
                                lk.this.LD.Lxb(jSONObjectLxb);
                                if (lk.this.ZU != null) {
                                    lk.this.ZU.LD();
                                }
                            } else if (lk.this.ZU != null) {
                                lk.this.ZU.Lxb(responseCode, httpURLConnection.getResponseMessage());
                            }
                            lk.this.LD.Lxb("local_last_update_time", System.currentTimeMillis());
                            lk.this.Lxb();
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
                    if (lk.this.ZU != null) {
                        lk.this.ZU.Lxb(-1, th3.getMessage());
                    }
                }
            }
        });
    }

    public void Lxb(Lxb lxb) {
        this.ZU = lxb;
    }

    public void Lxb() {
        if (this.lk != null) {
            int i = 3600000;
            int iLxb = this.LD.Lxb("req_interval", 3600000);
            long j = 0;
            long jLD = this.LD.LD("local_last_update_time", 0L);
            if (iLxb >= 600000 && iLxb <= 86400000) {
                i = iLxb;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jLD;
            "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis));
            if (jCurrentTimeMillis >= 0) {
                long j2 = i;
                if (jCurrentTimeMillis <= j2) {
                    j = j2 - jCurrentTimeMillis;
                }
            }
            "after  realInterval=".concat(String.valueOf(j));
            this.lk.ZU().removeCallbacks(this.lc);
            if (this.JXs > 24) {
                return;
            }
            this.lk.ZU().postDelayed(this.lc, j);
        }
    }

    public int Lxb(String str, int i) {
        LD ld = this.LD;
        return ld == null ? i : ld.Lxb(str, i);
    }

    public String Lxb(String str, String str2) {
        LD ld = this.LD;
        return ld == null ? str2 : ld.Lxb(str, str2);
    }

    public boolean Lxb(String str, boolean z) {
        LD ld = this.LD;
        return ld == null ? z : ld.Lxb(str, z);
    }
}
