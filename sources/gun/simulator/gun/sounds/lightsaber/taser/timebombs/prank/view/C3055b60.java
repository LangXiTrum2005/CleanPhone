package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3055b60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4157a;
    public PointF b;
    public boolean c;

    public C3055b60(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.f4157a = new ArrayList(list);
    }

    public final void a(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f4157a.size() + "closed=" + this.c + '}';
    }

    public C3055b60() {
        this.f4157a = new ArrayList();
    }
}
