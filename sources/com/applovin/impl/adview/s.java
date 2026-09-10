package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f10564Y;

    public /* synthetic */ s(KeyEvent.Callback callback, int i2) {
        this.X = i2;
        this.f10564Y = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ((f) this.f10564Y).e();
                break;
            case 1:
                ((f) this.f10564Y).f();
                break;
            default:
                ((WebView) this.f10564Y).setVisibility(0);
                break;
        }
    }
}
