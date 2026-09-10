package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: compiled from: AppCompatTextClassifierHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public TextView f5492attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public TextClassifier f5493saneness;

    /* JADX INFO: compiled from: AppCompatTextClassifierHelper.java */
    public static final class attabal {
        public static TextClassifier attabal(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public kowloon(TextView textView) {
        this.f5492attabal = (TextView) technofreak.cutely.competently(textView);
    }

    public TextClassifier attabal() {
        TextClassifier textClassifier = this.f5493saneness;
        return textClassifier == null ? attabal.attabal(this.f5492attabal) : textClassifier;
    }

    public void saneness(TextClassifier textClassifier) {
        this.f5493saneness = textClassifier;
    }
}
