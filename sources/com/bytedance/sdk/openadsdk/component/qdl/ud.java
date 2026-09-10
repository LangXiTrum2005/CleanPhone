package com.bytedance.sdk.openadsdk.component.qdl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.tvp.jpc;
import com.bytedance.sdk.openadsdk.core.tvp.tvp;
import com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd;
import com.smartdigimkt.w5.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public static qdl qdl(ljh ljhVar, Activity activity, com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar) {
        qdl qdlVar2 = new qdl(activity.getApplicationContext(), ljhVar, "open_ad", 4, qdlVar);
        qdlVar2.qdl(activity.findViewById(R.id.content));
        qdl(activity.getApplicationContext(), ljhVar, qdlVar2);
        qdl(qdlVar2, ljhVar);
        return qdlVar2;
    }

    public static jpc ud(ljh ljhVar, Activity activity, final com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar, com.bytedance.sdk.openadsdk.component.tvp.ud udVar) {
        jpc jpcVar = new jpc(activity.getApplicationContext(), ljhVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.qdl.ud.2
            @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl, com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
            public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<lnr.qdl> sparseArray, boolean z2) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(qdlVar.lnr()));
                qdl(map);
                super.qdl(view, f, f2, f3, f4, sparseArray, z2);
            }
        };
        jpcVar.qdl((View) udVar);
        qdl(activity.getApplicationContext(), ljhVar, jpcVar);
        qdl(jpcVar, ljhVar);
        return jpcVar;
    }

    public static tvp qdl(ljh ljhVar, Activity activity, final com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar, com.bytedance.sdk.openadsdk.component.tvp.ud udVar) {
        tvp tvpVar = new tvp(activity, ljhVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.qdl.ud.1
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
            public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<lnr.qdl> sparseArray, boolean z2) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(qdlVar.lnr()));
                qdl(map);
                super.qdl(view, f, f2, f3, f4, sparseArray, z2);
            }
        };
        tvpVar.qdl(udVar);
        qdl(activity.getApplicationContext(), ljhVar, tvpVar);
        qdl(tvpVar, ljhVar);
        return tvpVar;
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.lnr.ud udVar, ljh ljhVar) {
        HashMap map = new HashMap();
        map.put(g.a.g, Integer.valueOf(ljhVar.irn()));
        map.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(vu.lnr(ljhVar) ? 3 : 1));
        udVar.qdl(map);
    }

    private static void qdl(Context context, ljh ljhVar, com.bytedance.sdk.openadsdk.core.lnr.ud udVar) {
        if (ljhVar == null || ljhVar.ygv() != 4) {
            return;
        }
        udVar.qdl(wd.qdl(context, "open_ad"));
    }
}
