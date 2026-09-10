package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f10309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<CrashType, c> f10311c = new HashMap();
    private b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f10312e;

    /* JADX INFO: renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10313a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f10313a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10313a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10313a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10313a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10313a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10313a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10313a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10313a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(Context context) {
        this.f10310b = context;
        try {
            this.d = b.d();
            this.f10312e = new d(this.f10310b);
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        }
    }

    public static f a() {
        if (f10309a == null) {
            Context contextG = com.apm.insight.e.g();
            if (contextG == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f10309a = new f(contextG);
        }
        return f10309a;
    }

    private c a(CrashType crashType) {
        c jVar = this.f10311c.get(crashType);
        if (jVar != null) {
            return jVar;
        }
        switch (AnonymousClass1.f10313a[crashType.ordinal()]) {
            case 1:
                jVar = new j(this.f10310b, this.d, this.f10312e);
                break;
            case 2:
                jVar = new k(this.f10310b, this.d, this.f10312e);
                break;
            case 3:
                jVar = new l(this.f10310b, this.d, this.f10312e);
                break;
            case 4:
                jVar = new a(this.f10310b, this.d, this.f10312e);
                break;
            case 5:
                jVar = new h(this.f10310b, this.d, this.f10312e);
                break;
            case 6:
                jVar = new g(this.f10310b, this.d, this.f10312e);
                break;
            case 7:
                jVar = new e(this.f10310b, this.d, this.f10312e);
                break;
            case 8:
                jVar = new i(this.f10310b, this.d, this.f10312e);
                break;
        }
        if (jVar != null) {
            this.f10311c.put(crashType, jVar);
        }
        return jVar;
    }

    public final com.apm.insight.entity.a a(CrashType crashType, c.a aVar) {
        c cVarA;
        if (crashType == null || (cVarA = a(crashType)) == null) {
            return null;
        }
        return cVarA.a(null, aVar, true);
    }

    public final com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar) {
        c cVarA;
        return (crashType == null || (cVarA = a(crashType)) == null) ? aVar : cVarA.a(aVar, null, false);
    }

    public final com.apm.insight.entity.a a(List<com.apm.insight.entity.a> list, JSONArray jSONArray) {
        if (list.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        JSONArray jSONArray2 = new JSONArray();
        Iterator<com.apm.insight.entity.a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next().c());
        }
        aVar.a("data", (Object) jSONArray2);
        aVar.a("all_data", (Object) jSONArray);
        Header headerA = Header.a(this.f10310b);
        Header.a(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        Header.b(headerA);
        aVar.a(headerA);
        return aVar;
    }
}
