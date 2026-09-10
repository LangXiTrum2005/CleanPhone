package com.startapp.sdk.internal;

import android.view.MotionEvent;
import com.startapp.sdk.ads.list3d.List3DView;

/* JADX INFO: loaded from: classes6.dex */
public final class qb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f41400a;

    public qb(List3DView list3DView) {
        this.f41400a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41400a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 2, 0.0f, -20.0f, 0));
        this.f41400a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, -20.0f, 0));
    }
}
