package umbriferous;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.ironsource.L6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rollout.EventMetadata;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final arcticology.attabal f39131apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f39133attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final kattegat f39134beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final spissatus.competently f39135competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final gelandelaufer.attabal f39136cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final rotuma f39137dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final formularize f39138formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final starveling f39139impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final umbriferous.attabal f39140impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final CrashlyticsWorkers f39142marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trm f39146saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final rollout.beachfront f39147taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public cuirassed f39148triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final rollout.kowloon f39149wireman;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final FilenameFilter f39130graveside = new FilenameFilter() { // from class: umbriferous.triweekly
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final Charset f39129adultoid = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public reeve.impromptu f39141kowloon = null;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f39132arytenoidectomy = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f39144monoploid = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final TaskCompletionSource<Void> f39145polloi = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final AtomicBoolean f39143molybdenite = new AtomicBoolean(false);

    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class attabal implements cuirassed.attabal {
        public attabal() {
        }

        @Override // umbriferous.cuirassed.attabal
        public void attabal(reeve.impromptu impromptuVar, Thread thread, Throwable th) throws Throwable {
            kowloon.this.kattegat(impromptuVar, thread, th);
        }
    }

    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class dern implements SuccessContinuation<Void, Boolean> {
        public dern() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> then(Void r1) throws Exception {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class marial implements Callable<Void> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ long f39153kowloon;

        public marial(long j) {
            this.f39153kowloon = j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f39153kowloon);
            kowloon.this.f39131apical.attabal("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class saneness implements Callable<Task<Void>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Throwable f39154arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ long f39156kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final /* synthetic */ boolean f39157molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ Thread f39158monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ reeve.impromptu f39159polloi;

        /* JADX INFO: compiled from: CrashlyticsController.java */
        public class attabal implements SuccessContinuation<reeve.wireman, Void> {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ String f39160attabal;

            public attabal(String str) {
                this.f39160attabal = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(reeve.wireman wiremanVar) throws Exception {
                if (wiremanVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{kowloon.this.seminary(), kowloon.this.f39139impassible.cord(kowloon.this.f39142marial.common, saneness.this.f39157molybdenite ? this.f39160attabal : null)});
                }
                gelandelaufer.competently.beachfront().apical("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        public saneness(long j, Throwable th, Thread thread, reeve.impromptu impromptuVar, boolean z) {
            this.f39156kowloon = j;
            this.f39154arytenoidectomy = th;
            this.f39158monoploid = thread;
            this.f39159polloi = impromptuVar;
            this.f39157molybdenite = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long jYemenite = kowloon.yemenite(this.f39156kowloon);
            String strCuirassed = kowloon.this.cuirassed();
            if (strCuirassed == null) {
                gelandelaufer.competently.beachfront().wireman("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            kowloon.this.f39137dern.attabal();
            kowloon.this.f39139impassible.adultoid(this.f39154arytenoidectomy, this.f39158monoploid, strCuirassed, jYemenite);
            kowloon.this.dovishness(this.f39156kowloon);
            kowloon.this.molybdenite(this.f39159polloi);
            kowloon.this.adultoid(new impromptu().dern(), Boolean.valueOf(this.f39157molybdenite));
            return !kowloon.this.f39146saneness.wireman() ? Tasks.forResult(null) : this.f39159polloi.attabal().onSuccessTask(kowloon.this.f39142marial.common, new attabal(strCuirassed));
        }
    }

    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class wireman implements SuccessContinuation<Boolean, Void> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Task f39162attabal;

        /* JADX INFO: compiled from: CrashlyticsController.java */
        public class attabal implements SuccessContinuation<reeve.wireman, Void> {
            public attabal() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(reeve.wireman wiremanVar) throws Exception {
                if (wiremanVar == null) {
                    gelandelaufer.competently.beachfront().apical("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                kowloon.this.seminary();
                kowloon.this.f39139impassible.preprohormone(kowloon.this.f39142marial.common);
                kowloon.this.f39145polloi.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        public wireman(Task task) {
            this.f39162attabal = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Boolean bool) throws Exception {
            if (bool.booleanValue()) {
                gelandelaufer.competently.beachfront().saneness("Sending cached crash reports...");
                kowloon.this.f39146saneness.dern(bool.booleanValue());
                return this.f39162attabal.onSuccessTask(kowloon.this.f39142marial.common, new attabal());
            }
            gelandelaufer.competently.beachfront().taiyuan("Deleting cached crash reports...");
            kowloon.monoploid(kowloon.this.merc());
            kowloon.this.f39139impassible.rotuma();
            kowloon.this.f39145polloi.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    public kowloon(Context context, kattegat kattegatVar, trm trmVar, spissatus.competently competentlyVar, rotuma rotumaVar, umbriferous.attabal attabalVar, rollout.kowloon kowloonVar, rollout.beachfront beachfrontVar, starveling starvelingVar, gelandelaufer.attabal attabalVar2, arcticology.attabal attabalVar3, formularize formularizeVar, CrashlyticsWorkers crashlyticsWorkers) {
        this.f39133attabal = context;
        this.f39134beachfront = kattegatVar;
        this.f39146saneness = trmVar;
        this.f39135competently = competentlyVar;
        this.f39137dern = rotumaVar;
        this.f39140impromptu = attabalVar;
        this.f39149wireman = kowloonVar;
        this.f39147taiyuan = beachfrontVar;
        this.f39136cutely = attabalVar2;
        this.f39131apical = attabalVar3;
        this.f39138formularize = formularizeVar;
        this.f39139impassible = starvelingVar;
        this.f39142marial = crashlyticsWorkers;
    }

    public static amount.kattegat.dern arytenoidectomy() {
        return amount.kattegat.dern.attabal(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.preprohormone());
    }

    public static boolean cord() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static byte[] creditor(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static boolean grimness(String str, File file, amount.sealless.attabal attabalVar) {
        if (file == null || !file.exists()) {
            gelandelaufer.competently.beachfront().apical("No minidump data found for session " + str);
        }
        if (attabalVar == null) {
            gelandelaufer.competently.beachfront().competently("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && attabalVar == null;
    }

    public static amount.kattegat.saneness kowloon(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return amount.kattegat.saneness.dern(CommonUtils.apical(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.saneness(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.rotuma(), CommonUtils.formularize(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static void monoploid(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public static merc saran(gelandelaufer.impromptu impromptuVar) {
        File fileDern = impromptuVar.dern();
        return (fileDern == null || !fileDern.exists()) ? new competently("minidump_file", "minidump", new byte[]{0}) : new yemenite("minidump_file", "minidump", fileDern);
    }

    public static long stratoscope() {
        return yemenite(System.currentTimeMillis());
    }

    public static amount.kattegat.attabal triweekly(kattegat kattegatVar, umbriferous.attabal attabalVar) {
        return amount.kattegat.attabal.saneness(kattegatVar.beachfront(), attabalVar.f39072beachfront, attabalVar.f39073competently, kattegatVar.attabal().dern(), DeliveryMechanism.determineFrom(attabalVar.f39078wireman).getId(), attabalVar.f39075impromptu);
    }

    public static List<merc> trm(gelandelaufer.impromptu impromptuVar, String str, spissatus.competently competentlyVar, byte[] bArr) {
        File fileMonoploid = competentlyVar.monoploid(str, "user-data");
        File fileMonoploid2 = competentlyVar.monoploid(str, "keys");
        File fileMonoploid3 = competentlyVar.monoploid(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new competently("logs_file", "logs", bArr));
        arrayList.add(new yemenite("crash_meta_file", TtmlNode.TAG_METADATA, impromptuVar.wireman()));
        arrayList.add(new yemenite("session_meta_file", "session", impromptuVar.competently()));
        arrayList.add(new yemenite("app_meta_file", MBridgeConstans.DYNAMIC_VIEW_WX_APP, impromptuVar.marial()));
        arrayList.add(new yemenite("device_meta_file", X3.i.G, impromptuVar.attabal()));
        arrayList.add(new yemenite("os_meta_file", L6.F, impromptuVar.beachfront()));
        arrayList.add(saran(impromptuVar));
        arrayList.add(new yemenite("user_meta_file", "user", fileMonoploid));
        arrayList.add(new yemenite("keys_file", "keys", fileMonoploid2));
        arrayList.add(new yemenite("rollouts_file", "rollouts", fileMonoploid3));
        return arrayList;
    }

    public static long yemenite(long j) {
        return j / 1000;
    }

    public final void adultoid(String str, Boolean bool) {
        long jStratoscope = stratoscope();
        gelandelaufer.competently.beachfront().saneness("Opening a new session with ID " + str);
        this.f39136cutely.wireman(str, String.format(Locale.US, "Crashlytics Android SDK/%s", gintrap.formularize()), jStratoscope, amount.kattegat.saneness(triweekly(this.f39134beachfront, this.f39140impromptu), arytenoidectomy(), kowloon(this.f39133attabal)));
        if (bool.booleanValue() && str != null) {
            this.f39149wireman.impassible(str);
        }
        this.f39147taiyuan.marial(str);
        this.f39138formularize.marial(str);
        this.f39139impassible.polloi(str, jStratoscope);
    }

    public final String cuirassed() {
        SortedSet<String> sortedSetMonoploid = this.f39139impassible.monoploid();
        if (sortedSetMonoploid.isEmpty()) {
            return null;
        }
        return sortedSetMonoploid.first();
    }

    public final void dovishness(long j) {
        try {
            if (this.f39135competently.competently(".ae" + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().formularize("Could not create app exception marker file.", e);
        }
    }

    public void gintrap(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, reeve.impromptu impromptuVar) {
        this.f39141kowloon = impromptuVar;
        privatdozent(str);
        cuirassed cuirassedVar = new cuirassed(new attabal(), impromptuVar, uncaughtExceptionHandler, this.f39136cutely);
        this.f39148triweekly = cuirassedVar;
        Thread.setDefaultUncaughtExceptionHandler(cuirassedVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void graveside(boolean z, reeve.impromptu impromptuVar, boolean z2) {
        String str;
        CrashlyticsWorkers.dern();
        ArrayList arrayList = new ArrayList(this.f39139impassible.monoploid());
        if (arrayList.size() <= z) {
            gelandelaufer.competently.beachfront().taiyuan("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        if (z2 && impromptuVar.saneness().f36185saneness.f36189saneness) {
            mathsort(str2);
        } else {
            gelandelaufer.competently.beachfront().taiyuan("ANR feature disabled.");
        }
        if (z2 && this.f39136cutely.dern(str2)) {
            rotuma(str2);
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f39138formularize.marial(null);
            str = null;
        }
        this.f39139impassible.impassible(stratoscope(), str);
    }

    public void hydrovane(String str, String str2) {
        try {
            this.f39149wireman.formularize(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f39133attabal;
            if (context != null && CommonUtils.dovishness(context)) {
                throw e;
            }
            gelandelaufer.competently.beachfront().wireman("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void kattegat(reeve.impromptu impromptuVar, Thread thread, Throwable th) throws Throwable {
        supplicat(impromptuVar, thread, th, false);
    }

    public final void mathsort(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            gelandelaufer.competently.beachfront().taiyuan("ANR feature enabled, but device is API " + i);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f39133attabal.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f39139impassible.gintrap(str, historicalProcessExitReasons, new rollout.beachfront(this.f39135competently, str), rollout.kowloon.cutely(str, this.f39135competently, this.f39142marial));
        } else {
            gelandelaufer.competently.beachfront().taiyuan("No ApplicationExitInfo available. Session: " + str);
        }
    }

    public List<File> merc() {
        return this.f39135competently.impromptu(f39130graveside);
    }

    public void molybdenite(reeve.impromptu impromptuVar) {
        graveside(false, impromptuVar, false);
    }

    public final InputStream oilcan(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        gelandelaufer.competently.beachfront().apical("Couldn't get Class Loader");
        return null;
    }

    public void overspeculate(long j, String str) {
        if (restrictive()) {
            return;
        }
        this.f39147taiyuan.competently(j, str);
    }

    public final Task<Boolean> peridotite() {
        if (this.f39146saneness.wireman()) {
            gelandelaufer.competently.beachfront().saneness("Automatic data collection is enabled. Allowing upload.");
            this.f39132arytenoidectomy.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        gelandelaufer.competently.beachfront().saneness("Automatic data collection is disabled.");
        gelandelaufer.competently.beachfront().taiyuan("Notifying that unsent reports are available.");
        this.f39132arytenoidectomy.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> taskOnSuccessTask = this.f39146saneness.cutely().onSuccessTask(new dern());
        gelandelaufer.competently.beachfront().saneness("Waiting for send/deleteUnsentReports to be called.");
        return chinaman.saneness.saneness(taskOnSuccessTask, this.f39144monoploid.getTask());
    }

    public final Task<Void> polder(long j) {
        if (cord()) {
            gelandelaufer.competently.beachfront().apical("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        gelandelaufer.competently.beachfront().saneness("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new marial(j));
    }

    public boolean polloi() {
        CrashlyticsWorkers.dern();
        if (!this.f39137dern.dern()) {
            String strCuirassed = cuirassed();
            return strCuirassed != null && this.f39136cutely.dern(strCuirassed);
        }
        gelandelaufer.competently.beachfront().taiyuan("Found previous crash marker.");
        this.f39137dern.wireman();
        return true;
    }

    public boolean preprohormone(reeve.impromptu impromptuVar) {
        CrashlyticsWorkers.dern();
        if (restrictive()) {
            gelandelaufer.competently.beachfront().apical("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        gelandelaufer.competently.beachfront().taiyuan("Finalizing previously open sessions.");
        try {
            graveside(true, impromptuVar, true);
            gelandelaufer.competently.beachfront().taiyuan("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            gelandelaufer.competently.beachfront().marial("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public void privatdozent(final String str) {
        this.f39142marial.common.wireman(new Runnable() { // from class: umbriferous.impassible
            @Override // java.lang.Runnable
            public final void run() {
                this.f39117kowloon.adultoid(str, Boolean.FALSE);
            }
        });
    }

    public boolean restrictive() {
        cuirassed cuirassedVar = this.f39148triweekly;
        return cuirassedVar != null && cuirassedVar.attabal();
    }

    public final void rotuma(String str) {
        gelandelaufer.competently.beachfront().taiyuan("Finalizing native report for session " + str);
        gelandelaufer.impromptu impromptuVarAttabal = this.f39136cutely.attabal(str);
        File fileDern = impromptuVarAttabal.dern();
        amount.sealless.attabal attabalVarSaneness = impromptuVarAttabal.saneness();
        if (grimness(str, fileDern, attabalVarSaneness)) {
            gelandelaufer.competently.beachfront().apical("No native core present");
            return;
        }
        long jLastModified = fileDern.lastModified();
        rollout.beachfront beachfrontVar = new rollout.beachfront(this.f39135competently, str);
        File fileApical = this.f39135competently.apical(str);
        if (!fileApical.isDirectory()) {
            gelandelaufer.competently.beachfront().apical("Couldn't create directory to store native session files, aborting.");
            return;
        }
        dovishness(jLastModified);
        List<merc> listTrm = trm(impromptuVarAttabal, str, this.f39135competently, beachfrontVar.saneness());
        polder.saneness(fileApical, listTrm);
        gelandelaufer.competently.beachfront().saneness("CrashlyticsController#finalizePreviousNativeSession");
        this.f39139impassible.formularize(str, listTrm, attabalVarSaneness);
        beachfrontVar.attabal();
    }

    public String sealless() throws IOException {
        String strPolloi = CommonUtils.polloi(this.f39133attabal);
        if (strPolloi != null) {
            gelandelaufer.competently.beachfront().saneness("Read version control info from string resource");
            return Base64.encodeToString(strPolloi.getBytes(f39129adultoid), 0);
        }
        InputStream inputStreamOilcan = oilcan("META-INF/version-control-info.textproto");
        if (inputStreamOilcan == null) {
            if (inputStreamOilcan != null) {
                inputStreamOilcan.close();
            }
            gelandelaufer.competently.beachfront().competently("No version control information found");
            return null;
        }
        try {
            gelandelaufer.competently.beachfront().saneness("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(creditor(inputStreamOilcan), 0);
            inputStreamOilcan.close();
            return strEncodeToString;
        } catch (Throwable th) {
            try {
                inputStreamOilcan.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Task<Void> seminary() {
        ArrayList arrayList = new ArrayList();
        for (File file : merc()) {
            try {
                arrayList.add(polder(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                gelandelaufer.competently.beachfront().apical("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public void splinterproof(Thread thread, Throwable th, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (restrictive()) {
            return;
        }
        long jYemenite = yemenite(jCurrentTimeMillis);
        String strCuirassed = cuirassed();
        if (strCuirassed == null) {
            gelandelaufer.competently.beachfront().apical("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f39139impassible.dovishness(th, thread, new EventMetadata(strCuirassed, jYemenite, map));
        }
    }

    public void starveling() {
        try {
            String strSealless = sealless();
            if (strSealless != null) {
                hydrovane("com.crashlytics.version-control-info", strSealless);
                gelandelaufer.competently.beachfront().competently("Saved version control info");
            }
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().formularize("Unable to save version control info", e);
        }
    }

    public synchronized void supplicat(reeve.impromptu impromptuVar, Thread thread, Throwable th, boolean z) throws Throwable {
        try {
            try {
                gelandelaufer.competently.beachfront().saneness("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
                Task taskBeachfront = this.f39142marial.common.beachfront(new saneness(System.currentTimeMillis(), th, thread, impromptuVar, z));
                if (!z) {
                    try {
                        try {
                            peridotite.saneness(taskBeachfront);
                        } catch (Exception e) {
                            gelandelaufer.competently.beachfront().marial("Error handling uncaught exception", e);
                        }
                    } catch (TimeoutException unused) {
                        gelandelaufer.competently.beachfront().wireman("Cannot send reports. Timed out while fetching settings.");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public void walach(Task<reeve.wireman> task) {
        if (this.f39139impassible.arytenoidectomy()) {
            gelandelaufer.competently.beachfront().taiyuan("Crash reports are available to be sent.");
            peridotite().onSuccessTask(this.f39142marial.common, new wireman(task));
        } else {
            gelandelaufer.competently.beachfront().taiyuan("No crash reports are available to be sent.");
            this.f39132arytenoidectomy.trySetResult(Boolean.FALSE);
        }
    }
}
