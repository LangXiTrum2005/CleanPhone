package umbriferous;

import com.google.firebase.sessions.api.SessionSubscriber;

/* JADX INFO: compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* JADX INFO: loaded from: classes3.dex */
public class formularize implements SessionSubscriber {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trm f39096attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final apical f39097saneness;

    public formularize(trm trmVar, spissatus.competently competentlyVar) {
        this.f39096attabal = trmVar;
        this.f39097saneness = new apical(competentlyVar);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean attabal() {
        return this.f39096attabal.wireman();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void dern(SessionSubscriber.SessionDetails sessionDetails) {
        gelandelaufer.competently.beachfront().saneness("App Quality Sessions session changed: " + sessionDetails);
        this.f39097saneness.beachfront(sessionDetails.getSessionId());
    }

    public void marial(String str) {
        this.f39097saneness.competently(str);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public SessionSubscriber.Name saneness() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    public String wireman(String str) {
        return this.f39097saneness.dern(str);
    }
}
