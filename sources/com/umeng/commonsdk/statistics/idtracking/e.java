package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.bt;
import com.umeng.analytics.pro.bz;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f2674a = 86400000;
    public static e b;
    private static final String c = ay.b().b("id");
    private static Object j = new Object();
    private File d;
    private long f;
    private a i;
    private com.umeng.commonsdk.statistics.proto.c e = null;
    private Set<com.umeng.commonsdk.statistics.idtracking.a> h = new HashSet();
    private long g = 86400000;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f2675a;
        private Set<String> b = new HashSet();

        public a(Context context) {
            this.f2675a = context;
        }

        public synchronized boolean a(String str) {
            return !this.b.contains(str);
        }

        public synchronized void b(String str) {
            this.b.add(str);
        }

        public void c(String str) {
            this.b.remove(str);
        }

        public synchronized void a() {
            try {
                if (!this.b.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = this.b.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(',');
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    PreferenceWrapper.getDefault(this.f2675a).edit().putString("invld_id", sb.toString()).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void b() {
            String[] strArrSplit;
            String string = PreferenceWrapper.getDefault(this.f2675a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.b.add(str);
                    }
                }
            }
        }
    }

    public e(Context context) {
        this.i = null;
        this.d = new File(context.getFilesDir(), c);
        a aVar = new a(context);
        this.i = aVar;
        aVar.b();
    }

    public static synchronized void a() {
        e eVar = b;
        if (eVar != null) {
            eVar.e();
            b = null;
        }
    }

    private synchronized void h() {
        try {
            com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                if (aVar.c()) {
                    if (aVar.d() != null) {
                        map.put(aVar.b(), aVar.d());
                    }
                    if (aVar.e() != null && !aVar.e().isEmpty()) {
                        arrayList.addAll(aVar.e());
                    }
                }
            }
            cVar.a(arrayList);
            cVar.a(map);
            synchronized (this) {
                this.e = cVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private com.umeng.commonsdk.statistics.proto.c i() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (j) {
            if (!this.d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    try {
                        byte[] streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
                        new bt().a(cVar, streamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return cVar;
                    } catch (Throwable th2) {
                        th = th2;
                        HelperUtils.safeClose(fileInputStream);
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    HelperUtils.safeClose(fileInputStream);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
        }
    }

    public synchronized void b() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f >= this.g) {
                boolean z = false;
                for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                    if (aVar.c() && aVar.a()) {
                        if (!aVar.c()) {
                            this.i.b(aVar.b());
                        }
                        z = true;
                    }
                }
                if (z) {
                    h();
                    this.i.a();
                    g();
                }
                this.f = jCurrentTimeMillis;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized com.umeng.commonsdk.statistics.proto.c c() {
        return this.e;
    }

    public String d() {
        return null;
    }

    public synchronized void e() {
        try {
            if (b == null) {
                return;
            }
            boolean z = false;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                if (aVar.c() && aVar.e() != null && !aVar.e().isEmpty()) {
                    aVar.a((List<com.umeng.commonsdk.statistics.proto.a>) null);
                    z = true;
                }
            }
            if (z) {
                this.e.b(false);
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f() {
        com.umeng.commonsdk.statistics.proto.c cVarI = i();
        if (cVarI == null) {
            return;
        }
        a(cVarI);
        ArrayList arrayList = new ArrayList(this.h.size());
        synchronized (this) {
            try {
                this.e = cVarI;
                for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                    aVar.a(this.e);
                    if (!aVar.c()) {
                        arrayList.add(aVar);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.h.remove((com.umeng.commonsdk.statistics.idtracking.a) it.next());
                }
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void g() {
        com.umeng.commonsdk.statistics.proto.c cVar = this.e;
        if (cVar != null) {
            b(cVar);
        }
    }

    public static synchronized e a(Context context) {
        try {
            if (b == null) {
                e eVar = new e(context);
                b = eVar;
                eVar.a(new f(context));
                b.a(new b(context));
                b.a(new j(context));
                b.a(new d(context));
                b.a(new g(context));
                b.a(new i());
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                    b.a(new h(context));
                    if (DeviceConfig.isHonorDevice()) {
                        b.a(new c(context));
                    }
                }
                b.f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    private void b(com.umeng.commonsdk.statistics.proto.c cVar) {
        byte[] bArrA;
        synchronized (j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        a(cVar);
                        bArrA = new bz().a(cVar);
                    }
                    if (bArrA != null) {
                        HelperUtils.writeFile(this.d, bArrA);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private boolean a(com.umeng.commonsdk.statistics.idtracking.a aVar) {
        if (this.i.a(aVar.b())) {
            return this.h.add(aVar);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.w("invalid domain: " + aVar.b());
        return false;
    }

    public void a(long j2) {
        this.g = j2;
    }

    private void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map;
        if (cVar == null || (map = cVar.f2693a) == null) {
            return;
        }
        if (map.containsKey("mac") && !FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
            cVar.f2693a.remove("mac");
        }
        if (cVar.f2693a.containsKey("imei") && !FieldManager.allow(com.umeng.commonsdk.utils.d.g)) {
            cVar.f2693a.remove("imei");
        }
        if (cVar.f2693a.containsKey("android_id") && !FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
            cVar.f2693a.remove("android_id");
        }
        if (cVar.f2693a.containsKey("serial") && !FieldManager.allow(com.umeng.commonsdk.utils.d.j)) {
            cVar.f2693a.remove("serial");
        }
        if (cVar.f2693a.containsKey("idfa") && !FieldManager.allow(com.umeng.commonsdk.utils.d.w)) {
            cVar.f2693a.remove("idfa");
        }
        if (!cVar.f2693a.containsKey("oaid") || FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return;
        }
        cVar.f2693a.remove("oaid");
    }
}
