package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function, Maps.EntryTransformer {
    public final /* synthetic */ Object X;

    public /* synthetic */ f(Object obj) {
        this.X = obj;
    }

    @Override // com.google.common.collect.Maps.EntryTransformer
    public Object a(Object obj, Object obj2) {
        return ((Multimaps.TransformedEntriesMultimap) this.X).o(obj, (Collection) obj2);
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return Multimaps.AsMap.this.e0.get(obj);
    }
}
