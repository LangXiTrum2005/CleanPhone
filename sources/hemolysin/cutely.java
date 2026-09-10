package hemolysin;

import com.bumptech.glide.util.apical;
import com.bumptech.glide.util.formularize;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: SafeKeyGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
public class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final com.bumptech.glide.util.impromptu<maggot.saneness, String> f27641attabal = new com.bumptech.glide.util.impromptu<>(1000);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final technofreak.competently<saneness> f27642saneness = naming.attabal.wireman(10, new attabal());

    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public class attabal implements naming.attabal.wireman<saneness> {
        public attabal() {
        }

        @Override // naming.attabal.wireman
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public saneness attabal() {
            try {
                return new saneness(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public static final class saneness implements naming.attabal.beachfront {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final naming.dern f27644arytenoidectomy = naming.dern.attabal();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final MessageDigest f27645kowloon;

        public saneness(MessageDigest messageDigest) {
            this.f27645kowloon = messageDigest;
        }

        @Override // naming.attabal.beachfront
        public naming.dern wireman() {
            return this.f27644arytenoidectomy;
        }
    }

    public final String attabal(maggot.saneness sanenessVar) {
        saneness sanenessVar2 = (saneness) apical.wireman(this.f27642saneness.saneness());
        try {
            sanenessVar.attabal(sanenessVar2.f27645kowloon);
            return formularize.preprohormone(sanenessVar2.f27645kowloon.digest());
        } finally {
            this.f27642saneness.attabal(sanenessVar2);
        }
    }

    public String saneness(maggot.saneness sanenessVar) {
        String strCompetently;
        synchronized (this.f27641attabal) {
            strCompetently = this.f27641attabal.competently(sanenessVar);
        }
        if (strCompetently == null) {
            strCompetently = attabal(sanenessVar);
        }
        synchronized (this.f27641attabal) {
            this.f27641attabal.apical(sanenessVar, strCompetently);
        }
        return strCompetently;
    }
}
