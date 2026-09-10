package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.m0;
import l7.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bB%\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0004\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0018J7\u0010\u001f\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#JA\u0010$\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b$\u0010%J\u0017\u0010$\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b$\u0010&J+\u0010$\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b$\u0010'J!\u0010$\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b$\u0010\u0015J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,¨\u0006."}, d2 = {"Lcom/facebook/appevents/InternalAppEventsLogger;", "", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "loggerImpl", "<init>", "(Lcom/facebook/appevents/AppEventsLoggerImpl;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "applicationId", "(Landroid/content/Context;Ljava/lang/String;)V", "activityName", "Ll7/a;", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Ll7/a;)V", X3.i.f27798j0, "Landroid/os/Bundle;", "parameters", "Lwj/r;", "logEvent", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "valueToSum", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", "currency", "Lcom/facebook/appevents/OperationalData;", "operationalData", "logPurchaseImplicitly", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "buttonText", "logEventFromSE", "(Ljava/lang/String;Ljava/lang/String;)V", "logEventImplicitly", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "logChangedSettingsEvent", "(Landroid/os/Bundle;)V", "flush", "()V", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InternalAppEventsLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AppEventsLoggerImpl loggerImpl;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lcom/facebook/appevents/InternalAppEventsLogger$Companion;", "", "<init>", "()V", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getFlushBehavior", "()Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "Ljava/util/concurrent/Executor;", "getAnalyticsExecutor", "()Ljava/util/concurrent/Executor;", "", "getPushNotificationsRegistrationId", "()Ljava/lang/String;", "Landroid/os/Bundle;", "userData", "Lwj/r;", "setUserData", "(Landroid/os/Bundle;)V", "", "ud", "setInternalUserData", "(Ljava/util/Map;)V", "Landroid/content/Context;", "context", "applicationId", "Lcom/facebook/appevents/InternalAppEventsLogger;", "createInstance", "(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/appevents/InternalAppEventsLogger;", "activityName", "Ll7/a;", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Ll7/a;)Lcom/facebook/appevents/InternalAppEventsLogger;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ InternalAppEventsLogger createInstance$default(Companion companion, Context context, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.createInstance(context, str);
        }

        public final InternalAppEventsLogger createInstance(Context context) {
            return createInstance$default(this, context, null, 2, null);
        }

        public final Executor getAnalyticsExecutor() {
            return AppEventsLoggerImpl.INSTANCE.getAnalyticsExecutor();
        }

        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.INSTANCE.getFlushBehavior();
        }

        public final String getPushNotificationsRegistrationId() {
            return AppEventsLoggerImpl.INSTANCE.getPushNotificationsRegistrationId();
        }

        public final void setInternalUserData(Map<String, String> ud2) {
            n.f(ud2, "ud");
            UserDataStore.setInternalUd(ud2);
        }

        public final void setUserData(Bundle userData) {
            UserDataStore.setUserDataAndHash(userData);
        }

        private Companion() {
        }

        public final InternalAppEventsLogger createInstance(Context context, String applicationId) {
            return new InternalAppEventsLogger(context, applicationId);
        }

        public final InternalAppEventsLogger createInstance(String activityName, String applicationId, l7.a accessToken) {
            n.f(activityName, "activityName");
            return new InternalAppEventsLogger(activityName, applicationId, accessToken);
        }
    }

    public InternalAppEventsLogger(AppEventsLoggerImpl loggerImpl) {
        n.f(loggerImpl, "loggerImpl");
        this.loggerImpl = loggerImpl;
    }

    public static final InternalAppEventsLogger createInstance(Context context) {
        return INSTANCE.createInstance(context);
    }

    public static final Executor getAnalyticsExecutor() {
        return INSTANCE.getAnalyticsExecutor();
    }

    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        return INSTANCE.getFlushBehavior();
    }

    public static final String getPushNotificationsRegistrationId() {
        return INSTANCE.getPushNotificationsRegistrationId();
    }

    public static /* synthetic */ void logEventImplicitly$default(InternalAppEventsLogger internalAppEventsLogger, String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            operationalData = null;
        }
        internalAppEventsLogger.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
    }

    public static /* synthetic */ void logPurchaseImplicitly$default(InternalAppEventsLogger internalAppEventsLogger, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            operationalData = null;
        }
        internalAppEventsLogger.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
    }

    public static final void setInternalUserData(Map<String, String> map) {
        INSTANCE.setInternalUserData(map);
    }

    public static final void setUserData(Bundle bundle) {
        INSTANCE.setUserData(bundle);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final void logChangedSettingsEvent(Bundle parameters) {
        n.f(parameters, "parameters");
        if (!((parameters.getInt("previous") & 2) != 0)) {
            s sVar = s.f45212a;
            if (!m0.c()) {
                return;
            }
        }
        this.loggerImpl.logEventImplicitly("fb_sdk_settings_changed", null, parameters);
    }

    public final void logEvent(String eventName, Bundle parameters) {
        s sVar = s.f45212a;
        if (m0.c()) {
            this.loggerImpl.logEvent(eventName, parameters);
        }
    }

    public final void logEventFromSE(String eventName, String buttonText) {
        this.loggerImpl.logEventFromSE(eventName, buttonText);
    }

    public final void logEventImplicitly(String eventName, BigDecimal purchaseAmount, Currency currency, Bundle parameters, OperationalData operationalData) {
        s sVar = s.f45212a;
        if (m0.c()) {
            this.loggerImpl.logEventImplicitly(eventName, purchaseAmount, currency, parameters, operationalData);
        }
    }

    public final void logPurchaseImplicitly(BigDecimal purchaseAmount, Currency currency, Bundle parameters, OperationalData operationalData) {
        s sVar = s.f45212a;
        if (m0.c()) {
            this.loggerImpl.logPurchaseImplicitly(purchaseAmount, currency, parameters, operationalData);
        }
    }

    public static final InternalAppEventsLogger createInstance(Context context, String str) {
        return INSTANCE.createInstance(context, str);
    }

    public InternalAppEventsLogger(Context context) {
        this(new AppEventsLoggerImpl(context, (String) null, (l7.a) null));
    }

    public static final InternalAppEventsLogger createInstance(String str, String str2, l7.a aVar) {
        return INSTANCE.createInstance(str, str2, aVar);
    }

    public InternalAppEventsLogger(Context context, String str) {
        this(new AppEventsLoggerImpl(context, str, (l7.a) null));
    }

    public final void logEvent(String eventName, double valueToSum, Bundle parameters) {
        s sVar = s.f45212a;
        if (m0.c()) {
            this.loggerImpl.logEvent(eventName, valueToSum, parameters);
        }
    }

    public final void logEventImplicitly(String eventName) {
        s sVar = s.f45212a;
        if (m0.c()) {
            this.loggerImpl.logEventImplicitly(eventName, null, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalAppEventsLogger(String activityName, String str, l7.a aVar) {
        this(new AppEventsLoggerImpl(activityName, str, aVar));
        n.f(activityName, "activityName");
    }

    public final void logEventImplicitly(String eventName, Double valueToSum, Bundle parameters) {
        s sVar = s.f45212a;
        if (m0.c()) {
            this.loggerImpl.logEventImplicitly(eventName, valueToSum, parameters);
        }
    }

    public final void logEventImplicitly(String eventName, Bundle parameters) {
        s sVar = s.f45212a;
        if (m0.c()) {
            this.loggerImpl.logEventImplicitly(eventName, null, parameters);
        }
    }
}
