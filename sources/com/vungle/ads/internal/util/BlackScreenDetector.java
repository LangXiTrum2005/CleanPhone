package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BlackScreenDetector.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J9\u0010$\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0003J-\u0010(\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b'\u0010\u000bJ-\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\"0)2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b*\u0010+R*\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010-¨\u00062²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/util/BlackScreenDetector;", "", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "onComplete", "captureViewWithPixelCopy", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/Window;", "window", "Landroid/graphics/Rect;", "rect", "bitmap", "executePixelCopyRequest", "(Landroid/view/Window;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)V", "captureViewWithCanvas", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "getActivity", "(Landroid/content/Context;)Landroid/app/Activity;", "image", "", "marginPercentage", "", "samplingFactor", "maxMarginPercentage", "calculateBlackScreenPercentageWithMargin", "(Landroid/graphics/Bitmap;DID)I", "Lkotlin/Function2;", "", "callback", "start", "(Landroid/view/View;ILkotlin/jvm/functions/Function2;)V", "stop", "captureViewBitmapAsync$vungle_ads_release", "captureViewBitmapAsync", "Lkotlin/Pair;", "processBitmapForBlackScreen$vungle_ads_release", "(Landroid/graphics/Bitmap;I)Lkotlin/Pair;", "processBitmapForBlackScreen", "Lkotlin/jvm/functions/Function2;", "Companion", "attabal", "Lcom/vungle/ads/internal/executor/attabal;", "executors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BlackScreenDetector {
    private static final int BLACK_PIXEL_THRESHOLD = 10;
    private static final double BLACK_SCREEN_MARGIN_PERCENTAGE = 0.1d;
    private static final String TAG = "BlackScreenDetector";
    private volatile Function2<? super Integer, ? super String, Unit> callback;

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BlackScreenDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40001 extends Lambda implements Function0<Unit> {
        final /* synthetic */ patroclinal.taiyuan<com.vungle.ads.internal.executor.attabal> $executors$delegate;
        final /* synthetic */ Function1<Bitmap, Unit> $onComplete;
        final /* synthetic */ View $view;
        final /* synthetic */ Window $window;
        final /* synthetic */ BlackScreenDetector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C40001(View view, patroclinal.taiyuan<? extends com.vungle.ads.internal.executor.attabal> taiyuanVar, BlackScreenDetector blackScreenDetector, Window window, Function1<? super Bitmap, Unit> function1) {
            super(0);
            this.$view = view;
            this.$executors$delegate = taiyuanVar;
            this.this$0 = blackScreenDetector;
            this.$window = window;
            this.$onComplete = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m3278invoke$lambda0(int i, int i2, BlackScreenDetector this$0, Window window, Rect rect, Function1 onComplete) {
            Bitmap bitmapCreateBitmap;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(rect, "$rect");
            Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                try {
                    this$0.executePixelCopyRequest(window, rect, bitmapCreateBitmap, onComplete);
                } catch (Throwable th) {
                    th = th;
                    arytenoidectomy.INSTANCE.e(BlackScreenDetector.TAG, "Bitmap creation failed", th);
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    onComplete.invoke(null);
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap = null;
            }
        }

        @Override // p002kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final int width = this.$view.getWidth();
            final int height = this.$view.getHeight();
            int[] iArr = new int[2];
            this.$view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            final Rect rect = new Rect(i, i2, i + width, i2 + height);
            VungleThreadPoolExecutor job_executor = BlackScreenDetector.m3276captureViewWithPixelCopy$lambda0(this.$executors$delegate).getJOB_EXECUTOR();
            final BlackScreenDetector blackScreenDetector = this.this$0;
            final Window window = this.$window;
            final Function1<Bitmap, Unit> function1 = this.$onComplete;
            job_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.dern
                @Override // java.lang.Runnable
                public final void run() {
                    BlackScreenDetector.C40001.m3278invoke$lambda0(width, height, blackScreenDetector, window, rect, function1);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.BlackScreenDetector$start$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BlackScreenDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40011 extends Lambda implements Function1<Bitmap, Unit> {
        final /* synthetic */ int $samplingFactor;
        final /* synthetic */ View $view;
        final /* synthetic */ BlackScreenDetector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40011(View view, BlackScreenDetector blackScreenDetector, int i) {
            super(1);
            this.$view = view;
            this.this$0 = blackScreenDetector;
            this.$samplingFactor = i;
        }

        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        private static final com.vungle.ads.internal.executor.attabal m3279invoke$lambda0(patroclinal.taiyuan<? extends com.vungle.ads.internal.executor.attabal> taiyuanVar) {
            return taiyuanVar.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        public static final void m3280invoke$lambda1(BlackScreenDetector this$0, Bitmap bitmap, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                Pair<Integer, String> pairProcessBitmapForBlackScreen$vungle_ads_release = this$0.processBitmapForBlackScreen$vungle_ads_release(bitmap, i);
                int iIntValue = pairProcessBitmapForBlackScreen$vungle_ads_release.component1().intValue();
                String strComponent2 = pairProcessBitmapForBlackScreen$vungle_ads_release.component2();
                Function2 function2 = this$0.callback;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(iIntValue), strComponent2);
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this$0.callback = null;
            } catch (Throwable th) {
                try {
                    arytenoidectomy.INSTANCE.e(BlackScreenDetector.TAG, "Black screen detection failed", th);
                    Function2 function3 = this$0.callback;
                    if (function3 != null) {
                        function3.invoke(-1, "Internal calculation error: " + th.getMessage());
                    }
                } finally {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this$0.callback = null;
                }
            }
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final Bitmap bitmap) {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.$view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            VungleThreadPoolExecutor job_executor = m3279invoke$lambda0(p002kotlin.saneness.attabal(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<com.vungle.ads.internal.executor.attabal>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$start$1$invoke$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.attabal, java.lang.Object] */
                @Override // p002kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.executor.attabal invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.attabal.class);
                }
            })).getJOB_EXECUTOR();
            final BlackScreenDetector blackScreenDetector = this.this$0;
            final int i = this.$samplingFactor;
            job_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.wireman
                @Override // java.lang.Runnable
                public final void run() {
                    BlackScreenDetector.C40011.m3280invoke$lambda1(blackScreenDetector, bitmap, i);
                }
            });
        }
    }

    private final int calculateBlackScreenPercentageWithMargin(Bitmap image, double marginPercentage, int samplingFactor, double maxMarginPercentage) {
        int i;
        int width = image.getWidth();
        int height = image.getHeight();
        int i2 = (int) (((double) width) * marginPercentage);
        int i3 = (int) (((double) height) * marginPercentage);
        int i4 = width - (i2 * 2);
        int i5 = height - (i3 * 2);
        if (i4 <= 0 || i5 <= 0) {
            return -1;
        }
        long j = ((long) i4) * ((long) i5);
        if (j > 2147483647L) {
            if (marginPercentage >= maxMarginPercentage) {
                return -1;
            }
            return calculateBlackScreenPercentageWithMargin(image, marginPercentage * ((double) 2), samplingFactor, maxMarginPercentage);
        }
        int i6 = (int) j;
        int[] iArr = new int[i6];
        image.getPixels(iArr, 0, i4, i2, i3, i4, i5);
        int i7 = i6 - 1;
        if (samplingFactor <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + samplingFactor + '.');
        }
        int iDern = dessertspoon.dern.dern(0, i7, samplingFactor);
        int i8 = 0;
        if (iDern >= 0) {
            int i9 = 0;
            i = 0;
            while (true) {
                i8++;
                int i10 = iArr[i9];
                int i11 = (i10 >> 24) & 255;
                int i12 = (i10 >> 16) & 255;
                int i13 = (i10 >> 8) & 255;
                int i14 = i10 & 255;
                if (i11 > 0 && i12 < 10 && i13 < 10 && i14 < 10) {
                    i++;
                }
                if (i9 == iDern) {
                    break;
                }
                i9 += samplingFactor;
            }
        } else {
            i = 0;
        }
        if (i8 > 0) {
            return (int) ((((long) i) * ((long) 100)) / ((long) i8));
        }
        return 0;
    }

    public static /* synthetic */ int calculateBlackScreenPercentageWithMargin$default(BlackScreenDetector blackScreenDetector, Bitmap bitmap, double d, int i, double d2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 100;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            d2 = 0.5d;
        }
        return blackScreenDetector.calculateBlackScreenPercentageWithMargin(bitmap, d, i3, d2);
    }

    private final void captureViewWithCanvas(final View view, final Function1<? super Bitmap, Unit> onComplete) {
        gintrap.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector.captureViewWithCanvas.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    view.draw(new Canvas(bitmapCreateBitmap));
                    onComplete.invoke(bitmapCreateBitmap);
                } catch (Throwable th) {
                    arytenoidectomy.INSTANCE.e(BlackScreenDetector.TAG, "Bitmap capture failed", th);
                    onComplete.invoke(null);
                }
            }
        });
    }

    private final void captureViewWithPixelCopy(View view, Function1<? super Bitmap, Unit> onComplete) {
        Activity activity = getActivity(view.getContext());
        Window window = activity != null ? activity.getWindow() : null;
        if (window == null) {
            arytenoidectomy.INSTANCE.w(TAG, "Activity/Window not found for PixelCopy");
            onComplete.invoke(null);
        } else {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            gintrap.INSTANCE.runOnUiThread(new C40001(view, p002kotlin.saneness.attabal(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<com.vungle.ads.internal.executor.attabal>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.attabal, java.lang.Object] */
                @Override // p002kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.executor.attabal invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.attabal.class);
                }
            }), this, window, onComplete));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: captureViewWithPixelCopy$lambda-0, reason: not valid java name */
    public static final com.vungle.ads.internal.executor.attabal m3276captureViewWithPixelCopy$lambda0(patroclinal.taiyuan<? extends com.vungle.ads.internal.executor.attabal> taiyuanVar) {
        return taiyuanVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executePixelCopyRequest(Window window, Rect rect, final Bitmap bitmap, final Function1<? super Bitmap, Unit> onComplete) {
        try {
            PixelCopy.request(window, rect, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.vungle.ads.internal.util.saneness
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    BlackScreenDetector.m3277executePixelCopyRequest$lambda1(onComplete, bitmap, i);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            arytenoidectomy.INSTANCE.e(TAG, "PixelCopy request failed", th);
            bitmap.recycle();
            onComplete.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executePixelCopyRequest$lambda-1, reason: not valid java name */
    public static final void m3277executePixelCopyRequest$lambda1(Function1 onComplete, Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        if (i == 0) {
            onComplete.invoke(bitmap);
            return;
        }
        arytenoidectomy.INSTANCE.w(TAG, "PixelCopy failed: " + i);
        bitmap.recycle();
        onComplete.invoke(null);
    }

    private final Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final void captureViewBitmapAsync$vungle_ads_release(View view, Function1<? super Bitmap, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (this.callback == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            captureViewWithPixelCopy(view, onComplete);
        } else {
            captureViewWithCanvas(view, onComplete);
        }
    }

    public final Pair<Integer, String> processBitmapForBlackScreen$vungle_ads_release(Bitmap bitmap, int samplingFactor) {
        if (bitmap != null) {
            int iCalculateBlackScreenPercentageWithMargin$default = calculateBlackScreenPercentageWithMargin$default(this, bitmap, 0.1d, samplingFactor, 0.0d, 8, null);
            return new Pair<>(Integer.valueOf(iCalculateBlackScreenPercentageWithMargin$default), iCalculateBlackScreenPercentageWithMargin$default == -1 ? "Internal calculation error" : "");
        }
        arytenoidectomy.INSTANCE.w(TAG, "Black screen detection failed: Snapshot capture failure");
        return new Pair<>(-1, "Snapshot capture failure");
    }

    public final void start(View view, int samplingFactor, Function2<? super Integer, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        if (view != null) {
            captureViewBitmapAsync$vungle_ads_release(view, new C40011(view, this, samplingFactor));
            return;
        }
        arytenoidectomy.INSTANCE.w(TAG, "Black screen detection failed: View not available");
        Function2<? super Integer, ? super String, Unit> function2 = this.callback;
        if (function2 != null) {
            function2.invoke(-1, "View not available");
        }
        this.callback = null;
    }

    public final void stop() {
        this.callback = null;
    }
}
