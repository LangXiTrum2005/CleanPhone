package dirl;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class cutely implements triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f25266dern = new Object();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public volatile triweekly f25267attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile Object f25268saneness = f25266dern;

    public cutely(triweekly triweeklyVar) {
        this.f25267attabal = triweeklyVar;
    }

    public static triweekly attabal(triweekly triweeklyVar) {
        return triweeklyVar instanceof cutely ? triweeklyVar : new cutely(triweeklyVar);
    }

    @Override // dirl.triweekly
    public final Object a() {
        Object objA;
        Object obj = this.f25268saneness;
        Object obj2 = f25266dern;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f25268saneness;
                if (objA == obj2) {
                    objA = this.f25267attabal.a();
                    Object obj3 = this.f25268saneness;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f25268saneness = objA;
                    this.f25267attabal = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
