package com.jakewharton.rxbinding4.view;

import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"com/jakewharton/rxbinding4/view/RxView__ViewAttachEventObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewAttachesObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewClickObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewDragObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewFocusChangeObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewHoverObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewKeyObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewLayoutChangeEventObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewLayoutChangeObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewLongClickObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewScrollChangeEventObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewSystemUiVisibilityChangeObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewTouchObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewTreeObserverDrawObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewTreeObserverGlobalLayoutObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewTreeObserverPreDrawObservableKt", "com/jakewharton/rxbinding4/view/RxView__ViewVisibilityConsumerKt"}, k = 4, mv = {1, 1, 16})
public final class RxView {
    public static final Observable a(View clicks) {
        Intrinsics.g(clicks, "$this$clicks");
        return new ViewClickObservable(clicks);
    }
}
