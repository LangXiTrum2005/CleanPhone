package com.bytedance.sdk.openadsdk.mml;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.smartdigimkt.b0.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jl implements com.bytedance.sdk.openadsdk.mml.mml.mzz {
    private JSONArray jpc;
    private Boolean lnr;
    private Boolean mml;
    private JSONObject mo;
    private Boolean mzz;
    private String qdl;
    private ljh ud;
    private JSONArray wd;

    public jl(int i2, String str, ljh ljhVar) {
        Boolean bool = Boolean.FALSE;
        this.lnr = bool;
        this.mml = bool;
        this.mzz = bool;
        this.qdl = str;
        this.ud = ljhVar;
        this.mo = new JSONObject();
        this.wd = new JSONArray();
        this.jpc = new JSONArray();
        qdl(this.mo, "webview_source", Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yt() {
        if (this.mzz.booleanValue()) {
            return true;
        }
        return this.mml.booleanValue() && this.lnr.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mml
    public void bjy() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.16
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.ud
    public void exu() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.14
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                jl.this.qdl(jSONObject2, "ts", Long.valueOf(jCurrentTimeMillis2));
                jl jlVar2 = jl.this;
                jlVar2.qdl(jlVar2.mo, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mzz
    public void fs() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.10
            @Override // java.lang.Runnable
            public void run() {
                if (jl.this.yt()) {
                    if (jl.this.wd != null && jl.this.wd.length() != 0) {
                        try {
                            jl.this.mo.put("native_switchBackgroundAndForeground", jl.this.wd);
                        } catch (Exception unused) {
                        }
                    }
                    if (jl.this.jpc != null && jl.this.jpc.length() != 0) {
                        try {
                            jl.this.mo.put("intercept_source", jl.this.jpc);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", jl.this.mo);
                    } catch (JSONException e2) {
                        aaj.qdl("WebviewTimeTrack", "trySendTrackInfo json error", e2);
                    }
                    if (com.bytedance.sdk.openadsdk.core.tvp.ud().yt() && jl.this.mo != null) {
                        JSONObject unused3 = jl.this.mo;
                    }
                    lnr.ud(jl.this.ud, jl.this.qdl, "webview_time_track", jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.lnr
    public void jpc() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.2
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mml
    public void jtx() {
        try {
            com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.17
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    jl jlVar = jl.this;
                    jlVar.qdl(jlVar.mo, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.ud
    public void rdp() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.15
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mzz
    public void rq() {
        this.lnr = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.lnr
    public void to() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.4
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl.this.qdl(jSONObject, "type", "native_enterForeground");
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.wd, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.lnr
    public void tvp() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.3
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl.this.qdl(jSONObject, "type", "native_enterBackground");
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.wd, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.lnr
    public void wd() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.31
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.ud
    public void lnr() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.26
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.lnr
    public void mml() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.27
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void mo() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.29
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void mzz() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.28
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mml
    public void ud() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.12
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.qdl
    public void wd(final String str) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.24
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.qdl
    public void lnr(final String str) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.11
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.qdl
    public void mml(final String str) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.18
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.qdl
    public void mo(final String str) {
        try {
            com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.21
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    jl jlVar = jl.this;
                    jlVar.qdl(jlVar.mo, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.qdl
    public void mzz(final String str) {
        try {
            com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.20
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    jl jlVar = jl.this;
                    jlVar.qdl(jlVar.mo, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void ud(final String str, final long j, final long j2, final int i2) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.6
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "start_ts", Long.valueOf(j));
                jl.this.qdl(jSONObject, "end_ts", Long.valueOf(j2));
                jl.this.qdl(jSONObject, "intercept_type", Integer.valueOf(i2));
                jl.this.qdl(jSONObject, "type", "intercept_js");
                jl.this.qdl(jSONObject, "url", str);
                jl.this.qdl(jSONObject, "duration", Long.valueOf(j2 - j));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.jpc, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.qdl
    public void lnr(final int i2, final String str) {
        try {
            com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.22
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    jl.this.qdl(jSONObject, "code", Integer.valueOf(i2));
                    jl jlVar = jl.this;
                    jlVar.qdl(jlVar.mo, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void ud(final String str) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl.this.qdl(jSONObject, "jsb", str);
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void ud(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (jl.this.mo == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jl jlVar = jl.this;
                    jlVar.qdl(jlVar.mo, next, jSONObject.opt(next));
                }
                jl.this.mml = Boolean.TRUE;
                jl.this.fs();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mml
    public void qdl() {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.1
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl jlVar = jl.this;
                jlVar.qdl(jSONObject, "render_sequence", Integer.valueOf(jlVar.ud.ra()));
                if (jl.this.ud != null) {
                    if (jl.this.ud.xdk() != null) {
                        if (jl.this.ud.xdk().fs()) {
                            jl.this.qdl(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().mml()));
                            jl.this.qdl(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().mml()));
                        } else {
                            jl.this.qdl(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().lnr()));
                            jl.this.qdl(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().lnr()));
                        }
                    } else if (jl.this.ud.kr() != null) {
                        jl.this.qdl(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().mml()));
                        jl.this.qdl(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().mml()));
                    }
                }
                jl jlVar2 = jl.this;
                jlVar2.qdl(jlVar2.mo, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.qdl
    public void ud(final int i2, final String str) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.13
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl.this.qdl(jSONObject, "code", Integer.valueOf(i2));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mml
    public void qdl(final int i2, final String str) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.23
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl.this.qdl(jSONObject, "code", Integer.valueOf(i2));
                String str2 = str;
                if (str2 != null) {
                    jl.this.qdl(jSONObject, "reason", str2);
                }
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void qdl(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.30
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jl.this.qdl(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void qdl(final String str, final long j, final long j2, final int i2) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "start_ts", Long.valueOf(j));
                jl.this.qdl(jSONObject, "end_ts", Long.valueOf(j2));
                jl.this.qdl(jSONObject, "intercept_type", Integer.valueOf(i2));
                jl.this.qdl(jSONObject, "type", "intercept_html");
                jl.this.qdl(jSONObject, "url", str);
                jl.this.qdl(jSONObject, "duration", Long.valueOf(j2 - j));
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.jpc, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void qdl(final String str) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl.this.qdl(jSONObject, "jsb", str);
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "webview_jsb_start", jSONObject);
            }
        });
    }

    public jl() {
        this.qdl = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.lnr = bool;
        this.mml = bool;
        this.mzz = bool;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mzz
    public void qdl(boolean z2) {
        this.mzz = Boolean.valueOf(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(JSONObject jSONObject, String str, Object obj, boolean z2) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z2) {
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
    public void qdl(JSONObject jSONObject, String str, Object obj) {
        qdl(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.qdl
    public void qdl(final String str, final boolean z2) {
        try {
            com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.19
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    jl.this.qdl(jSONObject, "isReuse", Integer.valueOf(z2 ? 1 : 0));
                    jl jlVar = jl.this;
                    jlVar.qdl(jlVar.mo, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mml.mo
    public void qdl(final int i2) {
        com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.jl.25
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jl.this.qdl(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                jl.this.qdl(jSONObject, "isWebViewCache", Integer.valueOf(i2));
                if (jl.this.ud != null) {
                    if (jl.this.ud.dps()) {
                        jl.this.qdl(jSONObject, "engine_version", a.k);
                    } else {
                        jl.this.qdl(jSONObject, "engine_version", "v1");
                    }
                }
                jl jlVar = jl.this;
                jlVar.qdl(jlVar.mo, "before_webview_request", jSONObject);
            }
        });
    }
}
