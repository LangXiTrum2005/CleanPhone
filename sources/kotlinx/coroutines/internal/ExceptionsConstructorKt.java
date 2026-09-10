package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002*(\b\u0002\u0010\u0002\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, d2 = {"Lkotlin/Function1;", "", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExceptionsConstructorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45031a;

    static {
        WeakMapCtorCache weakMapCtorCache = WeakMapCtorCache.f45057a;
        f45031a = b(-1, Throwable.class);
        try {
            int i2 = FastServiceLoaderKt.f45032a;
        } catch (Throwable unused) {
            WeakMapCtorCache weakMapCtorCache2 = WeakMapCtorCache.f45057a;
        }
    }

    public static final Function1 a(Class cls) {
        Object next;
        Function1 function1;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = ExceptionsConstructorKt$createConstructor$nullResult$1.X;
        if (f45031a == b(0, cls)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i2 = 0;
            while (true) {
                next = null;
                if (i2 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i2];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    final int i3 = 3;
                    pair = new Pair(new androidx.room.b(new Function1() { // from class: kotlinx.coroutines.internal.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                            Constructor constructor2 = constructor;
                            Throwable th = (Throwable) obj;
                            switch (i3) {
                                case 0:
                                    int i4 = ExceptionsConstructorKt.f45031a;
                                    Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                    Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (Throwable) objNewInstance;
                                case 1:
                                    int i5 = ExceptionsConstructorKt.f45031a;
                                    Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                    Intrinsics.d(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                                    Throwable th2 = (Throwable) objNewInstance2;
                                    th2.initCause(th);
                                    return th2;
                                case 2:
                                    int i6 = ExceptionsConstructorKt.f45031a;
                                    Object objNewInstance3 = constructor2.newInstance(th);
                                    Intrinsics.d(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (Throwable) objNewInstance3;
                                default:
                                    int i7 = ExceptionsConstructorKt.f45031a;
                                    Object objNewInstance4 = constructor2.newInstance(new Object[0]);
                                    Intrinsics.d(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                                    Throwable th3 = (Throwable) objNewInstance4;
                                    th3.initCause(th);
                                    return th3;
                            }
                        }
                    }, 18), 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (Intrinsics.a(cls2, String.class)) {
                        final int i4 = 1;
                        pair = new Pair(new androidx.room.b(new Function1() { // from class: kotlinx.coroutines.internal.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                Constructor constructor2 = constructor;
                                Throwable th = (Throwable) obj;
                                switch (i4) {
                                    case 0:
                                        int i5 = ExceptionsConstructorKt.f45031a;
                                        Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                        Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                        return (Throwable) objNewInstance;
                                    case 1:
                                        int i6 = ExceptionsConstructorKt.f45031a;
                                        Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                        Intrinsics.d(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                                        Throwable th2 = (Throwable) objNewInstance2;
                                        th2.initCause(th);
                                        return th2;
                                    case 2:
                                        int i7 = ExceptionsConstructorKt.f45031a;
                                        Object objNewInstance3 = constructor2.newInstance(th);
                                        Intrinsics.d(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                                        return (Throwable) objNewInstance3;
                                    default:
                                        int i8 = ExceptionsConstructorKt.f45031a;
                                        Object objNewInstance4 = constructor2.newInstance(new Object[0]);
                                        Intrinsics.d(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                                        Throwable th3 = (Throwable) objNewInstance4;
                                        th3.initCause(th);
                                        return th3;
                                }
                            }
                        }, 18), 2);
                    } else if (Intrinsics.a(cls2, Throwable.class)) {
                        final int i5 = 2;
                        pair = new Pair(new androidx.room.b(new Function1() { // from class: kotlinx.coroutines.internal.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                Constructor constructor2 = constructor;
                                Throwable th = (Throwable) obj;
                                switch (i5) {
                                    case 0:
                                        int i6 = ExceptionsConstructorKt.f45031a;
                                        Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                        Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                        return (Throwable) objNewInstance;
                                    case 1:
                                        int i7 = ExceptionsConstructorKt.f45031a;
                                        Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                        Intrinsics.d(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                                        Throwable th2 = (Throwable) objNewInstance2;
                                        th2.initCause(th);
                                        return th2;
                                    case 2:
                                        int i8 = ExceptionsConstructorKt.f45031a;
                                        Object objNewInstance3 = constructor2.newInstance(th);
                                        Intrinsics.d(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                                        return (Throwable) objNewInstance3;
                                    default:
                                        int i9 = ExceptionsConstructorKt.f45031a;
                                        Object objNewInstance4 = constructor2.newInstance(new Object[0]);
                                        Intrinsics.d(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                                        Throwable th3 = (Throwable) objNewInstance4;
                                        th3.initCause(th);
                                        return th3;
                                }
                            }
                        }, 18), 1);
                    } else {
                        pair = new Pair(null, -1);
                    }
                } else if (length2 != 2) {
                    pair = new Pair(null, -1);
                } else if (Intrinsics.a(parameterTypes[0], String.class) && Intrinsics.a(parameterTypes[1], Throwable.class)) {
                    final int i6 = 0;
                    pair = new Pair(new androidx.room.b(new Function1() { // from class: kotlinx.coroutines.internal.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                            Constructor constructor2 = constructor;
                            Throwable th = (Throwable) obj;
                            switch (i6) {
                                case 0:
                                    int i7 = ExceptionsConstructorKt.f45031a;
                                    Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                    Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (Throwable) objNewInstance;
                                case 1:
                                    int i8 = ExceptionsConstructorKt.f45031a;
                                    Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                    Intrinsics.d(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                                    Throwable th2 = (Throwable) objNewInstance2;
                                    th2.initCause(th);
                                    return th2;
                                case 2:
                                    int i9 = ExceptionsConstructorKt.f45031a;
                                    Object objNewInstance3 = constructor2.newInstance(th);
                                    Intrinsics.d(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (Throwable) objNewInstance3;
                                default:
                                    int i10 = ExceptionsConstructorKt.f45031a;
                                    Object objNewInstance4 = constructor2.newInstance(new Object[0]);
                                    Intrinsics.d(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                                    Throwable th3 = (Throwable) objNewInstance4;
                                    th3.initCause(th);
                                    return th3;
                            }
                        }
                    }, 18), 3);
                } else {
                    pair = new Pair(null, -1);
                }
                arrayList.add(pair);
                i2++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).f43249Y).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).f43249Y).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair2 = (Pair) next;
            if (pair2 != null && (function1 = (Function1) pair2.X) != null) {
                return function1;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    public static final int b(int i2, Class cls) {
        Object objA;
        JvmClassMappingKt.e(cls);
        int i3 = 0;
        do {
            try {
                int i4 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i4++;
                    }
                }
                i3 += i4;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
        } while (cls != null);
        objA = Integer.valueOf(i3);
        Object objValueOf = Integer.valueOf(i2);
        if (objA instanceof Result.Failure) {
            objA = objValueOf;
        }
        return ((Number) objA).intValue();
    }
}
