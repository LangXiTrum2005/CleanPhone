package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayManager f43513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43514c;

    public /* synthetic */ p(Object obj, DisplayManager displayManager, int i10) {
        this.f43512a = i10;
        this.f43514c = obj;
        this.f43513b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
        switch (this.f43512a) {
            case 0:
                break;
            default:
                Iterator it = ((ArrayList) this.f43514c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i10);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        switch (this.f43512a) {
            case 0:
                if (i10 == 0) {
                    float refreshRate = this.f43513b.getDisplay(0).getRefreshRate();
                    bo.l lVar = (bo.l) this.f43514c;
                    lVar.f5818a = (long) (1.0E9d / ((double) refreshRate));
                    ((FlutterJNI) lVar.f5819b).setRefreshRateFPS(refreshRate);
                }
                break;
            default:
                if (this.f43513b.getDisplay(i10) != null) {
                    Iterator it = ((ArrayList) this.f43514c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i10);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
        switch (this.f43512a) {
            case 0:
                break;
            default:
                Iterator it = ((ArrayList) this.f43514c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i10);
                }
                break;
        }
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }
}
