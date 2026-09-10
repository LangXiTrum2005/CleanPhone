package kamptulicon;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import lehua.adultoid;
import lehua.arytenoidectomy;
import staphylococcal.cutely;
import vaporizer.apical;

/* JADX INFO: compiled from: DefaultScheduler.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern implements marial {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Logger f29088beachfront = Logger.getLogger(adultoid.class.getName());

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final retrocession.adultoid f29089attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final vaporizer.wireman f29090dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final cocoon.attabal f29091marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Executor f29092saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.wireman f29093wireman;

    @Inject
    public dern(Executor executor, vaporizer.wireman wiremanVar, retrocession.adultoid adultoidVar, com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar2, cocoon.attabal attabalVar) {
        this.f29092saneness = executor;
        this.f29090dern = wiremanVar;
        this.f29089attabal = adultoidVar;
        this.f29093wireman = wiremanVar2;
        this.f29091marial = attabalVar;
    }

    public static /* synthetic */ void dern(final dern dernVar, final arytenoidectomy arytenoidectomyVar, cutely cutelyVar, lehua.taiyuan taiyuanVar) {
        dernVar.getClass();
        try {
            apical apicalVar = dernVar.f29090dern.get(arytenoidectomyVar.saneness());
            if (apicalVar == null) {
                String str = String.format("Transport backend '%s' is not registered", arytenoidectomyVar.saneness());
                f29088beachfront.warning(str);
                cutelyVar.attabal(new IllegalArgumentException(str));
            } else {
                final lehua.taiyuan taiyuanVarSaneness = apicalVar.saneness(taiyuanVar);
                dernVar.f29091marial.saneness(new cocoon.attabal.InterfaceC0142attabal() { // from class: kamptulicon.saneness
                    @Override // cocoon.attabal.InterfaceC0142attabal
                    public final Object execute() {
                        return dern.saneness(this.f29094attabal, arytenoidectomyVar, taiyuanVarSaneness);
                    }
                });
                cutelyVar.attabal(null);
            }
        } catch (Exception e) {
            f29088beachfront.warning("Error scheduling event " + e.getMessage());
            cutelyVar.attabal(e);
        }
    }

    public static /* synthetic */ Object saneness(dern dernVar, arytenoidectomy arytenoidectomyVar, lehua.taiyuan taiyuanVar) {
        dernVar.f29093wireman.kowloon(arytenoidectomyVar, taiyuanVar);
        dernVar.f29089attabal.attabal(arytenoidectomyVar, 1);
        return null;
    }

    @Override // kamptulicon.marial
    public void attabal(final arytenoidectomy arytenoidectomyVar, final lehua.taiyuan taiyuanVar, final cutely cutelyVar) {
        this.f29092saneness.execute(new Runnable() { // from class: kamptulicon.attabal
            @Override // java.lang.Runnable
            public final void run() {
                dern.dern(this.f29084kowloon, arytenoidectomyVar, cutelyVar, taiyuanVar);
            }
        });
    }
}
