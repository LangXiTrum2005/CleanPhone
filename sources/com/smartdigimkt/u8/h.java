package com.smartdigimkt.u8;

import android.text.TextUtils;
import com.smartdigimkt.n8.n;
import com.smartdigimkt.n8.s;
import com.smartdigimkt.sdk.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public class h extends com.smartdigimkt.s8.c {

    public class a implements com.smartdigimkt.k8.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.s8.b f38953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.l8.e f38954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.a7.a f38955c;

        public a(com.smartdigimkt.s8.b bVar, com.smartdigimkt.l8.e eVar, com.smartdigimkt.a7.a aVar) {
            this.f38953a = bVar;
            this.f38954b = eVar;
            this.f38955c = aVar;
        }

        @Override // com.smartdigimkt.k8.c.a
        public void a() {
        }

        @Override // com.smartdigimkt.k8.c.a
        public void b() {
        }

        @Override // com.smartdigimkt.k8.c.a
        public void a(com.smartdigimkt.l8.e eVar) {
        }

        @Override // com.smartdigimkt.k8.c.a
        public void b(com.smartdigimkt.l8.e eVar) {
            com.smartdigimkt.v7.a aVarA = h.this.a(this.f38953a, eVar);
            if (aVarA != null) {
                this.f38953a.a(aVarA);
                h.this.a(this.f38953a);
                return;
            }
            this.f38953a.g(System.currentTimeMillis());
            com.smartdigimkt.a7.a aVarD = this.f38953a.d();
            if (aVarD != null) {
                if (eVar == this.f38954b) {
                    aVarD.j(1);
                } else {
                    aVarD.j(2);
                }
            }
            s.a(aVarD, eVar);
            com.smartdigimkt.i7.c.a(this.f38953a.g()).a(10, aVarD);
            h.this.a(this.f38953a);
        }

        @Override // com.smartdigimkt.k8.c.a
        public void a(AdError adError) {
            if (adError != null) {
                n.a("fail", this.f38953a.n(), com.smartdigimkt.n8.f.a(String.valueOf(this.f38953a.i())), adError.getErrorInfo());
                this.f38953a.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f, adError.getErrorInfo()));
            } else {
                this.f38953a.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f));
            }
            this.f38953a.g(System.currentTimeMillis());
            s.a(this.f38953a.d(), this.f38954b);
            com.smartdigimkt.i7.c.a(this.f38953a.g()).a(10, this.f38955c);
            h.this.a(this.f38953a);
        }
    }

    @Override // com.smartdigimkt.s8.c
    public boolean b(com.smartdigimkt.s8.b bVar) {
        if (bVar.t()) {
            return true;
        }
        com.smartdigimkt.k8.a.e().i();
        bVar.a(com.smartdigimkt.n8.f.a(bVar.g()));
        bVar.a(System.currentTimeMillis());
        String strN = bVar.n();
        com.smartdigimkt.l8.e eVarA = com.smartdigimkt.k8.c.a().a(strN);
        com.smartdigimkt.a7.a aVarA = s.a(bVar);
        s.a(aVarA, eVarA);
        bVar.a(aVarA);
        com.smartdigimkt.k8.c.a().a(new com.smartdigimkt.u7.a.b(strN).a(eVarA).a(new a(bVar, eVarA, aVarA)).a());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.smartdigimkt.v7.a a(com.smartdigimkt.s8.b bVar, com.smartdigimkt.l8.e eVar) {
        String str;
        int i2;
        int iV;
        if (eVar == null) {
            return com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f, "The placeStrategy is null.");
        }
        com.smartdigimkt.l8.f fVarJ = eVar.j();
        if (fVarJ == null) {
            str = "The placeStrategy does not has ADX ad source.";
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (i2 = bVar.i()) != (iV = eVar.v())) {
            str = "Format corresponding to API: " + com.smartdigimkt.n8.f.a(String.valueOf(i2)) + ", Format corresponding to placement strategy: " + com.smartdigimkt.n8.f.a(String.valueOf(iV));
        }
        if (TextUtils.isEmpty(str) && !eVar.U()) {
            str = "Placement Ads switch is close.";
        }
        bVar.a(fVarJ);
        bVar.a(eVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f, str);
    }
}
