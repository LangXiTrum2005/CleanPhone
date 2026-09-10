package z0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f54611a;

    public g(TextView textView) {
        this.f54611a = new f(textView);
    }

    @Override // cc.a2
    public final void K(boolean z10) {
        if (x0.g.f53514k != null) {
            this.f54611a.K(z10);
        }
    }

    @Override // cc.a2
    public final void L(boolean z10) {
        f fVar = this.f54611a;
        if (x0.g.f53514k != null) {
            fVar.L(z10);
        } else {
            fVar.f54610c = z10;
        }
    }

    @Override // cc.a2
    public final TransformationMethod O(TransformationMethod transformationMethod) {
        return !(x0.g.f53514k != null) ? transformationMethod : this.f54611a.O(transformationMethod);
    }

    @Override // cc.a2
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        return !(x0.g.f53514k != null) ? inputFilterArr : this.f54611a.s(inputFilterArr);
    }

    @Override // cc.a2
    public final boolean x() {
        return this.f54611a.f54610c;
    }
}
