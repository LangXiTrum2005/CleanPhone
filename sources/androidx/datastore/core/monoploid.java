package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/monoploid;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/graveside;", "", "readException", "", "version", "<init>", "(Ljava/lang/Throwable;I)V", "saneness", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class monoploid<T> extends graveside<T> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public monoploid(Throwable readException, int i) {
        super(i, null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.readException = readException;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final Throwable getReadException() {
        return this.readException;
    }
}
