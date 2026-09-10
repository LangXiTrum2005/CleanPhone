package androidx.paging;

import androidx.media3.extractor.text.ttml.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/PagingSource;", "", "Key", "Value", "LoadParams", "LoadResult", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PagingSource<Key, Value> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/PagingSource$LoadParams;", "", "Key", "Append", "Companion", "Prepend", "Refresh", "Landroidx/paging/PagingSource$LoadParams$Append;", "Landroidx/paging/PagingSource$LoadParams$Prepend;", "Landroidx/paging/PagingSource$LoadParams$Refresh;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadParams<Key> {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Append;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Append<Key> extends LoadParams<Key> {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Prepend;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Prepend<Key> extends LoadParams<Key> {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Refresh;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Refresh<Key> extends LoadParams<Key> {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/PagingSource$LoadResult;", "", "Key", "Value", "Error", "Invalid", "Page", "Landroidx/paging/PagingSource$LoadResult$Error;", "Landroidx/paging/PagingSource$LoadResult$Invalid;", "Landroidx/paging/PagingSource$LoadResult$Page;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadResult<Key, Value> {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Error;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Error<Key, Value> extends LoadResult<Key, Value> {
            public final Exception X;

            public Error(Exception exc) {
                this.X = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.X.equals(((Error) obj).X);
            }

            public final int hashCode() {
                return this.X.hashCode();
            }

            public final String toString() {
                return StringsKt.d0("LoadResult.Error(\n                    |   throwable: " + this.X + "\n                    |) ");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Invalid;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Invalid<Key, Value> extends LoadResult<Key, Value> {
            public final String toString() {
                return "LoadResult.Invalid";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00042\b\u0012\u0004\u0012\u00028\u00050\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Page;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Page<Key, Value> extends LoadResult<Key, Value> implements Iterable<Value>, KMappedMarker {
            public final List X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final Object f7859Y;
            public final Object Z;
            public final int e0;
            public final int f0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Page$Companion;", "", "", "COUNT_UNDEFINED", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
            }

            static {
                new Page(EmptyList.X, null, null, 0, 0);
            }

            public Page(List data, Object obj, Object obj2, int i2, int i3) {
                Intrinsics.f(data, "data");
                this.X = data;
                this.f7859Y = obj;
                this.Z = obj2;
                this.e0 = i2;
                this.f0 = i3;
                if (i2 != Integer.MIN_VALUE && i2 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i3 != Integer.MIN_VALUE && i3 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Page)) {
                    return false;
                }
                Page page = (Page) obj;
                return Intrinsics.a(this.X, page.X) && Intrinsics.a(this.f7859Y, page.f7859Y) && Intrinsics.a(this.Z, page.Z) && this.e0 == page.e0 && this.f0 == page.f0;
            }

            public final int hashCode() {
                int iHashCode = this.X.hashCode() * 31;
                Object obj = this.f7859Y;
                int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
                Object obj2 = this.Z;
                return Integer.hashCode(this.f0) + a.a(this.e0, (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.X.listIterator();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List list = this.X;
                sb.append(list.size());
                sb.append("\n                    |   first Item: ");
                sb.append(CollectionsKt.y(list));
                sb.append("\n                    |   last Item: ");
                sb.append(CollectionsKt.G(list));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.Z);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.f7859Y);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.e0);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.f0);
                sb.append("\n                    |) ");
                return StringsKt.d0(sb.toString());
            }
        }
    }
}
