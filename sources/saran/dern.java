package saran;

import androidx.compose.runtime.czestochowa;
import androidx.compose.runtime.miliaria;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: InputModeManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR1\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\t\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Lsaran/dern;", "Lsaran/saneness;", "Lsaran/attabal;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "attabal", "Lkotlin/jvm/functions/Function1;", "<set-?>", "saneness", "Landroidx/compose/runtime/czestochowa;", "getInputMode-aOaMEAU", "()I", "(I)V", "inputMode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function1<attabal, Boolean> onRequestInputModeChange;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final czestochowa inputMode;

    public /* synthetic */ dern(int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function1);
    }

    public void attabal(int i) {
        this.inputMode.setValue(attabal.dern(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dern(int i, Function1<? super attabal, Boolean> function1) {
        this.onRequestInputModeChange = function1;
        this.inputMode = miliaria.saneness(attabal.dern(i), null, 2, null);
    }
}
