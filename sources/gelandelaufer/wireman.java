package gelandelaufer;

import amount.kattegat;
import amount.sealless;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman implements gelandelaufer.attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final impromptu f26659dern = new saneness();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final friedmanite.attabal<gelandelaufer.attabal> f26660attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AtomicReference<gelandelaufer.attabal> f26661saneness = new AtomicReference<>(null);

    /* JADX INFO: compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    public static final class saneness implements impromptu {
        public saneness() {
        }

        @Override // gelandelaufer.impromptu
        public File attabal() {
            return null;
        }

        @Override // gelandelaufer.impromptu
        public File beachfront() {
            return null;
        }

        @Override // gelandelaufer.impromptu
        public File competently() {
            return null;
        }

        @Override // gelandelaufer.impromptu
        public File dern() {
            return null;
        }

        @Override // gelandelaufer.impromptu
        public File marial() {
            return null;
        }

        @Override // gelandelaufer.impromptu
        public sealless.attabal saneness() {
            return null;
        }

        @Override // gelandelaufer.impromptu
        public File wireman() {
            return null;
        }
    }

    public wireman(friedmanite.attabal<gelandelaufer.attabal> attabalVar) {
        this.f26660attabal = attabalVar;
        attabalVar.attabal(new friedmanite.attabal.InterfaceC0614attabal() { // from class: gelandelaufer.saneness
            @Override // friedmanite.attabal.InterfaceC0614attabal
            public final void attabal(friedmanite.saneness sanenessVar) {
                wireman.beachfront(this.f26658attabal, sanenessVar);
            }
        });
    }

    public static /* synthetic */ void beachfront(wireman wiremanVar, friedmanite.saneness sanenessVar) {
        wiremanVar.getClass();
        competently.beachfront().saneness("Crashlytics native component now available.");
        wiremanVar.f26661saneness.set((gelandelaufer.attabal) sanenessVar.get());
    }

    @Override // gelandelaufer.attabal
    public impromptu attabal(String str) {
        gelandelaufer.attabal attabalVar = this.f26661saneness.get();
        return attabalVar == null ? f26659dern : attabalVar.attabal(str);
    }

    @Override // gelandelaufer.attabal
    public boolean dern(String str) {
        gelandelaufer.attabal attabalVar = this.f26661saneness.get();
        return attabalVar != null && attabalVar.dern(str);
    }

    @Override // gelandelaufer.attabal
    public boolean saneness() {
        gelandelaufer.attabal attabalVar = this.f26661saneness.get();
        return attabalVar != null && attabalVar.saneness();
    }

    @Override // gelandelaufer.attabal
    public void wireman(final String str, final String str2, final long j, final kattegat kattegatVar) {
        competently.beachfront().taiyuan("Deferring native open session: " + str);
        this.f26660attabal.attabal(new friedmanite.attabal.InterfaceC0614attabal() { // from class: gelandelaufer.dern
            @Override // friedmanite.attabal.InterfaceC0614attabal
            public final void attabal(friedmanite.saneness sanenessVar) {
                ((attabal) sanenessVar.get()).wireman(str, str2, j, kattegatVar);
            }
        });
    }
}
