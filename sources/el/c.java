package el;

import an.p;
import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.n;
import qj.x;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f40114a;

    public u4.d a(Object obj, qk.d clazz, Activity activity, z4.b bVar) throws IllegalAccessException, InvocationTargetException {
        n.f(clazz, "clazz");
        u4.c cVar = new u4.c(clazz, bVar);
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f40114a, new Class[]{c()}, cVar);
        n.e(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, c()).invoke(obj, activity, objNewProxyInstance);
        return new u4.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", c()), obj, objNewProxyInstance);
    }

    public x b(yl.b classId, xl.f jvmMetadataVersion) {
        b bVarM;
        n.f(classId, "classId");
        n.f(jvmMetadataVersion, "jvmMetadataVersion");
        String strM0 = p.m0(classId.h().b(), '.', '$');
        if (!classId.g().d()) {
            strM0 = classId.g() + '.' + strM0;
        }
        Class clsG = no.b.G(this.f40114a, strM0);
        if (clsG == null || (bVarM = i0.m(clsG)) == null) {
            return null;
        }
        return new x(bVarM, 2);
    }

    public Class c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f40114a.loadClass("java.util.function.Consumer");
        n.e(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }
}
