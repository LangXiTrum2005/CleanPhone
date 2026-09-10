package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ResourcesFlusher.java */
/* JADX INFO: loaded from: classes.dex */
public class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Field f4815attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static boolean f4816beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static Field f4817competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static Class<?> f4818dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static boolean f4819impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static Field f4820marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static boolean f4821saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static boolean f4822wireman;

    public static void attabal(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        saneness(resources);
    }

    public static void dern(Object obj) {
        LongSparseArray longSparseArray;
        if (!f4822wireman) {
            try {
                f4818dern = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f4822wireman = true;
        }
        Class<?> cls = f4818dern;
        if (cls == null) {
            return;
        }
        if (!f4816beachfront) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f4820marial = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f4816beachfront = true;
        }
        Field field = f4820marial;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static void saneness(Resources resources) {
        Object obj;
        if (!f4819impromptu) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f4817competently = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4819impromptu = true;
        }
        Field field = f4817competently;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f4821saneness) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f4815attabal = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f4821saneness = true;
        }
        Field field2 = f4815attabal;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            dern(obj2);
        }
    }
}
