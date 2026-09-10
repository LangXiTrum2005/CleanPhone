package com.smartdigimkt.q5;

import android.view.View;
import com.smartdigimkt.sdk.basead.ui.CountDownView;
import com.smartdigimkt.sdk.basead.ui.web.WebProgressBarView;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f37936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    CountDownView f37937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WebProgressBarView f37938c;
    int d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37939e;

    public b(g gVar, CountDownView countDownView, WebProgressBarView webProgressBarView) {
        this.f37936a = gVar;
        this.f37937b = countDownView;
        this.f37938c = webProgressBarView;
    }

    private boolean c() {
        return this.f37936a.I() == 2 || this.f37936a.I() == 4;
    }

    public void a(long j) {
        CountDownView countDownView = this.f37937b;
        if (countDownView != null) {
            countDownView.refresh(j);
        }
        WebProgressBarView webProgressBarView = this.f37938c;
        if (webProgressBarView != null) {
            long j2 = this.f37939e;
            if (j2 > 0) {
                webProgressBarView.setProgress((int) ((j * 100.0d) / j2));
            } else {
                webProgressBarView.setProgress(100);
            }
        }
    }

    public void b(long j) {
        this.f37939e = j;
        CountDownView countDownView = this.f37937b;
        if (countDownView != null) {
            countDownView.setDuration(j);
        }
    }

    private boolean b() {
        return this.f37936a.I() == 1 || this.f37936a.I() == 4;
    }

    public void a() {
        CountDownView countDownView = this.f37937b;
        if (countDownView != null) {
            countDownView.refreshToEnd();
        }
        WebProgressBarView webProgressBarView = this.f37938c;
        if (webProgressBarView != null) {
            webProgressBarView.setProgress(100);
        }
    }

    public void a(int i2) {
        this.d = i2;
        if (b()) {
            a(this.f37937b, i2);
        } else {
            a(this.f37937b, 8);
        }
        if (c()) {
            a(this.f37938c, i2);
        } else {
            a(this.f37938c, 8);
        }
    }

    private void a(View view, int i2) {
        if (view == null || view.getVisibility() == i2) {
            return;
        }
        view.setVisibility(i2);
    }
}
