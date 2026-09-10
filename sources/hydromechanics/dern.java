package hydromechanics;

import androidx.media3.common.yemenite;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class dern implements rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final yemenite f28168attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long[] f28169beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f28170competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int[] f28171dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final androidx.media3.common.polloi[] f28172marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f28173saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f28174wireman;

    public dern(yemenite yemeniteVar, int[] iArr, int i) {
        int i2 = 0;
        decarock.attabal.competently(iArr.length > 0);
        this.f28174wireman = i;
        this.f28168attabal = (yemenite) decarock.attabal.marial(yemeniteVar);
        int length = iArr.length;
        this.f28173saneness = length;
        this.f28172marial = new androidx.media3.common.polloi[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f28172marial[i3] = yemeniteVar.attabal(iArr[i3]);
        }
        Arrays.sort(this.f28172marial, new Comparator() { // from class: hydromechanics.saneness
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dern.wireman((androidx.media3.common.polloi) obj, (androidx.media3.common.polloi) obj2);
            }
        });
        this.f28171dern = new int[this.f28173saneness];
        while (true) {
            int i4 = this.f28173saneness;
            if (i2 >= i4) {
                this.f28169beachfront = new long[i4];
                return;
            } else {
                this.f28171dern[i2] = yemeniteVar.saneness(this.f28172marial[i2]);
                i2++;
            }
        }
    }

    public static /* synthetic */ int wireman(androidx.media3.common.polloi polloiVar, androidx.media3.common.polloi polloiVar2) {
        return polloiVar2.f11217taiyuan - polloiVar.f11217taiyuan;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dern dernVar = (dern) obj;
            if (this.f28168attabal.equals(dernVar.f28168attabal) && Arrays.equals(this.f28171dern, dernVar.f28171dern)) {
                return true;
            }
        }
        return false;
    }

    @Override // hydromechanics.cuirassed
    public final androidx.media3.common.polloi getFormat(int i) {
        return this.f28172marial[i];
    }

    @Override // hydromechanics.cuirassed
    public final int getIndexInTrackGroup(int i) {
        return this.f28171dern[i];
    }

    @Override // hydromechanics.rotuma
    public final androidx.media3.common.polloi getSelectedFormat() {
        return this.f28172marial[getSelectedIndex()];
    }

    @Override // hydromechanics.rotuma
    public final int getSelectedIndexInTrackGroup() {
        return this.f28171dern[getSelectedIndex()];
    }

    @Override // hydromechanics.cuirassed
    public final yemenite getTrackGroup() {
        return this.f28168attabal;
    }

    public int hashCode() {
        if (this.f28170competently == 0) {
            this.f28170competently = (System.identityHashCode(this.f28168attabal) * 31) + Arrays.hashCode(this.f28171dern);
        }
        return this.f28170competently;
    }

    @Override // hydromechanics.cuirassed
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f28173saneness; i2++) {
            if (this.f28171dern[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // hydromechanics.rotuma, hydromechanics.cuirassed
    public final int length() {
        return this.f28171dern.length;
    }

    @Override // hydromechanics.rotuma
    public void disable() {
    }

    @Override // hydromechanics.rotuma
    public void enable() {
    }

    @Override // hydromechanics.rotuma
    public void onPlaybackSpeed(float f) {
    }
}
