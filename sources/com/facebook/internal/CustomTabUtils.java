package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/CustomTabUtils;", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f16268a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static final String a() {
        if (!CrashShieldHandler.b(CustomTabUtils.class)) {
            try {
                Context contextB = FacebookSdk.b();
                List<ResolveInfo> listQueryIntentServices = contextB.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (listQueryIntentServices != null) {
                    HashSet hashSetL = ArraysKt.L(f16268a);
                    Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                    while (it.hasNext()) {
                        ServiceInfo serviceInfo = it.next().serviceInfo;
                        if (serviceInfo != null && hashSetL.contains(serviceInfo.packageName)) {
                            return serviceInfo.packageName;
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(CustomTabUtils.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String b() {
        if (CrashShieldHandler.b(CustomTabUtils.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + FacebookSdk.b().getPackageName();
        } catch (Throwable th) {
            CrashShieldHandler.a(CustomTabUtils.class, th);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (CrashShieldHandler.b(CustomTabUtils.class)) {
            return null;
        }
        try {
            Intrinsics.f(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            if (Validate.a(FacebookSdk.b(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return Validate.a(FacebookSdk.b(), b()) ? b() : "";
        } catch (Throwable th) {
            CrashShieldHandler.a(CustomTabUtils.class, th);
            return null;
        }
    }
}
