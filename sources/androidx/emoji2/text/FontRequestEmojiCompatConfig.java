package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Trace;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import java.nio.MappedByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    public static final FontProviderHelper d = new FontProviderHelper();

    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
    }

    public static class FontProviderHelper {
    }

    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f4988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FontRequest f4989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FontProviderHelper f4990c;
        public final Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f4991e;
        public ThreadPoolExecutor f;
        public ThreadPoolExecutor g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public EmojiCompat.MetadataRepoLoaderCallback f4992h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ContentObserver f4993i;

        /* JADX INFO: renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1, reason: invalid class name */
        class AnonymousClass1 extends ContentObserver {
            @Override // android.database.ContentObserver
            public final void onChange(boolean z2, Uri uri) {
                throw null;
            }
        }

        public FontRequestMetadataLoader(Context context, FontRequest fontRequest) {
            FontProviderHelper fontProviderHelper = FontRequestEmojiCompatConfig.d;
            this.d = new Object();
            Preconditions.d(context, "Context cannot be null");
            this.f4988a = context.getApplicationContext();
            this.f4989b = fontRequest;
            this.f4990c = fontProviderHelper;
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            synchronized (this.d) {
                this.f4992h = metadataRepoLoaderCallback;
            }
            synchronized (this.d) {
                try {
                    if (this.f4992h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new Runnable() { // from class: androidx.emoji2.text.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = this.X;
                            synchronized (fontRequestMetadataLoader.d) {
                                try {
                                    if (fontRequestMetadataLoader.f4992h == null) {
                                        return;
                                    }
                                    try {
                                        FontsContractCompat.FontInfo fontInfoC = fontRequestMetadataLoader.c();
                                        int i2 = fontInfoC.f4380e;
                                        if (i2 == 2) {
                                            synchronized (fontRequestMetadataLoader.d) {
                                            }
                                        }
                                        if (i2 != 0) {
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                                        }
                                        try {
                                            int i3 = TraceCompat.f4357a;
                                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper = fontRequestMetadataLoader.f4990c;
                                            Context context = fontRequestMetadataLoader.f4988a;
                                            fontProviderHelper.getClass();
                                            Typeface typefaceA = TypefaceCompat.a(context, new FontsContractCompat.FontInfo[]{fontInfoC}, 0);
                                            MappedByteBuffer mappedByteBufferE = TypefaceCompatUtil.e(fontRequestMetadataLoader.f4988a, fontInfoC.f4377a);
                                            if (mappedByteBufferE == null || typefaceA == null) {
                                                throw new RuntimeException("Unable to open file.");
                                            }
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                MetadataRepo metadataRepo = new MetadataRepo(typefaceA, MetadataListReader.a(mappedByteBufferE));
                                                Trace.endSection();
                                                Trace.endSection();
                                                synchronized (fontRequestMetadataLoader.d) {
                                                    try {
                                                        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = fontRequestMetadataLoader.f4992h;
                                                        if (metadataRepoLoaderCallback2 != null) {
                                                            metadataRepoLoaderCallback2.b(metadataRepo);
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                fontRequestMetadataLoader.b();
                                            } catch (Throwable th2) {
                                                int i4 = TraceCompat.f4357a;
                                                Trace.endSection();
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            int i5 = TraceCompat.f4357a;
                                            Trace.endSection();
                                            throw th3;
                                        }
                                    } catch (Throwable th4) {
                                        synchronized (fontRequestMetadataLoader.d) {
                                            try {
                                                EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback3 = fontRequestMetadataLoader.f4992h;
                                                if (metadataRepoLoaderCallback3 != null) {
                                                    metadataRepoLoaderCallback3.a(th4);
                                                }
                                                fontRequestMetadataLoader.b();
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.f4992h = null;
                    ContentObserver contentObserver = this.f4993i;
                    if (contentObserver != null) {
                        FontProviderHelper fontProviderHelper = this.f4990c;
                        Context context = this.f4988a;
                        fontProviderHelper.getClass();
                        context.getContentResolver().unregisterContentObserver(contentObserver);
                        this.f4993i = null;
                    }
                    Handler handler = this.f4991e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f4991e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final FontsContractCompat.FontInfo c() {
            try {
                FontProviderHelper fontProviderHelper = this.f4990c;
                Context context = this.f4988a;
                FontRequest fontRequest = this.f4989b;
                fontProviderHelper.getClass();
                FontsContractCompat.FontFamilyResult fontFamilyResultA = FontsContractCompat.a(context, fontRequest);
                int i2 = fontFamilyResultA.f4375a;
                if (i2 != 0) {
                    throw new RuntimeException(androidx.datastore.preferences.protobuf.a.k("fetchFonts failed (", i2, ")"));
                }
                FontsContractCompat.FontInfo[] fontInfoArr = fontFamilyResultA.f4376b;
                if (fontInfoArr == null || fontInfoArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return fontInfoArr[0];
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }
    }

    public static abstract class RetryPolicy {
    }
}
