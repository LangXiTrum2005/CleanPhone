package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class AndroidComposeView$focusOwner$1 extends FunctionReferenceImpl implements Function1<Function0<? extends Unit>, Unit> {
    public AndroidComposeView$focusOwner$1(Object obj) {
        super(1, obj, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
        invoke2((Function0<Unit>) function0);
        return Unit.f29295attabal;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Function0<Unit> function0) {
        ((AndroidComposeView) this.receiver).adultoid(function0);
    }
}
