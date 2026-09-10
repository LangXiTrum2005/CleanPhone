package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/Final;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/State;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Final<T> extends State<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f4659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable finalException) {
        super(Integer.MAX_VALUE);
        Intrinsics.f(finalException, "finalException");
        this.f4659b = finalException;
    }
}
