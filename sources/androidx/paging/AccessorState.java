package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/AccessorState;", "", "Key", "Value", "BlockState", "PendingRequest", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AccessorState<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7766a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/AccessorState$BlockState;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BlockState {
        public static final BlockState X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final BlockState f7767Y;
        public static final /* synthetic */ BlockState[] Z;

        static {
            BlockState blockState = new BlockState("UNBLOCKED", 0);
            X = blockState;
            BlockState blockState2 = new BlockState("COMPLETED", 1);
            BlockState blockState3 = new BlockState("REQUIRES_REFRESH", 2);
            f7767Y = blockState3;
            Z = new BlockState[]{blockState, blockState2, blockState3};
        }

        public static BlockState valueOf(String str) {
            return (BlockState) Enum.valueOf(BlockState.class, str);
        }

        public static BlockState[] values() {
            return (BlockState[]) Z.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/AccessorState$PendingRequest;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PendingRequest<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoadType f7768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PagingState f7769b;

        public PendingRequest(LoadType loadType, PagingState pagingState) {
            Intrinsics.f(loadType, "loadType");
            this.f7768a = loadType;
            this.f7769b = pagingState;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7770a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7770a = iArr;
            int[] iArr2 = new int[BlockState.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final void a(final LoadType loadType) {
        Intrinsics.f(loadType, "loadType");
        CollectionsKt.Q(null, new Function1<PendingRequest<Object, Object>, Boolean>() { // from class: androidx.paging.AccessorState$clearPendingRequest$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AccessorState.PendingRequest it = (AccessorState.PendingRequest) obj;
                Intrinsics.f(it, "it");
                return Boolean.valueOf(it.f7768a == loadType);
            }
        });
    }

    public final LoadState b(LoadType loadType) {
        loadType.ordinal();
        throw null;
    }

    public final void c(LoadType loadType, BlockState blockState) {
        loadType.ordinal();
        throw null;
    }
}
