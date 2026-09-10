package com.smartdigimkt.u8;

import android.text.TextUtils;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class d extends com.smartdigimkt.s8.c {
    private String f(com.smartdigimkt.s8.b bVar) {
        if (bVar == null) {
            return "load context is null";
        }
        if (bVar.m() == null) {
            return "place strategy is null";
        }
        if (bVar.q() == null) {
            return "unit group info is null";
        }
        return bVar.e() == null ? "ad request info is null" : "";
    }

    @Override // com.smartdigimkt.s8.c
    public boolean b(com.smartdigimkt.s8.b bVar) {
        com.smartdigimkt.h5.c eVar;
        SDMAdRequest sDMAdRequestC = bVar.c();
        int i2 = bVar.i();
        com.smartdigimkt.v6.a aVarE = bVar.e();
        String strF = f(bVar);
        if (!TextUtils.isEmpty(strF)) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "load fail:" + strF));
            return false;
        }
        aVarE.t = bVar.m().D();
        Map<String, Object> extraMap = sDMAdRequestC.getExtraMap();
        String strA = com.smartdigimkt.n8.h.a(extraMap, com.smartdigimkt.s8.a.C0584a.f38219e, "");
        boolean zA = com.smartdigimkt.n8.h.a(extraMap, "isDefaultOffer", false);
        if (TextUtils.isEmpty(strA)) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "load fail: offerId is null"));
            return false;
        }
        if (i2 == 0) {
            eVar = new com.smartdigimkt.h5.e(bVar.g(), aVarE, strA, zA);
        } else if (i2 == 1) {
            eVar = new com.smartdigimkt.h5.f(bVar.g(), aVarE, strA, zA);
        } else if (i2 == 2) {
            eVar = new com.smartdigimkt.h5.b(bVar.g(), aVarE, strA, zA);
        } else if (i2 != 3) {
            eVar = i2 != 4 ? null : new com.smartdigimkt.h5.g(bVar.g(), aVarE, strA, zA);
        } else {
            eVar = new com.smartdigimkt.h5.d(bVar.g(), aVarE, strA, zA);
        }
        if (eVar != null) {
            Map<String, Object> customEventMap = sDMAdRequestC.getCustomEventMap();
            if (customEventMap == null) {
                customEventMap = new HashMap<>();
            }
            eVar.a(customEventMap);
            eVar.a(new a(eVar, bVar));
        } else {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "not support format:" + aVarE.f39164b));
        }
        return false;
    }

    public class a implements com.smartdigimkt.f5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.h5.c f38947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.s8.b f38948b;

        public a(com.smartdigimkt.h5.c cVar, com.smartdigimkt.s8.b bVar) {
            this.f38947a = cVar;
            this.f38948b = bVar;
        }

        @Override // com.smartdigimkt.f5.c
        public void a() {
            if (!this.f38947a.isReady()) {
                this.f38948b.a(com.smartdigimkt.v7.b.a("20001", "load fill but ad not ready."));
                d.this.d(this.f38948b);
            } else {
                com.smartdigimkt.s8.d dVar = new com.smartdigimkt.s8.d();
                dVar.a(this.f38947a);
                this.f38948b.a(dVar);
                d.this.e(this.f38948b);
            }
        }

        @Override // com.smartdigimkt.f5.c
        public void b() {
        }

        @Override // com.smartdigimkt.f5.c
        public void a(com.smartdigimkt.v3.h hVar) {
            if (hVar != null) {
                this.f38948b.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, hVar.c()));
            } else {
                this.f38948b.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "The ad load failed."));
            }
            d.this.d(this.f38948b);
        }
    }
}
