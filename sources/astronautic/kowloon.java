package astronautic;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Ed25519PublicKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kowloon extends treadless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final taiyuan f14613attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f14614dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.attabal f14615saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f14616wireman;

    public kowloon(taiyuan taiyuanVar, ebullioscopic.attabal attabalVar, ebullioscopic.attabal attabalVar2, @Nullable Integer num) {
        this.f14613attabal = taiyuanVar;
        this.f14615saneness = attabalVar;
        this.f14614dern = attabalVar2;
        this.f14616wireman = num;
    }

    public static ebullioscopic.attabal marial(taiyuan taiyuanVar, @Nullable Integer num) {
        if (taiyuanVar.dern() == taiyuan.attabal.f14728wireman) {
            return hobby.trm.f27847attabal;
        }
        if (taiyuanVar.dern() == taiyuan.attabal.f14727saneness || taiyuanVar.dern() == taiyuan.attabal.f14726dern) {
            return hobby.trm.attabal(num.intValue());
        }
        if (taiyuanVar.dern() == taiyuan.attabal.f14725attabal) {
            return hobby.trm.saneness(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + taiyuanVar.dern());
    }

    public static kowloon wireman(taiyuan.attabal attabalVar, ebullioscopic.attabal attabalVar2, @Nullable Integer num) throws GeneralSecurityException {
        taiyuan taiyuanVarSaneness = taiyuan.saneness(attabalVar);
        taiyuan.attabal attabalVar3 = taiyuan.attabal.f14728wireman;
        if (!attabalVar.equals(attabalVar3) && num == null) {
            throw new GeneralSecurityException("For given Variant " + attabalVar + " the value of idRequirement must be non-null");
        }
        if (attabalVar.equals(attabalVar3) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (attabalVar2.dern() == 32) {
            return new kowloon(taiyuanVarSaneness, attabalVar2, marial(taiyuanVarSaneness, num), num);
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + attabalVar2.dern());
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f14616wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public taiyuan saneness() {
        return this.f14613attabal;
    }

    public ebullioscopic.attabal competently() {
        return this.f14615saneness;
    }

    @Override // astronautic.treadless
    public ebullioscopic.attabal dern() {
        return this.f14614dern;
    }
}
