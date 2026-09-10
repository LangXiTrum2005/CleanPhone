package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.h2;
import com.applovin.impl.k5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f9561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0017a f9562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f9563i;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface InterfaceC0017a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, l lVar, InterfaceC0017a interfaceC0017a) {
        super("TaskCacheNativeAd", lVar);
        this.f9563i = UUID.randomUUID().toString();
        this.f9561g = appLovinNativeAdImpl;
        this.f9562h = interfaceC0017a;
    }

    private float a(Uri uri) {
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                int i10 = options.outWidth;
                int i11 = options.outHeight;
                if (i10 <= 0 || i11 <= 0) {
                    fileInputStream.close();
                    return -1.0f;
                }
                float f10 = i10 / i11;
                fileInputStream.close();
                return f10;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            if (p.a()) {
                this.f8299c.a(this.f8298b, "Failed to calculate aspect ratio", e10);
            }
        }
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (p.a()) {
            this.f8299c.a(this.f8298b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f8297a.I().a(a(), uri.toString(), this.f9561g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, this.f9563i, h2.a(this.f9561g));
        if (TextUtils.isEmpty(strA)) {
            if (p.a()) {
                this.f8299c.b(this.f8298b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f8297a.I().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (p.a()) {
                this.f8299c.b(this.f8298b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (p.a()) {
            this.f8299c.b(this.f8298b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (p.a()) {
            this.f8299c.a(this.f8298b, "Begin caching ad #" + this.f9561g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.f9561g.getIconUri());
        if (uriB != null) {
            this.f9561g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f9561g.getMainImageUri());
        if (uriB2 != null) {
            this.f9561g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f9561g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.f9561g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f9561g.setPrivacyIconUri(uriB3);
        }
        if (p.a()) {
            this.f8299c.a(this.f8298b, "Finished caching ad #" + this.f9561g.getAdIdNumber());
        }
        this.f9562h.a(this.f9561g);
    }
}
