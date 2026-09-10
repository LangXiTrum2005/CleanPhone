package curiousness;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: LegacyKmsAeadKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class grimness extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saran f24386attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    @Nullable
    public final Integer f24387dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.attabal f24388saneness;

    public grimness(saran saranVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24386attabal = saranVar;
        this.f24388saneness = attabalVar;
        this.f24387dern = num;
    }

    public static grimness wireman(saran saranVar, @Nullable Integer num) throws GeneralSecurityException {
        ebullioscopic.attabal attabalVarAttabal;
        if (saranVar.wireman() == saran.attabal.f24466attabal) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            attabalVarAttabal = ebullioscopic.attabal.attabal(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (saranVar.wireman() != saran.attabal.f24467saneness) {
                throw new GeneralSecurityException("Unknown Variant: " + saranVar.wireman());
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            attabalVarAttabal = ebullioscopic.attabal.attabal(new byte[0]);
        }
        return new grimness(saranVar, attabalVarAttabal, num);
    }

    @Override // discernable.impromptu
    public Integer attabal() {
        return this.f24387dern;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24388saneness;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public saran saneness() {
        return this.f24386attabal;
    }
}
