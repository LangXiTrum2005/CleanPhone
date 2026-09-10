package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ironsource.C3700q2;
import com.ironsource.X3;
import com.unity3d.services.core.fid.Constants;
import java.util.concurrent.Executor;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0013\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/internal/util/formularize;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", "ioExecutor", "", X3.a.f, "(Ljava/util/concurrent/Executor;)V", "", "uri", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "onImageLoaded", "displayImage", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "onImageSizeLoaded", "getImageSize", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Ljava/util/concurrent/Executor;", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class formularize {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = formularize.class.getSimpleName();
    private static final formularize instance = new formularize();

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.formularize$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ImageLoader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/util/formularize$attabal;", "", "<init>", "()V", "Lcom/vungle/ads/internal/util/formularize;", C3700q2.p, "Lcom/vungle/ads/internal/util/formularize;", Constants.GET_INSTANCE, "()Lcom/vungle/ads/internal/util/formularize;", "", "FILE_SCHEME", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "TAG", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final formularize getInstance() {
            return formularize.instance;
        }

        private Companion() {
        }
    }

    private formularize() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m3281displayImage$lambda0(String str, Function1 onImageLoaded) {
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        if (p002kotlin.text.dovishness.starveling(str, "file://", false, 2, null)) {
            String strSubstring = str.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                onImageLoaded.invoke(bitmapDecodeFile);
                return;
            }
            arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "decode bitmap failed.");
        }
    }

    public final void displayImage(final String uri, final Function1<? super Bitmap, Unit> onImageLoaded) {
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "ImageLoader not initialized.");
            return;
        }
        if (uri == null || uri.length() == 0) {
            arytenoidectomy.Companion companion2 = arytenoidectomy.INSTANCE;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.w(TAG3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.apical
                @Override // java.lang.Runnable
                public final void run() {
                    formularize.m3281displayImage$lambda0(uri, onImageLoaded);
                }
            });
        }
    }

    public final void getImageSize(String uri, Function2<? super Integer, ? super Integer, Unit> onImageSizeLoaded) {
        Intrinsics.checkNotNullParameter(onImageSizeLoaded, "onImageSizeLoaded");
        if (uri == null || uri.length() == 0 || !p002kotlin.text.dovishness.starveling(uri, "file://", false, 2, null)) {
            arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "the valid uri is required.");
            return;
        }
        String strSubstring = uri.substring(7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strSubstring, options);
        onImageSizeLoaded.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final void init(Executor ioExecutor) {
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }
}
