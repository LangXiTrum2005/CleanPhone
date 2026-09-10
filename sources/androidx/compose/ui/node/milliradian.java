package androidx.compose.ui.node;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/milliradian;", "", "", "data", "saneness", "([I)[I", "Landroidx/compose/ui/node/monoploid;", "diagonals", "", "attabal", "([ILandroidx/compose/ui/node/monoploid;)V", "", "impromptu", "([I)I", "startX", "taiyuan", "startY", "wireman", "endX", "marial", "endY", "", "competently", "([I)Z", "reverse", "dern", "diagonalSize", "beachfront", "hasAdditionOrRemoval", "cutely", "isAddition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class milliradian {
    public static final void attabal(int[] iArr, monoploid monoploidVar) {
        if (!beachfront(iArr)) {
            monoploidVar.competently(impromptu(iArr), taiyuan(iArr), wireman(iArr) - impromptu(iArr));
            return;
        }
        if (competently(iArr)) {
            monoploidVar.competently(impromptu(iArr), taiyuan(iArr), dern(iArr));
        } else if (cutely(iArr)) {
            monoploidVar.competently(impromptu(iArr), taiyuan(iArr) + 1, dern(iArr));
        } else {
            monoploidVar.competently(impromptu(iArr) + 1, taiyuan(iArr), dern(iArr));
        }
    }

    public static final boolean beachfront(int[] iArr) {
        return marial(iArr) - taiyuan(iArr) != wireman(iArr) - impromptu(iArr);
    }

    public static final boolean competently(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final boolean cutely(int[] iArr) {
        return marial(iArr) - taiyuan(iArr) > wireman(iArr) - impromptu(iArr);
    }

    public static final int dern(int[] iArr) {
        return Math.min(wireman(iArr) - impromptu(iArr), marial(iArr) - taiyuan(iArr));
    }

    public static final int impromptu(int[] iArr) {
        return iArr[0];
    }

    public static final int marial(int[] iArr) {
        return iArr[3];
    }

    public static final int taiyuan(int[] iArr) {
        return iArr[1];
    }

    public static final int wireman(int[] iArr) {
        return iArr[2];
    }

    public static int[] saneness(int[] iArr) {
        return iArr;
    }
}
