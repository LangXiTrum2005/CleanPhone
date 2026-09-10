package likeable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.immediately;
import decarock.stratoscope;

/* JADX INFO: compiled from: ListChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ImmutableList<attabal> f33006attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f33007saneness;

    public beachfront(int i, ImmutableList<attabal> immutableList) {
        this.f33007saneness = i;
        this.f33006attabal = immutableList;
    }

    public static attabal attabal(int i, int i2, stratoscope stratoscopeVar) {
        switch (i) {
            case 1718776947:
                return competently.wireman(i2, stratoscopeVar);
            case 1751742049:
                return dern.saneness(stratoscopeVar);
            case 1752331379:
                return wireman.dern(stratoscopeVar);
            case 1852994675:
                return impromptu.attabal(stratoscopeVar);
            default:
                return null;
        }
    }

    public static beachfront dern(int i, stratoscope stratoscopeVar) {
        ImmutableList.attabal attabalVar = new ImmutableList.attabal();
        int iCompetently = stratoscopeVar.competently();
        int iSaneness = -2;
        while (stratoscopeVar.attabal() > 8) {
            int iAdultoid = stratoscopeVar.adultoid();
            int iBeachfront = stratoscopeVar.beachfront() + stratoscopeVar.adultoid();
            stratoscopeVar.peridotite(iBeachfront);
            attabal attabalVarDern = iAdultoid == 1414744396 ? dern(stratoscopeVar.adultoid(), stratoscopeVar) : attabal(iAdultoid, iSaneness, stratoscopeVar);
            if (attabalVarDern != null) {
                if (attabalVarDern.getType() == 1752331379) {
                    iSaneness = ((wireman) attabalVarDern).saneness();
                }
                attabalVar.attabal(attabalVarDern);
            }
            stratoscopeVar.mathsort(iBeachfront);
            stratoscopeVar.peridotite(iCompetently);
        }
        return new beachfront(i, attabalVar.impassible());
    }

    @Override // likeable.attabal
    public int getType() {
        return this.f33007saneness;
    }

    public <T extends attabal> T saneness(Class<T> cls) {
        immediately<attabal> it = this.f33006attabal.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
