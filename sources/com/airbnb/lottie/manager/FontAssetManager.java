package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class FontAssetManager {
    public final AssetManager d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutablePair f9703a = new MutablePair();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9704b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f9705c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9706e = ".ttf";

    public FontAssetManager(Drawable.Callback callback, FontAssetDelegate fontAssetDelegate) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            Logger.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }
}
