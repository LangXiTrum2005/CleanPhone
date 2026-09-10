package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f39269f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f39271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39273d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f39274e = null;

    public /* synthetic */ c0(String str, Object obj, v vVar) {
        this.f39270a = str;
        this.f39272c = obj;
        this.f39271b = vVar;
    }

    public final Object a(Object obj) {
        synchronized (this.f39273d) {
        }
        if (obj != null) {
            return obj;
        }
        if (z1.f39948n == null) {
            return this.f39272c;
        }
        synchronized (f39269f) {
            try {
                if (fd.b.e()) {
                    return this.f39274e == null ? this.f39272c : this.f39274e;
                }
                try {
                    for (c0 c0Var : d0.f39287a) {
                        if (fd.b.e()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            v vVar = c0Var.f39271b;
                            if (vVar != null) {
                                objZza = vVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f39269f) {
                            c0Var.f39274e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                v vVar2 = this.f39271b;
                if (vVar2 != null) {
                    try {
                        return vVar2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f39272c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
