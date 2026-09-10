package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1zSDK implements AFa1cSDK {
    private boolean AFAdRevenueData;
    private final AFc1hSDK getMonetizationNetwork;
    Map<String, Object> getRevenue;

    public AFb1zSDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final boolean AFAdRevenueData() {
        if (!getCurrencyIso4217Code()) {
            return false;
        }
        Map<String, Object> map = this.getRevenue;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final void getCurrencyIso4217Code(boolean z) {
        this.AFAdRevenueData = z;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final Map<String, Object> getMediationNetwork() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final void getMonetizationNetwork() {
        Context context;
        if (getCurrencyIso4217Code() && (context = this.getMonetizationNetwork.getMonetizationNetwork) != null) {
            this.getRevenue = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1bSDK.5
                    private /* synthetic */ AFa1uSDK getCurrencyIso4217Code;
                    private /* synthetic */ Class getMonetizationNetwork;

                    public AnonymousClass5() {
                        cls = cls;
                        aFa1uSDK = aFa1zSDK;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1uSDK aFa1uSDK = aFa1uSDK;
                            if (aFa1uSDK != null) {
                                aFa1uSDK.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1uSDK aFa1uSDK2 = aFa1uSDK;
                            if (aFa1uSDK2 != null) {
                                aFa1uSDK2.getRevenue(string2, string3, string);
                            }
                        } else {
                            AFa1uSDK aFa1uSDK3 = aFa1uSDK;
                            if (aFa1uSDK3 != null) {
                                aFa1uSDK3.getRevenue(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK.getRevenue("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1zSDK.getRevenue(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1zSDK.getRevenue(e2.toString());
            } catch (NoSuchMethodException e3) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
                aFa1zSDK.getRevenue(e3.toString());
            } catch (InvocationTargetException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
                aFa1zSDK.getRevenue(e4.toString());
            }
        }
    }

    private boolean getCurrencyIso4217Code() {
        return this.AFAdRevenueData;
    }

    public static final class AFa1zSDK implements AFa1bSDK.AFa1uSDK {
        private /* synthetic */ long getMonetizationNetwork;

        public AFa1zSDK(long j) {
            this.getMonetizationNetwork = j;
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
        public final void getRevenue(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: " + str);
                Map<String, Object> map2 = AFb1zSDK.this.getRevenue;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFb1zSDK.this.getRevenue) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFb1zSDK aFb1zSDK = AFb1zSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFb1zSDK.getRevenue;
                    if (map3 != null) {
                        map3.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFb1zSDK.this.getRevenue;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.getMonetizationNetwork);
            Map<String, Object> map5 = AFb1zSDK.this.getRevenue;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
        public final void getRevenue(String str) {
            Map<String, Object> map = AFb1zSDK.this.getRevenue;
            if (map != null) {
                map.put("error", str);
            }
        }
    }
}
