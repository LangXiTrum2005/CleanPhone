package com.thinkup.core.common.inner.ui.component;

import android.view.View;
import com.thinkup.core.basead.ui.web.WebProgressBarView;
import com.thinkup.core.common.inner.ui.CountDownView;
import com.thinkup.core.common.on.oon;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    WebProgressBarView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41852n = 4;
    CountDownView o;
    private oon o0;
    private long oo;

    public o(oon oonVar, CountDownView countDownView, WebProgressBarView webProgressBarView) {
        this.o0 = oonVar;
        this.o = countDownView;
        this.m = webProgressBarView;
    }

    private boolean n() {
        return this.o0.mm0() == 2 || this.o0.mm0() == 4;
    }

    public final void m(long j) {
        CountDownView countDownView = this.o;
        if (countDownView != null) {
            countDownView.refresh(j);
        }
        WebProgressBarView webProgressBarView = this.m;
        if (webProgressBarView != null) {
            long j2 = this.oo;
            if (j2 > 0) {
                webProgressBarView.setProgress((int) ((j * 100.0d) / j2));
            } else {
                webProgressBarView.setProgress(100);
            }
        }
    }

    public final void o(long j) {
        this.oo = j;
        CountDownView countDownView = this.o;
        if (countDownView != null) {
            countDownView.setDuration(j);
        }
    }

    public final void o() {
        CountDownView countDownView = this.o;
        if (countDownView != null) {
            countDownView.refreshToEnd();
        }
        WebProgressBarView webProgressBarView = this.m;
        if (webProgressBarView != null) {
            webProgressBarView.setProgress(100);
        }
    }

    private boolean m() {
        return this.o0.mm0() == 1 || this.o0.mm0() == 4;
    }

    public final void o(int i2) {
        this.f41852n = i2;
        if (this.o0.mm0() != 1 && this.o0.mm0() != 4) {
            o(this.o, 8);
        } else {
            o(this.o, i2);
        }
        if (this.o0.mm0() != 2 && this.o0.mm0() != 4) {
            o(this.m, 8);
        } else {
            o(this.m, i2);
        }
    }

    private static void o(View view, int i2) {
        if (view == null || view.getVisibility() == i2) {
            return;
        }
        view.setVisibility(i2);
    }
}
