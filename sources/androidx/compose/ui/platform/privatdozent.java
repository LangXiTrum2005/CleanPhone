package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import com.ironsource.C3414a2;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0014\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/privatdozent;", "Landroidx/compose/ui/platform/saran;", "Lrestrictive/lerp;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "matrix", "", "attabal", "(Landroid/view/View;[F)V", "wireman", "Landroid/graphics/Matrix;", C3414a2.d, "saneness", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "dern", "([FFF)V", "[F", "", "[I", "tmpLocation", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class privatdozent implements saran {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float[] tmpMatrix;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int[] tmpLocation;

    public /* synthetic */ privatdozent(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    @Override // androidx.compose.ui.platform.saran
    public void attabal(View view, float[] matrix) {
        restrictive.lerp.impromptu(matrix);
        wireman(view, matrix);
    }

    public final void dern(float[] fArr, float f, float f2) {
        AndroidComposeView_androidKt.cutely(fArr, f, f2, this.tmpMatrix);
    }

    public final void saneness(float[] fArr, Matrix matrix) {
        restrictive.merc.saneness(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.taiyuan(fArr, this.tmpMatrix);
    }

    public final void wireman(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            wireman((View) parent, matrix);
            dern(matrix, -view.getScrollX(), -view.getScrollY());
            dern(matrix, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            dern(matrix, -view.getScrollX(), -view.getScrollY());
            dern(matrix, iArr[0], iArr[1]);
        }
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        saneness(matrix, matrix2);
    }

    public privatdozent(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
