package com.bytedance.sdk.component.adexpress.lc;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends HD {
    private DY Lxb;

    public lc(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        Lxb(context, i, i2, i3, jSONObject);
    }

    private void Lxb(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        DY dy = new DY(context, com.bytedance.sdk.component.adexpress.lk.Lxb.lk(context), i, i2, i3, jSONObject);
        this.Lxb = dy;
        addView(dy);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.Lxb.setLayoutParams(layoutParams);
    }

    public DY getShakeView() {
        return this.Lxb;
    }

    public void setShakeText(String str) {
        if (this.Lxb == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.Lxb.setShakeText("");
        } else {
            this.Lxb.setShakeText(str);
        }
    }
}
