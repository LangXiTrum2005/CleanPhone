package androidx.media3.datasource;

import androidx.media3.common.util.Util;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5724b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5725c;
    public DataSpec d;

    public BaseDataSource(boolean z2) {
        this.f5723a = z2;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void a(TransferListener transferListener) {
        transferListener.getClass();
        ArrayList arrayList = this.f5724b;
        if (arrayList.contains(transferListener)) {
            return;
        }
        arrayList.add(transferListener);
        this.f5725c++;
    }

    public final void c(int i2) {
        DataSpec dataSpec = this.d;
        int i3 = Util.f5683a;
        for (int i4 = 0; i4 < this.f5725c; i4++) {
            ((TransferListener) this.f5724b.get(i4)).c(dataSpec, this.f5723a, i2);
        }
    }

    public final void d() {
        DataSpec dataSpec = this.d;
        int i2 = Util.f5683a;
        for (int i3 = 0; i3 < this.f5725c; i3++) {
            ((TransferListener) this.f5724b.get(i3)).f(dataSpec, this.f5723a);
        }
        this.d = null;
    }

    public final void e(DataSpec dataSpec) {
        for (int i2 = 0; i2 < this.f5725c; i2++) {
            ((TransferListener) this.f5724b.get(i2)).e(dataSpec, this.f5723a);
        }
    }

    public final void f(DataSpec dataSpec) {
        this.d = dataSpec;
        for (int i2 = 0; i2 < this.f5725c; i2++) {
            ((TransferListener) this.f5724b.get(i2)).g(dataSpec, this.f5723a);
        }
    }
}
