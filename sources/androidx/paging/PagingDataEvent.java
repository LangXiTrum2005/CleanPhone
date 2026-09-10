package androidx.paging;

import androidx.datastore.preferences.protobuf.a;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/paging/PagingDataEvent;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Append", "DropAppend", "DropPrepend", "Prepend", "Refresh", "Landroidx/paging/PagingDataEvent$Append;", "Landroidx/paging/PagingDataEvent$DropAppend;", "Landroidx/paging/PagingDataEvent$DropPrepend;", "Landroidx/paging/PagingDataEvent$Prepend;", "Landroidx/paging/PagingDataEvent$Refresh;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PagingDataEvent<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$Append;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Append<T> extends PagingDataEvent<T> {
        public final boolean equals(Object obj) {
            if (!(obj instanceof Append)) {
                return false;
            }
            ((Append) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            Integer.hashCode(0);
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$DropAppend;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DropAppend<T> extends PagingDataEvent<T> {
        public final boolean equals(Object obj) {
            if (!(obj instanceof DropAppend)) {
                return false;
            }
            ((DropAppend) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + Integer.hashCode(0) + Integer.hashCode(0) + Integer.hashCode(0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            sb.append(0);
            sb.append(" items (\n                    |   startIndex: ");
            a.y(sb, 0, "\n                    |   dropCount: ", 0, "\n                    |   newPlaceholdersBefore: 0\n                    |   oldPlaceholdersBefore: ");
            sb.append(0);
            sb.append("\n                    |)\n                    |");
            return StringsKt.d0(sb.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$DropPrepend;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DropPrepend<T> extends PagingDataEvent<T> {
        public final boolean equals(Object obj) {
            if (!(obj instanceof DropPrepend)) {
                return false;
            }
            ((DropPrepend) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + Integer.hashCode(0) + Integer.hashCode(0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            a.y(sb, 0, " items (\n                    |   dropCount: ", 0, "\n                    |   newPlaceholdersBefore: 0\n                    |   oldPlaceholdersBefore: ");
            sb.append(0);
            sb.append("\n                    |)\n                    |");
            return StringsKt.d0(sb.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$Prepend;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Prepend<T> extends PagingDataEvent<T> {
        public final boolean equals(Object obj) {
            if (!(obj instanceof Prepend)) {
                return false;
            }
            ((Prepend) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingDataEvent$Refresh;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Refresh<T> extends PagingDataEvent<T> {
        public final boolean equals(Object obj) {
            if (obj instanceof Refresh) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }
}
