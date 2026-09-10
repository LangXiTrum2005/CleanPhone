package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Flow<T> {
    Object collect(FlowCollector flowCollector, Continuation continuation);
}
