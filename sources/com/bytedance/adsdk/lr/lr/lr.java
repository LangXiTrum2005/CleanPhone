package com.bytedance.adsdk.lr.lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.lr.di.di;
import com.bytedance.adsdk.lr.ka;
import com.bytedance.adsdk.lr.qt;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static final Object ri = new Object();
    private final Map<String, qt> fi;
    private final String ik;
    private ka ka;
    private final Context lr;

    public lr(Drawable.Callback callback, String str, ka kaVar, Map<String, qt> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.ik = str;
        } else {
            this.ik = str + '/';
        }
        this.fi = map;
        ri(kaVar);
        if (callback instanceof View) {
            this.lr = ((View) callback).getContext().getApplicationContext();
        } else {
            this.lr = null;
        }
    }

    private Bitmap lr(String str, Bitmap bitmap) {
        synchronized (ri) {
            this.fi.get(str).ri(bitmap);
        }
        return bitmap;
    }

    public void ri(ka kaVar) {
        this.ka = kaVar;
    }

    public Bitmap ri(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapSf = this.fi.get(str).sf();
            lr(str, bitmap);
            return bitmapSf;
        }
        qt qtVar = this.fi.get(str);
        Bitmap bitmapSf2 = qtVar.sf();
        qtVar.ri(null);
        return bitmapSf2;
    }

    public Bitmap ri(String str) {
        qt qtVar = this.fi.get(str);
        if (qtVar == null) {
            return null;
        }
        Bitmap bitmapSf = qtVar.sf();
        if (bitmapSf != null) {
            return bitmapSf;
        }
        ka kaVar = this.ka;
        if (kaVar != null) {
            return kaVar.ri(qtVar);
        }
        Context context = this.lr;
        if (context == null) {
            return null;
        }
        String strJbs = qtVar.jbs();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strJbs.startsWith("data:") && strJbs.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strJbs.substring(strJbs.indexOf(44) + 1), 0);
                return lr(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.ik)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.ik + strJbs), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return lr(str, di.ri(bitmapDecodeStream, qtVar.ri(), qtVar.lr()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean ri(Context context) {
        return (context == null && this.lr == null) || this.lr.equals(context);
    }
}
