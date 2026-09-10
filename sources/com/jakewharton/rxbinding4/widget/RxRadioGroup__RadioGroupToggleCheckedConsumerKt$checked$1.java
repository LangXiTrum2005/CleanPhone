package com.jakewharton.rxbinding4.widget;

import io.reactivex.rxjava3.functions.Consumer;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "value", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 16})
final class RxRadioGroup__RadioGroupToggleCheckedConsumerKt$checked$1<T> implements Consumer<Integer> {
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Integer num) {
        Integer num2 = num;
        if ((num2 != null && num2.intValue() == -1) || num2 != null) {
            throw null;
        }
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        Intrinsics.j(kotlinNullPointerException, Intrinsics.class.getName());
        throw kotlinNullPointerException;
    }
}
