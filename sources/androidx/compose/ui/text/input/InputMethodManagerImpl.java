package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.creditor;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InputMethodManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/polloi;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Landroid/view/View;)V", "", "isActive", "()Z", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "", "attabal", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "saneness", "Lpatroclinal/taiyuan;", "dern", "()Landroid/view/inputmethod/InputMethodManager;", L6.n, "Landroidx/core/view/creditor;", "Landroidx/core/view/creditor;", "softwareKeyboardControllerCompat", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@patroclinal.wireman
public final class InputMethodManagerImpl implements polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final View view;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final creditor softwareKeyboardControllerCompat;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan imm = p002kotlin.saneness.attabal(LazyThreadSafetyMode.NONE, new Function0<InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final InputMethodManager invoke() {
            Object systemService = this.this$0.view.getContext().getSystemService("input_method");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });

    public InputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new creditor(view);
    }

    @Override // androidx.compose.ui.text.input.polloi
    public void attabal(CursorAnchorInfo cursorAnchorInfo) {
        dern().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    public final InputMethodManager dern() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // androidx.compose.ui.text.input.polloi
    public boolean isActive() {
        return dern().isActive(this.view);
    }
}
