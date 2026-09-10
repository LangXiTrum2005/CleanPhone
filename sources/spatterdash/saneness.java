package spatterdash;

import cyclery.RegisterTokenReq;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FcmRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lspatterdash/saneness;", "", "Lscoleces/saneness;", "remoteDataSource", "<init>", "(Lscoleces/saneness;)V", "Lcyclery/attabal;", "req", "Lkotlinx/coroutines/flow/dern;", "", "dern", "(Lcyclery/attabal;)Lkotlinx/coroutines/flow/dern;", "attabal", "Lscoleces/saneness;", "saneness", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static volatile saneness f38022dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final scoleces.saneness remoteDataSource;

    /* JADX INFO: renamed from: spatterdash.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FcmRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lspatterdash/saneness$attabal;", "", "<init>", "()V", "Lscoleces/saneness;", "remoteDataSource", "Lspatterdash/saneness;", "attabal", "(Lscoleces/saneness;)Lspatterdash/saneness;", "INSTANCE", "Lspatterdash/saneness;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ saneness saneness(Companion companion, scoleces.saneness sanenessVar, int i, Object obj) {
            if ((i & 1) != 0) {
                sanenessVar = scoleces.saneness.INSTANCE.attabal();
            }
            return companion.attabal(sanenessVar);
        }

        public final saneness attabal(scoleces.saneness remoteDataSource) {
            saneness sanenessVar;
            Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
            saneness sanenessVar2 = saneness.f38022dern;
            if (sanenessVar2 != null) {
                return sanenessVar2;
            }
            synchronized (this) {
                sanenessVar = saneness.f38022dern;
                if (sanenessVar == null) {
                    sanenessVar = new saneness(remoteDataSource);
                    saneness.f38022dern = sanenessVar;
                }
            }
            return sanenessVar;
        }

        public Companion() {
        }
    }

    public saneness(scoleces.saneness remoteDataSource) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        this.remoteDataSource = remoteDataSource;
    }

    public final kotlinx.coroutines.flow.dern<Unit> dern(RegisterTokenReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        return this.remoteDataSource.dern(req);
    }
}
