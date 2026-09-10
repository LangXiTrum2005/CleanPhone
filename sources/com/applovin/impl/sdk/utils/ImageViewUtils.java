package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.fragment.app.d;
import bc.r;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ImageViewUtils {
    public static void setAndDownscaleBitmap(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        l lVar = l.E0;
        if (lVar == null) {
            p.h("ImageViewUtils", "SDK has not been initialized");
        } else {
            lVar.s0().b().execute(new a(uri, imageView));
        }
    }

    public static void setAndDownscaleImageUri(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
            imageView.post(new a(imageView, uri, 2));
        } else {
            setAndDownscaleBitmap(imageView, uri);
        }
    }

    public static void setImageUri(ImageView imageView, Uri uri, l lVar) {
        if (imageView == null || uri == null) {
            return;
        }
        String string = uri.toString();
        if (URLUtil.isFileUrl(string) || URLUtil.isContentUrl(string)) {
            AppLovinSdkUtils.runOnUiThread(new a(imageView, uri, 0));
            return;
        }
        if (lVar == null) {
            return;
        }
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("ImageViewUtils", "Fetching image: " + uri);
        }
        lVar.s0().b().execute(new r(13, lVar, imageView, uri, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, l lVar, ImageView imageView, Uri uri) {
        try {
            InputStream inputStreamOpenStream = new URL(str).openStream();
            try {
                AppLovinSdkUtils.runOnUiThread(new d(lVar, BitmapFactory.decodeStream(inputStreamOpenStream), imageView, 24));
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } catch (Throwable th2) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("ImageViewUtils", "Failed to fetch image: " + uri, th4);
            }
            lVar.Q().a("ImageViewUtils", th4);
            lVar.E().a("ImageViewUtils", "setImageUri", th4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(l lVar, Bitmap bitmap, ImageView imageView) {
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(l.p().getResources(), bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Uri uri, ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point pointB = p0.b(imageView.getContext());
            height = Math.min(pointB.x, pointB.y);
            width = height;
        }
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > height || i12 > width) {
            while (true) {
                int i13 = i10 * 2;
                if (i11 / i13 < height && i12 / i13 < width) {
                    break;
                } else {
                    i10 = i13;
                }
            }
        }
        options.inSampleSize = i10;
        options.inJustDecodeBounds = false;
        l.E0.Q();
        if (p.a()) {
            l.E0.Q().a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        AppLovinSdkUtils.runOnUiThread(new b(BitmapFactory.decodeFile(uri.getPath(), options), imageView));
    }
}
