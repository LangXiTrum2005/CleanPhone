package androidx.core.graphics;

import A.I0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypefaceCompatBaseImpl f4303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LruCache f4304b;

    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ResourcesCompat.FontCallback f4305a;
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f4303a = new TypefaceCompatApi29Impl();
        } else if (i2 >= 28) {
            f4303a = new TypefaceCompatApi28Impl();
        } else if (i2 >= 26) {
            f4303a = new TypefaceCompatApi26Impl();
        } else {
            Method method = TypefaceCompatApi24Impl.d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f4303a = new TypefaceCompatApi24Impl();
            } else {
                f4303a = new TypefaceCompatApi21Impl();
            }
        }
        f4304b = new LruCache(16);
    }

    public static Typeface a(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        return f4303a.b(context, fontInfoArr, i2);
    }

    public static Typeface b(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i2, String str, int i3, int i4, ResourcesCompat.FontCallback fontCallback, boolean z2) {
        Typeface typefaceA;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            String str2 = providerResourceEntry.d;
            Typeface typeface = null;
            if (str2 != null && !str2.isEmpty()) {
                Typeface typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                    typeface = typefaceCreate;
                }
            }
            if (typeface != null) {
                if (fontCallback != null) {
                    new Handler(Looper.getMainLooper()).post(new I0(9, fontCallback, typeface));
                }
                return typeface;
            }
            boolean z3 = !z2 ? fontCallback != null : providerResourceEntry.f4274c != 0;
            int i5 = z2 ? providerResourceEntry.f4273b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            ResourcesCallbackAdapter resourcesCallbackAdapter = new ResourcesCallbackAdapter();
            resourcesCallbackAdapter.f4305a = fontCallback;
            typefaceA = FontsContractCompat.b(context, providerResourceEntry.f4272a, i4, z3, i5, handler, resourcesCallbackAdapter);
        } else {
            typefaceA = f4303a.a(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i4);
            if (fontCallback != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new I0(9, fontCallback, typefaceA));
                } else {
                    fontCallback.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            f4304b.put(d(resources, i2, str, i3, i4), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface c(Context context, Resources resources, int i2, String str, int i3, int i4) {
        Typeface typefaceD = f4303a.d(context, resources, i2, str, i4);
        if (typefaceD != null) {
            f4304b.put(d(resources, i2, str, i3, i4), typefaceD);
        }
        return typefaceD;
    }

    public static String d(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
