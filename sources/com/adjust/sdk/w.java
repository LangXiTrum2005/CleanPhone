package com.adjust.sdk;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustTimeoutCallback f7056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f7058d;

    public /* synthetic */ w(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context, int i10) {
        this.f7055a = i10;
        this.f7056b = adjustTimeoutCallback;
        this.f7057c = arrayList;
        this.f7058d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7055a) {
            case 0:
                if (this.f7056b.getOnAdidReadListener() != null) {
                    synchronized (this.f7057c) {
                        this.f7057c.remove(this.f7056b);
                        break;
                    }
                    new Handler(this.f7058d.getMainLooper()).post(new v(this, 0));
                    return;
                }
                return;
            case 1:
                if (this.f7056b.getOnAttributionReadListener() != null) {
                    synchronized (this.f7057c) {
                        this.f7057c.remove(this.f7056b);
                        break;
                    }
                    new Handler(this.f7058d.getMainLooper()).post(new v(this, 1));
                    return;
                }
                return;
            default:
                if (this.f7056b.getOnThirdPartySharingSettingsReadListener() != null) {
                    synchronized (this.f7057c) {
                        this.f7057c.remove(this.f7056b);
                        break;
                    }
                    new Handler(this.f7058d.getMainLooper()).post(new v(this, 2));
                    return;
                }
                return;
        }
    }
}
