package androidx.compose.ui.text.font;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {Sdk$SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE}, m = "invokeSuspend")
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Object>, Object> {
    final /* synthetic */ impromptu $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, impromptu impromptuVar, wretchedly.dern<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> dernVar) {
        super(2, dernVar);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = impromptuVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(saran saranVar, wretchedly.dern<? super Object> dernVar) {
        return invoke2(saranVar, (wretchedly.dern<Object>) dernVar);
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
        cord cordVar = this.this$0.platformFontLoader;
        impromptu impromptuVar = this.$this_loadWithTimeoutOrNull;
        this.label = 1;
        Object objAttabal = cordVar.attabal(impromptuVar, this);
        return objAttabal == objBeachfront ? objBeachfront : objAttabal;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(saran saranVar, wretchedly.dern<Object> dernVar) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
