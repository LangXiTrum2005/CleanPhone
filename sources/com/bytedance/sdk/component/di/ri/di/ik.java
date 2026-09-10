package com.bytedance.sdk.component.di.ri.di;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.di.ri.xha;
import com.mbridge.msdk.foundation.download.Command;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements lr {
    private final fi lr;
    private final Context ri;

    public class ri extends com.bytedance.sdk.component.di.ri.fi.fi {
        private final String ik;
        private final Map<String, String> ka;
        private final ka lr;

        private String ik(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.ik)) ? str.replace("{UID}", this.ik).replace("__UID__", this.ik) : str;
        }

        public String lr(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(ik.ik().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        public boolean ri(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.di.ri.fi.ka kaVarRi;
            com.bytedance.sdk.component.di.ri.fi fiVarVr = xha.di().vr();
            if (fiVarVr == null || xha.di().fi() == null || !fiVarVr.ik() || !ri(this.lr.lr())) {
                return;
            }
            if (this.lr.ka() >= fiVarVr.ik(this.lr.di())) {
                ik.this.lr.ik(this.lr);
                return;
            }
            try {
                if (this.lr.sf()) {
                    ik.this.lr.ri(this.lr);
                }
                if (fiVarVr.ri(ik.this.ri())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strLr = this.lr.lr();
                    if (fiVarVr.di() == 0) {
                        strLr = ik(this.lr.lr());
                        if (this.lr.ik()) {
                            strLr = lr(strLr);
                        }
                    }
                    com.bytedance.sdk.component.di.ri.fi.ik ikVarQt = fiVarVr.qt();
                    if (ikVarQt == null) {
                        return;
                    }
                    ikVarQt.ri(Command.HTTP_HEADER_USER_AGENT, fiVarVr.jbs());
                    ikVarQt.ri("csj_client_source_from", "1");
                    if (this.ka != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.ka.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        ikVarQt.ri("csj_extra_info", jSONObject.toString());
                    }
                    ikVarQt.ri(strLr);
                    try {
                        kaVarRi = ikVarQt.ri();
                        try {
                            kaVarRi.ri();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        kaVarRi = null;
                    }
                    ka kaVar = this.lr;
                    kaVar.ri(kaVar.ka() + 1);
                    if (kaVarRi != null && kaVarRi.ri()) {
                        ik.this.lr.ik(this.lr);
                        this.lr.lr();
                        fiVarVr.ri(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.lr);
                        return;
                    }
                    if (kaVarRi != null) {
                        this.lr.lr(kaVarRi.lr());
                        this.lr.ik(kaVarRi.ik());
                    }
                    if (kaVarRi == null || kaVarRi.lr() != 8848) {
                        this.lr.lr();
                        if (this.lr.ka() >= fiVarVr.ik(this.lr.di())) {
                            ik.this.lr.ik(this.lr);
                            this.lr.lr();
                        } else {
                            ik.this.lr.lr(this.lr);
                        }
                    } else {
                        kaVarRi.ik();
                        ik.this.lr.ik(this.lr);
                    }
                    fiVarVr.ri(false, this.lr.mj(), System.currentTimeMillis() - jCurrentTimeMillis, this.lr);
                }
            } catch (Throwable unused3) {
            }
        }

        private ri(ka kaVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.lr = kaVar;
            this.ik = str;
            this.ka = map;
        }
    }

    public ik(Context context, fi fiVar) {
        this.ri = context;
        this.lr = fiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random ik() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context ri() {
        Context context = this.ri;
        return context == null ? xha.di().fi() : context;
    }

    @Override // com.bytedance.sdk.component.di.ri.di.lr
    public void ri(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.di.ri.fi fiVarVr = xha.di().vr();
        if (fiVarVr == null || xha.di().fi() == null || fiVarVr.ka() == null || !fiVarVr.ik() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            fiVarVr.ka().execute(new ri(new ka(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.di.lr
    public Runnable ri(final ka kaVar, final String str, final Map<String, String> map) {
        if (kaVar == null || TextUtils.isEmpty(kaVar.ri())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.di.ri.di.ik.1
            @Override // java.lang.Runnable
            public void run() {
                if (ik.this.lr.ri(kaVar.ri()) != null) {
                    new ri(kaVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.di.ri.di.lr
    public void ri(final String str, final boolean z) {
        com.bytedance.sdk.component.di.ri.fi fiVarVr = xha.di().vr();
        if (fiVarVr == null || xha.di().fi() == null || !fiVarVr.ik()) {
            return;
        }
        com.bytedance.sdk.component.di.ri.fi.fi fiVar = new com.bytedance.sdk.component.di.ri.fi.fi("trackFailedUrls") { // from class: com.bytedance.sdk.component.di.ri.di.ik.2
            @Override // java.lang.Runnable
            public void run() {
                ik.this.ri(ik.this.lr.ri(), str, z);
            }
        };
        fiVar.ri(1);
        if (fiVarVr.ka() != null) {
            fiVarVr.ka().execute(fiVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(List<ka> list, String str, boolean z) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.di.ri.fi fiVarVr = xha.di().vr();
        for (ka kaVar : list) {
            if (fiVarVr == null || fiVarVr.ka() == null) {
                str2 = str;
            } else {
                kaVar.ri(z);
                str2 = str;
                fiVarVr.ka().execute(new ri(kaVar, str2, null));
            }
            str = str2;
        }
    }
}
