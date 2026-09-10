package androidx.paging;

import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/paging/PageKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PageKeyedDataSource<Key, Value> extends DataSource<Key, Value> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadCallback;", "Key", "Value", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadCallback<Key, Value> {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "Key", "Value", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadInitialCallback<Key, Value> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "", "Key", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadInitialParams<Key> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadParams;", "", "Key", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadParams<Key> {
    }
}
