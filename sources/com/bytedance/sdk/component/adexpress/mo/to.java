package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.media.a;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class to extends com.bytedance.adsdk.ud.mo {
    private Map<String, Bitmap> qdl;
    private String ud;

    public static class qdl implements com.bytedance.sdk.component.mzz.jtx {
        private final String lnr;
        private final Map<String, Bitmap> mml;
        private final WeakReference<to> qdl;
        private final com.bytedance.adsdk.ud.to ud;

        public qdl(to toVar, com.bytedance.adsdk.ud.to toVar2, String str, Map<String, Bitmap> map) {
            this.qdl = new WeakReference<>(toVar);
            this.ud = toVar2;
            this.lnr = str;
            this.mml = map;
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(int i2, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
            Object objUd = rqVar.ud();
            if (objUd instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objUd, this.ud.qdl(), this.ud.ud(), false);
                this.mml.put(this.lnr, bitmapCreateScaledBitmap);
                to toVar = this.qdl.get();
                if (toVar != null) {
                    toVar.qdl(this.ud.jpc(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public to(Context context) {
        super(context);
        this.qdl = new HashMap();
    }

    public void jpc() {
        if (TextUtils.isEmpty(this.ud)) {
            return;
        }
        setProgress(0.0f);
        qdl(true);
        setAnimationFromUrl(this.ud);
        setImageAssetDelegate(new com.bytedance.adsdk.ud.mml() { // from class: com.bytedance.sdk.component.adexpress.mo.to.1
            @Override // com.bytedance.adsdk.ud.mml
            public Bitmap qdl(final com.bytedance.adsdk.ud.to toVar) {
                final String strJpc = toVar.jpc();
                String strM = toVar.to();
                String strTvp = toVar.tvp();
                if (TextUtils.equals(strJpc, "image_0") && TextUtils.equals(strTvp, "Lark20201123-180048_2.png")) {
                    strTvp = "hand.png";
                }
                Bitmap bitmap = (Bitmap) to.this.qdl.get(strJpc);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strM) || !TextUtils.isEmpty(strTvp)) {
                    if (TextUtils.isEmpty(strTvp) || !TextUtils.isEmpty(strM)) {
                        strM = (TextUtils.isEmpty(strTvp) || TextUtils.isEmpty(strM)) ? "" : a.m(strM, strTvp);
                    } else {
                        strM = strTvp;
                    }
                }
                if (TextUtils.isEmpty(strM)) {
                    return null;
                }
                com.bytedance.sdk.component.mzz.to toVarQdl = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mzz().qdl(strM).lnr(2).qdl(new com.bytedance.sdk.component.mzz.jpc() { // from class: com.bytedance.sdk.component.adexpress.mo.to.1.1
                    @Override // com.bytedance.sdk.component.mzz.jpc
                    public Bitmap qdl(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, toVar.qdl(), toVar.ud(), false);
                        to.this.qdl.put(strJpc, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                to toVar2 = to.this;
                toVarQdl.qdl(new qdl(toVar2, toVar, strJpc, toVar2.qdl));
                return (Bitmap) to.this.qdl.get(strJpc);
            }
        });
        qdl();
    }

    public void setAnimationsLoop(boolean z2) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.ud = str;
    }

    public void setLottieAdDescMaxLength(int i2) {
    }

    public void setLottieAdTitleMaxLength(int i2) {
    }

    public void setLottieAppNameMaxLength(int i2) {
    }
}
