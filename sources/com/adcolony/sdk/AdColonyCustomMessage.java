package com.adcolony.sdk;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyCustomMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8913b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColony.b();
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "type", AdColonyCustomMessage.this.f8912a);
            c0.a(f1VarB, PglCryptUtils.KEY_MESSAGE, AdColonyCustomMessage.this.f8913b);
            new h0("CustomMessage.native_send", 1, f1VarB).c();
        }
    }

    public AdColonyCustomMessage(String str, String str2) {
        if (z0.e(str) || z0.e(str2)) {
            this.f8912a = str;
            this.f8913b = str2;
        }
    }

    public String getMessage() {
        return this.f8913b;
    }

    public String getType() {
        return this.f8912a;
    }

    public void send() {
        AdColony.a(new a());
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f8912a = str;
        this.f8913b = str2;
        return this;
    }
}
