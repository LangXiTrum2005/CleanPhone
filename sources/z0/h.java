package z0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p.m2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f54612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m2 f54613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54614c = true;

    public h(EditText editText) {
        this.f54612a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            x0.g gVarA = x0.g.a();
            if (editableText == null) {
                length = 0;
            } else {
                gVarA.getClass();
                length = editableText.length();
            }
            gVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) throws Throwable {
        EditText editText = this.f54612a;
        if (editText.isInEditMode() || !this.f54614c || x0.g.f53514k == null || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = x0.g.a().b();
        if (iB != 0) {
            if (iB == 1) {
                x0.g.a().e((Spannable) charSequence, i10, i12 + i10);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        x0.g gVarA = x0.g.a();
        if (this.f54613b == null) {
            this.f54613b = new m2(editText);
        }
        gVarA.f(this.f54613b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
