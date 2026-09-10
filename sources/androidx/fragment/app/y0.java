package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x.i f4513b = new x.i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f4514a;

    public y0(g1 g1Var) {
        this.f4514a = g1Var;
    }

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        x.i iVar = f4513b;
        x.i iVar2 = (x.i) iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new x.i(0);
            iVar.put(classLoader, iVar2);
        }
        Class cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e10) {
            throw new aa.b(1, defpackage.e.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new aa.b(1, defpackage.e.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }
}
