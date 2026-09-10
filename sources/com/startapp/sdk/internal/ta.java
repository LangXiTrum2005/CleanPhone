package com.startapp.sdk.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class ta implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f41513a;

    public ta(za zaVar) {
        this.f41513a = zaVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f41513a.f41767A = true;
        return false;
    }
}
