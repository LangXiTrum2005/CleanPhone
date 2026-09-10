package com.bytedance.sdk.component.adexpress.lc;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DY extends tD {
    private TextView Lxb;

    public DY(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.lc.tD
    public void Lxb(Context context, View view) {
        addView(view);
        this.Lxb = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.lc.tD
    public void setShakeText(String str) {
        if (this.Lxb == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.Lxb.setText(str);
            return;
        }
        try {
            this.Lxb.setText(com.bytedance.sdk.component.utils.tD.LD(this.Lxb.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("shakeClickView", e.getMessage());
        }
    }
}
