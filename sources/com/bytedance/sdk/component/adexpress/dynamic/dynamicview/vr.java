package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class vr extends di {
    com.bytedance.sdk.component.adexpress.dynamic.ka.mj lr;
    String ri;

    public vr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, String str) {
        super(context, dynamicRootView, mjVar);
        this.ri = str;
        this.lr = mjVar;
        com.bytedance.sdk.component.adexpress.di.qt lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.di.qt getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar = this.aw;
        if (mjVar == null || mjVar.qt() == null || this.sf == null || TextUtils.isEmpty(this.ri)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi = this.aw.qt().fi();
        String strYjm = diVarFi != null ? diVarFi.yjm() : "";
        if (TextUtils.isEmpty(strYjm)) {
            return null;
        }
        String str = this.ri + "static/lotties/" + strYjm + ".json";
        com.bytedance.sdk.component.adexpress.di.qt qtVar = new com.bytedance.sdk.component.adexpress.di.qt(this.sf);
        qtVar.setImageLottieTosPath(str);
        qtVar.mj();
        return qtVar;
    }
}
