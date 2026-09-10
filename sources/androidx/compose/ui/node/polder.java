package androidx.compose.ui.node;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NestedVectorStack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/polder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "", "attabal", "()Z", "saneness", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/dern;", "vector", "", "dern", "(Landroidx/compose/runtime/collection/dern;)V", "", "I", "size", "", "[I", "currentIndexes", "", "[Landroidx/compose/runtime/collection/dern;", "vectors", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class polder<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int[] currentIndexes = new int[16];

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.collection.dern<T>[] vectors = new androidx.compose.runtime.collection.dern[16];

    public final boolean attabal() {
        int i = this.size;
        return i > 0 && this.currentIndexes[i - 1] >= 0;
    }

    public final void dern(androidx.compose.runtime.collection.dern<T> vector) {
        if (vector.triweekly()) {
            return;
        }
        int i = this.size;
        int[] iArr = this.currentIndexes;
        if (i >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.currentIndexes = iArrCopyOf;
            androidx.compose.runtime.collection.dern<T>[] dernVarArr = this.vectors;
            Object[] objArrCopyOf = Arrays.copyOf(dernVarArr, dernVarArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.vectors = (androidx.compose.runtime.collection.dern[]) objArrCopyOf;
        }
        this.currentIndexes[i] = vector.getSize() - 1;
        this.vectors[i] = vector;
        this.size++;
    }

    public final T saneness() {
        int i = this.size;
        if (i <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i2 = i - 1;
        int i3 = this.currentIndexes[i2];
        androidx.compose.runtime.collection.dern<T> dernVar = this.vectors[i2];
        Intrinsics.beachfront(dernVar);
        if (i3 > 0) {
            int[] iArr = this.currentIndexes;
            iArr[i2] = iArr[i2] - 1;
        } else if (i3 == 0) {
            this.vectors[i2] = null;
            this.size--;
        }
        return dernVar.apical()[i3];
    }
}
