package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends mi.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f43311h;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f43311h;
        if (aVar != null) {
            io.flutter.view.g gVar = aVar.f43310a;
            if (gVar == null ? false : gVar.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
