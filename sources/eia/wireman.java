package eia;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: AnalyticsDeferredProxy.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final friedmanite.attabal<anthomaniac.attabal> f25597attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile evenfall.saneness f25598dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile arcticology.attabal f25599saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<evenfall.attabal> f25600wireman;

    public wireman(friedmanite.attabal<anthomaniac.attabal> attabalVar) {
        this(attabalVar, new evenfall.dern(), new arcticology.beachfront());
    }

    public static /* synthetic */ void attabal(wireman wiremanVar, friedmanite.saneness sanenessVar) {
        wiremanVar.getClass();
        gelandelaufer.competently.beachfront().saneness("AnalyticsConnector now available.");
        anthomaniac.attabal attabalVar = (anthomaniac.attabal) sanenessVar.get();
        arcticology.marial marialVar = new arcticology.marial(attabalVar);
        marial marialVar2 = new marial();
        if (competently(attabalVar, marialVar2) == null) {
            gelandelaufer.competently.beachfront().apical("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        gelandelaufer.competently.beachfront().saneness("Registered Firebase Analytics listener.");
        arcticology.wireman wiremanVar2 = new arcticology.wireman();
        arcticology.dern dernVar = new arcticology.dern(marialVar, 500, TimeUnit.MILLISECONDS);
        synchronized (wiremanVar) {
            try {
                Iterator<evenfall.attabal> it = wiremanVar.f25600wireman.iterator();
                while (it.hasNext()) {
                    wiremanVar2.attabal(it.next());
                }
                marialVar2.wireman(wiremanVar2);
                marialVar2.marial(dernVar);
                wiremanVar.f25598dern = wiremanVar2;
                wiremanVar.f25599saneness = dernVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static anthomaniac.attabal.InterfaceC0114attabal competently(anthomaniac.attabal attabalVar, marial marialVar) {
        anthomaniac.attabal.InterfaceC0114attabal interfaceC0114attabalWireman = attabalVar.wireman("clx", marialVar);
        if (interfaceC0114attabalWireman != null) {
            return interfaceC0114attabalWireman;
        }
        gelandelaufer.competently.beachfront().saneness("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        anthomaniac.attabal.InterfaceC0114attabal interfaceC0114attabalWireman2 = attabalVar.wireman(AppMeasurement.CRASH_ORIGIN, marialVar);
        if (interfaceC0114attabalWireman2 != null) {
            gelandelaufer.competently.beachfront().apical("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC0114attabalWireman2;
    }

    public static /* synthetic */ void dern(wireman wiremanVar, evenfall.attabal attabalVar) {
        synchronized (wiremanVar) {
            try {
                if (wiremanVar.f25598dern instanceof evenfall.dern) {
                    wiremanVar.f25600wireman.add(attabalVar);
                }
                wiremanVar.f25598dern.attabal(attabalVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void beachfront() {
        this.f25597attabal.attabal(new friedmanite.attabal.InterfaceC0614attabal() { // from class: eia.dern
            @Override // friedmanite.attabal.InterfaceC0614attabal
            public final void attabal(friedmanite.saneness sanenessVar) {
                wireman.attabal(this.f25592attabal, sanenessVar);
            }
        });
    }

    public evenfall.saneness marial() {
        return new evenfall.saneness() { // from class: eia.attabal
            @Override // evenfall.saneness
            public final void attabal(evenfall.attabal attabalVar) {
                wireman.dern(this.f25590attabal, attabalVar);
            }
        };
    }

    public arcticology.attabal wireman() {
        return new arcticology.attabal() { // from class: eia.saneness
            @Override // arcticology.attabal
            public final void attabal(String str, Bundle bundle) {
                this.f25596attabal.f25599saneness.attabal(str, bundle);
            }
        };
    }

    public wireman(friedmanite.attabal<anthomaniac.attabal> attabalVar, evenfall.saneness sanenessVar, arcticology.attabal attabalVar2) {
        this.f25597attabal = attabalVar;
        this.f25598dern = sanenessVar;
        this.f25600wireman = new ArrayList();
        this.f25599saneness = attabalVar2;
        beachfront();
    }
}
