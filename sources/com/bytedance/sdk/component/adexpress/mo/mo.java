package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mo extends oth {
    private aaj qdl;

    public mo(Context context, int i2, int i3, int i4, JSONObject jSONObject) {
        super(context);
        qdl(context, i2, i3, i4, jSONObject);
    }

    private void qdl(Context context, int i2, int i3, int i4, JSONObject jSONObject) {
        aaj aajVar = new aaj(context, com.bytedance.sdk.component.adexpress.lnr.qdl.lnr(context), i2, i3, i4, jSONObject);
        this.qdl = aajVar;
        addView(aajVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.qdl.setLayoutParams(layoutParams);
    }

    public aaj getShakeView() {
        return this.qdl;
    }

    public void setShakeText(String str) {
        if (this.qdl == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.qdl.setShakeText("");
        } else {
            this.qdl.setShakeText(str);
        }
    }
}
