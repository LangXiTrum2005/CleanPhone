package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class AndroidComposeView$focusOwner$3 extends FunctionReferenceImpl implements Function1<androidx.compose.ui.focus.saneness, Boolean> {
    public AndroidComposeView$focusOwner$3(Object obj) {
        super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.focus.saneness sanenessVar) {
        return m8invoke3ESFkO8(sanenessVar.getValue());
    }

    /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final Boolean m8invoke3ESFkO8(int i) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).picketboat(i));
    }
}
