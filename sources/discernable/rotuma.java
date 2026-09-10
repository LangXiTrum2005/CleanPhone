package discernable;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: SecretKeyAccess.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final rotuma f25319attabal = new rotuma();

    public static rotuma attabal() {
        return f25319attabal;
    }

    public static rotuma saneness(@Nullable rotuma rotumaVar) throws GeneralSecurityException {
        if (rotumaVar != null) {
            return rotumaVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
