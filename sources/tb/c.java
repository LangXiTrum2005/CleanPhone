package tb;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements tc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50681b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f50680a = i10;
        this.f50681b = obj;
    }

    @Override // tc.b
    public final Object get() {
        int i10 = this.f50680a;
        Object obj = this.f50681b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new k("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new k(defpackage.e.o("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new k(defpackage.e.o("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new k(defpackage.e.n("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new k(defpackage.e.n("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new vc.c((mb.g) obj);
        }
    }
}
