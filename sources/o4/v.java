package o4;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f47166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f47167c;

    static {
        a aVar = new a();
        aVar.f47169w = false;
        aVar.G(new i(2));
        aVar.G(new g());
        aVar.G(new i(1));
        f47165a = aVar;
        f47166b = new ThreadLocal();
        f47167c = new ArrayList();
    }

    public static x.e a() {
        x.e eVar;
        ThreadLocal threadLocal = f47166b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (x.e) weakReference.get()) != null) {
            return eVar;
        }
        x.e eVar2 = new x.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
