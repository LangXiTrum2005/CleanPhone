package s4;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.metrics.Trace;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import ea.e4;
import ea.k4;
import ea.p2;
import ea.t0;
import eb.e0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import k6.c0;
import k6.d0;
import k6.r;
import k6.s;
import k6.x;
import n2.z;
import nd.k0;
import nd.o0;
import nd.r0;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import p.d1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i implements WebMessageListenerBoundaryInterface, k9.e, i8.b, k4, t0, vj.a, xi.n, b7.a, h2.e, OnCompleteListener, io.flutter.plugin.editing.a, d1, s, c0, kb.h, e6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f50111a;

    public /* synthetic */ i(Object obj) {
        this.f50111a = obj;
    }

    public static void k(l4.b bVar) {
        bVar.p("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.p("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.p("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static g4.g n(l4.b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new i4.a(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new i4.a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new i4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new i4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new i4.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
        hashSet2.add(new i4.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
        i4.e eVar = new i4.e("Dependency", map, hashSet, hashSet2);
        i4.e eVarA = i4.e.a(bVar, "Dependency");
        if (!eVar.equals(eVarA)) {
            return new g4.g(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new i4.a(1, 1, "id", "TEXT", null, true));
        map2.put("state", new i4.a(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new i4.a(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new i4.a(0, 1, "input_merger_class_name", "TEXT", null, false));
        map2.put("input", new i4.a(0, 1, "input", "BLOB", null, true));
        map2.put("output", new i4.a(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new i4.a(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new i4.a(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new i4.a(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new i4.a(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new i4.a(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new i4.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("period_start_time", new i4.a(0, 1, "period_start_time", "INTEGER", null, true));
        map2.put("minimum_retention_duration", new i4.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new i4.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new i4.a(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new i4.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("required_network_type", new i4.a(0, 1, "required_network_type", "INTEGER", null, false));
        map2.put("requires_charging", new i4.a(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new i4.a(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new i4.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new i4.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new i4.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new i4.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new i4.a(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new i4.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
        hashSet4.add(new i4.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
        i4.e eVar2 = new i4.e("WorkSpec", map2, hashSet3, hashSet4);
        i4.e eVarA2 = i4.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(eVarA2)) {
            return new g4.g(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put(ViewHierarchyConstants.TAG_KEY, new i4.a(1, 1, ViewHierarchyConstants.TAG_KEY, "TEXT", null, true));
        map3.put("work_spec_id", new i4.a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new i4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new i4.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
        i4.e eVar3 = new i4.e("WorkTag", map3, hashSet5, hashSet6);
        i4.e eVarA3 = i4.e.a(bVar, "WorkTag");
        if (!eVar3.equals(eVarA3)) {
            return new g4.g(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new i4.a(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("system_id", new i4.a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new i4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        i4.e eVar4 = new i4.e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        i4.e eVarA4 = i4.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(eVarA4)) {
            return new g4.g(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new i4.a(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new i4.a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new i4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new i4.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
        i4.e eVar5 = new i4.e("WorkName", map5, hashSet8, hashSet9);
        i4.e eVarA5 = i4.e.a(bVar, "WorkName");
        if (!eVar5.equals(eVarA5)) {
            return new g4.g(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new i4.a(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put(NotificationCompat.CATEGORY_PROGRESS, new i4.a(0, 1, NotificationCompat.CATEGORY_PROGRESS, "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new i4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        i4.e eVar6 = new i4.e("WorkProgress", map6, hashSet10, new HashSet(0));
        i4.e eVarA6 = i4.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(eVarA6)) {
            return new g4.g(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put(X3.i.W, new i4.a(1, 1, X3.i.W, "TEXT", null, true));
        map7.put("long_value", new i4.a(0, 1, "long_value", "INTEGER", null, false));
        i4.e eVar7 = new i4.e("Preference", map7, new HashSet(0), new HashSet(0));
        i4.e eVarA7 = i4.e.a(bVar, "Preference");
        if (eVar7.equals(eVarA7)) {
            return new g4.g(true, (String) null);
        }
        return new g4.g(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7);
    }

    public static i o(int i10) {
        return new i(lb.a.a(e0.a(i10)));
    }

    @Override // k6.s
    public r M(x xVar) {
        return new d0(this);
    }

    @Override // ea.k4
    public void a(String str, Bundle bundle, String str2) {
        p2 p2Var = (p2) this.f50111a;
        if (TextUtils.isEmpty(str)) {
            p2Var.K0("auto", bundle, "_err");
        } else {
            p2Var.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    @Override // ea.t0
    public /* synthetic */ void b(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        ((e4) this.f50111a).y(str, i10, th2, bArr, map);
    }

    @Override // e6.g
    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f50111a)) {
            ((ByteBuffer) this.f50111a).position(0);
            messageDigest.update(((ByteBuffer) this.f50111a).putInt(num.intValue()).array());
        }
    }

    @Override // k6.c0
    public com.bumptech.glide.load.data.e d(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f50111a, uri, 0);
    }

    @Override // b7.a
    public Object e() {
        b2.p pVar = (b2.p) this.f50111a;
        return new g6.j((i9.i) pVar.f5364c, (v9.e) pVar.f5365d);
    }

    @Override // i8.b
    public void f(List needPermissions) {
        kotlin.jvm.internal.n.f(needPermissions, "needPermissions");
    }

    @Override // i8.b
    public void g() {
        ((d8.f) this.f50111a).f38781g.f(null, "update", null, null, 0);
    }

    @Override // vj.a
    public Object get() {
        uc.d dVar = (uc.d) ((k5.g) this.f50111a).f44326b;
        com.bumptech.glide.d.j(dVar);
        return dVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // i8.b
    public void h(List deniedPermissions, List grantedPermissions, List needPermissions) {
        kotlin.jvm.internal.n.f(deniedPermissions, "deniedPermissions");
        kotlin.jvm.internal.n.f(grantedPermissions, "grantedPermissions");
        kotlin.jvm.internal.n.f(needPermissions, "needPermissions");
    }

    /* JADX WARN: Code duplicated, block: B:130:0x029b  */
    public void i(int i10, int i11, n2.l lVar) throws i1.e0 {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        f3.e eVar = (f3.e) this.f50111a;
        f3.f fVar = eVar.f40581b;
        SparseArray sparseArray = eVar.f40583c;
        l1.q qVar = eVar.f40598k;
        l1.q qVar2 = eVar.f40594i;
        int i23 = 2;
        int i24 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (eVar.O != 2) {
                    return;
                }
                f3.d dVar = (f3.d) sparseArray.get(eVar.U);
                int i25 = eVar.X;
                l1.q qVar3 = eVar.f40602p;
                if (i25 != 4 || !"V_VP9".equals(dVar.f40549c)) {
                    lVar.skipFully(i11);
                    return;
                } else {
                    qVar3.J(i11);
                    lVar.readFully(qVar3.f44813a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                eVar.f(i10);
                f3.d dVar2 = eVar.f40611y;
                int i26 = dVar2.f40555h;
                if (i26 != 1685485123 && i26 != 1685480259) {
                    lVar.skipFully(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                dVar2.P = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                eVar.f(i10);
                byte[] bArr2 = new byte[i11];
                eVar.f40611y.f40557j = bArr2;
                lVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                lVar.readFully(bArr3, 0, i11);
                eVar.f(i10);
                eVar.f40611y.f40558k = new z(1, bArr3, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(qVar.f44813a, (byte) 0);
                lVar.readFully(qVar.f44813a, 4 - i11, i11);
                qVar.M(0);
                eVar.A = (int) qVar.B();
                return;
            }
            if (i10 == 25506) {
                eVar.f(i10);
                byte[] bArr4 = new byte[i11];
                eVar.f40611y.l = bArr4;
                lVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw i1.e0.a(null, "Unexpected id: " + i10);
            }
            eVar.f(i10);
            byte[] bArr5 = new byte[i11];
            eVar.f40611y.f40570x = bArr5;
            lVar.readFully(bArr5, 0, i11);
            return;
        }
        int i27 = 8;
        if (eVar.O == 0) {
            eVar.U = (int) fVar.b(lVar, false, true, 8);
            eVar.V = fVar.f40616c;
            eVar.Q = C.TIME_UNSET;
            eVar.O = 1;
            qVar2.J(0);
        }
        f3.d dVar3 = (f3.d) sparseArray.get(eVar.U);
        if (dVar3 == null) {
            lVar.skipFully(i11 - eVar.V);
            eVar.O = 0;
            return;
        }
        dVar3.f40546a0.getClass();
        if (eVar.O == 1) {
            eVar.j(lVar, 3);
            int i28 = (qVar2.f44813a[2] & 6) >> 1;
            if (i28 == 0) {
                eVar.S = 1;
                int[] iArr = eVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                eVar.T = iArr;
                iArr[0] = (i11 - eVar.V) - 3;
            } else {
                eVar.j(lVar, 4);
                int i29 = (qVar2.f44813a[3] & 255) + 1;
                eVar.S = i29;
                int[] iArr2 = eVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i29];
                    i12 = 4;
                } else {
                    i12 = 4;
                    if (iArr2.length < i29) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i29)];
                    }
                }
                eVar.T = iArr2;
                if (i28 == 2) {
                    int i30 = (i11 - eVar.V) - 4;
                    int i31 = eVar.S;
                    Arrays.fill(iArr2, 0, i31, i30 / i31);
                } else {
                    if (i28 == 1) {
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = i12;
                        while (true) {
                            i19 = eVar.S - 1;
                            if (i32 >= i19) {
                                break;
                            }
                            eVar.T[i32] = 0;
                            while (true) {
                                i20 = i34 + 1;
                                eVar.j(lVar, i20);
                                int i35 = qVar2.f44813a[i34] & 255;
                                int[] iArr3 = eVar.T;
                                i21 = iArr3[i32] + i35;
                                iArr3[i32] = i21;
                                if (i35 != 255) {
                                    break;
                                } else {
                                    i34 = i20;
                                }
                            }
                            i33 += i21;
                            i32++;
                            i34 = i20;
                        }
                        eVar.T[i19] = ((i11 - eVar.V) - i34) - i33;
                    } else {
                        if (i28 != 3) {
                            throw i1.e0.a(null, "Unexpected lacing value: " + i28);
                        }
                        int i36 = 0;
                        int i37 = 0;
                        int i38 = i12;
                        while (true) {
                            int i39 = eVar.S - 1;
                            if (i36 >= i39) {
                                i13 = i23;
                                i14 = i24;
                                eVar.T[i39] = ((i11 - eVar.V) - i38) - i37;
                                break;
                            }
                            eVar.T[i36] = i24;
                            int i40 = i38 + 1;
                            eVar.j(lVar, i40);
                            if (qVar2.f44813a[i38] == 0) {
                                throw i1.e0.a(null, "No valid varint length mask found");
                            }
                            int i41 = i24;
                            while (true) {
                                if (i41 >= i27) {
                                    i15 = i27;
                                    i16 = i23;
                                    i17 = i24;
                                    j10 = 0;
                                    i18 = i40;
                                    break;
                                }
                                i15 = i27;
                                int i42 = 1 << (7 - i41);
                                i17 = i24;
                                if ((qVar2.f44813a[i38] & i42) != 0) {
                                    i18 = i40 + i41;
                                    eVar.j(lVar, i18);
                                    i16 = i23;
                                    j10 = (~i42) & qVar2.f44813a[i38] & 255;
                                    while (i40 < i18) {
                                        j10 = (j10 << i15) | ((long) (qVar2.f44813a[i40] & 255));
                                        i40++;
                                    }
                                    if (i36 <= 0) {
                                        break;
                                    }
                                    j10 -= (1 << ((i41 * 7) + 6)) - 1;
                                    break;
                                }
                                i41++;
                                i24 = i17;
                                i27 = i15;
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw i1.e0.a(null, "EBML lacing sample size out of range.");
                            }
                            int i43 = (int) j10;
                            int[] iArr4 = eVar.T;
                            if (i36 != 0) {
                                i43 += iArr4[i36 - 1];
                            }
                            iArr4[i36] = i43;
                            i37 += i43;
                            i36++;
                            i38 = i18;
                            i24 = i17;
                            i27 = i15;
                            i23 = i16;
                        }
                    }
                    byte[] bArr6 = qVar2.f44813a;
                    eVar.P = eVar.l((bArr6[1] & 255) | (bArr6[i14] << 8)) + eVar.M;
                    if (dVar3.f40552e != 1 || (i10 == 163 && (qVar2.f44813a[i13] & 128) == 128)) {
                        i22 = 1;
                    } else {
                        i22 = i14;
                    }
                    eVar.W = i22;
                    eVar.O = i13;
                    eVar.R = i14;
                }
            }
            i13 = 2;
            i14 = 0;
            byte[] bArr7 = qVar2.f44813a;
            eVar.P = eVar.l((bArr7[1] & 255) | (bArr7[i14] << 8)) + eVar.M;
            if (dVar3.f40552e != 1) {
                i22 = 1;
            } else {
                i22 = 1;
            }
            eVar.W = i22;
            eVar.O = i13;
            eVar.R = i14;
        }
        if (i10 == 163) {
            while (true) {
                int i44 = eVar.R;
                if (i44 >= eVar.S) {
                    eVar.O = 0;
                    return;
                }
                eVar.g(dVar3, ((long) ((eVar.R * dVar3.f40553f) / 1000)) + eVar.P, eVar.W, eVar.m(lVar, dVar3, eVar.T[i44], false), 0);
                eVar.R++;
            }
        } else {
            while (true) {
                int i45 = eVar.R;
                if (i45 >= eVar.S) {
                    return;
                }
                int[] iArr5 = eVar.T;
                iArr5[i45] = eVar.m(lVar, dVar3, iArr5[i45], true);
                eVar.R++;
            }
        }
    }

    public r0 j() {
        List listUnmodifiableList;
        o0 o0VarZ = r0.z();
        o0VarZ.q(((Trace) this.f50111a).f24717d);
        o0VarZ.o(((Trace) this.f50111a).f24724k.f45967a);
        Trace trace = (Trace) this.f50111a;
        o0VarZ.p(trace.f24724k.c(trace.l));
        for (gd.c cVar : ((Trace) this.f50111a).f24718e.values()) {
            o0VarZ.m(cVar.f41844b.get(), cVar.f41843a);
        }
        ArrayList arrayList = ((Trace) this.f50111a).f24721h;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o0VarZ.j(new i((Trace) it.next()).j());
            }
        }
        o0VarZ.l(((Trace) this.f50111a).getAttributes());
        Trace trace2 = (Trace) this.f50111a;
        synchronized (trace2.f24720g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (jd.a aVar : trace2.f24720g) {
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k0[] k0VarArrB = jd.a.b(listUnmodifiableList);
        if (k0VarArrB != null) {
            o0VarZ.d(Arrays.asList(k0VarArrB));
        }
        return (r0) o0VarZ.build();
    }

    @Override // kb.h
    public Object l(String str) {
        return ((kb.j) this.f50111a).c(str, null);
    }

    public void m(int i10, long j10) throws i1.e0 {
        f3.e eVar = (f3.e) this.f50111a;
        if (i10 == 240) {
            if (eVar.f40612z) {
                return;
            }
            eVar.e(i10);
            if (eVar.H == -1) {
                eVar.H = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (eVar.f40612z) {
                return;
            }
            eVar.e(i10);
            if (eVar.G == -1) {
                eVar.G = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw i1.e0.a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw i1.e0.a(null, "ContentEncodingScope " + j10 + " not supported");
        }
        switch (i10) {
            case 131:
                int i11 = (int) j10;
                if (i11 == 1) {
                    eVar.f(i10);
                    eVar.f40611y.f40552e = 2;
                    return;
                }
                if (i11 == 2) {
                    eVar.f(i10);
                    eVar.f40611y.f40552e = 1;
                    return;
                } else if (i11 == 17) {
                    eVar.f(i10);
                    eVar.f40611y.f40552e = 3;
                    return;
                } else if (i11 != 33) {
                    eVar.f(i10);
                    eVar.f40611y.f40552e = -1;
                    return;
                } else {
                    eVar.f(i10);
                    eVar.f40611y.f40552e = 5;
                    return;
                }
            case 136:
                eVar.f(i10);
                eVar.f40611y.Y = j10 == 1;
                return;
            case 155:
                eVar.Q = eVar.l(j10);
                return;
            case 159:
                eVar.f(i10);
                eVar.f40611y.Q = (int) j10;
                return;
            case 176:
                eVar.f(i10);
                eVar.f40611y.f40560n = (int) j10;
                return;
            case 179:
                if (eVar.f40612z) {
                    return;
                }
                eVar.e(i10);
                eVar.E = eVar.l(j10);
                return;
            case 186:
                eVar.f(i10);
                eVar.f40611y.f40561o = (int) j10;
                return;
            case 215:
                eVar.f(i10);
                eVar.f40611y.f40551d = (int) j10;
                return;
            case 231:
                eVar.M = eVar.l(j10);
                return;
            case 238:
                eVar.X = (int) j10;
                return;
            case 247:
                if (eVar.f40612z) {
                    return;
                }
                eVar.e(i10);
                eVar.F = (int) j10;
                return;
            case 251:
                eVar.Y = true;
                return;
            case 16871:
                eVar.f(i10);
                eVar.f40611y.f40555h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw i1.e0.a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw i1.e0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw i1.e0.a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw i1.e0.a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw i1.e0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                eVar.B = j10 + eVar.f40605s;
                return;
            case 21432:
                int i12 = (int) j10;
                eVar.f(i10);
                if (i12 == 0) {
                    eVar.f40611y.f40571y = 0;
                    return;
                }
                if (i12 == 1) {
                    eVar.f40611y.f40571y = 2;
                    return;
                } else if (i12 == 3) {
                    eVar.f40611y.f40571y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    eVar.f40611y.f40571y = 3;
                    return;
                }
            case 21680:
                eVar.f(i10);
                eVar.f40611y.f40563q = (int) j10;
                return;
            case 21682:
                eVar.f(i10);
                eVar.f40611y.f40565s = (int) j10;
                return;
            case 21690:
                eVar.f(i10);
                eVar.f40611y.f40564r = (int) j10;
                return;
            case 21930:
                eVar.f(i10);
                eVar.f40611y.X = j10 == 1;
                return;
            case 21938:
                eVar.f(i10);
                f3.d dVar = eVar.f40611y;
                dVar.f40572z = true;
                dVar.f40562p = (int) j10;
                return;
            case 21998:
                eVar.f(i10);
                eVar.f40611y.f40554g = (int) j10;
                return;
            case 22186:
                eVar.f(i10);
                eVar.f40611y.T = j10;
                return;
            case 22203:
                eVar.f(i10);
                eVar.f40611y.U = j10;
                return;
            case 25188:
                eVar.f(i10);
                eVar.f40611y.R = (int) j10;
                return;
            case 30114:
                eVar.Z = j10;
                return;
            case 30321:
                eVar.f(i10);
                int i13 = (int) j10;
                if (i13 == 0) {
                    eVar.f40611y.f40566t = 0;
                    return;
                }
                if (i13 == 1) {
                    eVar.f40611y.f40566t = 1;
                    return;
                } else if (i13 == 2) {
                    eVar.f40611y.f40566t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    eVar.f40611y.f40566t = 3;
                    return;
                }
            case 2352003:
                eVar.f(i10);
                eVar.f40611y.f40553f = (int) j10;
                return;
            case 2807729:
                eVar.f40606t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        eVar.f(i10);
                        int i14 = (int) j10;
                        if (i14 == 1) {
                            eVar.f40611y.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            eVar.f40611y.C = 1;
                            return;
                        }
                    case 21946:
                        eVar.f(i10);
                        int iG = i1.h.g((int) j10);
                        if (iG != -1) {
                            eVar.f40611y.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        eVar.f(i10);
                        eVar.f40611y.f40572z = true;
                        int iF = i1.h.f((int) j10);
                        if (iF != -1) {
                            eVar.f40611y.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        eVar.f(i10);
                        eVar.f40611y.D = (int) j10;
                        return;
                    case 21949:
                        eVar.f(i10);
                        eVar.f40611y.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.f50111a).countDown();
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, xi.o oVar) {
        if (!"check".equals(mVar.f53822a)) {
            ((wi.j) oVar).c();
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ((od.c) this.f50111a).f47386b;
        ((wi.j) oVar).a(od.c.h(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        r4.d dVar;
        r4.d dVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) no.b.e(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        oa.k0[] k0VarArr = new oa.k0[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            oa.k0 k0Var = new oa.k0(10, false);
            k0Var.f47269b = (WebMessagePortBoundaryInterface) no.b.e(WebMessagePortBoundaryInterface.class, invocationHandler3);
            k0VarArr[i10] = k0Var;
        }
        if (m.f50116b.a()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) no.b.e(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    dVar2 = null;
                } else {
                    dVar = new r4.d(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
                }
                if (dVar2 != null) {
                    JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) no.b.e(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                    ((r4.f) this.f50111a).onPostMessage(webView, dVar2, uri, z10, (e) jsReplyProxyBoundaryInterface.getOrCreatePeer(new hc.c(jsReplyProxyBoundaryInterface, 3)));
                }
            }
            dVar = new r4.d(webMessagePayloadBoundaryInterface.getAsString());
        } else {
            dVar = new r4.d(webMessageBoundaryInterface.getData());
        }
        dVar2 = dVar;
        if (dVar2 != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface2 = (JsReplyProxyBoundaryInterface) no.b.e(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            ((r4.f) this.f50111a).onPostMessage(webView, dVar2, uri, z10, (e) jsReplyProxyBoundaryInterface2.getOrCreatePeer(new hc.c(jsReplyProxyBoundaryInterface2, 3)));
        }
    }

    public void p(Activity activity) {
        h9.k kVar = (h9.k) this.f50111a;
        ArrayList<WeakReference> arrayList = (ArrayList) kVar.f42288c;
        for (WeakReference weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((b0.d) kVar.f42289d);
    }

    public void q(int i10, long j10, long j11) throws i1.e0 {
        f3.e eVar = (f3.e) this.f50111a;
        eVar.f40597j0.getClass();
        if (i10 == 160) {
            eVar.Y = false;
            eVar.Z = 0L;
            return;
        }
        if (i10 == 174) {
            f3.d dVar = new f3.d();
            dVar.f40560n = -1;
            dVar.f40561o = -1;
            dVar.f40562p = -1;
            dVar.f40563q = -1;
            dVar.f40564r = -1;
            dVar.f40565s = 0;
            dVar.f40566t = -1;
            dVar.f40567u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            dVar.f40568v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            dVar.f40569w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            dVar.f40570x = null;
            dVar.f40571y = -1;
            dVar.f40572z = false;
            dVar.A = -1;
            dVar.B = -1;
            dVar.C = -1;
            dVar.D = 1000;
            dVar.E = 200;
            dVar.F = -1.0f;
            dVar.G = -1.0f;
            dVar.H = -1.0f;
            dVar.I = -1.0f;
            dVar.J = -1.0f;
            dVar.K = -1.0f;
            dVar.L = -1.0f;
            dVar.M = -1.0f;
            dVar.N = -1.0f;
            dVar.O = -1.0f;
            dVar.Q = 1;
            dVar.R = -1;
            dVar.S = 8000;
            dVar.T = 0L;
            dVar.U = 0L;
            dVar.W = false;
            dVar.Y = true;
            dVar.Z = "eng";
            eVar.f40611y = dVar;
            dVar.f40545a = eVar.f40609w;
            return;
        }
        if (i10 == 183) {
            if (eVar.f40612z) {
                return;
            }
            eVar.e(i10);
            eVar.F = -1;
            eVar.G = -1L;
            eVar.H = -1L;
            return;
        }
        if (i10 == 187) {
            if (eVar.f40612z) {
                return;
            }
            eVar.e(i10);
            eVar.E = C.TIME_UNSET;
            return;
        }
        if (i10 == 19899) {
            eVar.A = -1;
            eVar.B = -1L;
            return;
        }
        if (i10 == 20533) {
            eVar.f(i10);
            eVar.f40611y.f40556i = true;
            return;
        }
        if (i10 == 21968) {
            eVar.f(i10);
            eVar.f40611y.f40572z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = eVar.f40605s;
            if (j12 != -1 && j12 != j10) {
                throw i1.e0.a(null, "Multiple Segment elements not supported");
            }
            eVar.f40605s = j10;
            eVar.f40604r = j11;
            return;
        }
        if (i10 == 475249515) {
            if (eVar.f40612z) {
                return;
            }
            eVar.D = true;
        } else if (i10 == 524531317 && !eVar.f40612z) {
            if (eVar.f40585d && eVar.K != -1) {
                eVar.J = true;
            } else {
                eVar.f40597j0.u(new n2.o(eVar.f40608v));
                eVar.f40612z = true;
            }
        }
    }

    public void r(int i10, String str) throws i1.e0 {
        f3.e eVar = (f3.e) this.f50111a;
        if (i10 == 134) {
            eVar.f(i10);
            eVar.f40611y.f40549c = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                eVar.f40609w = str.equals("webm");
                return;
            }
            throw i1.e0.a(null, "DocType " + str + " not supported");
        }
        if (i10 == 21358) {
            eVar.f(i10);
            eVar.f40611y.f40547b = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            eVar.f(i10);
            eVar.f40611y.Z = str;
        }
    }

    public i(int i10) {
        switch (i10) {
            case 14:
                this.f50111a = new j2.n(3);
                break;
            case 18:
                this.f50111a = new k6.o(500L);
                break;
            case 22:
                SharedPreferences sharedPreferences = l7.s.b().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                kotlin.jvm.internal.n.e(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
                this.f50111a = sharedPreferences;
                break;
            case 27:
                this.f50111a = ByteBuffer.allocate(4);
                break;
            default:
                this.f50111a = new h9.k(1);
                break;
        }
    }
}
