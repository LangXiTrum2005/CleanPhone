package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.apical;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import overassessment.taiyuan;
import talweg.impromptu;
import talweg.kowloon;

/* JADX INFO: compiled from: SystemAlarmDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman implements overassessment.saneness {

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final String f14101preprohormone = apical.beachfront("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final Handler f14102adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final arugula.attabal f14103arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final List<Intent> f14104dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public Intent f14105gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.attabal f14106graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f14107kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final taiyuan f14108molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final kowloon f14109monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final overassessment.wireman f14110polloi;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public dern f14111rotuma;

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wireman wiremanVar;
            RunnableC0112wireman runnableC0112wireman;
            synchronized (wireman.this.f14104dovishness) {
                wireman wiremanVar2 = wireman.this;
                wiremanVar2.f14105gintrap = wiremanVar2.f14104dovishness.get(0);
            }
            Intent intent = wireman.this.f14105gintrap;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = wireman.this.f14105gintrap.getIntExtra("KEY_START_ID", 0);
                apical apicalVarDern = apical.dern();
                String str = wireman.f14101preprohormone;
                apicalVarDern.attabal(str, String.format("Processing command %s, %s", wireman.this.f14105gintrap, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockSaneness = talweg.apical.saneness(wireman.this.f14107kowloon, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    apical.dern().attabal(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockSaneness), new Throwable[0]);
                    wakeLockSaneness.acquire();
                    wireman wiremanVar3 = wireman.this;
                    wiremanVar3.f14106graveside.kowloon(wiremanVar3.f14105gintrap, intExtra, wiremanVar3);
                    apical.dern().attabal(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockSaneness), new Throwable[0]);
                    wakeLockSaneness.release();
                    wiremanVar = wireman.this;
                    runnableC0112wireman = new RunnableC0112wireman(wiremanVar);
                } catch (Throwable th) {
                    try {
                        apical apicalVarDern2 = apical.dern();
                        String str2 = wireman.f14101preprohormone;
                        apicalVarDern2.saneness(str2, "Unexpected error in onHandleIntent", th);
                        apical.dern().attabal(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockSaneness), new Throwable[0]);
                        wakeLockSaneness.release();
                        wiremanVar = wireman.this;
                        runnableC0112wireman = new RunnableC0112wireman(wiremanVar);
                    } catch (Throwable th2) {
                        apical.dern().attabal(wireman.f14101preprohormone, String.format("Releasing operation wake lock (%s) %s", action, wakeLockSaneness), new Throwable[0]);
                        wakeLockSaneness.release();
                        wireman wiremanVar4 = wireman.this;
                        wiremanVar4.apical(new RunnableC0112wireman(wiremanVar4));
                        throw th2;
                    }
                }
                wiremanVar.apical(runnableC0112wireman);
            }
        }
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public interface dern {
        void saneness();
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public static class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Intent f14113arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final wireman f14114kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final int f14115monoploid;

        public saneness(wireman wiremanVar, Intent intent, int i) {
            this.f14114kowloon = wiremanVar;
            this.f14113arytenoidectomy = intent;
            this.f14115monoploid = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14114kowloon.attabal(this.f14113arytenoidectomy, this.f14115monoploid);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public static class RunnableC0112wireman implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final wireman f14116kowloon;

        public RunnableC0112wireman(wireman wiremanVar) {
            this.f14116kowloon = wiremanVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14116kowloon.dern();
        }
    }

    public wireman(Context context) {
        this(context, null, null);
    }

    public void apical(Runnable runnable) {
        this.f14102adultoid.post(runnable);
    }

    public boolean attabal(Intent intent, int i) {
        apical apicalVarDern = apical.dern();
        String str = f14101preprohormone;
        apicalVarDern.attabal(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        saneness();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            apical.dern().impromptu(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && taiyuan("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f14104dovishness) {
            try {
                boolean zIsEmpty = this.f14104dovishness.isEmpty();
                this.f14104dovishness.add(intent);
                if (zIsEmpty) {
                    formularize();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public arugula.attabal beachfront() {
        return this.f14103arytenoidectomy;
    }

    public taiyuan competently() {
        return this.f14108molybdenite;
    }

    public void cutely() {
        apical.dern().attabal(f14101preprohormone, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f14110polloi.taiyuan(this);
        this.f14109monoploid.attabal();
        this.f14111rotuma = null;
    }

    public void dern() {
        apical apicalVarDern = apical.dern();
        String str = f14101preprohormone;
        apicalVarDern.attabal(str, "Checking if commands are complete.", new Throwable[0]);
        saneness();
        synchronized (this.f14104dovishness) {
            try {
                if (this.f14105gintrap != null) {
                    apical.dern().attabal(str, String.format("Removing command %s", this.f14105gintrap), new Throwable[0]);
                    if (!this.f14104dovishness.remove(0).equals(this.f14105gintrap)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f14105gintrap = null;
                }
                impromptu backgroundExecutor = this.f14103arytenoidectomy.getBackgroundExecutor();
                if (!this.f14106graveside.triweekly() && this.f14104dovishness.isEmpty() && !backgroundExecutor.attabal()) {
                    apical.dern().attabal(str, "No more commands & intents.", new Throwable[0]);
                    dern dernVar = this.f14111rotuma;
                    if (dernVar != null) {
                        dernVar.saneness();
                    }
                } else if (!this.f14104dovishness.isEmpty()) {
                    formularize();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void formularize() {
        saneness();
        PowerManager.WakeLock wakeLockSaneness = talweg.apical.saneness(this.f14107kowloon, "ProcessCommand");
        try {
            wakeLockSaneness.acquire();
            this.f14108molybdenite.arytenoidectomy().saneness(new attabal());
        } finally {
            wakeLockSaneness.release();
        }
    }

    public void impassible(dern dernVar) {
        if (this.f14111rotuma != null) {
            apical.dern().saneness(f14101preprohormone, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f14111rotuma = dernVar;
        }
    }

    public kowloon impromptu() {
        return this.f14109monoploid;
    }

    public overassessment.wireman marial() {
        return this.f14110polloi;
    }

    public final void saneness() {
        if (this.f14102adultoid.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean taiyuan(String str) {
        saneness();
        synchronized (this.f14104dovishness) {
            try {
                Iterator<Intent> it = this.f14104dovishness.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // overassessment.saneness
    public void wireman(String str, boolean z) {
        apical(new saneness(this, androidx.work.impl.background.systemalarm.attabal.dern(this.f14107kowloon, str, z), 0));
    }

    public wireman(Context context, overassessment.wireman wiremanVar, taiyuan taiyuanVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14107kowloon = applicationContext;
        this.f14106graveside = new androidx.work.impl.background.systemalarm.attabal(applicationContext);
        this.f14109monoploid = new kowloon();
        taiyuanVar = taiyuanVar == null ? taiyuan.apical(context) : taiyuanVar;
        this.f14108molybdenite = taiyuanVar;
        wiremanVar = wiremanVar == null ? taiyuanVar.impassible() : wiremanVar;
        this.f14110polloi = wiremanVar;
        this.f14103arytenoidectomy = taiyuanVar.arytenoidectomy();
        wiremanVar.dern(this);
        this.f14104dovishness = new ArrayList();
        this.f14105gintrap = null;
        this.f14102adultoid = new Handler(Looper.getMainLooper());
    }
}
