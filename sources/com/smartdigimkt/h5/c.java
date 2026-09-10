package com.smartdigimkt.h5;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.v3.i;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c implements com.smartdigimkt.h5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f35662h = "extra_scenario";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35663a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f35664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.smartdigimkt.v6.a f35665c;
    protected String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f35666e;
    protected com.smartdigimkt.z6.a f;
    private Map<String, Object> g;

    public class b implements Runnable {
        final /* synthetic */ com.smartdigimkt.f5.c X;

        public b(com.smartdigimkt.f5.c cVar) {
            this.X = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.isReady()) {
                com.smartdigimkt.f5.c cVar = this.X;
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            }
            com.smartdigimkt.f5.c cVar2 = this.X;
            if (cVar2 != null) {
                cVar2.a(i.a("30001", "No fill, offer = null!"));
            }
        }
    }

    public c(Context context, com.smartdigimkt.v6.a aVar, String str, boolean z2) {
        this.f35664b = context.getApplicationContext();
        this.f35665c = aVar;
        this.d = str;
        this.f35666e = z2;
    }

    private h b() {
        if (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.f35665c.f39163a)) {
            return i.a("30001", "offerid、placementid can not be null!");
        }
        com.smartdigimkt.z6.a aVarA = com.smartdigimkt.i5.a.a(this.f35664b).a(this.f35665c.f39163a, this.d);
        this.f = aVarA;
        if (aVarA == null) {
            return i.a("30001", "No fill, offer = null!");
        }
        if (this.f35665c.t == null) {
            return i.a("30002", "No fill, setting = null!");
        }
        return null;
    }

    public void a(Map<String, Object> map) {
        this.g = map;
    }

    public void c() {
    }

    public Map<String, Object> d() {
        return this.g;
    }

    public com.smartdigimkt.v6.a e() {
        return this.f35665c;
    }

    public com.smartdigimkt.z6.a f() {
        return this.f;
    }

    public int g() {
        return com.smartdigimkt.m3.i.a(this.f, this.f35665c);
    }

    @Override // com.smartdigimkt.h5.a
    public boolean isReady() {
        try {
            if (a()) {
                return com.smartdigimkt.i5.a.a(this.f35664b).a(this.f, this.f35665c, this.f35666e);
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.smartdigimkt.h5.a
    public void a(com.smartdigimkt.f5.c cVar) {
        try {
            h hVarB = b();
            if (hVarB != null) {
                if (cVar != null) {
                    cVar.a(hVarB);
                    return;
                }
                return;
            }
            Map<String, Object> map = this.g;
            int iA = 0;
            if (map != null && !map.isEmpty()) {
                iA = com.smartdigimkt.n8.h.a(this.g, SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 0);
            }
            if (iA == 1) {
                com.smartdigimkt.l7.b.a().g(new b(cVar));
                return;
            }
            com.smartdigimkt.i5.a aVarA = com.smartdigimkt.i5.a.a(this.f35664b);
            com.smartdigimkt.v6.a aVar = this.f35665c;
            aVarA.a(aVar.f39163a, this.f, aVar, new a(cVar));
        } catch (Exception e2) {
            e2.printStackTrace();
            if (cVar != null) {
                cVar.a(i.a("-9999", e2.getMessage()));
            }
        }
    }

    public class a implements com.smartdigimkt.r3.c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.f5.c f35667a;

        public a(com.smartdigimkt.f5.c cVar) {
            this.f35667a = cVar;
        }

        @Override // com.smartdigimkt.r3.c.h
        public void a() {
            com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
            if (cVarB != null && cVarB.a()) {
                c cVar = c.this;
                cVarB.fillDataFetchStatus(cVar.f35664b, cVar.f, cVar.f35665c);
            }
            com.smartdigimkt.f5.c cVar2 = this.f35667a;
            if (cVar2 != null) {
                cVar2.a();
            }
        }

        @Override // com.smartdigimkt.r3.c.h
        public void a(h hVar) {
            com.smartdigimkt.f5.c cVar = this.f35667a;
            if (cVar != null) {
                cVar.a(hVar);
            }
        }
    }

    public boolean a() {
        if (this.f35664b == null || TextUtils.isEmpty(this.f35665c.f39163a) || TextUtils.isEmpty(this.d)) {
            return false;
        }
        if (this.f != null) {
            return true;
        }
        com.smartdigimkt.z6.a aVarA = com.smartdigimkt.i5.a.a(this.f35664b).a(this.f35665c.f39163a, this.d);
        this.f = aVarA;
        return aVarA != null;
    }
}
