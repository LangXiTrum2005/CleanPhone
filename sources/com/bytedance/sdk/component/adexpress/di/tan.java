package com.bytedance.sdk.component.adexpress.di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tan extends nr {
    private TextView ri;

    public tan(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.di.nr
    public void ri(Context context, View view) {
        addView(view);
        this.ri = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.di.nr
    public void setShakeText(String str) {
        if (this.ri == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.ri.setText(str);
            return;
        }
        try {
            this.ri.setText(com.bytedance.sdk.component.utils.uq.lr(this.ri.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
