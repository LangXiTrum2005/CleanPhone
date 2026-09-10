package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<Resource> implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.core.campaign.b f1682a;
    private final com.mbridge.msdk.newreward.function.core.campaign.a b;
    private int c = 0;
    private boolean d = false;
    private boolean e = false;
    protected boolean f = false;

    public a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        this.f1682a = bVar;
        this.b = aVar;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void b(boolean z) {
        this.f = z;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public abstract /* synthetic */ String c();

    public com.mbridge.msdk.newreward.function.core.campaign.a e() {
        return this.b;
    }

    public com.mbridge.msdk.newreward.function.core.campaign.b f() {
        return this.f1682a;
    }

    public abstract /* synthetic */ q g();

    public abstract Resource h();

    public int i() {
        return this.c;
    }

    public boolean j() {
        return TextUtils.isEmpty(c()) || d() || k();
    }

    public boolean k() {
        return this.d;
    }

    public boolean l() {
        return TextUtils.isEmpty(c()) || b() || m();
    }

    public boolean m() {
        return this.e;
    }

    public void a(int i) {
        this.c = i;
    }
}
