package z0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f54608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f54609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54610c = true;

    public f(TextView textView) {
        this.f54608a = textView;
        this.f54609b = new d(textView);
    }

    @Override // cc.a2
    public final void K(boolean z10) {
        if (z10) {
            TextView textView = this.f54608a;
            textView.setTransformationMethod(O(textView.getTransformationMethod()));
        }
    }

    @Override // cc.a2
    public final void L(boolean z10) {
        this.f54610c = z10;
        TextView textView = this.f54608a;
        textView.setTransformationMethod(O(textView.getTransformationMethod()));
        textView.setFilters(s(textView.getFilters()));
    }

    @Override // cc.a2
    public final TransformationMethod O(TransformationMethod transformationMethod) {
        if (this.f54610c) {
            return ((transformationMethod instanceof i) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new i(transformationMethod);
        }
        return transformationMethod instanceof i ? ((i) transformationMethod).f54615a : transformationMethod;
    }

    @Override // cc.a2
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        if (!this.f54610c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            d dVar = this.f54609b;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == dVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // cc.a2
    public final boolean x() {
        return this.f54610c;
    }
}
