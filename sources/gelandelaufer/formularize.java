package gelandelaufer;

import rollout.kowloon;

/* JADX INFO: compiled from: RemoteConfigDeferredProxy.java */
/* JADX INFO: loaded from: classes3.dex */
public class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final friedmanite.attabal<clue.attabal> f26656attabal;

    public formularize(friedmanite.attabal<clue.attabal> attabalVar) {
        this.f26656attabal = attabalVar;
    }

    public static /* synthetic */ void attabal(marial marialVar, friedmanite.saneness sanenessVar) {
        ((clue.attabal) sanenessVar.get()).attabal("firebase", marialVar);
        competently.beachfront().saneness("Registering RemoteConfig Rollouts subscriber");
    }

    public void saneness(kowloon kowloonVar) {
        if (kowloonVar == null) {
            competently.beachfront().apical("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final marial marialVar = new marial(kowloonVar);
            this.f26656attabal.attabal(new friedmanite.attabal.InterfaceC0614attabal() { // from class: gelandelaufer.apical
                @Override // friedmanite.attabal.InterfaceC0614attabal
                public final void attabal(friedmanite.saneness sanenessVar) {
                    formularize.attabal(marialVar, sanenessVar);
                }
            });
        }
    }
}
