package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/PositionalDataSource;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/DataSource;", "", "Companion", "LoadInitialCallback", "LoadInitialParams", "LoadRangeCallback", "LoadRangeParams", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PositionalDataSource$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialCallback;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadInitialCallback<T> {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialParams;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadInitialParams {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeCallback;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadRangeCallback<T> {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeParams;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadRangeParams {
    }
}
