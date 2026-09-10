package agent;

import android.os.Handler;
import android.os.HandlerThread;
import com.blankj.utilcode.util.NetworkUtils;
import com.ironsource.Ua;

/* JADX INFO: compiled from: CommonTask.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static volatile boolean f3932competently = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final HandlerThread f3935dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Handler f3938wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f3933attabal = revolt.attabal.f36720attabal.wireman() + "/prod/api/first_open/af_install_info";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f3937saneness = 5000;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public long f3936marial = 0;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Runnable f3934beachfront = new attabal();

    /* JADX INFO: compiled from: CommonTask.java */
    public class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!NetworkUtils.dern()) {
                wireman.this.f3938wireman.postDelayed(this, 5000L);
                return;
            }
            kaoline.wireman wiremanVar = (kaoline.wireman) babyless.beachfront.beachfront("file_key_install_info_cipher_copy", null, kaoline.wireman.class);
            if (wiremanVar != null) {
                if (babyless.beachfront.marial(babyless.dern.f14823saneness, false)) {
                    wireman.this.formularize();
                    return;
                } else {
                    wireman.this.competently(wiremanVar);
                    return;
                }
            }
            if (babyless.beachfront.competently("sp_key_home_request_info_count", 0) < 30) {
                wireman.this.impromptu();
                return;
            }
            gerenuk.saneness.sealless();
            kaoline.wireman wiremanVarArytenoidectomy = gerenuk.saneness.arytenoidectomy();
            if (wiremanVarArytenoidectomy != null) {
                wireman.this.competently(wiremanVarArytenoidectomy);
            } else {
                wireman.this.f3938wireman.postDelayed(wireman.this.f3934beachfront, 5000L);
            }
        }
    }

    /* JADX INFO: compiled from: CommonTask.java */
    public class saneness implements agent.saneness.attabal {
        public saneness() {
        }

        @Override // agent.saneness.attabal
        public void attabal(boolean z) {
            if (z) {
                wireman.this.formularize();
            } else {
                wireman.this.f3938wireman.post(wireman.this.f3934beachfront);
            }
        }
    }

    public wireman() {
        HandlerThread handlerThread = new HandlerThread("common-task");
        this.f3935dern = handlerThread;
        handlerThread.start();
        this.f3938wireman = new Handler(handlerThread.getLooper());
    }

    public static void apical() {
        f3932competently = false;
    }

    public static /* synthetic */ void attabal(wireman wiremanVar, pancuronium.saneness sanenessVar) {
        wiremanVar.getClass();
        if (!sanenessVar.wireman() || sanenessVar.dern() == null) {
            if ((System.currentTimeMillis() - wiremanVar.f3936marial) / 1000 > 3) {
                wiremanVar.f3938wireman.post(wiremanVar.f3934beachfront);
                return;
            } else {
                wiremanVar.f3938wireman.postDelayed(wiremanVar.f3934beachfront, Ua.C);
                return;
            }
        }
        gerenuk.saneness.yemenite(((kaoline.beachfront) sanenessVar.dern()).attabal());
        kaoline.wireman wiremanVarArytenoidectomy = gerenuk.saneness.arytenoidectomy();
        if (wiremanVarArytenoidectomy != null) {
            wiremanVar.competently(wiremanVarArytenoidectomy);
        } else {
            wiremanVar.f3938wireman.postDelayed(wiremanVar.f3934beachfront, 5000L);
        }
    }

    public static void taiyuan() {
        kaoline.wireman wiremanVar = (kaoline.wireman) babyless.beachfront.beachfront("file_key_install_info_cipher_copy", null, kaoline.wireman.class);
        int iCompetently = babyless.beachfront.competently("sp_key_home_request_info_count", 0);
        if (wiremanVar == null && iCompetently >= 30) {
            gerenuk.saneness.sealless();
        }
        boolean zMarial = babyless.beachfront.marial(babyless.dern.f14823saneness, false);
        if ((wiremanVar == null || !zMarial) && !f3932competently) {
            f3932competently = true;
            new wireman().cutely();
        }
    }

    public final void competently(kaoline.wireman wiremanVar) {
        kaoline.marial marialVar = new kaoline.marial();
        marialVar.f29111oilcan = wiremanVar.beachfront();
        marialVar.f29110kattegat = wiremanVar.competently();
        marialVar.f29113supplicat = wiremanVar.marial();
        marialVar.f29114yemenite = wiremanVar.saneness();
        marialVar.f29112sealless = wiremanVar.dern();
        marialVar.saneness(wiremanVar.wireman());
        marialVar.triweekly(wiremanVar.impromptu());
        marialVar.trm(wiremanVar.molybdenite());
        marialVar.adultoid(wiremanVar.cutely());
        marialVar.dovishness(wiremanVar.apical());
        marialVar.cuirassed(wiremanVar.monoploid());
        marialVar.stratoscope(wiremanVar.polloi());
        marialVar.gintrap(wiremanVar.formularize());
        marialVar.rotuma(wiremanVar.impassible());
        marialVar.preprohormone(wiremanVar.triweekly());
        marialVar.cord(wiremanVar.kowloon());
        marialVar.marial(wiremanVar.attabal());
        agent.saneness.wireman(marialVar, new saneness());
    }

    public final void cutely() {
        this.f3938wireman.postDelayed(this.f3934beachfront, 5000L);
    }

    public final void formularize() {
        this.f3938wireman.removeCallbacks(this.f3934beachfront);
        this.f3938wireman.removeCallbacksAndMessages(null);
        this.f3935dern.quitSafely();
        apical();
    }

    public final void impromptu() {
        String strTriweekly = gerenuk.saneness.triweekly();
        String strImpassible = gerenuk.saneness.impassible();
        kaoline.attabal attabalVar = new kaoline.attabal();
        attabalVar.yemenite(strTriweekly);
        attabalVar.oilcan(strImpassible);
        attabalVar.trm("idle");
        int iCompetently = babyless.beachfront.competently("sp_key_home_request_info_count", 0);
        if (iCompetently >= 30) {
            this.f3938wireman.post(this.f3934beachfront);
            return;
        }
        babyless.beachfront.apical("sp_key_home_request_info_count", Integer.valueOf(iCompetently + 1));
        this.f3936marial = System.currentTimeMillis();
        panocha.wireman.marial().impromptu(this.f3933attabal, attabalVar, kaoline.beachfront.class, new pancuronium.attabal() { // from class: agent.dern
            @Override // pancuronium.attabal
            public final void attabal(pancuronium.saneness sanenessVar) {
                wireman.attabal(this.f3930attabal, sanenessVar);
            }
        });
    }
}
