package q7;

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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f48798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f48799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f48800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Integer[] f48801d;

    static {
        z zVar = new z();
        f48798a = zVar;
        f48799b = zVar.a();
        ArrayList arrayList = null;
        if (!v7.a.b(zVar)) {
            try {
                ArrayList arrayListM = xj.o.M(new y(0));
                arrayListM.addAll(zVar.a());
                arrayList = arrayListM;
            } catch (Throwable th2) {
                v7.a.a(zVar, th2);
            }
        }
        z zVar2 = f48798a;
        if (!v7.a.b(zVar2)) {
            try {
                HashMap map = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new y(3));
                ArrayList arrayList3 = f48799b;
                map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                map.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th3) {
                v7.a.a(zVar2, th3);
            }
        }
        f48800c = new AtomicBoolean(false);
        f48801d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet treeSet, int i10, int[] iArr) {
        if (v7.a.b(z.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator itDescendingIterator = treeSet.descendingIterator();
                int iMax = -1;
                while (itDescendingIterator.hasNext()) {
                    Integer fbAppVersion = (Integer) itDescendingIterator.next();
                    kotlin.jvm.internal.n.e(fbAppVersion, "fbAppVersion");
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
                        return Math.min(iMax, i10);
                    }
                }
            } catch (Throwable th2) {
                v7.a.a(z.class, th2);
                return 0;
            }
        }
        return -1;
    }

    public static /* synthetic */ Intent d(y yVar, String str, HashSet hashSet, String str2, boolean z10, int i10, String str3, String str4, boolean z11, String str5, boolean z12, int i11, boolean z13, boolean z14, String str6, String str7, String str8, boolean z15, String str9, int i12) {
        z zVar = f48798a;
        if (v7.a.b(z.class)) {
            return null;
        }
        try {
            return zVar.c(yVar, str, hashSet, str2, z10, i10, str3, str4, z11, str5, z12, i11, z13, z14, str6, str7, str8, (i12 & 524288) != 0 ? false : z15, (i12 & 2097152) != 0 ? null : str9);
        } catch (Throwable th2) {
            v7.a.a(z.class, th2);
            return null;
        }
    }

    public static final Intent e(Context context) {
        if (!v7.a.b(z.class)) {
            try {
                kotlin.jvm.internal.n.f(context, "context");
                Iterator it = f48799b.iterator();
                while (it.hasNext()) {
                    Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((y) it.next()).b()).addCategory("android.intent.category.DEFAULT");
                    if (v7.a.b(z.class) || intentAddCategory == null) {
                        intentAddCategory = null;
                    } else {
                        try {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                            if (resolveInfoResolveService != null) {
                                String str = resolveInfoResolveService.serviceInfo.packageName;
                                kotlin.jvm.internal.n.e(str, "resolveInfo.serviceInfo.packageName");
                                if (!k.a(context, str)) {
                                }
                            }
                        } catch (Throwable th2) {
                            v7.a.a(z.class, th2);
                        }
                        intentAddCategory = null;
                    }
                    if (intentAddCategory != null) {
                        return intentAddCategory;
                    }
                }
            } catch (Throwable th3) {
                v7.a.a(z.class, th3);
                return null;
            }
        }
        return null;
    }

    public static final Intent f(Intent intent, Bundle bundle, l7.n nVar) {
        Bundle bundle2;
        if (!v7.a.b(z.class)) {
            try {
                UUID uuidH = h(intent);
                if (uuidH != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", k(intent));
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("action_id", uuidH.toString());
                    if (nVar != null) {
                        if (v7.a.b(z.class)) {
                            bundle2 = null;
                            bundle3.putBundle("error", bundle2);
                        } else {
                            try {
                                bundle2 = new Bundle();
                                bundle2.putString("error_description", nVar.toString());
                                if (nVar instanceof l7.p) {
                                    bundle2.putString("error_type", "UserCanceled");
                                }
                            } catch (Throwable th2) {
                                v7.a.a(z.class, th2);
                                bundle2 = null;
                            }
                            bundle3.putBundle("error", bundle2);
                        }
                    }
                    intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle3);
                    if (bundle != null) {
                        intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                    }
                    return intent2;
                }
            } catch (Throwable th3) {
                v7.a.a(z.class, th3);
                return null;
            }
        }
        return null;
    }

    public static final UUID h(Intent intent) {
        String stringExtra;
        if (!v7.a.b(z.class)) {
            try {
                if (l(k(intent))) {
                    Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                    stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                } else {
                    stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                }
                if (stringExtra != null) {
                    try {
                        return UUID.fromString(stringExtra);
                    } catch (IllegalArgumentException e10) {
                        e0.C("q7.z", "Failed to parse call ID from string: ".concat(stringExtra), e10);
                    }
                }
            } catch (Throwable th2) {
                v7.a.a(z.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final Bundle j(Intent intent) {
        if (v7.a.b(z.class)) {
            return null;
        }
        try {
            return !l(k(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            v7.a.a(z.class, th2);
            return null;
        }
    }

    public static final int k(Intent intent) {
        if (v7.a.b(z.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            v7.a.a(z.class, th2);
            return 0;
        }
    }

    public static final boolean l(int i10) {
        if (v7.a.b(z.class)) {
            return false;
        }
        try {
            return xj.k.c0(f48801d, Integer.valueOf(i10)) && i10 >= 20140701;
        } catch (Throwable th2) {
            v7.a.a(z.class, th2);
            return false;
        }
    }

    public static final void m() {
        if (v7.a.b(z.class)) {
            return;
        }
        try {
            if (f48800c.compareAndSet(false, true)) {
                l7.s.d().execute(new com.applovin.impl.sdk.x(18));
            }
        } catch (Throwable th2) {
            v7.a.a(z.class, th2);
        }
    }

    public final ArrayList a() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            return xj.o.M(new y(2), new y(4));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final Intent c(y yVar, String str, Collection collection, String str2, boolean z10, int i10, String str3, String str4, boolean z11, String str5, boolean z12, int i11, boolean z13, boolean z14, String str6, String str7, String str8, boolean z15, String str9) {
        String str10;
        String strConcat;
        if (!v7.a.b(this)) {
            try {
                String str11 = "com.facebook.katana.ProxyAuth";
                switch (yVar.f48797b) {
                    case 0:
                    case 3:
                        str11 = null;
                        break;
                    case 1:
                        str11 = "com.instagram.platform.AppAuthorizeActivity";
                        break;
                }
                if (str11 != null) {
                    Intent intentPutExtra = new Intent().setClassName(yVar.b(), str11).putExtra("client_id", str);
                    kotlin.jvm.internal.n.e(intentPutExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
                    l7.s sVar = l7.s.f45212a;
                    intentPutExtra.putExtra("facebook_sdk_version", "18.3.0");
                    if (!(collection == null || collection.isEmpty())) {
                        intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
                    }
                    if (!e0.w(str2)) {
                        intentPutExtra.putExtra("e2e", str2);
                    }
                    intentPutExtra.putExtra("state", str3);
                    switch (yVar.f48797b) {
                        case 1:
                            str10 = "token,signed_request,graph_domain,granted_scopes";
                            break;
                        default:
                            str10 = "id_token,token,signed_request,graph_domain";
                            break;
                    }
                    intentPutExtra.putExtra("response_type", str10);
                    intentPutExtra.putExtra("nonce", str6);
                    intentPutExtra.putExtra("return_scopes", com.ironsource.mediationsdk.metadata.a.f29610g);
                    if (z10) {
                        intentPutExtra.putExtra("default_audience", wi.d.d(i10));
                    }
                    intentPutExtra.putExtra("legacy_override", l7.s.e());
                    intentPutExtra.putExtra("auth_type", str4);
                    if (z11) {
                        intentPutExtra.putExtra("fail_on_logged_out", true);
                    }
                    intentPutExtra.putExtra("messenger_page_id", str5);
                    intentPutExtra.putExtra("reset_messenger_state", z12);
                    if (z13) {
                        intentPutExtra.putExtra("fx_app", wi.d.e(i11));
                    }
                    if (z14) {
                        intentPutExtra.putExtra("skip_dedupe", true);
                    }
                    if (z15) {
                        intentPutExtra.putExtra("force_confirmation", true);
                    }
                    if (str7 != null && str7.length() != 0) {
                        intentPutExtra.putExtra("https_redirect_uri", str7);
                    } else if (str8 != null && str8.length() != 0) {
                        if (v7.a.b(this)) {
                            strConcat = null;
                            intentPutExtra.putExtra("intent_uri_package_target", strConcat);
                        } else {
                            try {
                                strConcat = "intent://".concat(str8);
                            } catch (Throwable th2) {
                                v7.a.a(this, th2);
                                strConcat = null;
                            }
                            intentPutExtra.putExtra("intent_uri_package_target", strConcat);
                        }
                    }
                    if (str9 != null && str9.length() != 0) {
                        intentPutExtra.putExtra("android_sso_context", str9);
                    }
                    return intentPutExtra;
                }
            } catch (Throwable th3) {
                v7.a.a(this, th3);
                return null;
            }
        }
        return null;
    }

    public final TreeSet g(y yVar) {
        Uri uri;
        Throwable th2;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = l7.s.b().getContentResolver();
            String[] strArr = {"version"};
            if (v7.a.b(this)) {
                uri = null;
            } else {
                try {
                    Uri uri2 = Uri.parse("content://" + yVar.b() + ".provider.PlatformProvider/versions");
                    kotlin.jvm.internal.n.e(uri2, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
                    uri = uri2;
                } catch (Throwable th3) {
                    v7.a.a(this, th3);
                    uri = null;
                }
            }
            try {
                try {
                    providerInfoResolveContentProvider = l7.s.b().getPackageManager().resolveContentProvider(yVar.b().concat(".provider.PlatformProvider"), 0);
                } catch (RuntimeException e10) {
                    Log.e("q7.z", "Failed to query content resolver.", e10);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            try {
                                cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                            } catch (SecurityException unused) {
                                Log.e("q7.z", "Failed to query content resolver.");
                                cursorQuery = null;
                            }
                        } catch (NullPointerException unused2) {
                            Log.e("q7.z", "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (IllegalArgumentException unused3) {
                        Log.e("q7.z", "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th4) {
                                cursor = cursorQuery;
                                th2 = th4;
                                if (cursor == null) {
                                    throw th2;
                                }
                                cursor.close();
                                throw th2;
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
            } catch (Throwable th5) {
                th2 = th5;
                cursor = null;
            }
        } catch (Throwable th6) {
            v7.a.a(this, th6);
            return null;
        }
    }

    public final d5.o i(List list, int[] iArr) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            m();
            if (list == null) {
                d5.o oVar = new d5.o(14, false);
                oVar.f38703b = -1;
                return oVar;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                TreeSet treeSet = yVar.f48796a;
                int iIntValue = 0;
                if (treeSet == null || treeSet.isEmpty()) {
                    yVar.a(false);
                }
                TreeSet treeSet2 = yVar.f48796a;
                if (!v7.a.b(z.class)) {
                    try {
                        iIntValue = f48801d[0].intValue();
                    } catch (Throwable th2) {
                        v7.a.a(z.class, th2);
                    }
                }
                int iB = b(treeSet2, iIntValue, iArr);
                if (iB != -1) {
                    d5.o oVar2 = new d5.o(14, false);
                    oVar2.f38703b = iB;
                    return oVar2;
                }
            }
            d5.o oVar3 = new d5.o(14, false);
            oVar3.f38703b = -1;
            return oVar3;
        } catch (Throwable th3) {
            v7.a.a(this, th3);
            return null;
        }
    }
}
