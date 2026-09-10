package com.bytedance.sdk.component.adexpress.di;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends com.bytedance.adsdk.lr.di {
    private String lr;
    private Map<String, Bitmap> ri;

    public static class ri implements com.bytedance.sdk.component.fi.slm {
        private final String ik;
        private final Map<String, Bitmap> ka;
        private final com.bytedance.adsdk.lr.qt lr;
        private final WeakReference<qt> ri;

        public ri(qt qtVar, com.bytedance.adsdk.lr.qt qtVar2, String str, Map<String, Bitmap> map) {
            this.ri = new WeakReference<>(qtVar);
            this.lr = qtVar2;
            this.ik = str;
            this.ka = map;
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
            Object objLr = sfVar.lr();
            if (objLr instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objLr, this.lr.ri(), this.lr.lr(), false);
                this.ka.put(this.ik, bitmapCreateScaledBitmap);
                qt qtVar = this.ri.get();
                if (qtVar != null) {
                    qtVar.ri(this.lr.mj(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public qt(Context context) {
        super(context);
        this.ri = new HashMap();
    }

    public void mj() {
        if (TextUtils.isEmpty(this.lr)) {
            return;
        }
        setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ri(true);
        setAnimationFromUrl(this.lr);
        setImageAssetDelegate(new com.bytedance.adsdk.lr.ka() { // from class: com.bytedance.sdk.component.adexpress.di.qt.1
            @Override // com.bytedance.adsdk.lr.ka
            public Bitmap ri(final com.bytedance.adsdk.lr.qt qtVar) {
                final String strMj = qtVar.mj();
                String strQt = qtVar.qt();
                String strJbs = qtVar.jbs();
                if (TextUtils.equals(strMj, "image_0") && TextUtils.equals(strJbs, "Lark20201123-180048_2.png")) {
                    strJbs = "hand.png";
                }
                Bitmap bitmap = (Bitmap) qt.this.ri.get(strMj);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strQt) || !TextUtils.isEmpty(strJbs)) {
                    if (!TextUtils.isEmpty(strJbs) && TextUtils.isEmpty(strQt)) {
                        strQt = strJbs;
                    } else if (TextUtils.isEmpty(strJbs) || TextUtils.isEmpty(strQt)) {
                        strQt = "";
                    } else {
                        strQt = strQt + strJbs;
                    }
                }
                if (TextUtils.isEmpty(strQt)) {
                    return null;
                }
                com.bytedance.sdk.component.fi.qt qtVarRi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().fi().ri(strQt).ik(2).ri(new com.bytedance.sdk.component.fi.mj() { // from class: com.bytedance.sdk.component.adexpress.di.qt.1.1
                    @Override // com.bytedance.sdk.component.fi.mj
                    public Bitmap ri(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, qtVar.ri(), qtVar.lr(), false);
                        qt.this.ri.put(strMj, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                qt qtVar2 = qt.this;
                qtVarRi.ri(new ri(qtVar2, qtVar, strMj, qtVar2.ri));
                return (Bitmap) qt.this.ri.get(strMj);
            }
        });
        ri();
    }

    public void setImageLottieTosPath(String str) {
        this.lr = str;
    }

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }
}
