package com.airbnb.lottie.model.layer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ImageLayer extends BaseLayer {
    public final LPaint C;
    public final Rect D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f9838E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final LottieImageAsset f9839F;
    public ValueCallbackKeyframeAnimation G;
    public ValueCallbackKeyframeAnimation H;

    public ImageLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.C = new LPaint(3);
        this.D = new Rect();
        this.f9838E = new Rect();
        LottieComposition lottieComposition = lottieDrawable.X;
        this.f9839F = lottieComposition == null ? null : (LottieImageAsset) lottieComposition.d.get(layer.g);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        super.d(colorFilter, lottieValueCallback);
        if (colorFilter == LottieProperty.f9532F) {
            this.G = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
        } else if (colorFilter == LottieProperty.f9533I) {
            this.H = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void f(RectF rectF, Matrix matrix, boolean z2) {
        super.f(rectF, matrix, z2);
        LottieImageAsset lottieImageAsset = this.f9839F;
        if (lottieImageAsset != null) {
            float fC = Utils.c();
            rectF.set(0.0f, 0.0f, lottieImageAsset.f9526a * fC, lottieImageAsset.f9527b * fC);
            this.f9828n.mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x011b  */
    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void k(Canvas canvas, Matrix matrix, int i2) {
        ImageAssetManager imageAssetManager;
        Bitmap bitmap;
        Bitmap bitmapDecodeStream;
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.H;
        LottieDrawable lottieDrawable = this.o;
        LottieImageAsset lottieImageAsset = this.f9839F;
        if (valueCallbackKeyframeAnimation == null || (bitmap = (Bitmap) valueCallbackKeyframeAnimation.f()) == null) {
            String str = this.f9829p.g;
            if (lottieDrawable.getCallback() == null) {
                imageAssetManager = null;
            } else {
                ImageAssetManager imageAssetManager2 = lottieDrawable.i0;
                if (imageAssetManager2 != null) {
                    Drawable.Callback callback = lottieDrawable.getCallback();
                    Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                    Context context2 = imageAssetManager2.f9708a;
                    if ((context != null || context2 != null) && !context2.equals(context)) {
                        lottieDrawable.i0 = null;
                    }
                }
                if (lottieDrawable.i0 == null) {
                    lottieDrawable.i0 = new ImageAssetManager(lottieDrawable.getCallback(), lottieDrawable.j0, lottieDrawable.k0, lottieDrawable.X.d);
                }
                imageAssetManager = lottieDrawable.i0;
            }
            if (imageAssetManager != null) {
                String str2 = imageAssetManager.f9709b;
                LottieImageAsset lottieImageAsset2 = (LottieImageAsset) imageAssetManager.d.get(str);
                if (lottieImageAsset2 == null) {
                    bitmap = null;
                } else {
                    Bitmap bitmap2 = lottieImageAsset2.d;
                    if (bitmap2 != null) {
                        bitmap = bitmap2;
                    } else {
                        ImageAssetDelegate imageAssetDelegate = imageAssetManager.f9710c;
                        if (imageAssetDelegate != null) {
                            bitmapDecodeStream = imageAssetDelegate.a();
                            if (bitmapDecodeStream != null) {
                                imageAssetManager.a(str, bitmapDecodeStream);
                            }
                        } else {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            String str3 = lottieImageAsset2.f9528c;
                            if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                                try {
                                    if (TextUtils.isEmpty(str2)) {
                                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                    }
                                    try {
                                        bitmapDecodeStream = BitmapFactory.decodeStream(imageAssetManager.f9708a.getAssets().open(str2 + str3), null, options);
                                        ThreadLocal threadLocal = Utils.f9946a;
                                        int width = bitmapDecodeStream.getWidth();
                                        int i3 = lottieImageAsset2.f9526a;
                                        int i4 = lottieImageAsset2.f9527b;
                                        if (width != i3 || bitmapDecodeStream.getHeight() != i4) {
                                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, i3, i4, true);
                                            bitmapDecodeStream.recycle();
                                            bitmapDecodeStream = bitmapCreateScaledBitmap;
                                        }
                                        imageAssetManager.a(str, bitmapDecodeStream);
                                    } catch (IllegalArgumentException e2) {
                                        Logger.c("Unable to decode image.", e2);
                                        bitmap = null;
                                    }
                                } catch (IOException e3) {
                                    Logger.c("Unable to open asset.", e3);
                                }
                            } else {
                                try {
                                    byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                    bitmapDecodeStream = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                    imageAssetManager.a(str, bitmapDecodeStream);
                                } catch (IllegalArgumentException e4) {
                                    Logger.c("data URL did not have correct base64 format.", e4);
                                    bitmap = null;
                                }
                            }
                        }
                        bitmap = bitmapDecodeStream;
                    }
                }
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                bitmap = lottieImageAsset != null ? lottieImageAsset.d : null;
            }
        }
        if (bitmap == null || bitmap.isRecycled() || lottieImageAsset == null) {
            return;
        }
        float fC = Utils.c();
        LPaint lPaint = this.C;
        lPaint.setAlpha(i2);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.G;
        if (valueCallbackKeyframeAnimation2 != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation2.f());
        }
        canvas.save();
        canvas.concat(matrix);
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.D;
        rect.set(0, 0, width2, height);
        boolean z2 = lottieDrawable.p0;
        Rect rect2 = this.f9838E;
        if (z2) {
            rect2.set(0, 0, (int) (lottieImageAsset.f9526a * fC), (int) (lottieImageAsset.f9527b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmap.getWidth() * fC), (int) (bitmap.getHeight() * fC));
        }
        canvas.drawBitmap(bitmap, rect, rect2, lPaint);
        canvas.restore();
    }
}
