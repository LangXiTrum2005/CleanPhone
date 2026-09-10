package com.mbridge.msdk.newreward.function.command.receiver.strategy;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f1671a;
    private com.mbridge.msdk.newreward.adapter.e b;
    private com.mbridge.msdk.newreward.function.command.c c;
    private int d;

    public e(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.command.c cVar, int i) {
        this.f1671a = bVar;
        this.b = eVar;
        this.c = cVar;
        this.d = i;
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f1671a = bVar;
    }

    public com.mbridge.msdk.newreward.function.command.c b() {
        return this.c;
    }

    public com.mbridge.msdk.foundation.error.b c() {
        return this.f1671a;
    }

    public int d() {
        return this.d;
    }

    public com.mbridge.msdk.newreward.adapter.e a() {
        return this.b;
    }
}
