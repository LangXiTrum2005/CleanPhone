package vir;

import decarock.grimness;
import java.util.ArrayList;

/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal implements androidx.media3.datasource.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f39539attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f39540dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayList<arytenoidectomy> f39541saneness = new ArrayList<>(1);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public competently f39542wireman;

    public attabal(boolean z) {
        this.f39539attabal = z;
    }

    public final void beachfront(competently competentlyVar) {
        for (int i = 0; i < this.f39540dern; i++) {
            this.f39541saneness.get(i).saneness(this, competentlyVar, this.f39539attabal);
        }
    }

    public final void competently(competently competentlyVar) {
        this.f39542wireman = competentlyVar;
        for (int i = 0; i < this.f39540dern; i++) {
            this.f39541saneness.get(i).attabal(this, competentlyVar, this.f39539attabal);
        }
    }

    @Override // androidx.media3.datasource.attabal
    public final void dern(arytenoidectomy arytenoidectomyVar) {
        decarock.attabal.marial(arytenoidectomyVar);
        if (this.f39541saneness.contains(arytenoidectomyVar)) {
            return;
        }
        this.f39541saneness.add(arytenoidectomyVar);
        this.f39540dern++;
    }

    public final void marial() {
        competently competentlyVar = (competently) grimness.impromptu(this.f39542wireman);
        for (int i = 0; i < this.f39540dern; i++) {
            this.f39541saneness.get(i).competently(this, competentlyVar, this.f39539attabal);
        }
        this.f39542wireman = null;
    }

    public final void wireman(int i) {
        competently competentlyVar = (competently) grimness.impromptu(this.f39542wireman);
        for (int i2 = 0; i2 < this.f39540dern; i2++) {
            this.f39541saneness.get(i2).beachfront(this, competentlyVar, this.f39539attabal, i);
        }
    }
}
