package com.bytedance.sdk.openadsdk.core.rq.ud;

import android.content.Context;
import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends com.bytedance.adsdk.ugeno.tvp.mo.ud {
    private String iw;
    private String lme;

    public ud(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.tvp.mo.ud, com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.iw = str2;
        } else if (str.equals("after")) {
            this.lme = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tvp.mo.ud
    public void rdp(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, AbstractJsonLexerKt.NULL)) {
            str = "";
        }
        if (TextUtils.isEmpty(this.lme) || TextUtils.equals(this.lme, AbstractJsonLexerKt.NULL)) {
            this.lme = "";
        }
        if (TextUtils.isEmpty(this.iw) || TextUtils.equals(this.iw, AbstractJsonLexerKt.NULL)) {
            this.iw = "";
        }
        String str2 = this.iw + str + this.lme;
        ((com.bytedance.adsdk.ugeno.tvp.mo.ud) this).qdl = str2;
        ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setText(str2);
        try {
            float f = this.ekw ? this.bqt : this.xmv;
            float f2 = this.hkc ? this.koa : this.xmv;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).getPaint().measureText(((com.bytedance.adsdk.ugeno.tvp.mo.ud) this).qdl);
            if (fMeasureText >= 0.0f) {
                mzz((int) (f + fMeasureText + f2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tvp.mo.ud, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        if (TextUtils.isEmpty(this.lme) || TextUtils.equals(this.lme, AbstractJsonLexerKt.NULL)) {
            this.lme = "";
        }
        if (TextUtils.isEmpty(this.iw) || TextUtils.equals(this.iw, AbstractJsonLexerKt.NULL)) {
            this.iw = "";
        }
        String str = this.iw + this.lme;
        ((com.bytedance.adsdk.ugeno.tvp.mo.ud) this).qdl = str;
        ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setText(str);
        ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setGravity(17);
    }
}
