package ads_mobile_sdk;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class f73 implements hemolysin {
    public final loun a;
    public final saran b;

    public f73(loun traceLogger, saran uiScope) {
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.a = traceLogger;
        this.b = uiScope;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        yq0 yq0Var;
        try {
            er0 er0VarD = gq0Var.d();
            String str = (String) map.get(IronSourceConstants.EVENTS_DURATION);
            if (str == null) {
                y13.a("Invalid videoMeta gmsg with no duration.", null, 6);
                return Unit.f29295attabal;
            }
            float f = Float.parseFloat(str);
            if (er0VarD == null) {
                boolean zWireman = Intrinsics.wireman("1", map.get("customControlsAllowed"));
                Intrinsics.wireman("1", map.get("clickToExpandAllowed"));
                er0 er0Var = new er0(this.b, gq0Var, f, zWireman);
                synchronized (gq0Var) {
                    try {
                        if (gq0Var.d() != null) {
                            kn0.a("Attempt to create multiple GmaWebViewVideoController.", (Throwable) null);
                        } else {
                            gq0Var.p = er0Var;
                        }
                        Unit unit = Unit.f29295attabal;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                er0VarD = er0Var;
            }
            boolean zWireman2 = Intrinsics.wireman("1", map.get("muted"));
            String str2 = (String) map.get("playbackState");
            if (str2 == null) {
                y13.a("Invalid videoMeta gmsg with no playback state.", null, 6);
                return Unit.f29295attabal;
            }
            int i = Integer.parseInt(str2);
            yq0[] yq0VarArrValues = yq0.values();
            int length = yq0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    yq0Var = null;
                    break;
                }
                yq0Var = yq0VarArrValues[i2];
                if (yq0Var.a == i) {
                    break;
                }
                i2++;
            }
            if (yq0Var == null) {
                yq0Var = yq0.UNKNOWN;
            }
            String str3 = (String) map.get(InMobiNetworkValues.ASPECT_RATIO);
            if (str3 == null) {
                y13.a("Invalid videoMeta gmsg with no aspect ratio.", null, 6);
                return Unit.f29295attabal;
            }
            er0VarD.a(f, yq0Var, zWireman2, Float.parseFloat(str3));
        } catch (NumberFormatException e) {
            y13.a("Exception handling video metadata", e, 4);
            ((d13) this.a).a("VideoMetadataGmsgHandler.onGmsg", e);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_VIDEO_METADATA;
    }

    @Override // saneness.hemolysin
    public final boolean c() {
        return true;
    }
}
