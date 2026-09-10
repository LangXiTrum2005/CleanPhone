package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAdHandler implements BaseExtraInterfaceForHandler {
    protected static final String TAG = "BaseAdHandler";
    protected Context context;
    protected String placementId;
    protected String unitId;

    public BaseAdHandler(Context context, String str, String str2) {
        this.context = context;
        this.placementId = str;
        this.unitId = str2;
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        if (context instanceof Activity) {
            c.n().a(context);
        }
        initData(str, str2);
    }

    private void initData(String str, String str2) {
        initStrategy(str2, str);
        String strE = v0.e(str2);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        v0.d(str2, strE);
    }

    public Context getContext() {
        return this.context;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public abstract void initStrategy(String str, String str2);

    public BaseAdHandler(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
        initData(str, str2);
    }
}
