package com.adcolony.sdk;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes.dex */
class m implements j0 {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9257b;

        public a(m mVar, String str, String str2) {
            this.f9256a = str;
            this.f9257b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = com.adcolony.sdk.a.b().m().get(this.f9256a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f9256a, this.f9257b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public m() {
        com.adcolony.sdk.a.a("CustomMessage.controller_send", this);
    }

    @Override // com.adcolony.sdk.j0
    public void a(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        z0.b(new a(this, c0.h(f1VarA, "type"), c0.h(f1VarA, PglCryptUtils.KEY_MESSAGE)));
    }
}
