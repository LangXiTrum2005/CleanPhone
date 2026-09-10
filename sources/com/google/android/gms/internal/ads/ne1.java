package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ne1 extends ud1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ListenableFuture f17788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f17789i;

    @Override // com.google.android.gms.internal.ads.uc1
    public final void e() {
        n(this.f17788h);
        ScheduledFuture scheduledFuture = this.f17789i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f17788h = null;
        this.f17789i = null;
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final String f() {
        ListenableFuture listenableFuture = this.f17788h;
        ScheduledFuture scheduledFuture = this.f17789i;
        if (listenableFuture == null) {
            return null;
        }
        String string = listenableFuture.toString();
        String strJ = q4.a.j(new StringBuilder(string.length() + 14), "inputFuture=[", string, X3.j.f27836e);
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                int length = strJ.length();
                StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
                sb2.append(strJ);
                sb2.append(", remaining delay=[");
                sb2.append(delay);
                sb2.append(" ms]");
                return sb2.toString();
            }
        }
        return strJ;
    }
}
