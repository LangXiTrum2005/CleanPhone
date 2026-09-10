package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/LoadStates;", "", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LoadStates {
    public static final LoadStates d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadState f7812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoadState f7813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoadState f7814c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadStates$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

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
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        LoadState.NotLoading notLoading = LoadState.NotLoading.f7811c;
        d = new LoadStates(notLoading, notLoading, notLoading);
    }

    public LoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3) {
        this.f7812a = loadState;
        this.f7813b = loadState2;
        this.f7814c = loadState3;
        if (!(loadState instanceof LoadState.Error) && !(loadState3 instanceof LoadState.Error)) {
            boolean z2 = loadState2 instanceof LoadState.Error;
        }
        if ((loadState instanceof LoadState.NotLoading) && (loadState3 instanceof LoadState.NotLoading)) {
            boolean z3 = loadState2 instanceof LoadState.NotLoading;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) obj;
        return Intrinsics.a(this.f7812a, loadStates.f7812a) && Intrinsics.a(this.f7813b, loadStates.f7813b) && Intrinsics.a(this.f7814c, loadStates.f7814c);
    }

    public final int hashCode() {
        return this.f7814c.hashCode() + ((this.f7813b.hashCode() + (this.f7812a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f7812a + ", prepend=" + this.f7813b + ", append=" + this.f7814c + ')';
    }
}
