package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/hardpan;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/peridotite;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/saran;", "Lwretchedly/dern;", "", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "", "unconsolidated", "()V", "polloi", "Lwretchedly/dern;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hardpan<T> extends peridotite<T> {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final wretchedly.dern<Unit> continuation;

    public hardpan(CoroutineContext coroutineContext, Function2<? super saran, ? super wretchedly.dern<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.continuation = IntrinsicsKt__IntrinsicsJvmKt.attabal(function2, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void unconsolidated() throws Throwable {
        girt.attabal.dern(this.continuation, this);
    }
}
