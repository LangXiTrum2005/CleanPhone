package affiche;

import affiche.apical;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: compiled from: EngineFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cutely<T_WRAPPER extends apical<JcePrimitiveT>, JcePrimitiveT> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final marial<JcePrimitiveT> f3863attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final cutely<apical.attabal, Cipher> f3861saneness = new cutely<>(new apical.attabal());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final cutely<apical.marial, Mac> f3858dern = new cutely<>(new apical.marial());

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final cutely<apical.competently, Signature> f3862wireman = new cutely<>(new apical.competently());

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final cutely<apical.beachfront, MessageDigest> f3860marial = new cutely<>(new apical.beachfront());

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final cutely<apical.saneness, KeyAgreement> f3856beachfront = new cutely<>(new apical.saneness());

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final cutely<apical.wireman, KeyPairGenerator> f3857competently = new cutely<>(new apical.wireman());

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final cutely<apical.dern, KeyFactory> f3859impromptu = new cutely<>(new apical.dern());

    /* JADX INFO: compiled from: EngineFactory.java */
    public static class dern<JcePrimitiveT> implements marial<JcePrimitiveT> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final apical<JcePrimitiveT> f3864attabal;

        @Override // affiche.cutely.marial
        public JcePrimitiveT attabal(String str) throws GeneralSecurityException {
            return this.f3864attabal.attabal(str, null);
        }

        public dern(apical<JcePrimitiveT> apicalVar) {
            this.f3864attabal = apicalVar;
        }
    }

    /* JADX INFO: compiled from: EngineFactory.java */
    public interface marial<JcePrimitiveT> {
        JcePrimitiveT attabal(String str) throws GeneralSecurityException;
    }

    /* JADX INFO: compiled from: EngineFactory.java */
    public static class saneness<JcePrimitiveT> implements marial<JcePrimitiveT> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final apical<JcePrimitiveT> f3865attabal;

        @Override // affiche.cutely.marial
        public JcePrimitiveT attabal(String str) throws GeneralSecurityException {
            Iterator<Provider> it = cutely.saneness("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f3865attabal.attabal(str, it.next());
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            return this.f3865attabal.attabal(str, null);
        }

        public saneness(apical<JcePrimitiveT> apicalVar) {
            this.f3865attabal = apicalVar;
        }
    }

    /* JADX INFO: compiled from: EngineFactory.java */
    public static class wireman<JcePrimitiveT> implements marial<JcePrimitiveT> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final apical<JcePrimitiveT> f3866attabal;

        @Override // affiche.cutely.marial
        public JcePrimitiveT attabal(String str) throws GeneralSecurityException {
            Iterator<Provider> it = cutely.saneness("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f3866attabal.attabal(str, it.next());
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public wireman(apical<JcePrimitiveT> apicalVar) {
            this.f3866attabal = apicalVar;
        }
    }

    public cutely(T_WRAPPER t_wrapper) {
        if (TinkFipsUtil.dern()) {
            this.f3863attabal = new wireman(t_wrapper);
        } else if (dovishness.dern()) {
            this.f3863attabal = new saneness(t_wrapper);
        } else {
            this.f3863attabal = new dern(t_wrapper);
        }
    }

    public static List<Provider> saneness(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT attabal(String str) throws GeneralSecurityException {
        return this.f3863attabal.attabal(str);
    }
}
