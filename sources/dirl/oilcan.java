package dirl;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class oilcan extends cord {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ beachfront f25273arytenoidectomy;

    public oilcan(beachfront beachfrontVar) {
        this.f25273arytenoidectomy = beachfrontVar;
    }

    @Override // dirl.cord
    public final void saneness() {
        synchronized (this.f25273arytenoidectomy.f25252beachfront) {
            try {
                if (this.f25273arytenoidectomy.f25256formularize.get() > 0 && this.f25273arytenoidectomy.f25256formularize.decrementAndGet() > 0) {
                    this.f25273arytenoidectomy.f25260saneness.dern("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                beachfront beachfrontVar = this.f25273arytenoidectomy;
                if (beachfrontVar.f25262triweekly != null) {
                    beachfrontVar.f25260saneness.dern("Unbind from service.", new Object[0]);
                    beachfront beachfrontVar2 = this.f25273arytenoidectomy;
                    beachfrontVar2.f25251attabal.unbindService(beachfrontVar2.f25257impassible);
                    this.f25273arytenoidectomy.f25253competently = false;
                    this.f25273arytenoidectomy.f25262triweekly = null;
                    this.f25273arytenoidectomy.f25257impassible = null;
                }
                this.f25273arytenoidectomy.rotuma();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
