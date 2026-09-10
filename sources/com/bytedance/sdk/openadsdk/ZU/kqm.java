package com.bytedance.sdk.openadsdk.ZU;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class kqm implements com.bytedance.sdk.openadsdk.ZU.ZU.JXs {
    private Boolean JXs;
    private tD LD;
    private String Lxb;
    private JSONArray OY;
    private Boolean ZU;
    private JSONArray ebl;
    private JSONObject lc;
    private Boolean lk;

    public kqm(int i, String str, tD tDVar) {
        Boolean bool = Boolean.FALSE;
        this.lk = bool;
        this.ZU = bool;
        this.JXs = bool;
        this.Lxb = str;
        this.LD = tDVar;
        this.lc = new JSONObject();
        this.ebl = new JSONArray();
        this.OY = new JSONArray();
        Lxb(this.lc, "webview_source", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kqm() {
        if (this.JXs.booleanValue()) {
            return true;
        }
        return this.ZU.booleanValue() && this.lk.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.ZU
    public void IeN() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.16
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.JXs
    public void JVA() {
        this.lk = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.LD
    public void NXR() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.14
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                kqm.this.Lxb(jSONObject2, "ts", Long.valueOf(jCurrentTimeMillis2));
                kqm kqmVar2 = kqm.this;
                kqmVar2.Lxb(kqmVar2.lc, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lk
    public void OY() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.2
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lk
    public void QAg() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.3
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm.this.Lxb(jSONObject, "type", "native_enterBackground");
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.ebl, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.LD
    public void STP() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.15
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.ZU
    public void VVE() {
        try {
            com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.17
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    kqm kqmVar = kqm.this;
                    kqmVar.Lxb(kqmVar.lc, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lk
    public void ebl() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.30
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lk
    public void nBu() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.4
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm.this.Lxb(jSONObject, "type", "native_enterForeground");
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.ebl, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.JXs
    public void sLN() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.10
            @Override // java.lang.Runnable
            public void run() {
                if (kqm.this.kqm()) {
                    if (kqm.this.ebl != null && kqm.this.ebl.length() != 0) {
                        try {
                            kqm.this.lc.put("native_switchBackgroundAndForeground", kqm.this.ebl);
                        } catch (Exception unused) {
                        }
                    }
                    if (kqm.this.OY != null && kqm.this.OY.length() != 0) {
                        try {
                            kqm.this.lc.put("intercept_source", kqm.this.OY);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", kqm.this.lc);
                    } catch (JSONException e) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("WebviewTimeTrack", "trySendTrackInfo json error", e);
                    }
                    if (com.bytedance.sdk.openadsdk.core.QAg.LD().kqm() && kqm.this.lc != null) {
                        JSONObject unused3 = kqm.this.lc;
                    }
                    lk.LD(kqm.this.LD, kqm.this.Lxb, "webview_time_track", jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void JXs() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.27
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.ZU
    public void LD() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.12
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lk
    public void ZU() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.26
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.Lxb
    public void ebl(final String str) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.22
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void lc() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.28
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.LD
    public void lk() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.25
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.Lxb
    public void JXs(final String str) {
        try {
            com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.19
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    kqm kqmVar = kqm.this;
                    kqmVar.Lxb(kqmVar.lc, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void LD(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.6
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "start_ts", Long.valueOf(j));
                kqm.this.Lxb(jSONObject, "end_ts", Long.valueOf(j2));
                kqm.this.Lxb(jSONObject, "intercept_type", Integer.valueOf(i));
                kqm.this.Lxb(jSONObject, "type", "intercept_js");
                kqm.this.Lxb(jSONObject, "url", str);
                kqm.this.Lxb(jSONObject, "duration", Long.valueOf(j2 - j));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.OY, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.Lxb
    public void ZU(final String str) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.18
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.Lxb
    public void lc(final String str) {
        try {
            com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.20
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    kqm kqmVar = kqm.this;
                    kqmVar.Lxb(kqmVar.lc, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.Lxb
    public void lk(final String str) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.11
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void LD(final String str) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm.this.Lxb(jSONObject, "jsb", str);
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.Lxb
    public void lk(final int i, final String str) {
        try {
            com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.21
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    kqm.this.Lxb(jSONObject, "code", Integer.valueOf(i));
                    kqm kqmVar = kqm.this;
                    kqmVar.Lxb(kqmVar.lc, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void LD(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (kqm.this.lc == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kqm kqmVar = kqm.this;
                    kqmVar.Lxb(kqmVar.lc, next, jSONObject.opt(next));
                }
                kqm.this.ZU = Boolean.TRUE;
                kqm.this.sLN();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.Lxb
    public void LD(final int i, final String str) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.13
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm.this.Lxb(jSONObject, "code", Integer.valueOf(i));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.ZU
    public void Lxb() {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.1
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(jSONObject, "render_sequence", Integer.valueOf(kqmVar.LD.id()));
                if (kqm.this.LD != null) {
                    if (kqm.this.LD.rW() != null) {
                        if (kqm.this.LD.rW().STP()) {
                            kqm.this.Lxb(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().ZU()));
                            kqm.this.Lxb(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().ZU()));
                        } else {
                            kqm.this.Lxb(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().lk()));
                            kqm.this.Lxb(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().lk()));
                        }
                    } else if (kqm.this.LD.dR() != null) {
                        kqm.this.Lxb(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().ZU()));
                        kqm.this.Lxb(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().ZU()));
                    }
                }
                kqm kqmVar2 = kqm.this;
                kqmVar2.Lxb(kqmVar2.lc, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.ZU
    public void Lxb(final int i, final String str) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.23
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm.this.Lxb(jSONObject, "code", Integer.valueOf(i));
                String str2 = str;
                if (str2 != null) {
                    kqm.this.Lxb(jSONObject, "reason", str2);
                }
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void Lxb(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.29
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                kqm.this.Lxb(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void Lxb(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "start_ts", Long.valueOf(j));
                kqm.this.Lxb(jSONObject, "end_ts", Long.valueOf(j2));
                kqm.this.Lxb(jSONObject, "intercept_type", Integer.valueOf(i));
                kqm.this.Lxb(jSONObject, "type", "intercept_html");
                kqm.this.Lxb(jSONObject, "url", str);
                kqm.this.Lxb(jSONObject, "duration", Long.valueOf(j2 - j));
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.OY, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void Lxb(final String str) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm.this.Lxb(jSONObject, "jsb", str);
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "webview_jsb_start", jSONObject);
            }
        });
    }

    public kqm() {
        this.Lxb = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.lk = bool;
        this.ZU = bool;
        this.JXs = bool;
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.JXs
    public void Lxb(boolean z) {
        this.JXs = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(JSONObject jSONObject, String str, Object obj) {
        Lxb(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.ZU.lc
    public void Lxb(final int i) {
        com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZU.kqm.24
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                kqm.this.Lxb(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                kqm.this.Lxb(jSONObject, "isWebViewCache", Integer.valueOf(i));
                if (kqm.this.LD != null) {
                    if (kqm.this.LD.Pw()) {
                        kqm.this.Lxb(jSONObject, "engine_version", "v3");
                    } else {
                        kqm.this.Lxb(jSONObject, "engine_version", "v1");
                    }
                }
                kqm kqmVar = kqm.this;
                kqmVar.Lxb(kqmVar.lc, "before_webview_request", jSONObject);
            }
        });
    }
}
