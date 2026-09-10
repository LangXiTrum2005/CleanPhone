package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/SharingConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SharingConfig<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f44976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BufferOverflow f44978c;
    public final CoroutineContext d;

    public SharingConfig(int i2, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        this.f44976a = flow;
        this.f44977b = i2;
        this.f44978c = bufferOverflow;
        this.d = coroutineContext;
    }
}
