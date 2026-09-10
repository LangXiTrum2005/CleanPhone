package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class qh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f41410a;

    public qh(yh yhVar) {
        this.f41410a = yhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh yhVar = this.f41410a;
        try {
            if (yhVar.a() != null && yhVar.f == null) {
                vh vhVarA = yhVar.a((Class) null);
                yhVar.f = vhVarA;
                if (vhVarA != null) {
                    vhVarA.a();
                }
            }
        } catch (Throwable th) {
            if (yhVar.a(1)) {
                g9.a(th);
            }
        }
    }
}
