package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import p002kotlin.Metadata;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: InputState.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "Landroid/view/inputmethod/ExtractedText;", "attabal", "(Landroidx/compose/ui/text/input/TextFieldValue;)Landroid/view/inputmethod/ExtractedText;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class molybdenite {
    public static final ExtractedText attabal(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.wireman();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.wireman().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.competently.taiyuan(textFieldValue.getSelection());
        extractedText.selectionEnd = androidx.compose.ui.text.competently.impromptu(textFieldValue.getSelection());
        extractedText.flags = !StringsKt.splinterproof(textFieldValue.wireman(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
