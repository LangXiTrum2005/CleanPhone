package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import prescient.competently;

/* JADX INFO: compiled from: ClassifierBasedTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class apical implements permissivist {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f31704attabal;

    public final boolean beachfront(beachfront first, beachfront second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (!Intrinsics.wireman(first.getName(), second.getName())) {
            return false;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness = first.saneness();
        for (p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarSaneness2 = second.saneness(); apicalVarSaneness != null && apicalVarSaneness2 != null; apicalVarSaneness2 = apicalVarSaneness2.saneness()) {
            if (apicalVarSaneness instanceof trm) {
                return apicalVarSaneness2 instanceof trm;
            }
            if (apicalVarSaneness2 instanceof trm) {
                return false;
            }
            if (apicalVarSaneness instanceof sealless) {
                return (apicalVarSaneness2 instanceof sealless) && Intrinsics.wireman(((sealless) apicalVarSaneness).marial(), ((sealless) apicalVarSaneness2).marial());
            }
            if ((apicalVarSaneness2 instanceof sealless) || !Intrinsics.wireman(apicalVarSaneness.getName(), apicalVarSaneness2.getName())) {
                return false;
            }
            apicalVarSaneness = apicalVarSaneness.saneness();
        }
        return true;
    }

    public final boolean competently(beachfront beachfrontVar) {
        return (competently.impassible(beachfrontVar) || marial.yemenite(beachfrontVar)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof permissivist) || obj.hashCode() != hashCode()) {
            return false;
        }
        permissivist permissivistVar = (permissivist) obj;
        if (permissivistVar.getParameters().size() != getParameters().size()) {
            return false;
        }
        beachfront beachfrontVarWireman = wireman();
        beachfront beachfrontVarWireman2 = permissivistVar.wireman();
        if (beachfrontVarWireman2 != null && competently(beachfrontVarWireman) && competently(beachfrontVarWireman2)) {
            return impromptu(beachfrontVarWireman2);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f31704attabal;
        if (i != 0) {
            return i;
        }
        beachfront beachfrontVarWireman = wireman();
        int iHashCode = competently(beachfrontVarWireman) ? marial.impassible(beachfrontVarWireman).hashCode() : System.identityHashCode(this);
        this.f31704attabal = iHashCode;
        return iHashCode;
    }

    public abstract boolean impromptu(beachfront beachfrontVar);

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public abstract beachfront wireman();
}
