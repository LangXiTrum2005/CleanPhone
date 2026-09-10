package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int X;

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public final Object apply(Object obj) {
        switch (this.X) {
            case 0:
                int i2 = AbstractBaseGraph.AnonymousClass2.X;
                return new EndpointPair.Ordered(obj, null);
            case 1:
                int i3 = AbstractBaseGraph.AnonymousClass2.X;
                new EndpointPair.Ordered(null, obj);
                throw null;
            default:
                int i4 = AbstractBaseGraph.AnonymousClass2.X;
                return new EndpointPair.Unordered(obj, null);
        }
    }
}
