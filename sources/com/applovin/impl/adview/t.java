package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f7529b;

    public /* synthetic */ t(KeyEvent.Callback callback, int i10) {
        this.f7528a = i10;
        this.f7529b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7528a;
        KeyEvent.Callback callback = this.f7529b;
        switch (i10) {
            case 0:
                ((f) callback).e();
                break;
            case 1:
                ((f) callback).f();
                break;
            default:
                ((WebView) callback).setVisibility(0);
                break;
        }
    }
}
