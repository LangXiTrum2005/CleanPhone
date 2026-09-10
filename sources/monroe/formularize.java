package monroe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.collection.splinterproof;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: TypefaceCompatApi24Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize extends arytenoidectomy {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Constructor<?> f33590dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Method f33591marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Class<?> f33592saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Method f33593wireman;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f33590dern = constructor;
        f33592saneness = cls;
        f33593wireman = method2;
        f33591marial = method;
    }

    public static boolean apical() {
        return f33593wireman != null;
    }

    private static Typeface cutely(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f33592saneness, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f33591marial.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Object formularize() {
        try {
            return f33590dern.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean taiyuan(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f33593wireman.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // monroe.arytenoidectomy
    public Typeface attabal(Context context, lightstruck.marial.dern dernVar, Resources resources, int i) {
        Object objFormularize = formularize();
        if (objFormularize == null) {
            return null;
        }
        for (lightstruck.marial.wireman wiremanVar : dernVar.attabal()) {
            ByteBuffer byteBufferSaneness = monoploid.saneness(context, resources, wiremanVar.saneness());
            if (byteBufferSaneness == null || !taiyuan(objFormularize, byteBufferSaneness, wiremanVar.dern(), wiremanVar.marial(), wiremanVar.beachfront())) {
                return null;
            }
        }
        return cutely(objFormularize);
    }

    @Override // monroe.arytenoidectomy
    public Typeface saneness(Context context, CancellationSignal cancellationSignal, hardpan.competently.saneness[] sanenessVarArr, int i) {
        Object objFormularize = formularize();
        if (objFormularize == null) {
            return null;
        }
        splinterproof splinterproofVar = new splinterproof();
        for (hardpan.competently.saneness sanenessVar : sanenessVarArr) {
            Uri uriWireman = sanenessVar.wireman();
            ByteBuffer byteBufferBeachfront = (ByteBuffer) splinterproofVar.get(uriWireman);
            if (byteBufferBeachfront == null) {
                byteBufferBeachfront = monoploid.beachfront(context, cancellationSignal, uriWireman);
                splinterproofVar.put(uriWireman, byteBufferBeachfront);
            }
            if (byteBufferBeachfront == null || !taiyuan(objFormularize, byteBufferBeachfront, sanenessVar.dern(), sanenessVar.marial(), sanenessVar.beachfront())) {
                return null;
            }
        }
        Typeface typefaceCutely = cutely(objFormularize);
        if (typefaceCutely == null) {
            return null;
        }
        return Typeface.create(typefaceCutely, i);
    }
}
