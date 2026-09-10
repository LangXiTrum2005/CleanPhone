package com.bytedance.sdk.openadsdk.qt;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.fi.sf;
import com.bytedance.sdk.component.fi.slm;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr<T> implements slm<T> {
    private final slm<T> ik;
    private final wjv ka;
    private final String lr;
    private final long ri = SystemClock.elapsedRealtime();

    public lr(final wjv wjvVar, String str, slm<T> slmVar) {
        this.ik = slmVar;
        this.ka = wjvVar;
        this.lr = str;
        com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.qt.lr.1
            @Override // com.bytedance.sdk.openadsdk.nr.ka
            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                riVar.lr("load_img");
                wjv wjvVar2 = wjvVar;
                if (wjvVar2 != null) {
                    riVar.ik(wjvVar2.hcw(C3414a2.f));
                    riVar.ka(ig.ik(wjvVar.go()));
                }
                riVar.ri(BuildConfig.VERSION_NAME);
                return riVar;
            }
        });
    }

    @Override // com.bytedance.sdk.component.fi.slm
    public void ri(sf<T> sfVar) {
        slm<T> slmVar = this.ik;
        if (slmVar != null) {
            slmVar.ri(sfVar);
        }
        if (this.ka != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ri;
            final int iXha = sfVar.xha() / 1024;
            final int i = sfVar.di() ? 1 : 0;
            com.bytedance.sdk.openadsdk.slm.ka.ri("load_image_success", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.qt.lr.2
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, jElapsedRealtime);
                    jSONObject.put("url", lr.this.lr);
                    jSONObject.put("preload_size", iXha);
                    jSONObject.put("local_cache", i);
                    jSONObject.put("image_mode", lr.this.ka.vz());
                    jSONObject.put("use_new_img", 1);
                    return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("load_image_success").ri(lr.this.ka.go()).lr(jSONObject.toString());
                }
            });
            com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.qt.lr.3
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("load_img");
                    if (lr.this.ka != null) {
                        riVar.ik(lr.this.ka.hcw(C3414a2.f));
                        riVar.ka(ig.ik(lr.this.ka.go()));
                    }
                    riVar.ri(BuildConfig.VERSION_NAME);
                    return riVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.fi.slm
    public void ri(final int i, final String str, final Throwable th) {
        slm<T> slmVar = this.ik;
        if (slmVar != null) {
            slmVar.ri(i, str, th);
        }
        wjv wjvVar = this.ka;
        if (wjvVar != null) {
            if (!TextUtils.isEmpty(ig.ri(wjvVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ri;
                com.bytedance.sdk.openadsdk.slm.ka.ri("load_image_error", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.qt.lr.4
                    @Override // com.bytedance.sdk.openadsdk.slm.lr
                    public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, jElapsedRealtime);
                        jSONObject.put("url", lr.this.lr);
                        jSONObject.put("error_code", i);
                        Throwable th2 = th;
                        if (th2 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th2);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", lr.this.ka.vz());
                        jSONObject.put("use_new_img", 1);
                        return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("load_image_error").ri(lr.this.ka.go()).lr(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.qt.lr.5
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("load_img");
                    if (lr.this.ka != null) {
                        riVar.ik(lr.this.ka.hcw(C3414a2.f));
                        riVar.ka(ig.ik(lr.this.ka.go()));
                    }
                    riVar.ri(BuildConfig.VERSION_NAME);
                    return riVar;
                }
            });
        }
    }
}
