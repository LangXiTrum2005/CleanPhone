package d9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import b2.p;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.internal.ads.zs;
import com.google.android.gms.internal.auth.a2;
import com.google.android.gms.internal.auth.b2;
import com.google.android.gms.internal.auth.d2;
import com.google.android.gms.internal.auth.e2;
import com.google.android.gms.internal.auth.f2;
import com.google.android.gms.internal.auth.g2;
import com.google.android.gms.internal.auth.n0;
import com.google.android.gms.internal.auth.r;
import com.google.android.gms.internal.auth.x0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.d0;
import g9.k;
import i9.f;
import i9.g;
import j9.e;
import j9.h;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import k9.c0;
import k9.l0;
import k9.o0;
import v0.i;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f38792a = {"com.google", "com.google.work", "cn.google"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ComponentName f38793b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f38794c = new p("Auth", new String[]{"GoogleAuthUtil"});

    public static void a(Context context, String str) throws IOException, zs {
        Context context2;
        c0.g("Calling this from your main thread can lead to deadlock");
        f(context);
        Bundle bundle = new Bundle();
        g(context, bundle);
        r.c(context);
        ((g2) ((f2) e2.f22818b.f22819a.zza())).getClass();
        if (((Boolean) g2.f22826b.b()).booleanValue() && i(context)) {
            context2 = context;
            com.google.android.gms.internal.auth.b bVar = new com.google.android.gms.internal.auth.b(context2, null, com.google.android.gms.internal.auth.b.l, j9.b.f43727o9, h.f43737c);
            com.google.android.gms.internal.auth.d dVar = new com.google.android.gms.internal.auth.d();
            dVar.f22801b = str;
            m mVarB = m.b();
            mVarB.f11729a = new i9.c[]{c.f38797c};
            mVarB.f11732d = new x0(bVar, dVar);
            mVarB.f11731c = 1513;
            try {
                e(bVar.c(1, mVarB.a()), "clear token");
                return;
            } catch (e e10) {
                f38794c.p("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "clear token", Log.getStackTraceString(e10));
            }
        } else {
            context2 = context;
        }
        d(context2, f38793b, new d0((Object) str, false, (Object) bundle, 8));
    }

    public static String b(Context context, Account account, String str) throws IOException, zs {
        Context context2;
        TokenData tokenDataC;
        p pVar = f38794c;
        Bundle bundle = new Bundle();
        h(account);
        c0.g("Calling this from your main thread can lead to deadlock");
        c0.f(str, "Scope cannot be empty or null.");
        h(account);
        f(context);
        Bundle bundle2 = new Bundle(bundle);
        g(context, bundle2);
        r.c(context);
        ((g2) ((f2) e2.f22818b.f22819a.zza())).getClass();
        if (((Boolean) g2.f22826b.b()).booleanValue() && i(context)) {
            context2 = context;
            com.google.android.gms.internal.auth.b bVar = new com.google.android.gms.internal.auth.b(context2, null, com.google.android.gms.internal.auth.b.l, j9.b.f43727o9, h.f43737c);
            c0.f(str, "Scope cannot be null!");
            m mVarB = m.b();
            mVarB.f11729a = new i9.c[]{c.f38797c};
            mVarB.f11732d = new k(bVar, account, str, bundle2);
            mVarB.f11731c = 1512;
            try {
                Bundle bundle3 = (Bundle) e(bVar.c(1, mVarB.a()), "token retrieval");
                if (bundle3 != null) {
                    tokenDataC = c(context2, bundle3);
                    return tokenDataC.f11594b;
                }
                pVar.p("Service call returned null.", new Object[0]);
                throw new IOException("Service unavailable.");
            } catch (e e10) {
                pVar.p("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "token retrieval", Log.getStackTraceString(e10));
                tokenDataC = (TokenData) d(context2, f38793b, new u(account, str, bundle2, context2));
            }
        } else {
            context2 = context;
        }
        tokenDataC = (TokenData) d(context2, f38793b, new u(account, str, bundle2, context2));
        return tokenDataC.f11594b;
    }

    public static TokenData c(Context context, Bundle bundle) throws IOException, zs {
        TokenData tokenData;
        String str;
        int i10;
        String str2;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        int[] iArrD = i.d(61);
        int length = iArrD.length;
        int i11 = 0;
        while (true) {
            str = "BAD_REQUEST";
            if (i11 < length) {
                i10 = iArrD[i11];
                switch (i10) {
                    case 1:
                        str2 = "ClientLoginDisabled";
                        break;
                    case 2:
                        str2 = "SocketTimeout";
                        break;
                    case 3:
                        str2 = "Ok";
                        break;
                    case 4:
                        str2 = "UNKNOWN_ERR";
                        break;
                    case 5:
                        str2 = "NetworkError";
                        break;
                    case 6:
                        str2 = "ServiceUnavailable";
                        break;
                    case 7:
                        str2 = "InternalError";
                        break;
                    case 8:
                        str2 = "IllegalArgument";
                        break;
                    case 9:
                        str2 = "BadAuthentication";
                        break;
                    case 10:
                        str2 = "BAD_REQUEST";
                        break;
                    case 11:
                        str2 = "EmptyConsumerPackageOrSig";
                        break;
                    case 12:
                        str2 = "InvalidSecondFactor";
                        break;
                    case 13:
                        str2 = "PostSignInFlowRequired";
                        break;
                    case 14:
                        str2 = "NeedsBrowser";
                        break;
                    case 15:
                        str2 = "Unknown";
                        break;
                    case 16:
                        str2 = "NotVerified";
                        break;
                    case 17:
                        str2 = "TermsNotAgreed";
                        break;
                    case 18:
                        str2 = "AccountDisabled";
                        break;
                    case 19:
                        str2 = "CaptchaRequired";
                        break;
                    case 20:
                        str2 = "AccountDeleted";
                        break;
                    case 21:
                        str2 = "ServiceDisabled";
                        break;
                    case 22:
                        str2 = "ChallengeRequired";
                        break;
                    case 23:
                        str2 = "NeedPermission";
                        break;
                    case 24:
                        str2 = "NeedRemoteConsent";
                        break;
                    case 25:
                        str2 = "INVALID_SCOPE";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                        str2 = "UserCancel";
                        break;
                    case 27:
                        str2 = "PermissionDenied";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                        str2 = "RESTRICTED_CLIENT";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                        str2 = "INVALID_AUDIENCE";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                        str2 = "UNREGISTERED_ON_API_CONSOLE";
                        break;
                    case 31:
                        str2 = "ThirdPartyDeviceManagementRequired";
                        break;
                    case 32:
                        str2 = "DeviceManagementInternalError";
                        break;
                    case 33:
                        str2 = "DeviceManagementSyncDisabled";
                        break;
                    case 34:
                        str2 = "DeviceManagementAdminBlocked";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        str2 = "DeviceManagementAdminPendingApproval";
                        break;
                    case 36:
                        str2 = "DeviceManagementStaleSyncRequired";
                        break;
                    case 37:
                        str2 = "DeviceManagementDeactivated";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        str2 = "DeviceManagementScreenlockRequired";
                        break;
                    case 39:
                        str2 = "DeviceManagementRequired";
                        break;
                    case 40:
                        str2 = "DeviceManagementRequiredOrSyncDisabled";
                        break;
                    case 41:
                        str2 = "ALREADY_HAS_GMAIL";
                        break;
                    case 42:
                        str2 = "WeakPassword";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        str2 = "BadRequest";
                        break;
                    case 44:
                        str2 = "BadUsername";
                        break;
                    case 45:
                        str2 = "DeletedGmail";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        str2 = "ExistingUsername";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        str2 = "LoginFail";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        str2 = "NotLoggedIn";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        str2 = "NoGmail";
                        break;
                    case 50:
                        str2 = "RequestDenied";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        str2 = "ServerError";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        str2 = "UsernameUnavailable";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        str2 = "GPlusOther";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        str2 = "GPlusNickname";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        str2 = "GPlusInvalidChar";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        str2 = "GPlusInterstitial";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        str2 = "ProfileUpgradeError";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        str2 = "AuthSecurityError";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        str2 = "AuthBindingError";
                        break;
                    case 60:
                        str2 = "AccountNotPresent";
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        str2 = "AppSuspended";
                        break;
                    default:
                        throw null;
                }
                if (!str2.equals(string)) {
                    i11++;
                }
            } else {
                i10 = 15;
            }
        }
        StringBuilder sb2 = new StringBuilder("[GoogleAuthUtil] error status:");
        switch (i10) {
            case 1:
                str = "CLIENT_LOGIN_DISABLED";
                break;
            case 2:
                str = "SOCKET_TIMEOUT";
                break;
            case 3:
                str = "SUCCESS";
                break;
            case 4:
                str = "UNKNOWN_ERROR";
                break;
            case 5:
                str = "NETWORK_ERROR";
                break;
            case 6:
                str = "SERVICE_UNAVAILABLE";
                break;
            case 7:
                str = "INTNERNAL_ERROR";
                break;
            case 8:
                str = "ILLEGAL_ARGUMENT";
                break;
            case 9:
                str = "BAD_AUTHENTICATION";
                break;
            case 10:
                str = "BAD_TOKEN_REQUEST";
                break;
            case 11:
                str = "EMPTY_CONSUMER_PKG_OR_SIG";
                break;
            case 12:
                str = "NEEDS_2F";
                break;
            case 13:
                str = "NEEDS_POST_SIGN_IN_FLOW";
                break;
            case 14:
                str = "NEEDS_BROWSER";
                break;
            case 15:
                str = "UNKNOWN";
                break;
            case 16:
                str = "NOT_VERIFIED";
                break;
            case 17:
                str = "TERMS_NOT_AGREED";
                break;
            case 18:
                str = "ACCOUNT_DISABLED";
                break;
            case 19:
                str = "CAPTCHA";
                break;
            case 20:
                str = "ACCOUNT_DELETED";
                break;
            case 21:
                str = "SERVICE_DISABLED";
                break;
            case 22:
                str = "CHALLENGE_REQUIRED";
                break;
            case 23:
                str = "NEED_PERMISSION";
                break;
            case 24:
                str = "NEED_REMOTE_CONSENT";
                break;
            case 25:
                str = "INVALID_SCOPE";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                str = "USER_CANCEL";
                break;
            case 27:
                str = "PERMISSION_DENIED";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                str = "RESTRICTED_CLIENT";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                str = "INVALID_AUDIENCE";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                str = "UNREGISTERED_ON_API_CONSOLE";
                break;
            case 31:
                str = "THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED";
                break;
            case 32:
                str = "DM_INTERNAL_ERROR";
                break;
            case 33:
                str = "DM_SYNC_DISABLED";
                break;
            case 34:
                str = "DM_ADMIN_BLOCKED";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                str = "DM_ADMIN_PENDING_APPROVAL";
                break;
            case 36:
                str = "DM_STALE_SYNC_REQUIRED";
                break;
            case 37:
                str = "DM_DEACTIVATED";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                str = "DM_SCREENLOCK_REQUIRED";
                break;
            case 39:
                str = "DM_REQUIRED";
                break;
            case 40:
                str = "DEVICE_MANAGEMENT_REQUIRED";
                break;
            case 41:
                str = "ALREADY_HAS_GMAIL";
                break;
            case 42:
                str = "BAD_PASSWORD";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                break;
            case 44:
                str = "BAD_USERNAME";
                break;
            case 45:
                str = "DELETED_GMAIL";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                str = "EXISTING_USERNAME";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                str = "LOGIN_FAIL";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                str = "NOT_LOGGED_IN";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                str = "NO_GMAIL";
                break;
            case 50:
                str = "REQUEST_DENIED";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                str = "SERVER_ERROR";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                str = "USERNAME_UNAVAILABLE";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                str = "GPLUS_OTHER";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                str = "GPLUS_NICKNAME";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                str = "GPLUS_INVALID_CHAR";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                str = "GPLUS_INTERSTITIAL";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                str = "GPLUS_PROFILE_ERROR";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                str = "AUTH_SECURITY_ERROR";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                str = "AUTH_BINDING_ERROR";
                break;
            case 60:
                str = "ACCOUNT_NOT_PRESENT";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                str = "APP_SUSPENDED";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(" with method:getTokenWithDetails");
        p pVar = f38794c;
        pVar.p(sb2.toString(), new Object[0]);
        String str3 = (String) pVar.f5364c;
        if (!i.b(9, i10) && !i.b(19, i10) && !i.b(23, i10) && !i.b(24, i10) && !i.b(14, i10) && !i.b(26, i10) && !i.b(40, i10) && !i.b(32, i10) && !i.b(33, i10) && !i.b(34, i10) && !i.b(35, i10) && !i.b(36, i10) && !i.b(37, i10) && !i.b(39, i10) && !i.b(31, i10) && !i.b(38, i10)) {
            if (i.b(5, i10) || i.b(6, i10) || i.b(7, i10) || i.b(58, i10) || i.b(60, i10)) {
                throw new IOException(string);
            }
            throw new zs(string, 6);
        }
        r.c(context);
        ((d2) b2.f22796b.zza()).getClass();
        if (!((Boolean) d2.f22814a.b()).booleanValue()) {
            throw new UserRecoverableAuthException(1, intent, string);
        }
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(2, intent, string);
        }
        Object obj = i9.d.f42925d;
        if (i9.e.a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            Log.e(str3, pVar.e("Recovery PendingIntent is missing on current Gms version: 2147483647 for method: getTokenWithDetails. It should always be present on or above Gms version 2147483647. This indicates a bug in Gms implementation.", new Object[0]));
        }
        if (intent == null) {
            Log.e(str3, pVar.e(defpackage.e.o("no recovery Intent found with status=", string, " for method=getTokenWithDetails. This shouldn't happen"), new Object[0]));
        }
        throw new UserRecoverableAuthException(1, intent, string);
    }

    public static Object d(Context context, ComponentName componentName, d dVar) throws IOException {
        i9.a aVar = new i9.a();
        o0 o0VarA = o0.a(context);
        try {
            o0VarA.getClass();
            try {
                if (!o0VarA.b(new l0(componentName), aVar, "GoogleAuthUtil", null).b()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    Object objN = dVar.n(aVar.a());
                    o0VarA.c(new l0(componentName), aVar);
                    return objN;
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } catch (Throwable th2) {
                o0VarA.c(new l0(componentName), aVar);
                throw th2;
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", "SecurityException while bind to auth service: " + e11.getMessage());
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    public static Object e(Task task, String str) throws e, IOException {
        p pVar = f38794c;
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String strO = defpackage.e.o("Interrupted while waiting for the task of ", str, " to finish.");
            pVar.p(strO, new Object[0]);
            throw new IOException(strO, e10);
        } catch (CancellationException e11) {
            String strO2 = defpackage.e.o("Canceled while waiting for the task of ", str, " to finish.");
            pVar.p(strO2, new Object[0]);
            throw new IOException(strO2, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof e) {
                throw ((e) cause);
            }
            String strO3 = defpackage.e.o("Unable to get a result for ", str, " due to ExecutionException.");
            pVar.p(strO3, new Object[0]);
            throw new IOException(strO3, e12);
        }
    }

    public static void f(Context context) throws zs {
        try {
            i9.h.a(context.getApplicationContext(), 8400000);
        } catch (GooglePlayServicesIncorrectManifestValueException | f e10) {
            throw new zs(6, e10.getMessage(), e10);
        } catch (g e11) {
            throw new b(1, new Intent(e11.f42930a), e11.getMessage());
        }
    }

    public static void g(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void h(Account account) {
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (f38792a[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    public static boolean i(Context context) {
        if (i9.d.f42926e.c(context, 17895000) != 0) {
            return false;
        }
        ((g2) ((f2) e2.f22818b.f22819a.zza())).getClass();
        n0 n0VarK = ((a2) g2.f22825a.b()).k();
        String str = context.getApplicationInfo().packageName;
        Iterator it = n0VarK.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
