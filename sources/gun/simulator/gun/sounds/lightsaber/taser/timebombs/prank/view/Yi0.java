package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.vungle.ads.ServiceLocator$Companion;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class Yi0 {
    /* JADX INFO: renamed from: getAvailableBidTokens$lambda-0, reason: not valid java name */
    private static final C2466Hh m218getAvailableBidTokens$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (C2466Hh) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: getAvailableBidTokens$lambda-1, reason: not valid java name */
    private static final C4893w20 m219getAvailableBidTokens$lambda1(InterfaceC3069bH interfaceC3069bH) {
        return (C4893w20) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: getAvailableBidTokens$lambda-2, reason: not valid java name */
    private static final C4582sa m220getAvailableBidTokens$lambda2(InterfaceC3069bH interfaceC3069bH) {
        return (C4582sa) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAvailableBidTokens$lambda-3, reason: not valid java name */
    public static final String m221getAvailableBidTokens$lambda3(InterfaceC3069bH interfaceC3069bH) {
        AbstractC2995aW.q(interfaceC3069bH, "$bidTokenEncoder$delegate");
        return m220getAvailableBidTokens$lambda2(interfaceC3069bH).encode().getBidToken();
    }

    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-4, reason: not valid java name */
    private static final C4582sa m222getAvailableBidTokensAsync$lambda4(InterfaceC3069bH interfaceC3069bH) {
        return (C4582sa) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-5, reason: not valid java name */
    private static final C4893w20 m223getAvailableBidTokensAsync$lambda5(InterfaceC3069bH interfaceC3069bH) {
        return (C4893w20) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-6, reason: not valid java name */
    public static final void m224getAvailableBidTokensAsync$lambda6(InterfaceC4055ma interfaceC4055ma, InterfaceC3069bH interfaceC3069bH) {
        AbstractC2995aW.q(interfaceC4055ma, "$callback");
        AbstractC2995aW.q(interfaceC3069bH, "$bidTokenEncoder$delegate");
        C5115yc0 c5115yc0 = new C5115yc0(B30.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        c5115yc0.markStart();
        C4231oa c4231oaEncode = m222getAvailableBidTokensAsync$lambda4(interfaceC3069bH).encode();
        c5115yc0.markEnd();
        if (c4231oaEncode.getBidToken().length() > 0) {
            c4231oaEncode.getBidToken();
            interfaceC4055ma.a();
        } else {
            c5115yc0.setMetricType(B30.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            c5115yc0.setMeta(c4231oaEncode.getErrorMessage());
            c4231oaEncode.getErrorMessage();
            interfaceC4055ma.b();
        }
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, c5115yc0, (C4126nJ) null, (String) null, 6, (Object) null);
    }

    public final String getAvailableBidTokens(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        C5115yc0 c5115yc0 = new C5115yc0(B30.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        c5115yc0.markStart();
        if (!C3282di0.Companion.isInitialized()) {
            OV ov = OV.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            AbstractC2995aW.p(applicationContext, "context.applicationContext");
            ov.init(applicationContext);
        }
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new Ti0(context));
        String str = (String) new FutureC4796ux(m219getAvailableBidTokens$lambda1(AbstractC2340Cl.H(enumC4124nH, new Ui0(context))).getApiExecutor().submit(new CallableC4668tY(AbstractC2340Cl.H(enumC4124nH, new Vi0(context)), 2))).get(m218getAvailableBidTokens$lambda0(interfaceC3069bHH).getTimeout(), TimeUnit.MILLISECONDS);
        if (str == null || str.length() == 0) {
            c5115yc0.setMetricType(B30.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            c5115yc0.setMeta("Bid token is null or empty");
        }
        c5115yc0.markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, c5115yc0, (C4126nJ) null, (String) null, 6, (Object) null);
        return str;
    }

    public final void getAvailableBidTokensAsync(Context context, InterfaceC4055ma interfaceC4055ma) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(interfaceC4055ma, "callback");
        if (!C3282di0.Companion.isInitialized()) {
            OV ov = OV.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            AbstractC2995aW.p(applicationContext, "context.applicationContext");
            ov.init(applicationContext);
        }
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        m223getAvailableBidTokensAsync$lambda5(AbstractC2340Cl.H(enumC4124nH, new Xi0(context))).getApiExecutor().execute(new Ff0(12, interfaceC4055ma, AbstractC2340Cl.H(enumC4124nH, new Wi0(context))));
    }

    public final String getSdkVersion() {
        return "7.4.3";
    }
}
