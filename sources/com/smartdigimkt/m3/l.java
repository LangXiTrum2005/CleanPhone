package com.smartdigimkt.m3;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile l f36619e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36621b;
    k d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36620a = "l";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, com.smartdigimkt.w6.f> f36622c = new ConcurrentHashMap<>();

    private l(Context context) {
        this.f36621b = context;
    }

    public static l a(Context context) {
        if (f36619e == null) {
            synchronized (l.class) {
                try {
                    if (f36619e == null) {
                        f36619e = new l(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36619e;
    }

    public void b() {
        if (this.d != null) {
            com.smartdigimkt.t6.a.a(this.f36621b).a(this.d);
            this.d = null;
        }
    }

    public void c(String str, String str2) {
        com.smartdigimkt.w6.f fVar = this.f36622c.get(str);
        if (fVar != null) {
            com.smartdigimkt.v3.l lVar = new com.smartdigimkt.v3.l("", "", "");
            com.smartdigimkt.v3.b bVar = new com.smartdigimkt.v3.b();
            lVar.k = bVar;
            bVar.f39077a = str2;
            f.a(18, fVar, lVar);
        }
    }

    public void d(String str, String str2) {
        com.smartdigimkt.w6.f fVar = this.f36622c.get(str);
        if (fVar != null) {
            com.smartdigimkt.v3.l lVar = new com.smartdigimkt.v3.l("", "", "");
            com.smartdigimkt.v3.b bVar = new com.smartdigimkt.v3.b();
            lVar.k = bVar;
            bVar.f39077a = str2;
            f.a(20, fVar, lVar);
        }
    }

    public void e(String str, String str2) {
        com.smartdigimkt.w6.f fVarRemove = this.f36622c.remove(str);
        if (fVarRemove != null) {
            com.smartdigimkt.v3.l lVar = new com.smartdigimkt.v3.l("", "", "");
            com.smartdigimkt.v3.b bVar = new com.smartdigimkt.v3.b();
            lVar.k = bVar;
            bVar.f39077a = str2;
            f.a(21, fVarRemove, lVar);
            a(fVarRemove, lVar);
        }
        if (this.f36622c.size() == 0) {
            b();
        }
    }

    public void b(String str, String str2) {
        com.smartdigimkt.w6.f fVar = this.f36622c.get(str);
        if (fVar != null) {
            com.smartdigimkt.v3.l lVar = new com.smartdigimkt.v3.l("", "", "");
            com.smartdigimkt.v3.b bVar = new com.smartdigimkt.v3.b();
            lVar.k = bVar;
            bVar.f39077a = str2;
            f.a(19, fVar, lVar);
        }
    }

    public void a() {
        if (this.f36621b != null && this.d == null) {
            this.d = new k();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.smartdigimkt.p6.c.C0567c.f37667a);
            intentFilter.addAction(com.smartdigimkt.p6.c.C0567c.f37668b);
            intentFilter.addAction(com.smartdigimkt.p6.c.C0567c.f37669c);
            intentFilter.addAction(com.smartdigimkt.p6.c.C0567c.d);
            intentFilter.addAction(com.smartdigimkt.p6.c.C0567c.f37670e);
            com.smartdigimkt.t6.a.a(this.f36621b).a(this.d, intentFilter);
        }
    }

    public void a(String str, com.smartdigimkt.w6.f fVar) {
        this.f36622c.put(str, fVar);
    }

    public void a(String str, String str2) {
        com.smartdigimkt.w6.f fVarRemove = this.f36622c.remove(str);
        this.f36622c.size();
        if (fVarRemove != null) {
            a(fVarRemove, new com.smartdigimkt.v3.l("", "", ""));
        }
        if (this.f36622c.size() == 0) {
            b();
        }
    }

    public void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v3.l lVar) {
        if (fVar != null) {
            fVar.i();
        }
        if (fVar == null || fVar.i() == null) {
            return;
        }
        fVar.i().H1();
        if (fVar.i().H1() == 1) {
            if (lVar == null) {
                lVar = new com.smartdigimkt.v3.l("", "", "");
            }
            if (lVar.k == null) {
                lVar.k = new com.smartdigimkt.v3.b();
            }
            lVar.k.f39079c = 1001;
            f.a(9, fVar, lVar);
        }
    }
}
