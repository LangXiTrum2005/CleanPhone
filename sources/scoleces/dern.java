package scoleces;

import ammonoid.VipStatusResponse;
import com.yolo.networklibrary.common.model.RequestContent;
import com.yolo.networklibrary.common.util.DataSourceExtensionKt;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SubscriptionDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lscoleces/dern;", "", "<init>", "()V", "Lkotlinx/coroutines/flow/dern;", "Lammonoid/attabal;", "dern", "()Lkotlinx/coroutines/flow/dern;", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile dern f37394saneness;

    /* JADX INFO: renamed from: scoleces.dern$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SubscriptionDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lscoleces/dern$attabal;", "", "<init>", "()V", "Lscoleces/dern;", "attabal", "()Lscoleces/dern;", "INSTANCE", "Lscoleces/dern;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dern attabal() {
            dern dernVar;
            dern dernVar2 = dern.f37394saneness;
            if (dernVar2 != null) {
                return dernVar2;
            }
            synchronized (this) {
                dernVar = dern.f37394saneness;
                if (dernVar == null) {
                    dernVar = new dern();
                    dern.f37394saneness = dernVar;
                }
            }
            return dernVar;
        }

        public Companion() {
        }
    }

    public final kotlinx.coroutines.flow.dern<VipStatusResponse> dern() {
        return DataSourceExtensionKt.attabal(((nsa.dern) ((eradication.saneness) shapoo.attabal.f37589attabal.attabal(eradication.saneness.class)).beachfront(nsa.dern.class, new String[0])).attabal(RequestContent.INSTANCE.saneness(new Object[0])));
    }
}
