package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5123yg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5290a;
    public final C4571sP b;
    public final InterfaceC3562gs c;
    public final InterfaceC3466fm0 d;
    public final Executor e;
    public final La0 f;
    public final InterfaceC2438Gf g;
    public final InterfaceC2438Gf h;
    public final InterfaceC4768uf i;

    public C5123yg0(Context context, C4571sP c4571sP, InterfaceC3562gs interfaceC3562gs, InterfaceC3466fm0 interfaceC3466fm0, Executor executor, La0 la0, InterfaceC2438Gf interfaceC2438Gf, InterfaceC2438Gf interfaceC2438Gf2, InterfaceC4768uf interfaceC4768uf) {
        this.f5290a = context;
        this.b = c4571sP;
        this.c = interfaceC3562gs;
        this.d = interfaceC3466fm0;
        this.e = executor;
        this.f = la0;
        this.g = interfaceC2438Gf;
        this.h = interfaceC2438Gf2;
        this.i = interfaceC4768uf;
    }

    public final void a(Sd0 sd0, int i) {
        SQLiteDatabase sQLiteDatabase;
        Qd0 qd0;
        E20 e20;
        T7 t7;
        String str;
        T7 t8;
        int i2;
        Object objApply;
        ArrayList arrayList;
        Iterator it;
        String str2;
        E20 e21;
        C3274de0 c3274de0;
        final C5123yg0 c5123yg0 = this;
        final Sd0 sd1 = sd0;
        Qd0 qd0A = c5123yg0.b.a(((C4289p8) sd1).f4824a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            Ka0 ka0 = new Ka0(c5123yg0) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vg0
                public final /* synthetic */ C5123yg0 b;

                {
                    this.b = c5123yg0;
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ka0
                public final Object execute() {
                    int i4 = i3;
                    final Sd0 sd2 = sd1;
                    C5123yg0 c5123yg1 = this.b;
                    switch (i4) {
                        case 0:
                            final E20 e22 = (E20) c5123yg1.c;
                            e22.getClass();
                            final int i5 = 1;
                            Boolean bool = (Boolean) e22.k(new C20() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z20
                                /* JADX WARN: Code duplicated, block: B:22:0x0095  */
                                /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
                                /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
                                /* JADX WARN: Code duplicated, block: B:35:0x0110 A[LOOP:3: B:33:0x010a->B:35:0x0110, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:44:0x00ad A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:46:0x00f4 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:48:0x00db A[SYNTHETIC] */
                                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
                                public final Object apply(Object obj) {
                                    HashMap map;
                                    StringBuilder sb;
                                    ListIterator listIterator;
                                    C3675i8 c3675i8;
                                    C4092mw c4092mwC;
                                    int i6 = i5;
                                    Sd0 sd3 = sd2;
                                    E20 e23 = e22;
                                    switch (i6) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            Z7 z7 = e23.d;
                                            ArrayList arrayListM = e23.m(sQLiteDatabase2, sd3, z7.b);
                                            for (HV hv : HV.values()) {
                                                if (hv != ((C4289p8) sd3).c) {
                                                    int size = z7.b - arrayListM.size();
                                                    if (size <= 0) {
                                                        map = new HashMap();
                                                        sb = new StringBuilder("event_id IN (");
                                                        for (int i7 = 0; i7 < arrayListM.size(); i7++) {
                                                            sb.append(((C3675i8) arrayListM.get(i7)).f4490a);
                                                            if (i7 < arrayListM.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        E20.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new Md0(map, 11));
                                                        listIterator = arrayListM.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            c3675i8 = (C3675i8) listIterator.next();
                                                            if (!map.containsKey(Long.valueOf(c3675i8.f4490a))) {
                                                                c4092mwC = c3675i8.c.c();
                                                                long j = c3675i8.f4490a;
                                                                for (D20 d20 : (Set) map.get(Long.valueOf(j))) {
                                                                    c4092mwC.a(d20.f2953a, d20.b);
                                                                }
                                                                listIterator.set(new C3675i8(j, c3675i8.b, c4092mwC.b()));
                                                            }
                                                        }
                                                        return arrayListM;
                                                    }
                                                    sd3.getClass();
                                                    C4201o8 c4201o8A = Sd0.a();
                                                    C4289p8 c4289p8 = (C4289p8) sd3;
                                                    c4201o8A.b(c4289p8.f4824a);
                                                    c4201o8A.c(hv);
                                                    c4201o8A.b = c4289p8.b;
                                                    arrayListM.addAll(e23.m(sQLiteDatabase2, c4201o8A.a(), size));
                                                }
                                            }
                                            map = new HashMap();
                                            sb = new StringBuilder("event_id IN (");
                                            while (i7 < arrayListM.size()) {
                                                sb.append(((C3675i8) arrayListM.get(i7)).f4490a);
                                                if (i7 < arrayListM.size() - 1) {
                                                    sb.append(',');
                                                }
                                            }
                                            sb.append(')');
                                            E20.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new Md0(map, 11));
                                            listIterator = arrayListM.listIterator();
                                            while (listIterator.hasNext()) {
                                                c3675i8 = (C3675i8) listIterator.next();
                                                if (!map.containsKey(Long.valueOf(c3675i8.f4490a))) {
                                                    c4092mwC = c3675i8.c.c();
                                                    long j2 = c3675i8.f4490a;
                                                    while (r5.hasNext()) {
                                                        c4092mwC.a(d20.f2953a, d20.b);
                                                    }
                                                    listIterator.set(new C3675i8(j2, c3675i8.b, c4092mwC.b()));
                                                }
                                            }
                                            return arrayListM;
                                        default:
                                            e23.getClass();
                                            Long lI = E20.i((SQLiteDatabase) obj, sd3);
                                            return lI == null ? Boolean.FALSE : (Boolean) E20.p(e23.h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI.toString()}), new Nd0(14));
                                    }
                                }
                            });
                            bool.getClass();
                            return bool;
                        default:
                            final E20 e23 = (E20) c5123yg1.c;
                            e23.getClass();
                            final int i6 = 0;
                            return (Iterable) e23.k(new C20() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z20
                                /* JADX WARN: Code duplicated, block: B:22:0x0095  */
                                /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
                                /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
                                /* JADX WARN: Code duplicated, block: B:35:0x0110 A[LOOP:3: B:33:0x010a->B:35:0x0110, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:44:0x00ad A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:46:0x00f4 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:48:0x00db A[SYNTHETIC] */
                                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
                                public final Object apply(Object obj) {
                                    HashMap map;
                                    StringBuilder sb;
                                    ListIterator listIterator;
                                    C3675i8 c3675i8;
                                    C4092mw c4092mwC;
                                    int i7 = i6;
                                    Sd0 sd3 = sd2;
                                    E20 e24 = e23;
                                    switch (i7) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            Z7 z7 = e24.d;
                                            ArrayList arrayListM = e24.m(sQLiteDatabase2, sd3, z7.b);
                                            for (HV hv : HV.values()) {
                                                if (hv != ((C4289p8) sd3).c) {
                                                    int size = z7.b - arrayListM.size();
                                                    if (size <= 0) {
                                                        map = new HashMap();
                                                        sb = new StringBuilder("event_id IN (");
                                                        for (int i8 = 0; i8 < arrayListM.size(); i8++) {
                                                            sb.append(((C3675i8) arrayListM.get(i8)).f4490a);
                                                            if (i8 < arrayListM.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        E20.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new Md0(map, 11));
                                                        listIterator = arrayListM.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            c3675i8 = (C3675i8) listIterator.next();
                                                            if (!map.containsKey(Long.valueOf(c3675i8.f4490a))) {
                                                                c4092mwC = c3675i8.c.c();
                                                                long j2 = c3675i8.f4490a;
                                                                for (D20 d20 : (Set) map.get(Long.valueOf(j2))) {
                                                                    c4092mwC.a(d20.f2953a, d20.b);
                                                                }
                                                                listIterator.set(new C3675i8(j2, c3675i8.b, c4092mwC.b()));
                                                            }
                                                        }
                                                        return arrayListM;
                                                    }
                                                    sd3.getClass();
                                                    C4201o8 c4201o8A = Sd0.a();
                                                    C4289p8 c4289p8 = (C4289p8) sd3;
                                                    c4201o8A.b(c4289p8.f4824a);
                                                    c4201o8A.c(hv);
                                                    c4201o8A.b = c4289p8.b;
                                                    arrayListM.addAll(e24.m(sQLiteDatabase2, c4201o8A.a(), size));
                                                }
                                            }
                                            map = new HashMap();
                                            sb = new StringBuilder("event_id IN (");
                                            while (i8 < arrayListM.size()) {
                                                sb.append(((C3675i8) arrayListM.get(i8)).f4490a);
                                                if (i8 < arrayListM.size() - 1) {
                                                    sb.append(',');
                                                }
                                            }
                                            sb.append(')');
                                            E20.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new Md0(map, 11));
                                            listIterator = arrayListM.listIterator();
                                            while (listIterator.hasNext()) {
                                                c3675i8 = (C3675i8) listIterator.next();
                                                if (!map.containsKey(Long.valueOf(c3675i8.f4490a))) {
                                                    c4092mwC = c3675i8.c.c();
                                                    long j3 = c3675i8.f4490a;
                                                    while (r5.hasNext()) {
                                                        c4092mwC.a(d20.f2953a, d20.b);
                                                    }
                                                    listIterator.set(new C3675i8(j3, c3675i8.b, c4092mwC.b()));
                                                }
                                            }
                                            return arrayListM;
                                        default:
                                            e24.getClass();
                                            Long lI = E20.i((SQLiteDatabase) obj, sd3);
                                            return lI == null ? Boolean.FALSE : (Boolean) E20.p(e24.h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI.toString()}), new Nd0(14));
                                    }
                                }
                            });
                    }
                }
            };
            E20 e22 = (E20) c5123yg0.f;
            boolean zBooleanValue = ((Boolean) e22.n(ka0)).booleanValue();
            InterfaceC2438Gf interfaceC2438Gf = c5123yg0.g;
            if (!zBooleanValue) {
                C5123yg0 c5123yg1 = c5123yg0;
                Sd0 sd2 = sd1;
                SQLiteDatabase sQLiteDatabaseH = e22.h();
                Nd0 nd0 = new Nd0(9);
                C5211zg0 c5211zg0 = (C5211zg0) e22.c;
                long jA = c5211zg0.a();
                while (true) {
                    try {
                        sQLiteDatabaseH.beginTransaction();
                        sQLiteDatabase = sQLiteDatabaseH;
                        break;
                    } catch (SQLiteDatabaseLockedException e) {
                        sQLiteDatabase = sQLiteDatabaseH;
                        if (c5211zg0.a() >= ((long) e22.d.c) + jA) {
                            nd0.apply(e);
                            break;
                        } else {
                            SystemClock.sleep(50L);
                            sQLiteDatabaseH = sQLiteDatabase;
                        }
                    }
                }
                try {
                    long jA2 = ((C5211zg0) interfaceC2438Gf).a() + jMax;
                    E20 e23 = (E20) c5123yg1.c;
                    e23.getClass();
                    e23.k(new C5069y20(jA2, sd2));
                    sQLiteDatabase.setTransactionSuccessful();
                    return;
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) e22.n(new Ka0(c5123yg0) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vg0
                public final /* synthetic */ C5123yg0 b;

                {
                    this.b = c5123yg0;
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ka0
                public final Object execute() {
                    int i5 = i4;
                    final Sd0 sd3 = sd1;
                    C5123yg0 c5123yg2 = this.b;
                    switch (i5) {
                        case 0:
                            final E20 e24 = (E20) c5123yg2.c;
                            e24.getClass();
                            final int i6 = 1;
                            Boolean bool = (Boolean) e24.k(new C20() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z20
                                /* JADX WARN: Code duplicated, block: B:22:0x0095  */
                                /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
                                /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
                                /* JADX WARN: Code duplicated, block: B:35:0x0110 A[LOOP:3: B:33:0x010a->B:35:0x0110, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:44:0x00ad A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:46:0x00f4 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:48:0x00db A[SYNTHETIC] */
                                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
                                public final Object apply(Object obj) {
                                    HashMap map;
                                    StringBuilder sb;
                                    ListIterator listIterator;
                                    C3675i8 c3675i8;
                                    C4092mw c4092mwC;
                                    int i7 = i6;
                                    Sd0 sd4 = sd3;
                                    E20 e25 = e24;
                                    switch (i7) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            Z7 z7 = e25.d;
                                            ArrayList arrayListM = e25.m(sQLiteDatabase2, sd4, z7.b);
                                            for (HV hv : HV.values()) {
                                                if (hv != ((C4289p8) sd4).c) {
                                                    int size = z7.b - arrayListM.size();
                                                    if (size <= 0) {
                                                        map = new HashMap();
                                                        sb = new StringBuilder("event_id IN (");
                                                        for (int i8 = 0; i8 < arrayListM.size(); i8++) {
                                                            sb.append(((C3675i8) arrayListM.get(i8)).f4490a);
                                                            if (i8 < arrayListM.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        E20.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new Md0(map, 11));
                                                        listIterator = arrayListM.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            c3675i8 = (C3675i8) listIterator.next();
                                                            if (!map.containsKey(Long.valueOf(c3675i8.f4490a))) {
                                                                c4092mwC = c3675i8.c.c();
                                                                long j3 = c3675i8.f4490a;
                                                                for (D20 d20 : (Set) map.get(Long.valueOf(j3))) {
                                                                    c4092mwC.a(d20.f2953a, d20.b);
                                                                }
                                                                listIterator.set(new C3675i8(j3, c3675i8.b, c4092mwC.b()));
                                                            }
                                                        }
                                                        return arrayListM;
                                                    }
                                                    sd4.getClass();
                                                    C4201o8 c4201o8A = Sd0.a();
                                                    C4289p8 c4289p8 = (C4289p8) sd4;
                                                    c4201o8A.b(c4289p8.f4824a);
                                                    c4201o8A.c(hv);
                                                    c4201o8A.b = c4289p8.b;
                                                    arrayListM.addAll(e25.m(sQLiteDatabase2, c4201o8A.a(), size));
                                                }
                                            }
                                            map = new HashMap();
                                            sb = new StringBuilder("event_id IN (");
                                            while (i8 < arrayListM.size()) {
                                                sb.append(((C3675i8) arrayListM.get(i8)).f4490a);
                                                if (i8 < arrayListM.size() - 1) {
                                                    sb.append(',');
                                                }
                                            }
                                            sb.append(')');
                                            E20.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new Md0(map, 11));
                                            listIterator = arrayListM.listIterator();
                                            while (listIterator.hasNext()) {
                                                c3675i8 = (C3675i8) listIterator.next();
                                                if (!map.containsKey(Long.valueOf(c3675i8.f4490a))) {
                                                    c4092mwC = c3675i8.c.c();
                                                    long j4 = c3675i8.f4490a;
                                                    while (r5.hasNext()) {
                                                        c4092mwC.a(d20.f2953a, d20.b);
                                                    }
                                                    listIterator.set(new C3675i8(j4, c3675i8.b, c4092mwC.b()));
                                                }
                                            }
                                            return arrayListM;
                                        default:
                                            e25.getClass();
                                            Long lI = E20.i((SQLiteDatabase) obj, sd4);
                                            return lI == null ? Boolean.FALSE : (Boolean) E20.p(e25.h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI.toString()}), new Nd0(14));
                                    }
                                }
                            });
                            bool.getClass();
                            return bool;
                        default:
                            final E20 e25 = (E20) c5123yg2.c;
                            e25.getClass();
                            final int i7 = 0;
                            return (Iterable) e25.k(new C20() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z20
                                /* JADX WARN: Code duplicated, block: B:22:0x0095  */
                                /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
                                /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
                                /* JADX WARN: Code duplicated, block: B:35:0x0110 A[LOOP:3: B:33:0x010a->B:35:0x0110, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:44:0x00ad A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:46:0x00f4 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:48:0x00db A[SYNTHETIC] */
                                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
                                public final Object apply(Object obj) {
                                    HashMap map;
                                    StringBuilder sb;
                                    ListIterator listIterator;
                                    C3675i8 c3675i8;
                                    C4092mw c4092mwC;
                                    int i8 = i7;
                                    Sd0 sd4 = sd3;
                                    E20 e26 = e25;
                                    switch (i8) {
                                        case 0:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            Z7 z7 = e26.d;
                                            ArrayList arrayListM = e26.m(sQLiteDatabase2, sd4, z7.b);
                                            for (HV hv : HV.values()) {
                                                if (hv != ((C4289p8) sd4).c) {
                                                    int size = z7.b - arrayListM.size();
                                                    if (size <= 0) {
                                                        map = new HashMap();
                                                        sb = new StringBuilder("event_id IN (");
                                                        for (int i9 = 0; i9 < arrayListM.size(); i9++) {
                                                            sb.append(((C3675i8) arrayListM.get(i9)).f4490a);
                                                            if (i9 < arrayListM.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        E20.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new Md0(map, 11));
                                                        listIterator = arrayListM.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            c3675i8 = (C3675i8) listIterator.next();
                                                            if (!map.containsKey(Long.valueOf(c3675i8.f4490a))) {
                                                                c4092mwC = c3675i8.c.c();
                                                                long j4 = c3675i8.f4490a;
                                                                for (D20 d20 : (Set) map.get(Long.valueOf(j4))) {
                                                                    c4092mwC.a(d20.f2953a, d20.b);
                                                                }
                                                                listIterator.set(new C3675i8(j4, c3675i8.b, c4092mwC.b()));
                                                            }
                                                        }
                                                        return arrayListM;
                                                    }
                                                    sd4.getClass();
                                                    C4201o8 c4201o8A = Sd0.a();
                                                    C4289p8 c4289p8 = (C4289p8) sd4;
                                                    c4201o8A.b(c4289p8.f4824a);
                                                    c4201o8A.c(hv);
                                                    c4201o8A.b = c4289p8.b;
                                                    arrayListM.addAll(e26.m(sQLiteDatabase2, c4201o8A.a(), size));
                                                }
                                            }
                                            map = new HashMap();
                                            sb = new StringBuilder("event_id IN (");
                                            while (i9 < arrayListM.size()) {
                                                sb.append(((C3675i8) arrayListM.get(i9)).f4490a);
                                                if (i9 < arrayListM.size() - 1) {
                                                    sb.append(',');
                                                }
                                            }
                                            sb.append(')');
                                            E20.p(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new Md0(map, 11));
                                            listIterator = arrayListM.listIterator();
                                            while (listIterator.hasNext()) {
                                                c3675i8 = (C3675i8) listIterator.next();
                                                if (!map.containsKey(Long.valueOf(c3675i8.f4490a))) {
                                                    c4092mwC = c3675i8.c.c();
                                                    long j5 = c3675i8.f4490a;
                                                    while (r5.hasNext()) {
                                                        c4092mwC.a(d20.f2953a, d20.b);
                                                    }
                                                    listIterator.set(new C3675i8(j5, c3675i8.b, c4092mwC.b()));
                                                }
                                            }
                                            return arrayListM;
                                        default:
                                            e26.getClass();
                                            Long lI = E20.i((SQLiteDatabase) obj, sd4);
                                            return lI == null ? Boolean.FALSE : (Boolean) E20.p(e26.h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI.toString()}), new Nd0(14));
                                    }
                                }
                            });
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (qd0A == null) {
                AbstractC2871Wx.X("Uploader", "Unknown backend for %s, deleting event batch for it...", sd1);
                t8 = new T7(3, -1L);
                qd0 = qd0A;
                e20 = e22;
            } else {
                ArrayList<Y7> arrayList2 = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C3675i8) it2.next()).c);
                }
                sd0.getClass();
                byte[] bArr = ((C4289p8) sd1).b;
                String str3 = "proto";
                if (bArr != null) {
                    InterfaceC4768uf interfaceC4768uf = c5123yg0.i;
                    Objects.requireNonNull(interfaceC4768uf);
                    C5120yf c5120yf = (C5120yf) e22.n(new Md0(interfaceC4768uf, 7));
                    C4092mw c4092mw = new C4092mw();
                    c4092mw.b = new HashMap();
                    c4092mw.e = Long.valueOf(((C5211zg0) interfaceC2438Gf).a());
                    c4092mw.f = Long.valueOf(((C5211zg0) c5123yg0.h).a());
                    c4092mw.f4722a = "GDT_CLIENT_METRICS";
                    C3736ir c3736ir = new C3736ir("proto");
                    c5120yf.getClass();
                    C4568sM c4568sM = AbstractC4490rW.f4933a;
                    c4568sM.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c4568sM.k(c5120yf, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c4092mw.e(new C3209cr(c3736ir, byteArrayOutputStream.toByteArray()));
                    arrayList2.add(((C3359ed) qd0A).a(c4092mw.b()));
                }
                C3359ed c3359ed = (C3359ed) qd0A;
                HashMap map = new HashMap();
                for (Y7 y7 : arrayList2) {
                    String str4 = y7.f4007a;
                    if (map.containsKey(str4)) {
                        ((List) map.get(str4)).add(y7);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(y7);
                        map.put(str4, arrayList3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    Y7 y8 = (Y7) ((List) entry.getValue()).get(0);
                    Qd0 qd1 = qd0A;
                    C3274de0 c3274de1 = new C3274de0(2);
                    c3274de1.g = PW.f3555a;
                    c3274de1.f4281a = Long.valueOf(((C5211zg0) c3359ed.f).a());
                    c3274de1.b = Long.valueOf(((C5211zg0) c3359ed.e).a());
                    Iterator it4 = it3;
                    c3274de1.c = new V7(EnumC4856vf.f5145a, new S7(Integer.valueOf(y8.b("sdk-version")), y8.a("model"), y8.a("hardware"), y8.a("device"), y8.a("product"), y8.a("os-uild"), y8.a("manufacturer"), y8.a("fingerprint"), y8.a("locale"), y8.a(com.umeng.analytics.pro.bc.O), y8.a("mcc_mnc"), y8.a("application_build")));
                    try {
                        c3274de1.d = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        while (true) {
                            if (it.hasNext()) {
                                Y7 y9 = (Y7) it.next();
                                Iterator it5 = it;
                                C3209cr c3209cr = y9.c;
                                C3736ir c3736ir2 = c3209cr.f4247a;
                                boolean zEquals = c3736ir2.equals(new C3736ir(str3));
                                byte[] bArr2 = c3209cr.b;
                                if (zEquals) {
                                    c3274de0 = new C3274de0(1);
                                    c3274de0.d = bArr2;
                                    str2 = str3;
                                } else {
                                    str2 = str3;
                                    if (c3736ir2.equals(new C3736ir("json"))) {
                                        String str5 = new String(bArr2, Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
                                        c3274de0 = new C3274de0(1);
                                        c3274de0.e = str5;
                                    } else {
                                        e21 = e22;
                                        if (Log.isLoggable(AbstractC2871Wx.f0("CctTransportBackend"), 5)) {
                                            c3736ir2.toString();
                                        }
                                    }
                                    it = it5;
                                    str3 = str2;
                                    e22 = e21;
                                }
                                e21 = e22;
                                c3274de0.f4281a = Long.valueOf(y9.d);
                                c3274de0.c = Long.valueOf(y9.e);
                                String str6 = (String) y9.f.get("tz-offset");
                                c3274de0.f = Long.valueOf(str6 == null ? 0L : Long.valueOf(str6).longValue());
                                c3274de0.g = new C3587h8((EnumC4925wR) EnumC4925wR.f5179a.get(y9.b("net-type")), (EnumC4837vR) EnumC4837vR.f5130a.get(y9.b("mobile-subtype")));
                                Integer num = y9.b;
                                if (num != null) {
                                    c3274de0.b = num;
                                }
                                String strH = ((Long) c3274de0.f4281a) == null ? " eventTimeMs" : "";
                                if (((Long) c3274de0.c) == null) {
                                    strH = strH.concat(" eventUptimeMs");
                                }
                                if (((Long) c3274de0.f) == null) {
                                    strH = DM.h(strH, " timezoneOffsetSeconds");
                                }
                                if (!strH.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strH));
                                }
                                arrayList.add(new C3323e8(((Long) c3274de0.f4281a).longValue(), (Integer) c3274de0.b, ((Long) c3274de0.c).longValue(), (byte[]) c3274de0.d, (String) c3274de0.e, ((Long) c3274de0.f).longValue(), (AbstractC5013xR) c3274de0.g));
                                it = it5;
                                str3 = str2;
                                e22 = e21;
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        c3274de1.e = (String) entry.getKey();
                    }
                    arrayList = new ArrayList();
                    it = ((List) entry.getValue()).iterator();
                    String str7 = str3;
                    E20 e24 = e22;
                    c3274de1.f = arrayList;
                    String strConcat = ((Long) c3274de1.f4281a) == null ? " requestTimeMs" : "";
                    if (((Long) c3274de1.b) == null) {
                        strConcat = strConcat.concat(" requestUptimeMs");
                    }
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    arrayList4.add(new C3411f8(((Long) c3274de1.f4281a).longValue(), ((Long) c3274de1.b).longValue(), (AbstractC4944wf) c3274de1.c, (Integer) c3274de1.d, (String) c3274de1.e, (List) c3274de1.f, (PW) c3274de1.g));
                    qd0A = qd1;
                    it3 = it4;
                    str3 = str7;
                    e22 = e24;
                }
                qd0 = qd0A;
                e20 = e22;
                U7 u7 = new U7(arrayList4);
                URL urlB = c3359ed.d;
                if (bArr != null) {
                    try {
                        C4235oc c4235ocA = C4235oc.a(bArr);
                        str = c4235ocA.b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = c4235ocA.f4795a;
                        if (str8 != null) {
                            urlB = C3359ed.b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        t7 = new T7(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    C3182cd c3182cd = new C3182cd(urlB, u7, str);
                    Md0 md0 = new Md0(c3359ed, 4);
                    int i5 = 5;
                    do {
                        objApply = md0.apply(c3182cd);
                        C3271dd c3271dd = (C3271dd) objApply;
                        URL url = c3271dd.b;
                        if (url != null) {
                            AbstractC2871Wx.X("CctTransportBackend", "Following redirect to: %s", url);
                            c3182cd = new C3182cd(c3271dd.b, c3182cd.b, c3182cd.c);
                        } else {
                            c3182cd = null;
                        }
                        if (c3182cd == null) {
                            break;
                        } else {
                            i5--;
                        }
                    } while (i5 >= 1);
                    C3271dd c3271dd2 = (C3271dd) objApply;
                    int i6 = c3271dd2.f4279a;
                    if (i6 == 200) {
                        t8 = new T7(1, c3271dd2.c);
                    } else {
                        if (i6 >= 500 || i6 == 404) {
                            t7 = new T7(2, -1L);
                        } else if (i6 == 400) {
                            try {
                                t7 = new T7(4, -1L);
                            } catch (IOException unused4) {
                                AbstractC2871Wx.f0("CctTransportBackend");
                                i2 = 2;
                                t8 = new T7(2, -1L);
                            }
                        } else {
                            t7 = new T7(3, -1L);
                        }
                        t8 = t7;
                    }
                } catch (IOException unused5) {
                }
            }
            i2 = 2;
            int i7 = t8.f3756a;
            if (i7 == i2) {
                e20.n(new C4947wg0(this, iterable, sd0, jMax));
                ((FE) this.d).a(sd0, i + 1, true);
                return;
            }
            E20 e25 = e20;
            e25.n(new C3285dk(1, this, iterable));
            if (i7 == 1) {
                jMax = Math.max(jMax, t8.b);
                sd0.getClass();
                if (((C4289p8) sd0).b != null) {
                    e25.n(new Md0(this, 6));
                }
            } else if (i7 == 4) {
                HashMap map2 = new HashMap();
                Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    String str9 = ((C3675i8) it6.next()).c.f4007a;
                    if (map2.containsKey(str9)) {
                        map2.put(str9, Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                    } else {
                        map2.put(str9, 1);
                    }
                }
                e25.n(new C3285dk(2, this, map2));
            }
            sd1 = sd0;
            qd0A = qd0;
            c5123yg0 = this;
        }
    }
}
