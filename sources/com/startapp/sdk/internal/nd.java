package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class nd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f41272b;

    public nd(od odVar, String str) {
        this.f41272b = odVar;
        this.f41271a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f41272b;
        String str = this.f41271a;
        if (odVar.g || odVar.o || !odVar.f41313e.equals(str) || h0.a(str)) {
            return;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            odVar.f41318p = true;
            Float f = (Float) odVar.q.get(str);
            if (f == null || f.floatValue() < 0.0f) {
                odVar.q.put(str, Float.valueOf((System.currentTimeMillis() - odVar.r) / 1000.0f));
            }
            synchronized (odVar.d) {
                odVar.d.removeCallbacks(odVar.f41319u);
                odVar.d.postDelayed(odVar.f41319u, odVar.j);
            }
        }
    }
}
