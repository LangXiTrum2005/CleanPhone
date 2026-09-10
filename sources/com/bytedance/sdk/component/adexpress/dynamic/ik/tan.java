package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.di.fr;
import com.bytedance.sdk.component.utils.uq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tan implements xha<fr> {
    private com.bytedance.sdk.component.adexpress.dynamic.ka.qt di;
    private String fi;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi ik;
    private com.bytedance.sdk.component.adexpress.dynamic.ka.xha ka;
    private Context lr;
    private fr ri;

    public tan(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar, String str, com.bytedance.sdk.component.adexpress.dynamic.ka.qt qtVar) {
        this.lr = context;
        this.ik = fiVar;
        this.ka = xhaVar;
        this.fi = str;
        this.di = qtVar;
        fi();
    }

    private void fi() {
        int iFe = this.ka.fe();
        final com.bytedance.sdk.component.adexpress.dynamic.di.ri dynamicClickListener = this.ik.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.fi)) {
            Context context = this.lr;
            fr frVar = new fr(context, com.bytedance.sdk.component.adexpress.ik.ri.jbs(context), this.di);
            this.ri = frVar;
            if (frVar.getWriggleLayout() != null) {
                this.ri.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.ri.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.ka.saa())) {
                    this.ri.getTopTextView().setText(uq.lr(this.lr, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.ri.getTopTextView().setText(this.ka.saa());
                }
            }
        } else {
            Context context2 = this.lr;
            this.ri = new fr(context2, com.bytedance.sdk.component.adexpress.ik.ri.jbs(context2), this.di);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.ri.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.lr, iFe)));
        this.ri.setLayoutParams(layoutParams);
        this.ri.setShakeText(this.ka.whw());
        this.ri.setClipChildren(false);
        final View wriggleProgressIv = this.ri.getWriggleProgressIv();
        this.ri.setOnShakeViewListener(new fr.ri() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.tan.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public fr ik() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        this.ri.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        this.ri.ri();
    }
}
