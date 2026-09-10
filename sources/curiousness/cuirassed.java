package curiousness;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ChaCha20Poly1305Key.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cuirassed extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final yemenite f24356attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f24357dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f24358saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f24359wireman;

    public cuirassed(yemenite yemeniteVar, ebullioscopic.dern dernVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24356attabal = yemeniteVar;
        this.f24358saneness = dernVar;
        this.f24357dern = attabalVar;
        this.f24359wireman = num;
    }

    public static ebullioscopic.attabal beachfront(yemenite yemeniteVar, @Nullable Integer num) {
        if (yemeniteVar.dern() == yemenite.attabal.f24494dern) {
            return hobby.trm.f27847attabal;
        }
        if (yemeniteVar.dern() == yemenite.attabal.f24495saneness) {
            return hobby.trm.attabal(num.intValue());
        }
        if (yemeniteVar.dern() == yemenite.attabal.f24493attabal) {
            return hobby.trm.saneness(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + yemeniteVar.dern());
    }

    public static cuirassed wireman(yemenite.attabal attabalVar, ebullioscopic.dern dernVar, @Nullable Integer num) throws GeneralSecurityException {
        yemenite.attabal attabalVar2 = yemenite.attabal.f24494dern;
        if (attabalVar != attabalVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + attabalVar + " the value of idRequirement must be non-null");
        }
        if (attabalVar == attabalVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (dernVar.dern() == 32) {
            yemenite yemeniteVarSaneness = yemenite.saneness(attabalVar);
            return new cuirassed(yemeniteVarSaneness, dernVar, beachfront(yemeniteVarSaneness, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + dernVar.dern());
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f24359wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public yemenite saneness() {
        return this.f24356attabal;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24357dern;
    }

    public ebullioscopic.dern marial() {
        return this.f24358saneness;
    }
}
