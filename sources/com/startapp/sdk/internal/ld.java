package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class ld implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f41214b;

    public ld(od odVar, String str) {
        this.f41214b = odVar;
        this.f41213a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f41214b;
        String str = this.f41213a;
        odVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = (jCurrentTimeMillis - odVar.r) / 1000.0f;
        odVar.r = jCurrentTimeMillis;
        odVar.q.put(odVar.f41313e, Float.valueOf(f));
        odVar.q.put(str, Float.valueOf(-1.0f));
        odVar.f41313e = str;
    }
}
