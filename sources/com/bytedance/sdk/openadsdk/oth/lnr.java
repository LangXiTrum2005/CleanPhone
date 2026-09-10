package com.bytedance.sdk.openadsdk.oth;

import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.ko;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    private mml lnr;
    private qdl mml;
    private ud ud;
    private final String qdl = "StrategyCenter";
    private int mzz = 0;
    private Runnable mo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.oth.lnr.2
        @Override // java.lang.Runnable
        public void run() {
            lnr.this.ud();
        }
    };

    public lnr(mml mmlVar) {
        this.ud = null;
        mzz mzzVar = new mzz(mmlVar);
        this.lnr = mzzVar;
        String strLnr = mzzVar.lnr();
        if (!TextUtils.isEmpty(strLnr) && !strLnr.startsWith("pag")) {
            strLnr = "pag_".concat(strLnr);
        }
        this.ud = new ud(this.lnr.ud(), strLnr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud() {
        mml mmlVar = this.lnr;
        if (mmlVar == null || mmlVar.mzz() == null || this.lnr.mo() == null) {
            return;
        }
        this.lnr.qdl().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oth.lnr.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                lnr.this.mzz++;
                try {
                    if (lnr.this.mml != null) {
                        lnr.this.mml.qdl();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(lnr.this.lnr.mzz()).openConnection();
                    if (lnr.this.lnr.wd() != null && lnr.this.lnr.wd().size() > 0) {
                        for (Map.Entry<String, String> entry : lnr.this.lnr.wd().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod(ko.f25535b);
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(lnr.this.lnr.mo().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
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
                                JSONObject jSONObjectQdl = lnr.this.lnr.qdl(new JSONObject(stringBuffer.toString()));
                                lnr.this.ud.qdl();
                                lnr.this.ud.qdl(jSONObjectQdl);
                                if (lnr.this.mml != null) {
                                    lnr.this.mml.ud();
                                }
                            } else if (lnr.this.mml != null) {
                                lnr.this.mml.qdl(responseCode, httpURLConnection.getResponseMessage());
                            }
                            lnr.this.ud.qdl("local_last_update_time", System.currentTimeMillis());
                            lnr.this.qdl();
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
                    Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (lnr.this.mml != null) {
                        lnr.this.mml.qdl(-1, th3.getMessage());
                    }
                }
            }
        });
    }

    public void qdl(qdl qdlVar) {
        this.mml = qdlVar;
    }

    public void qdl() {
        if (this.lnr != null) {
            int i2 = 3600000;
            int iQdl = this.ud.qdl("req_interval", 3600000);
            long j = 0;
            long jUd = this.ud.ud("local_last_update_time", 0L);
            if (iQdl >= 600000 && iQdl <= 86400000) {
                i2 = iQdl;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jUd;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j2 = i2;
                if (jCurrentTimeMillis <= j2) {
                    j = j2 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j)));
            this.lnr.mml().removeCallbacks(this.mo);
            if (this.mzz > 24) {
                return;
            }
            this.lnr.mml().postDelayed(this.mo, j);
        }
    }

    public int qdl(String str, int i2) {
        ud udVar = this.ud;
        return udVar == null ? i2 : udVar.qdl(str, i2);
    }

    public String qdl(String str, String str2) {
        ud udVar = this.ud;
        return udVar == null ? str2 : udVar.qdl(str, str2);
    }

    public boolean qdl(String str, boolean z2) {
        ud udVar = this.ud;
        return udVar == null ? z2 : udVar.qdl(str, z2);
    }
}
