package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import java.util.Iterator;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class y01 implements hemolysin {
    public final loun a;
    public final lf2 b;
    public final wf c;

    public y01(loun traceLogger, lf2 requestConfigurationWrapper, wf appSettings) {
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        this.a = traceLogger;
        this.b = requestConfigurationWrapper;
        this.c = appSettings;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        Object obj;
        Object next;
        String str = (String) map.get("applicationMuted");
        if (str != null) {
            this.c.a(Intrinsics.wireman(str, "1"));
        }
        String str2 = (String) map.get("applicationVolume");
        if (str2 != null) {
            try {
                this.c.a(Float.parseFloat(str2));
            } catch (NumberFormatException e) {
                ((d13) this.a).a("Failed to parse application volume: " + str2 + ".", e);
            }
        }
        RequestConfiguration.attabal attabalVarAttabal = this.b.a().attabal();
        Iterator<E> it = RequestConfiguration.MaxAdContentRating.a().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.wireman(((RequestConfiguration.MaxAdContentRating) next).getValue(), map.get("maxAdContentRating")));
        RequestConfiguration.MaxAdContentRating maxAdContentRating = (RequestConfiguration.MaxAdContentRating) next;
        if (maxAdContentRating != null) {
            attabalVarAttabal.saneness(maxAdContentRating);
        }
        String str3 = (String) map.get("publisherPrivacyPersonalizationState");
        if (str3 != null) {
            try {
                int i = Integer.parseInt(str3);
                for (Object obj2 : RequestConfiguration.PublisherPrivacyPersonalizationState.a()) {
                    if (((RequestConfiguration.PublisherPrivacyPersonalizationState) obj2).getValue() == i) {
                        obj = obj2;
                        break;
                    }
                }
                RequestConfiguration.PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState = (RequestConfiguration.PublisherPrivacyPersonalizationState) obj;
                if (publisherPrivacyPersonalizationState != null) {
                    attabalVarAttabal.dern(publisherPrivacyPersonalizationState);
                }
            } catch (NumberFormatException e2) {
                ((d13) this.a).a("Failed to parse publisher privacy personalization state: " + str3 + ".", e2);
                Unit unit = Unit.f29295attabal;
            }
        }
        this.b.a(attabalVarAttabal.attabal());
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_INSPECTOR_SET_APPLICATION_STATE;
    }
}
