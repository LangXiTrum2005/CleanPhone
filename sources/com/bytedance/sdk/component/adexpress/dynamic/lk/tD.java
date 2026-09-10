package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lc.id;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tD implements ebl<id> {
    private String JXs;
    private Context LD;
    private id Lxb;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl ZU;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu lc;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs lk;

    public tD(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar, String str, com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu nbu) {
        this.LD = context;
        this.lk = jXs;
        this.ZU = eblVar;
        this.JXs = str;
        this.lc = nbu;
        JXs();
    }

    private void JXs() {
        int iOf = this.ZU.Of();
        final com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb dynamicClickListener = this.lk.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.JXs)) {
            Context context = this.LD;
            id idVar = new id(context, com.bytedance.sdk.component.adexpress.lk.Lxb.QAg(context), this.lc);
            this.Lxb = idVar;
            if (idVar.getWriggleLayout() != null) {
                this.Lxb.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.Lxb.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.ZU.jeq())) {
                    this.Lxb.getTopTextView().setText(com.bytedance.sdk.component.utils.tD.LD(this.LD, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.Lxb.getTopTextView().setText(this.ZU.jeq());
                }
            }
        } else {
            Context context2 = this.LD;
            this.Lxb = new id(context2, com.bytedance.sdk.component.adexpress.lk.Lxb.QAg(context2), this.lc);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.Lxb.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.LD, iOf)));
        this.Lxb.setLayoutParams(layoutParams);
        this.Lxb.setShakeText(this.ZU.Ns());
        this.Lxb.setClipChildren(false);
        final View wriggleProgressIv = this.Lxb.getWriggleProgressIv();
        this.Lxb.setOnShakeViewListener(new id.Lxb() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lk.tD.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void LD() {
        this.Lxb.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void Lxb() {
        this.Lxb.Lxb();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    /* JADX INFO: renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public id lk() {
        return this.Lxb;
    }
}
