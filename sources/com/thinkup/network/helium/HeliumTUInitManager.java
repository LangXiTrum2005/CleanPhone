package com.thinkup.network.helium;

import android.content.Context;
import com.chartboost.heliumsdk.HeliumInitializationOptions;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.ad.HeliumAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.ooo.m.m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class HeliumTUInitManager extends TUInitMediation {
    private static volatile HeliumTUInitManager o0;
    boolean o = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<String, HeliumAd> f42576n = new ConcurrentHashMap<>();
    boolean m = false;

    private HeliumTUInitManager() {
    }

    public static HeliumTUInitManager getInstance() {
        if (o0 == null) {
            synchronized (HeliumTUInitManager.class) {
                try {
                    if (o0 == null) {
                        o0 = new HeliumTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    private HeliumAd m(String str) {
        return this.f42576n.get(str);
    }

    private void o(String str, HeliumAd heliumAd) {
        this.f42576n.put(str, heliumAd);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return mo.m;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Helium";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.chartboost.heliumsdk.HeliumSdk";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return HeliumSdk.getVersion();
    }

    public void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        HeliumSdk.setUserHasGivenConsent(z2);
        return true;
    }

    private void m() {
        synchronized (this) {
            notifyAll();
        }
    }

    private void o(String str) {
        this.f42576n.remove(str);
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public void initSDK(final Context context, final Map<String, Object> map, final MediationInitCallback mediationInitCallback) {
        m.o().o(new Runnable() { // from class: com.thinkup.network.helium.HeliumTUInitManager.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (HeliumTUInitManager.this) {
                    try {
                        try {
                            HeliumTUInitManager heliumTUInitManager = HeliumTUInitManager.this;
                            if (heliumTUInitManager.o) {
                                HeliumTUInitManager.o(heliumTUInitManager);
                            }
                            HeliumTUInitManager heliumTUInitManager2 = HeliumTUInitManager.this;
                            if (heliumTUInitManager2.m) {
                                MediationInitCallback mediationInitCallback2 = mediationInitCallback;
                                if (mediationInitCallback2 != null) {
                                    mediationInitCallback2.onSuccess();
                                }
                                return;
                            }
                            heliumTUInitManager2.o = true;
                            String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
                            String stringFromMap2 = TUInitMediation.getStringFromMap(map, "app_signature");
                            try {
                                if (TUInitMediation.getBooleanFromMap(map, "app_ccpa_switch")) {
                                    HeliumSdk.setCCPAConsent(false);
                                }
                            } catch (Throwable unused) {
                            }
                            try {
                                if (TUInitMediation.getBooleanFromMap(map, "app_coppa_switch")) {
                                    HeliumSdk.setSubjectToCoppa(true);
                                }
                            } catch (Throwable unused2) {
                            }
                            HeliumSdk.start(context, stringFromMap, stringFromMap2, new HeliumInitializationOptions(), new HeliumSdk.HeliumSdkListener() { // from class: com.thinkup.network.helium.HeliumTUInitManager.1.1
                                @Override // com.chartboost.heliumsdk.HeliumSdk.HeliumSdkListener
                                public final void didInitialize(Error error) {
                                    HeliumTUInitManager heliumTUInitManager3 = HeliumTUInitManager.this;
                                    heliumTUInitManager3.o = false;
                                    heliumTUInitManager3.m = error == null;
                                    try {
                                        HeliumTUInitManager.m(heliumTUInitManager3);
                                    } catch (Exception unused3) {
                                    }
                                    if (error == null) {
                                        MediationInitCallback mediationInitCallback3 = mediationInitCallback;
                                        if (mediationInitCallback3 != null) {
                                            mediationInitCallback3.onSuccess();
                                            return;
                                        }
                                        return;
                                    }
                                    MediationInitCallback mediationInitCallback4 = mediationInitCallback;
                                    if (mediationInitCallback4 != null) {
                                        mediationInitCallback4.onFail(error.getMessage());
                                    }
                                }
                            });
                        } catch (Exception e2) {
                            MediationInitCallback mediationInitCallback3 = mediationInitCallback;
                            if (mediationInitCallback3 != null) {
                                mediationInitCallback3.onFail(e2.getMessage());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    private void o() {
        synchronized (this) {
            wait();
        }
    }

    public static /* synthetic */ void m(HeliumTUInitManager heliumTUInitManager) {
        synchronized (heliumTUInitManager) {
            heliumTUInitManager.notifyAll();
        }
    }

    public static /* synthetic */ void o(HeliumTUInitManager heliumTUInitManager) {
        synchronized (heliumTUInitManager) {
            heliumTUInitManager.wait();
        }
    }
}
