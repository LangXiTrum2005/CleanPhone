package com.mbridge.msdk.newreward.controller;

/* JADX INFO: loaded from: classes2.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.newreward.function.command.c f1608a;
    protected com.mbridge.msdk.newreward.adapter.c b;
    protected b c;

    public a(int i, String str, String str2, boolean z) {
        this.c = new b(str2, str, i, z);
        com.mbridge.msdk.newreward.function.command.c cVar = new com.mbridge.msdk.newreward.function.command.c();
        this.f1608a = cVar;
        cVar.a((com.mbridge.msdk.newreward.function.command.a) new com.mbridge.msdk.newreward.function.command.concretecommand.a());
        this.b = new com.mbridge.msdk.newreward.adapter.d();
        a();
    }

    public abstract void a();
}
