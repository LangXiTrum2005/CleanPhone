package tj;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 implements xi.c, m1.r, uj.c, tb.d, tc.a, OnSuccessListener, xi.b, z8.b, h.b, Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50841b;

    public /* synthetic */ i0(Object obj, int i10) {
        this.f50840a = i10;
        this.f50841b = obj;
    }

    @Override // m1.r
    public void a(long j10, l1.q qVar) {
        int i10 = this.f50840a;
        Object obj = this.f50841b;
        switch (i10) {
            case 1:
                n2.b.f(j10, qVar, (n2.a0[]) ((r1.s) obj).f49339c);
                break;
            default:
                n2.b.g(j10, qVar, (n2.a0[]) ((qd.i) obj).f48981c);
                break;
        }
    }

    @Override // tc.a
    public void b(tc.b bVar) {
        int i10 = this.f50840a;
        Object obj = this.f50841b;
        switch (i10) {
            case 5:
                wb.a aVar = (wb.a) obj;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                aVar.f53147b.set((wb.a) bVar.get());
                break;
            default:
                wb.b bVar2 = (wb.b) obj;
                k5.g gVar = ((pd.j) ((sd.a) bVar.get())).a("firebase").f48334i;
                ((Set) gVar.f44328d).add(bVar2);
                Task taskB = ((qd.b) gVar.f44325a).b();
                taskB.addOnSuccessListener((Executor) gVar.f44327c, new ac.a(gVar, taskB, bVar2, 12));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                }
                break;
        }
    }

    @Override // uj.c
    public boolean c(View view) {
        for (Class cls : (Class[]) this.f50841b) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    @Override // xi.c
    public void e(Object obj) {
        int i10 = this.f50840a;
        Object obj2 = this.f50841b;
        switch (i10) {
            case 0:
                Object obj3 = ((f) obj2).f50823b;
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", "", "X509Certificate", obj3);
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj4 = list.get(0);
                        kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list.get(1);
                        kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj4, (String) obj5, (String) list.get(2)), "X509Certificate", obj3);
                    }
                }
                break;
            default:
                k3.j jVar = (k3.j) obj2;
                boolean z10 = false;
                if (obj != null) {
                    try {
                        z10 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e10) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e10);
                    }
                }
                ((bc.i) jVar.f44293b).c(z10);
                break;
        }
    }

    @Override // z8.b
    public Object execute() {
        int i10 = this.f50840a;
        Object obj = this.f50841b;
        switch (i10) {
            case 10:
                y8.h hVar = (y8.h) ((y8.c) obj);
                hVar.getClass();
                int i11 = u8.a.f51912e;
                k5.g gVar = new k5.g();
                gVar.f44325a = null;
                gVar.f44326b = new ArrayList();
                gVar.f44327c = null;
                gVar.f44328d = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseD = hVar.d();
                sQLiteDatabaseD.beginTransaction();
                try {
                    u8.a aVar = (u8.a) y8.h.q(sQLiteDatabaseD.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ac.a(hVar, map, gVar, 16));
                    sQLiteDatabaseD.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseD.endTransaction();
                }
            case 11:
                y8.h hVar2 = (y8.h) ((y8.d) obj);
                long jF = hVar2.f54340b.f() - hVar2.f54342d.f54329d;
                SQLiteDatabase sQLiteDatabaseD2 = hVar2.d();
                sQLiteDatabaseD2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jF)};
                    Cursor cursorRawQuery = sQLiteDatabaseD2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = cursorRawQuery;
                        while (cursor.moveToNext()) {
                            hVar2.n(cursor.getInt(0), u8.c.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        cursorRawQuery.close();
                        int iDelete = sQLiteDatabaseD2.delete("events", "timestamp_ms < ?", strArr);
                        sQLiteDatabaseD2.setTransactionSuccessful();
                        sQLiteDatabaseD2.endTransaction();
                        return Integer.valueOf(iDelete);
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    sQLiteDatabaseD2.endTransaction();
                    throw th3;
                }
            case 12:
                y8.h hVar3 = (y8.h) ((y8.c) ((com.google.android.gms.internal.consent_sdk.d) obj).f22989i);
                SQLiteDatabase sQLiteDatabaseD3 = hVar3.d();
                sQLiteDatabaseD3.beginTransaction();
                try {
                    sQLiteDatabaseD3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseD3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f54340b.f()).execute();
                    sQLiteDatabaseD3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseD3.endTransaction();
                }
            default:
                k5.g gVar2 = (k5.g) obj;
                Iterator it = ((Iterable) ((y8.h) ((y8.d) gVar2.f44326b)).j(new xa.b(23))).iterator();
                while (it.hasNext()) {
                    ((r1.s) gVar2.f44327c).m((r8.i) it.next(), 1, false);
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0547 A[Catch: Exception -> 0x054d, TryCatch #1 {Exception -> 0x054d, blocks: (B:99:0x0439, B:101:0x050f, B:103:0x051b, B:105:0x0547, B:109:0x0551, B:111:0x0559, B:113:0x0567, B:115:0x056d, B:117:0x0576, B:118:0x057a, B:102:0x0518, B:100:0x0505), top: B:141:0x0439, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x057e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0587  */
    /* JADX WARN: Code duplicated, block: B:126:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x060d  */
    /* JADX WARN: Code duplicated, block: B:137:0x061c  */
    /* JADX WARN: Code duplicated, block: B:143:0x03d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x023d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0269  */
    /* JADX WARN: Code duplicated, block: B:55:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x031d A[LOOP:3: B:67:0x0317->B:69:0x031d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0331  */
    /* JADX WARN: Code duplicated, block: B:73:0x0338  */
    /* JADX WARN: Code duplicated, block: B:76:0x033d  */
    /* JADX WARN: Code duplicated, block: B:77:0x033f  */
    /* JADX WARN: Code duplicated, block: B:83:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:85:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x041a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0425  */
    /* JADX WARN: Code duplicated, block: B:96:0x042a  */
    @Override // tb.d
    public Object g(tb.s sVar) {
        zb.r rVar;
        String str;
        ac.g gVar;
        int i10;
        Throwable th2;
        String strN;
        String str2;
        vb.c cVar;
        long jCurrentTimeMillis;
        String strJ;
        String str3;
        String str4;
        String strN2;
        String strD;
        int iE;
        String string;
        String[] strArr;
        ArrayList arrayList;
        int i11;
        StringBuilder sb2;
        Iterator it;
        String string2;
        String strI;
        int i12;
        com.google.android.gms.internal.consent_sdk.d dVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        hc.b bVarD;
        zb.u uVar;
        Task taskOnSuccessTask;
        zb.r rVar2;
        boolean zC;
        String str5;
        String str6;
        ac.g gVar2;
        boolean zExists;
        NetworkInfo activeNetworkInfo;
        hc.b bVarD2;
        String str7;
        String string3;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f50841b;
        int i13 = CrashlyticsRegistrar.f24665d;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        mb.g gVar3 = (mb.g) sVar.a(mb.g.class);
        uc.d dVar2 = (uc.d) sVar.a(uc.d.class);
        tb.o oVarH = sVar.h(wb.a.class);
        tb.o oVarH2 = sVar.h(qb.b.class);
        tb.o oVarH3 = sVar.h(sd.a.class);
        ExecutorService executorService = (ExecutorService) sVar.g(crashlyticsRegistrar.f24666a);
        ExecutorService executorService2 = (ExecutorService) sVar.g(crashlyticsRegistrar.f24667b);
        ExecutorService executorService3 = (ExecutorService) sVar.g(crashlyticsRegistrar.f24668c);
        gVar3.a();
        Context context = gVar3.f45928a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.0 for " + packageName, null);
        ac.g gVar4 = new ac.g(executorService, executorService2);
        fc.f fVar = new fc.f(context);
        zb.u uVar2 = new zb.u(gVar3);
        zb.x xVar = new zb.x(context, packageName, dVar2, uVar2);
        wb.a aVar = new wb.a(oVarH);
        vb.b bVar = new vb.b(oVarH2);
        zb.h hVar = new zb.h(uVar2, fVar);
        vd.c cVar2 = vd.c.f52564a;
        vd.d dVar3 = vd.d.f52566a;
        vd.c cVar3 = vd.c.f52564a;
        vd.a aVarA = vd.c.a(dVar3);
        if (aVarA.f52556b != null) {
            Log.d("FirebaseSessions", "Subscriber " + dVar3 + " already registered.");
        } else {
            aVarA.f52556b = hVar;
            Log.d("FirebaseSessions", "Subscriber " + dVar3 + " registered.");
            aVarA.f52555a.countDown();
        }
        zb.r rVar3 = new zb.r(gVar3, xVar, aVar, uVar2, new vb.a(bVar), new vb.a(bVar), fVar, hVar, new qj.x(oVarH3, 16), gVar4);
        ac.g gVar5 = rVar3.f54750p;
        gVar3.a();
        String str8 = gVar3.f45930c.f45944b;
        int iE2 = zb.f.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iE2 == 0) {
            iE2 = zb.f.e(context, "com.crashlytics.android.build_id", "string");
        }
        String string4 = iE2 != 0 ? context.getResources().getString(iE2) : null;
        ArrayList<zb.c> arrayList2 = new ArrayList();
        int iE3 = zb.f.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iE4 = zb.f.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iE5 = zb.f.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        try {
            try {
                try {
                    if (iE3 == 0 || iE4 == 0 || iE5 == 0) {
                        rVar = rVar3;
                        str = str8;
                        gVar = gVar5;
                        String str9 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iE3), Integer.valueOf(iE4), Integer.valueOf(iE5));
                        i10 = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            th2 = null;
                            Log.d("FirebaseCrashlytics", str9, null);
                        }
                        strN = defpackage.e.n("Mapping file ID is: ", string4);
                        if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                            Log.d("FirebaseCrashlytics", strN, th2);
                        }
                        for (zb.c cVar4 : arrayList2) {
                            String str10 = cVar4.f54675a;
                            String str11 = cVar4.f54676b;
                            String str12 = cVar4.f54677c;
                            StringBuilder sbV = defpackage.e.v("Build id for ", str10, " on ", str11, ": ");
                            sbV.append(str12);
                            string3 = sbV.toString();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", string3, null);
                            }
                        }
                        v6.c cVar5 = new v6.c(context, 6);
                        String packageName2 = context.getPackageName();
                        String strD2 = xVar.d();
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                        String string5 = Long.toString(packageInfo.getLongVersionCode());
                        str3 = packageInfo.versionName;
                        if (str3 == null) {
                            str3 = "0.0";
                        }
                        String str13 = str3;
                        j30 j30Var = new j30(str, string4, arrayList2, strD2, packageName2, string5, str13, cVar5, false);
                        str4 = str;
                        strN2 = defpackage.e.n("Installer package name is: ", strD2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strN2, null);
                        }
                        int i14 = 10;
                        ea.a0 a0Var = new ea.a0(i14);
                        strD = xVar.d();
                        v1.j jVar = new v1.j(18);
                        od.c cVar6 = new od.c(jVar, i14);
                        n5.f fVar2 = new n5.f(fVar);
                        Locale locale = Locale.US;
                        hc.a aVar2 = new hc.a(defpackage.e.o("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings"), a0Var);
                        String str14 = Build.MANUFACTURER;
                        String str15 = zb.x.f54776h;
                        String strI2 = wi.d.i(str14.replaceAll(str15, ""), "/", Build.MODEL.replaceAll(str15, ""));
                        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str15, "");
                        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str15, "");
                        iE = zb.f.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                        if (iE == 0) {
                            iE = zb.f.e(context, "com.crashlytics.android.build_id", "string");
                        }
                        if (iE != 0) {
                            string = context.getResources().getString(iE);
                        } else {
                            string = null;
                        }
                        strArr = new String[]{string, str4, str13, string5};
                        arrayList = new ArrayList();
                        i11 = 0;
                        while (i11 < 4) {
                            str7 = strArr[i11];
                            String str16 = str4;
                            if (str7 != null) {
                                arrayList.add(str7.replace("-", "").toLowerCase(Locale.US));
                            }
                            i11++;
                            str4 = str16;
                        }
                        String str17 = str4;
                        Collections.sort(arrayList);
                        sb2 = new StringBuilder();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb2.append((String) it.next());
                        }
                        string2 = sb2.toString();
                        if (string2.length() > 0) {
                            strI = zb.f.i(string2);
                        } else {
                            strI = null;
                        }
                        if (strD != null) {
                            i12 = 4;
                        } else {
                            i12 = 1;
                        }
                        hc.e eVar = new hc.e(str17, strI2, strReplaceAll, strReplaceAll2, xVar, strI, str13, string5, wi.d.c(i12));
                        dVar = new com.google.android.gms.internal.consent_sdk.d();
                        AtomicReference atomicReference3 = new AtomicReference();
                        dVar.f22988h = atomicReference3;
                        dVar.f22989i = new AtomicReference(new TaskCompletionSource());
                        dVar.f22981a = context;
                        dVar.f22982b = eVar;
                        dVar.f22984d = jVar;
                        dVar.f22983c = cVar6;
                        dVar.f22985e = fVar2;
                        dVar.f22986f = aVar2;
                        dVar.f22987g = uVar2;
                        atomicReference3.set(ea.b0.b(jVar));
                        atomicReference = (AtomicReference) dVar.f22989i;
                        atomicReference2 = (AtomicReference) dVar.f22988h;
                        if (((Context) dVar.f22981a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((hc.e) dVar.f22982b).f42310f) || (bVarD2 = dVar.d(1)) == null) {
                            bVarD = dVar.d(3);
                            if (bVarD != null) {
                                atomicReference2.set(bVarD);
                                ((TaskCompletionSource) atomicReference.get()).trySetResult(bVarD);
                            }
                            uVar = (zb.u) dVar.f22987g;
                            Task task = uVar.f54770h.getTask();
                            synchronized (uVar.f54765c) {
                                Task task2 = uVar.f54766d.getTask();
                            }
                            taskOnSuccessTask = ac.b.a(task, task2).onSuccessTask(gVar4.f3462a, new eb.d0(18, dVar, gVar4));
                        } else {
                            atomicReference2.set(bVarD2);
                            ((TaskCompletionSource) atomicReference.get()).trySetResult(bVarD2);
                            taskOnSuccessTask = Tasks.forResult(null);
                        }
                        taskOnSuccessTask.addOnFailureListener(executorService3, new ud.t(5));
                        rVar2 = rVar;
                        fc.f fVar3 = rVar2.f54745j;
                        Context context2 = rVar2.f54736a;
                        zC = zb.f.c(context2, "com.google.firebase.crashlytics.RequireBuildId", zb.f.c(context2, "com.crashlytics.RequireBuildId", true));
                        str5 = (String) j30Var.f15947a;
                        if (zC) {
                            str2 = "FirebaseCrashlytics";
                            if (TextUtils.isEmpty(str5)) {
                                Log.e(str2, ".");
                                Log.e(str2, ".     |  | ");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".   \\ |  | /");
                                Log.e(str2, ".    \\    /");
                                Log.e(str2, ".     \\  /");
                                Log.e(str2, ".      \\/");
                                Log.e(str2, ".");
                                Log.e(str2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                Log.e(str2, ".");
                                Log.e(str2, ".      /\\");
                                Log.e(str2, ".     /  \\");
                                Log.e(str2, ".    /    \\");
                                Log.e(str2, ".   / |  | \\");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".     |  |");
                                Log.e(str2, ".");
                                throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            }
                        } else {
                            str2 = "FirebaseCrashlytics";
                            if (Log.isLoggable(str2, 2)) {
                                Log.v(str2, "Configured not to require a build ID.", null);
                            }
                        }
                        str6 = new zb.d().f54680a;
                        boolean z10 = false;
                        rVar2.f54741f = new wi.b(z10, "crash_marker", fVar3);
                        rVar2.f54740e = new wi.b(z10, "initialization_marker", fVar3);
                        gVar2 = gVar;
                        fc.f fVar4 = new fc.f(str6, fVar3, gVar2);
                        bc.f fVar5 = new bc.f(fVar3);
                        eb.d0 d0Var = new eb.d0(new ic.a[]{new ea.b0(28)});
                        qj.x xVar2 = rVar2.f54749o;
                        xVar2.getClass();
                        ((tb.o) xVar2.f49096b).a(new i0(new wb.b(fVar4), 6));
                        rVar2.f54743h = new zb.l(rVar2.f54736a, rVar2.f54744i, rVar2.f54737b, rVar2.f54745j, rVar2.f54741f, j30Var, fVar4, fVar5, fc.f.j(rVar2.f54736a, rVar2.f54744i, rVar2.f54745j, j30Var, fVar5, fVar4, d0Var, dVar, rVar2.f54738c, rVar2.f54747m, rVar2.f54750p), rVar2.f54748n, rVar2.l, rVar2.f54747m, rVar2.f54750p);
                        wi.b bVar2 = rVar2.f54740e;
                        fc.f fVar6 = (fc.f) bVar2.f53212b;
                        String str18 = (String) bVar2.f53211a;
                        fVar6.getClass();
                        zExists = new File((File) fVar6.f40782d, str18).exists();
                        rVar2.f54742g = Boolean.TRUE.equals((Boolean) gVar2.f3462a.f3457a.submit(new hc.c(rVar2, 4)).get(3L, TimeUnit.SECONDS));
                        zb.l lVar = rVar2.f54743h;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        lVar.f54717o = dVar;
                        lVar.f54708e.f3462a.a(new w1.b(6, lVar, str6));
                        zb.t tVar = new zb.t(new xh.e(lVar), dVar, defaultUncaughtExceptionHandler, lVar.f54713j);
                        lVar.f54716n = tVar;
                        Thread.setDefaultUncaughtExceptionHandler(tVar);
                        if (Build.VERSION.SDK_INT >= 37) {
                            rVar2.f54743h.e(str6);
                        }
                        if (zExists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            gVar2.f3462a.a(new zb.m(rVar2, dVar, 0));
                        } else {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            rVar2.b(dVar);
                        }
                        cVar = new vb.c(rVar2);
                        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                        if (jCurrentTimeMillis > 16) {
                            strJ = defpackage.e.j(jCurrentTimeMillis, "Initializing Crashlytics blocked main for ", " ms");
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, strJ, null);
                            }
                        }
                        return cVar;
                    }
                    String[] stringArray = context.getResources().getStringArray(iE3);
                    String[] stringArray2 = context.getResources().getStringArray(iE4);
                    String[] stringArray3 = context.getResources().getStringArray(iE5);
                    str = str8;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i15 = 0;
                        while (i15 < stringArray3.length) {
                            int i16 = i15;
                            arrayList2.add(new zb.c(stringArray[i16], stringArray2[i16], stringArray3[i16]));
                            i15 = i16 + 1;
                            gVar5 = gVar5;
                            rVar3 = rVar3;
                        }
                        rVar = rVar3;
                        gVar = gVar5;
                    } else {
                        rVar = rVar3;
                        gVar = gVar5;
                        String str19 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str19, null);
                        }
                    }
                    i10 = 3;
                    rVar2.f54742g = Boolean.TRUE.equals((Boolean) gVar2.f3462a.f3457a.submit(new hc.c(rVar2, 4)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                    rVar2.f54742g = false;
                }
                boolean z11 = false;
                rVar2.f54741f = new wi.b(z11, "crash_marker", fVar3);
                rVar2.f54740e = new wi.b(z11, "initialization_marker", fVar3);
                gVar2 = gVar;
                fc.f fVar7 = new fc.f(str6, fVar3, gVar2);
                bc.f fVar8 = new bc.f(fVar3);
                eb.d0 d0Var2 = new eb.d0(new ic.a[]{new ea.b0(28)});
                qj.x xVar3 = rVar2.f54749o;
                xVar3.getClass();
                ((tb.o) xVar3.f49096b).a(new i0(new wb.b(fVar7), 6));
                rVar2.f54743h = new zb.l(rVar2.f54736a, rVar2.f54744i, rVar2.f54737b, rVar2.f54745j, rVar2.f54741f, j30Var, fVar7, fVar8, fc.f.j(rVar2.f54736a, rVar2.f54744i, rVar2.f54745j, j30Var, fVar8, fVar7, d0Var2, dVar, rVar2.f54738c, rVar2.f54747m, rVar2.f54750p), rVar2.f54748n, rVar2.l, rVar2.f54747m, rVar2.f54750p);
                wi.b bVar3 = rVar2.f54740e;
                fc.f fVar9 = (fc.f) bVar3.f53212b;
                String str110 = (String) bVar3.f53211a;
                fVar9.getClass();
                zExists = new File((File) fVar9.f40782d, str110).exists();
                zb.l lVar2 = rVar2.f54743h;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                lVar2.f54717o = dVar;
                lVar2.f54708e.f3462a.a(new w1.b(6, lVar2, str6));
                zb.t tVar2 = new zb.t(new xh.e(lVar2), dVar, defaultUncaughtExceptionHandler2, lVar2.f54713j);
                lVar2.f54716n = tVar2;
                Thread.setDefaultUncaughtExceptionHandler(tVar2);
                if (Build.VERSION.SDK_INT >= 37) {
                    rVar2.f54743h.e(str6);
                }
                if (zExists) {
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "Successfully configured exception handler.", null);
                    }
                    gVar2.f3462a.a(new zb.m(rVar2, dVar, 0));
                } else {
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "Successfully configured exception handler.", null);
                    }
                    gVar2.f3462a.a(new zb.m(rVar2, dVar, 0));
                }
            } catch (Exception e10) {
                Log.e(str2, "Crashlytics was not started due to an exception during initialization", e10);
                rVar2.f54743h = null;
            }
            String packageName3 = context.getPackageName();
            String strD3 = xVar.d();
            PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(packageName3, 0);
            String string6 = Long.toString(packageInfo2.getLongVersionCode());
            str3 = packageInfo2.versionName;
            if (str3 == null) {
                str3 = "0.0";
            }
            String str111 = str3;
            j30 j30Var2 = new j30(str, string4, arrayList2, strD3, packageName3, string6, str111, cVar5, false);
            str4 = str;
            strN2 = defpackage.e.n("Installer package name is: ", strD3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strN2, null);
            }
            int i17 = 10;
            ea.a0 a0Var2 = new ea.a0(i17);
            strD = xVar.d();
            v1.j jVar2 = new v1.j(18);
            od.c cVar7 = new od.c(jVar2, i17);
            n5.f fVar10 = new n5.f(fVar);
            Locale locale2 = Locale.US;
            hc.a aVar3 = new hc.a(defpackage.e.o("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str4, "/settings"), a0Var2);
            String str112 = Build.MANUFACTURER;
            String str113 = zb.x.f54776h;
            String strI3 = wi.d.i(str112.replaceAll(str113, ""), "/", Build.MODEL.replaceAll(str113, ""));
            String strReplaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str113, "");
            String strReplaceAll4 = Build.VERSION.RELEASE.replaceAll(str113, "");
            iE = zb.f.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iE == 0) {
                iE = zb.f.e(context, "com.crashlytics.android.build_id", "string");
            }
            if (iE != 0) {
                string = context.getResources().getString(iE);
            } else {
                string = null;
            }
            strArr = new String[]{string, str4, str111, string6};
            arrayList = new ArrayList();
            i11 = 0;
            while (i11 < 4) {
                str7 = strArr[i11];
                String str114 = str4;
                if (str7 != null) {
                    arrayList.add(str7.replace("-", "").toLowerCase(Locale.US));
                }
                i11++;
                str4 = str114;
            }
            String str115 = str4;
            Collections.sort(arrayList);
            sb2 = new StringBuilder();
            it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            string2 = sb2.toString();
            if (string2.length() > 0) {
                strI = zb.f.i(string2);
            } else {
                strI = null;
            }
            if (strD != null) {
                i12 = 4;
            } else {
                i12 = 1;
            }
            hc.e eVar2 = new hc.e(str115, strI3, strReplaceAll3, strReplaceAll4, xVar, strI, str111, string6, wi.d.c(i12));
            dVar = new com.google.android.gms.internal.consent_sdk.d();
            AtomicReference atomicReference4 = new AtomicReference();
            dVar.f22988h = atomicReference4;
            dVar.f22989i = new AtomicReference(new TaskCompletionSource());
            dVar.f22981a = context;
            dVar.f22982b = eVar2;
            dVar.f22984d = jVar2;
            dVar.f22983c = cVar7;
            dVar.f22985e = fVar10;
            dVar.f22986f = aVar3;
            dVar.f22987g = uVar2;
            atomicReference4.set(ea.b0.b(jVar2));
            atomicReference = (AtomicReference) dVar.f22989i;
            atomicReference2 = (AtomicReference) dVar.f22988h;
            if (((Context) dVar.f22981a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((hc.e) dVar.f22982b).f42310f)) {
                bVarD = dVar.d(3);
                if (bVarD != null) {
                    atomicReference2.set(bVarD);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(bVarD);
                }
                uVar = (zb.u) dVar.f22987g;
                Task task3 = uVar.f54770h.getTask();
                synchronized (uVar.f54765c) {
                    Task task4 = uVar.f54766d.getTask();
                    taskOnSuccessTask = ac.b.a(task3, task4).onSuccessTask(gVar4.f3462a, new eb.d0(18, dVar, gVar4));
                }
            } else {
                bVarD = dVar.d(3);
                if (bVarD != null) {
                    atomicReference2.set(bVarD);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(bVarD);
                }
                uVar = (zb.u) dVar.f22987g;
                Task task5 = uVar.f54770h.getTask();
                synchronized (uVar.f54765c) {
                    Task task6 = uVar.f54766d.getTask();
                    taskOnSuccessTask = ac.b.a(task5, task6).onSuccessTask(gVar4.f3462a, new eb.d0(18, dVar, gVar4));
                }
            }
            taskOnSuccessTask.addOnFailureListener(executorService3, new ud.t(5));
            rVar2 = rVar;
            fc.f fVar11 = rVar2.f54745j;
            Context context3 = rVar2.f54736a;
            zC = zb.f.c(context3, "com.google.firebase.crashlytics.RequireBuildId", zb.f.c(context3, "com.crashlytics.RequireBuildId", true));
            str5 = (String) j30Var2.f15947a;
            if (zC) {
                str2 = "FirebaseCrashlytics";
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Configured not to require a build ID.", null);
                }
            } else {
                str2 = "FirebaseCrashlytics";
                if (TextUtils.isEmpty(str5)) {
                    Log.e(str2, ".");
                    Log.e(str2, ".     |  | ");
                    Log.e(str2, ".     |  |");
                    Log.e(str2, ".     |  |");
                    Log.e(str2, ".   \\ |  | /");
                    Log.e(str2, ".    \\    /");
                    Log.e(str2, ".     \\  /");
                    Log.e(str2, ".      \\/");
                    Log.e(str2, ".");
                    Log.e(str2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    Log.e(str2, ".");
                    Log.e(str2, ".      /\\");
                    Log.e(str2, ".     /  \\");
                    Log.e(str2, ".    /    \\");
                    Log.e(str2, ".   / |  | \\");
                    Log.e(str2, ".     |  |");
                    Log.e(str2, ".     |  |");
                    Log.e(str2, ".     |  |");
                    Log.e(str2, ".");
                    throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                }
            }
            str6 = new zb.d().f54680a;
            cVar = new vb.c(rVar2);
        } catch (PackageManager.NameNotFoundException e11) {
            str2 = "FirebaseCrashlytics";
            Log.e(str2, "Error retrieving app package info.", e11);
            cVar = null;
        }
        th2 = null;
        strN = defpackage.e.n("Mapping file ID is: ", string4);
        if (Log.isLoggable("FirebaseCrashlytics", i10)) {
            Log.d("FirebaseCrashlytics", strN, th2);
        }
        while (r2.hasNext()) {
            String str116 = cVar4.f54675a;
            String str117 = cVar4.f54676b;
            String str118 = cVar4.f54677c;
            StringBuilder sbV2 = defpackage.e.v("Build id for ", str116, " on ", str117, ": ");
            sbV2.append(str118);
            string3 = sbV2.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string3, null);
            }
        }
        v6.c cVar8 = new v6.c(context, 6);
        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
        if (jCurrentTimeMillis > 16) {
            strJ = defpackage.e.j(jCurrentTimeMillis, "Initializing Crashlytics blocked main for ", " ms");
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, strJ, null);
            }
        }
        return cVar;
    }

    @Override // h.b
    public void onActivityResult(Object obj) {
        ((a4.b) this.f50841b).invoke((h.a) obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i10 = this.f50840a;
        Object obj = this.f50841b;
        switch (i10) {
            case 19:
                zc.c0.b((Intent) obj);
                break;
            default:
                ((zc.e0) obj).f54821b.trySetResult(null);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((com.ironsource.sdk.controller.y) this.f50841b).invoke(obj);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xi.b
    public void t(Object obj, wi.b bVar) {
        x5.f fVar = (x5.f) this.f50841b;
        hj.b bVar2 = new hj.b(bVar, 18);
        x5.g gVar = (x5.g) fVar;
        gVar.getClass();
        Context context = gVar.f53659a;
        kotlin.jvm.internal.n.c(context);
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        x5.a aVar = x5.a.MANUALLY;
        if (installerPackageName == null) {
            bVar2.invoke(new wj.h(gVar.a(x5.c.DEBUG, aVar)));
            return;
        }
        int iHashCode = installerPackageName.hashCode();
        x5.c cVar = x5.c.APP_STORE;
        switch (iHashCode) {
            case -1637701853:
                if (installerPackageName.equals("com.huawei.appmarket")) {
                    bVar2.invoke(new wj.h(gVar.a(cVar, x5.a.HUAWEI_APP_GALLERY)));
                    return;
                }
                break;
            case -1225090538:
                if (installerPackageName.equals("com.sec.android.app.samsungapps")) {
                    bVar2.invoke(new wj.h(gVar.a(cVar, x5.a.SAMSUNG_APP_SHOP)));
                    return;
                }
                break;
            case -1046965711:
                if (installerPackageName.equals("com.android.vending")) {
                    bVar2.invoke(new wj.h(gVar.a(cVar, x5.a.GOOGLE_PLAY)));
                    return;
                }
                break;
            case 307846473:
                if (installerPackageName.equals("com.google.android.packageinstaller")) {
                    bVar2.invoke(new wj.h(gVar.a(x5.c.UNKNOWN, aVar)));
                    return;
                }
                break;
            case 421787184:
                if (installerPackageName.equals("com.xiaomi.mipicks")) {
                    bVar2.invoke(new wj.h(gVar.a(cVar, x5.a.XIAOMI_APP_STORE)));
                    return;
                }
                break;
            case 705013521:
                if (installerPackageName.equals("com.amazon")) {
                    bVar2.invoke(new wj.h(gVar.a(cVar, x5.a.AMAZON_APP_STORE)));
                    return;
                }
                break;
            case 931347805:
                if (installerPackageName.equals("com.oppo.market")) {
                    bVar2.invoke(new wj.h(gVar.a(cVar, x5.a.OPPO_APP_MARKET)));
                    return;
                }
                break;
            case 1757178037:
                if (installerPackageName.equals("com.vivo.appstore")) {
                    bVar2.invoke(new wj.h(gVar.a(cVar, x5.a.VIVO_APP_STORE)));
                    return;
                }
                break;
        }
        bVar2.invoke(new wj.h(t9.e.c(new Exception("Unknown installer ".concat(installerPackageName)))));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        Exception exception;
        int i10 = this.f50840a;
        Object obj = this.f50841b;
        switch (i10) {
            case 16:
                ((CountDownLatch) obj).countDown();
                return null;
            case 17:
                nf nfVar = (nf) obj;
                nfVar.getClass();
                if (task.isSuccessful() || (exception = task.getException()) == null || TextUtils.isEmpty(exception.getMessage()) || !exception.getMessage().contains("FID_ALREADY_USED:")) {
                    return task;
                }
                Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                ((uc.c) ((uc.d) nfVar.f23784d)).f51987c.r().delete();
                return nfVar.t();
            default:
                ((com.google.android.gms.internal.consent_sdk.x) obj).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
