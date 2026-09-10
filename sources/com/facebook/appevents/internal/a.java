package com.facebook.appevents.internal;

import com.ironsource.Ya;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10600c;

    public /* synthetic */ a(int i10, long j10, String str) {
        this.f10598a = i10;
        this.f10599b = j10;
        this.f10600c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10598a) {
            case 0:
                ActivityLifecycleTracker.onActivityPaused$lambda$7(this.f10599b, (String) this.f10600c);
                break;
            case 1:
                ActivityLifecycleTracker.onActivityPaused$lambda$7$lambda$5(this.f10599b, (String) this.f10600c);
                break;
            default:
                Ya.a((Ya) this.f10600c, this.f10599b);
                break;
        }
    }

    public /* synthetic */ a(Ya ya2, long j10) {
        this.f10598a = 2;
        this.f10600c = ya2;
        this.f10599b = j10;
    }
}
