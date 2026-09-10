package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/MutableLoadStateCollection;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableLoadStateCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LoadState f7816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoadState f7817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoadState f7818c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a(LoadStates states) {
        Intrinsics.f(states, "states");
        this.f7816a = states.f7812a;
        this.f7818c = states.f7814c;
        this.f7817b = states.f7813b;
    }
}
