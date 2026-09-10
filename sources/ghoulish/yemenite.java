package ghoulish;

/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class yemenite implements polder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final oilcan f27146attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f27147beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f27148dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f27149marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.stratoscope f27150saneness = new decarock.stratoscope(32);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f27151wireman;

    public yemenite(oilcan oilcanVar) {
        this.f27146attabal = oilcanVar;
    }

    @Override // ghoulish.polder
    public void attabal(decarock.stratoscope stratoscopeVar, int i) {
        int iBeachfront;
        boolean z = (i & 1) != 0;
        if (z) {
            iBeachfront = stratoscopeVar.beachfront() + stratoscopeVar.supplicat();
        } else {
            iBeachfront = -1;
        }
        if (this.f27147beachfront) {
            if (!z) {
                return;
            }
            this.f27147beachfront = false;
            stratoscopeVar.mathsort(iBeachfront);
            this.f27151wireman = 0;
        }
        while (stratoscopeVar.attabal() > 0) {
            int i2 = this.f27151wireman;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iSupplicat = stratoscopeVar.supplicat();
                    stratoscopeVar.mathsort(stratoscopeVar.beachfront() - 1);
                    if (iSupplicat == 255) {
                        this.f27147beachfront = true;
                        return;
                    }
                }
                int iMin = Math.min(stratoscopeVar.attabal(), 3 - this.f27151wireman);
                stratoscopeVar.formularize(this.f27150saneness.marial(), this.f27151wireman, iMin);
                int i3 = this.f27151wireman + iMin;
                this.f27151wireman = i3;
                if (i3 == 3) {
                    this.f27150saneness.mathsort(0);
                    this.f27150saneness.peridotite(3);
                    this.f27150saneness.splinterproof(1);
                    int iSupplicat2 = this.f27150saneness.supplicat();
                    int iSupplicat3 = this.f27150saneness.supplicat();
                    this.f27149marial = (iSupplicat2 & 128) != 0;
                    this.f27148dern = (((iSupplicat2 & 15) << 8) | iSupplicat3) + 3;
                    int iSaneness = this.f27150saneness.saneness();
                    int i4 = this.f27148dern;
                    if (iSaneness < i4) {
                        this.f27150saneness.dern(Math.min(4098, Math.max(i4, this.f27150saneness.saneness() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(stratoscopeVar.attabal(), this.f27148dern - this.f27151wireman);
                stratoscopeVar.formularize(this.f27150saneness.marial(), this.f27151wireman, iMin2);
                int i5 = this.f27151wireman + iMin2;
                this.f27151wireman = i5;
                int i6 = this.f27148dern;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f27149marial) {
                        this.f27150saneness.peridotite(i6);
                    } else {
                        if (decarock.grimness.gintrap(this.f27150saneness.marial(), 0, this.f27148dern, -1) != 0) {
                            this.f27147beachfront = true;
                            return;
                        }
                        this.f27150saneness.peridotite(this.f27148dern - 4);
                    }
                    this.f27150saneness.mathsort(0);
                    this.f27146attabal.attabal(this.f27150saneness);
                    this.f27151wireman = 0;
                }
            }
        }
    }

    @Override // ghoulish.polder
    public void saneness(decarock.kattegat kattegatVar, cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        this.f27146attabal.saneness(kattegatVar, polloiVar, wiremanVar);
        this.f27147beachfront = true;
    }

    @Override // ghoulish.polder
    public void seek() {
        this.f27147beachfront = true;
    }
}
