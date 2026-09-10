package rj;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import p1.b0;
import p1.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements io.flutter.plugin.platform.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49607a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f49608b;

    public a(Context context, k kVar) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f49608b = surfaceView;
        b0 b0Var = (b0) kVar;
        b0Var.l1();
        SurfaceHolder holder = surfaceView.getHolder();
        b0Var.l1();
        if (holder == null) {
            b0Var.l1();
            b0Var.c1();
            b0Var.e1(null);
            b0Var.a1(0, 0);
            return;
        }
        b0Var.c1();
        b0Var.V = true;
        b0Var.U = holder;
        holder.addCallback(b0Var.f47957w);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            b0Var.e1(null);
            b0Var.a1(0, 0);
        } else {
            b0Var.e1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            b0Var.a1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // io.flutter.plugin.platform.d
    public final void dispose() {
        switch (this.f49607a) {
            case 0:
                ((SurfaceView) this.f49608b).getHolder().getSurface().release();
                break;
        }
    }

    @Override // io.flutter.plugin.platform.d
    public final View getView() {
        switch (this.f49607a) {
            case 0:
                return (SurfaceView) this.f49608b;
            default:
                return this.f49608b;
        }
    }

    public a(View view) {
        this.f49608b = view;
    }

    private final void a() {
    }
}
