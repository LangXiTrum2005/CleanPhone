package androidx.core.content.res;

import A.I0;
import A.RunnableC0879a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.graphics.TypefaceCompat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ResourcesCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4277a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f4278b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4279c = new Object();

    public static class Api21Impl {
        public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
            return resources.getDrawable(i2, theme);
        }

        public static Drawable b(Resources resources, int i2, int i3, Resources.Theme theme) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
    }

    public static class Api23Impl {
        public static int a(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColor(i2, theme);
        }

        public static ColorStateList b(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColorStateList(i2, theme);
        }
    }

    public static class Api29Impl {
        public static float a(Resources resources, int i2) {
            return resources.getFloat(i2);
        }
    }

    public static class ColorStateListCacheEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f4280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f4281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4282c;

        public ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f4280a = colorStateList;
            this.f4281b = configuration;
            this.f4282c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class ColorStateListCacheKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f4283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f4284b;

        public ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.f4283a = resources;
            this.f4284b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ColorStateListCacheKey.class == obj.getClass()) {
                ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
                if (this.f4283a.equals(colorStateListCacheKey.f4283a) && Objects.equals(this.f4284b, colorStateListCacheKey.f4284b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f4283a, this.f4284b);
        }
    }

    public static abstract class FontCallback {
        public final void a(int i2) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0879a(this, i2, 4));
        }

        public abstract void b(int i2);

        public abstract void c(Typeface typeface);
    }

    public static final class ThemeCompat {

        public static class Api23Impl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f4285a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f4286b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static boolean f4287c;
        }

        public static class Api29Impl {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public static void a(Resources.Theme theme) {
            Method method;
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.a(theme);
                return;
            }
            synchronized (Api23Impl.f4285a) {
                if (Api23Impl.f4287c) {
                    method = Api23Impl.f4286b;
                    if (method != null) {
                        method.invoke(theme, new Object[0]);
                    }
                } else {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        Api23Impl.f4286b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e2) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                    }
                    Api23Impl.f4287c = true;
                    method = Api23Impl.f4286b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            Api23Impl.f4286b = null;
                        }
                    }
                }
                throw th;
            }
        }
    }

    public static ColorStateList a(Resources resources, int i2, Resources.Theme theme) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        ColorStateListCacheEntry colorStateListCacheEntry;
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        synchronized (f4279c) {
            try {
                SparseArray sparseArray = (SparseArray) f4278b.get(colorStateListCacheKey);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (colorStateListCacheEntry = (ColorStateListCacheEntry) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (colorStateListCacheEntry.f4281b.equals(resources.getConfiguration())) {
                        if (theme != null || colorStateListCacheEntry.f4282c != 0) {
                            if (theme == null || colorStateListCacheEntry.f4282c != theme.hashCode()) {
                            }
                        }
                        colorStateList = colorStateListCacheEntry.f4280a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = f4277a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = ColorStateListInflaterCompat.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return Api23Impl.b(resources, i2, theme);
        }
        synchronized (f4279c) {
            try {
                WeakHashMap weakHashMap = f4278b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(colorStateListCacheKey);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(colorStateListCacheKey, sparseArray2);
                }
                sparseArray2.append(i2, new ColorStateListCacheEntry(colorStateListA, colorStateListCacheKey.f4283a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static Drawable b(Resources resources, int i2, Resources.Theme theme) {
        return Api21Impl.a(resources, i2, theme);
    }

    public static Drawable c(Resources resources, int i2, int i3, Resources.Theme theme) {
        return Api21Impl.b(resources, i2, i3, theme);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    public static Typeface d(Context context, int i2, TypedValue typedValue, int i3, FontCallback fontCallback, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceB = null;
        if (string.startsWith("res/")) {
            Typeface typeface = (Typeface) TypefaceCompat.f4304b.get(TypefaceCompat.d(resources, i2, string, typedValue.assetCookie, i3));
            if (typeface != null) {
                if (fontCallback != null) {
                    new Handler(Looper.getMainLooper()).post(new I0(9, fontCallback, typeface));
                }
                typefaceB = typeface;
            } else if (!z3) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat.FamilyResourceEntry familyResourceEntryA = FontResourcesParserCompat.a(resources.getXml(i2), resources);
                        if (familyResourceEntryA == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (fontCallback != null) {
                                fontCallback.a(-3);
                            }
                        } else {
                            try {
                                typefaceB = TypefaceCompat.b(context, familyResourceEntryA, resources, i2, string, typedValue.assetCookie, i3, fontCallback, z2);
                            } catch (IOException e2) {
                                e = e2;
                                string = string;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                                if (fontCallback != null) {
                                    fontCallback.a(-3);
                                }
                            } catch (XmlPullParserException e3) {
                                e = e3;
                                string = string;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e);
                                if (fontCallback != null) {
                                    fontCallback.a(-3);
                                }
                            }
                        }
                    } else {
                        Typeface typefaceC = TypefaceCompat.c(context, resources, i2, string, typedValue.assetCookie, i3);
                        if (fontCallback != null) {
                            if (typefaceC != null) {
                                new Handler(Looper.getMainLooper()).post(new I0(9, fontCallback, typefaceC));
                            } else {
                                fontCallback.a(-3);
                            }
                        }
                        typefaceB = typefaceC;
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (XmlPullParserException e5) {
                    e = e5;
                }
            }
        } else if (fontCallback != null) {
            fontCallback.a(-3);
        }
        if (typefaceB != null || fontCallback != null || z3) {
            return typefaceB;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }
}
