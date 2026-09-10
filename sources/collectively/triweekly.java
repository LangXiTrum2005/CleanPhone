package collectively;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class triweekly extends cutely {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ graveside f15835arytenoidectomy;

    public triweekly(graveside gravesideVar) {
        this.f15835arytenoidectomy = gravesideVar;
    }

    @Override // collectively.cutely
    public final void attabal() {
        synchronized (this.f15835arytenoidectomy.f15818beachfront) {
            try {
                if (this.f15835arytenoidectomy.f15816apical.get() > 0 && this.f15835arytenoidectomy.f15816apical.decrementAndGet() > 0) {
                    this.f15835arytenoidectomy.f15826saneness.dern("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                graveside gravesideVar = this.f15835arytenoidectomy;
                if (gravesideVar.f15823impassible != null) {
                    gravesideVar.f15826saneness.dern("Unbind from service.", new Object[0]);
                    graveside gravesideVar2 = this.f15835arytenoidectomy;
                    gravesideVar2.f15817attabal.unbindService(gravesideVar2.f15822formularize);
                    this.f15835arytenoidectomy.f15819competently = false;
                    this.f15835arytenoidectomy.f15823impassible = null;
                    this.f15835arytenoidectomy.f15822formularize = null;
                }
                this.f15835arytenoidectomy.gintrap();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
