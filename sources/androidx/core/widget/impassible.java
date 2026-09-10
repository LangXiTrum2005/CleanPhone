package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.restrictive;
import java.util.Objects;

/* JADX INFO: compiled from: TextViewOnReceiveContentListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible implements restrictive {
    public static void dern(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    public static CharSequence saneness(Context context, ClipData.Item item, int i) {
        if ((i & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    @Override // androidx.core.view.restrictive
    public androidx.core.view.wireman attabal(View view, androidx.core.view.wireman wiremanVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(wiremanVar);
        }
        if (wiremanVar.wireman() == 2) {
            return wiremanVar;
        }
        ClipData clipDataSaneness = wiremanVar.saneness();
        int iDern = wiremanVar.dern();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataSaneness.getItemCount(); i++) {
            CharSequence charSequenceSaneness = saneness(context, clipDataSaneness.getItemAt(i), iDern);
            if (charSequenceSaneness != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceSaneness);
                } else {
                    dern(editable, charSequenceSaneness);
                    z = true;
                }
            }
        }
        return null;
    }
}
