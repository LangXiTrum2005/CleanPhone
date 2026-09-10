package danae;

import ads_mobile_sdk.cn0;
import ads_mobile_sdk.en0;
import ads_mobile_sdk.hb1;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.lf2;
import ads_mobile_sdk.s51;
import ads_mobile_sdk.ym;
import ads_mobile_sdk.z51;
import ads_mobile_sdk.zm;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import complexometry.graveside;
import kotlinx.coroutines.taiyuan;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.terni;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ldanae/attabal;", "", "attabal", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile boolean f25042saneness;

    /* JADX INFO: renamed from: danae.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldanae/attabal$attabal;", "", "Lcomplexometry/graveside;", "saneness", "()Lcomplexometry/graveside;", "Landroid/content/Context;", "context", "Leddy/attabal;", "initializationConfig", "Leddy/dern;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "dern", "(Landroid/content/Context;Leddy/attabal;Leddy/dern;)V", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", "attabal", "()Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final RequestConfiguration attabal() {
            terni.f37333attabal.getClass();
            return ((lf2) ((i60) ((terni) en0.c.getValue())).K0.get()).a();
        }

        public final void dern(Context context, eddy.attabal initializationConfig, eddy.dern listener) throws InterruptedException {
            Object obj;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initializationConfig, "initializationConfig");
            terni.f37333attabal.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(initializationConfig, "initializationConfig");
            Intrinsics.checkNotNullParameter(AdActivity.class, "adActivityClass");
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Application)) {
                throw new IllegalArgumentException("The provided application context is not an instance of Application. The Google Mobile Ads SDK should not be used from contexts like BroadcastReceivers, only Services and Activities.");
            }
            hb1 hb1Var = en0.b;
            cn0 block = new cn0(context, applicationContext, initializationConfig);
            Intrinsics.checkNotNullParameter(block, "block");
            synchronized (hb1Var) {
                try {
                    if (hb1Var.a == null) {
                        hb1Var.a = block.invoke();
                    }
                    obj = hb1Var.a;
                    if (obj == null) {
                        Intrinsics.preprohormone("backingField");
                        obj = Unit.f29295attabal;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i60 i60Var = (i60) ((terni) obj);
            ((lf2) i60Var.K0.get()).a(initializationConfig.getRequestConfiguration());
            z51 z51Var = (z51) i60Var.p2.get();
            z51Var.getClass();
            taiyuan.saneness(null, new s51(listener, z51Var, null), 1, null);
            attabal.f25042saneness = true;
        }

        public final graveside saneness() {
            zm zmVar = ym.a;
            return new graveside(0, 24, 0);
        }

        public Companion() {
        }
    }
}
