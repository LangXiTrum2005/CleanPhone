package com.github.dart_lang.jni;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class PortProxyBuilder implements InvocationHandler {
    private static final PortCleaner cleaner = new PortCleaner();
    private static final Method equals;
    private static final Method hashCode;
    private static final Method toString;
    private final long isolateId;
    private final long mainPortId;
    private boolean built = false;
    private final HashMap<String, DartImplementation> implementations = new HashMap<>();
    private final HashSet<String> asyncMethods = new HashSet<>();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class DartException extends Exception {
        Throwable cause;

        private DartException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class DartImplementation {
        final long pointer;
        final long port;

        public DartImplementation(long j10, long j11) {
            this.port = j10;
            this.pointer = j11;
        }
    }

    static {
        try {
            equals = Object.class.getDeclaredMethod("equals", Object.class);
            hashCode = Object.class.getDeclaredMethod("hashCode", null);
            toString = Object.class.getDeclaredMethod(InAppPurchaseConstants.METHOD_TO_STRING, null);
            System.loadLibrary("dartjni");
        } catch (NoSuchMethodException unused) {
            throw new Error();
        }
    }

    public PortProxyBuilder(long j10, long j11) {
        this.isolateId = j10;
        this.mainPortId = j11;
    }

    private static native void _cleanUp(long j10);

    private static native Object[] _invoke(long j10, long j11, long j12, long j13, Object obj, String str, Object[] objArr, boolean z10);

    private static void appendType(StringBuilder sb2, Class<?> cls) {
        if (cls == Void.TYPE) {
            sb2.append('V');
            return;
        }
        if (cls == Boolean.TYPE) {
            sb2.append('Z');
            return;
        }
        if (cls == Byte.TYPE) {
            sb2.append('B');
            return;
        }
        if (cls == Character.TYPE) {
            sb2.append('C');
            return;
        }
        if (cls == Short.TYPE) {
            sb2.append('S');
            return;
        }
        if (cls == Integer.TYPE) {
            sb2.append('I');
            return;
        }
        if (cls == Long.TYPE) {
            sb2.append('J');
            return;
        }
        if (cls == Float.TYPE) {
            sb2.append('F');
            return;
        }
        if (cls == Double.TYPE) {
            sb2.append('D');
            return;
        }
        if (cls.isArray()) {
            sb2.append('[');
            appendType(sb2, cls.getComponentType());
        } else {
            sb2.append('L');
            sb2.append(cls.getName().replace('.', '/'));
            sb2.append(';');
        }
    }

    private static String getDescriptor(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        sb2.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            appendType(sb2, cls);
        }
        sb2.append(')');
        appendType(sb2, method.getReturnType());
        return sb2.toString();
    }

    public void addImplementation(String str, long j10, long j11, List<String> list) {
        this.implementations.put(str, new DartImplementation(j10, j11));
        this.asyncMethods.addAll(list);
    }

    public Object build() throws ClassNotFoundException {
        if (this.implementations.isEmpty()) {
            throw new IllegalStateException("No interface implementation added");
        }
        if (this.built) {
            throw new IllegalStateException("This proxy has already been built");
        }
        this.built = true;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.implementations.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Class.forName(it.next()));
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(((Class) arrayList.get(0)).getClassLoader(), (Class[]) arrayList.toArray(new Class[0]), this);
        Iterator<DartImplementation> it2 = this.implementations.values().iterator();
        while (it2.hasNext()) {
            cleaner.register(objNewProxyInstance, it2.next().port);
        }
        return objNewProxyInstance;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.equals(equals)) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (method.equals(hashCode)) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (method.equals(toString)) {
            return obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
        }
        DartImplementation dartImplementation = this.implementations.get(method.getDeclaringClass().getName());
        String descriptor = getDescriptor(method);
        boolean zContains = this.asyncMethods.contains(descriptor);
        Object[] objArr_invoke = _invoke(dartImplementation.port, this.isolateId, this.mainPortId, dartImplementation.pointer, obj, descriptor, objArr, !zContains);
        if (zContains) {
            return null;
        }
        _cleanUp(((Long) objArr_invoke[0]).longValue());
        Object obj2 = objArr_invoke[1];
        if (!(obj2 instanceof DartException)) {
            return obj2;
        }
        Throwable th2 = ((DartException) obj2).cause;
        if (th2 != null) {
            throw th2;
        }
        throw ((DartException) obj2);
    }
}
