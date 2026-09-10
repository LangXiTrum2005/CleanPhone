package com.bytedance.adsdk.ud.ud;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.ud.mml;
import com.bytedance.adsdk.ud.mo.mo;
import com.bytedance.adsdk.ud.to;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private static final Object qdl = new Object();
    private final String lnr;
    private mml mml;
    private final Map<String, to> mzz;
    private final Context ud;

    public ud(Drawable.Callback callback, String str, mml mmlVar, Map<String, to> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.lnr = str;
        } else {
            this.lnr = str.concat("/");
        }
        this.mzz = map;
        qdl(mmlVar);
        if (callback instanceof View) {
            this.ud = ((View) callback).getContext().getApplicationContext();
        } else {
            this.ud = null;
        }
    }

    private Bitmap ud(String str, Bitmap bitmap) {
        synchronized (qdl) {
            this.mzz.get(str).qdl(bitmap);
        }
        return bitmap;
    }

    public void qdl(mml mmlVar) {
        this.mml = mmlVar;
    }

    public Bitmap qdl(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapRq = this.mzz.get(str).rq();
            ud(str, bitmap);
            return bitmapRq;
        }
        to toVar = this.mzz.get(str);
        Bitmap bitmapRq2 = toVar.rq();
        toVar.qdl(null);
        return bitmapRq2;
    }

    public Bitmap qdl(String str) {
        to toVar = this.mzz.get(str);
        if (toVar == null) {
            return null;
        }
        Bitmap bitmapRq = toVar.rq();
        if (bitmapRq != null) {
            return bitmapRq;
        }
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            return mmlVar.qdl(toVar);
        }
        Context context = this.ud;
        if (context == null) {
            return null;
        }
        String strTvp = toVar.tvp();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strTvp.startsWith("data:") && strTvp.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strTvp.substring(strTvp.indexOf(44) + 1), 0);
                return ud(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.lnr)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.lnr + strTvp), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return ud(str, mo.qdl(bitmapDecodeStream, toVar.qdl(), toVar.ud()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean qdl(Context context) {
        return (context == null && this.ud == null) || this.ud.equals(context);
    }
}
