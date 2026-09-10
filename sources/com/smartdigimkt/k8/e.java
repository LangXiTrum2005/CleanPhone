package com.smartdigimkt.k8;

import com.smartdigimkt.b8.m;
import com.smartdigimkt.c8.l;
import com.smartdigimkt.sdk.api.AdError;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36279c = "e";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f36281b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, m> f36280a = new ConcurrentHashMap();

    public void a(l lVar, com.smartdigimkt.w7.c cVar) {
        if (lVar == null) {
            if (cVar != null) {
                cVar.a(0, "loaderParams is null.", com.smartdigimkt.v7.b.a("30001", "loaderParams is null."));
                return;
            }
            return;
        }
        String strN = lVar.n();
        synchronized (this.f36281b) {
            try {
                m mVar = this.f36280a.get(lVar.n());
                if (mVar != null) {
                    mVar.a(cVar);
                    return;
                }
                m mVar2 = new m(lVar);
                this.f36280a.put(strN, mVar2);
                mVar2.a(new a(strN, cVar, this.f36280a));
                mVar2.f(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static class a implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.smartdigimkt.w7.c f36283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, m> f36284c;

        public a(String str, com.smartdigimkt.w7.c cVar, Map<String, m> map) {
            this.f36282a = str;
            this.f36283b = cVar;
            this.f36284c = map;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            com.smartdigimkt.w7.c cVar = this.f36283b;
            if (cVar != null) {
                cVar.a(i2, obj);
            }
            Map<String, m> map = this.f36284c;
            if (map != null) {
                map.remove(this.f36282a);
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
            com.smartdigimkt.w7.c cVar = this.f36283b;
            if (cVar != null) {
                cVar.b(i2);
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            com.smartdigimkt.w7.c cVar = this.f36283b;
            if (cVar != null) {
                cVar.a(i2, str, adError);
            }
            Map<String, m> map = this.f36284c;
            if (map != null) {
                map.remove(this.f36282a);
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            com.smartdigimkt.w7.c cVar = this.f36283b;
            if (cVar != null) {
                cVar.a(i2);
            }
            Map<String, m> map = this.f36284c;
            if (map != null) {
                map.remove(this.f36282a);
            }
        }
    }
}
