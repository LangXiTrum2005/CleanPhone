package androidx.compose.ui.platform;

import android.graphics.Matrix;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerMatrixCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000eR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/cultivated;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "", "getMatrix", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "dern", "()V", "target", "Lrestrictive/lerp;", "saneness", "(Ljava/lang/Object;)[F", "attabal", "Lkotlin/jvm/functions/Function2;", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", "wireman", "[F", "matrixCache", "marial", "inverseMatrixCache", "", "beachfront", "Z", "isDirty", "competently", "isInverseDirty", "impromptu", "isInverseValid", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cultivated<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function2<T, Matrix, Unit> getMatrix;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Matrix previousAndroidMatrix;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public float[] inverseMatrixCache;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public Matrix androidMatrixCache;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public float[] matrixCache;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean isDirty = true;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean isInverseDirty = true;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean isInverseValid = true;

    /* JADX WARN: Multi-variable type inference failed */
    public cultivated(Function2<? super T, ? super Matrix, Unit> function2) {
        this.getMatrix = function2;
    }

    public final float[] attabal(T target) {
        float[] fArrDern = this.inverseMatrixCache;
        if (fArrDern == null) {
            fArrDern = restrictive.lerp.dern(null, 1, null);
            this.inverseMatrixCache = fArrDern;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = dent.attabal(saneness(target), fArrDern);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArrDern;
        }
        return null;
    }

    public final void dern() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final float[] saneness(T target) {
        float[] fArrDern = this.matrixCache;
        if (fArrDern == null) {
            fArrDern = restrictive.lerp.dern(null, 1, null);
            this.matrixCache = fArrDern;
        }
        if (!this.isDirty) {
            return fArrDern;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(target, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !Intrinsics.wireman(matrix, matrix2)) {
            restrictive.merc.saneness(fArrDern, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArrDern;
    }
}
