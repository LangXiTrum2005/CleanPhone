package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import androidx.core.app.NotificationCompat;
import mi.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f43418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f43419b;

    public c(g gVar, AccessibilityManager accessibilityManager) {
        this.f43419b = gVar;
        this.f43418a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        g gVar = this.f43419b;
        if (gVar.f43498u) {
            return;
        }
        boolean z11 = false;
        if (!z10) {
            gVar.j(false);
            f fVar = gVar.f43493p;
            if (fVar != null) {
                gVar.h(fVar.f43452b, NotificationCompat.FLAG_LOCAL_ONLY);
                gVar.f43493p = null;
            }
        }
        s4.i iVar = gVar.f43496s;
        if (iVar != null) {
            boolean zIsEnabled = this.f43418a.isEnabled();
            s sVar = (s) iVar.f50111a;
            if (sVar.f46059j.f46738b.f43247a.getIsSoftwareRenderingEnabled()) {
                sVar.setWillNotDraw(false);
                return;
            }
            if (!zIsEnabled && !z10) {
                z11 = true;
            }
            sVar.setWillNotDraw(z11);
        }
    }
}
