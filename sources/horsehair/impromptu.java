package horsehair;

import hobby.cord;
import hobby.merc;
import hobby.sealless;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: ChunkedMacWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu implements merc<competently, competently> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final impromptu f27943attabal = new impromptu();

    /* JADX INFO: compiled from: ChunkedMacWrapper.java */
    public static class saneness implements competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final sealless<competently> f27944attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final competently f27945saneness;

        public saneness(sealless<competently> seallessVar, competently competentlyVar) {
            this.f27944attabal = seallessVar;
            this.f27945saneness = competentlyVar;
        }
    }

    public static void marial() throws GeneralSecurityException {
        cord.saneness().wireman(f27943attabal);
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
    public Class<competently> attabal() {
        return competently.class;
    }

    @Override // hobby.merc
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public competently saneness(hobby.triweekly triweeklyVar, hobby.polloi polloiVar, merc.attabal<competently> attabalVar) throws GeneralSecurityException {
        hobby.triweekly.attabal attabalVarSaneness = triweeklyVar.saneness();
        if (attabalVarSaneness == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        sealless.saneness sanenessVar = new sealless.saneness();
        for (int i = 0; i < triweeklyVar.size(); i++) {
            hobby.triweekly.attabal attabalVarAttabal = triweeklyVar.attabal(i);
            if (attabalVarAttabal.getStatus().equals(discernable.cutely.f25290attabal)) {
                sanenessVar.saneness(wireman(attabalVarAttabal.getKey()), attabalVar.attabal(attabalVarAttabal));
            }
        }
        return new saneness(sanenessVar.attabal(), attabalVar.attabal(attabalVarSaneness));
    }

    @Override // hobby.merc
    public Class<competently> dern() {
        return competently.class;
    }
}
