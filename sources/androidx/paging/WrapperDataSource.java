package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/WrapperDataSource;", "", "Key", "ValueFrom", "ValueTo", "Landroidx/paging/DataSource;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class WrapperDataSource<Key, ValueFrom, ValueTo> extends DataSource<Key, ValueTo> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            try {
                new int[DataSource.KeyType.values().length][2] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // androidx.paging.DataSource
    public final boolean a() {
        throw null;
    }
}
