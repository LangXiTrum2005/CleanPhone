package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mo.xmv;
import com.bytedance.sdk.component.utils.ljh;
import com.kochava.tracker.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class exc implements wd<xmv> {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz lnr;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.wd mml;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.to mo;
    private String mzz;
    private xmv qdl;
    private Context ud;

    public exc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar, String str, com.bytedance.sdk.component.adexpress.dynamic.mml.to toVar) {
        this.ud = context;
        this.lnr = mzzVar;
        this.mml = wdVar;
        this.mzz = str;
        this.mo = toVar;
        mzz();
    }

    private void mzz() {
        int iWak = this.mml.wak();
        final com.bytedance.sdk.component.adexpress.dynamic.mo.qdl dynamicClickListener = this.lnr.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if (BuildConfig.SDK_PROTOCOL.equals(this.mzz)) {
            Context context = this.ud;
            xmv xmvVar = new xmv(context, com.bytedance.sdk.component.adexpress.lnr.qdl.tvp(context), this.mo);
            this.qdl = xmvVar;
            if (xmvVar.getWriggleLayout() != null) {
                this.qdl.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.qdl.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.mml.en())) {
                    this.qdl.getTopTextView().setText(ljh.ud(this.ud, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.qdl.getTopTextView().setText(this.mml.en());
                }
            }
        } else {
            Context context2 = this.ud;
            this.qdl = new xmv(context2, com.bytedance.sdk.component.adexpress.lnr.qdl.tvp(context2), this.mo);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.qdl.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.ud, iWak)));
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setShakeText(this.mml.jjk());
        this.qdl.setClipChildren(false);
        final View wriggleProgressIv = this.qdl.getWriggleProgressIv();
        this.qdl.setOnShakeViewListener(new xmv.qdl() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lnr.exc.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public xmv lnr() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void qdl() {
        this.qdl.qdl();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void ud() {
        this.qdl.clearAnimation();
    }
}
