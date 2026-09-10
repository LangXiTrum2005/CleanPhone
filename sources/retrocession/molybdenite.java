package retrocession;

import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* JADX INFO: compiled from: WorkInitializer.java */
/* JADX INFO: loaded from: classes2.dex */
public class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Executor f36421attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final adultoid f36422dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.wireman f36423saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final cocoon.attabal f36424wireman;

    @Inject
    public molybdenite(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar, adultoid adultoidVar, cocoon.attabal attabalVar) {
        this.f36421attabal = executor;
        this.f36423saneness = wiremanVar;
        this.f36422dern = adultoidVar;
        this.f36424wireman = attabalVar;
    }

    public static /* synthetic */ Object attabal(molybdenite molybdeniteVar) {
        Iterator<lehua.arytenoidectomy> it = molybdeniteVar.f36423saneness.adultoid().iterator();
        while (it.hasNext()) {
            molybdeniteVar.f36422dern.attabal(it.next(), 1);
        }
        return null;
    }

    public void dern() {
        this.f36421attabal.execute(new Runnable() { // from class: retrocession.monoploid
            @Override // java.lang.Runnable
            public final void run() {
                molybdenite molybdeniteVar = this.f36425kowloon;
                molybdeniteVar.f36424wireman.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: retrocession.polloi
                    @Override // cocoon.attabal.InterfaceC0142attabal
                    public final Object execute() {
                        return molybdenite.attabal(molybdeniteVar);
                    }
                });
            }
        });
    }
}
