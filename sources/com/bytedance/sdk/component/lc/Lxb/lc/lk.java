package com.bytedance.sdk.component.lc.Lxb.lc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.OY;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements LD {
    private final JXs LD;
    private final Context Lxb;

    @SuppressLint({"StaticFieldLeak"})
    public class Lxb extends com.bytedance.sdk.component.lc.Lxb.JXs.JXs {
        private final ZU LD;
        private final Map<String, String> ZU;
        private final String lk;

        private String lk(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.lk)) ? str.replace("{UID}", this.lk).replace("__UID__", this.lk) : str;
        }

        public String LD(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(lk.lk().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        public boolean Lxb(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.lc.Lxb.JXs.ZU zuLxb;
            com.bytedance.sdk.component.lc.Lxb.JXs jXsVVE = OY.ebl().VVE();
            if (jXsVVE == null || OY.ebl().lc() == null || !jXsVVE.lk() || !Lxb(this.LD.LD())) {
                return;
            }
            if (this.LD.ZU() >= jXsVVE.lk(this.LD.lc())) {
                lk.this.LD.lk(this.LD);
                return;
            }
            try {
                jXsVVE.NXR();
                if (this.LD.JVA()) {
                    lk.this.LD.Lxb(this.LD);
                }
                if (jXsVVE.Lxb(lk.this.Lxb())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strLD = this.LD.LD();
                    if (jXsVVE.lc() == 0) {
                        strLD = lk(this.LD.LD());
                        if (this.LD.lk()) {
                            strLD = LD(strLD);
                        }
                    }
                    com.bytedance.sdk.component.lc.Lxb.JXs.lk lkVarNBu = jXsVVE.nBu();
                    if (lkVarNBu == null) {
                        return;
                    }
                    lkVarNBu.Lxb("User-Agent", jXsVVE.QAg());
                    lkVarNBu.Lxb("csj_client_source_from", "1");
                    if (this.ZU != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.ZU.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        lkVarNBu.Lxb("csj_extra_info", jSONObject.toString());
                    }
                    lkVarNBu.Lxb(strLD);
                    try {
                        zuLxb = lkVarNBu.Lxb();
                        try {
                            jXsVVE.Lxb(zuLxb.Lxb());
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        zuLxb = null;
                    }
                    ZU zu = this.LD;
                    zu.Lxb(zu.ZU() + 1);
                    if (zuLxb != null && zuLxb.Lxb()) {
                        lk.this.LD.lk(this.LD);
                        this.LD.LD();
                        jXsVVE.Lxb(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.LD);
                        return;
                    }
                    if (zuLxb != null) {
                        this.LD.LD(zuLxb.LD());
                        this.LD.lk(zuLxb.lk());
                    }
                    if (zuLxb == null || zuLxb.LD() != 8848) {
                        this.LD.LD();
                        if (this.LD.ZU() >= jXsVVE.lk(this.LD.lc())) {
                            lk.this.LD.lk(this.LD);
                            this.LD.LD();
                        } else {
                            lk.this.LD.LD(this.LD);
                        }
                    } else {
                        zuLxb.lk();
                        lk.this.LD.lk(this.LD);
                    }
                    jXsVVE.Lxb(false, this.LD.OY(), System.currentTimeMillis() - jCurrentTimeMillis, this.LD);
                }
            } catch (Throwable unused3) {
            }
        }

        private Lxb(ZU zu, String str, Map<String, String> map) {
            super("AdsStats");
            this.LD = zu;
            this.lk = str;
            this.ZU = map;
        }
    }

    public lk(Context context, JXs jXs) {
        this.Lxb = context;
        this.LD = jXs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random lk() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context Lxb() {
        Context context = this.Lxb;
        return context == null ? OY.ebl().lc() : context;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc.LD
    public void Lxb(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.lc.Lxb.JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || OY.ebl().lc() == null || jXsVVE.ZU() == null || !jXsVVE.lk() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jXsVVE.ZU().execute(new Lxb(new ZU(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc.LD
    public Runnable Lxb(final ZU zu, final String str, final Map<String, String> map) {
        if (zu == null || TextUtils.isEmpty(zu.Lxb())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.lc.Lxb.lc.lk.1
            @Override // java.lang.Runnable
            public void run() {
                if (lk.this.LD.Lxb(zu.Lxb()) != null) {
                    new Lxb(zu, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc.LD
    public void Lxb(final String str, final boolean z) {
        com.bytedance.sdk.component.lc.Lxb.JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || OY.ebl().lc() == null || !jXsVVE.lk()) {
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.JXs.JXs jXs = new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("trackFailedUrls") { // from class: com.bytedance.sdk.component.lc.Lxb.lc.lk.2
            @Override // java.lang.Runnable
            public void run() {
                lk.this.Lxb(lk.this.LD.Lxb(), str, z);
            }
        };
        jXs.Lxb(1);
        if (jXsVVE.ZU() != null) {
            jXsVVE.ZU().execute(jXs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(List<ZU> list, String str, boolean z) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.JXs jXsVVE = OY.ebl().VVE();
        for (ZU zu : list) {
            if (jXsVVE != null && jXsVVE.ZU() != null) {
                zu.Lxb(z);
                jXsVVE.ZU().execute(new Lxb(zu, str, null));
            }
        }
    }
}
