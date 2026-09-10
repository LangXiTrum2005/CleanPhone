package spatterdash;

import ammonoid.VipStatusResponse;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubscriptionRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lspatterdash/dern;", "", "Lscoleces/dern;", "remoteDataSource", "<init>", "(Lscoleces/dern;)V", "Lkotlinx/coroutines/flow/dern;", "Lammonoid/attabal;", "dern", "()Lkotlinx/coroutines/flow/dern;", "attabal", "Lscoleces/dern;", "saneness", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static volatile dern f38019dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final scoleces.dern remoteDataSource;

    /* JADX INFO: renamed from: spatterdash.dern$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SubscriptionRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lspatterdash/dern$attabal;", "", "<init>", "()V", "Lscoleces/dern;", "remoteDataSource", "Lspatterdash/dern;", "attabal", "(Lscoleces/dern;)Lspatterdash/dern;", "INSTANCE", "Lspatterdash/dern;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ dern saneness(Companion companion, scoleces.dern dernVar, int i, Object obj) {
            if ((i & 1) != 0) {
                dernVar = scoleces.dern.INSTANCE.attabal();
            }
            return companion.attabal(dernVar);
        }

        public final dern attabal(scoleces.dern remoteDataSource) {
            dern dernVar;
            Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
            dern dernVar2 = dern.f38019dern;
            if (dernVar2 != null) {
                return dernVar2;
            }
            synchronized (this) {
                dernVar = dern.f38019dern;
                if (dernVar == null) {
                    dernVar = new dern(remoteDataSource);
                    dern.f38019dern = dernVar;
                }
            }
            return dernVar;
        }

        public Companion() {
        }
    }

    public dern(scoleces.dern remoteDataSource) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        this.remoteDataSource = remoteDataSource;
    }

    public final kotlinx.coroutines.flow.dern<VipStatusResponse> dern() {
        return this.remoteDataSource.dern();
    }
}
