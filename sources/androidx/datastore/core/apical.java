package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Landroidx/datastore/core/apical;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/graveside;", "", "finalException", "<init>", "(Ljava/lang/Throwable;)V", "saneness", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class apical<T> extends graveside<T> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apical(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.finalException = finalException;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final Throwable getFinalException() {
        return this.finalException;
    }
}
