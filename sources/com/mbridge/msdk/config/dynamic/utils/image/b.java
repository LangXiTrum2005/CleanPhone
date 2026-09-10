package com.mbridge.msdk.config.dynamic.utils.image;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import b2.o;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f32808a;

        public a(ImageView imageView) {
            this.f32808a = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("ImageOperateUtil", "图片下载失败: " + str + " URL: " + str2);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                ImageView imageView = this.f32808a;
                if (imageView instanceof ComponentImageView) {
                    ((ComponentImageView) imageView).setBitmap(bitmap);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            } catch (Throwable th2) {
                q0.b("ImageOperateUtil", "设置图片异常: " + th2.getMessage());
            }
        }
    }

    public static void a(ImageView imageView, Bitmap bitmap) {
        a(imageView, bitmap, 25.0f, Shader.TileMode.MIRROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Bitmap bitmap, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new com.applovin.impl.sdk.utils.b(b(bitmap), imageView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final float f10, final Shader.TileMode tileMode) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.d
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(bitmap, f10, tileMode, imageView);
                }
            });
        } else {
            imageView.setImageBitmap(bitmap);
            a(imageView, f10, tileMode);
        }
    }

    public static void b(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new com.applovin.impl.sdk.utils.b(bitmap, imageView, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static Bitmap b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    float f10 = iMin;
                    canvas.drawCircle(f10, f10, f10, paint);
                    return bitmapCreateBitmap;
                }
            } catch (Throwable th2) {
                q0.b("ImageOperateUtil", th2.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, float f10, Shader.TileMode tileMode, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new com.applovin.impl.sdk.utils.b(a(bitmap, f10, tileMode), imageView, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final int i10, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        final int iA = a(str);
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.c
            @Override // java.lang.Runnable
            public final void run() {
                b.a(bitmap, i10, iA, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, int i10, int i11, ImageView imageView) {
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new com.applovin.impl.sdk.utils.b(a(bitmap, i10, i11), imageView, 3));
    }

    public static void a(ImageView imageView, Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            imageView.setImageBitmap(a());
        } else if (bitmapArr.length == 1) {
            a(imageView, bitmapArr[0]);
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new o(23, bitmapArr, imageView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap[] bitmapArr, ImageView imageView) {
        com.mbridge.msdk.video.dynview.shape.a aVarBuild;
        ArrayList arrayList = new ArrayList();
        for (Bitmap bitmap : bitmapArr) {
            arrayList.add(a(bitmap, 25.0f, Shader.TileMode.MIRROR));
        }
        if (arrayList.size() <= 1 || (aVarBuild = com.mbridge.msdk.video.dynview.shape.a.a().b((Bitmap) arrayList.get(0)).a((Bitmap) arrayList.get(1)).a(5).orientation(m0.G(com.mbridge.msdk.foundation.controller.c.n().d())).build()) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new o(24, imageView, aVarBuild));
    }

    public static void a(View view, float f10, Shader.TileMode tileMode) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f10 = 25.0f;
                }
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                view.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            }
        } catch (Throwable th2) {
            q0.b("ImageOperateUtil", th2.getMessage());
        }
    }

    public static Bitmap a(Bitmap bitmap, float f10, Shader.TileMode tileMode) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = 25.0f;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f10, f10, tileMode);
                ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                RenderNode renderNode = new RenderNode("BlurEffect");
                HardwareRenderer hardwareRenderer = new HardwareRenderer();
                hardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
                hardwareRenderer.setContentRoot(renderNode);
                renderNode.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
                renderNode.setRenderEffect(renderEffectCreateBlurEffect);
                renderNode.beginRecording().drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                renderNode.endRecording();
                hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                if (hardwareBuffer != null) {
                    Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                    imageAcquireNextImage.close();
                    hardwareBuffer.close();
                    return bitmapWrapHardwareBuffer;
                }
                return a();
            }
            return a(bitmap);
        } catch (Throwable th2) {
            q0.b("ImageOperateUtil", th2.getMessage());
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        try {
            Bitmap bitmapA = com.mbridge.msdk.config.dynamic.utils.image.a.a(bitmap, 10);
            if (bitmapA != null && !bitmapA.isRecycled()) {
                return bitmapA;
            }
            return a();
        } catch (Throwable th2) {
            q0.b("ImageOperateUtil", th2.getMessage());
            return null;
        }
    }

    private static Bitmap a() {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor("#FF0000"));
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            q0.b("ImageOperateUtil", th2.getMessage());
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, float f10, int i10) {
        Bitmap bitmap2;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Path path = new Path();
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight());
            bitmap2 = null;
            try {
                switch (i10) {
                    case 0:
                        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                        break;
                    case 1:
                        path.addRoundRect(rectF, new float[]{f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                        break;
                    case 2:
                        path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                        break;
                    case 3:
                        path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10}, Path.Direction.CW);
                        break;
                    case 4:
                        path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                        break;
                    case 5:
                        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                        break;
                    case 6:
                        path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10, f10, f10}, Path.Direction.CW);
                        break;
                    case 7:
                        path.addRoundRect(rectF, new float[]{f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10}, Path.Direction.CW);
                        break;
                    case 8:
                        path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10, f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                        break;
                    case 9:
                        path.addRoundRect(rectF, new float[]{f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, Path.Direction.CW);
                        break;
                    case 10:
                        path.addRoundRect(rectF, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10}, Path.Direction.CW);
                        break;
                }
                canvas.clipPath(path);
                canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                return bitmapCreateBitmap;
            } catch (Throwable th2) {
                th = th2;
                q0.b("ImageOperateUtil", th.getMessage());
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = null;
        }
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.equals("corner")) {
            return 0;
        }
        String strReplace = str.replace("corner", "");
        if (TextUtils.isEmpty(strReplace)) {
            return 0;
        }
        String upperCase = strReplace.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "BA":
                return 6;
            case "BL":
                return 3;
            case "BR":
                return 4;
            case "LA":
                return 7;
            case "RA":
                return 8;
            case "TA":
                return 5;
            case "TL":
                return 1;
            case "TR":
                return 2;
            case "BLTR":
                return 10;
            case "TLBR":
                return 9;
            default:
                return 0;
        }
    }

    public static void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        f2.g().a(str, new a(imageView));
    }
}
