package com.bytedance.sdk.openadsdk.component.Lxb;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.LD.lk;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.eK.LD.JXs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.sdk.openadsdk.core.LD.Lxb {
    private final com.bytedance.sdk.openadsdk.component.OY.Lxb Lxb;

    public Lxb(@NonNull Context context, @NonNull tD tDVar, @NonNull String str, int i, com.bytedance.sdk.openadsdk.component.OY.Lxb lxb) {
        super(context, tDVar, str, i);
        this.Lxb = lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb, com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
    public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
        if (view.getTag() == "open_ad_click_button_tag") {
            Lxb("click_bar");
        } else {
            Lxb("click_material");
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.Lxb.LD()));
        Lxb(map);
        super.Lxb(view, f, f2, f3, f4, sparseArray, z);
        JXs.Lxb(((com.bytedance.sdk.openadsdk.core.LD.LD) this).lc, 9);
    }
}
