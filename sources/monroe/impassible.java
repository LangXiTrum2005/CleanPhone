package monroe;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TypefaceCompatApi26Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class impassible extends apical {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final Method f33594apical;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Class<?> f33595competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final Method f33596cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final Method f33597formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final Method f33598impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Constructor<?> f33599impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final Method f33600taiyuan;

    public impassible() {
        Class<?> clsGintrap;
        Constructor<?> constructorRotuma;
        Method methodGraveside;
        Method methodAdultoid;
        Method methodPreprohormone;
        Method methodMolybdenite;
        Method methodDovishness;
        try {
            clsGintrap = gintrap();
            constructorRotuma = rotuma(clsGintrap);
            methodGraveside = graveside(clsGintrap);
            methodAdultoid = adultoid(clsGintrap);
            methodPreprohormone = preprohormone(clsGintrap);
            methodMolybdenite = molybdenite(clsGintrap);
            methodDovishness = dovishness(clsGintrap);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            clsGintrap = null;
            constructorRotuma = null;
            methodGraveside = null;
            methodAdultoid = null;
            methodPreprohormone = null;
            methodMolybdenite = null;
            methodDovishness = null;
        }
        this.f33595competently = clsGintrap;
        this.f33599impromptu = constructorRotuma;
        this.f33600taiyuan = methodGraveside;
        this.f33596cutely = methodAdultoid;
        this.f33594apical = methodPreprohormone;
        this.f33597formularize = methodMolybdenite;
        this.f33598impassible = methodDovishness;
    }

    public Method adultoid(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final boolean arytenoidectomy(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f33596cutely.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // monroe.apical, monroe.arytenoidectomy
    public Typeface attabal(Context context, lightstruck.marial.dern dernVar, Resources resources, int i) {
        if (!polloi()) {
            return super.attabal(context, dernVar, resources, i);
        }
        Object objImpassible = impassible();
        if (objImpassible == null) {
            return null;
        }
        lightstruck.marial.wireman[] wiremanVarArrAttabal = dernVar.attabal();
        int length = wiremanVarArrAttabal.length;
        int i2 = 0;
        while (i2 < length) {
            lightstruck.marial.wireman wiremanVar = wiremanVarArrAttabal[i2];
            Context context2 = context;
            if (!kowloon(context2, objImpassible, wiremanVar.attabal(), wiremanVar.dern(), wiremanVar.marial(), wiremanVar.beachfront() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(wiremanVar.wireman()))) {
                triweekly(objImpassible);
                return null;
            }
            i2++;
            context = context2;
        }
        if (monoploid(objImpassible)) {
            return cutely(objImpassible);
        }
        return null;
    }

    public Typeface cutely(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f33595competently, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f33598impassible.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // monroe.arytenoidectomy
    public /* bridge */ /* synthetic */ Typeface dern(Context context, CancellationSignal cancellationSignal, List list, int i) {
        return super.dern(context, cancellationSignal, list, i);
    }

    public Method dovishness(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> gintrap() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Method graveside(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final Object impassible() {
        try {
            return this.f33599impromptu.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean kowloon(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f33600taiyuan.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // monroe.arytenoidectomy
    public Typeface marial(Context context, Resources resources, int i, String str, int i2) {
        if (!polloi()) {
            return super.marial(context, resources, i, str, i2);
        }
        Object objImpassible = impassible();
        if (objImpassible == null) {
            return null;
        }
        if (!kowloon(context, objImpassible, str, 0, -1, -1, null)) {
            triweekly(objImpassible);
            return null;
        }
        if (monoploid(objImpassible)) {
            return cutely(objImpassible);
        }
        return null;
    }

    public Method molybdenite(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", null);
    }

    public final boolean monoploid(Object obj) {
        try {
            return ((Boolean) this.f33594apical.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean polloi() {
        return this.f33600taiyuan != null;
    }

    public Method preprohormone(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", null);
    }

    public Constructor<?> rotuma(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    @Override // monroe.apical, monroe.arytenoidectomy
    public Typeface saneness(Context context, CancellationSignal cancellationSignal, hardpan.competently.saneness[] sanenessVarArr, int i) {
        Typeface typefaceCutely;
        Object obj;
        if (sanenessVarArr.length < 1) {
            return null;
        }
        if (!polloi()) {
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
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(sanenessVarImpromptu.marial()).setItalic(sanenessVarImpromptu.beachfront()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapImpromptu = monoploid.impromptu(context, sanenessVarArr, cancellationSignal);
        Object objImpassible = impassible();
        if (objImpassible == null) {
            return null;
        }
        int length = sanenessVarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            hardpan.competently.saneness sanenessVar = sanenessVarArr[i2];
            ByteBuffer byteBuffer = mapImpromptu.get(sanenessVar.wireman());
            if (byteBuffer == null) {
                obj = objImpassible;
            } else {
                boolean zArytenoidectomy = arytenoidectomy(objImpassible, byteBuffer, sanenessVar.dern(), sanenessVar.marial(), sanenessVar.beachfront() ? 1 : 0);
                obj = objImpassible;
                if (!zArytenoidectomy) {
                    triweekly(obj);
                    return null;
                }
                z = true;
            }
            i2++;
            objImpassible = obj;
            z = z;
        }
        Object obj2 = objImpassible;
        if (!z) {
            triweekly(obj2);
            return null;
        }
        if (monoploid(obj2) && (typefaceCutely = cutely(obj2)) != null) {
            return Typeface.create(typefaceCutely, i);
        }
        return null;
    }

    public final void triweekly(Object obj) {
        try {
            this.f33597formularize.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
