package androidx.compose.ui.platform;

import android.view.View;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements Function0<splinterproof.wireman> {
    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, obj, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final splinterproof.wireman invoke() {
        return AndroidComposeView_androidKt.competently((View) this.receiver);
    }
}
