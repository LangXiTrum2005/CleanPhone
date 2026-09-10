package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Supplier {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f18247Y;

    public /* synthetic */ o(Object obj, int i2) {
        this.X = i2;
        this.f18247Y = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.X) {
            case 0:
                return Boolean.valueOf(((ExoPlayerImplInternal) this.f18247Y).A0);
            case 1:
                return (LoadControl) this.f18247Y;
            default:
                return (MediaSource.Factory) this.f18247Y;
        }
    }
}
