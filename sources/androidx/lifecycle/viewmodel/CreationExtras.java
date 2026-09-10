package androidx.lifecycle.viewmodel;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "Empty", "Key", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CreationExtras {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5294a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Empty extends CreationExtras {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Empty f5295b = new Empty();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Key;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Key<T> {
    }
}
