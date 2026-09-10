package restrictive;

import android.graphics.Canvas;
import com.ironsource.mediationsdk.metadata.a;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: CanvasUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrestrictive/mathsort;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", a.j, "", "attabal", "(Landroid/graphics/Canvas;Z)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class mathsort {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final mathsort f36273attabal = new mathsort();

    public final void attabal(Canvas canvas, boolean enable) {
        if (enable) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
