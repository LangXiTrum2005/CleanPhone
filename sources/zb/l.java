package zb;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import b2.h0;
import cc.c0;
import cc.d0;
import cc.d1;
import cc.e0;
import cc.e1;
import cc.f0;
import cc.g0;
import cc.k0;
import cc.l0;
import cc.m0;
import cc.m1;
import cc.n0;
import cc.o0;
import cc.o1;
import cc.p1;
import cc.q0;
import cc.q1;
import cc.r1;
import cc.s0;
import cc.s1;
import cc.t0;
import cc.t2;
import cc.u2;
import cc.v0;
import cc.w0;
import cc.z0;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final fc.a f54702t = new fc.a(8);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Charset f54703u = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f54705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi.b f54706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fc.f f54707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ac.g f54708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f54709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fc.f f54710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j30 f54711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bc.f f54712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wb.a f54713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xb.a f54714k;
    public final h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fc.f f54715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t f54716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.d f54717o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f54718p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f54719q = new TaskCompletionSource();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TaskCompletionSource f54720r = new TaskCompletionSource();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f54721s = new AtomicBoolean(false);

    public l(Context context, x xVar, u uVar, fc.f fVar, wi.b bVar, j30 j30Var, fc.f fVar2, bc.f fVar3, fc.f fVar4, wb.a aVar, xb.a aVar2, h hVar, ac.g gVar) {
        this.f54704a = context;
        this.f54709f = xVar;
        this.f54705b = uVar;
        this.f54710g = fVar;
        this.f54706c = bVar;
        this.f54711h = j30Var;
        this.f54707d = fVar2;
        this.f54712i = fVar3;
        this.f54713j = aVar;
        this.f54714k = aVar2;
        this.l = hVar;
        this.f54715m = fVar4;
        this.f54708e = gVar;
    }

    public static void a(l lVar, String str, ProfilingResult profilingResult) {
        String str2;
        int triggerType = profilingResult.getTriggerType();
        if (triggerType == 8) {
            str2 = "trigger-type-anomaly";
        } else {
            str2 = triggerType == 7 ? "trigger-type-oom" : "trigger-type-unknown";
        }
        try {
            if (lVar.f54710g.r(str, str2).createNewFile()) {
                return;
            }
            String str3 = "Trigger file " + str2 + " exists for session: " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        } catch (IOException unused) {
            Log.e("FirebaseCrashlytics", "Unable to touch trigger file ".concat(str2), null);
        }
    }

    public static Task b(l lVar) {
        Task taskCall;
        ArrayList arrayList = new ArrayList();
        for (File file : fc.f.I(((File) lVar.f54710g.f40782d).listFiles(f54702t))) {
            try {
                long j10 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new k(lVar, j10));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:198:0x0624  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [int] */
    /* JADX WARN: Type inference failed for: r9v28 */
    public final void c(boolean z10, com.google.android.gms.internal.consent_sdk.d dVar, boolean z11) throws Throwable {
        String str;
        Context context;
        fc.f fVar;
        ArrayList arrayList;
        int i10;
        Throwable th2;
        boolean z12;
        String str2;
        String strSubstring;
        boolean z13;
        String[] list;
        List listB;
        String strI;
        int i11;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        wb.a aVar = this.f54713j;
        String str3 = "activity";
        Context context2 = this.f54704a;
        fc.f fVar2 = this.f54710g;
        ac.g.a();
        final fc.f fVar3 = this.f54715m;
        ArrayList arrayList2 = new ArrayList(((fc.d) fVar3.f40781c).d());
        if (arrayList2.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        final String str4 = (String) arrayList2.get(z10 == true ? 1 : 0);
        int i12 = 4;
        if (z11 && dVar.h().f42298b.f14259b) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context2.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                bc.f fVar4 = new bc.f(fVar2);
                fVar4.f5548b = bc.f.f5546c;
                if (str4 != null) {
                    fVar4.f5548b = new bc.o(fVar2.r(str4, "userlog"));
                }
                ac.g gVar = this.f54708e;
                bc.h hVar = new bc.h(fVar2);
                fc.f fVar5 = new fc.f(str4, fVar2, gVar);
                ((bc.e) ((AtomicMarkableReference) ((bc.s) fVar5.f40783e).f5581b).getReference()).c(hVar.c(str4, false));
                ((bc.e) ((AtomicMarkableReference) ((bc.s) fVar5.f40784f).f5581b).getReference()).c(hVar.c(str4, true));
                ((AtomicMarkableReference) fVar5.f40786h).set(hVar.d(str4), false);
                bc.q qVar = (bc.q) fVar5.f40785g;
                File fileR = fVar2.r(str4, "rollouts-state");
                if (!fileR.exists() || fileR.length() == 0) {
                    fVar = fVar2;
                    arrayList = arrayList2;
                    bc.h.g(fileR, "The file has a length of zero for session: " + str4);
                    listB = Collections.EMPTY_LIST;
                } else {
                    try {
                        fileInputStream2 = new FileInputStream(fileR);
                        try {
                            try {
                                arrayList = arrayList2;
                                try {
                                    listB = bc.h.b(f.j(fileInputStream2));
                                    fVar = fVar2;
                                    try {
                                        String str5 = "Loaded rollouts state:\n" + listB + "\nfor session " + str4;
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", str5, null);
                                        }
                                        f.b(fileInputStream2, "Failed to close rollouts state file.");
                                    } catch (Exception e10) {
                                        e = e10;
                                        Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                        bc.h.f(fileR);
                                        f.b(fileInputStream2, "Failed to close rollouts state file.");
                                        listB = Collections.EMPTY_LIST;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    fVar = fVar2;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                fVar = fVar2;
                                arrayList = arrayList2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream2;
                            f.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        fVar = fVar2;
                        arrayList = arrayList2;
                        fileInputStream2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream = null;
                        f.b(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                }
                qVar.c(listB);
                ApplicationExitInfo applicationExitInfoN = fVar3.n(str4, historicalProcessExitReasons, new fc.b(3));
                if (applicationExitInfoN == null) {
                    String strN = defpackage.e.n("No relevant ApplicationExitInfo occurred during session: ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strN, null);
                    }
                    str = "activity";
                    context = context2;
                } else {
                    s sVar = (s) fVar3.f40780b;
                    try {
                        InputStream traceInputStream = applicationExitInfoN.getTraceInputStream();
                        strI = traceInputStream != null ? fc.f.i(traceInputStream) : null;
                    } catch (IOException e14) {
                        Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfoN.toString() + " Error: " + e14, null);
                    }
                    e0 e0Var = new e0();
                    e0Var.f6061d = applicationExitInfoN.getImportance();
                    e0Var.f6067j = (byte) (e0Var.f6067j | 4);
                    String processName = applicationExitInfoN.getProcessName();
                    if (processName == null) {
                        throw new NullPointerException("Null processName");
                    }
                    e0Var.f6059b = processName;
                    e0Var.f6060c = applicationExitInfoN.getReason();
                    e0Var.f6067j = (byte) (e0Var.f6067j | 2);
                    e0Var.f6064g = applicationExitInfoN.getTimestamp();
                    e0Var.f6067j = (byte) (e0Var.f6067j | 32);
                    e0Var.f6058a = applicationExitInfoN.getPid();
                    e0Var.f6067j = (byte) (e0Var.f6067j | 1);
                    e0Var.f6062e = applicationExitInfoN.getPss();
                    e0Var.f6067j = (byte) (e0Var.f6067j | 8);
                    e0Var.f6063f = applicationExitInfoN.getRss();
                    e0Var.f6067j = (byte) (e0Var.f6067j | 16);
                    e0Var.f6065h = strI;
                    f0 f0VarA = e0Var.a();
                    int i13 = sVar.f54753a.getResources().getConfiguration().orientation;
                    s0 s0Var = new s0();
                    s0Var.f6270b = "anr";
                    long j10 = f0VarA.f6081g;
                    s0Var.f6269a = j10;
                    s0Var.f6275g = (byte) (s0Var.f6275g | 1);
                    j30 j30Var = sVar.f54755c;
                    if (!sVar.f54757e.h().f42298b.f14260c || ((ArrayList) j30Var.f15948b).size() <= 0) {
                        i11 = i13;
                        str = "activity";
                        context = context2;
                        listUnmodifiableList = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = ((ArrayList) j30Var.f15948b).iterator();
                        while (it.hasNext()) {
                            int i14 = i13;
                            c cVar = (c) it.next();
                            Iterator it2 = it;
                            String str6 = cVar.f54675a;
                            if (str6 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            String str7 = str3;
                            String str8 = cVar.f54676b;
                            if (str8 == null) {
                                throw new NullPointerException("Null arch");
                            }
                            String str9 = cVar.f54677c;
                            if (str9 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            arrayList3.add(new g0(str8, str6, str9));
                            it = it2;
                            i13 = i14;
                            str3 = str7;
                            context2 = context2;
                        }
                        i11 = i13;
                        str = str3;
                        context = context2;
                        listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                    }
                    e0 e0Var2 = new e0();
                    e0Var2.f6061d = f0VarA.f6078d;
                    byte b10 = (byte) (e0Var2.f6067j | 4);
                    e0Var2.f6067j = b10;
                    String str10 = f0VarA.f6076b;
                    if (str10 == null) {
                        throw new NullPointerException("Null processName");
                    }
                    e0Var2.f6059b = str10;
                    e0Var2.f6060c = f0VarA.f6077c;
                    e0Var2.f6064g = j10;
                    e0Var2.f6058a = f0VarA.f6075a;
                    e0Var2.f6062e = f0VarA.f6079e;
                    e0Var2.f6063f = f0VarA.f6080f;
                    e0Var2.f6067j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 32)) | 1)) | 8)) | 16);
                    e0Var2.f6065h = f0VarA.f6082h;
                    e0Var2.f6066i = listUnmodifiableList;
                    f0 f0VarA2 = e0Var2.a();
                    Boolean boolValueOf = Boolean.valueOf(f0VarA2.f6078d != 100);
                    String processName2 = f0VarA2.f6076b;
                    int i15 = f0VarA2.f6075a;
                    int i16 = f0VarA2.f6078d;
                    kotlin.jvm.internal.n.f(processName2, "processName");
                    if ((8 & 4) != 0) {
                        i16 = 0;
                    }
                    d1 d1Var = new d1();
                    d1Var.f6050a = processName2;
                    d1Var.f6051b = i15;
                    byte b11 = (byte) (d1Var.f6054e | 1);
                    d1Var.f6052c = i16;
                    d1Var.f6053d = false;
                    d1Var.f6054e = (byte) (((byte) (b11 | 2)) | 4);
                    e1 e1VarA = d1Var.a();
                    byte b12 = (byte) 1;
                    z0 z0VarE = s.e();
                    List listA = sVar.a();
                    if (listA == null) {
                        throw new NullPointerException("Null binaries");
                    }
                    w0 w0Var = new w0(null, null, f0VarA2, null, z0VarE, listA);
                    if (b12 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        if (b12 == 0) {
                            sb2.append(" uiOrientation");
                        }
                        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
                    }
                    s0Var.f6271c = new v0(w0Var, null, null, boolValueOf, e1VarA, null, i11);
                    s0Var.f6272d = sVar.b(i11);
                    t0 t0VarA = s0Var.a();
                    String strN2 = defpackage.e.n("Persisting anr for session ", str4);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strN2, null);
                    }
                    ((fc.d) fVar3.f40781c).e(fc.f.f(fc.f.c(t0VarA, fVar4, fVar5, Collections.EMPTY_MAP), fVar5), str4, true);
                }
                i10 = 2;
            } else {
                str = "activity";
                context = context2;
                fVar = fVar2;
                arrayList = arrayList2;
                String strN3 = defpackage.e.n("No ApplicationExitInfo available. Session: ", str4);
                i10 = 2;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    th2 = null;
                    Log.v("FirebaseCrashlytics", strN3, null);
                }
            }
            th2 = null;
        } else {
            str = "activity";
            context = context2;
            fVar = fVar2;
            arrayList = arrayList2;
            i10 = 2;
            th2 = null;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z11 && aVar.c(str4)) {
            String strN4 = defpackage.e.n("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                Log.v("FirebaseCrashlytics", strN4, th2);
            }
            aVar.a(str4).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str4, th2);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str4, th2);
            Log.w("FirebaseCrashlytics", "No native core present", th2);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(str);
            fc.a aVar2 = new fc.a(9);
            fVar.getClass();
            File file = new File((File) fVar.f40783e, str4);
            file.mkdirs();
            List list2 = (List) fc.f.I(file.listFiles(aVar2)).stream().map(new com.mbridge.msdk.config.component.common.express.operator.v(4)).filter(new fc.b(2)).collect(Collectors.toList());
            List<ApplicationExitInfo> historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            Optional optionalFindFirst = list2.stream().findFirst();
            if (!optionalFindFirst.isPresent()) {
                optionalFindFirst = fVar3.n(str4, historicalProcessExitReasons2, new fc.b(4)) != null ? Optional.of(7) : Optional.empty();
                Objects.requireNonNull(optionalFindFirst);
            }
            optionalFindFirst.ifPresent(new Consumer() { // from class: zb.y
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String str11 = str4;
                    fc.d dVar2 = (fc.d) fVar3.f40781c;
                    int iIntValue = ((Integer) obj).intValue();
                    if (((byte) 1) != 1) {
                        throw new IllegalStateException("Missing required properties: trigger");
                    }
                    k0 k0Var = new k0(new l0(iIntValue));
                    try {
                        fc.d.f40771g.getClass();
                        fc.d.g(dVar2.f40775b.r(str11, "profiling-manager-info"), dc.a.f38803a.y(k0Var));
                    } catch (IOException e15) {
                        Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str11, e15);
                    }
                }
            });
        }
        if (z10 != 0) {
            z12 = false;
            str2 = (String) arrayList.get(0);
        } else {
            z12 = false;
            this.l.a(null);
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        fc.d dVar2 = (fc.d) fVar3.f40781c;
        fc.f fVar6 = dVar2.f40775b;
        fVar6.h(".com.google.firebase.crashlytics");
        fVar6.h(".com.google.firebase.crashlytics-ndk");
        if (!((String) fVar6.f40780b).isEmpty()) {
            fVar6.h(".com.google.firebase.crashlytics.files.v1");
            final String str11 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) fVar6.f40781c;
            if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: fc.e
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str12) {
                    return str12.startsWith(str11);
                }
            })) != null) {
                int length = list.length;
                for (?? r10 = z12; r10 < length; r10++) {
                    fVar6.h(list[r10]);
                }
            }
        }
        NavigableSet<String> navigableSetD = dVar2.d();
        if (str2 != null) {
            navigableSetD.remove(str2);
        }
        if (navigableSetD.size() > 8) {
            while (navigableSetD.size() > 8) {
                String str12 = (String) navigableSetD.last();
                String strN5 = defpackage.e.n("Removing session over cap: ", str12);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strN5, null);
                }
                fc.f.F(new File((File) fVar6.f40783e, str12));
                navigableSetD.remove(str12);
            }
        }
        for (String str13 : navigableSetD) {
            String strN6 = defpackage.e.n("Finalizing report for session ", str13);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strN6, null);
            }
            dc.a aVar3 = fc.d.f40771g;
            fc.a aVar4 = fc.d.f40773i;
            File file3 = new File((File) fVar6.f40783e, str13);
            file3.mkdirs();
            List<File> listI = fc.f.I(file3.listFiles(aVar4));
            if (listI.isEmpty()) {
                String strO = defpackage.e.o("Session ", str13, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strO, null);
                }
            } else {
                Collections.sort(listI);
                ArrayList arrayList4 = new ArrayList();
                boolean z14 = z12;
                for (File file4 : listI) {
                    try {
                        String strF = fc.d.f(file4);
                        aVar3.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strF));
                            try {
                                t0 t0VarE = dc.a.e(jsonReader);
                                jsonReader.close();
                                arrayList4.add(dVar2.a(str13, t0VarE));
                                if (z14) {
                                    z13 = true;
                                } else {
                                    String name = file4.getName();
                                    if (name.startsWith(NotificationCompat.CATEGORY_EVENT) && name.endsWith("_")) {
                                        z13 = true;
                                    } else {
                                        z13 = z12;
                                    }
                                }
                                z14 = z13;
                            } catch (Throwable th5) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } catch (IllegalStateException e15) {
                            throw new IOException(e15);
                        }
                    } catch (IOException e16) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e16);
                    }
                }
                if (arrayList4.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str13, null);
                } else {
                    String strD = new bc.h(fVar6).d(str13);
                    g gVar2 = dVar2.f40777d.f54691b;
                    synchronized (gVar2) {
                        if (Objects.equals(gVar2.f54688b, str13)) {
                            strSubstring = gVar2.f54689c;
                        } else {
                            fc.f fVar7 = gVar2.f54687a;
                            fc.a aVar5 = g.f54685d;
                            File file5 = new File((File) fVar7.f40783e, str13);
                            file5.mkdirs();
                            List listI2 = fc.f.I(file5.listFiles(aVar5));
                            if (listI2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listI2, g.f54686e)).getName().substring(i12);
                            }
                        }
                    }
                    File fileR2 = fVar6.r(str13, "report");
                    try {
                        String strF2 = fc.d.f(fileR2);
                        aVar3.getClass();
                        d0 d0VarJ = dc.a.j(strF2);
                        c0 c0VarA = d0VarJ.a();
                        t2 t2Var = d0VarJ.f6048k;
                        if (t2Var != null) {
                            try {
                                m0 m0VarA = t2Var.a();
                                m0VarA.f6168e = Long.valueOf(jCurrentTimeMillis);
                                m0VarA.f6169f = z14;
                                try {
                                    m0VarA.f6175m = (byte) (m0VarA.f6175m | 2);
                                    if (strD != null) {
                                        m0VarA.f6171h = new o1(strD);
                                    }
                                    c0VarA.f6019j = m0VarA.a();
                                } catch (IOException e17) {
                                    e = e17;
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileR2, e);
                                    fc.f.F(new File((File) fVar6.f40783e, str13));
                                    z12 = false;
                                    i12 = 4;
                                }
                            } catch (IOException e18) {
                                e = e18;
                            }
                        }
                        d0 d0VarA = c0VarA.a();
                        c0 c0VarA2 = d0VarA.a();
                        c0VarA2.f6016g = strSubstring;
                        t2 t2Var2 = d0VarA.f6048k;
                        if (t2Var2 != null) {
                            m0 m0VarA2 = t2Var2.a();
                            m0VarA2.f6166c = strSubstring;
                            c0VarA2.f6019j = m0VarA2.a();
                        }
                        d0 d0VarA2 = c0VarA2.a();
                        t2 t2Var3 = d0VarA2.f6048k;
                        if (t2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        c0 c0VarA3 = d0VarA2.a();
                        m0 m0VarA3 = t2Var3.a();
                        m0VarA3.f6174k = arrayList4;
                        c0VarA3.f6019j = m0VarA3.a();
                        d0 d0VarA3 = c0VarA3.a();
                        t2 t2Var4 = d0VarA3.f6048k;
                        if (t2Var4 != null) {
                            String str14 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str14, null);
                                    } catch (IOException e19) {
                                        e = e19;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileR2, e);
                                    }
                                }
                                fc.d.g(z14 ? new File((File) fVar6.f40785g, ((n0) t2Var4).f6187b) : new File((File) fVar6.f40784f, ((n0) t2Var4).f6187b), dc.a.f38803a.y(d0VarA3));
                            } catch (IOException e20) {
                                e = e20;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileR2, e);
                            }
                        }
                        e = e19;
                    } catch (IOException e21) {
                        e = e21;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileR2, e);
                }
                fc.f.F(new File((File) fVar6.f40783e, str13));
                z12 = false;
                i12 = 4;
            }
            fc.f.F(new File((File) fVar6.f40783e, str13));
            z12 = false;
            i12 = 4;
        }
        d5.o oVar = dVar2.f40776c.h().f42297a;
        ArrayList arrayListC = dVar2.c();
        int size = arrayListC.size();
        if (size <= 4) {
            return;
        }
        Iterator it3 = arrayListC.subList(4, size).iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
    }

    public final void d(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i10;
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strN = defpackage.e.n("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strN, null);
        }
        Locale locale = Locale.US;
        x xVar = this.f54709f;
        j30 j30Var = this.f54711h;
        q1 q1Var = new q1(xVar.f54779c, (String) j30Var.f15951e, (String) j30Var.f15952f, xVar.c().f54672a, wi.d.c(((String) j30Var.f15949c) != null ? 4 : 1), (v6.c) j30Var.f15953g);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        s1 s1Var = new s1(f.h());
        Context context = this.f54704a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        e eVar = e.f54681a;
        String str7 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str7)) {
            e eVar2 = (e) e.f54682b.get(str7.toLowerCase(locale));
            if (eVar2 != null) {
                eVar = eVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = eVar.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = f.a(context);
        boolean zG = f.g();
        int iD = f.d();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.f54713j.d(str, jCurrentTimeMillis, new p1(q1Var, s1Var, new r1(iOrdinal, iAvailableProcessors, jA, blockCount, zG, iD)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i10 = 4;
        } else {
            fc.f fVar = this.f54707d;
            synchronized (((String) fVar.f40780b)) {
                fVar.f40780b = str;
                bc.e eVar3 = (bc.e) ((AtomicMarkableReference) ((bc.s) fVar.f40783e).f5581b).getReference();
                synchronized (eVar3) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar3.f5543a));
                }
                str3 = str9;
                str2 = str6;
                str4 = str10;
                i10 = 4;
                ((ac.g) fVar.f40782d).f3463b.a(new bc.r(fVar, str, mapUnmodifiableMap, ((bc.q) fVar.f40785g).a(), 0));
            }
        }
        bc.f fVar2 = this.f54712i;
        ((bc.d) fVar2.f5548b).a();
        fVar2.f5548b = bc.f.f5546c;
        if (str != null) {
            fVar2.f5548b = new bc.o(((fc.f) fVar2.f5547a).r(str, "userlog"));
        }
        this.l.a(str);
        fc.f fVar3 = this.f54715m;
        s sVar = (s) fVar3.f40780b;
        Charset charset = u2.f6303a;
        c0 c0Var = new c0();
        c0Var.f6010a = "20.1.0";
        j30 j30Var2 = sVar.f54755c;
        String str11 = (String) j30Var2.f15954h;
        if (str11 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c0Var.f6011b = str11;
        x xVar2 = sVar.f54754b;
        String str12 = xVar2.c().f54672a;
        if (str12 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c0Var.f6013d = str12;
        c0Var.f6014e = xVar2.c().f54673b;
        c0Var.f6015f = xVar2.c().f54674c;
        String str13 = (String) j30Var2.f15951e;
        if (str13 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c0Var.f6017h = str13;
        String str14 = (String) j30Var2.f15952f;
        if (str14 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c0Var.f6018i = str14;
        c0Var.f6012c = i10;
        c0Var.f6021m = (byte) (c0Var.f6021m | 1);
        m0 m0Var = new m0();
        m0Var.f6169f = false;
        byte b10 = (byte) (m0Var.f6175m | 2);
        m0Var.f6167d = jCurrentTimeMillis;
        m0Var.f6175m = (byte) (b10 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        m0Var.f6165b = str;
        String str15 = s.f54752g;
        if (str15 == null) {
            throw new NullPointerException("Null generator");
        }
        m0Var.f6164a = str15;
        String str16 = xVar2.f54779c;
        if (str16 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str17 = xVar2.c().f54672a;
        v6.c cVar = (v6.c) j30Var2.f15953g;
        if (((h0) cVar.f52488b) == null) {
            cVar.f52488b = new h0(cVar);
        }
        h0 h0Var = (h0) cVar.f52488b;
        String str18 = h0Var.f5291a;
        if (h0Var == null) {
            cVar.f52488b = new h0(cVar);
        }
        m0Var.f6170g = new o0(str16, str13, str14, str17, str18, ((h0) cVar.f52488b).f5292b);
        m1 m1Var = new m1();
        m1Var.f6176a = 3;
        m1Var.f6180e = (byte) (m1Var.f6180e | 1);
        if (str5 == null) {
            throw new NullPointerException("Null version");
        }
        m1Var.f6177b = str5;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        m1Var.f6178c = str2;
        m1Var.f6179d = f.h();
        m1Var.f6180e = (byte) (m1Var.f6180e | 2);
        m0Var.f6172i = m1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) s.f54751f.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = f.a(sVar.f54753a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zG2 = f.g();
        int iD2 = f.d();
        q0 q0Var = new q0();
        q0Var.f6228a = iIntValue;
        byte b11 = (byte) (q0Var.f6237j | 1);
        q0Var.f6237j = b11;
        if (str8 == 0) {
            throw new NullPointerException("Null model");
        }
        q0Var.f6229b = str8;
        q0Var.f6230c = iAvailableProcessors2;
        q0Var.f6231d = jA2;
        q0Var.f6232e = blockCount2;
        q0Var.f6233f = zG2;
        q0Var.f6234g = iD2;
        q0Var.f6237j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        String str19 = str3;
        if (str19 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        q0Var.f6235h = str19;
        String str20 = str4;
        if (str20 == null) {
            throw new NullPointerException("Null modelClass");
        }
        q0Var.f6236i = str20;
        m0Var.f6173j = q0Var.a();
        m0Var.l = 3;
        m0Var.f6175m = (byte) (m0Var.f6175m | 4);
        c0Var.f6019j = m0Var.a();
        d0 d0VarA = c0Var.a();
        fc.f fVar4 = ((fc.d) fVar3.f40781c).f40775b;
        t2 t2Var = d0VarA.f6048k;
        if (t2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str21 = ((n0) t2Var).f6187b;
        try {
            fc.d.f40771g.getClass();
            fc.d.g(fVar4.r(str21, "report"), dc.a.f38803a.y(d0VarA));
            File fileR = fVar4.r(str21, "start-time");
            long j10 = ((n0) t2Var).f6189d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileR), fc.d.f40769e);
            try {
                outputStreamWriter.write("");
                fileR.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            String strN2 = defpackage.e.n("Could not persist report for session ", str21);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strN2, e10);
            }
        }
    }

    public final void e(final String str) {
        ExecutorService executorService = this.f54708e.f3463b.f3457a;
        ProfilingManager profilingManager = (ProfilingManager) this.f54704a.getSystemService(ProfilingManager.class);
        profilingManager.addProfilingTriggers(List.of(new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()));
        profilingManager.registerForAllProfilingResults(executorService, new Consumer() { // from class: zb.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                l.a(this.f54692a, str, (ProfilingResult) obj);
            }
        });
    }

    public final boolean f(com.google.android.gms.internal.consent_sdk.d dVar) throws Throwable {
        ac.g.a();
        t tVar = this.f54716n;
        if (tVar != null && tVar.f54762e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, dVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String g() {
        NavigableSet navigableSetD = ((fc.d) this.f54715m.f40781c).d();
        if (navigableSetD.isEmpty()) {
            return null;
        }
        return (String) navigableSetD.first();
    }

    public final String h() throws IOException {
        InputStream resourceAsStream;
        Context context = this.f54704a;
        int iE = f.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iE == 0 ? null : context.getResources().getString(iE);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f54703u), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = resourceAsStream.read(bArr);
                    if (i10 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            resourceAsStream.close();
            throw th5;
        }
    }

    public final synchronized void i(com.google.android.gms.internal.consent_sdk.d dVar, Thread thread, Throwable th2, boolean z10) throws Throwable {
        l lVar;
        Throwable th3;
        try {
            try {
                String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        try {
                            Log.d("FirebaseCrashlytics", str, null);
                        } catch (Throwable th4) {
                            th3 = th4;
                            lVar = this;
                            throw th3;
                        }
                    }
                    if (!z10) {
                        android.support.v4.media.session.a.D();
                    }
                    lVar = this;
                    Task taskB = this.f54708e.f3462a.b(new j(lVar, System.currentTimeMillis(), th2, thread, dVar, z10));
                    try {
                        if (!z10) {
                            try {
                                z.a(taskB);
                            } catch (TimeoutException unused) {
                                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                            } catch (Exception e10) {
                                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th3 = th;
                        throw th3;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    lVar = this;
                }
            } catch (Throwable th7) {
                th = th7;
                lVar = this;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th8) {
            th = th8;
            th3 = th;
            throw th3;
        }
    }

    public final void j() {
        try {
            String strH = h();
            if (strH != null) {
                k("com.crashlytics.version-control-info", strH);
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final void k(String str, String str2) {
        try {
            ((bc.s) this.f54707d.f40784f).d(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f54704a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e10;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void l(Task task) {
        Task task2;
        Task taskA;
        TaskCompletionSource taskCompletionSource = this.f54718p;
        fc.f fVar = ((fc.d) this.f54715m.f40781c).f40775b;
        if (fc.f.I(((File) fVar.f40784f).listFiles()).isEmpty() && fc.f.I(((File) fVar.f40785g).listFiles()).isEmpty() && fc.f.I(((File) fVar.f40786h).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        wb.c cVar = wb.c.f53149a;
        cVar.c("Crash reports are available to be sent.");
        u uVar = this.f54705b;
        if (uVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar.b("Automatic data collection is disabled.");
            cVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (uVar.f54765c) {
                task2 = uVar.f54766d.getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new un.a(18));
            cVar.b("Waiting for send/deleteUnsentReports to be called.");
            taskA = ac.b.a(taskOnSuccessTask, this.f54719q.getTask());
        }
        taskA.onSuccessTask(this.f54708e.f3462a, new v6.c(false, this, task));
    }
}
