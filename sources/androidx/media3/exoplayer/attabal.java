package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal extends androidx.media3.common.oilcan {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ethene.oilcan f11536beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f11537competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f11538marial;

    public attabal(boolean z, ethene.oilcan oilcanVar) {
        this.f11537competently = z;
        this.f11536beachfront = oilcanVar;
        this.f11538marial = oilcanVar.getLength();
    }

    public static Object dovishness(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object gintrap(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object preprohormone(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int adultoid(int i);

    @Override // androidx.media3.common.oilcan
    public int attabal(boolean z) {
        if (this.f11538marial == 0) {
            return -1;
        }
        if (this.f11537competently) {
            z = false;
        }
        int firstIndex = z ? this.f11536beachfront.getFirstIndex() : 0;
        while (oilcan(firstIndex).monoploid()) {
            firstIndex = stratoscope(firstIndex, z);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return cuirassed(firstIndex) + oilcan(firstIndex).attabal(z);
    }

    @Override // androidx.media3.common.oilcan
    public final androidx.media3.common.oilcan.saneness competently(int i, androidx.media3.common.oilcan.saneness sanenessVar, boolean z) {
        int iGraveside = graveside(i);
        int iCuirassed = cuirassed(iGraveside);
        oilcan(iGraveside).competently(i - cord(iGraveside), sanenessVar, z);
        sanenessVar.f11137dern += iCuirassed;
        if (z) {
            sanenessVar.f11139saneness = preprohormone(rotuma(iGraveside), decarock.attabal.marial(sanenessVar.f11139saneness));
        }
        return sanenessVar;
    }

    public abstract int cord(int i);

    public abstract int cuirassed(int i);

    @Override // androidx.media3.common.oilcan
    public int dern(boolean z) {
        int i = this.f11538marial;
        if (i == 0) {
            return -1;
        }
        if (this.f11537competently) {
            z = false;
        }
        int lastIndex = z ? this.f11536beachfront.getLastIndex() : i - 1;
        while (oilcan(lastIndex).monoploid()) {
            lastIndex = trm(lastIndex, z);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return cuirassed(lastIndex) + oilcan(lastIndex).dern(z);
    }

    @Override // androidx.media3.common.oilcan
    public int formularize(int i, int i2, boolean z) {
        if (this.f11537competently) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iAdultoid = adultoid(i);
        int iCuirassed = cuirassed(iAdultoid);
        int iFormularize = oilcan(iAdultoid).formularize(i - iCuirassed, i2 != 2 ? i2 : 0, z);
        if (iFormularize != -1) {
            return iCuirassed + iFormularize;
        }
        int iTrm = trm(iAdultoid, z);
        while (iTrm != -1 && oilcan(iTrm).monoploid()) {
            iTrm = trm(iTrm, z);
        }
        if (iTrm != -1) {
            return cuirassed(iTrm) + oilcan(iTrm).dern(z);
        }
        if (i2 == 2) {
            return dern(z);
        }
        return -1;
    }

    public abstract int graveside(int i);

    @Override // androidx.media3.common.oilcan
    public final Object impassible(int i) {
        int iGraveside = graveside(i);
        return preprohormone(rotuma(iGraveside), oilcan(iGraveside).impassible(i - cord(iGraveside)));
    }

    @Override // androidx.media3.common.oilcan
    public final androidx.media3.common.oilcan.saneness impromptu(Object obj, androidx.media3.common.oilcan.saneness sanenessVar) {
        Object objGintrap = gintrap(obj);
        Object objDovishness = dovishness(obj);
        int iMolybdenite = molybdenite(objGintrap);
        int iCuirassed = cuirassed(iMolybdenite);
        oilcan(iMolybdenite).impromptu(objDovishness, sanenessVar);
        sanenessVar.f11137dern += iCuirassed;
        sanenessVar.f11139saneness = obj;
        return sanenessVar;
    }

    @Override // androidx.media3.common.oilcan
    public final androidx.media3.common.oilcan.dern kowloon(int i, androidx.media3.common.oilcan.dern dernVar, long j) {
        int iAdultoid = adultoid(i);
        int iCuirassed = cuirassed(iAdultoid);
        int iCord = cord(iAdultoid);
        oilcan(iAdultoid).kowloon(i - iCuirassed, dernVar, j);
        Object objRotuma = rotuma(iAdultoid);
        if (!androidx.media3.common.oilcan.dern.f11104monoploid.equals(dernVar.f11115attabal)) {
            objRotuma = preprohormone(objRotuma, dernVar.f11115attabal);
        }
        dernVar.f11115attabal = objRotuma;
        dernVar.f11127triweekly += iCord;
        dernVar.f11123kowloon += iCord;
        return dernVar;
    }

    @Override // androidx.media3.common.oilcan
    public int marial(int i, int i2, boolean z) {
        if (this.f11537competently) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iAdultoid = adultoid(i);
        int iCuirassed = cuirassed(iAdultoid);
        int iMarial = oilcan(iAdultoid).marial(i - iCuirassed, i2 != 2 ? i2 : 0, z);
        if (iMarial != -1) {
            return iCuirassed + iMarial;
        }
        int iStratoscope = stratoscope(iAdultoid, z);
        while (iStratoscope != -1 && oilcan(iStratoscope).monoploid()) {
            iStratoscope = stratoscope(iStratoscope, z);
        }
        if (iStratoscope != -1) {
            return cuirassed(iStratoscope) + oilcan(iStratoscope).attabal(z);
        }
        if (i2 == 2) {
            return attabal(z);
        }
        return -1;
    }

    public abstract int molybdenite(Object obj);

    public abstract androidx.media3.common.oilcan oilcan(int i);

    public abstract Object rotuma(int i);

    @Override // androidx.media3.common.oilcan
    public final int saneness(Object obj) {
        int iSaneness;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objGintrap = gintrap(obj);
        Object objDovishness = dovishness(obj);
        int iMolybdenite = molybdenite(objGintrap);
        if (iMolybdenite == -1 || (iSaneness = oilcan(iMolybdenite).saneness(objDovishness)) == -1) {
            return -1;
        }
        return cord(iMolybdenite) + iSaneness;
    }

    public final int stratoscope(int i, boolean z) {
        if (z) {
            return this.f11536beachfront.getNextIndex(i);
        }
        if (i < this.f11538marial - 1) {
            return i + 1;
        }
        return -1;
    }

    public final int trm(int i, boolean z) {
        if (z) {
            return this.f11536beachfront.getPreviousIndex(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }
}
