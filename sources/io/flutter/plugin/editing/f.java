package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import wi.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43270a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43271b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f43272c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f43273d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f43274e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f43275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f43276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43280k;
    public final d l;

    public f(o oVar, View view) {
        this.l = new d(view, this);
        if (oVar != null) {
            f(oVar);
        }
    }

    public final void a(e eVar) {
        if (this.f43271b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f43270a <= 0) {
            this.f43272c.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f43273d.add(eVar);
        }
    }

    public final void b() {
        this.f43270a++;
        if (this.f43271b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f43270a != 1 || this.f43272c.isEmpty()) {
            return;
        }
        this.f43276g = toString();
        this.f43277h = Selection.getSelectionStart(this);
        this.f43278i = Selection.getSelectionEnd(this);
        this.f43279j = BaseInputConnection.getComposingSpanStart(this);
        this.f43280k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i10 = this.f43270a;
        if (i10 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f43272c;
        ArrayList<e> arrayList2 = this.f43273d;
        if (i10 == 1) {
            for (e eVar : arrayList2) {
                this.f43271b++;
                eVar.a(true);
                this.f43271b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f43276g), (this.f43277h == Selection.getSelectionStart(this) && this.f43278i == Selection.getSelectionEnd(this)) ? false : true, (this.f43279j == BaseInputConnection.getComposingSpanStart(this) && this.f43280k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f43270a--;
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            for (e eVar : this.f43272c) {
                this.f43271b++;
                eVar.a(z10);
                this.f43271b--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f43271b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f43272c.remove(eVar);
        if (this.f43270a > 0) {
            this.f43273d.remove(eVar);
        }
    }

    public final void f(o oVar) {
        b();
        replace(0, length(), (CharSequence) oVar.f53269a);
        int i10 = oVar.f53270b;
        if (i10 >= 0) {
            Selection.setSelection(this, i10, oVar.f53271c);
        } else {
            Selection.removeSelection(this);
        }
        int i11 = oVar.f53272d;
        int i12 = oVar.f53273e;
        if (i11 < 0 || i11 >= i12) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.l.setComposingRegion(i11, i12);
        }
        this.f43274e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        String string = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f43291e = selectionStart;
        iVar.f43292f = selectionEnd;
        iVar.f43293g = composingSpanStart;
        iVar.f43294h = composingSpanEnd;
        iVar.f43287a = string;
        iVar.f43288b = "";
        iVar.f43289c = -1;
        iVar.f43290d = -1;
        this.f43274e.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f43275f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f43275f = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (this.f43271b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i14 = i11 - i10;
        boolean z10 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z10; i15++) {
            z10 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        if (z10) {
            this.f43275f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i10, i11, charSequence, i12, i13);
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f43291e = selectionStart2;
        iVar.f43292f = selectionEnd2;
        iVar.f43293g = composingSpanStart2;
        iVar.f43294h = composingSpanEnd2;
        String string2 = charSequence.toString();
        iVar.f43287a = string;
        iVar.f43288b = string2;
        iVar.f43289c = i10;
        iVar.f43290d = i11;
        this.f43274e.add(iVar);
        if (this.f43270a > 0) {
            return spannableStringBuilderReplace;
        }
        d(z10, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return spannableStringBuilderReplace;
    }
}
