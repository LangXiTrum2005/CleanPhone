package overassessment;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.apical;
import androidx.work.impassible;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.kowloon;
import androidx.work.molybdenite;
import androidx.work.polloi;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: WorkManagerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan extends polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Context f34905attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public wireman f34906beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public talweg.marial f34907competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public WorkDatabase f34908dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f34909impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public List<marial> f34910marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public androidx.work.attabal f34911saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f34912taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public arugula.attabal f34913wireman;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final String f34902cutely = apical.beachfront("WorkManagerImpl");

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static taiyuan f34901apical = null;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static taiyuan f34903formularize = null;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final Object f34904impassible = new Object();

    public taiyuan(Context context, androidx.work.attabal attabalVar, arugula.attabal attabalVar2) {
        this(context, attabalVar, attabalVar2, context.getResources().getBoolean(kowloon.workmanager_test_configuration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static taiyuan apical(Context context) {
        taiyuan taiyuanVarCutely;
        synchronized (f34904impassible) {
            try {
                taiyuanVarCutely = cutely();
                if (taiyuanVarCutely == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof androidx.work.attabal.dern)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    marial(applicationContext, ((androidx.work.attabal.dern) applicationContext).attabal());
                    taiyuanVarCutely = apical(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return taiyuanVarCutely;
    }

    @Deprecated
    public static taiyuan cutely() {
        synchronized (f34904impassible) {
            try {
                taiyuan taiyuanVar = f34901apical;
                if (taiyuanVar != null) {
                    return taiyuanVar;
                }
                return f34903formularize;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void marial(Context context, androidx.work.attabal attabalVar) {
        synchronized (f34904impassible) {
            try {
                taiyuan taiyuanVar = f34901apical;
                if (taiyuanVar != null && f34903formularize != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (taiyuanVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f34903formularize == null) {
                        f34903formularize = new taiyuan(applicationContext, attabalVar, new arugula.saneness(attabalVar.formularize()));
                    }
                    f34901apical = f34903formularize;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void adultoid(String str) {
        dovishness(str, null);
    }

    public arugula.attabal arytenoidectomy() {
        return this.f34913wireman;
    }

    @Override // androidx.work.polloi
    public impassible attabal(String str) {
        talweg.attabal attabalVarWireman = talweg.attabal.wireman(str, this);
        this.f34913wireman.saneness(attabalVarWireman);
        return attabalVarWireman.marial();
    }

    public impassible beachfront(UUID uuid) {
        talweg.attabal attabalVarSaneness = talweg.attabal.saneness(uuid, this);
        this.f34913wireman.saneness(attabalVarSaneness);
        return attabalVarSaneness.marial();
    }

    public List<marial> competently(Context context, androidx.work.attabal attabalVar, arugula.attabal attabalVar2) {
        return Arrays.asList(beachfront.attabal(context, this), new ayutthaya.saneness(context, attabalVar, attabalVar2, this));
    }

    @Override // androidx.work.polloi
    public impassible dern(List<? extends molybdenite> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new competently(this, list).attabal();
    }

    public void dovishness(String str, WorkerParameters.attabal attabalVar) {
        this.f34913wireman.saneness(new talweg.taiyuan(this, str, attabalVar));
    }

    public talweg.marial formularize() {
        return this.f34907competently;
    }

    public void gintrap(String str) {
        this.f34913wireman.saneness(new talweg.cutely(this, str, true));
    }

    public void graveside(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f34904impassible) {
            try {
                this.f34912taiyuan = pendingResult;
                if (this.f34909impromptu) {
                    pendingResult.finish();
                    this.f34912taiyuan = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public wireman impassible() {
        return this.f34906beachfront;
    }

    public Context impromptu() {
        return this.f34905attabal;
    }

    public WorkDatabase kowloon() {
        return this.f34908dern;
    }

    public void molybdenite() {
        transitional.competently.saneness(impromptu());
        kowloon().stratoscope().apical();
        beachfront.saneness(taiyuan(), kowloon(), triweekly());
    }

    public final void monoploid(Context context, androidx.work.attabal attabalVar, arugula.attabal attabalVar2, WorkDatabase workDatabase, List<marial> list, wireman wiremanVar) {
        Context applicationContext = context.getApplicationContext();
        this.f34905attabal = applicationContext;
        this.f34911saneness = attabalVar;
        this.f34913wireman = attabalVar2;
        this.f34908dern = workDatabase;
        this.f34910marial = list;
        this.f34906beachfront = wiremanVar;
        this.f34907competently = new talweg.marial(workDatabase);
        this.f34909impromptu = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f34913wireman.saneness(new ForceStopRunnable(applicationContext, this));
    }

    public void polloi() {
        synchronized (f34904impassible) {
            try {
                this.f34909impromptu = true;
                BroadcastReceiver.PendingResult pendingResult = this.f34912taiyuan;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f34912taiyuan = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void rotuma(String str) {
        this.f34913wireman.saneness(new talweg.cutely(this, str, false));
    }

    public androidx.work.attabal taiyuan() {
        return this.f34911saneness;
    }

    public List<marial> triweekly() {
        return this.f34910marial;
    }

    public taiyuan(Context context, androidx.work.attabal attabalVar, arugula.attabal attabalVar2, boolean z) {
        this(context, attabalVar, attabalVar2, WorkDatabase.molybdenite(context.getApplicationContext(), attabalVar2.getBackgroundExecutor(), z));
    }

    public taiyuan(Context context, androidx.work.attabal attabalVar, arugula.attabal attabalVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        apical.marial(new apical.attabal(attabalVar.cutely()));
        List<marial> listCompetently = competently(applicationContext, attabalVar, attabalVar2);
        monoploid(context, attabalVar, attabalVar2, workDatabase, listCompetently, new wireman(context, attabalVar, attabalVar2, workDatabase, listCompetently));
    }
}
