package ethene;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import decarock.grimness;
import java.util.Collection;

/* JADX INFO: compiled from: TrackGroupArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f26059attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f26060dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ImmutableList<androidx.media3.common.yemenite> f26061saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final restrictive f26058wireman = new restrictive(new androidx.media3.common.yemenite[0]);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f26057marial = grimness.igbo(0);

    public restrictive(androidx.media3.common.yemenite... yemeniteVarArr) {
        this.f26061saneness = ImmutableList.copyOf(yemeniteVarArr);
        this.f26059attabal = yemeniteVarArr.length;
        marial();
    }

    public ImmutableList<Integer> dern() {
        return ImmutableList.copyOf((Collection) Lists.apical(this.f26061saneness, new com.google.common.base.marial() { // from class: ethene.supplicat
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return Integer.valueOf(((androidx.media3.common.yemenite) obj).f11333dern);
            }
        }));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && restrictive.class == obj.getClass()) {
            restrictive restrictiveVar = (restrictive) obj;
            if (this.f26059attabal == restrictiveVar.f26059attabal && this.f26061saneness.equals(restrictiveVar.f26061saneness)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f26060dern == 0) {
            this.f26060dern = this.f26061saneness.hashCode();
        }
        return this.f26060dern;
    }

    public final void marial() {
        int i = 0;
        while (i < this.f26061saneness.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f26061saneness.size(); i3++) {
                if (this.f26061saneness.get(i).equals(this.f26061saneness.get(i3))) {
                    decarock.triweekly.wireman("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public androidx.media3.common.yemenite saneness(int i) {
        return this.f26061saneness.get(i);
    }

    public int wireman(androidx.media3.common.yemenite yemeniteVar) {
        int iIndexOf = this.f26061saneness.indexOf(yemeniteVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }
}
