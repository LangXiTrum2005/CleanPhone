package com.jakewharton.rxbinding4.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0005"}, d2 = {"Lcom/jakewharton/rxbinding4/internal/AlwaysTrue;", "Lkotlin/Function0;", "", "Lkotlin/Function1;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final class AlwaysTrue implements Function0<Boolean>, Function1<Object, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object ignored) {
        Intrinsics.g(ignored, "ignored");
        return Boolean.TRUE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.TRUE;
    }
}
