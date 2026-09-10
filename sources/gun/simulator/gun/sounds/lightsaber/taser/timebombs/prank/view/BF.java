package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BF {
    public static final C4568sM d;
    public static C4568sM e = null;
    public static MediaPlayer g = null;
    public static MediaPlayer h = null;
    public static volatile boolean i = true;
    public static int j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3887ke f2862a = new C3887ke(4);
    public static final C5 b = new C5("funny.sounds.prank.airhorn.fartsounds.haircut.simulator", Integer.valueOf(R.drawable.ad_funnysounds), Integer.valueOf(R.drawable.ad_funnysounds_home), Integer.valueOf(R.string.FunnySounds), Integer.valueOf(R.string.Enjoy_Haircut_Prank));
    public static final Object[] c = new Object[0];
    public static final Qm0 f = new Qm0(25);

    static {
        Object obj = null;
        d = new C4568sM(obj, obj, obj, 21);
    }

    public static final Map h(D40 d40) {
        String[] strArrNames;
        AbstractC2995aW.q(d40, "<this>");
        int iD = d40.d();
        ConcurrentHashMap concurrentHashMap = null;
        for (int i2 = 0; i2 < iD; i2++) {
            List listF = d40.f(i2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (obj instanceof InterfaceC5177zF) {
                    arrayList.add(obj);
                }
            }
            InterfaceC5177zF interfaceC5177zF = (InterfaceC5177zF) (arrayList.size() == 1 ? arrayList.get(0) : null);
            if (interfaceC5177zF != null && (strArrNames = interfaceC5177zF.names()) != null) {
                for (String str : strArrNames) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap(d40.d());
                    }
                    if (concurrentHashMap.containsKey(str)) {
                        StringBuilder sbU = AbstractC3950lJ.u("The suggested name '", str, "' for property ");
                        sbU.append(d40.e(i2));
                        sbU.append(" is already one of the names for property ");
                        sbU.append(d40.e(((Number) U5.q0(concurrentHashMap, str)).intValue()));
                        sbU.append(" in ");
                        sbU.append(d40);
                        throw new Vf0(sbU.toString(), 1);
                    }
                    concurrentHashMap.put(str, Integer.valueOf(i2));
                }
            }
        }
        return concurrentHashMap == null ? C2838Vq.f3896a : concurrentHashMap;
    }

    public static String i(byte[] bArr, byte[] bArr2) {
        return Qm0.D(bArr, bArr2);
    }

    public static Drawable k(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (i) {
                return p(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return ContextCompat.getDrawable(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            i = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i2, theme);
    }

    public static final int l(D40 d40, VE ve, String str) {
        AbstractC2995aW.q(d40, "<this>");
        AbstractC2995aW.q(ve, "json");
        AbstractC2995aW.q(str, "name");
        int iC = d40.c(str);
        if (iC != -3 || !ve.f3865a.l) {
            return iC;
        }
        Integer num = (Integer) ((Map) ve.c.a(d40, new AF(d40, 0))).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int m(D40 d40, VE ve, String str, String str2) {
        AbstractC2995aW.q(d40, "<this>");
        AbstractC2995aW.q(ve, "json");
        AbstractC2995aW.q(str, "name");
        AbstractC2995aW.q(str2, "suffix");
        int iL = l(d40, ve, str);
        if (iL != -3) {
            return iL;
        }
        throw new P40(d40.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static Drawable p(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i2);
    }

    public static final Object[] r(Collection collection) {
        AbstractC2995aW.q(collection, "collection");
        int size = collection.size();
        Object[] objArr = c;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                AbstractC2995aW.p(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                AbstractC2995aW.p(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static final Object[] s(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        AbstractC2995aW.q(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            AbstractC2995aW.o(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                AbstractC2995aW.p(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                AbstractC2995aW.p(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public abstract void e(String str);

    public abstract void f(String str);

    public abstract File g(String str);

    public void j(Runnable runnable) {
        if (n()) {
            runnable.run();
        } else {
            q(runnable);
        }
    }

    public abstract boolean n();

    public abstract File o(String str);

    public abstract void q(Runnable runnable);
}
