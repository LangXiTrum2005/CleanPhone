package spatterdash;

import incidentally.VersionResponse;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lspatterdash/attabal;", "", "Lscoleces/attabal;", "remoteDataSource", "<init>", "(Lscoleces/attabal;)V", "Lkotlinx/coroutines/flow/dern;", "Lincidentally/attabal;", "dern", "()Lkotlinx/coroutines/flow/dern;", "attabal", "Lscoleces/attabal;", "saneness", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static volatile attabal f38016dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final scoleces.attabal remoteDataSource;

    /* JADX INFO: renamed from: spatterdash.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: CommonRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lspatterdash/attabal$attabal;", "", "<init>", "()V", "Lscoleces/attabal;", "remoteDataSource", "Lspatterdash/attabal;", "attabal", "(Lscoleces/attabal;)Lspatterdash/attabal;", "INSTANCE", "Lspatterdash/attabal;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ attabal saneness(Companion companion, scoleces.attabal attabalVar, int i, Object obj) {
            if ((i & 1) != 0) {
                attabalVar = scoleces.attabal.INSTANCE.attabal();
            }
            return companion.attabal(attabalVar);
        }

        public final attabal attabal(scoleces.attabal remoteDataSource) {
            attabal attabalVar;
            Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
            attabal attabalVar2 = attabal.f38016dern;
            if (attabalVar2 != null) {
                return attabalVar2;
            }
            synchronized (this) {
                attabalVar = attabal.f38016dern;
                if (attabalVar == null) {
                    attabalVar = new attabal(remoteDataSource);
                    attabal.f38016dern = attabalVar;
                }
            }
            return attabalVar;
        }

        public Companion() {
        }
    }

    public attabal(scoleces.attabal remoteDataSource) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        this.remoteDataSource = remoteDataSource;
    }

    public final kotlinx.coroutines.flow.dern<VersionResponse> dern() {
        return this.remoteDataSource.dern();
    }
}
