package com.google.android.material.motion;

import android.window.OnBackInvokedCallback;
import com.inmobi.ads.rendering.InMobiAdActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19373b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f19372a = i2;
        this.f19373b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f19372a) {
            case 0:
                ((MaterialBackHandler) this.f19373b).f();
                break;
            default:
                InMobiAdActivity.a((InMobiAdActivity) this.f19373b);
                break;
        }
    }
}
