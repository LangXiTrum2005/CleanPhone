package com.bytedance.sdk.openadsdk.ka;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tan implements com.bytedance.sdk.openadsdk.ka.ka.fi {
    private JSONObject di;
    private Boolean fi;
    private Boolean ik;
    private Boolean ka;
    private wjv lr;
    private JSONArray mj;
    private String ri;
    private JSONArray xha;

    public tan(int i, String str, wjv wjvVar) {
        Boolean bool = Boolean.FALSE;
        this.ik = bool;
        this.ka = bool;
        this.fi = bool;
        this.ri = str;
        this.lr = wjvVar;
        this.di = new JSONObject();
        this.xha = new JSONArray();
        this.mj = new JSONArray();
        ri(this.di, "webview_source", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean slm() {
        if (this.fi.booleanValue()) {
            return true;
        }
        return this.ka.booleanValue() && this.ik.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.lr
    public void aw() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.15
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ka
    public void bgr() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.16
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.lr
    public void co() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.14
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                tan.this.ri(jSONObject2, "ts", Long.valueOf(jCurrentTimeMillis2));
                tan tanVar2 = tan.this;
                tanVar2.ri(tanVar2.di, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ik
    public void jbs() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.4
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.ri(jSONObject, "type", "native_enterForeground");
                tan tanVar = tan.this;
                tanVar.ri(tanVar.xha, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ik
    public void mj() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.3
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.ri(jSONObject, "type", "native_enterBackground");
                tan tanVar = tan.this;
                tanVar.ri(tanVar.xha, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.fi
    public void qt() {
        this.ik = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.fi
    public void sf() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.10
            @Override // java.lang.Runnable
            public void run() {
                if (tan.this.slm()) {
                    if (tan.this.xha != null && tan.this.xha.length() != 0) {
                        try {
                            tan.this.di.put("native_switchBackgroundAndForeground", tan.this.xha);
                        } catch (Exception unused) {
                        }
                    }
                    if (tan.this.mj != null && tan.this.mj.length() != 0) {
                        try {
                            tan.this.di.put("intercept_source", tan.this.mj);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", tan.this.di);
                    } catch (JSONException e) {
                        ac.ri("WebviewTimeTrack", "trySendTrackInfo json error", e);
                    }
                    if (com.bytedance.sdk.openadsdk.core.qt.lr().vr() && tan.this.di != null) {
                        JSONObject unused3 = tan.this.di;
                    }
                    ik.lr(tan.this.lr, tan.this.ri, "webview_time_track", jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ka
    public void vr() {
        try {
            com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.17
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan tanVar = tan.this;
                    tanVar.ri(tanVar.di, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ik
    public void xha() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.2
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ik
    public void di() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.31
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void fi() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.29
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ik
    public void ik() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.27
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void ka() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.28
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ka
    public void lr() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.12
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ri
    public void xha(final String str) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.24
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ri
    public void di(final String str) {
        try {
            com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.21
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan tanVar = tan.this;
                    tanVar.ri(tanVar.di, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ri
    public void fi(final String str) {
        try {
            com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.20
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan tanVar = tan.this;
                    tanVar.ri(tanVar.di, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ri
    public void ik(final String str) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.11
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ri
    public void ka(final String str) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.18
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void lr(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.6
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "start_ts", Long.valueOf(j));
                tan.this.ri(jSONObject, "end_ts", Long.valueOf(j2));
                tan.this.ri(jSONObject, "intercept_type", Integer.valueOf(i));
                tan.this.ri(jSONObject, "type", "intercept_js");
                tan.this.ri(jSONObject, "url", str);
                tan.this.ri(jSONObject, IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2 - j));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.mj, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ri
    public void ik(final int i, final String str) {
        try {
            com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.22
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan.this.ri(jSONObject, "code", Integer.valueOf(i));
                    tan tanVar = tan.this;
                    tanVar.ri(tanVar.di, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void lr(final String str) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.ri(jSONObject, "jsb", str);
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void lr(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (tan.this.di == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    tan tanVar = tan.this;
                    tanVar.ri(tanVar.di, next, jSONObject.opt(next));
                }
                tan.this.ka = Boolean.TRUE;
                tan.this.sf();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ri
    public void lr(final int i, final String str) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.13
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.ri(jSONObject, "code", Integer.valueOf(i));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ka
    public void ri() {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.1
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.ri(jSONObject, "render_sequence", Integer.valueOf(tanVar.lr.hpn()));
                if (tan.this.lr != null) {
                    if (tan.this.lr.sez() != null) {
                        if (tan.this.lr.sez().co()) {
                            tan.this.ri(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.fi.fi.ri().ka()));
                            tan.this.ri(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.fi.fi.ri().ka()));
                        } else {
                            tan.this.ri(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.fi.fi.ri().ik()));
                            tan.this.ri(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.fi.fi.ri().ik()));
                        }
                    } else if (tan.this.lr.zv() != null) {
                        tan.this.ri(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.fi.fi.ri().ka()));
                        tan.this.ri(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.fi.fi.ri().ka()));
                    }
                }
                tan tanVar2 = tan.this;
                tanVar2.ri(tanVar2.di, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void lr(final int i) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.25
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.ri(jSONObject, "isWebViewCache", Integer.valueOf(i));
                if (tan.this.lr != null) {
                    if (tan.this.lr.nbc()) {
                        tan.this.ri(jSONObject, "engine_version", "v3");
                    } else {
                        tan.this.ri(jSONObject, "engine_version", "v1");
                    }
                }
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "before_webview_request", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ka
    public void ri(final int i, final String str) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.23
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.ri(jSONObject, "code", Integer.valueOf(i));
                String str2 = str;
                if (str2 != null) {
                    tan.this.ri(jSONObject, "reason", str2);
                }
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.lr
    public void ri(final int i) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.26
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.ri(jSONObject, "backup_type", Integer.valueOf(i));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void ri(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.30
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                tan.this.ri(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void ri(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "start_ts", Long.valueOf(j));
                tan.this.ri(jSONObject, "end_ts", Long.valueOf(j2));
                tan.this.ri(jSONObject, "intercept_type", Integer.valueOf(i));
                tan.this.ri(jSONObject, "type", "intercept_html");
                tan.this.ri(jSONObject, "url", str);
                tan.this.ri(jSONObject, IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2 - j));
                tan tanVar = tan.this;
                tanVar.ri(tanVar.mj, jSONObject);
            }
        });
    }

    public tan() {
        this.ri = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.ik = bool;
        this.ka = bool;
        this.fi = bool;
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.di
    public void ri(final String str) {
        com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.ri(jSONObject, "jsb", str);
                tan tanVar = tan.this;
                tanVar.ri(tanVar.di, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.fi
    public void ri(boolean z) {
        this.fi = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(JSONObject jSONObject, String str, Object obj, boolean z) {
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
    public void ri(JSONObject jSONObject, String str, Object obj) {
        ri(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ka.ri
    public void ri(final String str, final boolean z) {
        try {
            com.bytedance.sdk.component.utils.jbs.ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.19
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan.this.ri(jSONObject, "isReuse", Integer.valueOf(z ? 1 : 0));
                    tan tanVar = tan.this;
                    tanVar.ri(tanVar.di, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
