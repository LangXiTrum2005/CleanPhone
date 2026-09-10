package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f4309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f4310c;
    public static final Method d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f4311e;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f4310c = constructor;
        f4309b = cls;
        d = method;
        f4311e = method2;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f4309b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f4311e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[LOOP:0: B:9:0x0015->B:36:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0068 A[SYNTHETIC] */
    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f4310c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.f4267a) {
                int i3 = fontFileResourceEntry.f;
                File fileD = TypefaceCompatUtil.d(context);
                if (fileD != null) {
                    try {
                        if (TypefaceCompatUtil.b(fileD, resources, i3)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileD);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            fileD.delete();
                        } else {
                            fileD.delete();
                        }
                        if (map == null) {
                            if (!g(objNewInstance, map, fontFileResourceEntry.f4271e, fontFileResourceEntry.f4269b, fontFileResourceEntry.f4270c)) {
                            }
                        }
                    } catch (Throwable th3) {
                        fileD.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map == null) {
                    if (!g(objNewInstance, map, fontFileResourceEntry.f4271e, fontFileResourceEntry.f4269b, fontFileResourceEntry.f4270c)) {
                    }
                }
            }
            return h(objNewInstance);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Object objNewInstance;
        try {
            objNewInstance = f4310c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            SimpleArrayMap simpleArrayMap = new SimpleArrayMap(0);
            for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                Uri uri = fontInfo.f4377a;
                ByteBuffer byteBufferE = (ByteBuffer) simpleArrayMap.get(uri);
                if (byteBufferE == null) {
                    byteBufferE = TypefaceCompatUtil.e(context, uri);
                    simpleArrayMap.put(uri, byteBufferE);
                }
                if (byteBufferE != null) {
                    if (g(objNewInstance, byteBufferE, fontInfo.f4378b, fontInfo.f4379c, fontInfo.d)) {
                    }
                }
            }
            Typeface typefaceH = h(objNewInstance);
            if (typefaceH != null) {
                return Typeface.create(typefaceH, i2);
            }
        }
        return null;
    }
}
