package curiousness;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: XChaCha20Poly1305Key.java */
/* JADX INFO: loaded from: classes3.dex */
public final class underbelly extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final gusty f24482attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f24483dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f24484saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f24485wireman;

    public underbelly(gusty gustyVar, ebullioscopic.dern dernVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24482attabal = gustyVar;
        this.f24484saneness = dernVar;
        this.f24483dern = attabalVar;
        this.f24485wireman = num;
    }

    public static ebullioscopic.attabal beachfront(gusty gustyVar, @Nullable Integer num) {
        if (gustyVar.dern() == gusty.attabal.f24391dern) {
            return hobby.trm.f27847attabal;
        }
        if (gustyVar.dern() == gusty.attabal.f24392saneness) {
            return hobby.trm.attabal(num.intValue());
        }
        if (gustyVar.dern() == gusty.attabal.f24390attabal) {
            return hobby.trm.saneness(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + gustyVar.dern());
    }

    public static underbelly wireman(gusty.attabal attabalVar, ebullioscopic.dern dernVar, @Nullable Integer num) throws GeneralSecurityException {
        gusty.attabal attabalVar2 = gusty.attabal.f24391dern;
        if (attabalVar != attabalVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + attabalVar + " the value of idRequirement must be non-null");
        }
        if (attabalVar == attabalVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (dernVar.dern() == 32) {
            gusty gustyVarSaneness = gusty.saneness(attabalVar);
            return new underbelly(gustyVarSaneness, dernVar, beachfront(gustyVarSaneness, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + dernVar.dern());
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f24485wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public gusty saneness() {
        return this.f24482attabal;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24483dern;
    }

    public ebullioscopic.dern marial() {
        return this.f24484saneness;
    }
}
