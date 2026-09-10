package com.bytedance.sdk.component.xha.lr;

import android.text.TextUtils;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.sf;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik {
    int di;
    String fi;
    protected sf ik;
    private List<String> lr;
    protected String ka = null;
    protected final Map<String, String> xha = new HashMap();
    protected String mj = null;
    private String ri = null;
    private long qt = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
    protected boolean jbs = false;

    public ik(sf sfVar) {
        this.ik = sfVar;
        try {
            ka(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public String fi() {
        return this.mj;
    }

    public String ik() {
        return this.ri;
    }

    public void ka(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.xha.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void lr(String str) {
        this.fi = str;
    }

    public void ri(List<String> list) {
        this.lr = list;
    }

    public void ik(String str) {
        this.mj = str;
    }

    public void lr(String str, String str2) {
        this.xha.put(str, str2);
    }

    public void ri(long j, TimeUnit timeUnit) {
        this.qt = timeUnit.toMillis(j);
    }

    public void ka(String str) {
        this.ka = str;
    }

    public void lr() {
        sf sfVar;
        if (this.ka == null || (sfVar = this.ik) == null) {
            return;
        }
        com.bytedance.sdk.component.lr.ri.ka kaVarRi = sfVar.ri();
        synchronized (kaVarRi) {
            try {
                for (com.bytedance.sdk.component.lr.ri.lr lrVar : kaVarRi.ik()) {
                    if (this.ka.equals(lrVar.ri().ik())) {
                        lrVar.ik();
                    }
                }
                for (com.bytedance.sdk.component.lr.ri.lr lrVar2 : kaVarRi.ka()) {
                    if (this.ka.equals(lrVar2.ri().ik())) {
                        lrVar2.ik();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ri(co.ri riVar) {
        if (com.bytedance.sdk.component.xha.ri.di()) {
            List<String> list = this.lr;
            if (list != null && !list.isEmpty()) {
                riVar.ri(this.lr);
            }
            riVar.ri(this.qt);
        }
    }

    public String ka() {
        return this.ka;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void ri(int i) {
        this.di = i;
    }

    public void lr(co.ri riVar) {
        if (riVar != null && this.xha.size() > 0) {
            for (Map.Entry<String, String> entry : this.xha.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    riVar.lr(key, value);
                }
            }
        }
    }
}
