package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri fi;
    private final String ik;
    private boolean ka;
    private final wjv lr;
    com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ri;

    public interface ri {
        void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, int i, int i2, int i3);

        void ri(String str, JSONObject jSONObject);
    }

    public ka(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.fi = riVar;
        this.lr = riVar.lr;
        this.ik = riVar.fi;
    }

    private void ka() {
        if (this.lr.adz() == 4) {
            this.ri = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this.fi.srn, this.ik);
        }
        if (this.ri == null) {
            this.ri = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this.fi.ig, this.ik);
        }
    }

    public com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ik() {
        return this.ri;
    }

    public void lr() {
        com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar = this.ri;
        if (ikVar != null) {
            ikVar.ri(this.lr);
        }
    }

    public void ri() {
        if (this.ka) {
            return;
        }
        this.ka = true;
        ka();
    }

    public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, int i, int i2, int i3, ri riVar) {
        if (this.ri != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.slm.xha) {
                riVar.ri("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.slm.di) {
                riVar.ri("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.slm.fi) {
                riVar.ri("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.slm.ka) {
                    riVar.ri("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        riVar.ri(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }
}
