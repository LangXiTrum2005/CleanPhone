package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatTextClassifierHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f3578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextClassifier f3579b;

    public static final class Api26Impl {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }
}
