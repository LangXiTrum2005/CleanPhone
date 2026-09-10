package androidx.compose.ui.text.font;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@igo.wireman(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {Sdk$SDKError.Reason.AD_EXPIRED_VALUE}, m = "loadWithTimeoutOrNull$ui_text_release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, wretchedly.dern<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> dernVar) {
        super(dernVar);
        this.this$0 = asyncFontListLoader;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.kowloon(null, this);
    }
}
