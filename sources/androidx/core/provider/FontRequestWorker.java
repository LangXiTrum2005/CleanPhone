package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class FontRequestWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache f4368a = new LruCache(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f4369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4370c;
    public static final SimpleArrayMap d;

    /* JADX INFO: renamed from: androidx.core.provider.FontRequestWorker$3, reason: invalid class name */
    class AnonymousClass3 implements Callable<TypefaceResult> {
        public final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Context f4372Y;
        public final /* synthetic */ FontRequest Z;
        public final /* synthetic */ int e0;

        public AnonymousClass3(String str, Context context, FontRequest fontRequest, int i2) {
            this.X = str;
            this.f4372Y = context;
            this.Z = fontRequest;
            this.e0 = i2;
        }

        @Override // java.util.concurrent.Callable
        public final TypefaceResult call() {
            try {
                return FontRequestWorker.a(this.X, this.f4372Y, this.Z, this.e0);
            } catch (Throwable unused) {
                return new TypefaceResult(-3);
            }
        }
    }

    static {
        RequestExecutor.DefaultThreadFactory defaultThreadFactory = new RequestExecutor.DefaultThreadFactory();
        defaultThreadFactory.X = "fonts-androidx";
        defaultThreadFactory.f4381Y = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), defaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4369b = threadPoolExecutor;
        f4370c = new Object();
        d = new SimpleArrayMap(0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[EDGE_INSN: B:10:0x001e->B:24:0x003b BREAK  A[LOOP:0: B:17:0x002b->B:23:0x0038]] */
    public static TypefaceResult a(String str, Context context, FontRequest fontRequest, int i2) {
        LruCache lruCache = f4368a;
        Typeface typeface = (Typeface) lruCache.get(str);
        if (typeface != null) {
            return new TypefaceResult(typeface);
        }
        try {
            FontsContractCompat.FontFamilyResult fontFamilyResultA = FontProvider.a(context, fontRequest);
            int i3 = 1;
            FontsContractCompat.FontInfo[] fontInfoArr = fontFamilyResultA.f4376b;
            int i4 = fontFamilyResultA.f4375a;
            if (i4 != 0) {
                if (i4 != 1) {
                    i3 = -3;
                    break;
                }
                i3 = -2;
            } else if (fontInfoArr != null && fontInfoArr.length != 0) {
                i3 = 0;
                for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                    int i5 = fontInfo.f4380e;
                    if (i5 != 0) {
                        if (i5 >= 0) {
                            i3 = i5;
                            break;
                        }
                        i3 = -3;
                        break;
                    }
                }
            }
            if (i3 != 0) {
                return new TypefaceResult(i3);
            }
            Typeface typefaceA = TypefaceCompat.a(context, fontInfoArr, i2);
            if (typefaceA == null) {
                return new TypefaceResult(-3);
            }
            lruCache.put(str, typefaceA);
            return new TypefaceResult(typefaceA);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(-1);
        }
    }

    public static final class TypefaceResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f4373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4374b;

        public TypefaceResult(int i2) {
            this.f4373a = null;
            this.f4374b = i2;
        }

        public TypefaceResult(Typeface typeface) {
            this.f4373a = typeface;
            this.f4374b = 0;
        }
    }
}
