package androidx.viewpager.widget;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f4998a;

    public h(k kVar) {
        this.f4998a = kVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f4998a.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f4998a.dataSetChanged();
    }
}
