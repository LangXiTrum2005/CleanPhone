package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends FunctionReferenceImpl implements tetrahedral.triweekly<androidx.compose.ui.draganddrop.competently, supplicat.impassible, Function1<? super merc.beachfront, ? extends Unit>, Boolean> {
    public AndroidComposeView$dragAndDropModifierOnDragListener$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // tetrahedral.triweekly
    public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.draganddrop.competently competentlyVar, supplicat.impassible impassibleVar, Function1<? super merc.beachfront, ? extends Unit> function1) {
        return m6invoke12SF9DM(competentlyVar, impassibleVar.getPackedValue(), function1);
    }

    /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m6invoke12SF9DM(androidx.compose.ui.draganddrop.competently competentlyVar, long j, Function1<? super merc.beachfront, Unit> function1) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).mastfed(competentlyVar, j, function1));
    }
}
