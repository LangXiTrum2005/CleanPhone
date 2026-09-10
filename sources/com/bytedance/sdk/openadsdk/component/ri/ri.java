package com.bytedance.sdk.openadsdk.component.ri;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.ay.lr.fi;
import com.bytedance.sdk.openadsdk.core.ik.ik;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.sdk.openadsdk.core.ik.ri {
    private final com.bytedance.sdk.openadsdk.component.mj.ri ri;

    public ri(Context context, wjv wjvVar, String str, int i, com.bytedance.sdk.openadsdk.component.mj.ri riVar) {
        super(context, wjvVar, str, i);
        this.ri = riVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ri, com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
    public void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
        if (view.getTag() == "open_ad_click_button_tag") {
            ri("click_bar");
        } else {
            ri("click_material");
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.ri.ik()));
        ri(map);
        super.ri(view, f, f2, f3, f4, sparseArray, z);
        fi.ri(((com.bytedance.sdk.openadsdk.core.ik.lr) this).di, 9);
    }
}
