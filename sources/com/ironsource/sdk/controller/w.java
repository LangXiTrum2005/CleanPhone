package com.ironsource.sdk.controller;

import android.window.OnBackInvokedCallback;
import io.flutter.embedding.android.FlutterActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30660b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f30659a = i10;
        this.f30660b = obj;
    }

    public final void onBackInvoked() {
        int i10 = this.f30659a;
        Object obj = this.f30660b;
        switch (i10) {
            case 0:
                ((ControllerActivity) obj).g();
                break;
            case 1:
                ((com.mbridge.msdk.config.activity.backdispatcher.b) obj).a();
                break;
            case 2:
                ((k.v) obj).C();
                break;
            case 3:
                ((FlutterActivity) obj).onBackPressed();
                break;
            case 4:
                ((Runnable) obj).run();
                break;
            default:
                ((x3.j) obj).a();
                break;
        }
    }
}
