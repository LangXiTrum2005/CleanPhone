package androidx.paging;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/RemoteMediator;", "", "Key", "Value", "InitializeAction", "MediatorResult", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RemoteMediator<Key, Value> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/RemoteMediator$InitializeAction;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InitializeAction {
        public static final InitializeAction X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ InitializeAction[] f7860Y;

        static {
            InitializeAction initializeAction = new InitializeAction("LAUNCH_INITIAL_REFRESH", 0);
            X = initializeAction;
            f7860Y = new InitializeAction[]{initializeAction, new InitializeAction("SKIP_INITIAL_REFRESH", 1)};
        }

        public static InitializeAction valueOf(String str) {
            return (InitializeAction) Enum.valueOf(InitializeAction.class, str);
        }

        public static InitializeAction[] values() {
            return (InitializeAction[]) f7860Y.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult;", "", "Error", InitializationStatus.SUCCESS, "Landroidx/paging/RemoteMediator$MediatorResult$Error;", "Landroidx/paging/RemoteMediator$MediatorResult$Success;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class MediatorResult {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult$Error;", "Landroidx/paging/RemoteMediator$MediatorResult;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Error extends MediatorResult {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult$Success;", "Landroidx/paging/RemoteMediator$MediatorResult;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends MediatorResult {
        }
    }
}
