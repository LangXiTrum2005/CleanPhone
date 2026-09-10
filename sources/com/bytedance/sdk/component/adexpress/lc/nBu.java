package com.bytedance.sdk.component.adexpress.lc;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends com.bytedance.adsdk.LD.lc {
    private String LD;
    private Map<String, Bitmap> Lxb;

    public static class Lxb implements com.bytedance.sdk.component.JXs.VVE<Bitmap> {
        private final com.bytedance.adsdk.LD.nBu LD;
        private final WeakReference<nBu> Lxb;
        private final Map<String, Bitmap> ZU;
        private final String lk;

        public Lxb(nBu nbu, com.bytedance.adsdk.LD.nBu nbu2, String str, Map<String, Bitmap> map) {
            this.Lxb = new WeakReference<>(nbu);
            this.LD = nbu2;
            this.lk = str;
            this.ZU = map;
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(jva.LD(), this.LD.Lxb(), this.LD.LD(), false);
            this.ZU.put(this.lk, bitmapCreateScaledBitmap);
            nBu nbu = this.Lxb.get();
            if (nbu != null) {
                nbu.Lxb(this.LD.OY(), bitmapCreateScaledBitmap);
            }
        }
    }

    public nBu(Context context) {
        super(context);
        this.Lxb = new HashMap();
    }

    public void OY() {
        if (TextUtils.isEmpty(this.LD)) {
            return;
        }
        setProgress(0.0f);
        Lxb(true);
        setAnimationFromUrl(this.LD);
        setImageAssetDelegate(new com.bytedance.adsdk.LD.ZU() { // from class: com.bytedance.sdk.component.adexpress.lc.nBu.1
            @Override // com.bytedance.adsdk.LD.ZU
            public Bitmap Lxb(final com.bytedance.adsdk.LD.nBu nbu) {
                final String strOY = nbu.OY();
                String strNBu = nbu.nBu();
                String strQAg = nbu.QAg();
                if (TextUtils.equals(strOY, "image_0") && TextUtils.equals(strQAg, "Lark20201123-180048_2.png")) {
                    strQAg = "hand.png";
                }
                Bitmap bitmap = (Bitmap) nBu.this.Lxb.get(strOY);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strNBu) || !TextUtils.isEmpty(strQAg)) {
                    if (TextUtils.isEmpty(strQAg) || !TextUtils.isEmpty(strNBu)) {
                        strNBu = (TextUtils.isEmpty(strQAg) || TextUtils.isEmpty(strNBu)) ? "" : DM.h(strNBu, strQAg);
                    } else {
                        strNBu = strQAg;
                    }
                }
                if (TextUtils.isEmpty(strNBu)) {
                    return null;
                }
                com.bytedance.sdk.component.JXs.nBu nbuLxb = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().JXs().Lxb(strNBu).Lxb(new com.bytedance.sdk.component.JXs.OY() { // from class: com.bytedance.sdk.component.adexpress.lc.nBu.1.1
                    @Override // com.bytedance.sdk.component.JXs.OY
                    public Bitmap Lxb(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, nbu.Lxb(), nbu.LD(), false);
                        nBu.this.Lxb.put(strOY, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                nBu nbu2 = nBu.this;
                nbuLxb.Lxb(new Lxb(nbu2, nbu, strOY, nbu2.Lxb));
                return (Bitmap) nBu.this.Lxb.get(strOY);
            }
        });
        Lxb();
    }

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.LD = str;
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }
}
