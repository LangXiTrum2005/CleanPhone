package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Okio;
import okio.RealBufferedSource;
import okio.RealBufferedSource.AnonymousClass1;

/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f9522a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f9523b = {80, 75, 3, 4};

    public static LottieTask a(final String str, Callable callable) {
        LottieComposition lottieComposition = str == null ? null : (LottieComposition) LottieCompositionCache.f9730b.f9731a.get(str);
        if (lottieComposition != null) {
            return new LottieTask(new f(lottieComposition, 1), false);
        }
        HashMap map = f9522a;
        if (str != null && map.containsKey(str)) {
            return (LottieTask) map.get(str);
        }
        LottieTask lottieTask = new LottieTask(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i2 = 0;
            lottieTask.b(new LottieListener() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i2) {
                        case 0:
                            LottieCompositionFactory.f9522a.remove(str);
                            atomicBoolean.set(true);
                            break;
                        default:
                            LottieCompositionFactory.f9522a.remove(str);
                            atomicBoolean.set(true);
                            break;
                    }
                }
            });
            final int i3 = 1;
            lottieTask.a(new LottieListener() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i3) {
                        case 0:
                            LottieCompositionFactory.f9522a.remove(str);
                            atomicBoolean.set(true);
                            break;
                        default:
                            LottieCompositionFactory.f9522a.remove(str);
                            atomicBoolean.set(true);
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, lottieTask);
            }
        }
        return lottieTask;
    }

    public static LottieResult b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e2) {
            return new LottieResult((Throwable) e2);
        }
    }

    public static LottieResult c(InputStream inputStream, String str) {
        try {
            return d(JsonReader.G(Okio.d(Okio.i(inputStream))), str, true);
        } finally {
            Utils.b(inputStream);
        }
    }

    public static LottieResult d(JsonReader jsonReader, String str, boolean z2) {
        try {
            LottieComposition lottieCompositionA = LottieCompositionMoshiParser.a(jsonReader);
            if (str != null) {
                LottieCompositionCache.f9730b.f9731a.put(str, lottieCompositionA);
            }
            return new LottieResult(lottieCompositionA);
        } catch (Exception e2) {
            return new LottieResult((Throwable) e2);
        } finally {
            if (z2) {
                Utils.b(jsonReader);
            }
        }
    }

    public static LottieResult e(int i2, Context context, String str) {
        Boolean bool;
        try {
            RealBufferedSource realBufferedSourceD = Okio.d(Okio.i(context.getResources().openRawResource(i2)));
            try {
                RealBufferedSource realBufferedSourcePeek = realBufferedSourceD.peek();
                byte[] bArr = f9523b;
                int length = bArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        realBufferedSourcePeek.close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (realBufferedSourcePeek.readByte() != bArr[i3]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i3++;
                }
            } catch (Exception unused) {
                Logger.f9943a.getClass();
                bool = Boolean.FALSE;
            } catch (NoSuchMethodError unused2) {
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? f(new ZipInputStream(realBufferedSourceD.new AnonymousClass1()), str) : c(realBufferedSourceD.new AnonymousClass1(), str);
        } catch (Resources.NotFoundException e2) {
            return new LottieResult((Throwable) e2);
        }
    }

    public static LottieResult f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            Utils.b(zipInputStream);
        }
    }

    public static LottieResult g(ZipInputStream zipInputStream, String str) {
        LottieImageAsset lottieImageAsset;
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    lottieComposition = (LottieComposition) d(JsonReader.G(Okio.d(Okio.i(zipInputStream))), null, false).f9547a;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new LottieResult((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator it = lottieComposition.d.values().iterator();
                do {
                    if (!it.hasNext()) {
                        lottieImageAsset = null;
                        break;
                    }
                    lottieImageAsset = (LottieImageAsset) it.next();
                } while (!lottieImageAsset.f9528c.equals(str2));
                if (lottieImageAsset != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    ThreadLocal threadLocal = Utils.f9946a;
                    int width = bitmap.getWidth();
                    int i2 = lottieImageAsset.f9526a;
                    int i3 = lottieImageAsset.f9527b;
                    if (width != i2 || bitmap.getHeight() != i3) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
                        bitmap.recycle();
                        bitmap = bitmapCreateScaledBitmap;
                    }
                    lottieImageAsset.d = bitmap;
                }
            }
            for (Map.Entry entry2 : lottieComposition.d.entrySet()) {
                if (((LottieImageAsset) entry2.getValue()).d == null) {
                    return new LottieResult((Throwable) new IllegalStateException("There is no image for ".concat(((LottieImageAsset) entry2.getValue()).f9528c)));
                }
            }
            if (str != null) {
                LottieCompositionCache.f9730b.f9731a.put(str, lottieComposition);
            }
            return new LottieResult(lottieComposition);
        } catch (IOException e2) {
            return new LottieResult((Throwable) e2);
        }
    }

    public static String h(Context context, int i2) {
        return androidx.datastore.preferences.protobuf.a.g(i2, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
