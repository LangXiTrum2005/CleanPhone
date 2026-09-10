package com.smartdigimkt.u8;

import com.smartdigimkt.sdk.api.SDMSDK;

/* JADX INFO: loaded from: classes6.dex */
public class g extends com.smartdigimkt.s8.c {

    public class a implements SDMSDK.InitCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.s8.b f38951a;

        public a(com.smartdigimkt.s8.b bVar) {
            this.f38951a = bVar;
        }

        @Override // com.smartdigimkt.sdk.api.SDMSDK.InitCallBack
        public void fail(String str) {
            this.f38951a.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, str));
            g.this.d(this.f38951a);
        }

        @Override // com.smartdigimkt.sdk.api.SDMSDK.InitCallBack
        public void success() {
            g.this.a(this.f38951a);
        }
    }

    private void a() {
        com.smartdigimkt.r6.h.e().a();
    }

    @Override // com.smartdigimkt.s8.c
    public boolean b(com.smartdigimkt.s8.b bVar) {
        if (bVar.s()) {
            bVar.a(com.smartdigimkt.v7.b.a("10004"));
            return false;
        }
        bVar.b(true);
        a();
        bVar.a(new com.smartdigimkt.t8.b());
        bVar.b(System.currentTimeMillis());
        if (com.smartdigimkt.m6.b.p().E()) {
            return true;
        }
        com.smartdigimkt.m6.b.p().a(new a(bVar));
        return false;
    }
}
