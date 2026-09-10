package androidx.compose.ui.input.rotary;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import walach.RotaryScrollEvent;

/* JADX INFO: compiled from: RotaryInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/attabal;", "Lkotlin/Function1;", "Lwalach/dern;", "", "onRotaryScrollEvent", "attabal", "(Landroidx/compose/ui/attabal;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/attabal;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class attabal {
    public static final androidx.compose.ui.attabal attabal(androidx.compose.ui.attabal attabalVar, Function1<? super RotaryScrollEvent, Boolean> function1) {
        return attabalVar.impassible(new RotaryInputElement(function1, null));
    }
}
