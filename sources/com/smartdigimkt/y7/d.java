package com.smartdigimkt.y7;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.n8.p;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements h {
    public static final String d = "sdm_app_pl_cl_retry";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f40264a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Object f40266c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map<String, Long> f40265b = new ConcurrentHashMap(1);

    public d(Context context) {
        this.f40264a = context;
    }

    @Override // com.smartdigimkt.y7.h
    public com.smartdigimkt.x7.e a(com.smartdigimkt.x7.c cVar) {
        String strB = b(cVar);
        if (this.f40265b == null || TextUtils.isEmpty(strB)) {
            return null;
        }
        com.smartdigimkt.x7.e eVarA = com.smartdigimkt.x7.e.a();
        synchronized (this.f40266c) {
            try {
                Long lValueOf = this.f40265b.get(strB);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(p.a(this.f40264a, "sdm_app_pl_cl_retry", strB, 0L));
                    this.f40265b.put(strB, lValueOf);
                }
                if (lValueOf.longValue() == 0) {
                    eVarA.a(false);
                } else if (lValueOf.longValue() == -1) {
                    eVarA.a(true);
                    eVarA.b(700);
                } else {
                    boolean z2 = System.currentTimeMillis() - lValueOf.longValue() < 0;
                    if (z2) {
                        eVarA.b(700);
                    }
                    eVarA.a(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVarA;
    }

    public String b(com.smartdigimkt.x7.c cVar) {
        return cVar != null ? cVar.b() : "";
    }

    public boolean c(com.smartdigimkt.x7.c cVar) {
        return false;
    }
}
