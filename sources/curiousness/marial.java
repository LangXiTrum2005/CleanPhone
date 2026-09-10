package curiousness;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: AeadWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial implements hobby.merc<discernable.attabal, discernable.attabal> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f24412attabal = new marial();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.kattegat<hobby.arytenoidectomy, discernable.attabal> f24413saneness = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.wireman
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return cloop.polder.dern((hobby.arytenoidectomy) impromptuVar);
        }
    }, hobby.arytenoidectomy.class, discernable.attabal.class);

    /* JADX INFO: compiled from: AeadWrapper.java */
    public static class dern implements discernable.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final saneness f24414attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final hobby.molybdenite.attabal f24415dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final hobby.sealless<saneness> f24416saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final hobby.molybdenite.attabal f24417wireman;

        @Override // discernable.attabal
        public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (saneness sanenessVar : this.f24416saneness.attabal(bArr)) {
                try {
                    byte[] bArrAttabal = sanenessVar.f24418attabal.attabal(bArr, bArr2);
                    this.f24417wireman.attabal(sanenessVar.f24419saneness, bArr.length);
                    return bArrAttabal;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f24417wireman.dern();
            throw new GeneralSecurityException("decryption failed");
        }

        public dern(saneness sanenessVar, hobby.sealless<saneness> seallessVar, hobby.molybdenite.attabal attabalVar, hobby.molybdenite.attabal attabalVar2) {
            this.f24414attabal = sanenessVar;
            this.f24416saneness = seallessVar;
            this.f24415dern = attabalVar;
            this.f24417wireman = attabalVar2;
        }
    }

    /* JADX INFO: compiled from: AeadWrapper.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final discernable.attabal f24418attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24419saneness;

        public saneness(discernable.attabal attabalVar, int i) {
            this.f24418attabal = attabalVar;
            this.f24419saneness = i;
        }
    }

    public static void marial() throws GeneralSecurityException {
        hobby.cord.saneness().wireman(f24412attabal);
        hobby.cord.saneness().dern(f24413saneness);
    }

    public static ebullioscopic.attabal wireman(discernable.impromptu impromptuVar) throws GeneralSecurityException {
        if (impromptuVar instanceof curiousness.saneness) {
            return ((curiousness.saneness) impromptuVar).dern();
        }
        if (impromptuVar instanceof hobby.arytenoidectomy) {
            return ((hobby.arytenoidectomy) impromptuVar).wireman();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + impromptuVar.getClass().getName() + " with parameters " + impromptuVar.saneness());
    }

    @Override // hobby.merc
    public Class<discernable.attabal> attabal() {
        return discernable.attabal.class;
    }

    @Override // hobby.merc
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public discernable.attabal saneness(hobby.triweekly triweeklyVar, hobby.polloi polloiVar, hobby.merc.attabal<discernable.attabal> attabalVar) throws GeneralSecurityException {
        hobby.molybdenite.attabal attabalVar2;
        hobby.molybdenite.attabal attabalVarAttabal;
        hobby.sealless.saneness sanenessVar = new hobby.sealless.saneness();
        for (int i = 0; i < triweeklyVar.size(); i++) {
            hobby.triweekly.attabal attabalVarAttabal2 = triweeklyVar.attabal(i);
            if (attabalVarAttabal2.getStatus().equals(discernable.cutely.f25290attabal)) {
                sanenessVar.saneness(wireman(attabalVarAttabal2.getKey()), new saneness(attabalVar.attabal(attabalVarAttabal2), attabalVarAttabal2.getId()));
            }
        }
        if (polloiVar.attabal()) {
            attabalVar2 = hobby.graveside.f27774attabal;
            attabalVarAttabal = attabalVar2;
        } else {
            hobby.molybdenite molybdeniteVarAttabal = hobby.rotuma.saneness().attabal();
            hobby.molybdenite.attabal attabalVarAttabal3 = molybdeniteVarAttabal.attabal(triweeklyVar, polloiVar, "aead", "encrypt");
            attabalVarAttabal = molybdeniteVarAttabal.attabal(triweeklyVar, polloiVar, "aead", "decrypt");
            attabalVar2 = attabalVarAttabal3;
        }
        return new dern(new saneness(attabalVar.attabal(triweeklyVar.saneness()), triweeklyVar.saneness().getId()), sanenessVar.attabal(), attabalVar2, attabalVarAttabal);
    }

    @Override // hobby.merc
    public Class<discernable.attabal> dern() {
        return discernable.attabal.class;
    }
}
