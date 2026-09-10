package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4000ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4672a;

    static {
        Ij0 ij0 = Ij0.e;
        f4672a = b(-1, Throwable.class);
        try {
            int i = AbstractC2426Ft.f3092a;
        } catch (Throwable unused) {
            Ij0 ij1 = Ij0.e;
        }
    }

    public static final InterfaceC2766Sw a(Class cls) {
        Object next;
        InterfaceC2766Sw interfaceC2766Sw;
        C4839vT c4839vT;
        C3912ks c3912ks = C3912ks.f;
        int i = 0;
        if (f4672a != b(0, cls)) {
            return c3912ks;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i2 = 0;
        while (true) {
            next = null;
            if (i2 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i2];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            int i3 = 10;
            if (length2 != 0) {
                int i4 = 1;
                int i5 = 2;
                if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (AbstractC2995aW.i(cls2, String.class)) {
                        c4839vT = new C4839vT(new C4140nX(new C3824js(constructor, i4), i3), 2);
                    } else {
                        c4839vT = AbstractC2995aW.i(cls2, Throwable.class) ? new C4839vT(new C4140nX(new C3824js(constructor, i5), i3), 1) : new C4839vT(null, -1);
                    }
                } else if (length2 != 2) {
                    c4839vT = new C4839vT(null, -1);
                } else {
                    c4839vT = (AbstractC2995aW.i(parameterTypes[0], String.class) && AbstractC2995aW.i(parameterTypes[1], Throwable.class)) ? new C4839vT(new C4140nX(new C3824js(constructor, i), i3), 3) : new C4839vT(null, -1);
                }
            } else {
                c4839vT = new C4839vT(new C4140nX(new C3824js(constructor, 3), i3), 0);
            }
            arrayList.add(c4839vT);
            i2++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((C4839vT) next).b).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((C4839vT) next2).b).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        }
        C4839vT c4839vT2 = (C4839vT) next;
        return (c4839vT2 == null || (interfaceC2766Sw = (InterfaceC2766Sw) c4839vT2.f5132a) == null) ? c3912ks : interfaceC2766Sw;
    }

    public static final int b(int i, Class cls) {
        Object objV;
        AbstractC2995aW.q(cls, "<this>");
        AbstractC3263dY.a(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objV = AbstractC3375el.v(th);
            }
        } while (cls != null);
        objV = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (objV instanceof HZ) {
            objV = objValueOf;
        }
        return ((Number) objV).intValue();
    }
}
