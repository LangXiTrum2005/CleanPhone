package com.mbridge.msdk.dycreator.wrapper;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.error.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface DynamicViewBackListener {
    void viewClicked(BaseRespData baseRespData);

    void viewCreateFail(a aVar);

    void viewCreatedSuccess(View view);
}
