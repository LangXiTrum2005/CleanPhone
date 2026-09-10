package affiche;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: compiled from: EngineWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public interface apical<T> {

    /* JADX INFO: compiled from: EngineWrapper.java */
    public static class attabal implements apical<Cipher> {
        @Override // affiche.apical
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Cipher attabal(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* JADX INFO: compiled from: EngineWrapper.java */
    public static class beachfront implements apical<MessageDigest> {
        @Override // affiche.apical
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public MessageDigest attabal(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* JADX INFO: compiled from: EngineWrapper.java */
    public static class competently implements apical<Signature> {
        @Override // affiche.apical
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Signature attabal(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    /* JADX INFO: compiled from: EngineWrapper.java */
    public static class dern implements apical<KeyFactory> {
        @Override // affiche.apical
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public KeyFactory attabal(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    /* JADX INFO: compiled from: EngineWrapper.java */
    public static class marial implements apical<Mac> {
        @Override // affiche.apical
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Mac attabal(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* JADX INFO: compiled from: EngineWrapper.java */
    public static class saneness implements apical<KeyAgreement> {
        @Override // affiche.apical
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public KeyAgreement attabal(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    /* JADX INFO: compiled from: EngineWrapper.java */
    public static class wireman implements apical<KeyPairGenerator> {
        @Override // affiche.apical
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public KeyPairGenerator attabal(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    T attabal(String str, Provider provider) throws GeneralSecurityException;
}
