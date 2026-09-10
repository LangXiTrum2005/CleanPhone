package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.dern;
import iiion.beachfront;
import inblowing.graveside;
import ingathering.apical;
import ingathering.competently;
import ingathering.cutely;
import ingathering.formularize;
import ingathering.impassible;
import ingathering.taiyuan;
import ingathering.triweekly;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import polonize.impromptu;

/* JADX INFO: compiled from: FirebaseInstallations.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal implements competently {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final Object f22473impassible = new Object();

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final ThreadFactory f22474triweekly = new ThreadFactoryC0323attabal();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public Set<galactosemia.attabal> f22475apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f22476attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final formularize f22477beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Object f22478competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public String f22479cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final PersistedInstallation f22480dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final List<impassible> f22481formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ExecutorService f22482impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final graveside<monofuel.attabal> f22483marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f22484saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final Executor f22485taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final triweekly f22486wireman;

    /* JADX INFO: renamed from: com.google.firebase.installations.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FirebaseInstallations.java */
    public class ThreadFactoryC0323attabal implements ThreadFactory {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final AtomicInteger f22487kowloon = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f22487kowloon.getAndIncrement())));
        }
    }

    /* JADX INFO: compiled from: FirebaseInstallations.java */
    public static /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22488attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f22489saneness;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f22489saneness = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22489saneness[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22489saneness[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f22488attabal = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22488attabal[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public attabal(final beachfront beachfrontVar, friedmanite.saneness<impromptu> sanenessVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, beachfrontVar, new dern(beachfrontVar.apical(), sanenessVar), new PersistedInstallation(beachfrontVar), triweekly.dern(), new graveside(new friedmanite.saneness() { // from class: ingathering.dern
            @Override // friedmanite.saneness
            public final Object get() {
                return com.google.firebase.installations.attabal.marial(beachfrontVar);
            }
        }), new formularize());
    }

    public static attabal arytenoidectomy() {
        return monoploid(beachfront.impassible());
    }

    public static /* synthetic */ monofuel.attabal marial(beachfront beachfrontVar) {
        return new monofuel.attabal(beachfrontVar);
    }

    public static attabal monoploid(beachfront beachfrontVar) {
        Preconditions.checkArgument(beachfrontVar != null, "Null is not a valid value of FirebaseApp.");
        return (attabal) beachfrontVar.cutely(competently.class);
    }

    public final void adultoid(com.google.firebase.installations.local.saneness sanenessVar) {
        synchronized (f22473impassible) {
            try {
                ingathering.saneness sanenessVarAttabal = ingathering.saneness.attabal(this.f22476attabal.apical(), "generatefid.lock");
                try {
                    this.f22480dern.saneness(sanenessVar);
                    if (sanenessVarAttabal != null) {
                        sanenessVarAttabal.saneness();
                    }
                } catch (Throwable th) {
                    if (sanenessVarAttabal != null) {
                        sanenessVarAttabal.saneness();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.firebase.installations.local.saneness apical(com.google.firebase.installations.local.saneness sanenessVar) throws FirebaseInstallationsException {
        TokenResult tokenResultMarial = this.f22484saneness.marial(formularize(), sanenessVar.wireman(), graveside(), sanenessVar.beachfront());
        int i = saneness.f22489saneness[tokenResultMarial.saneness().ordinal()];
        if (i == 1) {
            return sanenessVar.kowloon(tokenResultMarial.dern(), tokenResultMarial.wireman(), this.f22486wireman.saneness());
        }
        if (i == 2) {
            return sanenessVar.monoploid("BAD CONFIG");
        }
        if (i != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        cuirassed(null);
        return sanenessVar.polloi();
    }

    @Override // ingathering.competently
    public Task<apical> attabal(final boolean z) {
        dovishness();
        Task<apical> taskBeachfront = beachfront();
        this.f22482impromptu.execute(new Runnable() { // from class: ingathering.marial
            @Override // java.lang.Runnable
            public final void run() {
                this.f28862kowloon.cutely(z);
            }
        });
        return taskBeachfront;
    }

    public final Task<apical> beachfront() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        impromptu(new taiyuan(this.f22486wireman, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task<String> competently() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        impromptu(new cutely(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final void cord(com.google.firebase.installations.local.saneness sanenessVar) {
        synchronized (this.f22478competently) {
            try {
                Iterator<impassible> it = this.f22481formularize.iterator();
                while (it.hasNext()) {
                    if (it.next().saneness(sanenessVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void cuirassed(String str) {
        this.f22479cutely = str;
    }

    public final void cutely(final boolean z) {
        com.google.firebase.installations.local.saneness sanenessVarMolybdenite = molybdenite();
        if (z) {
            sanenessVarMolybdenite = sanenessVarMolybdenite.arytenoidectomy();
        }
        cord(sanenessVarMolybdenite);
        this.f22485taiyuan.execute(new Runnable() { // from class: ingathering.beachfront
            @Override // java.lang.Runnable
            public final void run() {
                this.f28856kowloon.taiyuan(z);
            }
        });
    }

    public final void dovishness() {
        Preconditions.checkNotEmpty(impassible(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(graveside(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(formularize(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(triweekly.impromptu(impassible()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(triweekly.competently(formularize()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public String formularize() {
        return this.f22476attabal.kowloon().saneness();
    }

    @Override // ingathering.competently
    public Task<String> getId() {
        dovishness();
        String strTriweekly = triweekly();
        if (strTriweekly != null) {
            return Tasks.forResult(strTriweekly);
        }
        Task<String> taskCompetently = competently();
        this.f22482impromptu.execute(new Runnable() { // from class: ingathering.wireman
            @Override // java.lang.Runnable
            public final void run() {
                this.f28871kowloon.cutely(false);
            }
        });
        return taskCompetently;
    }

    public final String gintrap(com.google.firebase.installations.local.saneness sanenessVar) {
        if ((!this.f22476attabal.triweekly().equals("CHIME_ANDROID_SDK") && !this.f22476attabal.dovishness()) || !sanenessVar.impassible()) {
            return this.f22477beachfront.attabal();
        }
        String strBeachfront = kowloon().beachfront();
        return TextUtils.isEmpty(strBeachfront) ? this.f22477beachfront.attabal() : strBeachfront;
    }

    public String graveside() {
        return this.f22476attabal.kowloon().marial();
    }

    public String impassible() {
        return this.f22476attabal.kowloon().dern();
    }

    public final void impromptu(impassible impassibleVar) {
        synchronized (this.f22478competently) {
            this.f22481formularize.add(impassibleVar);
        }
    }

    public final monofuel.attabal kowloon() {
        return this.f22483marial.get();
    }

    public final com.google.firebase.installations.local.saneness molybdenite() {
        com.google.firebase.installations.local.saneness sanenessVarWireman;
        synchronized (f22473impassible) {
            try {
                ingathering.saneness sanenessVarAttabal = ingathering.saneness.attabal(this.f22476attabal.apical(), "generatefid.lock");
                try {
                    sanenessVarWireman = this.f22480dern.wireman();
                    if (sanenessVarWireman.cutely()) {
                        sanenessVarWireman = this.f22480dern.saneness(sanenessVarWireman.graveside(gintrap(sanenessVarWireman)));
                    }
                    if (sanenessVarAttabal != null) {
                        sanenessVarAttabal.saneness();
                    }
                } catch (Throwable th) {
                    if (sanenessVarAttabal != null) {
                        sanenessVarAttabal.saneness();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sanenessVarWireman;
    }

    public final com.google.firebase.installations.local.saneness polloi() {
        com.google.firebase.installations.local.saneness sanenessVarWireman;
        synchronized (f22473impassible) {
            try {
                ingathering.saneness sanenessVarAttabal = ingathering.saneness.attabal(this.f22476attabal.apical(), "generatefid.lock");
                try {
                    sanenessVarWireman = this.f22480dern.wireman();
                    if (sanenessVarAttabal != null) {
                        sanenessVarAttabal.saneness();
                    }
                } catch (Throwable th) {
                    if (sanenessVarAttabal != null) {
                        sanenessVarAttabal.saneness();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sanenessVarWireman;
    }

    public final void preprohormone(Exception exc) {
        synchronized (this.f22478competently) {
            try {
                Iterator<impassible> it = this.f22481formularize.iterator();
                while (it.hasNext()) {
                    if (it.next().attabal(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.firebase.installations.local.saneness rotuma(com.google.firebase.installations.local.saneness sanenessVar) throws FirebaseInstallationsException {
        InstallationResponse installationResponseWireman = this.f22484saneness.wireman(formularize(), sanenessVar.wireman(), graveside(), impassible(), (sanenessVar.wireman() == null || sanenessVar.wireman().length() != 11) ? null : kowloon().taiyuan());
        int i = saneness.f22488attabal[installationResponseWireman.marial().ordinal()];
        if (i == 1) {
            return sanenessVar.molybdenite(installationResponseWireman.dern(), installationResponseWireman.wireman(), this.f22486wireman.saneness(), installationResponseWireman.saneness().dern(), installationResponseWireman.saneness().wireman());
        }
        if (i == 2) {
            return sanenessVar.monoploid("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final synchronized void stratoscope(com.google.firebase.installations.local.saneness sanenessVar, com.google.firebase.installations.local.saneness sanenessVar2) {
        if (this.f22475apical.size() != 0 && !TextUtils.equals(sanenessVar.wireman(), sanenessVar2.wireman())) {
            Iterator<galactosemia.attabal> it = this.f22475apical.iterator();
            while (it.hasNext()) {
                it.next().attabal(sanenessVar2.wireman());
            }
        }
    }

    public final void taiyuan(boolean z) {
        com.google.firebase.installations.local.saneness sanenessVarRotuma;
        com.google.firebase.installations.local.saneness sanenessVarPolloi = polloi();
        try {
            if (sanenessVarPolloi.taiyuan() || sanenessVarPolloi.formularize()) {
                sanenessVarRotuma = rotuma(sanenessVarPolloi);
            } else {
                if (!z && !this.f22486wireman.beachfront(sanenessVarPolloi)) {
                    return;
                }
                sanenessVarRotuma = apical(sanenessVarPolloi);
            }
            adultoid(sanenessVarRotuma);
            stratoscope(sanenessVarPolloi, sanenessVarRotuma);
            if (sanenessVarRotuma.apical()) {
                cuirassed(sanenessVarRotuma.wireman());
            }
            if (sanenessVarRotuma.taiyuan()) {
                preprohormone(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
            } else if (sanenessVarRotuma.cutely()) {
                preprohormone(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                cord(sanenessVarRotuma);
            }
        } catch (FirebaseInstallationsException e) {
            preprohormone(e);
        }
    }

    public final synchronized String triweekly() {
        return this.f22479cutely;
    }

    public attabal(ExecutorService executorService, Executor executor, beachfront beachfrontVar, dern dernVar, PersistedInstallation persistedInstallation, triweekly triweeklyVar, graveside<monofuel.attabal> gravesideVar, formularize formularizeVar) {
        this.f22478competently = new Object();
        this.f22475apical = new HashSet();
        this.f22481formularize = new ArrayList();
        this.f22476attabal = beachfrontVar;
        this.f22484saneness = dernVar;
        this.f22480dern = persistedInstallation;
        this.f22486wireman = triweeklyVar;
        this.f22483marial = gravesideVar;
        this.f22477beachfront = formularizeVar;
        this.f22482impromptu = executorService;
        this.f22485taiyuan = executor;
    }
}
