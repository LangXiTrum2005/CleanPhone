package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/ViewportHint;", "", "Access", "Initial", "Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint$Initial;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ViewportHint {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Access extends ViewportHint {
        @Override // androidx.paging.ViewportHint
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Access)) {
                return false;
            }
            ((Access) obj).getClass();
            return true;
        }

        @Override // androidx.paging.ViewportHint
        public final int hashCode() {
            return Integer.hashCode(0) + Integer.hashCode(0) + super.hashCode();
        }

        public final String toString() {
            return StringsKt.d0("ViewportHint.Access(\n            |    pageOffset=0,\n            |    indexInPage=0,\n            |    presentedItemsBefore=0,\n            |    presentedItemsAfter=0,\n            |    originalPageOffsetFirst=0,\n            |    originalPageOffsetLast=0,\n            |)");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Initial extends ViewportHint {
        public final String toString() {
            return StringsKt.d0("ViewportHint.Initial(\n            |    presentedItemsBefore=0,\n            |    presentedItemsAfter=0,\n            |    originalPageOffsetFirst=0,\n            |    originalPageOffsetLast=0,\n            |)");
        }
    }

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

    public final int a(LoadType loadType) {
        Intrinsics.f(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewportHint)) {
            return false;
        }
        ((ViewportHint) obj).getClass();
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(0) + Integer.hashCode(0) + Integer.hashCode(0) + Integer.hashCode(0);
    }
}
