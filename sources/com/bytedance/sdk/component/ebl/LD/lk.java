package com.bytedance.sdk.component.ebl.LD;

import android.text.TextUtils;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lk {
    String JXs;
    int lc;
    protected JVA lk;
    protected String ZU = null;
    protected final Map<String, String> ebl = new HashMap();
    protected String OY = null;
    protected boolean QAg = false;

    public lk(JVA jva) {
        this.lk = jva;
        try {
            lk(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void LD(String str) {
        this.OY = str;
    }

    public void Lxb(String str) {
        this.JXs = str;
    }

    public void ZU(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.ebl.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void lk(String str) {
        this.ZU = str;
    }

    public void LD(String str, String str2) {
        this.ebl.put(str, str2);
    }

    public void Lxb(int i) {
        this.lc = i;
    }

    public String lk() {
        return this.ZU;
    }

    public void LD() {
        JVA jva;
        if (this.ZU == null || (jva = this.lk) == null) {
            return;
        }
        com.bytedance.sdk.component.LD.Lxb.ZU zuLxb = jva.Lxb();
        synchronized (zuLxb) {
            try {
                for (com.bytedance.sdk.component.LD.Lxb.LD ld : zuLxb.lk()) {
                    if (this.ZU.equals(ld.Lxb().Lxb())) {
                        ld.lk();
                    }
                }
                for (com.bytedance.sdk.component.LD.Lxb.LD ld2 : zuLxb.ZU()) {
                    if (this.ZU.equals(ld2.Lxb().Lxb())) {
                        ld2.lk();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Lxb(NXR.Lxb lxb) {
        if (lxb != null && this.ebl.size() > 0) {
            for (Map.Entry<String, String> entry : this.ebl.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    lxb.LD(key, value);
                }
            }
        }
    }
}
