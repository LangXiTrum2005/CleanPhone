package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22822a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Handler handler, int i10) {
        super(handler);
        this.f22822a = i10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.f22822a) {
            case 0:
                h.f22830d.set(true);
                break;
            default:
                r.f22896i.incrementAndGet();
                break;
        }
    }
}
