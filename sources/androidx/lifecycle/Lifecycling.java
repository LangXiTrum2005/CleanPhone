package androidx.lifecycle;

import com.thinkup.core.common.n.mo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Lifecycling {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f5243a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f5244b = new HashMap();

    public static GeneratedAdapter a(Constructor constructor, LifecycleObserver lifecycleObserver) {
        try {
            Object objNewInstance = constructor.newInstance(lifecycleObserver);
            Intrinsics.e(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (GeneratedAdapter) objNewInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0145 A[SYNTHETIC] */
    public static int b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i2;
        boolean z2;
        HashMap map = f5243a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r3 != null ? r3.getName() : "";
                Intrinsics.e(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    Intrinsics.e(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    Intrinsics.e(name, "this as java.lang.String).substring(startIndex)");
                }
                Intrinsics.e(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = StringsKt.I(name, mo.ono, "_").concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    strConcat = fullPackage + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap map2 = f5244b;
            if (declaredConstructor != null) {
                map2.put(cls, CollectionsKt.H(declaredConstructor));
            } else {
                ClassesInfoCache classesInfoCache = ClassesInfoCache.f5219c;
                HashMap map3 = classesInfoCache.f5221b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((OnLifecycleEvent) declaredMethods[i4].getAnnotation(OnLifecycleEvent.class)) != null) {
                                classesInfoCache.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && LifecycleObserver.class.isAssignableFrom(superclass)) {
                        Intrinsics.e(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            Intrinsics.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            Intrinsics.e(interfaces, "klass.interfaces");
                            for (Class<?> intrface : interfaces) {
                                if (intrface == null && LifecycleObserver.class.isAssignableFrom(intrface)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    Intrinsics.e(intrface, "intrface");
                                    if (b(intrface) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(intrface);
                                        Intrinsics.c(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        Intrinsics.e(interfaces, "klass.interfaces");
                        while (i2 < r7) {
                            if (intrface == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                Intrinsics.e(intrface, "intrface");
                                if (b(intrface) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(intrface);
                                    Intrinsics.c(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i3 = 2;
        }
        map.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
