package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.UserSettingsManager;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.thinkup.core.common.om.n;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers;", "", "Companion", "GoogleAdInfo", "GoogleAdServiceConnection", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AttributionIdentifiers {
    public static AttributionIdentifiers f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16257c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16258e;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$Companion;", "", "", "ANDROID_ID_COLUMN_NAME", "Ljava/lang/String;", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "", "CONNECTION_RESULT_SUCCESS", "I", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "J", "LIMIT_TRACKING_COLUMN_NAME", "TAG", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:104:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:117:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:118:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:23:0x008a  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ea A[Catch: all -> 0x0100, Exception -> 0x0104, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0121 A[Catch: all -> 0x0100, Exception -> 0x0104, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:56:0x012e A[Catch: all -> 0x0100, Exception -> 0x0104, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0136 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:59:0x0138 A[Catch: all -> 0x0100, Exception -> 0x0104, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0145 A[Catch: all -> 0x0100, Exception -> 0x0104, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0153 A[Catch: all -> 0x0100, Exception -> 0x0104, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:66:0x015c  */
        /* JADX WARN: Code duplicated, block: B:68:0x015f A[Catch: all -> 0x0100, Exception -> 0x0104, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0163 A[Catch: all -> 0x0100, Exception -> 0x0104, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:71:0x016d A[Catch: all -> 0x0100, Exception -> 0x0104, TRY_LEAVE, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        /* JADX WARN: Code duplicated, block: B:75:0x0180  */
        /* JADX WARN: Code duplicated, block: B:76:0x0181 A[Catch: all -> 0x01b4, Exception -> 0x01b6, TryCatch #8 {Exception -> 0x01b6, all -> 0x01b4, blocks: (B:73:0x017a, B:76:0x0181, B:79:0x0197, B:81:0x019d, B:90:0x01c4), top: B:117:0x017a }] */
        /* JADX WARN: Code duplicated, block: B:90:0x01c4 A[Catch: all -> 0x01b4, Exception -> 0x01b6, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x01b6, all -> 0x01b4, blocks: (B:73:0x017a, B:76:0x0181, B:79:0x0197, B:81:0x019d, B:90:0x01c4), top: B:117:0x017a }] */
        /* JADX WARN: Code duplicated, block: B:92:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:94:0x01d2 A[Catch: all -> 0x0100, Exception -> 0x0104, TRY_ENTER, TryCatch #9 {Exception -> 0x0104, all -> 0x0100, blocks: (B:40:0x00dc, B:42:0x00ea, B:44:0x00ee, B:52:0x0107, B:54:0x0121, B:56:0x012e, B:63:0x014d, B:65:0x0153, B:68:0x015f, B:70:0x0163, B:71:0x016d, B:59:0x0138, B:61:0x0145, B:94:0x01d2, B:95:0x01d9), top: B:116:0x00dc }] */
        public static AttributionIdentifiers a(Context context) throws Throwable {
            AttributionIdentifiers attributionIdentifiers;
            Exception exc;
            Cursor cursor;
            Throwable th;
            AttributionIdentifiers attributionIdentifiers2;
            String[] strArr;
            ProviderInfo providerInfoResolveContentProvider;
            ProviderInfo providerInfoResolveContentProvider2;
            Uri uri;
            String str;
            Uri uri2;
            PackageManager packageManager;
            String installerPackageName;
            Cursor cursorQuery;
            int columnIndex;
            int columnIndex2;
            String str2;
            Method methodS;
            Object objY;
            Intrinsics.f(context, "context");
            Cursor cursor2 = null;
            try {
                Method methodS2 = Utility.s("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
                if (methodS2 != null) {
                    Object objY2 = Utility.y(null, methodS2, context);
                    if (!(objY2 instanceof Integer) || !Intrinsics.a(objY2, 0) || (methodS = Utility.s("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objY = Utility.y(null, methodS, context)) == null) {
                        attributionIdentifiers = null;
                    } else {
                        Method methodR = Utility.r(objY.getClass(), "getId", new Class[0]);
                        Method methodR2 = Utility.r(objY.getClass(), d9.i.M, new Class[0]);
                        if (methodR == null || methodR2 == null) {
                            attributionIdentifiers = null;
                        } else {
                            attributionIdentifiers = new AttributionIdentifiers();
                            attributionIdentifiers.f16255a = (String) Utility.y(objY, methodR, new Object[0]);
                            Boolean bool = (Boolean) Utility.y(objY, methodR2, new Object[0]);
                            attributionIdentifiers.f16258e = bool != null ? bool.booleanValue() : false;
                        }
                    }
                } else {
                    attributionIdentifiers = null;
                }
            } catch (Exception unused) {
                HashSet hashSet = FacebookSdk.f15915a;
            }
            if (attributionIdentifiers == null) {
                GoogleAdServiceConnection googleAdServiceConnection = new GoogleAdServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, googleAdServiceConnection, 1)) {
                        try {
                            try {
                                GoogleAdInfo googleAdInfo = new GoogleAdInfo(googleAdServiceConnection.a());
                                AttributionIdentifiers attributionIdentifiers3 = new AttributionIdentifiers();
                                attributionIdentifiers3.f16255a = googleAdInfo.b0();
                                attributionIdentifiers3.f16258e = googleAdInfo.c0();
                                context.unbindService(googleAdServiceConnection);
                                attributionIdentifiers = attributionIdentifiers3;
                            } catch (Throwable th2) {
                                context.unbindService(googleAdServiceConnection);
                                throw th2;
                            }
                        } catch (Exception unused2) {
                            HashSet hashSet2 = FacebookSdk.f15915a;
                            context.unbindService(googleAdServiceConnection);
                            attributionIdentifiers = null;
                            if (attributionIdentifiers == null) {
                                attributionIdentifiers = new AttributionIdentifiers();
                            }
                            if (!Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                                throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                            }
                            attributionIdentifiers2 = AttributionIdentifiers.f;
                            if (attributionIdentifiers2 == null) {
                            }
                            strArr = new String[]{fl.SESSION_HISTORY_KEY_AD_ID, "androidid", "limit_tracking"};
                            providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                            providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                            if (providerInfoResolveContentProvider != null) {
                                str2 = providerInfoResolveContentProvider.packageName;
                                Intrinsics.e(str2, "contentProviderInfo.packageName");
                                if (FacebookSignatureValidator.a(context, str2)) {
                                    uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                } else {
                                    if (providerInfoResolveContentProvider2 != null) {
                                        str = providerInfoResolveContentProvider2.packageName;
                                        Intrinsics.e(str, "wakizashiProviderInfo.packageName");
                                        if (FacebookSignatureValidator.a(context, str)) {
                                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                        }
                                    }
                                    uri = null;
                                }
                                uri = uri2;
                            } else {
                                if (providerInfoResolveContentProvider2 != null) {
                                    str = providerInfoResolveContentProvider2.packageName;
                                    Intrinsics.e(str, "wakizashiProviderInfo.packageName");
                                    if (FacebookSignatureValidator.a(context, str)) {
                                        uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                        uri = uri2;
                                    }
                                }
                                uri = null;
                            }
                            packageManager = context.getPackageManager();
                            if (packageManager != null) {
                                installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                            } else {
                                installerPackageName = null;
                            }
                            if (installerPackageName != null) {
                                attributionIdentifiers.d = installerPackageName;
                            }
                            if (uri == null) {
                                attributionIdentifiers.f16256b = System.currentTimeMillis();
                                AttributionIdentifiers.f = attributionIdentifiers;
                            } else {
                                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                                if (cursorQuery == null) {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            int columnIndex3 = cursorQuery.getColumnIndex(fl.SESSION_HISTORY_KEY_AD_ID);
                                            columnIndex = cursorQuery.getColumnIndex("androidid");
                                            columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                            attributionIdentifiers.f16257c = cursorQuery.getString(columnIndex3);
                                            if (columnIndex > 0) {
                                                attributionIdentifiers.f16255a = cursorQuery.getString(columnIndex);
                                                attributionIdentifiers.f16258e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                            }
                                            cursorQuery.close();
                                            attributionIdentifiers.f16256b = System.currentTimeMillis();
                                            AttributionIdentifiers.f = attributionIdentifiers;
                                        } else {
                                            attributionIdentifiers.f16256b = System.currentTimeMillis();
                                            AttributionIdentifiers.f = attributionIdentifiers;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                        }
                                    } catch (Exception e2) {
                                        cursor = cursorQuery;
                                        exc = e2;
                                        try {
                                            exc.toString();
                                            HashSet hashSet3 = FacebookSdk.f15915a;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            return null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor2 = cursorQuery;
                                        th = th;
                                        if (cursor2 != null) {
                                            throw th;
                                        }
                                        cursor2.close();
                                        throw th;
                                    }
                                } else {
                                    attributionIdentifiers.f16256b = System.currentTimeMillis();
                                    AttributionIdentifiers.f = attributionIdentifiers;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                            }
                            return attributionIdentifiers;
                        }
                    } else {
                        attributionIdentifiers = null;
                    }
                } catch (SecurityException unused3) {
                }
                if (attributionIdentifiers == null) {
                    attributionIdentifiers = new AttributionIdentifiers();
                }
            }
            try {
                if (!Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
                attributionIdentifiers2 = AttributionIdentifiers.f;
                if (attributionIdentifiers2 == null && System.currentTimeMillis() - attributionIdentifiers2.f16256b < n.m) {
                    return attributionIdentifiers2;
                }
                strArr = new String[]{fl.SESSION_HISTORY_KEY_AD_ID, "androidid", "limit_tracking"};
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if (providerInfoResolveContentProvider != null) {
                    str2 = providerInfoResolveContentProvider.packageName;
                    Intrinsics.e(str2, "contentProviderInfo.packageName");
                    if (FacebookSignatureValidator.a(context, str2)) {
                        uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                    } else {
                        if (providerInfoResolveContentProvider2 != null) {
                            str = providerInfoResolveContentProvider2.packageName;
                            Intrinsics.e(str, "wakizashiProviderInfo.packageName");
                            if (FacebookSignatureValidator.a(context, str)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            }
                        }
                        uri = null;
                    }
                    uri = uri2;
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        str = providerInfoResolveContentProvider2.packageName;
                        Intrinsics.e(str, "wakizashiProviderInfo.packageName");
                        if (FacebookSignatureValidator.a(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = uri2;
                        }
                    }
                    uri = null;
                }
                packageManager = context.getPackageManager();
                if (packageManager != null) {
                    installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                } else {
                    installerPackageName = null;
                }
                if (installerPackageName != null) {
                    attributionIdentifiers.d = installerPackageName;
                }
                if (uri == null) {
                    attributionIdentifiers.f16256b = System.currentTimeMillis();
                    AttributionIdentifiers.f = attributionIdentifiers;
                } else {
                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery == null) {
                        attributionIdentifiers.f16256b = System.currentTimeMillis();
                        AttributionIdentifiers.f = attributionIdentifiers;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else if (cursorQuery.moveToFirst()) {
                        attributionIdentifiers.f16256b = System.currentTimeMillis();
                        AttributionIdentifiers.f = attributionIdentifiers;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else {
                        int columnIndex4 = cursorQuery.getColumnIndex(fl.SESSION_HISTORY_KEY_AD_ID);
                        columnIndex = cursorQuery.getColumnIndex("androidid");
                        columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                        attributionIdentifiers.f16257c = cursorQuery.getString(columnIndex4);
                        if (columnIndex > 0 && columnIndex2 > 0 && attributionIdentifiers.a() == null) {
                            attributionIdentifiers.f16255a = cursorQuery.getString(columnIndex);
                            attributionIdentifiers.f16258e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                        }
                        cursorQuery.close();
                        attributionIdentifiers.f16256b = System.currentTimeMillis();
                        AttributionIdentifiers.f = attributionIdentifiers;
                    }
                }
                return attributionIdentifiers;
            } catch (Exception e3) {
                exc = e3;
                cursor = null;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;", "Landroid/os/IInterface;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class GoogleAdInfo implements IInterface {
        public final IBinder X;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo$Companion;", "", "", "FIRST_TRANSACTION_CODE", "I", "SECOND_TRANSACTION_CODE", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }

        public GoogleAdInfo(IBinder iBinder) {
            this.X = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.X;
        }

        public final String b0() {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.e(parcelObtain, "Parcel.obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.e(parcelObtain2, "Parcel.obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.X.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean c0() {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.e(parcelObtain, "Parcel.obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.e(parcelObtain2, "Parcel.obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.X.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;", "Landroid/content/ServiceConnection;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class GoogleAdServiceConnection implements ServiceConnection {
        public final AtomicBoolean X = new AtomicBoolean(false);

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final LinkedBlockingDeque f16259Y = new LinkedBlockingDeque();

        public final IBinder a() throws InterruptedException {
            if (this.X.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object objTake = this.f16259Y.take();
            Intrinsics.e(objTake, "queue.take()");
            return (IBinder) objTake;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f16259Y.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final String a() {
        if (FacebookSdk.f15923p.get() && UserSettingsManager.b()) {
            return this.f16255a;
        }
        return null;
    }
}
