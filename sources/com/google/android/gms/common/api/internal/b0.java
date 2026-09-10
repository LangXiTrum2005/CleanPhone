package com.google.android.gms.common.api.internal;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b0 f11673b = new b0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11674a;

    public /* synthetic */ b0(int i10) {
        this.f11674a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11674a) {
            case 0:
            case 1:
                return;
            default:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (x0.g.f53514k != null) {
                        x0.g.a().c();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    private final /* synthetic */ void a() {
    }

    private final void b() {
    }
}
