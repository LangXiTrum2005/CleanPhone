package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "SynchronousResult", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityResultContract<I, O> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SynchronousResult<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Serializable f3268a;

        public SynchronousResult(Serializable serializable) {
            this.f3268a = serializable;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public SynchronousResult b(Context context, Object obj) {
        return null;
    }

    public abstract Object c(int i2, Intent intent);
}
