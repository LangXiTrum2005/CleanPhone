package g5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d5.o;
import d5.u;
import e5.l;
import g9.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m5.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f41519d = o.i("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f41521b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41522c = new Object();

    public b(Context context) {
        this.f41520a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public final void c(Intent intent, int i10, h hVar) {
        String action = intent.getAction();
        int i11 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o.g().e(f41519d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f41520a;
            d dVar = new d(context, i10, hVar);
            i5.c cVar = dVar.f41526b;
            ArrayList<i> arrayListG = hVar.f41548e.f39111c.n().g();
            String str = c.f41523a;
            Iterator it = arrayListG.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                d5.b bVar = ((i) it.next()).f45891j;
                z10 |= bVar.f38679d;
                z11 |= bVar.f38677b;
                z12 |= bVar.f38680e;
                z13 |= bVar.f38676a != 1;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f5029a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            cVar.b(arrayListG);
            ArrayList arrayList = new ArrayList(arrayListG.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (i iVar : arrayListG) {
                String str3 = iVar.f45882a;
                if (jCurrentTimeMillis >= iVar.a() && (!iVar.b() || cVar.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((i) it2.next()).f45882a;
                Intent intentA = a(context, str4);
                o.g().e(d.f41524c, defpackage.e.o("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                hVar.d(new g(dVar.f41525a, i11, hVar, intentA));
            }
            cVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o.g().e(f41519d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            hVar.f41548e.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            o.g().f(f41519d, defpackage.e.o("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f41522c) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        o oVarG = o.g();
                        String str5 = f41519d;
                        oVarG.e(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f41521b.containsKey(string)) {
                            o.g().e(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            e eVar = new e(this.f41520a, i10, string, hVar);
                            this.f41521b.put(string, eVar);
                            eVar.b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    o.g().k(f41519d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z14 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                o.g().e(f41519d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
                e(string2, z14);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            o.g().e(f41519d, defpackage.e.n("Handing stopWork work for ", string3), new Throwable[0]);
            hVar.f41548e.g(string3);
            Context context2 = this.f41520a;
            l lVar = hVar.f41548e;
            String str6 = a.f41518a;
            k kVarK = lVar.f39111c.k();
            m5.d dVarW = kVarK.w(string3);
            if (dVarW != null) {
                a.a(context2, dVarW.f45875b, string3);
                o.g().e(a.f41518a, defpackage.e.o("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                kVarK.C(string3);
            }
            hVar.e(string3, false);
            return;
        }
        Context context3 = this.f41520a;
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        o oVarG2 = o.g();
        String str7 = f41519d;
        oVarG2.e(str7, defpackage.e.n("Handling schedule work for ", string4), new Throwable[0]);
        l lVar2 = hVar.f41548e;
        WorkDatabase workDatabase = lVar2.f39111c;
        workDatabase.c();
        try {
            i iVarL = workDatabase.n().l(string4);
            if (iVarL == null) {
                o.g().k(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (u.a(iVarL.f45883b)) {
                o.g().k(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = iVarL.a();
            if (iVarL.b()) {
                o.g().e(str7, "Opportunistically setting an alarm for " + string4 + " at " + jA, new Throwable[0]);
                a.b(context3, lVar2, string4, jA);
                Intent intent3 = new Intent(context3, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                hVar.d(new g(i10, i11, hVar, intent3));
            } else {
                o.g().e(str7, "Setting up Alarms for " + string4 + " at " + jA, new Throwable[0]);
                a.b(context3, lVar2, string4, jA);
            }
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }

    @Override // e5.a
    public final void e(String str, boolean z10) {
        synchronized (this.f41522c) {
            try {
                e5.a aVar = (e5.a) this.f41521b.remove(str);
                if (aVar != null) {
                    aVar.e(str, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
