package x0;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f53539b = new AtomicInteger(0);

    public o(Object obj) {
        this.f53538a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f53538a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f53538a).beforeTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
        if (this.f53539b.get() <= 0 || !(obj instanceof r)) {
            ((SpanWatcher) this.f53538a).onSpanAdded(spannable, obj, i10, i11);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
        if (this.f53539b.get() <= 0 || !(obj instanceof r)) {
            ((SpanWatcher) this.f53538a).onSpanChanged(spannable, obj, i10, i11, i12, i13);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
        if (this.f53539b.get() <= 0 || !(obj instanceof r)) {
            ((SpanWatcher) this.f53538a).onSpanRemoved(spannable, obj, i10, i11);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f53538a).onTextChanged(charSequence, i10, i11, i12);
    }
}
