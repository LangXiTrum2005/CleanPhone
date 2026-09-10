package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43714a;

    public ReflectJavaRecordComponent(Object recordComponent) {
        Intrinsics.f(recordComponent, "recordComponent");
        this.f43714a = recordComponent;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final Member F() throws IllegalAccessException, InvocationTargetException {
        Method method;
        Object recordComponent = this.f43714a;
        Intrinsics.f(recordComponent, "recordComponent");
        Method method2 = Java16RecordComponentsLoader.a(recordComponent).f43684b;
        if (method2 == null) {
            method = null;
        } else {
            Object objInvoke = method2.invoke(recordComponent, new Object[0]);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public final JavaType getType() throws IllegalAccessException, InvocationTargetException {
        Class cls;
        Object recordComponent = this.f43714a;
        Intrinsics.f(recordComponent, "recordComponent");
        Method method = Java16RecordComponentsLoader.a(recordComponent).f43683a;
        if (method == null) {
            cls = null;
        } else {
            Object objInvoke = method.invoke(recordComponent, new Object[0]);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new ReflectJavaClassifierType(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
