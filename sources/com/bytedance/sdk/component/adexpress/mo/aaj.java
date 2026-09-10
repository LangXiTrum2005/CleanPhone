package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aaj extends exc {
    private TextView qdl;

    public aaj(Context context, View view, int i2, int i3, int i4, JSONObject jSONObject) {
        super(context, view, i2, i3, i4, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.exc
    public void qdl(Context context, View view) {
        addView(view);
        this.qdl = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.exc
    public void setShakeText(String str) {
        if (this.qdl == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.qdl.setText(str);
            return;
        }
        try {
            this.qdl.setText(com.bytedance.sdk.component.utils.ljh.ud(this.qdl.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
