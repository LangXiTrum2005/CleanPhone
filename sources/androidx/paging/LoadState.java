package androidx.paging;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/LoadState;", "", "Error", "Loading", "NotLoading", "Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState$NotLoading;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LoadState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7807a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Error extends LoadState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Exception f7808b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception error) {
            super(false);
            Intrinsics.f(error, "error");
            this.f7808b = error;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f7807a == error.f7807a && Intrinsics.a(this.f7808b, error.f7808b);
        }

        public final int hashCode() {
            return this.f7808b.hashCode() + Boolean.hashCode(this.f7807a);
        }

        public final String toString() {
            return "Error(endOfPaginationReached=" + this.f7807a + ", error=" + this.f7808b + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Loading extends LoadState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Loading f7809b = new Loading(false);

        public final boolean equals(Object obj) {
            if (obj instanceof Loading) {
                return this.f7807a == ((Loading) obj).f7807a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f7807a);
        }

        public final String toString() {
            return a.r(new StringBuilder("Loading(endOfPaginationReached="), this.f7807a, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/LoadState$NotLoading;", "Landroidx/paging/LoadState;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotLoading extends LoadState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NotLoading f7810b = new NotLoading(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final NotLoading f7811c = new NotLoading(false);

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadState$NotLoading$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (obj instanceof NotLoading) {
                return this.f7807a == ((NotLoading) obj).f7807a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f7807a);
        }

        public final String toString() {
            return a.r(new StringBuilder("NotLoading(endOfPaginationReached="), this.f7807a, ')');
        }
    }

    public LoadState(boolean z2) {
        this.f7807a = z2;
    }
}
