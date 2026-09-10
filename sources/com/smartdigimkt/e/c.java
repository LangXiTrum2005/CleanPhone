package com.smartdigimkt.e;

import android.content.Context;
import com.smartdigimkt.f1.k;
import com.smartdigimkt.f1.q;
import com.smartdigimkt.v0.u;

/* JADX INFO: loaded from: classes5.dex */
public class c extends com.smartdigimkt.e.a {

    public class a implements q.e {
        public a() {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(int i2) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void b(k kVar) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void c(k kVar) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void d(k kVar) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void onFinishRedirection(k kVar, String str) {
            if (kVar == null) {
                return;
            }
            u.a(kVar, c.this.f34525c);
        }

        @Override // com.smartdigimkt.f1.q.e
        public void onLeaveApp() {
            com.smartdigimkt.f.d dVar = c.this.d;
            if (dVar != null) {
                dVar.onLeaveApp();
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public void onRedirectionFailed(k kVar, String str) {
            if (kVar == null) {
                return;
            }
            u.a(kVar, c.this.f34525c);
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(k kVar) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public boolean c() {
            return false;
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.x.d dVar, String str) {
            u.b(dVar, c.this.f34525c);
        }
    }

    public c(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.smartdigimkt.e.a
    public void a(com.smartdigimkt.x.d dVar, boolean z2, String str) {
        if (this.f34526e == null) {
            this.f34526e = new com.smartdigimkt.o.a(com.smartdigimkt.m6.b.p().k(), this.j);
        }
        this.f34526e.a(new a());
        dVar.G(this.j);
        com.smartdigimkt.f.d dVar2 = this.d;
        if (dVar2 != null) {
            dVar2.onAdClicked(dVar);
        }
    }
}
