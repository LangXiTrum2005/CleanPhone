package com.bytedance.sdk.component.adexpress.di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di extends ihz {
    private tan ri;

    public di(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        ri(context, i, i2, i3, jSONObject);
    }

    private void ri(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        tan tanVar = new tan(context, com.bytedance.sdk.component.adexpress.ik.ri.ik(context), i, i2, i3, jSONObject);
        this.ri = tanVar;
        addView(tanVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.ri.setLayoutParams(layoutParams);
    }

    public tan getShakeView() {
        return this.ri;
    }

    public void setShakeText(String str) {
        if (this.ri == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.ri.setShakeText("");
        } else {
            this.ri.setShakeText(str);
        }
    }
}
