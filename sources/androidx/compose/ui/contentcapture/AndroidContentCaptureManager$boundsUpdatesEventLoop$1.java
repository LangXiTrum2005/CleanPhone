package androidx.compose.ui.contentcapture;

import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@igo.wireman(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {Opcodes.INVOKEDYNAMIC, 196}, m = "boundsUpdatesEventLoop$ui_release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidContentCaptureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(AndroidContentCaptureManager androidContentCaptureManager, wretchedly.dern<? super AndroidContentCaptureManager$boundsUpdatesEventLoop$1> dernVar) {
        super(dernVar);
        this.this$0 = androidContentCaptureManager;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.saneness(this);
    }
}
