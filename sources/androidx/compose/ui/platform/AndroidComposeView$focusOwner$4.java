package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class AndroidComposeView$focusOwner$4 extends FunctionReferenceImpl implements Function0<Unit> {
    public AndroidComposeView$focusOwner$4(Object obj) {
        super(0, obj, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
    }

    @Override // p002kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f29295attabal;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AndroidComposeView) this.receiver).igbo();
    }
}
