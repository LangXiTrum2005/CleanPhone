package com.bytedance.sdk.openadsdk.ac.ri;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.fi.mj;
import com.bytedance.sdk.component.fi.qt;
import com.bytedance.sdk.component.fi.sf;
import com.bytedance.sdk.component.fi.slm;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.qt.ka;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ac.ri.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0221ri {
        void ri(int i, String str, Throwable th);

        void ri(String str, lr lrVar);
    }

    public void ri(com.bytedance.sdk.openadsdk.ac.ri riVar, final InterfaceC0221ri interfaceC0221ri, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, wjv wjvVar) {
        qt qtVarRi = ka.ri(riVar.ri).ri(riVar.lr).ri(i).lr(i2).fi(qd.fi(nr.ri())).ka(qd.ik(nr.ri())).lr(str).ri(scaleType).ri(!TextUtils.isEmpty(str));
        if (i3 <= 0 || Build.VERSION.SDK_INT < 26) {
            qtVarRi.ik(1);
        } else {
            qtVarRi.ik(2).ri(new mj() { // from class: com.bytedance.sdk.openadsdk.ac.ri.ri.1
                @Override // com.bytedance.sdk.component.fi.mj
                public Bitmap ri(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.ka.ri.ri(nr.ri(), bitmap, i3);
                }
            });
        }
        qtVarRi.ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, riVar.ri, new slm() { // from class: com.bytedance.sdk.openadsdk.ac.ri.ri.2
            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(sf sfVar) {
                ri.this.ri(sfVar, interfaceC0221ri);
            }

            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(int i4, String str2, Throwable th) {
                ri.this.ri(i4, str2, th, interfaceC0221ri);
            }
        }));
    }

    public void ri(sf sfVar, InterfaceC0221ri interfaceC0221ri) {
        if (interfaceC0221ri != null) {
            Object objLr = sfVar.lr();
            int iRi = ri(sfVar);
            if (objLr instanceof Drawable) {
                interfaceC0221ri.ri(sfVar.ri(), new lr((Drawable) objLr, iRi));
                return;
            }
            if (objLr instanceof byte[]) {
                interfaceC0221ri.ri(sfVar.ri(), new lr((byte[]) objLr, iRi));
                return;
            }
            if (objLr instanceof Bitmap) {
                interfaceC0221ri.ri(sfVar.ri(), new lr((Bitmap) objLr, sfVar.ik() instanceof Bitmap ? (Bitmap) sfVar.ik() : null, iRi));
            } else {
                interfaceC0221ri.ri(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int ri(sf sfVar) {
        Object obj;
        Map<String, String> mapKa = sfVar.ka();
        if (mapKa == null || (obj = mapKa.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void ri(int i, String str, Throwable th, InterfaceC0221ri interfaceC0221ri) {
        if (interfaceC0221ri != null) {
            interfaceC0221ri.ri(i, str, th);
        }
    }
}
