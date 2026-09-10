package com.google.common.reflect;

import com.google.common.base.Function;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function {
    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public final Object apply(Object obj) {
        return new MutableTypeToInstanceMap.UnmodifiableEntry((Map.Entry) obj);
    }
}
