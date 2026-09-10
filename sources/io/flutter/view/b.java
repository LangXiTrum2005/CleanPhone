package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;
import mi.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f43417a;

    public b(g gVar) {
        this.f43417a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        g gVar = this.f43417a;
        qd.i iVar = gVar.f43480b;
        if (gVar.f43498u) {
            return;
        }
        if (z10) {
            ((FlutterJNI) iVar.f48981c).setSemanticsEnabled(true);
        } else {
            gVar.j(false);
            ((FlutterJNI) iVar.f48981c).setSemanticsEnabled(false);
        }
        s4.i iVar2 = gVar.f43496s;
        if (iVar2 != null) {
            boolean zIsTouchExplorationEnabled = gVar.f43481c.isTouchExplorationEnabled();
            s sVar = (s) iVar2.f50111a;
            if (sVar.f46059j.f46738b.f43247a.getIsSoftwareRenderingEnabled()) {
                sVar.setWillNotDraw(false);
            } else {
                sVar.setWillNotDraw((z10 || zIsTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
