package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import com.p004ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/internal/NativeProtocol;", "", "EffectTestAppInfo", "FBLiteAppInfo", "InstagramAppInfo", "KatanaAppInfo", "MessengerAppInfo", "NativeAppInfo", "ProtocolVersionQueryResult", "WakizashiAppInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class NativeProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f16360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f16361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f16362c;
    public static final Integer[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final NativeProtocol f16363e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/NativeProtocol$EffectTestAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class EffectTestAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String c() {
            return "com.facebook.arstudio.player";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/NativeProtocol$FBLiteAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class FBLiteAppInfo extends NativeAppInfo {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/NativeProtocol$FBLiteAppInfo$Companion;", "", "", "FACEBOOK_LITE_ACTIVITY", "Ljava/lang/String;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String c() {
            return "com.facebook.lite";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/NativeProtocol$InstagramAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class InstagramAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String b() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String c() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String d() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/NativeProtocol$KatanaAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class KatanaAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String c() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final void e() {
            if (FacebookSdk.b().getApplicationInfo().targetSdkVersion >= 30) {
                ArrayList arrayList = NativeProtocol.f16360a;
                Log.w(CrashShieldHandler.b(NativeProtocol.class) ? null : "com.facebook.internal.NativeProtocol", "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/NativeProtocol$MessengerAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class MessengerAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String c() {
            return "com.facebook.orca";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class NativeAppInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TreeSet f16364a;

        /* JADX WARN: Code duplicated, block: B:11:0x0010 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #1 {all -> 0x000e, blocks: (B:4:0x0003, B:6:0x0007, B:20:0x0027, B:22:0x002b, B:24:0x0031, B:11:0x0010, B:19:0x0025, B:18:0x0022, B:15:0x001c), top: B:31:0x0003, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final synchronized void a(boolean z2) {
            NativeProtocol nativeProtocol;
            TreeSet treeSetH;
            if (z2) {
                nativeProtocol = NativeProtocol.f16363e;
                treeSetH = null;
                if (!CrashShieldHandler.b(NativeProtocol.class)) {
                    treeSetH = nativeProtocol.h(this);
                }
                this.f16364a = treeSetH;
            } else {
                try {
                    TreeSet treeSet = this.f16364a;
                    if (treeSet == null || treeSet.isEmpty()) {
                        nativeProtocol = NativeProtocol.f16363e;
                        treeSetH = null;
                        if (!CrashShieldHandler.b(NativeProtocol.class)) {
                            try {
                                treeSetH = nativeProtocol.h(this);
                            } catch (Throwable th) {
                                CrashShieldHandler.a(NativeProtocol.class, th);
                            }
                        }
                        this.f16364a = treeSetH;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            TreeSet treeSet2 = this.f16364a;
            if (treeSet2 == null || treeSet2.isEmpty()) {
                e();
            }
        }

        public abstract String b();

        public abstract String c();

        public String d() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void e() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ProtocolVersionQueryResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NativeAppInfo f16365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16366b;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult$Companion;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/NativeProtocol$WakizashiAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class WakizashiAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public final String c() {
            return FbValidationUtils.DEBUG_FB_PACKAGE;
        }
    }

    static {
        ArrayList arrayListI;
        NativeProtocol nativeProtocol = new NativeProtocol();
        f16363e = nativeProtocol;
        f16360a = nativeProtocol.a();
        HashMap map = null;
        if (CrashShieldHandler.b(nativeProtocol)) {
            arrayListI = null;
        } else {
            try {
                arrayListI = CollectionsKt.i(new EffectTestAppInfo());
                arrayListI.addAll(nativeProtocol.a());
            } catch (Throwable th) {
                CrashShieldHandler.a(nativeProtocol, th);
                arrayListI = null;
            }
        }
        if (!CrashShieldHandler.b(nativeProtocol)) {
            try {
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessengerAppInfo());
                ArrayList arrayList2 = f16360a;
                map2.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList2);
                map2.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList2);
                map2.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList2);
                map2.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList2);
                map2.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
                map2.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
                map2.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayListI);
                map2.put("com.facebook.platform.action.request.SHARE_STORY", arrayList2);
                map = map2;
            } catch (Throwable th2) {
                CrashShieldHandler.a(nativeProtocol, th2);
            }
        }
        f16361b = map;
        f16362c = new AtomicBoolean(false);
        d = new Integer[]{20210906, 20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet treeSet, int i2, int[] iArr) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator itDescendingIterator = treeSet.descendingIterator();
                int iMax = -1;
                while (itDescendingIterator.hasNext()) {
                    Integer fbAppVersion = (Integer) itDescendingIterator.next();
                    Intrinsics.e(fbAppVersion, "fbAppVersion");
                    iMax = Math.max(iMax, fbAppVersion.intValue());
                    while (length >= 0 && iArr[length] > fbAppVersion.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (iArr[length] == fbAppVersion.intValue()) {
                        if (length % 2 != 0) {
                            break;
                        }
                        return Math.min(iMax, i2);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(NativeProtocol.class, th);
                return 0;
            }
        }
        return -1;
    }

    public static final Bundle c(FacebookException facebookException) {
        if (CrashShieldHandler.b(NativeProtocol.class) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (!(facebookException instanceof FacebookOperationCanceledException)) {
                return bundle;
            }
            bundle.putString("error_type", "UserCanceled");
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final Intent d(FragmentActivity context, String applicationId, Collection permissions, String e2e, boolean z2, DefaultAudience defaultAudience, String clientState, String authType, String str, boolean z3, boolean z4, boolean z5) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.f(context, "context");
            Intrinsics.f(applicationId, "applicationId");
            Intrinsics.f(permissions, "permissions");
            Intrinsics.f(e2e, "e2e");
            Intrinsics.f(defaultAudience, "defaultAudience");
            Intrinsics.f(clientState, "clientState");
            Intrinsics.f(authType, "authType");
            return t(context, f16363e.f(new FBLiteAppInfo(), applicationId, permissions, e2e, z2, defaultAudience, clientState, authType, false, str, z3, LoginTargetApp.FACEBOOK, z4, z5, ""));
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final Intent e(FragmentActivity context, String applicationId, Collection permissions, String e2e, boolean z2, DefaultAudience defaultAudience, String clientState, String authType, String str, boolean z3, boolean z4, boolean z5) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.f(context, "context");
            Intrinsics.f(applicationId, "applicationId");
            Intrinsics.f(permissions, "permissions");
            Intrinsics.f(e2e, "e2e");
            Intrinsics.f(defaultAudience, "defaultAudience");
            Intrinsics.f(clientState, "clientState");
            Intrinsics.f(authType, "authType");
            return t(context, f16363e.f(new InstagramAppInfo(), applicationId, permissions, e2e, z2, defaultAudience, clientState, authType, false, str, z3, LoginTargetApp.INSTAGRAM, z4, z5, ""));
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final Intent g(Intent requestIntent, Bundle bundle, FacebookException facebookException) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.f(requestIntent, "requestIntent");
            UUID uuidJ = j(requestIntent);
            if (uuidJ == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", o(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", uuidJ.toString());
            if (facebookException != null) {
                bundle2.putBundle("error", c(facebookException));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final Bundle i(Intent intent) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.f(intent, "intent");
            if (q(o(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final UUID j(Intent intent) {
        String stringExtra;
        if (CrashShieldHandler.b(NativeProtocol.class) || intent == null) {
            return null;
        }
        try {
            if (q(o(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final FacebookException k(Bundle bundle) {
        if (CrashShieldHandler.b(NativeProtocol.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final int m() {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return 0;
        }
        try {
            return d[0].intValue();
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return 0;
        }
    }

    public static final Bundle n(Intent intent) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.f(intent, "intent");
            return !q(o(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final int o(Intent intent) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return 0;
        }
        try {
            Intrinsics.f(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return 0;
        }
    }

    public static final boolean p(Intent resultIntent) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return false;
        }
        try {
            Intrinsics.f(resultIntent, "resultIntent");
            Bundle bundleI = i(resultIntent);
            return bundleI != null ? bundleI.containsKey("error") : resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return false;
        }
    }

    public static final boolean q(int i2) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return false;
        }
        try {
            return ArraysKt.k(d, Integer.valueOf(i2)) && i2 >= 20140701;
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return false;
        }
    }

    public static final void r(Intent intent, String str, String str2, int i2, Bundle bundle) {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return;
        }
        try {
            String strC = FacebookSdk.c();
            Validate.h();
            String str3 = FacebookSdk.d;
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i2).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", strC);
            if (!q(i2)) {
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!Utility.C(str3)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str3);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            Utility.O(bundle2, "app_name", str3);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            Intrinsics.e(intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle), "intent.putExtra(EXTRA_PR…OD_ARGS, methodArguments)");
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
        }
    }

    public static final void s() {
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return;
        }
        try {
            if (f16362c.compareAndSet(false, true)) {
                FacebookSdk.e().execute(NativeProtocol$updateAllAvailableProtocolVersionsAsync$1.X);
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
        }
    }

    public static final Intent t(Context context, Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        if (!CrashShieldHandler.b(NativeProtocol.class)) {
            try {
                Intrinsics.f(context, "context");
                if (intent != null && (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) != null) {
                    String str = resolveInfoResolveActivity.activityInfo.packageName;
                    Intrinsics.e(str, "resolveInfo.activityInfo.packageName");
                    if (FacebookSignatureValidator.a(context, str)) {
                        return intent;
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(NativeProtocol.class, th);
                return null;
            }
        }
        return null;
    }

    public final ArrayList a() {
        if (CrashShieldHandler.b(this)) {
            return null;
        }
        try {
            return CollectionsKt.i(new KatanaAppInfo(), new WakizashiAppInfo());
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return null;
        }
    }

    public final Intent f(NativeAppInfo nativeAppInfo, String str, Collection collection, String str2, boolean z2, DefaultAudience defaultAudience, String str3, String str4, boolean z3, String str5, boolean z4, LoginTargetApp loginTargetApp, boolean z5, boolean z6, String str6) {
        if (!CrashShieldHandler.b(this)) {
            try {
                String strB = nativeAppInfo.b();
                if (strB != null) {
                    Intent intentPutExtra = new Intent().setClassName(nativeAppInfo.c(), strB).putExtra("client_id", str);
                    Intrinsics.e(intentPutExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
                    HashSet hashSet = FacebookSdk.f15915a;
                    intentPutExtra.putExtra("facebook_sdk_version", "12.1.0");
                    if (!Utility.D(collection)) {
                        intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
                    }
                    if (!Utility.C(str2)) {
                        intentPutExtra.putExtra("e2e", str2);
                    }
                    intentPutExtra.putExtra("state", str3);
                    intentPutExtra.putExtra("response_type", nativeAppInfo.d());
                    intentPutExtra.putExtra("nonce", str6);
                    intentPutExtra.putExtra("return_scopes", a.g);
                    if (z2) {
                        intentPutExtra.putExtra("default_audience", defaultAudience.X);
                    }
                    intentPutExtra.putExtra("legacy_override", FacebookSdk.f());
                    intentPutExtra.putExtra("auth_type", str4);
                    if (z3) {
                        intentPutExtra.putExtra("fail_on_logged_out", true);
                    }
                    intentPutExtra.putExtra("messenger_page_id", str5);
                    intentPutExtra.putExtra("reset_messenger_state", z4);
                    if (z5) {
                        intentPutExtra.putExtra("fx_app", loginTargetApp.X);
                    }
                    if (z6) {
                        intentPutExtra.putExtra("skip_dedupe", true);
                    }
                    return intentPutExtra;
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final TreeSet h(NativeAppInfo nativeAppInfo) {
        Uri uri;
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (CrashShieldHandler.b(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = FacebookSdk.b().getContentResolver();
            String[] strArr = {"version"};
            if (CrashShieldHandler.b(this)) {
                uri = null;
            } else {
                try {
                    Uri uri2 = Uri.parse("content://" + nativeAppInfo.c() + ".provider.PlatformProvider/versions");
                    Intrinsics.e(uri2, "Uri.parse(CONTENT_SCHEME…ATFORM_PROVIDER_VERSIONS)");
                    uri = uri2;
                } catch (Throwable th2) {
                    CrashShieldHandler.a(this, th2);
                    uri = null;
                }
            }
            try {
                try {
                    providerInfoResolveContentProvider = FacebookSdk.b().getPackageManager().resolveContentProvider(nativeAppInfo.c().concat(".provider.PlatformProvider"), 0);
                } catch (RuntimeException e2) {
                    Log.e("com.facebook.internal.NativeProtocol", "Failed to query content resolver.", e2);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            try {
                                cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                            } catch (SecurityException unused) {
                                Log.e("com.facebook.internal.NativeProtocol", "Failed to query content resolver.");
                                cursorQuery = null;
                            }
                        } catch (NullPointerException unused2) {
                            Log.e("com.facebook.internal.NativeProtocol", "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (IllegalArgumentException unused3) {
                        Log.e("com.facebook.internal.NativeProtocol", "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th3) {
                                cursor = cursorQuery;
                                th = th3;
                                if (cursor == null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
        } catch (Throwable th5) {
            CrashShieldHandler.a(this, th5);
            return null;
        }
    }

    public final ProtocolVersionQueryResult l(List list, int[] iArr) {
        if (CrashShieldHandler.b(this)) {
            return null;
        }
        try {
            s();
            if (list == null) {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult();
                protocolVersionQueryResult.f16366b = -1;
                return protocolVersionQueryResult;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NativeAppInfo nativeAppInfo = (NativeAppInfo) it.next();
                TreeSet treeSet = nativeAppInfo.f16364a;
                if (treeSet == null || treeSet.isEmpty()) {
                    nativeAppInfo.a(false);
                }
                int iB = b(nativeAppInfo.f16364a, m(), iArr);
                if (iB != -1) {
                    ProtocolVersionQueryResult protocolVersionQueryResult2 = new ProtocolVersionQueryResult();
                    protocolVersionQueryResult2.f16365a = nativeAppInfo;
                    protocolVersionQueryResult2.f16366b = iB;
                    return protocolVersionQueryResult2;
                }
            }
            ProtocolVersionQueryResult protocolVersionQueryResult3 = new ProtocolVersionQueryResult();
            protocolVersionQueryResult3.f16366b = -1;
            return protocolVersionQueryResult3;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return null;
        }
    }
}
