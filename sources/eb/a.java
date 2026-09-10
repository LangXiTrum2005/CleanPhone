package eb;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f39959c = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f39960d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f39961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f39962b;

    static {
        a aVar = new a();
        aVar.f39961a = new ConcurrentHashMap();
        aVar.f39962b = new ConcurrentHashMap();
        f39960d = aVar;
    }

    public final f a(Class cls, String str) throws GeneralSecurityException {
        f fVarB = b(str);
        if (fVarB.f39980b.equals(cls)) {
            return fVarB;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f.class + ", which only supports: " + fVarB.f39980b);
    }

    public final synchronized f b(String str) {
        if (!this.f39961a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (f) this.f39961a.get(str);
    }

    public final synchronized void c(f fVar) {
        try {
            String str = fVar.f39979a;
            if (this.f39962b.containsKey(str) && !((Boolean) this.f39962b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((f) this.f39961a.get(str)) != null && !f.class.equals(f.class)) {
                f39959c.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + f.class.getName() + ", cannot be re-registered with " + f.class.getName());
            }
            this.f39961a.putIfAbsent(str, fVar);
            this.f39962b.put(str, Boolean.TRUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(f fVar) {
        e(fVar, 1);
    }

    public final synchronized void e(f fVar, int i10) {
        if (!defpackage.e.b(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        c(fVar);
    }
}
