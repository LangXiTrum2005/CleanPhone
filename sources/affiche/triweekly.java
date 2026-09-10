package affiche;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: PrfAesCmac.java */
/* JADX INFO: loaded from: classes3.dex */
public final class triweekly implements larchwood.dern {

    /* JADX INFO: compiled from: PrfAesCmac.java */
    public static class saneness implements larchwood.dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final larchwood.dern f3916attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final larchwood.dern f3917saneness;

        @Override // larchwood.dern
        public byte[] attabal(byte[] bArr, int i) throws GeneralSecurityException {
            return bArr.length <= 64 ? this.f3916attabal.attabal(bArr, i) : this.f3917saneness.attabal(bArr, i);
        }

        public saneness(larchwood.dern dernVar, larchwood.dern dernVar2) {
            this.f3916attabal = dernVar;
            this.f3917saneness = dernVar2;
        }
    }

    public static larchwood.dern saneness(larchwood.attabal attabalVar) throws GeneralSecurityException {
        larchwood.dern dernVarDern = supersedeas.attabal.dern(attabalVar);
        try {
            return new saneness(dernVarDern, supersedeas.saneness.saneness(attabalVar));
        } catch (GeneralSecurityException unused) {
            return dernVarDern;
        }
    }
}
