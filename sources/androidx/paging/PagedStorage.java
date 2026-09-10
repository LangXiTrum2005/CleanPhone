package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.AbstractList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/PagedStorage;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/AbstractList;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Landroidx/paging/PlaceholderPaddedList;", "Callback", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PagedStorage<T> extends AbstractList<T> implements LegacyPageFetcher.KeyProvider<Object>, PlaceholderPaddedList<T> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/paging/PagedStorage$Callback;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        throw null;
    }
}
