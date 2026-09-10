package astronautic;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: Ed25519PrivateKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cutely extends milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kowloon f14569attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f14570saneness;

    public cutely(kowloon kowloonVar, ebullioscopic.dern dernVar) {
        this.f14569attabal = kowloonVar;
        this.f14570saneness = dernVar;
    }

    public static cutely marial(kowloon kowloonVar, ebullioscopic.dern dernVar) throws GeneralSecurityException {
        if (kowloonVar == null) {
            throw new GeneralSecurityException("Ed25519 key cannot be constructed without an Ed25519 public key");
        }
        if (dernVar.dern() == 32) {
            if (Arrays.equals(kowloonVar.competently().wireman(), hobby.marial.dovishness(hobby.marial.cutely(dernVar.wireman(discernable.beachfront.attabal()))))) {
                return new cutely(kowloonVar, dernVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + dernVar.dern());
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public taiyuan saneness() {
        return this.f14569attabal.saneness();
    }

    public ebullioscopic.dern competently() {
        return this.f14570saneness;
    }

    @Override // astronautic.milliradian
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public kowloon wireman() {
        return this.f14569attabal;
    }
}
