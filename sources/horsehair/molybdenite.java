package horsehair;

import hobby.cord;
import hobby.kattegat;
import hobby.merc;
import hobby.sealless;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: MacWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class molybdenite implements merc<discernable.polloi, discernable.polloi> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molybdenite f27954attabal = new molybdenite();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final kattegat<hobby.arytenoidectomy, discernable.polloi> f27955saneness = kattegat.saneness(new kattegat.saneness() { // from class: horsehair.polloi
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return ascolichen.kowloon.saneness((hobby.arytenoidectomy) impromptuVar);
        }
    }, hobby.arytenoidectomy.class, discernable.polloi.class);

    /* JADX INFO: compiled from: MacWrapper.java */
    public static class dern implements discernable.polloi {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final saneness f27956attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final hobby.molybdenite.attabal f27957dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final sealless<saneness> f27958saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final hobby.molybdenite.attabal f27959wireman;

        @Override // discernable.polloi
        public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (saneness sanenessVar : this.f27958saneness.attabal(bArr)) {
                try {
                    sanenessVar.f27960attabal.attabal(bArr, bArr2);
                    this.f27959wireman.attabal(sanenessVar.f27961saneness, bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f27959wireman.dern();
            throw new GeneralSecurityException("invalid MAC");
        }

        public dern(saneness sanenessVar, sealless<saneness> seallessVar, hobby.molybdenite.attabal attabalVar, hobby.molybdenite.attabal attabalVar2) {
            this.f27956attabal = sanenessVar;
            this.f27958saneness = seallessVar;
            this.f27957dern = attabalVar;
            this.f27959wireman = attabalVar2;
        }
    }

    /* JADX INFO: compiled from: MacWrapper.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final discernable.polloi f27960attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f27961saneness;

        public saneness(discernable.polloi polloiVar, int i) {
            this.f27960attabal = polloiVar;
            this.f27961saneness = i;
        }
    }

    public static void marial() throws GeneralSecurityException {
        cord.saneness().wireman(f27954attabal);
        cord.saneness().dern(f27955saneness);
    }

    private static ebullioscopic.attabal wireman(discernable.impromptu impromptuVar) throws GeneralSecurityException {
        if (impromptuVar instanceof arytenoidectomy) {
            return ((arytenoidectomy) impromptuVar).dern();
        }
        if (impromptuVar instanceof hobby.arytenoidectomy) {
            return ((hobby.arytenoidectomy) impromptuVar).wireman();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + impromptuVar.getClass().getName() + " with parameters " + impromptuVar.saneness());
    }

    @Override // hobby.merc
    public Class<discernable.polloi> attabal() {
        return discernable.polloi.class;
    }

    @Override // hobby.merc
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public discernable.polloi saneness(hobby.triweekly triweeklyVar, hobby.polloi polloiVar, merc.attabal<discernable.polloi> attabalVar) throws GeneralSecurityException {
        hobby.molybdenite.attabal attabalVar2;
        hobby.molybdenite.attabal attabalVarAttabal;
        sealless.saneness sanenessVar = new sealless.saneness();
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
            hobby.molybdenite.attabal attabalVarAttabal3 = molybdeniteVarAttabal.attabal(triweeklyVar, polloiVar, "mac", "compute");
            attabalVarAttabal = molybdeniteVarAttabal.attabal(triweeklyVar, polloiVar, "mac", "verify");
            attabalVar2 = attabalVarAttabal3;
        }
        return new dern(new saneness(attabalVar.attabal(triweeklyVar.saneness()), triweeklyVar.saneness().getId()), sanenessVar.attabal(), attabalVar2, attabalVarAttabal);
    }

    @Override // hobby.merc
    public Class<discernable.polloi> dern() {
        return discernable.polloi.class;
    }
}
