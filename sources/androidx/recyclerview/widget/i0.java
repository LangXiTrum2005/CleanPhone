package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public abstract void onChanged();

    public void onItemRangeChanged(int i10, int i11) {
    }

    public abstract void onItemRangeInserted(int i10, int i11);

    public abstract void onItemRangeMoved(int i10, int i11, int i12);

    public abstract void onItemRangeRemoved(int i10, int i11);

    public void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
        onItemRangeChanged(i10, i11);
    }
}
