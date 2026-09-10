package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ImageAssetManager {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f9707e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageAssetDelegate f9710c;
    public final HashMap d;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, HashMap map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f9709b = str;
        } else {
            this.f9709b = str.concat("/");
        }
        if (callback instanceof View) {
            this.f9708a = ((View) callback).getContext();
            this.d = map;
            this.f9710c = imageAssetDelegate;
        } else {
            Logger.b("LottieDrawable must be inside of a view for images to work.");
            this.d = new HashMap();
            this.f9708a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f9707e) {
            ((LottieImageAsset) this.d.get(str)).d = bitmap;
        }
    }
}
