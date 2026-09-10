package androidx.compose.ui.scrollcapture;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends AdaptedFunctionReference implements Function1<ScrollCaptureCandidate, Unit> {
    public ScrollCapture$onScrollCaptureSearch$1(Object obj) {
        super(1, obj, androidx.compose.runtime.collection.dern.class, "add", "add(Ljava/lang/Object;)Z", 8);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
        invoke2(scrollCaptureCandidate);
        return Unit.f29295attabal;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScrollCaptureCandidate scrollCaptureCandidate) {
        ((androidx.compose.runtime.collection.dern) this.receiver).saneness(scrollCaptureCandidate);
    }
}
