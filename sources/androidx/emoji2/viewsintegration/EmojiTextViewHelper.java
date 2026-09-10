package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: loaded from: classes.dex */
public final class EmojiTextViewHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HelperInternal f5035a;

    public static class HelperInternal {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z2) {
        }

        public void d(boolean z2) {
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    public static class HelperInternal19 extends HelperInternal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f5036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmojiInputFilter f5037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5038c = true;

        public HelperInternal19(TextView textView) {
            this.f5036a = textView;
            this.f5037b = new EmojiInputFilter(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f5038c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                    InputFilter inputFilter = inputFilterArr[i2];
                    if (inputFilter instanceof EmojiInputFilter) {
                        sparseArray.put(i2, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (sparseArray.indexOfKey(i4) < 0) {
                        inputFilterArr2[i3] = inputFilterArr[i4];
                        i3++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i5 = 0;
            while (true) {
                EmojiInputFilter emojiInputFilter = this.f5037b;
                if (i5 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = emojiInputFilter;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i5] == emojiInputFilter) {
                    return inputFilterArr;
                }
                i5++;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final boolean b() {
            return this.f5038c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void c(boolean z2) {
            if (z2) {
                TextView textView = this.f5036a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void d(boolean z2) {
            this.f5038c = z2;
            TextView textView = this.f5036a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f5038c) {
                return ((transformationMethod instanceof EmojiTransformationMethod) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new EmojiTransformationMethod(transformationMethod);
            }
            return transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).f5042a : transformationMethod;
        }
    }

    public static class SkippingHelper19 extends HelperInternal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HelperInternal19 f5039a;

        public SkippingHelper19(TextView textView) {
            this.f5039a = new HelperInternal19(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return !(EmojiCompat.j != null) ? inputFilterArr : this.f5039a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final boolean b() {
            return this.f5039a.f5038c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void c(boolean z2) {
            if (EmojiCompat.j != null) {
                this.f5039a.c(z2);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void d(boolean z2) {
            boolean z3 = EmojiCompat.j != null;
            HelperInternal19 helperInternal19 = this.f5039a;
            if (z3) {
                helperInternal19.d(z2);
            } else {
                helperInternal19.f5038c = z2;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return !(EmojiCompat.j != null) ? transformationMethod : this.f5039a.e(transformationMethod);
        }
    }

    public EmojiTextViewHelper(TextView textView) {
        this.f5035a = new SkippingHelper19(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f5035a.a(inputFilterArr);
    }

    public final boolean b() {
        return this.f5035a.b();
    }

    public final void c(boolean z2) {
        this.f5035a.c(z2);
    }

    public final void d(boolean z2) {
        this.f5035a.d(z2);
    }

    public final TransformationMethod e(AllCapsTransformationMethod allCapsTransformationMethod) {
        return this.f5035a.e(allCapsTransformationMethod);
    }
}
