package basify;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import technofreak.cutely;

/* JADX INFO: compiled from: EmojiTextViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f14937attabal;

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    public static class attabal extends saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final TextView f14938attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f14939dern = true;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final wireman f14940saneness;

        public attabal(TextView textView) {
            this.f14938attabal = textView;
            this.f14940saneness = new wireman(textView);
        }

        public final void apical() {
            this.f14938attabal.setFilters(attabal(this.f14938attabal.getFilters()));
        }

        @Override // basify.beachfront.saneness
        public InputFilter[] attabal(InputFilter[] inputFilterArr) {
            return !this.f14939dern ? impromptu(inputFilterArr) : beachfront(inputFilterArr);
        }

        public final InputFilter[] beachfront(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f14940saneness) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f14940saneness;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> competently(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof wireman) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        public final TransformationMethod cutely(TransformationMethod transformationMethod) {
            return transformationMethod instanceof impromptu ? ((impromptu) transformationMethod).attabal() : transformationMethod;
        }

        @Override // basify.beachfront.saneness
        public void dern(boolean z) {
            if (z) {
                formularize();
            }
        }

        public void formularize() {
            this.f14938attabal.setTransformationMethod(marial(this.f14938attabal.getTransformationMethod()));
        }

        public final TransformationMethod impassible(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof impromptu) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new impromptu(transformationMethod);
        }

        public final InputFilter[] impromptu(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayCompetently = competently(inputFilterArr);
            if (sparseArrayCompetently.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayCompetently.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (sparseArrayCompetently.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        @Override // basify.beachfront.saneness
        public TransformationMethod marial(TransformationMethod transformationMethod) {
            return this.f14939dern ? impassible(transformationMethod) : cutely(transformationMethod);
        }

        @Override // basify.beachfront.saneness
        public boolean saneness() {
            return this.f14939dern;
        }

        public void taiyuan(boolean z) {
            this.f14939dern = z;
        }

        @Override // basify.beachfront.saneness
        public void wireman(boolean z) {
            this.f14939dern = z;
            formularize();
            apical();
        }
    }

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    public static class dern extends saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final attabal f14941attabal;

        public dern(TextView textView) {
            this.f14941attabal = new attabal(textView);
        }

        @Override // basify.beachfront.saneness
        public InputFilter[] attabal(InputFilter[] inputFilterArr) {
            return beachfront() ? inputFilterArr : this.f14941attabal.attabal(inputFilterArr);
        }

        public final boolean beachfront() {
            return !androidx.emoji2.text.dern.taiyuan();
        }

        @Override // basify.beachfront.saneness
        public void dern(boolean z) {
            if (beachfront()) {
                return;
            }
            this.f14941attabal.dern(z);
        }

        @Override // basify.beachfront.saneness
        public TransformationMethod marial(TransformationMethod transformationMethod) {
            return beachfront() ? transformationMethod : this.f14941attabal.marial(transformationMethod);
        }

        @Override // basify.beachfront.saneness
        public boolean saneness() {
            return this.f14941attabal.saneness();
        }

        @Override // basify.beachfront.saneness
        public void wireman(boolean z) {
            if (beachfront()) {
                this.f14941attabal.taiyuan(z);
            } else {
                this.f14941attabal.wireman(z);
            }
        }
    }

    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    public static class saneness {
        public InputFilter[] attabal(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void dern(boolean z) {
            throw null;
        }

        public TransformationMethod marial(TransformationMethod transformationMethod) {
            throw null;
        }

        public boolean saneness() {
            throw null;
        }

        public void wireman(boolean z) {
            throw null;
        }
    }

    public beachfront(TextView textView, boolean z) {
        cutely.impromptu(textView, "textView cannot be null");
        if (z) {
            this.f14937attabal = new attabal(textView);
        } else {
            this.f14937attabal = new dern(textView);
        }
    }

    public InputFilter[] attabal(InputFilter[] inputFilterArr) {
        return this.f14937attabal.attabal(inputFilterArr);
    }

    public void dern(boolean z) {
        this.f14937attabal.dern(z);
    }

    public TransformationMethod marial(TransformationMethod transformationMethod) {
        return this.f14937attabal.marial(transformationMethod);
    }

    public boolean saneness() {
        return this.f14937attabal.saneness();
    }

    public void wireman(boolean z) {
        this.f14937attabal.wireman(z);
    }
}
