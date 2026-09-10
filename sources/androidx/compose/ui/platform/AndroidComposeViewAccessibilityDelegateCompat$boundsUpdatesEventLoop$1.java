package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@igo.wireman(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2258, 2296}, m = "boundsUpdatesEventLoop$ui_release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, wretchedly.dern<? super AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1> dernVar) {
        super(dernVar);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.grimness(this);
    }
}
