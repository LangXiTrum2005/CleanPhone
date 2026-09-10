package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f47837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rb.c f47838b;

    public w(TextView textView) {
        this.f47837a = textView;
        this.f47838b = new rb.c(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((cc.a2) this.f47838b.f49529b).s(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f47837a.getContext().obtainStyledAttributes(attributeSet, j.a.f43525i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        ((cc.a2) this.f47838b.f49529b).K(z10);
    }

    public final void d(boolean z10) {
        ((cc.a2) this.f47838b.f49529b).L(z10);
    }
}
