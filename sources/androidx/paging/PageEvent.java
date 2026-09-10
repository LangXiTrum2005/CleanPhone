package androidx.paging;

import android.support.v4.media.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/paging/PageEvent;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Drop", "Insert", "LoadStateUpdate", "StaticList", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "Landroidx/paging/PageEvent$StaticList;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PageEvent<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageEvent$Drop;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PageEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Drop<T> extends PageEvent<T> {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public final int a() {
            return (0 - 0) + 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Drop)) {
                return false;
            }
            ((Drop) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PageEvent$Insert;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PageEvent;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Insert<T> extends PageEvent<T> {
        public static final Insert g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoadType f7819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f7820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7821c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LoadStates f7822e;
        public final LoadStates f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public static Insert a(List list, int i2, int i3, LoadStates sourceLoadStates, LoadStates loadStates) {
                Intrinsics.f(sourceLoadStates, "sourceLoadStates");
                return new Insert(LoadType.X, list, i2, i3, sourceLoadStates, loadStates);
            }
        }

        static {
            List listH = CollectionsKt.H(TransformablePage.f7885e);
            LoadState.NotLoading notLoading = LoadState.NotLoading.f7811c;
            LoadState.NotLoading notLoading2 = LoadState.NotLoading.f7810b;
            g = Companion.a(listH, 0, 0, new LoadStates(notLoading, notLoading2, notLoading2), null);
        }

        public Insert(LoadType loadType, List list, int i2, int i3, LoadStates loadStates, LoadStates loadStates2) {
            this.f7819a = loadType;
            this.f7820b = list;
            this.f7821c = i2;
            this.d = i3;
            this.f7822e = loadStates;
            this.f = loadStates2;
            if (loadType != LoadType.Z && i2 < 0) {
                throw new IllegalArgumentException(a.h(i2, "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
            }
            if (loadType != LoadType.f7815Y && i3 < 0) {
                throw new IllegalArgumentException(a.h(i3, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
            }
            if (loadType == LoadType.X && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return this.f7819a == insert.f7819a && Intrinsics.a(this.f7820b, insert.f7820b) && this.f7821c == insert.f7821c && this.d == insert.d && Intrinsics.a(this.f7822e, insert.f7822e) && Intrinsics.a(this.f, insert.f);
        }

        public final int hashCode() {
            int iHashCode = (this.f7822e.hashCode() + androidx.media3.extractor.text.ttml.a.a(this.d, androidx.media3.extractor.text.ttml.a.a(this.f7821c, androidx.media3.extractor.text.ttml.a.c(this.f7819a.hashCode() * 31, 31, this.f7820b), 31), 31)) * 31;
            LoadStates loadStates = this.f;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final String toString() {
            List list;
            List list2;
            List list3 = this.f7820b;
            Iterator<T> it = list3.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((TransformablePage) it.next()).f7887b.size();
            }
            int i2 = this.f7821c;
            String strValueOf = i2 != -1 ? String.valueOf(i2) : "none";
            int i3 = this.d;
            String strValueOf2 = i3 != -1 ? String.valueOf(i3) : "none";
            StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
            sb.append(this.f7819a);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) CollectionsKt.y(list3);
            Object objG = null;
            sb.append((transformablePage == null || (list2 = transformablePage.f7887b) == null) ? null : CollectionsKt.y(list2));
            sb.append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) CollectionsKt.G(list3);
            if (transformablePage2 != null && (list = transformablePage2.f7887b) != null) {
                objG = CollectionsKt.G(list);
            }
            sb.append(objG);
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.f7822e);
            sb.append("\n                    ");
            String string = sb.toString();
            LoadStates loadStates = this.f;
            if (loadStates != null) {
                string = string + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.d0(string + "|)");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PageEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoadStateUpdate<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoadStates f7826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoadStates f7827b;

        public LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2) {
            this.f7826a = loadStates;
            this.f7827b = loadStates2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) obj;
            return Intrinsics.a(this.f7826a, loadStateUpdate.f7826a) && Intrinsics.a(this.f7827b, loadStateUpdate.f7827b);
        }

        public final int hashCode() {
            int iHashCode = this.f7826a.hashCode() * 31;
            LoadStates loadStates = this.f7827b;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f7826a + "\n                    ";
            LoadStates loadStates = this.f7827b;
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.d0(str + "|)");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageEvent$StaticList;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PageEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StaticList<T> extends PageEvent<T> {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticList)) {
                return false;
            }
            ((StaticList) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }
}
