package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class kd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f41186b;

    public kd(od odVar, String str) {
        this.f41186b = odVar;
        this.f41185a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f41186b;
        String str = this.f41185a;
        if (!odVar.f41314h) {
            odVar.r = System.currentTimeMillis();
            odVar.q.put(str, Float.valueOf(-1.0f));
            odVar.d.postDelayed(odVar.s, odVar.f41315i);
            odVar.f41314h = true;
        }
        odVar.f41318p = false;
        odVar.a();
    }
}
