package com.inmobi.media;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class G7 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f22842a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(int[] iArr) {
        super(1);
        this.f22842a = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2978d2 event = (C2978d2) obj;
        Intrinsics.f(event, "event");
        return Boolean.valueOf(ArraysKt.i(this.f22842a, event.f23507a));
    }
}
