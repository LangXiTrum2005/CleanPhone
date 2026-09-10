package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.ac0;
import com.google.android.gms.internal.ads.br0;
import com.google.android.gms.internal.ads.dm;
import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.gr0;
import com.google.android.gms.internal.ads.hk0;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.internal.ads.j50;
import com.google.android.gms.internal.ads.jy1;
import com.google.android.gms.internal.ads.kq0;
import com.google.android.gms.internal.ads.nr0;
import com.google.android.gms.internal.ads.p21;
import com.google.android.gms.internal.ads.ry1;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vr0;
import com.google.android.gms.internal.ads.xd;
import com.google.android.gms.internal.ads.z40;
import com.ironsource.O6;
import com.ironsource.X3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import r8.i;
import tb.n;
import y8.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static d f22980j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f22981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f22986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f22987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f22988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f22989i;

    public d(Application application) {
        this.f22981a = this;
        g6 g6Var = new g6(application, 8);
        this.f22982b = g6Var;
        j7 j7VarA = j7.a(new f(g6Var, 1));
        this.f22983c = j7VarA;
        j7 j7VarA2 = j7.a(d0.f22991b);
        this.f22984d = j7VarA2;
        j7 j7VarA3 = j7.a(new g6(new c(this), 3));
        this.f22985e = j7VarA3;
        j4 j4Var = new j4(g6Var, j7VarA, 1);
        j7 j7VarA4 = j7.a(new o4(24));
        this.f22986f = j7VarA4;
        g gVar = new g(g6Var, j7VarA, j7.a(new j4(g6Var, j7.a(new f(g6Var, 0)), 0)));
        this.f22989i = gVar;
        j7 j7VarA5 = j7.a(new g9.k(j7VarA2, g6Var, j7.a(new f(g6Var, 2)), 5));
        this.f22987g = j7VarA5;
        this.f22988h = j7.a(new zc.u(j7VarA, new j30(g6Var, j7VarA2, j7VarA, j7VarA3, j4Var, new k5.g(j7VarA4, gVar, j7VarA, j7VarA5), j7VarA4, j7VarA5), j7VarA3, j7VarA5, 2));
    }

    public static void o(String str, JSONObject jSONObject) {
        StringBuilder sbI = d5.u.i(str);
        sbI.append(jSONObject.toString());
        String string = sbI.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public static d v(Context context) {
        d dVar;
        synchronized (d.class) {
            try {
                if (f22980j == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f22980j = new d(application);
                }
                dVar = f22980j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public d a(zk.j jVar, List typeParameterProtos, vl.f nameResolver, l3.i iVar, vl.g versionRequirementTable, vl.a metadataVersion) {
        kotlin.jvm.internal.n.f(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.n.f(metadataVersion, "metadataVersion");
        lm.i iVar2 = (lm.i) this.f22981a;
        int i10 = metadataVersion.f52623b;
        return new d(iVar2, nameResolver, jVar, iVar, ((i10 != 1 || metadataVersion.f52624c < 4) && i10 <= 1) ? (vl.g) this.f22985e : versionRequirementTable, metadataVersion, (nm.i) this.f22987g, (lm.b0) this.f22988h, typeParameterProtos);
    }

    public ArrayList c() throws Throwable {
        g4.h hVar;
        g4.h hVarB = g4.h.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        hVarB.c(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
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
            int iW12 = com.bumptech.glide.d.w(cursorG, "input_merger_class_name");
            int iW13 = com.bumptech.glide.d.w(cursorG, "input");
            int iW14 = com.bumptech.glide.d.w(cursorG, "output");
            hVar = hVarB;
            try {
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
                int i10 = iW14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iW9);
                    int i11 = iW9;
                    String string2 = cursorG.getString(iW11);
                    int i12 = iW11;
                    d5.b bVar = new d5.b();
                    int i13 = iW;
                    bVar.f38676a = j1.f.y(cursorG.getInt(iW));
                    bVar.f38677b = cursorG.getInt(iW2) != 0;
                    bVar.f38678c = cursorG.getInt(iW3) != 0;
                    bVar.f38679d = cursorG.getInt(iW4) != 0;
                    bVar.f38680e = cursorG.getInt(iW5) != 0;
                    int i14 = iW2;
                    bVar.f38681f = cursorG.getLong(iW6);
                    bVar.f38682g = cursorG.getLong(iW7);
                    bVar.f38683h = j1.f.e(cursorG.getBlob(iW8));
                    m5.i iVar = new m5.i(string, string2);
                    iVar.f45883b = j1.f.A(cursorG.getInt(iW10));
                    iVar.f45885d = cursorG.getString(iW12);
                    iVar.f45886e = d5.f.a(cursorG.getBlob(iW13));
                    int i15 = i10;
                    iVar.f45887f = d5.f.a(cursorG.getBlob(i15));
                    int i16 = iW15;
                    int i17 = iW3;
                    int i18 = iW4;
                    iVar.f45888g = cursorG.getLong(i16);
                    int i19 = iW16;
                    int i20 = iW5;
                    iVar.f45889h = cursorG.getLong(i19);
                    int i21 = iW17;
                    iVar.f45890i = cursorG.getLong(i21);
                    int i22 = iW18;
                    iVar.f45892k = cursorG.getInt(i22);
                    int i23 = iW19;
                    i10 = i15;
                    iVar.l = j1.f.x(cursorG.getInt(i23));
                    iW18 = i22;
                    iW19 = i23;
                    int i24 = iW20;
                    iVar.f45893m = cursorG.getLong(i24);
                    int i25 = iW21;
                    iVar.f45894n = cursorG.getLong(i25);
                    int i26 = iW22;
                    iVar.f45895o = cursorG.getLong(i26);
                    iW22 = i26;
                    int i27 = iW23;
                    iVar.f45896p = cursorG.getLong(i27);
                    int i28 = iW24;
                    iVar.f45897q = cursorG.getInt(i28) != 0;
                    int i29 = iW25;
                    iVar.f45898r = j1.f.z(cursorG.getInt(i29));
                    iVar.f45891j = bVar;
                    arrayList.add(iVar);
                    iW25 = i29;
                    iW23 = i27;
                    iW4 = i18;
                    iW9 = i11;
                    iW11 = i12;
                    iW = i13;
                    iW3 = i17;
                    iW15 = i16;
                    iW21 = i25;
                    iW5 = i20;
                    iW16 = i19;
                    iW17 = i21;
                    iW20 = i24;
                    iW24 = i28;
                    iW2 = i14;
                }
                cursorG.close();
                hVar.k();
                return arrayList;
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

    public hc.b d(int i10) {
        hc.b bVar = null;
        try {
            if (!v0.i.b(2, i10)) {
                JSONObject jSONObjectV = ((n5.f) this.f22985e).v();
                if (jSONObjectV != null) {
                    hc.b bVarM = ((od.c) this.f22983c).m(jSONObjectV);
                    o("Loaded cached settings: ", jSONObjectV);
                    ((v1.j) this.f22984d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (v0.i.b(3, i10) || bVarM.f42299c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return bVarM;
                        } catch (Exception e10) {
                            e = e10;
                            bVar = bVarM;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public ArrayList e(int i10) throws Throwable {
        g4.h hVar;
        g4.h hVarB = g4.h.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        hVarB.c(1, i10);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
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
            int iW12 = com.bumptech.glide.d.w(cursorG, "input_merger_class_name");
            int iW13 = com.bumptech.glide.d.w(cursorG, "input");
            int iW14 = com.bumptech.glide.d.w(cursorG, "output");
            hVar = hVarB;
            try {
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
                    d5.b bVar = new d5.b();
                    int i14 = iW;
                    bVar.f38676a = j1.f.y(cursorG.getInt(iW));
                    bVar.f38677b = cursorG.getInt(iW2) != 0;
                    bVar.f38678c = cursorG.getInt(iW3) != 0;
                    bVar.f38679d = cursorG.getInt(iW4) != 0;
                    bVar.f38680e = cursorG.getInt(iW5) != 0;
                    int i15 = iW2;
                    bVar.f38681f = cursorG.getLong(iW6);
                    bVar.f38682g = cursorG.getLong(iW7);
                    bVar.f38683h = j1.f.e(cursorG.getBlob(iW8));
                    m5.i iVar = new m5.i(string, string2);
                    iVar.f45883b = j1.f.A(cursorG.getInt(iW10));
                    iVar.f45885d = cursorG.getString(iW12);
                    iVar.f45886e = d5.f.a(cursorG.getBlob(iW13));
                    int i16 = i11;
                    iVar.f45887f = d5.f.a(cursorG.getBlob(i16));
                    int i17 = iW15;
                    int i18 = iW3;
                    int i19 = iW4;
                    iVar.f45888g = cursorG.getLong(i17);
                    int i20 = iW16;
                    int i21 = iW5;
                    iVar.f45889h = cursorG.getLong(i20);
                    int i22 = iW17;
                    iVar.f45890i = cursorG.getLong(i22);
                    int i23 = iW18;
                    iVar.f45892k = cursorG.getInt(i23);
                    int i24 = iW19;
                    i11 = i16;
                    iVar.l = j1.f.x(cursorG.getInt(i24));
                    iW18 = i23;
                    iW19 = i24;
                    int i25 = iW20;
                    iVar.f45893m = cursorG.getLong(i25);
                    int i26 = iW21;
                    iVar.f45894n = cursorG.getLong(i26);
                    int i27 = iW22;
                    iVar.f45895o = cursorG.getLong(i27);
                    iW22 = i27;
                    int i28 = iW23;
                    iVar.f45896p = cursorG.getLong(i28);
                    int i29 = iW24;
                    iVar.f45897q = cursorG.getInt(i29) != 0;
                    int i30 = iW25;
                    iVar.f45898r = j1.f.z(cursorG.getInt(i30));
                    iVar.f45891j = bVar;
                    arrayList.add(iVar);
                    iW25 = i30;
                    iW23 = i28;
                    iW4 = i19;
                    iW9 = i12;
                    iW11 = i13;
                    iW = i14;
                    iW3 = i18;
                    iW15 = i17;
                    iW21 = i26;
                    iW5 = i21;
                    iW16 = i20;
                    iW17 = i22;
                    iW20 = i25;
                    iW24 = i29;
                    iW2 = i15;
                }
                cursorG.close();
                hVar.k();
                return arrayList;
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

    public ArrayList f() throws Throwable {
        g4.h hVar;
        g4.h hVarB = g4.h.b(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
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
            int iW12 = com.bumptech.glide.d.w(cursorG, "input_merger_class_name");
            int iW13 = com.bumptech.glide.d.w(cursorG, "input");
            int iW14 = com.bumptech.glide.d.w(cursorG, "output");
            hVar = hVarB;
            try {
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
                int i10 = iW14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iW9);
                    int i11 = iW9;
                    String string2 = cursorG.getString(iW11);
                    int i12 = iW11;
                    d5.b bVar = new d5.b();
                    int i13 = iW;
                    bVar.f38676a = j1.f.y(cursorG.getInt(iW));
                    bVar.f38677b = cursorG.getInt(iW2) != 0;
                    bVar.f38678c = cursorG.getInt(iW3) != 0;
                    bVar.f38679d = cursorG.getInt(iW4) != 0;
                    bVar.f38680e = cursorG.getInt(iW5) != 0;
                    int i14 = iW2;
                    bVar.f38681f = cursorG.getLong(iW6);
                    bVar.f38682g = cursorG.getLong(iW7);
                    bVar.f38683h = j1.f.e(cursorG.getBlob(iW8));
                    m5.i iVar = new m5.i(string, string2);
                    iVar.f45883b = j1.f.A(cursorG.getInt(iW10));
                    iVar.f45885d = cursorG.getString(iW12);
                    iVar.f45886e = d5.f.a(cursorG.getBlob(iW13));
                    int i15 = i10;
                    iVar.f45887f = d5.f.a(cursorG.getBlob(i15));
                    int i16 = iW15;
                    int i17 = iW3;
                    int i18 = iW4;
                    iVar.f45888g = cursorG.getLong(i16);
                    int i19 = iW16;
                    int i20 = iW5;
                    iVar.f45889h = cursorG.getLong(i19);
                    int i21 = iW17;
                    iVar.f45890i = cursorG.getLong(i21);
                    int i22 = iW18;
                    iVar.f45892k = cursorG.getInt(i22);
                    int i23 = iW19;
                    i10 = i15;
                    iVar.l = j1.f.x(cursorG.getInt(i23));
                    iW18 = i22;
                    iW19 = i23;
                    int i24 = iW20;
                    iVar.f45893m = cursorG.getLong(i24);
                    int i25 = iW21;
                    iVar.f45894n = cursorG.getLong(i25);
                    int i26 = iW22;
                    iVar.f45895o = cursorG.getLong(i26);
                    iW22 = i26;
                    int i27 = iW23;
                    iVar.f45896p = cursorG.getLong(i27);
                    int i28 = iW24;
                    iVar.f45897q = cursorG.getInt(i28) != 0;
                    int i29 = iW25;
                    iVar.f45898r = j1.f.z(cursorG.getInt(i29));
                    iVar.f45891j = bVar;
                    arrayList.add(iVar);
                    iW25 = i29;
                    iW23 = i27;
                    iW4 = i18;
                    iW9 = i11;
                    iW11 = i12;
                    iW = i13;
                    iW3 = i17;
                    iW15 = i16;
                    iW21 = i25;
                    iW5 = i20;
                    iW16 = i19;
                    iW17 = i21;
                    iW20 = i24;
                    iW24 = i28;
                    iW2 = i14;
                }
                cursorG.close();
                hVar.k();
                return arrayList;
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

    public ArrayList g() {
        g4.h hVar;
        g4.h hVarB = g4.h.b(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
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
            int iW12 = com.bumptech.glide.d.w(cursorG, "input_merger_class_name");
            int iW13 = com.bumptech.glide.d.w(cursorG, "input");
            int iW14 = com.bumptech.glide.d.w(cursorG, "output");
            hVar = hVarB;
            try {
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
                int i10 = iW14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iW9);
                    int i11 = iW9;
                    String string2 = cursorG.getString(iW11);
                    int i12 = iW11;
                    d5.b bVar = new d5.b();
                    int i13 = iW;
                    bVar.f38676a = j1.f.y(cursorG.getInt(iW));
                    bVar.f38677b = cursorG.getInt(iW2) != 0;
                    bVar.f38678c = cursorG.getInt(iW3) != 0;
                    bVar.f38679d = cursorG.getInt(iW4) != 0;
                    bVar.f38680e = cursorG.getInt(iW5) != 0;
                    int i14 = iW2;
                    bVar.f38681f = cursorG.getLong(iW6);
                    bVar.f38682g = cursorG.getLong(iW7);
                    bVar.f38683h = j1.f.e(cursorG.getBlob(iW8));
                    m5.i iVar = new m5.i(string, string2);
                    iVar.f45883b = j1.f.A(cursorG.getInt(iW10));
                    iVar.f45885d = cursorG.getString(iW12);
                    iVar.f45886e = d5.f.a(cursorG.getBlob(iW13));
                    int i15 = i10;
                    iVar.f45887f = d5.f.a(cursorG.getBlob(i15));
                    int i16 = iW15;
                    int i17 = iW3;
                    int i18 = iW4;
                    iVar.f45888g = cursorG.getLong(i16);
                    int i19 = iW16;
                    int i20 = iW5;
                    iVar.f45889h = cursorG.getLong(i19);
                    int i21 = iW17;
                    iVar.f45890i = cursorG.getLong(i21);
                    int i22 = iW18;
                    iVar.f45892k = cursorG.getInt(i22);
                    int i23 = iW19;
                    i10 = i15;
                    iVar.l = j1.f.x(cursorG.getInt(i23));
                    iW18 = i22;
                    iW19 = i23;
                    int i24 = iW20;
                    iVar.f45893m = cursorG.getLong(i24);
                    int i25 = iW21;
                    iVar.f45894n = cursorG.getLong(i25);
                    int i26 = iW22;
                    iVar.f45895o = cursorG.getLong(i26);
                    iW22 = i26;
                    int i27 = iW23;
                    iVar.f45896p = cursorG.getLong(i27);
                    int i28 = iW24;
                    iVar.f45897q = cursorG.getInt(i28) != 0;
                    int i29 = iW25;
                    iVar.f45898r = j1.f.z(cursorG.getInt(i29));
                    iVar.f45891j = bVar;
                    arrayList.add(iVar);
                    iW25 = i29;
                    iW23 = i27;
                    iW4 = i18;
                    iW9 = i11;
                    iW11 = i12;
                    iW = i13;
                    iW3 = i17;
                    iW15 = i16;
                    iW21 = i25;
                    iW5 = i20;
                    iW16 = i19;
                    iW17 = i21;
                    iW20 = i24;
                    iW24 = i28;
                    iW2 = i14;
                }
                cursorG.close();
                hVar.k();
                return arrayList;
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

    public hc.b h() {
        return (hc.b) ((AtomicReference) this.f22988h).get();
    }

    public int i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        g4.h hVarB = g4.h.b(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            hVarB.h(1);
        } else {
            hVarB.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            return cursorG.moveToFirst() ? j1.f.A(cursorG.getInt(0)) : 0;
        } finally {
            cursorG.close();
            hVarB.k();
        }
    }

    public ArrayList j() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        g4.h hVarB = g4.h.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        hVarB.h(1);
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            hVarB.k();
            return arrayList;
        } catch (Throwable th2) {
            cursorG.close();
            hVarB.k();
            throw th2;
        }
    }

    public ArrayList k() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        g4.h hVarB = g4.h.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        hVarB.j(1, "offline_ping_sender_work");
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            hVarB.k();
            return arrayList;
        } catch (Throwable th2) {
            cursorG.close();
            hVarB.k();
            throw th2;
        }
    }

    public m5.i l(String str) {
        g4.h hVar;
        m5.i iVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        g4.h hVarB = g4.h.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            hVarB.h(1);
        } else {
            hVarB.j(1, str);
        }
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
            int iW12 = com.bumptech.glide.d.w(cursorG, "input_merger_class_name");
            int iW13 = com.bumptech.glide.d.w(cursorG, "input");
            int iW14 = com.bumptech.glide.d.w(cursorG, "output");
            hVar = hVarB;
            try {
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
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iW9);
                    String string2 = cursorG.getString(iW11);
                    d5.b bVar = new d5.b();
                    bVar.f38676a = j1.f.y(cursorG.getInt(iW));
                    bVar.f38677b = cursorG.getInt(iW2) != 0;
                    bVar.f38678c = cursorG.getInt(iW3) != 0;
                    bVar.f38679d = cursorG.getInt(iW4) != 0;
                    bVar.f38680e = cursorG.getInt(iW5) != 0;
                    bVar.f38681f = cursorG.getLong(iW6);
                    bVar.f38682g = cursorG.getLong(iW7);
                    bVar.f38683h = j1.f.e(cursorG.getBlob(iW8));
                    iVar = new m5.i(string, string2);
                    iVar.f45883b = j1.f.A(cursorG.getInt(iW10));
                    iVar.f45885d = cursorG.getString(iW12);
                    iVar.f45886e = d5.f.a(cursorG.getBlob(iW13));
                    iVar.f45887f = d5.f.a(cursorG.getBlob(iW14));
                    iVar.f45888g = cursorG.getLong(iW15);
                    iVar.f45889h = cursorG.getLong(iW16);
                    iVar.f45890i = cursorG.getLong(iW17);
                    iVar.f45892k = cursorG.getInt(iW18);
                    iVar.l = j1.f.x(cursorG.getInt(iW19));
                    iVar.f45893m = cursorG.getLong(iW20);
                    iVar.f45894n = cursorG.getLong(iW21);
                    iVar.f45895o = cursorG.getLong(iW22);
                    iVar.f45896p = cursorG.getLong(iW23);
                    iVar.f45897q = cursorG.getInt(iW24) != 0;
                    iVar.f45898r = j1.f.z(cursorG.getInt(iW25));
                    iVar.f45891j = bVar;
                } else {
                    iVar = null;
                }
                cursorG.close();
                hVar.k();
                return iVar;
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

    public void m(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        workDatabase_Impl.b();
        m5.e eVar = (m5.e) this.f22986f;
        l4.f fVarA = eVar.a();
        if (str == null) {
            fVarA.k(1);
        } else {
            fVarA.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f45036d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void n(r8.i iVar, int i10) {
        byte[] bArr;
        long j10;
        s8.a aVar;
        String str;
        s8.a aVar2;
        int i11;
        b2.d0 d0VarA;
        String str2;
        Integer numValueOf;
        d dVar;
        final d dVar2 = this;
        final r8.i iVar2 = iVar;
        byte[] bArr2 = iVar2.f49490b;
        z8.c cVar = (z8.c) dVar2.f22986f;
        s8.e eVarA = ((s8.d) dVar2.f22982b).a(iVar2.f49489a);
        long jMax = 0;
        while (true) {
            final int i12 = 0;
            y8.h hVar = (y8.h) cVar;
            if (!((Boolean) hVar.o(new z8.b(dVar2) { // from class: x8.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f53671b;

                {
                    this.f53671b = dVar2;
                }

                @Override // z8.b
                public final Object execute() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            i iVar3 = iVar2;
                            h hVar2 = (h) ((y8.d) this.f53671b.f22983c);
                            SQLiteDatabase sQLiteDatabaseD = hVar2.d();
                            sQLiteDatabaseD.beginTransaction();
                            try {
                                Long lH = h.h(sQLiteDatabaseD, iVar3);
                                if (lH == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.d().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lH.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseD.setTransactionSuccessful();
                                sQLiteDatabaseD.endTransaction();
                                return bool;
                            } catch (Throwable th3) {
                                sQLiteDatabaseD.endTransaction();
                                throw th3;
                            }
                        default:
                            h hVar3 = (h) ((y8.d) this.f53671b.f22983c);
                            hVar3.getClass();
                            return (Iterable) hVar3.j(new n(5, hVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                hVar.o(new qd.d(dVar2, iVar2, jMax));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) hVar.o(new z8.b(dVar2) { // from class: x8.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f53671b;

                {
                    this.f53671b = dVar2;
                }

                @Override // z8.b
                public final Object execute() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar3 = iVar2;
                            h hVar2 = (h) ((y8.d) this.f53671b.f22983c);
                            SQLiteDatabase sQLiteDatabaseD = hVar2.d();
                            sQLiteDatabaseD.beginTransaction();
                            try {
                                Long lH = h.h(sQLiteDatabaseD, iVar3);
                                if (lH == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.d().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lH.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseD.setTransactionSuccessful();
                                sQLiteDatabaseD.endTransaction();
                                return bool;
                            } catch (Throwable th3) {
                                sQLiteDatabaseD.endTransaction();
                                throw th3;
                            }
                        default:
                            h hVar3 = (h) ((y8.d) this.f53671b.f22983c);
                            hVar3.getClass();
                            return (Iterable) hVar3.j(new n(5, hVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (eVarA == null) {
                no.b.l("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                aVar2 = new s8.a(3, -1L);
                bArr = bArr2;
                j10 = jMax;
            } else {
                ArrayList<r8.h> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((y8.b) it.next()).f54333c);
                }
                if (bArr2 != null) {
                    y8.c cVar2 = (y8.c) dVar2.f22989i;
                    Objects.requireNonNull(cVar2);
                    u8.a aVar3 = (u8.a) hVar.o(new tj.i0(cVar2, 10));
                    z40 z40Var = new z40();
                    z40Var.f22496f = new HashMap();
                    z40Var.f22494d = Long.valueOf(((a9.a) dVar2.f22987g).f());
                    z40Var.f22495e = Long.valueOf(((a9.a) dVar2.f22988h).f());
                    z40Var.f22491a = "GDT_CLIENT_METRICS";
                    o8.c cVar3 = new o8.c("proto");
                    aVar3.getClass();
                    g9.k kVar = r8.n.f49501a;
                    kVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        kVar.g(byteArrayOutputStream, aVar3);
                    } catch (IOException unused) {
                    }
                    z40Var.f22493c = new r8.l(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((p8.b) eVarA).a(z40Var.b()));
                }
                p8.b bVar = (p8.b) eVarA;
                HashMap map = new HashMap();
                for (r8.h hVar2 : arrayList) {
                    String str3 = hVar2.f49479a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    r8.h hVar3 = (r8.h) ((List) entry.getValue()).get(0);
                    q8.j0 j0Var = q8.j0.f48851a;
                    long jF = bVar.f48276f.f();
                    long jF2 = bVar.f48275e.f();
                    q8.n nVar = new q8.n(new q8.l(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a(O6.B), hVar3.a("hardware"), hVar3.a(X3.i.G), hVar3.a(AppLovinEventTypes.USER_VIEWED_PRODUCT), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (r8.h hVar4 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        byte[] bArr3 = bArr2;
                        r8.l lVar = hVar4.f49481c;
                        byte[] bArr4 = hVar4.f49488j;
                        o8.c cVar4 = lVar.f49498a;
                        byte[] bArr5 = lVar.f49499b;
                        long j11 = jMax;
                        if (cVar4.equals(new o8.c("proto"))) {
                            dVar = new d();
                            dVar.f22985e = bArr5;
                        } else {
                            if (cVar4.equals(new o8.c("json"))) {
                                String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                d dVar3 = new d();
                                dVar3.f22986f = str4;
                                dVar = dVar3;
                            } else {
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                                }
                            }
                            it2 = it3;
                            bArr2 = bArr3;
                            jMax = j11;
                        }
                        dVar.f22981a = Long.valueOf(hVar4.f49482d);
                        dVar.f22984d = Long.valueOf(hVar4.f49483e);
                        String str5 = (String) hVar4.f49484f.get("tz-offset");
                        dVar.f22987g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        dVar.f22988h = new q8.v((q8.h0) q8.h0.f48831a.get(hVar4.b("net-type")), (q8.g0) q8.g0.f48827a.get(hVar4.b("mobile-subtype")));
                        Integer num = hVar4.f49480b;
                        if (num != null) {
                            dVar.f22982b = num;
                        }
                        Integer num2 = hVar4.f49485g;
                        if (num2 != null) {
                            q8.r rVar = new q8.r(new q8.q(num2));
                            q8.z zVar = q8.z.f48894a;
                            dVar.f22983c = new q8.o(rVar);
                        }
                        byte[] bArr6 = hVar4.f49487i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            dVar.f22989i = new q8.p(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strH = ((Long) dVar.f22981a) == null ? " eventTimeMs" : "";
                        if (((Long) dVar.f22984d) == null) {
                            strH = strH.concat(" eventUptimeMs");
                        }
                        if (((Long) dVar.f22987g) == null) {
                            strH = wi.d.h(strH, " timezoneOffsetSeconds");
                        }
                        if (!strH.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strH));
                        }
                        arrayList4.add(new q8.s(((Long) dVar.f22981a).longValue(), (Integer) dVar.f22982b, (q8.o) dVar.f22983c, ((Long) dVar.f22984d).longValue(), (byte[]) dVar.f22985e, (String) dVar.f22986f, ((Long) dVar.f22987g).longValue(), (q8.v) dVar.f22988h, (q8.p) dVar.f22989i));
                        it2 = it3;
                        bArr2 = bArr3;
                        jMax = j11;
                    }
                    arrayList3.add(new q8.t(jF, jF2, nVar, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                bArr = bArr2;
                j10 = jMax;
                q8.m mVar = new q8.m(arrayList3);
                URL urlB = bVar.f48274d;
                if (bArr != null) {
                    try {
                        p8.a aVarA = p8.a.a(bArr);
                        String str6 = aVarA.f48270b;
                        if (str6 == null) {
                            str6 = null;
                        }
                        String str7 = aVarA.f48269a;
                        if (str7 != null) {
                            urlB = p8.b.b(str7);
                        }
                        str = str6;
                    } catch (IllegalArgumentException unused3) {
                        aVar = new s8.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    v9.e eVar = new v9.e(urlB, mVar, str, false, 28);
                    k3.j jVar = new k3.j(bVar, 18);
                    int i14 = 5;
                    v9.e eVar2 = eVar;
                    do {
                        d0VarA = jVar.a(eVar2);
                        URL url = (URL) d0VarA.f5247d;
                        if (url != null) {
                            no.b.l("CctTransportBackend", "Following redirect to: %s", url);
                            eVar2 = new v9.e(url, (q8.m) eVar2.f52504c, (String) eVar2.f52505d, false, 28);
                        } else {
                            eVar2 = null;
                        }
                        if (eVar2 == null) {
                            break;
                        } else {
                            i14--;
                        }
                    } while (i14 >= 1);
                    int i15 = d0VarA.f5246c;
                    if (i15 == 200) {
                        aVar2 = new s8.a(1, d0VarA.f5245b);
                    } else {
                        if (i15 >= 500 || i15 == 404) {
                            aVar = new s8.a(2, -1L);
                        } else if (i15 == 400) {
                            try {
                                aVar = new s8.a(4, -1L);
                            } catch (IOException e10) {
                                e = e10;
                                no.b.t("CctTransportBackend", "Could not make request to the backend", e);
                                i11 = 2;
                                aVar2 = new s8.a(2, -1L);
                            }
                        } else {
                            aVar = new s8.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i11 = 2;
            int i16 = aVar2.f50210a;
            if (i16 == i11) {
                hVar.o(new ub.b(this, iterable, iVar, j10));
                ((r1.s) this.f22984d).m(iVar, i10 + 1, true);
                return;
            }
            dVar2 = this;
            iVar2 = iVar;
            jMax = j10;
            hVar.o(new tb.n(1, dVar2, iterable));
            if (i16 == 1) {
                jMax = Math.max(jMax, aVar2.f50211b);
                if (bArr != null) {
                    hVar.o(new tj.i0(dVar2, 12));
                }
            } else if (i16 == 4) {
                HashMap map2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str8 = ((y8.b) it4.next()).f54333c.f49479a;
                    if (map2.containsKey(str8)) {
                        map2.put(str8, Integer.valueOf(((Integer) map2.get(str8)).intValue() + 1));
                    } else {
                        map2.put(str8, 1);
                    }
                }
                hVar.o(new tb.n(2, dVar2, map2));
            }
            bArr2 = bArr;
        }
    }

    public void p(long j10, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        workDatabase_Impl.b();
        m5.e eVar = (m5.e) this.f22988h;
        l4.f fVarA = eVar.a();
        fVarA.j(1, j10);
        if (str == null) {
            fVarA.k(2);
        } else {
            fVarA.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f45036d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void q(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        workDatabase_Impl.b();
        m5.e eVar = (m5.e) this.f22987g;
        l4.f fVarA = eVar.a();
        if (str == null) {
            fVarA.k(1);
        } else {
            fVarA.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f45036d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void r(String str, d5.f fVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        workDatabase_Impl.b();
        m5.e eVar = (m5.e) this.f22984d;
        l4.f fVarA = eVar.a();
        byte[] bArrC = d5.f.c(fVar);
        if (bArrC == null) {
            fVarA.k(1);
        } else {
            fVarA.h(1, bArrC);
        }
        if (str == null) {
            fVarA.k(2);
        } else {
            fVarA.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void s(long j10, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        workDatabase_Impl.b();
        m5.e eVar = (m5.e) this.f22985e;
        l4.f fVarA = eVar.a();
        fVarA.j(1, j10);
        if (str == null) {
            fVarA.k(2);
        } else {
            fVarA.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void t(int i10, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f22981a;
        workDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append("?");
            if (i11 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        String string = sb2.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((SQLiteDatabase) workDatabase_Impl.f41497c.getWritableDatabase().f45023b).compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, j1.f.I(i10));
        int i12 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i12);
            } else {
                sQLiteStatementCompileStatement.bindString(i12, str);
            }
            i12++;
        }
        workDatabase_Impl.c();
        try {
            sQLiteStatementCompileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public j50 u() {
        ic1.j((Context) this.f22983c, Context.class);
        ic1.j((HashMap) this.f22987g, Map.class);
        ic1.j((xd) this.f22988h, xd.class);
        ic1.j((p21) this.f22989i, p21.class);
        return new j50((ac0) this.f22981a, (hz) this.f22982b, (Context) this.f22983c, (View) this.f22984d, (Activity) this.f22985e, (String) this.f22986f, (HashMap) this.f22987g, (xd) this.f22988h, (p21) this.f22989i);
    }

    public LinkedHashMap w(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            dm dmVar = (dm) ((HashMap) this.f22983c).get(str);
            if (dmVar == null) {
                dmVar = dm.f13579b;
            }
            linkedHashMap2.put(str, dmVar.a(str3, str2));
        }
        return linkedHashMap2;
    }

    public void x(LinkedHashMap linkedHashMap, fm fmVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f22984d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (fmVar != null) {
            String str = fmVar.f14459b;
            String str2 = fmVar.f14458a;
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(str2)) {
                sb2.append("&it=");
                sb2.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append("&blat=");
                sb2.append(str);
            }
            string = sb2.toString();
        }
        if (!((AtomicBoolean) this.f22988h).get()) {
            zzt.zzc();
            zzs.zzO((Context) this.f22985e, (String) this.f22986f, string);
            return;
        }
        File file = (File) this.f22989i;
        if (file == null) {
            int i10 = zze.zza;
            zzo.zzi("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        int i11 = zze.zza;
                        zzo.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                    }
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    int i12 = zze.zza;
                    zzo.zzj("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            zzo.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            int i13 = zze.zza;
                            zzo.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                        }
                    }
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public d() {
        this.f22981a = new ArrayBlockingQueue(100);
        this.f22982b = new LinkedHashMap();
        this.f22983c = new HashMap();
        this.f22987g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public d(ry1 ry1Var, jy1 jy1Var, com.google.android.gms.internal.ads.s6 s6Var, int i10, int i11, int i12, int i13) {
        this.f22981a = ry1Var;
        this.f22983c = jy1Var;
        this.f22984d = new ug();
        this.f22985e = s6Var.u(ry1Var.f19728t, new hk0(this, 1));
        this.f22986f = new br0(this, i10);
        this.f22987g = new gr0(this, i11);
        this.f22988h = new nr0(this, i12);
        this.f22989i = new vr0(this, i13);
        kq0 kq0Var = new kq0(this);
        this.f22982b = kq0Var;
        ry1Var.f19722n.g(kq0Var);
    }

    public d(WorkDatabase_Impl workDatabase_Impl) {
        this.f22981a = workDatabase_Impl;
        this.f22982b = new m5.b(workDatabase_Impl, 5);
        this.f22983c = new m5.e(workDatabase_Impl, 3);
        this.f22984d = new m5.e(workDatabase_Impl, 4);
        this.f22985e = new m5.e(workDatabase_Impl, 5);
        this.f22986f = new m5.e(workDatabase_Impl, 6);
        this.f22987g = new m5.e(workDatabase_Impl, 7);
        this.f22988h = new m5.e(workDatabase_Impl, 8);
        this.f22989i = new m5.e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }

    public d(lm.i components, vl.f nameResolver, zk.j containingDeclaration, l3.i iVar, vl.g versionRequirementTable, vl.a metadataVersion, nm.i iVar2, lm.b0 b0Var, List typeParameters) {
        String strF;
        kotlin.jvm.internal.n.f(components, "components");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.n.f(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.n.f(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.n.f(typeParameters, "typeParameters");
        this.f22981a = components;
        this.f22982b = nameResolver;
        this.f22983c = containingDeclaration;
        this.f22984d = iVar;
        this.f22985e = versionRequirementTable;
        this.f22986f = metadataVersion;
        this.f22987g = iVar2;
        this.f22988h = new lm.b0(this, b0Var, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (iVar2 == null || (strF = iVar2.f()) == null) ? "[container not found]" : strF);
        this.f22989i = new lm.r(this);
    }
}
