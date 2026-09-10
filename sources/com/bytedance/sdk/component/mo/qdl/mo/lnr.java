package com.bytedance.sdk.component.mo.qdl.mo;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.mbridge.msdk.foundation.download.Command;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements ud {
    private final Context qdl;
    private final mzz ud;

    public class qdl extends com.bytedance.sdk.component.mo.qdl.mzz.mzz {
        private final String lnr;
        private final Map<String, String> mml;
        private final mml ud;

        private String lnr(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.lnr)) ? str.replace("{UID}", this.lnr).replace("__UID__", this.lnr) : str;
        }

        public boolean qdl(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.mo.qdl.mzz.mml mmlVarQdl;
            com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
            if (mzzVarJtx == null || jpc.wd().mo() == null || !mzzVarJtx.lnr() || !qdl(this.ud.ud())) {
                return;
            }
            if (this.ud.mml() >= mzzVarJtx.lnr(this.ud.mo())) {
                lnr.this.ud.lnr(this.ud);
                return;
            }
            try {
                if (this.ud.rq()) {
                    lnr.this.ud.qdl(this.ud);
                }
                if (mzzVarJtx.qdl(lnr.this.qdl())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strUd = this.ud.ud();
                    if (mzzVarJtx.mo() == 0) {
                        strUd = lnr(this.ud.ud());
                        if (this.ud.lnr()) {
                            strUd = ud(strUd);
                        }
                    }
                    com.bytedance.sdk.component.mo.qdl.mzz.lnr lnrVar = mzzVarJtx.to();
                    if (lnrVar == null) {
                        return;
                    }
                    lnrVar.qdl(Command.HTTP_HEADER_USER_AGENT, mzzVarJtx.tvp());
                    lnrVar.qdl("csj_client_source_from", "1");
                    if (this.mml != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.mml.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        lnrVar.qdl("csj_extra_info", jSONObject.toString());
                    }
                    lnrVar.qdl(strUd);
                    try {
                        mmlVarQdl = lnrVar.qdl();
                        try {
                            mmlVarQdl.qdl();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        mmlVarQdl = null;
                    }
                    mml mmlVar = this.ud;
                    mmlVar.qdl(mmlVar.mml() + 1);
                    if (mmlVarQdl != null && mmlVarQdl.qdl()) {
                        lnr.this.ud.lnr(this.ud);
                        this.ud.ud();
                        mzzVarJtx.qdl(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.ud);
                        return;
                    }
                    if (mmlVarQdl != null) {
                        this.ud.ud(mmlVarQdl.ud());
                        this.ud.lnr(mmlVarQdl.lnr());
                    }
                    if (mmlVarQdl == null || mmlVarQdl.ud() != 8848) {
                        this.ud.ud();
                        if (this.ud.mml() >= mzzVarJtx.lnr(this.ud.mo())) {
                            lnr.this.ud.lnr(this.ud);
                            this.ud.ud();
                        } else {
                            lnr.this.ud.ud(this.ud);
                        }
                    } else {
                        mmlVarQdl.lnr();
                        lnr.this.ud.lnr(this.ud);
                    }
                    mzzVarJtx.qdl(false, this.ud.jpc(), System.currentTimeMillis() - jCurrentTimeMillis, this.ud);
                }
            } catch (Throwable unused3) {
            }
        }

        public String ud(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(lnr.lnr().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        private qdl(mml mmlVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.ud = mmlVar;
            this.lnr = str;
            this.mml = map;
        }
    }

    public lnr(Context context, mzz mzzVar) {
        this.qdl = context;
        this.ud = mzzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random lnr() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context qdl() {
        Context context = this.qdl;
        return context == null ? jpc.wd().mo() : context;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.ud
    public void qdl(String str, List<String> list, boolean z2, Map<String, String> map, int i2, String str2) {
        com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || jpc.wd().mo() == null || mzzVarJtx.mml() == null || !mzzVarJtx.lnr() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            mzzVarJtx.mml().execute(new qdl(new mml(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z2, i2, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.ud
    public Runnable qdl(final mml mmlVar, final String str, final Map<String, String> map) {
        if (mmlVar == null || TextUtils.isEmpty(mmlVar.qdl())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.mo.qdl.mo.lnr.1
            @Override // java.lang.Runnable
            public void run() {
                if (lnr.this.ud.qdl(mmlVar.qdl()) != null) {
                    new qdl(mmlVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.ud
    public void qdl(final String str, final boolean z2) {
        com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || jpc.wd().mo() == null || !mzzVarJtx.lnr()) {
            return;
        }
        com.bytedance.sdk.component.mo.qdl.mzz.mzz mzzVar = new com.bytedance.sdk.component.mo.qdl.mzz.mzz("trackFailedUrls") { // from class: com.bytedance.sdk.component.mo.qdl.mo.lnr.2
            @Override // java.lang.Runnable
            public void run() {
                lnr.this.qdl(lnr.this.ud.qdl(), str, z2);
            }
        };
        mzzVar.qdl(1);
        if (mzzVarJtx.mml() != null) {
            mzzVarJtx.mml().execute(mzzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(List<mml> list, String str, boolean z2) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
        for (mml mmlVar : list) {
            if (mzzVarJtx == null || mzzVarJtx.mml() == null) {
                str2 = str;
            } else {
                mmlVar.qdl(z2);
                str2 = str;
                mzzVarJtx.mml().execute(new qdl(mmlVar, str2, null));
            }
            str = str2;
        }
    }
}
