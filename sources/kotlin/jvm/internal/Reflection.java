package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* JADX INFO: loaded from: classes7.dex */
public class Reflection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReflectionFactory f43333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KClass[] f43334b;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f43333a = reflectionFactory;
        f43334b = new KClass[0];
    }

    public static KClass a(Class cls) {
        return f43333a.b(cls);
    }

    public static KType b(Class cls) {
        ReflectionFactory reflectionFactory = f43333a;
        return reflectionFactory.m(reflectionFactory.b(cls), Collections.EMPTY_LIST, false);
    }
}
