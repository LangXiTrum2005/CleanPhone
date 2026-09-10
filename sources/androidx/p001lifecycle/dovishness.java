package androidx.p001lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Lifecycling.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u00150\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/lifecycle/dovishness;", "", "<init>", "()V", "object", "Landroidx/lifecycle/impassible;", "beachfront", "(Ljava/lang/Object;)Landroidx/lifecycle/impassible;", "", "className", "dern", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/impromptu;", "constructor", "attabal", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/impromptu;", "Ljava/lang/Class;", "klass", "saneness", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "wireman", "(Ljava/lang/Class;)I", "competently", "", "marial", "(Ljava/lang/Class;)Z", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dovishness f10470attabal = new dovishness();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Map<Class<?>, List<Constructor<? extends impromptu>>> classToAdapters = new HashMap();

    public static final impassible beachfront(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof impassible;
        boolean z2 = object instanceof marial;
        if (z && z2) {
            return new beachfront((marial) object, (impassible) object);
        }
        if (z2) {
            return new beachfront((marial) object, null);
        }
        if (z) {
            return (impassible) object;
        }
        Class<?> cls = object.getClass();
        dovishness dovishnessVar = f10470attabal;
        if (dovishnessVar.wireman(cls) != 2) {
            return new oilcan(object);
        }
        List<Constructor<? extends impromptu>> list = classToAdapters.get(cls);
        Intrinsics.beachfront(list);
        List<Constructor<? extends impromptu>> list2 = list;
        if (list2.size() == 1) {
            return new creditor(dovishnessVar.attabal(list2.get(0), object));
        }
        int size = list2.size();
        impromptu[] impromptuVarArr = new impromptu[size];
        for (int i = 0; i < size; i++) {
            impromptuVarArr[i] = f10470attabal.attabal(list2.get(i), object);
        }
        return new wireman(impromptuVarArr);
    }

    public static final String dern(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return p002kotlin.text.dovishness.polder(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    public final impromptu attabal(Constructor<? extends impromptu> constructor, Object object) {
        try {
            impromptu impromptuVarNewInstance = constructor.newInstance(object);
            Intrinsics.beachfront(impromptuVarNewInstance);
            return impromptuVarNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final int competently(Class<?> klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends impromptu> constructorSaneness = saneness(klass);
        if (constructorSaneness != null) {
            classToAdapters.put(klass, graveside.marial(constructorSaneness));
            return 2;
        }
        if (dern.f10463dern.wireman(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (marial(superclass)) {
            Intrinsics.beachfront(superclass);
            if (wireman(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends impromptu>> list = classToAdapters.get(superclass);
            Intrinsics.beachfront(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = klass.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls : interfaces) {
            if (marial(cls)) {
                Intrinsics.beachfront(cls);
                if (wireman(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends impromptu>> list2 = classToAdapters.get(cls);
                Intrinsics.beachfront(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }

    public final boolean marial(Class<?> klass) {
        return klass != null && kowloon.class.isAssignableFrom(klass);
    }

    public final Constructor<? extends impromptu> saneness(Class<?> klass) {
        try {
            Package r0 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            Intrinsics.beachfront(name);
            if (name.length() != 0) {
                Intrinsics.beachfront(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
            }
            Intrinsics.beachfront(canonicalName);
            String strDern = dern(canonicalName);
            if (name.length() != 0) {
                strDern = name + '.' + strDern;
            }
            Class<?> cls = Class.forName(strDern);
            Intrinsics.competently(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public final int wireman(Class<?> klass) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iCompetently = competently(klass);
        map.put(klass, Integer.valueOf(iCompetently));
        return iCompetently;
    }
}
