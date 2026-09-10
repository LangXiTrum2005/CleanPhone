package lightstruck;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ResourcesCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f32974attabal = new ThreadLocal<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final WeakHashMap<wireman, SparseArray<dern>> f32976saneness = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f32975dern = new Object();

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static class attabal {
        public static Drawable attabal(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable saneness(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static final class beachfront {

        /* JADX INFO: compiled from: ResourcesCompat.java */
        public static class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final Object f32977attabal = new Object();

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public static boolean f32978dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public static Method f32979saneness;

            public static void attabal(Resources.Theme theme) {
                synchronized (f32977attabal) {
                    if (!f32978dern) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f32979saneness = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f32978dern = true;
                    }
                    Method method = f32979saneness;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f32979saneness = null;
                        }
                    }
                }
            }
        }

        /* JADX INFO: compiled from: ResourcesCompat.java */
        public static class saneness {
            public static void attabal(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void attabal(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                saneness.attabal(theme);
            } else {
                attabal.attabal(theme);
            }
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ColorStateList f32980attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f32981dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Configuration f32982saneness;

        public dern(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f32980attabal = colorStateList;
            this.f32982saneness = configuration;
            this.f32981dern = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static abstract class marial {
        public static Handler marial(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public abstract void beachfront(int i);

        public abstract void competently(Typeface typeface);

        public final void dern(final int i, Handler handler) {
            marial(handler).post(new Runnable() { // from class: lightstruck.cutely
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32961kowloon.beachfront(i);
                }
            });
        }

        public final void wireman(final Typeface typeface, Handler handler) {
            marial(handler).post(new Runnable() { // from class: lightstruck.taiyuan
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33002kowloon.competently(typeface);
                }
            });
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static class saneness {
        public static ColorStateList attabal(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Resources f32983attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Resources.Theme f32984saneness;

        public wireman(Resources resources, Resources.Theme theme) {
            this.f32983attabal = resources;
            this.f32984saneness = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && wireman.class == obj.getClass()) {
                wireman wiremanVar = (wireman) obj;
                if (this.f32983attabal.equals(wiremanVar.f32983attabal) && technofreak.marial.attabal(this.f32984saneness, wiremanVar.f32984saneness)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return technofreak.marial.saneness(this.f32983attabal, this.f32984saneness);
        }
    }

    public static ColorStateList apical(Resources resources, int i, Resources.Theme theme) {
        if (formularize(resources, i)) {
            return null;
        }
        try {
            return lightstruck.dern.attabal(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void attabal(wireman wiremanVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f32975dern) {
            try {
                WeakHashMap<wireman, SparseArray<dern>> weakHashMap = f32976saneness;
                SparseArray<dern> sparseArray = weakHashMap.get(wiremanVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(wiremanVar, sparseArray);
                }
                sparseArray.append(i, new dern(colorStateList, wiremanVar.f32983attabal.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Drawable beachfront(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return attabal.saneness(resources, i, i2, theme);
    }

    public static Typeface competently(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return impassible(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static TypedValue cutely() {
        ThreadLocal<TypedValue> threadLocal = f32974attabal;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static Typeface dern(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return impassible(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static boolean formularize(Resources resources, int i) {
        TypedValue typedValueCutely = cutely();
        resources.getValue(i, typedValueCutely, true);
        int i2 = typedValueCutely.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static Typeface impassible(Context context, int i, TypedValue typedValue, int i2, marial marialVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceTriweekly = triweekly(context, resources, typedValue, i, i2, marialVar, handler, z, z2);
        if (typefaceTriweekly != null || marialVar != null || z2) {
            return typefaceTriweekly;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static Typeface impromptu(Context context, int i, TypedValue typedValue, int i2, marial marialVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return impassible(context, i, typedValue, i2, marialVar, null, true, false);
    }

    public static Drawable marial(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return attabal.attabal(resources, i, theme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f32981dern == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList saneness(lightstruck.impromptu.wireman r5, int r6) {
        /*
            java.lang.Object r0 = lightstruck.impromptu.f32975dern
            monitor-enter(r0)
            java.util.WeakHashMap<lightstruck.impromptu$wireman, android.util.SparseArray<lightstruck.impromptu$dern>> r1 = lightstruck.impromptu.f32976saneness     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            lightstruck.impromptu$dern r2 = (lightstruck.impromptu.dern) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f32982saneness     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f32983attabal     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f32984saneness     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f32981dern     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f32981dern     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f32980attabal     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lightstruck.impromptu.saneness(lightstruck.impromptu$wireman, int):android.content.res.ColorStateList");
    }

    public static void taiyuan(Context context, int i, marial marialVar, Handler handler) throws Resources.NotFoundException {
        technofreak.cutely.competently(marialVar);
        if (context.isRestricted()) {
            marialVar.dern(-4, handler);
        } else {
            impassible(context, i, new TypedValue(), 0, marialVar, handler, false, false);
        }
    }

    public static Typeface triweekly(Context context, Resources resources, TypedValue typedValue, int i, int i2, marial marialVar, Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (marialVar != null) {
                marialVar.dern(-3, handler);
            }
            return null;
        }
        Typeface typefaceCompetently = monroe.cutely.competently(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceCompetently != null) {
            if (marialVar != null) {
                marialVar.wireman(typefaceCompetently, handler);
            }
            return typefaceCompetently;
        }
        if (z2) {
            return null;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                lightstruck.marial.saneness sanenessVarSaneness = lightstruck.marial.saneness(resources.getXml(i), resources);
                if (sanenessVarSaneness != null) {
                    return monroe.cutely.wireman(context, sanenessVarSaneness, resources, i, string, typedValue.assetCookie, i2, marialVar, handler, z);
                }
                if (marialVar != null) {
                    marialVar.dern(-3, handler);
                }
                return null;
            }
            Typeface typefaceMarial = monroe.cutely.marial(context, resources, i, string, typedValue.assetCookie, i2);
            if (marialVar != null) {
                if (typefaceMarial != null) {
                    marialVar.wireman(typefaceMarial, handler);
                    return typefaceMarial;
                }
                marialVar.dern(-3, handler);
            }
            return typefaceMarial;
        } catch (IOException | XmlPullParserException unused) {
            if (marialVar != null) {
                marialVar.dern(-3, handler);
            }
            return null;
        }
    }

    public static ColorStateList wireman(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        wireman wiremanVar = new wireman(resources, theme);
        ColorStateList colorStateListSaneness = saneness(wiremanVar, i);
        if (colorStateListSaneness != null) {
            return colorStateListSaneness;
        }
        ColorStateList colorStateListApical = apical(resources, i, theme);
        if (colorStateListApical == null) {
            return saneness.attabal(resources, i, theme);
        }
        attabal(wiremanVar, i, colorStateListApical, theme);
        return colorStateListApical;
    }
}
