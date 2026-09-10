package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.BaseColumns;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Consumer;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class FontsContractCompat {

    public static final class Columns implements BaseColumns {
    }

    public static class FontFamilyResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FontInfo[] f4376b;

        public FontFamilyResult(int i2, FontInfo[] fontInfoArr) {
            this.f4375a = i2;
            this.f4376b = fontInfoArr;
        }
    }

    public static class FontInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f4377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4379c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4380e;

        public FontInfo(Uri uri, int i2, int i3, boolean z2, int i4) {
            uri.getClass();
            this.f4377a = uri;
            this.f4378b = i2;
            this.f4379c = i3;
            this.d = z2;
            this.f4380e = i4;
        }
    }

    public static class FontRequestCallback {

        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }
    }

    public static FontFamilyResult a(Context context, FontRequest fontRequest) {
        return FontProvider.a(context, fontRequest);
    }

    public static Typeface b(final Context context, final FontRequest fontRequest, final int i2, boolean z2, int i3, Handler handler, TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter) {
        final CallbackWithHandler callbackWithHandler = new CallbackWithHandler(resourcesCallbackAdapter, handler);
        if (z2) {
            LruCache lruCache = FontRequestWorker.f4368a;
            final String str = fontRequest.f4367e + TokenBuilder.TOKEN_DELIMITER + i2;
            Typeface typeface = (Typeface) FontRequestWorker.f4368a.get(str);
            if (typeface != null) {
                callbackWithHandler.a(new FontRequestWorker.TypefaceResult(typeface));
                return typeface;
            }
            if (i3 == -1) {
                FontRequestWorker.TypefaceResult typefaceResultA = FontRequestWorker.a(str, context, fontRequest, i2);
                callbackWithHandler.a(typefaceResultA);
                return typefaceResultA.f4373a;
            }
            try {
                try {
                    try {
                        FontRequestWorker.TypefaceResult typefaceResult = (FontRequestWorker.TypefaceResult) FontRequestWorker.f4369b.submit(new Callable<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                            public final /* synthetic */ String X;

                            /* JADX INFO: renamed from: Y */
                            public final /* synthetic */ Context f4371Y;
                            public final /* synthetic */ FontRequest Z;
                            public final /* synthetic */ int e0;

                            public AnonymousClass1() {
                                str = str;
                                context = context;
                                fontRequest = fontRequest;
                                i = i2;
                            }

                            @Override // java.util.concurrent.Callable
                            public final TypefaceResult call() {
                                return FontRequestWorker.a(str, context, fontRequest, i);
                            }
                        }).get(i3, TimeUnit.MILLISECONDS);
                        callbackWithHandler.a(typefaceResult);
                        return typefaceResult.f4373a;
                    } catch (ExecutionException e2) {
                        throw new RuntimeException(e2);
                    } catch (TimeoutException unused) {
                        throw new InterruptedException("timeout");
                    }
                } catch (InterruptedException e3) {
                    throw e3;
                }
            } catch (InterruptedException unused2) {
                callbackWithHandler.a(new FontRequestWorker.TypefaceResult(-3));
                return null;
            }
        }
        LruCache lruCache2 = FontRequestWorker.f4368a;
        final String str2 = fontRequest.f4367e + TokenBuilder.TOKEN_DELIMITER + i2;
        Typeface typeface2 = (Typeface) FontRequestWorker.f4368a.get(str2);
        if (typeface2 != null) {
            callbackWithHandler.a(new FontRequestWorker.TypefaceResult(typeface2));
            return typeface2;
        }
        Consumer<FontRequestWorker.TypefaceResult> consumer = new Consumer<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
            public AnonymousClass2() {
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                TypefaceResult typefaceResult2 = (TypefaceResult) obj;
                if (typefaceResult2 == null) {
                    typefaceResult2 = new TypefaceResult(-3);
                }
                callbackWithHandler.a(typefaceResult2);
            }
        };
        synchronized (FontRequestWorker.f4370c) {
            try {
                SimpleArrayMap simpleArrayMap = FontRequestWorker.d;
                ArrayList arrayList = (ArrayList) simpleArrayMap.get(str2);
                if (arrayList != null) {
                    arrayList.add(consumer);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(consumer);
                simpleArrayMap.put(str2, arrayList2);
                FontRequestWorker.AnonymousClass3 anonymousClass3 = new FontRequestWorker.AnonymousClass3(str2, context, fontRequest, i2);
                ThreadPoolExecutor threadPoolExecutor = FontRequestWorker.f4369b;
                Consumer<FontRequestWorker.TypefaceResult> consumer2 = new Consumer<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                    public final /* synthetic */ String X;

                    public AnonymousClass4() {
                        str = str2;
                    }

                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        TypefaceResult typefaceResult2 = (TypefaceResult) obj;
                        synchronized (FontRequestWorker.f4370c) {
                            try {
                                SimpleArrayMap simpleArrayMap2 = FontRequestWorker.d;
                                ArrayList arrayList3 = (ArrayList) simpleArrayMap2.get(str);
                                if (arrayList3 == null) {
                                    return;
                                }
                                simpleArrayMap2.remove(str);
                                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                    ((Consumer) arrayList3.get(i4)).accept(typefaceResult2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                };
                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                RequestExecutor.ReplyRunnable replyRunnable = new RequestExecutor.ReplyRunnable();
                replyRunnable.X = anonymousClass3;
                replyRunnable.f4382Y = consumer2;
                replyRunnable.Z = handler2;
                threadPoolExecutor.execute(replyRunnable);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
