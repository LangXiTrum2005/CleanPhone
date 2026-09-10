package eb;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f39996b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f39997a = new HashMap();

    static {
        bb.b bVar = new bb.b(1);
        k kVar = new k();
        try {
            kVar.a(bVar, i.class);
            f39996b = kVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public final synchronized void a(bb.b bVar, Class cls) {
        try {
            bb.b bVar2 = (bb.b) this.f39997a.get(cls);
            if (bVar2 != null && !bVar2.equals(bVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f39997a.put(cls, bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final qk.i0 b(va.i iVar, Integer num) {
        qk.i0 i0VarA;
        synchronized (this) {
            bb.b bVar = (bb.b) this.f39997a.get(iVar.getClass());
            if (bVar == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + iVar + ": no key creator for this class was registered.");
            }
            i0VarA = bVar.a(iVar, num);
        }
        return i0VarA;
    }
}
