package androidx.compose.ui.text.font;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@igo.wireman(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements Function1<wretchedly.dern<? super Object>, Object> {
    final /* synthetic */ impromptu $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, impromptu impromptuVar, wretchedly.dern<? super AsyncFontListLoader$load$2$typeface$1> dernVar) {
        super(1, dernVar);
        this.this$0 = asyncFontListLoader;
        this.$font = impromptuVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(wretchedly.dern<?> dernVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(wretchedly.dern<? super Object> dernVar) {
        return invoke2((wretchedly.dern<Object>) dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        impromptu impromptuVar = this.$font;
        this.label = 1;
        Object objKowloon = asyncFontListLoader.kowloon(impromptuVar, this);
        return objKowloon == objBeachfront ? objBeachfront : objKowloon;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(wretchedly.dern<Object> dernVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
