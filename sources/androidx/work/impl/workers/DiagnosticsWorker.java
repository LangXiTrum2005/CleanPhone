package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import d5.b;
import d5.n;
import d5.o;
import d5.u;
import defpackage.e;
import e5.l;
import g4.h;
import j1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m0.s1;
import m5.d;
import m5.i;
import m5.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5050b = o.i("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(s1 s1Var, k kVar, g9.k kVar2, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d dVarW = kVar2.w(iVar.f45882a);
            Integer numValueOf = dVarW != null ? Integer.valueOf(dVarW.f45875b) : null;
            String str2 = iVar.f45882a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s1Var.f45751b;
            h hVarB = h.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                hVarB.h(1);
            } else {
                hVarB.j(1, str2);
            }
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(hVarB);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                hVarB.k();
                ArrayList arrayListA = kVar.A(iVar.f45882a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListA);
                String str3 = iVar.f45882a;
                String str4 = iVar.f45884c;
                switch (iVar.f45883b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder sbV = e.v("\n", str3, "\t ", str4, "\t ");
                sbV.append(numValueOf);
                sbV.append("\t ");
                sbV.append(str);
                sbV.append("\t ");
                sb2.append(u.h(sbV, strJoin, "\t ", strJoin2, "\t"));
            } catch (Throwable th2) {
                cursorG.close();
                hVarB.k();
                throw th2;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final n doWork() throws Throwable {
        h hVar;
        g9.k kVar;
        s1 s1Var;
        k kVar2;
        int i10;
        WorkDatabase workDatabase = l.b(getApplicationContext()).f39111c;
        com.google.android.gms.internal.consent_sdk.d dVarN = workDatabase.n();
        s1 s1VarL = workDatabase.l();
        k kVarO = workDatabase.o();
        g9.k kVarK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        dVarN.getClass();
        h hVarB = h.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        hVarB.c(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) dVarN.f22981a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            int iW = com.bumptech.glide.d.w(cursorG, "required_network_type");
            int iW2 = com.bumptech.glide.d.w(cursorG, "requires_charging");
            int iW3 = com.bumptech.glide.d.w(cursorG, "requires_device_idle");
            int iW4 = com.bumptech.glide.d.w(cursorG, "requires_battery_not_low");
            int iW5 = com.bumptech.glide.d.w(cursorG, "requires_storage_not_low");
            int iW6 = com.bumptech.glide.d.w(cursorG, "trigger_content_update_delay");
            int iW7 = com.bumptech.glide.d.w(cursorG, "trigger_max_content_delay");
            int iW8 = com.bumptech.glide.d.w(cursorG, "content_uri_triggers");
            int iW9 = com.bumptech.glide.d.w(cursorG, "id");
            int iW10 = com.bumptech.glide.d.w(cursorG, "state");
            int iW11 = com.bumptech.glide.d.w(cursorG, "worker_class_name");
            hVar = hVarB;
            try {
                int iW12 = com.bumptech.glide.d.w(cursorG, "input_merger_class_name");
                int iW13 = com.bumptech.glide.d.w(cursorG, "input");
                int iW14 = com.bumptech.glide.d.w(cursorG, "output");
                int iW15 = com.bumptech.glide.d.w(cursorG, "initial_delay");
                int iW16 = com.bumptech.glide.d.w(cursorG, "interval_duration");
                int iW17 = com.bumptech.glide.d.w(cursorG, "flex_duration");
                int iW18 = com.bumptech.glide.d.w(cursorG, "run_attempt_count");
                int iW19 = com.bumptech.glide.d.w(cursorG, "backoff_policy");
                int iW20 = com.bumptech.glide.d.w(cursorG, "backoff_delay_duration");
                int iW21 = com.bumptech.glide.d.w(cursorG, "period_start_time");
                int iW22 = com.bumptech.glide.d.w(cursorG, "minimum_retention_duration");
                int iW23 = com.bumptech.glide.d.w(cursorG, "schedule_requested_at");
                int iW24 = com.bumptech.glide.d.w(cursorG, "run_in_foreground");
                int iW25 = com.bumptech.glide.d.w(cursorG, "out_of_quota_policy");
                int i11 = iW14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iW9);
                    int i12 = iW9;
                    String string2 = cursorG.getString(iW11);
                    int i13 = iW11;
                    b bVar = new b();
                    int i14 = iW;
                    bVar.f38676a = f.y(cursorG.getInt(iW));
                    bVar.f38677b = cursorG.getInt(iW2) != 0;
                    bVar.f38678c = cursorG.getInt(iW3) != 0;
                    bVar.f38679d = cursorG.getInt(iW4) != 0;
                    bVar.f38680e = cursorG.getInt(iW5) != 0;
                    int i15 = iW2;
                    int i16 = iW3;
                    bVar.f38681f = cursorG.getLong(iW6);
                    bVar.f38682g = cursorG.getLong(iW7);
                    bVar.f38683h = f.e(cursorG.getBlob(iW8));
                    i iVar = new i(string, string2);
                    iVar.f45883b = f.A(cursorG.getInt(iW10));
                    iVar.f45885d = cursorG.getString(iW12);
                    iVar.f45886e = d5.f.a(cursorG.getBlob(iW13));
                    int i17 = i11;
                    iVar.f45887f = d5.f.a(cursorG.getBlob(i17));
                    int i18 = iW10;
                    int i19 = iW15;
                    iVar.f45888g = cursorG.getLong(i19);
                    int i20 = iW16;
                    int i21 = iW12;
                    iVar.f45889h = cursorG.getLong(i20);
                    int i22 = iW4;
                    int i23 = iW17;
                    iVar.f45890i = cursorG.getLong(i23);
                    int i24 = iW18;
                    iVar.f45892k = cursorG.getInt(i24);
                    int i25 = iW19;
                    int i26 = iW13;
                    iVar.l = f.x(cursorG.getInt(i25));
                    int i27 = iW20;
                    iVar.f45893m = cursorG.getLong(i27);
                    int i28 = iW21;
                    iVar.f45894n = cursorG.getLong(i28);
                    int i29 = iW22;
                    iVar.f45895o = cursorG.getLong(i29);
                    int i30 = iW23;
                    iVar.f45896p = cursorG.getLong(i30);
                    int i31 = iW24;
                    iVar.f45897q = cursorG.getInt(i31) != 0;
                    int i32 = iW25;
                    iVar.f45898r = f.z(cursorG.getInt(i32));
                    iVar.f45891j = bVar;
                    arrayList.add(iVar);
                    iW18 = i24;
                    iW12 = i21;
                    iW16 = i20;
                    iW21 = i28;
                    iW4 = i22;
                    i11 = i17;
                    iW24 = i31;
                    iW2 = i15;
                    iW15 = i19;
                    iW13 = i26;
                    iW17 = i23;
                    iW19 = i25;
                    iW22 = i29;
                    iW20 = i27;
                    iW11 = i13;
                    iW = i14;
                    iW25 = i32;
                    iW23 = i30;
                    iW10 = i18;
                    iW9 = i12;
                    iW3 = i16;
                }
                cursorG.close();
                hVar.k();
                ArrayList arrayListF = dVarN.f();
                ArrayList arrayListC = dVarN.c();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = f5050b;
                if (zIsEmpty) {
                    kVar = kVarK;
                    s1Var = s1VarL;
                    kVar2 = kVarO;
                    i10 = 0;
                } else {
                    i10 = 0;
                    o.g().h(str, "Recently completed work:\n\n", new Throwable[0]);
                    kVar = kVarK;
                    s1Var = s1VarL;
                    kVar2 = kVarO;
                    o.g().h(str, a(s1Var, kVar2, kVar, arrayList), new Throwable[0]);
                }
                if (!arrayListF.isEmpty()) {
                    o.g().h(str, "Running work:\n\n", new Throwable[i10]);
                    o.g().h(str, a(s1Var, kVar2, kVar, arrayListF), new Throwable[i10]);
                }
                if (!arrayListC.isEmpty()) {
                    o.g().h(str, "Enqueued work:\n\n", new Throwable[i10]);
                    o.g().h(str, a(s1Var, kVar2, kVar, arrayListC), new Throwable[i10]);
                }
                return n.a();
            } catch (Throwable th2) {
                th = th2;
                cursorG.close();
                hVar.k();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            hVar = hVarB;
        }
    }
}
