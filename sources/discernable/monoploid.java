package discernable;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: KmsClients.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final CopyOnWriteArrayList<arytenoidectomy> f25318attabal = new CopyOnWriteArrayList<>();

    public static arytenoidectomy attabal(String str) throws GeneralSecurityException {
        for (arytenoidectomy arytenoidectomyVar : f25318attabal) {
            if (arytenoidectomyVar.attabal(str)) {
                return arytenoidectomyVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
