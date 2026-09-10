package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: ScatterSetWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/collection/ScatterSet;", "", "attabal", "(Landroidx/collection/ScatterSet;)Ljava/util/Set;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class marial {
    public static final <T> Set<T> attabal(ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
