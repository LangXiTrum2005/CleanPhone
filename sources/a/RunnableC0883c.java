package A;

import android.net.Network;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.inmobi.media.A7;
import com.inmobi.media.C2941b;
import com.inmobi.media.C2960c1;
import com.inmobi.media.C2975d;
import com.inmobi.media.C2976d0;
import com.inmobi.media.C2996e3;
import com.inmobi.media.C3009f0;
import com.inmobi.media.C3069ic;
import com.inmobi.media.C3078j5;
import com.inmobi.media.C3088k;
import com.inmobi.media.C3203r3;
import com.inmobi.media.C3233t1;
import com.inmobi.media.C3297x1;
import com.inmobi.media.E1;
import com.inmobi.media.G1;
import com.inmobi.media.J4;
import com.inmobi.media.M2;
import com.inmobi.media.O4;
import com.inmobi.media.Oe;
import com.inmobi.media.W9;
import com.inmobi.media.Y1;
import com.inmobi.media.Y3;
import com.inmobi.media.Ya;
import com.inmobi.media.kf;
import com.inmobi.media.lf;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import com.p004ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: A.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0883c implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3168Y;

    public /* synthetic */ RunnableC0883c(Object obj, int i2) {
        this.X = i2;
        this.f3168Y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f3168Y;
        switch (this.X) {
            case 0:
                com.inmobi.media.A0.a((com.inmobi.media.B0) obj);
                break;
            case 1:
                A7.a((A7) obj);
                break;
            case 2:
                E1.a((E1) obj);
                break;
            case 3:
                com.inmobi.media.F.a((com.inmobi.media.I) obj);
                break;
            case 4:
                G1.a((G1) obj);
                break;
            case 5:
                J4.a((J4) obj);
                break;
            case 6:
                M2.a((ArrayList) obj);
                break;
            case 7:
                O4.a((O4) obj);
                break;
            case 8:
                Oe.a((Oe) obj);
                break;
            case 9:
                W9.a((W9) obj);
                break;
            case 10:
                Y1.a((Y1) obj);
                break;
            case 11:
                Ya.b((JSONObject) obj);
                break;
            case 12:
                C2941b.b((C2941b) obj);
                break;
            case 13:
                C2960c1.a((C2960c1) obj);
                break;
            case 14:
                C2976d0.a((C2976d0) obj);
                break;
            case 15:
                C2996e3.a((C2996e3) obj);
                break;
            case 16:
                C3009f0.b((C2975d) obj);
                break;
            case 17:
                C3009f0.a((Function0) obj);
                break;
            case 18:
                C3069ic.a((C3069ic) obj);
                break;
            case 19:
                C3078j5.a((Y3) obj);
                break;
            case 20:
                kf.a((lf) obj);
                break;
            case 21:
                C3203r3.b((Network) obj);
                break;
            case 22:
                C3233t1.b((C3088k) obj);
                break;
            case 23:
                C3297x1.a((C3297x1) obj);
                break;
            case 24:
                InMobiUnifiedIdService.a((InMobiUserDataModel) obj);
                break;
            case 25:
                InMobiUnifiedIdService.b((InMobiUnifiedIdInterface) obj);
                break;
            case 26:
                LevelPlayNativeAd.a((LevelPlayNativeAd) obj);
                break;
            case 27:
                ((OverlayActivity) obj).c();
                break;
            case 28:
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.j0;
                ProcessLifecycleOwner this$0 = (ProcessLifecycleOwner) obj;
                Intrinsics.f(this$0, "this$0");
                int i2 = this$0.f5252Y;
                LifecycleRegistry lifecycleRegistry = this$0.g0;
                if (i2 == 0) {
                    this$0.Z = true;
                    lifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
                }
                if (this$0.X == 0 && this$0.Z) {
                    lifecycleRegistry.f(Lifecycle.Event.ON_STOP);
                    this$0.e0 = true;
                    break;
                }
                break;
            default:
                DefaultAnalyticsCollector defaultAnalyticsCollector = (DefaultAnalyticsCollector) obj;
                AnalyticsListener.EventTime eventTimeM = defaultAnalyticsCollector.m();
                defaultAnalyticsCollector.x(eventTimeM, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new I.a(eventTimeM, 11));
                defaultAnalyticsCollector.g0.d();
                break;
        }
    }
}
