package com.applovin.impl.adview;

import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.c2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7524a;

    public /* synthetic */ q(int i10) {
        this.f7524a = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f7524a) {
            case 0:
                return b.a(view, motionEvent);
            case 1:
                return c2.a(view, motionEvent);
            default:
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
        }
    }
}
