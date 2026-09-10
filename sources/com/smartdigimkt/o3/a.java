package com.smartdigimkt.o3;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.sdk.api.IOfferClickHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f37328a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f37329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.w6.f f37330c;
    com.smartdigimkt.v6.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    k f37331e;
    b f;
    public IOfferClickHandler g;

    /* JADX INFO: renamed from: com.smartdigimkt.o3.a$a, reason: collision with other inner class name */
    public static class C0557a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f37332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.smartdigimkt.w6.f f37333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.smartdigimkt.v6.a f37334c;
        public k d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f37335e;
        public IOfferClickHandler f;
    }

    public a(C0557a c0557a) {
        if (c0557a != null) {
            this.f37329b = c0557a.f37332a;
            this.f37330c = c0557a.f37333b;
            this.d = c0557a.f37334c;
            this.f37331e = c0557a.d;
            this.f = c0557a.f37335e;
            this.g = c0557a.f;
        }
    }

    @Override // com.smartdigimkt.o3.m
    public n a() {
        return n.a(false, "not support");
    }

    public com.smartdigimkt.v3.g b() {
        if (this.f37330c == null) {
            return null;
        }
        return com.smartdigimkt.m3.h.a().a(this.f37330c.O(), this.f37330c.L());
    }

    @Override // com.smartdigimkt.o3.m
    public void destroy() {
    }

    @Override // com.smartdigimkt.o3.m
    public n a(String str, e eVar) {
        return n.a(false, "not support");
    }

    public n a(com.smartdigimkt.v3.l lVar) {
        com.smartdigimkt.w6.f fVar = this.f37330c;
        if (fVar != null && !TextUtils.isEmpty(fVar.X())) {
            boolean zA = com.smartdigimkt.q3.d.a(this.f37329b, this.f37330c.X());
            if (lVar != null) {
                lVar.k = new com.smartdigimkt.v3.b();
                com.smartdigimkt.v3.g gVarB = b();
                lVar.k.f39077a = gVarB != null ? gVarB.f39093c : "";
                com.smartdigimkt.v3.a aVar = lVar.f39137i;
                if (aVar != null) {
                    aVar.j = zA ? 5 : aVar.j;
                }
            }
            if (zA) {
                k kVar = this.f37331e;
                if (kVar != null) {
                    kVar.b();
                }
                com.smartdigimkt.m3.f.a(25, this.f37330c, lVar);
                b bVar = this.f;
                if (bVar != null) {
                    bVar.clickEndUI();
                }
                return n.a(true, "ClickUrlClickAction execute success with openApp");
            }
            com.smartdigimkt.m3.f.a(26, this.f37330c, lVar);
        }
        return null;
    }
}
