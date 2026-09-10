package com.bytedance.sdk.openadsdk.component.Lxb;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl;
import com.bytedance.sdk.openadsdk.core.LD.lk;
import com.bytedance.sdk.openadsdk.core.OY.OY;
import com.bytedance.sdk.openadsdk.core.OY.QAg;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static OY LD(tD tDVar, Activity activity, final com.bytedance.sdk.openadsdk.component.OY.Lxb lxb, com.bytedance.sdk.openadsdk.component.QAg.LD ld) {
        OY oy = new OY(activity.getApplicationContext(), tDVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.Lxb.LD.2
            @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb, com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
            public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(lxb.LD()));
                Lxb(map);
                super.Lxb(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        oy.Lxb((View) ld);
        Lxb(activity.getApplicationContext(), tDVar, oy);
        Lxb(oy, tDVar);
        return oy;
    }

    public static Lxb Lxb(tD tDVar, Activity activity, com.bytedance.sdk.openadsdk.component.OY.Lxb lxb) {
        Lxb lxb2 = new Lxb(activity.getApplicationContext(), tDVar, "open_ad", 4, lxb);
        lxb2.Lxb(activity.findViewById(R.id.content));
        lxb2.LD(activity.findViewById(520093713));
        Lxb(activity.getApplicationContext(), tDVar, lxb2);
        Lxb(lxb2, tDVar);
        return lxb2;
    }

    public static QAg Lxb(tD tDVar, Activity activity, final com.bytedance.sdk.openadsdk.component.OY.Lxb lxb, com.bytedance.sdk.openadsdk.component.QAg.LD ld) {
        QAg qAg = new QAg(activity, tDVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.Lxb.LD.1
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
            public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(lxb.LD()));
                Lxb(map);
                super.Lxb(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        qAg.Lxb(ld);
        Lxb(activity.getApplicationContext(), tDVar, qAg);
        Lxb(qAg, tDVar);
        return qAg;
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.LD.LD ld, tD tDVar) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(tDVar.NXR()));
        map.put("openad_creative_type", tD.JXs(tDVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(eK.lk(tDVar) ? 3 : 1));
        ld.Lxb(map);
    }

    private static void Lxb(Context context, tD tDVar, com.bytedance.sdk.openadsdk.core.LD.LD ld) {
        if (tDVar == null || tDVar.sRq() != 4) {
            return;
        }
        ld.Lxb(ebl.Lxb(context, tDVar, "open_ad"));
    }
}
