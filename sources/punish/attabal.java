package punish;

import android.graphics.Canvas;

/* JADX INFO: compiled from: CanvasCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: punish.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CanvasCompat.java */
    public interface InterfaceC0778attabal {
        void attabal(Canvas canvas);
    }

    public static int attabal(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }
}
