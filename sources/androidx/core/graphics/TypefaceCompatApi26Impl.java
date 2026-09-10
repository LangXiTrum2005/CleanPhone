package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {
    public final Class g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Constructor f4312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f4313i;
    public final Method j;
    public final Method k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f4314l;
    public final Method m;

    public TypefaceCompatApi26Impl() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodN;
        Method method2;
        Method method3;
        Method methodO;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodN = n(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodO = o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            cls = null;
            method = null;
            constructor = null;
            methodN = null;
            method2 = null;
            method3 = null;
            methodO = null;
        }
        this.g = cls;
        this.f4312h = constructor;
        this.f4313i = methodN;
        this.j = method2;
        this.k = method3;
        this.f4314l = method;
        this.m = methodO;
    }

    public static Method n(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        Method method = this.f4313i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.a(context, fontFamilyFilesResourceEntry, resources, i2);
        }
        Object objM = m();
        if (objM != null) {
            FontResourcesParserCompat.FontFileResourceEntry[] fontFileResourceEntryArr = fontFamilyFilesResourceEntry.f4267a;
            int length = fontFileResourceEntryArr.length;
            int i3 = 0;
            while (i3 < length) {
                FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = fontFileResourceEntryArr[i3];
                String str = fontFileResourceEntry.f4268a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.d);
                Context context2 = context;
                if (!j(context2, objM, str, fontFileResourceEntry.f4271e, fontFileResourceEntry.f4269b, fontFileResourceEntry.f4270c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    i(objM);
                    return null;
                }
                i3++;
                context = context2;
            }
            if (l(objM)) {
                return k(objM);
            }
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Typeface typefaceK;
        boolean zBooleanValue;
        if (fontInfoArr.length >= 1) {
            Method method = this.f4313i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                    if (fontInfo.f4380e == 0) {
                        Uri uri = fontInfo.f4377a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, TypefaceCompatUtil.e(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objM = m();
                if (objM != null) {
                    int length = fontInfoArr.length;
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 < length) {
                        FontsContractCompat.FontInfo fontInfo2 = fontInfoArr[i3];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(fontInfo2.f4377a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.j.invoke(objM, byteBuffer, Integer.valueOf(fontInfo2.f4378b), null, Integer.valueOf(fontInfo2.f4379c), Integer.valueOf(fontInfo2.d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                i(objM);
                                return null;
                            }
                            z2 = true;
                        }
                        i3++;
                        z2 = z2;
                    }
                    if (!z2) {
                        i(objM);
                        return null;
                    }
                    if (l(objM) && (typefaceK = k(objM)) != null) {
                        return Typeface.create(typefaceK, i2);
                    }
                }
            } else {
                FontsContractCompat.FontInfo fontInfoF = f(i2, fontInfoArr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fontInfoF.f4377a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fontInfoF.f4379c).setItalic(fontInfoF.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        Method method = this.f4313i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.d(context, resources, i2, str, i3);
        }
        Object objM = m();
        if (objM != null) {
            if (!j(context, objM, str, 0, -1, -1, null)) {
                i(objM);
                return null;
            }
            if (l(objM)) {
                return k(objM);
            }
        }
        return null;
    }

    public final void i(Object obj) {
        try {
            this.f4314l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean j(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4313i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface k(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean l(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object m() {
        try {
            return this.f4312h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method o(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
