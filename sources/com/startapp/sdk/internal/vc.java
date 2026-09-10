package com.startapp.sdk.internal;

import android.os.SystemClock;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class vc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc f41578a;

    public vc(xc xcVar) {
        this.f41578a = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jUptimeMillis = (((long) this.f41578a.f41672a.r) * 1000) - SystemClock.uptimeMillis();
        xc xcVar = this.f41578a;
        long j = jUptimeMillis + xcVar.f41672a.y;
        TextView textView = xcVar.g;
        if (textView != null) {
            long j2 = j / 1000;
            if (j2 > 0 && j % 1000 < 100) {
                j2--;
            }
            textView.setText(String.valueOf(j2));
        }
        if (j >= 1000) {
            long j3 = j % 1000;
            this.f41578a.k.postDelayed(this, j3 != 0 ? j3 : 1000L);
            return;
        }
        xc xcVar2 = this.f41578a;
        if (xcVar2.g != null) {
            xcVar2.f41676h.setVisibility(8);
            this.f41578a.g.setVisibility(8);
        }
        this.f41578a.f41672a.s();
    }
}
