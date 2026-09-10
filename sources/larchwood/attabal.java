package larchwood;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesCmacPrfKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f32596attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f32597saneness;

    public attabal(saneness sanenessVar, ebullioscopic.dern dernVar) {
        this.f32596attabal = sanenessVar;
        this.f32597saneness = dernVar;
    }

    public static attabal dern(saneness sanenessVar, ebullioscopic.dern dernVar) throws GeneralSecurityException {
        if (sanenessVar.dern() == dernVar.dern()) {
            return new attabal(sanenessVar, dernVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return null;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public saneness saneness() {
        return this.f32596attabal;
    }

    public ebullioscopic.dern wireman() {
        return this.f32597saneness;
    }
}
