package monroe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TypefaceCompatApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class apical extends arytenoidectomy {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static boolean f33575beachfront = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static Constructor<?> f33576dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static Method f33577marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Class<?> f33578saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static Method f33579wireman;

    private static Typeface cutely(Object obj) throws NoSuchMethodException {
        formularize();
        try {
            Object objNewInstance = Array.newInstance(f33578saneness, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f33577marial.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void formularize() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f33575beachfront) {
            return;
        }
        f33575beachfront = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f33576dern = constructor;
        f33578saneness = cls;
        f33579wireman = method2;
        f33577marial = method;
    }

    private static Object impassible() throws NoSuchMethodException {
        formularize();
        try {
            return f33576dern.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean taiyuan(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        formularize();
        try {
            return ((Boolean) f33579wireman.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public final File apical(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // monroe.arytenoidectomy
    public Typeface attabal(Context context, lightstruck.marial.dern dernVar, Resources resources, int i) throws NoSuchMethodException {
        Object objImpassible = impassible();
        for (lightstruck.marial.wireman wiremanVar : dernVar.attabal()) {
            File fileMarial = monoploid.marial(context);
            if (fileMarial == null) {
                return null;
            }
            try {
                if (!monoploid.dern(fileMarial, resources, wiremanVar.saneness())) {
                    return null;
                }
                if (!taiyuan(objImpassible, fileMarial.getPath(), wiremanVar.marial(), wiremanVar.beachfront())) {
                    return null;
                }
                fileMarial.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileMarial.delete();
            }
        }
        return cutely(objImpassible);
    }

    @Override // monroe.arytenoidectomy
    public Typeface saneness(Context context, CancellationSignal cancellationSignal, hardpan.competently.saneness[] sanenessVarArr, int i) {
        Typeface typefaceWireman;
        if (sanenessVarArr.length < 1) {
            return null;
        }
        hardpan.competently.saneness sanenessVarImpromptu = impromptu(sanenessVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(sanenessVarImpromptu.wireman(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileApical = apical(parcelFileDescriptorOpenFileDescriptor);
                if (fileApical == null || !fileApical.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceWireman = super.wireman(context, fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    typefaceWireman = Typeface.createFromFile(fileApical);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceWireman;
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
