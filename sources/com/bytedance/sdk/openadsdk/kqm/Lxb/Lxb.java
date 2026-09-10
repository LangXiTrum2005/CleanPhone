package com.bytedance.sdk.openadsdk.kqm.Lxb;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.JXs.JVA;
import com.bytedance.sdk.component.JXs.OY;
import com.bytedance.sdk.component.JXs.VVE;
import com.bytedance.sdk.openadsdk.QAg.ZU;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.le;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.kqm.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0114Lxb {
        void Lxb(int i, String str, Throwable th);

        void Lxb(String str, LD ld);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.kqm.Lxb lxb, final InterfaceC0114Lxb interfaceC0114Lxb, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, tD tDVar) {
        ZU.Lxb(lxb.Lxb).Lxb(lxb.LD).Lxb(i).LD(i2).JXs(le.ZU(kqm.Lxb())).ZU(le.lk(kqm.Lxb())).LD(str).Lxb(Bitmap.Config.RGB_565).Lxb(scaleType).Lxb(!TextUtils.isEmpty(str)).Lxb(new OY() { // from class: com.bytedance.sdk.openadsdk.kqm.Lxb.Lxb.2
            @Override // com.bytedance.sdk.component.JXs.OY
            public Bitmap Lxb(Bitmap bitmap) {
                return i3 <= 0 ? bitmap : com.bytedance.sdk.component.adexpress.ZU.Lxb.Lxb(kqm.Lxb(), bitmap, i3);
            }
        }).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, lxb.Lxb, new VVE() { // from class: com.bytedance.sdk.openadsdk.kqm.Lxb.Lxb.1
            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(JVA jva) {
                Lxb.this.Lxb(jva, interfaceC0114Lxb);
            }

            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(int i4, String str2, Throwable th) {
                Lxb.this.Lxb(i4, str2, th, interfaceC0114Lxb);
            }
        }));
    }

    public void Lxb(JVA jva, InterfaceC0114Lxb interfaceC0114Lxb) {
        if (interfaceC0114Lxb != null) {
            Object objLD = jva.LD();
            int iLxb = Lxb(jva);
            if (objLD instanceof byte[]) {
                interfaceC0114Lxb.Lxb(jva.Lxb(), new LD((byte[]) objLD, iLxb));
                return;
            }
            if (objLD instanceof Bitmap) {
                interfaceC0114Lxb.Lxb(jva.Lxb(), new LD((Bitmap) objLD, jva.lk() instanceof Bitmap ? (Bitmap) jva.lk() : null, iLxb));
            } else {
                interfaceC0114Lxb.Lxb(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int Lxb(JVA jva) {
        Object obj;
        Map<String, String> mapZU = jva.ZU();
        if (mapZU == null || (obj = mapZU.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void Lxb(int i, String str, Throwable th, InterfaceC0114Lxb interfaceC0114Lxb) {
        if (interfaceC0114Lxb != null) {
            interfaceC0114Lxb.Lxb(i, str, th);
        }
    }
}
