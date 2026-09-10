package astronautic;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: PublicKeyVerifyWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class polder implements hobby.merc<discernable.dovishness, discernable.dovishness> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final polder f14665attabal = new polder();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.kattegat<hobby.arytenoidectomy, discernable.dovishness> f14666saneness = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: astronautic.merc
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return extensively.graveside.saneness((hobby.arytenoidectomy) impromptuVar);
        }
    }, hobby.arytenoidectomy.class, discernable.dovishness.class);

    /* JADX INFO: compiled from: PublicKeyVerifyWrapper.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final discernable.dovishness f14667attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f14668saneness;

        public attabal(discernable.dovishness dovishnessVar, int i) {
            this.f14667attabal = dovishnessVar;
            this.f14668saneness = i;
        }
    }

    /* JADX INFO: compiled from: PublicKeyVerifyWrapper.java */
    public static class saneness implements discernable.dovishness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final hobby.sealless<attabal> f14669attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final hobby.molybdenite.attabal f14670saneness;

        public saneness(hobby.sealless<attabal> seallessVar, hobby.molybdenite.attabal attabalVar) {
            this.f14669attabal = seallessVar;
            this.f14670saneness = attabalVar;
        }

        @Override // discernable.dovishness
        public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (attabal attabalVar : this.f14669attabal.attabal(bArr)) {
                try {
                    attabalVar.f14667attabal.attabal(bArr, bArr2);
                    this.f14670saneness.attabal(attabalVar.f14668saneness, bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f14670saneness.dern();
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public static void marial() throws GeneralSecurityException {
        hobby.cord.saneness().wireman(f14665attabal);
        hobby.cord.saneness().dern(f14666saneness);
    }

    private static ebullioscopic.attabal wireman(discernable.impromptu impromptuVar) throws GeneralSecurityException {
        if (impromptuVar instanceof treadless) {
            return ((treadless) impromptuVar).dern();
        }
        if (impromptuVar instanceof hobby.arytenoidectomy) {
            return ((hobby.arytenoidectomy) impromptuVar).wireman();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + impromptuVar.getClass().getName() + " with parameters " + impromptuVar.saneness());
    }

    @Override // hobby.merc
    public Class<discernable.dovishness> attabal() {
        return discernable.dovishness.class;
    }

    @Override // hobby.merc
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public discernable.dovishness saneness(hobby.triweekly triweeklyVar, hobby.polloi polloiVar, hobby.merc.attabal<discernable.dovishness> attabalVar) throws GeneralSecurityException {
        hobby.sealless.saneness sanenessVar = new hobby.sealless.saneness();
        for (int i = 0; i < triweeklyVar.size(); i++) {
            hobby.triweekly.attabal attabalVarAttabal = triweeklyVar.attabal(i);
            if (attabalVarAttabal.getStatus().equals(discernable.cutely.f25290attabal)) {
                sanenessVar.saneness(wireman(attabalVarAttabal.getKey()), new attabal(attabalVar.attabal(attabalVarAttabal), attabalVarAttabal.getId()));
            }
        }
        return new saneness(sanenessVar.attabal(), !polloiVar.attabal() ? hobby.rotuma.saneness().attabal().attabal(triweeklyVar, polloiVar, "public_key_verify", "verify") : hobby.graveside.f27774attabal);
    }

    @Override // hobby.merc
    public Class<discernable.dovishness> dern() {
        return discernable.dovishness.class;
    }
}
