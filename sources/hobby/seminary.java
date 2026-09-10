package hobby;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: ProtoParametersSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class seminary implements privatdozent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ebullioscopic.attabal f27839attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final invest.stratoscope f27840saneness;

    public seminary(invest.stratoscope stratoscopeVar, ebullioscopic.attabal attabalVar) {
        this.f27840saneness = stratoscopeVar;
        this.f27839attabal = attabalVar;
    }

    public static seminary dern(invest.stratoscope stratoscopeVar) {
        return new seminary(stratoscopeVar, creditor.impromptu(stratoscopeVar.overspeculate()));
    }

    public static seminary saneness(invest.stratoscope stratoscopeVar) throws GeneralSecurityException {
        return new seminary(stratoscopeVar, creditor.saneness(stratoscopeVar.overspeculate()));
    }

    @Override // hobby.privatdozent
    public ebullioscopic.attabal attabal() {
        return this.f27839attabal;
    }

    public invest.stratoscope wireman() {
        return this.f27840saneness;
    }
}
