package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0004:;<=B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J!\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013J)\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0014J!\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010 J\u008f\u0001\u0010.\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u0002022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger;", "", "Landroid/content/Context;", "context", "", "applicationId", "Ll7/a;", "accessToken", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll7/a;)V", X3.i.f27798j0, "Lwj/r;", "logEvent", "(Ljava/lang/String;)V", "", "valueToSum", "(Ljava/lang/String;D)V", "Landroid/os/Bundle;", "parameters", "(Ljava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", "currency", "logPurchase", "(Ljava/math/BigDecimal;Ljava/util/Currency;)V", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "payload", "logPushNotificationOpen", "(Landroid/os/Bundle;)V", "action", "(Landroid/os/Bundle;Ljava/lang/String;)V", "itemID", "Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "availability", "Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "condition", "description", "imageLink", "link", "title", "priceAmount", "gtin", "mpn", "brand", "logProductItem", "(Ljava/lang/String;Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;Lcom/facebook/appevents/AppEventsLogger$ProductCondition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "flush", "()V", "", "isValidForAccessToken", "(Ll7/a;)Z", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "loggerImpl", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "getApplicationId", "()Ljava/lang/String;", "Companion", "FlushBehavior", "ProductAvailability", "ProductCondition", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventsLogger {
    public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
    public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
    public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = AppEventsLogger.class.getCanonicalName();
    private final AppEventsLoggerImpl loggerImpl;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0011\u0010\u0015J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0011\u0010\u0016J!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u0003J\u0019\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010\u0003Js\u00105\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010,\u001a\u0004\u0018\u00010\t2\b\u0010-\u001a\u0004\u0018\u00010\t2\b\u0010.\u001a\u0004\u0018\u00010\t2\b\u0010/\u001a\u0004\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u00010\t2\b\u00101\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t2\b\u00103\u001a\u0004\u0018\u00010\t2\b\u00104\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b5\u00106J}\u00105\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010,\u001a\u0004\u0018\u00010\t2\b\u0010-\u001a\u0004\u0018\u00010\t2\b\u0010.\u001a\u0004\u0018\u00010\t2\b\u0010/\u001a\u0004\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u00010\t2\b\u00101\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t2\b\u00103\u001a\u0004\u0018\u00010\t2\b\u00104\u001a\u0004\u0018\u00010\t2\b\u00107\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b5\u00108J\u000f\u00109\u001a\u00020\tH\u0007¢\u0006\u0004\b9\u0010'J\u000f\u0010:\u001a\u00020\u0006H\u0007¢\u0006\u0004\b:\u0010\u0003J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b;\u0010<J\u0019\u0010>\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b>\u0010!R\u0014\u0010?\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010@R\u001c\u0010D\u001a\n C*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@¨\u0006E"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$Companion;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Lwj/r;", "activateApp", "(Landroid/app/Application;)V", "", "applicationId", "(Landroid/app/Application;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "initializeLib", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEventsLogger;", "newLogger", "(Landroid/content/Context;)Lcom/facebook/appevents/AppEventsLogger;", "Ll7/a;", "accessToken", "(Landroid/content/Context;Ll7/a;)Lcom/facebook/appevents/AppEventsLogger;", "(Landroid/content/Context;Ljava/lang/String;Ll7/a;)Lcom/facebook/appevents/AppEventsLogger;", "(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/appevents/AppEventsLogger;", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getFlushBehavior", "()Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "flushBehavior", "setFlushBehavior", "(Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;)V", "onContextStop", "registrationId", "setPushNotificationsRegistrationId", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "webView", "augmentWebView", "(Landroid/webkit/WebView;Landroid/content/Context;)V", "getUserID", "()Ljava/lang/String;", "userID", "setUserID", "clearUserID", NotificationCompat.CATEGORY_EMAIL, "firstName", "lastName", "phone", "dateOfBirth", "gender", "city", "state", "zip", "country", "setUserData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "externalId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserData", "clearUserData", "getAnonymousAppDeviceGUID", "(Landroid/content/Context;)Ljava/lang/String;", Constants.REFERRER, "setInstallReferrer", "ACTION_APP_EVENTS_FLUSHED", "Ljava/lang/String;", "APP_EVENTS_EXTRA_FLUSH_RESULT", "APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED", "kotlin.jvm.PlatformType", "TAG", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void activateApp(Application application) {
            n.f(application, "application");
            AppEventsLoggerImpl.INSTANCE.activateApp(application, null);
        }

        public final void augmentWebView(WebView webView, Context context) {
            n.f(webView, "webView");
            AppEventsLoggerImpl.INSTANCE.augmentWebView(webView, context);
        }

        public final void clearUserData() {
            UserDataStore.clear();
        }

        public final void clearUserID() {
            AnalyticsUserIDStore.setUserID(null);
        }

        public final String getAnonymousAppDeviceGUID(Context context) {
            n.f(context, "context");
            return AppEventsLoggerImpl.INSTANCE.getAnonymousAppDeviceGUID(context);
        }

        public final FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.INSTANCE.getFlushBehavior();
        }

        public final String getUserData() {
            return UserDataStore.getHashedUserData$facebook_core_release();
        }

        public final String getUserID() {
            return AnalyticsUserIDStore.getUserID();
        }

        public final void initializeLib(Context context, String applicationId) {
            n.f(context, "context");
            AppEventsLoggerImpl.INSTANCE.initializeLib(context, applicationId);
        }

        public final AppEventsLogger newLogger(Context context) {
            n.f(context, "context");
            return new AppEventsLogger(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void onContextStop() {
            AppEventsLoggerImpl.INSTANCE.onContextStop();
        }

        public final void setFlushBehavior(FlushBehavior flushBehavior) {
            n.f(flushBehavior, "flushBehavior");
            AppEventsLoggerImpl.INSTANCE.setFlushBehavior(flushBehavior);
        }

        public final void setInstallReferrer(String referrer) {
            AppEventsLoggerImpl.INSTANCE.setInstallReferrer(referrer);
        }

        public final void setPushNotificationsRegistrationId(String registrationId) {
            AppEventsLoggerImpl.INSTANCE.setPushNotificationsRegistrationId(registrationId);
        }

        public final void setUserData(String email, String firstName, String lastName, String phone, String dateOfBirth, String gender, String city, String state, String zip, String country) {
            UserDataStore.setUserDataAndHash$default(email, firstName, lastName, phone, dateOfBirth, gender, city, state, zip, country, null, 1024, null);
        }

        public final void setUserID(String userID) {
            AnalyticsUserIDStore.setUserID(userID);
        }

        private Companion() {
        }

        public final void activateApp(Application application, String applicationId) {
            n.f(application, "application");
            AppEventsLoggerImpl.INSTANCE.activateApp(application, applicationId);
        }

        public final AppEventsLogger newLogger(Context context, l7.a accessToken) {
            n.f(context, "context");
            return new AppEventsLogger(context, null, accessToken, 0 == true ? 1 : 0);
        }

        public final void setUserData(String email, String firstName, String lastName, String phone, String dateOfBirth, String gender, String city, String state, String zip, String country, String externalId) {
            UserDataStore.setUserDataAndHash(email, firstName, lastName, phone, dateOfBirth, gender, city, state, zip, country, externalId);
        }

        public final AppEventsLogger newLogger(Context context, String applicationId, l7.a accessToken) {
            n.f(context, "context");
            return new AppEventsLogger(context, applicationId, accessToken, null);
        }

        public final AppEventsLogger newLogger(Context context, String applicationId) {
            n.f(context, "context");
            return new AppEventsLogger(context, applicationId, null, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "(Ljava/lang/String;I)V", "AUTO", "EXPLICIT_ONLY", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "", "(Ljava/lang/String;I)V", "IN_STOCK", "OUT_OF_STOCK", "PREORDER", "AVALIABLE_FOR_ORDER", "DISCONTINUED", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum ProductAvailability {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "", "(Ljava/lang/String;I)V", "NEW", "REFURBISHED", "USED", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum ProductCondition {
        NEW,
        REFURBISHED,
        USED
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, l7.a aVar, g gVar) {
        this(context, str, aVar);
    }

    public static final void activateApp(Application application) {
        INSTANCE.activateApp(application);
    }

    public static final void augmentWebView(WebView webView, Context context) {
        INSTANCE.augmentWebView(webView, context);
    }

    public static final void clearUserData() {
        INSTANCE.clearUserData();
    }

    public static final void clearUserID() {
        INSTANCE.clearUserID();
    }

    public static final String getAnonymousAppDeviceGUID(Context context) {
        return INSTANCE.getAnonymousAppDeviceGUID(context);
    }

    public static final FlushBehavior getFlushBehavior() {
        return INSTANCE.getFlushBehavior();
    }

    public static final String getUserData() {
        return INSTANCE.getUserData();
    }

    public static final String getUserID() {
        return INSTANCE.getUserID();
    }

    public static final void initializeLib(Context context, String str) {
        INSTANCE.initializeLib(context, str);
    }

    public static final AppEventsLogger newLogger(Context context) {
        return INSTANCE.newLogger(context);
    }

    public static final void onContextStop() {
        INSTANCE.onContextStop();
    }

    public static final void setFlushBehavior(FlushBehavior flushBehavior) {
        INSTANCE.setFlushBehavior(flushBehavior);
    }

    public static final void setInstallReferrer(String str) {
        INSTANCE.setInstallReferrer(str);
    }

    public static final void setPushNotificationsRegistrationId(String str) {
        INSTANCE.setPushNotificationsRegistrationId(str);
    }

    public static final void setUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        INSTANCE.setUserData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public static final void setUserID(String str) {
        INSTANCE.setUserID(str);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final String getApplicationId() {
        return this.loggerImpl.getApplicationId();
    }

    public final boolean isValidForAccessToken(l7.a accessToken) {
        n.f(accessToken, "accessToken");
        return this.loggerImpl.isValidForAccessToken(accessToken);
    }

    public final void logEvent(String eventName) {
        this.loggerImpl.logEvent(eventName);
    }

    public final void logProductItem(String itemID, ProductAvailability availability, ProductCondition condition, String description, String imageLink, String link, String title, BigDecimal priceAmount, Currency currency, String gtin, String mpn, String brand, Bundle parameters) {
        this.loggerImpl.logProductItem(itemID, availability, condition, description, imageLink, link, title, priceAmount, currency, gtin, mpn, brand, parameters);
    }

    public final void logPurchase(BigDecimal purchaseAmount, Currency currency) {
        this.loggerImpl.logPurchase(purchaseAmount, currency);
    }

    public final void logPushNotificationOpen(Bundle payload) {
        n.f(payload, "payload");
        this.loggerImpl.logPushNotificationOpen(payload, null);
    }

    private AppEventsLogger(Context context, String str, l7.a aVar) {
        this.loggerImpl = new AppEventsLoggerImpl(context, str, aVar);
    }

    public static final void activateApp(Application application, String str) {
        INSTANCE.activateApp(application, str);
    }

    public static final AppEventsLogger newLogger(Context context, String str) {
        return INSTANCE.newLogger(context, str);
    }

    public static final void setUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        INSTANCE.setUserData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public final void logEvent(String eventName, double valueToSum) {
        this.loggerImpl.logEvent(eventName, valueToSum);
    }

    public final void logPurchase(BigDecimal purchaseAmount, Currency currency, Bundle parameters) {
        this.loggerImpl.logPurchase(purchaseAmount, currency, parameters);
    }

    public final void logPushNotificationOpen(Bundle payload, String action) {
        n.f(payload, "payload");
        this.loggerImpl.logPushNotificationOpen(payload, action);
    }

    public static final AppEventsLogger newLogger(Context context, String str, l7.a aVar) {
        return INSTANCE.newLogger(context, str, aVar);
    }

    public final void logEvent(String eventName, Bundle parameters) {
        this.loggerImpl.logEvent(eventName, parameters);
    }

    public static final AppEventsLogger newLogger(Context context, l7.a aVar) {
        return INSTANCE.newLogger(context, aVar);
    }

    public final void logEvent(String eventName, double valueToSum, Bundle parameters) {
        this.loggerImpl.logEvent(eventName, valueToSum, parameters);
    }
}
