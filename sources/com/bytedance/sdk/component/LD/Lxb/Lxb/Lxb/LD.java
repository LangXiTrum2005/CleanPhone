package com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb;

import android.text.TextUtils;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import com.bytedance.sdk.component.LD.Lxb.STP;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements com.bytedance.sdk.component.LD.Lxb.LD {
    com.bytedance.sdk.component.LD.Lxb.ZU LD;
    NXR Lxb;
    private AtomicBoolean lk = new AtomicBoolean(false);

    public LD(NXR nxr, com.bytedance.sdk.component.LD.Lxb.ZU zu) {
        this.Lxb = nxr;
        this.LD = zu;
    }

    private boolean JXs() {
        if (this.Lxb.ZU() == null) {
            return false;
        }
        return this.Lxb.ZU().containsKey("Content-Type");
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD
    public IeN LD() throws IOException {
        List<com.bytedance.sdk.component.LD.Lxb.OY> list;
        com.bytedance.sdk.component.lk.Lxb.Lxb lxb;
        NXR nxr = this.Lxb;
        if (nxr != null && (lxb = nxr.LD) != null) {
            if (lxb.STP() == 0) {
                this.Lxb.LD.IeN();
            }
            this.Lxb.LD.Lxb();
        }
        this.LD.lk().remove(this);
        this.LD.ZU().add(this);
        com.bytedance.sdk.component.LD.Lxb.ZU zu = this.LD;
        if (zu instanceof JXs) {
            if (this.LD.ZU().size() + zu.lk().size() > this.LD.Lxb() || this.lk.get()) {
                this.LD.ZU().remove(this);
                return new ebl(ebl.Lxb, "Maximum number of requests exceeded", this.Lxb);
            }
        }
        try {
            JVA jva = this.Lxb.Lxb;
            if (jva == null || (list = jva.Lxb) == null || list.size() <= 0) {
                return Lxb(this.Lxb);
            }
            ArrayList arrayList = new ArrayList(this.Lxb.Lxb.Lxb);
            arrayList.add(new com.bytedance.sdk.component.LD.Lxb.OY() { // from class: com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb.LD.1
                @Override // com.bytedance.sdk.component.LD.Lxb.OY
                public IeN Lxb(com.bytedance.sdk.component.LD.Lxb.OY.Lxb lxb2) throws IOException {
                    return LD.this.Lxb(lxb2.Lxb());
                }
            });
            return ((com.bytedance.sdk.component.LD.Lxb.OY) arrayList.get(0)).Lxb(new lk(arrayList, this.Lxb));
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD
    public NXR Lxb() {
        return this.Lxb;
    }

    /* JADX INFO: renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.LD.Lxb.LD clone() {
        return new LD(this.Lxb, this.LD);
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD
    public void lk() {
        this.lk.set(true);
    }

    private boolean Lxb(STP stp) {
        NXR nxr;
        byte[] bArr;
        return stp != null && (nxr = this.Lxb) != null && "POST".equalsIgnoreCase(nxr.lk()) && stp.lc == STP.Lxb.BYTE_ARRAY_TYPE && (bArr = stp.JXs) != null && bArr.length > 0;
    }

    public IeN Lxb(NXR nxr) throws IOException {
        HttpURLConnection httpURLConnection;
        Exception e;
        String message;
        int responseCode = ebl.Lxb;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(nxr.LD().Lxb().toString()).openConnection();
                try {
                    if (nxr.ZU() != null && nxr.ZU().size() > 0) {
                        for (Map.Entry<String, List<String>> entry : nxr.ZU().entrySet()) {
                            String key = entry.getKey();
                            for (String str : entry.getValue()) {
                                if ("_disable_retry".equals(key) && "1".equals(str)) {
                                    Lxb(httpURLConnection);
                                } else {
                                    httpURLConnection.addRequestProperty(key, str);
                                }
                            }
                        }
                    }
                    JVA jva = nxr.Lxb;
                    if (jva != null) {
                        TimeUnit timeUnit = jva.lk;
                        if (timeUnit != null) {
                            httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(jva.LD));
                        }
                        JVA jva2 = nxr.Lxb;
                        if (jva2.lk != null) {
                            httpURLConnection.setReadTimeout((int) jva2.JXs.toMillis(jva2.ZU));
                        }
                    }
                    if (nxr.OY() == null) {
                        httpURLConnection.setRequestMethod("GET");
                    } else {
                        if (!JXs() && nxr.OY().lk != null) {
                            httpURLConnection.addRequestProperty("Content-Type", nxr.OY().lk.Lxb());
                        }
                        httpURLConnection.setRequestMethod(nxr.lk());
                        if ("POST".equalsIgnoreCase(nxr.lk())) {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            if (Lxb(nxr.OY())) {
                                outputStream.write(nxr.OY().JXs);
                            } else if (LD(nxr.OY())) {
                                outputStream.write(nxr.OY().ZU.getBytes());
                            }
                            outputStream.flush();
                            outputStream.close();
                        }
                    }
                    com.bytedance.sdk.component.lk.Lxb.Lxb lxb = nxr.LD;
                    if (lxb != null) {
                        lxb.LD();
                    }
                    httpURLConnection.connect();
                    com.bytedance.sdk.component.lk.Lxb.Lxb lxb2 = nxr.LD;
                    if (lxb2 != null) {
                        lxb2.lk();
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    com.bytedance.sdk.component.lk.Lxb.Lxb lxb3 = nxr.LD;
                    if (lxb3 != null) {
                        lxb3.JXs();
                    }
                    if (this.lk.get()) {
                        httpURLConnection.disconnect();
                        this.LD.ZU().remove(this);
                        message = "internal error";
                        return new ebl(responseCode, message, nxr);
                    }
                    ebl eblVar = new ebl(httpURLConnection, nxr);
                    this.LD.ZU().remove(this);
                    return eblVar;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        message = httpURLConnection.getErrorStream().toString();
                    } catch (Throwable unused) {
                        message = e.getMessage();
                    }
                    this.LD.ZU().remove(this);
                }
            } catch (Exception e3) {
                httpURLConnection = null;
                e = e3;
            }
        } catch (Throwable th) {
            this.LD.ZU().remove(this);
            throw th;
        }
    }

    private boolean LD(STP stp) {
        NXR nxr;
        return (stp == null || (nxr = this.Lxb) == null || !"POST".equalsIgnoreCase(nxr.lk()) || stp.lc != STP.Lxb.STRING_TYPE || TextUtils.isEmpty(stp.ZU)) ? false : true;
    }

    private static void Lxb(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD
    public void Lxb(final com.bytedance.sdk.component.LD.Lxb.lk lkVar) {
        com.bytedance.sdk.component.lk.Lxb.Lxb lxb;
        NXR nxr = this.Lxb;
        if (nxr != null && (lxb = nxr.LD) != null) {
            lxb.IeN();
        }
        this.LD.LD().submit(new com.bytedance.sdk.component.OY.lk.LD(this.Lxb.ebl(), this.Lxb.lc()) { // from class: com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb.LD.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    IeN ieNLD = LD.this.LD();
                    if (ieNLD == null) {
                        lkVar.Lxb(LD.this, new IOException("response is null"));
                    } else {
                        lkVar.Lxb(LD.this, ieNLD);
                    }
                } catch (IOException e) {
                    lkVar.Lxb(LD.this, e);
                }
            }
        });
    }
}
