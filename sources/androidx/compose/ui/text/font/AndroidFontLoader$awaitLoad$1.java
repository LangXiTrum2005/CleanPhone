package androidx.compose.ui.text.font;

import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@igo.wireman(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {57, 58}, m = "awaitLoad")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFontLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, wretchedly.dern<? super AndroidFontLoader$awaitLoad$1> dernVar) {
        super(dernVar);
        this.this$0 = androidFontLoader;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.attabal(null, this);
    }
}
