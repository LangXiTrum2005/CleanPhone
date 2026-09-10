package com.bytedance.sdk.openadsdk.component.ri;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.ik.ik;
import com.bytedance.sdk.openadsdk.core.jbs.jbs;
import com.bytedance.sdk.openadsdk.core.jbs.mj;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ihz.ri.ri.ka;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static mj lr(wjv wjvVar, Activity activity, final com.bytedance.sdk.openadsdk.component.mj.ri riVar, com.bytedance.sdk.openadsdk.component.jbs.lr lrVar) {
        mj mjVar = new mj(activity.getApplicationContext(), wjvVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.ri.lr.2
            @Override // com.bytedance.sdk.openadsdk.core.ik.ri, com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
            public void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
                HashMap map = new HashMap();
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(riVar.ik()));
                ri(map);
                super.ri(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        mjVar.ri((View) lrVar);
        ri(activity.getApplicationContext(), wjvVar, mjVar);
        ri(mjVar, wjvVar);
        return mjVar;
    }

    public static ri ri(wjv wjvVar, Activity activity, com.bytedance.sdk.openadsdk.component.mj.ri riVar) {
        ri riVar2 = new ri(activity.getApplicationContext(), wjvVar, "open_ad", 4, riVar);
        riVar2.ri(activity.findViewById(R.id.content));
        ri(activity.getApplicationContext(), wjvVar, riVar2);
        ri(riVar2, wjvVar);
        return riVar2;
    }

    public static jbs ri(wjv wjvVar, Activity activity, final com.bytedance.sdk.openadsdk.component.mj.ri riVar, com.bytedance.sdk.openadsdk.component.jbs.lr lrVar) {
        jbs jbsVar = new jbs(activity, wjvVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.ri.lr.1
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
            public void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
                HashMap map = new HashMap();
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(riVar.ik()));
                ri(map);
                super.ri(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        jbsVar.ri(lrVar);
        ri(activity.getApplicationContext(), wjvVar, jbsVar);
        ri(jbsVar, wjvVar);
        return jbsVar;
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.ik.lr lrVar, wjv wjvVar) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(wjvVar.rzk()));
        map.put("openad_creative_type", wjv.fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(dw.ik(wjvVar) ? 3 : 1));
        lrVar.ri(map);
    }

    private static void ri(Context context, wjv wjvVar, com.bytedance.sdk.openadsdk.core.ik.lr lrVar) {
        if (wjvVar == null || wjvVar.adz() != 4) {
            return;
        }
        lrVar.ri(ka.ri(context, "open_ad"));
    }
}
