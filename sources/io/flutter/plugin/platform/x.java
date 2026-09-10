package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f43391i = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f43392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f43393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f43394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f43397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f43398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VirtualDisplay f43399h;

    public x(Activity activity, a aVar, VirtualDisplay virtualDisplay, d dVar, l lVar, j jVar, int i10) {
        this.f43393b = activity;
        this.f43394c = aVar;
        this.f43397f = lVar;
        this.f43398g = jVar;
        this.f43396e = i10;
        this.f43399h = virtualDisplay;
        this.f43395d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f43399h.getDisplay(), dVar, aVar, i10, jVar);
        this.f43392a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f43392a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
