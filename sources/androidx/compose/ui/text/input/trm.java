package androidx.compose.ui.text.input;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "maxChars", "Landroidx/compose/ui/text/attabal;", "dern", "(Landroidx/compose/ui/text/input/TextFieldValue;I)Landroidx/compose/ui/text/attabal;", "saneness", "attabal", "(Landroidx/compose/ui/text/input/TextFieldValue;)Landroidx/compose/ui/text/attabal;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class trm {
    public static final androidx.compose.ui.text.attabal attabal(TextFieldValue textFieldValue) {
        return textFieldValue.getText().formularize(textFieldValue.getSelection());
    }

    public static final androidx.compose.ui.text.attabal dern(TextFieldValue textFieldValue, int i) {
        return textFieldValue.getText().subSequence(Math.max(0, androidx.compose.ui.text.competently.taiyuan(textFieldValue.getSelection()) - i), androidx.compose.ui.text.competently.taiyuan(textFieldValue.getSelection()));
    }

    public static final androidx.compose.ui.text.attabal saneness(TextFieldValue textFieldValue, int i) {
        return textFieldValue.getText().subSequence(androidx.compose.ui.text.competently.impromptu(textFieldValue.getSelection()), Math.min(androidx.compose.ui.text.competently.impromptu(textFieldValue.getSelection()) + i, textFieldValue.wireman().length()));
    }
}
