package scoleces;

import com.codejoy.boom.clap.network.DataSourceExtensionKt;
import com.yolo.networklibrary.common.model.RequestContent;
import cyclery.RegisterTokenReq;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FcmDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lscoleces/saneness;", "", "<init>", "()V", "Lcyclery/attabal;", "req", "Lkotlinx/coroutines/flow/dern;", "", "dern", "(Lcyclery/attabal;)Lkotlinx/coroutines/flow/dern;", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile saneness f37396saneness;

    /* JADX INFO: renamed from: scoleces.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FcmDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lscoleces/saneness$attabal;", "", "<init>", "()V", "Lscoleces/saneness;", "attabal", "()Lscoleces/saneness;", "INSTANCE", "Lscoleces/saneness;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final saneness attabal() {
            saneness sanenessVar;
            saneness sanenessVar2 = saneness.f37396saneness;
            if (sanenessVar2 != null) {
                return sanenessVar2;
            }
            synchronized (this) {
                sanenessVar = saneness.f37396saneness;
                if (sanenessVar == null) {
                    sanenessVar = new saneness();
                    saneness.f37396saneness = sanenessVar;
                }
            }
            return sanenessVar;
        }

        public Companion() {
        }
    }

    public final kotlinx.coroutines.flow.dern<Unit> dern(RegisterTokenReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        return DataSourceExtensionKt.saneness(((nsa.saneness) ((eradication.saneness) shapoo.attabal.f37589attabal.attabal(eradication.saneness.class)).beachfront(nsa.saneness.class, new String[0])).attabal(RequestContent.INSTANCE.saneness(req)));
    }
}
