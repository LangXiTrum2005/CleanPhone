package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18731b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18732c;
    public DataSpec d;

    public BaseDataSource(boolean z2) {
        this.f18730a = z2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void b(TransferListener transferListener) {
        transferListener.getClass();
        ArrayList arrayList = this.f18731b;
        if (arrayList.contains(transferListener)) {
            return;
        }
        arrayList.add(transferListener);
        this.f18732c++;
    }

    public final void c(int i2) {
        DataSpec dataSpec = this.d;
        int i3 = Util.f18979a;
        for (int i4 = 0; i4 < this.f18732c; i4++) {
            ((TransferListener) this.f18731b.get(i4)).e(dataSpec, this.f18730a, i2);
        }
    }

    public final void d() {
        DataSpec dataSpec = this.d;
        int i2 = Util.f18979a;
        for (int i3 = 0; i3 < this.f18732c; i3++) {
            ((TransferListener) this.f18731b.get(i3)).f(dataSpec, this.f18730a);
        }
        this.d = null;
    }

    public final void e(DataSpec dataSpec) {
        for (int i2 = 0; i2 < this.f18732c; i2++) {
            ((TransferListener) this.f18731b.get(i2)).getClass();
        }
    }

    public final void f(DataSpec dataSpec) {
        this.d = dataSpec;
        for (int i2 = 0; i2 < this.f18732c; i2++) {
            ((TransferListener) this.f18731b.get(i2)).c(dataSpec, this.f18730a);
        }
    }
}
