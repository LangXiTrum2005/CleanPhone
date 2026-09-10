package hydromechanics;

import androidx.media3.common.supplicat;
import androidx.media3.exoplayer.libyan;
import decarock.grimness;

/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f28177attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final rotuma[] f28178dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Object f28179marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final libyan[] f28180saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final supplicat f28181wireman;

    public oilcan(libyan[] libyanVarArr, rotuma[] rotumaVarArr, supplicat supplicatVar, Object obj) {
        decarock.attabal.attabal(libyanVarArr.length == rotumaVarArr.length);
        this.f28180saneness = libyanVarArr;
        this.f28178dern = (rotuma[]) rotumaVarArr.clone();
        this.f28181wireman = supplicatVar;
        this.f28179marial = obj;
        this.f28177attabal = libyanVarArr.length;
    }

    public boolean attabal(oilcan oilcanVar) {
        if (oilcanVar == null || oilcanVar.f28178dern.length != this.f28178dern.length) {
            return false;
        }
        for (int i = 0; i < this.f28178dern.length; i++) {
            if (!saneness(oilcanVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean dern(int i) {
        return this.f28180saneness[i] != null;
    }

    public boolean saneness(oilcan oilcanVar, int i) {
        return oilcanVar != null && grimness.dern(this.f28180saneness[i], oilcanVar.f28180saneness[i]) && grimness.dern(this.f28178dern[i], oilcanVar.f28178dern[i]);
    }
}
