package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatBaseImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4315a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$1, reason: invalid class name */
    class AnonymousClass1 implements StyleExtractor<FontsContractCompat.FontInfo> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final boolean a(Object obj) {
            return ((FontsContractCompat.FontInfo) obj).d;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final int b(Object obj) {
            return ((FontsContractCompat.FontInfo) obj).f4379c;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$2, reason: invalid class name */
    class AnonymousClass2 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final boolean a(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f4270c;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final int b(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f4269b;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$3, reason: invalid class name */
    class AnonymousClass3 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final boolean a(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f4270c;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final int b(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f4269b;
        }
    }

    public interface StyleExtractor<T> {
        boolean a(Object obj);

        int b(Object obj);
    }

    public static Object e(Object[] objArr, int i2, StyleExtractor styleExtractor) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        Object obj = null;
        int i4 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(styleExtractor.b(obj2) - i3) * 2) + (styleExtractor.a(obj2) == z2 ? 0 : 1);
            if (obj == null || i4 > iAbs) {
                obj = obj2;
                i4 = iAbs;
            }
        }
        return obj;
    }

    public Typeface a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        long jLongValue;
        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = (FontResourcesParserCompat.FontFileResourceEntry) e(fontFamilyFilesResourceEntry.f4267a, i2, new AnonymousClass2());
        if (fontFileResourceEntry == null) {
            return null;
        }
        Typeface typefaceC = TypefaceCompat.c(context, resources, fontFileResourceEntry.f, fontFileResourceEntry.f4268a, 0, i2);
        if (typefaceC == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceC)).longValue();
            } catch (IllegalAccessException e2) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
                jLongValue = 0;
            } catch (NoSuchFieldException e3) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
                jLongValue = 0;
            }
        }
        if (jLongValue != 0) {
            this.f4315a.put(Long.valueOf(jLongValue), fontFamilyFilesResourceEntry);
        }
        return typefaceC;
    }

    public Typeface b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(f(i2, fontInfoArr).f4377a);
            try {
                Typeface typefaceC = c(context, inputStreamOpenInputStream);
                TypefaceCompatUtil.a(inputStreamOpenInputStream);
                return typefaceC;
            } catch (IOException unused) {
                TypefaceCompatUtil.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                TypefaceCompatUtil.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface c(Context context, InputStream inputStream) {
        File fileD = TypefaceCompatUtil.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.c(fileD, inputStream)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File fileD = TypefaceCompatUtil.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.b(fileD, resources, i2)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public FontsContractCompat.FontInfo f(int i2, FontsContractCompat.FontInfo[] fontInfoArr) {
        return (FontsContractCompat.FontInfo) e(fontInfoArr, i2, new AnonymousClass1());
    }
}
