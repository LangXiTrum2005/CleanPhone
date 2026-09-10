package z0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f54600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final un.a f54601b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        un.a aVar = new un.a(17);
        super(inputConnection, false);
        this.f54600a = editText;
        this.f54601b = aVar;
        if (x0.g.f53514k != null) {
            x0.g gVarA = x0.g.a();
            if (gVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            vb.b bVar = gVarA.f53519e;
            bVar.getClass();
            Bundle bundle = editorInfo.extras;
            y0.b bVar2 = (y0.b) ((u) bVar.f52532c).f54879b;
            int iA = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar2.f45720d).getInt(iA + bVar2.f45717a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f54600a.getEditableText();
        this.f54601b.getClass();
        return un.a.h(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f54600a.getEditableText();
        this.f54601b.getClass();
        return un.a.h(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
