package neuropteran;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import saneness.retroflection;
import snarler.apical;
import snarler.arytenoidectomy;
import snarler.formularize;
import snarler.kowloon;

/* JADX INFO: compiled from: RemoteConfigComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan implements clue.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, marial> f33903attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final dynein.attabal f33904beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final friedmanite.saneness<anthomaniac.attabal> f33905competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ScheduledExecutorService f33906dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f33907impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final ingathering.competently f33908marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Context f33909saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public Map<String, String> f33910taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final iiion.beachfront f33911wireman;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Clock f33901cutely = DefaultClock.getInstance();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Random f33900apical = new Random();

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final Map<String, marial> f33902formularize = new HashMap();

    /* JADX INFO: compiled from: RemoteConfigComponent.java */
    public static class attabal implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final AtomicReference<attabal> f33912attabal = new AtomicReference<>();

        public static void saneness(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<attabal> atomicReference = f33912attabal;
            if (atomicReference.get() == null) {
                attabal attabalVar = new attabal();
                if (retroflection.attabal(atomicReference, null, attabalVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(attabalVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            taiyuan.monoploid(z);
        }
    }

    public taiyuan(Context context, ScheduledExecutorService scheduledExecutorService, iiion.beachfront beachfrontVar, ingathering.competently competentlyVar, dynein.attabal attabalVar, friedmanite.saneness<anthomaniac.attabal> sanenessVar) {
        this(context, scheduledExecutorService, beachfrontVar, competentlyVar, attabalVar, sanenessVar, true);
    }

    public static arytenoidectomy apical(iiion.beachfront beachfrontVar, String str, friedmanite.saneness<anthomaniac.attabal> sanenessVar) {
        if (arytenoidectomy(beachfrontVar) && str.equals("firebase")) {
            return new arytenoidectomy(sanenessVar);
        }
        return null;
    }

    public static boolean arytenoidectomy(iiion.beachfront beachfrontVar) {
        return beachfrontVar.triweekly().equals("[DEFAULT]");
    }

    public static boolean kowloon(iiion.beachfront beachfrontVar, String str) {
        return str.equals("firebase") && arytenoidectomy(beachfrontVar);
    }

    public static synchronized void monoploid(boolean z) {
        Iterator<marial> it = f33902formularize.values().iterator();
        while (it.hasNext()) {
            it.next().dern(z);
        }
    }

    public static /* synthetic */ anthomaniac.attabal saneness() {
        return null;
    }

    public static com.google.firebase.remoteconfig.internal.wireman triweekly(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.wireman(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    @Override // clue.attabal
    public void attabal(String str, buttstock.beachfront beachfrontVar) {
        marial(str).saneness().dern(beachfrontVar);
    }

    public final snarler.marial beachfront(String str, String str2) {
        return snarler.marial.competently(this.f33906dern, kowloon.saneness(this.f33909saneness, String.format("%s_%s_%s_%s.json", "frc", this.f33907impromptu, str, str2)));
    }

    public marial competently() {
        return marial("firebase");
    }

    public final apical cutely(snarler.marial marialVar, snarler.marial marialVar2) {
        return new apical(this.f33906dern, marialVar, marialVar2);
    }

    public synchronized formularize formularize(iiion.beachfront beachfrontVar, ingathering.competently competentlyVar, ConfigFetchHandler configFetchHandler, snarler.marial marialVar, Context context, String str, com.google.firebase.remoteconfig.internal.wireman wiremanVar) {
        return new formularize(beachfrontVar, competentlyVar, configFetchHandler, marialVar, context, str, wiremanVar, this.f33906dern);
    }

    public final haemocyte.wireman impassible(snarler.marial marialVar, snarler.marial marialVar2) {
        return new haemocyte.wireman(marialVar, haemocyte.attabal.attabal(marialVar, marialVar2), this.f33906dern);
    }

    public synchronized ConfigFetchHandler impromptu(String str, snarler.marial marialVar, com.google.firebase.remoteconfig.internal.wireman wiremanVar) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new ConfigFetchHandler(this.f33908marial, arytenoidectomy(this.f33911wireman) ? this.f33905competently : new friedmanite.saneness() { // from class: neuropteran.impromptu
            @Override // friedmanite.saneness
            public final Object get() {
                return taiyuan.saneness();
            }
        }, this.f33906dern, f33901cutely, f33900apical, marialVar, taiyuan(this.f33911wireman.kowloon().saneness(), str, wiremanVar), wiremanVar, this.f33910taiyuan);
    }

    public synchronized marial marial(String str) throws Throwable {
        Throwable th;
        try {
            try {
                snarler.marial marialVarBeachfront = beachfront(str, "fetch");
                snarler.marial marialVarBeachfront2 = beachfront(str, "activate");
                snarler.marial marialVarBeachfront3 = beachfront(str, "defaults");
                com.google.firebase.remoteconfig.internal.wireman wiremanVarTriweekly = triweekly(this.f33909saneness, this.f33907impromptu, str);
                apical apicalVarCutely = cutely(marialVarBeachfront2, marialVarBeachfront3);
                final arytenoidectomy arytenoidectomyVarApical = apical(this.f33911wireman, str, this.f33905competently);
                if (arytenoidectomyVarApical != null) {
                    try {
                        apicalVarCutely.attabal(new BiConsumer() { // from class: neuropteran.competently
                            @Override // com.google.android.gms.common.util.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                arytenoidectomyVarApical.attabal((String) obj, (com.google.firebase.remoteconfig.internal.saneness) obj2);
                            }
                        });
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return wireman(this.f33911wireman, str, this.f33908marial, this.f33904beachfront, this.f33906dern, marialVarBeachfront, marialVarBeachfront2, marialVarBeachfront3, impromptu(str, marialVarBeachfront, wiremanVarTriweekly), apicalVarCutely, wiremanVarTriweekly, impassible(marialVarBeachfront2, marialVarBeachfront3));
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public ConfigFetchHttpClient taiyuan(String str, String str2, com.google.firebase.remoteconfig.internal.wireman wiremanVar) {
        return new ConfigFetchHttpClient(this.f33909saneness, this.f33911wireman.kowloon().dern(), str, str2, wiremanVar.dern(), wiremanVar.dern());
    }

    public synchronized marial wireman(iiion.beachfront beachfrontVar, String str, ingathering.competently competentlyVar, dynein.attabal attabalVar, Executor executor, snarler.marial marialVar, snarler.marial marialVar2, snarler.marial marialVar3, ConfigFetchHandler configFetchHandler, apical apicalVar, com.google.firebase.remoteconfig.internal.wireman wiremanVar, haemocyte.wireman wiremanVar2) throws Throwable {
        taiyuan taiyuanVar;
        String str2;
        try {
            try {
                if (this.f33903attabal.containsKey(str)) {
                    taiyuanVar = this;
                    str2 = str;
                } else {
                    taiyuanVar = this;
                    str2 = str;
                    marial marialVar4 = new marial(this.f33909saneness, beachfrontVar, competentlyVar, kowloon(beachfrontVar, str) ? attabalVar : null, executor, marialVar, marialVar2, marialVar3, configFetchHandler, apicalVar, wiremanVar, formularize(beachfrontVar, competentlyVar, configFetchHandler, marialVar2, this.f33909saneness, str, wiremanVar), wiremanVar2);
                    marialVar4.wireman();
                    taiyuanVar.f33903attabal.put(str2, marialVar4);
                    f33902formularize.put(str2, marialVar4);
                }
                return taiyuanVar.f33903attabal.get(str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public taiyuan(Context context, ScheduledExecutorService scheduledExecutorService, iiion.beachfront beachfrontVar, ingathering.competently competentlyVar, dynein.attabal attabalVar, friedmanite.saneness<anthomaniac.attabal> sanenessVar, boolean z) {
        this.f33903attabal = new HashMap();
        this.f33910taiyuan = new HashMap();
        this.f33909saneness = context;
        this.f33906dern = scheduledExecutorService;
        this.f33911wireman = beachfrontVar;
        this.f33908marial = competentlyVar;
        this.f33904beachfront = attabalVar;
        this.f33905competently = sanenessVar;
        this.f33907impromptu = beachfrontVar.kowloon().dern();
        attabal.saneness(context);
        if (z) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: neuropteran.beachfront
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f33883kowloon.competently();
                }
            });
        }
    }
}
