package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class AndroidComposeView$focusOwner$2 extends FunctionReferenceImpl implements Function2<androidx.compose.ui.focus.saneness, supplicat.taiyuan, Boolean> {
    public AndroidComposeView$focusOwner$2(Object obj) {
        super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
    }

    @Override // p002kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke-7o62pno, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(androidx.compose.ui.focus.saneness sanenessVar, supplicat.taiyuan taiyuanVar) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).palmyra(sanenessVar, taiyuanVar));
    }
}
