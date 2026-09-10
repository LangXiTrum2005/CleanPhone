package lai;

import affiche.cutely;
import cloop.monoploid;
import curiousness.dovishness;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: AesGcmSiv.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f32573attabal = new attabal();

    /* JADX INFO: compiled from: AesGcmSiv.java */
    public class attabal extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        @Nullable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher cipherAttabal = cutely.f3861saneness.attabal("AES/GCM-SIV/NoPadding");
                if (monoploid.marial(cipherAttabal)) {
                    return cipherAttabal;
                }
                return null;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static Cipher dern() throws GeneralSecurityException {
        try {
            Cipher cipher = f32573attabal.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    public static discernable.attabal wireman(dovishness dovishnessVar) throws GeneralSecurityException {
        return monoploid.saneness(dovishnessVar, new monoploid.attabal() { // from class: lai.attabal
            @Override // cloop.monoploid.attabal
            public final Object get() {
                return saneness.dern();
            }
        });
    }
}
