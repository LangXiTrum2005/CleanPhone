package gargoyle;

import ads_mobile_sdk.en0;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.q42;
import ads_mobile_sdk.w52;
import ads_mobile_sdk.w71;
import ads_mobile_sdk.yf2;
import complexometry.beachfront;
import kotlinx.coroutines.taiyuan;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.interaction;
import saneness.terni;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lgargoyle/dern;", "", "attabal", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f26549saneness;

    /* JADX INFO: renamed from: gargoyle.dern$attabal, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgargoyle/dern$attabal;", "Lcomplexometry/beachfront;", "Lgargoyle/attabal;", "", "preloadId", "saneness", "(Ljava/lang/String;)Lgargoyle/attabal;", "", "attabal", "(Ljava/lang/String;)Z", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion extends beachfront<attabal> {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ Companion f26549saneness = new Companion();

        public Companion() {
            super(yf2.h);
        }

        @Override // complexometry.beachfront
        public boolean attabal(String preloadId) {
            Intrinsics.checkNotNullParameter(preloadId, "preloadId");
            return super.attabal(preloadId);
        }

        public attabal saneness(String preloadId) {
            Intrinsics.checkNotNullParameter(preloadId, "preloadId");
            terni.f37333attabal.getClass();
            w52 w52Var = (w52) ((i60) ((terni) en0.c.getValue())).y0.get();
            w52Var.getClass();
            Intrinsics.checkNotNullParameter(preloadId, "configurationId");
            interaction interactionVar = (interaction) taiyuan.saneness(null, new q42(w52Var, preloadId, null), 1, null);
            if (interactionVar != null) {
                return new w71(interactionVar);
            }
            return null;
        }
    }
}
