package com.bytedance.adsdk.LD.LD;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.badlogic.gdx.Input;
import com.bytedance.adsdk.LD.ZU;
import com.bytedance.adsdk.LD.lc.lc;
import com.bytedance.adsdk.LD.nBu;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    private static final Object Lxb = new Object();
    private final Map<String, nBu> JXs;
    private final Context LD;
    private ZU ZU;
    private final String lk;

    public LD(Drawable.Callback callback, String str, ZU zu, Map<String, nBu> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.lk = str;
        } else {
            this.lk = str.concat("/");
        }
        this.JXs = map;
        Lxb(zu);
        if (callback instanceof View) {
            this.LD = ((View) callback).getContext().getApplicationContext();
        } else {
            this.LD = null;
        }
    }

    private Bitmap LD(String str, Bitmap bitmap) {
        synchronized (Lxb) {
        }
        return bitmap;
    }

    public void Lxb(ZU zu) {
        this.ZU = zu;
    }

    public Bitmap Lxb(String str, Bitmap bitmap) {
        if (bitmap != null) {
            return this.JXs.get(str).JVA();
        }
        nBu nbu = this.JXs.get(str);
        Bitmap bitmapJVA = nbu.JVA();
        nbu.Lxb(null);
        return bitmapJVA;
    }

    public Bitmap Lxb(String str) {
        nBu nbu = this.JXs.get(str);
        if (nbu == null) {
            return null;
        }
        Bitmap bitmapJVA = nbu.JVA();
        if (bitmapJVA != null) {
            return bitmapJVA;
        }
        ZU zu = this.ZU;
        if (zu != null) {
            return zu.Lxb(nbu);
        }
        Context context = this.LD;
        if (context == null) {
            return null;
        }
        String strQAg = nbu.QAg();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = Input.Keys.NUMPAD_ENTER;
        if (strQAg.startsWith("data:") && strQAg.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strQAg.substring(strQAg.indexOf(44) + 1), 0);
                return LD(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.lk)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.lk + strQAg), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return LD(str, lc.Lxb(bitmapDecodeStream, nbu.Lxb(), nbu.LD()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean Lxb(Context context) {
        return (context == null && this.LD == null) || this.LD.equals(context);
    }
}
