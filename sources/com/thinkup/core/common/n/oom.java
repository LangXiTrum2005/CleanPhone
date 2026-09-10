package com.thinkup.core.common.n;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.activity.TUGdprAuthActivity;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.NetTrafficeCallback;
import com.thinkup.core.api.TUGDPRAuthCallback;
import com.thinkup.core.common.ooo.onm;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oom {
    private static volatile oom oo;
    Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41934n;
    private final String o0 = "oom";
    final int o = -100;
    private ConcurrentHashMap<Integer, Boolean> om = new ConcurrentHashMap<>(5);

    private oom(Context context) {
        this.f41934n = 2;
        if (context != null) {
            this.m = context.getApplicationContext();
        }
        this.f41934n = onm.m(this.m, oo0.m.o, "UPLOAD_DATA_LEVEL", 2);
    }

    public final boolean n() {
        com.thinkup.core.oo.m mVarH = a.h(com.thinkup.core.oo.o0.o(this.m));
        if (mVarH == null || mVarH.mom()) {
            return this.f41934n != 1;
        }
        if (this.f41934n == 2) {
            return mVarH.non() == 0;
        }
        if (mVarH.noo() == 1) {
            return mVarH.no0() == 0;
        }
        return this.f41934n == 0 || mVarH.non() == 0;
    }

    public final boolean o0() {
        return onm.m(this.m, oo0.m.o, "EU_INFO", -100) == 1;
    }

    public static oom o(Context context) {
        if (oo == null) {
            synchronized (oom.class) {
                try {
                    if (oo == null) {
                        oo = new oom(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oo;
    }

    public final boolean m() {
        try {
            com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(this.m).m(o0n.m().o00());
            if (mVarM != null && !mVarM.mom()) {
                if (mVarM.non() == 0) {
                    return true;
                }
                int iNo0 = this.f41934n;
                if (mVarM.noo() == 1) {
                    iNo0 = mVarM.no0();
                }
                return iNo0 == 0;
            }
            return this.f41934n != 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void o(int i2) {
        this.f41934n = i2;
        onm.o(this.m, oo0.m.o, "UPLOAD_DATA_LEVEL", i2);
    }

    public final boolean m(int i2) {
        if (com.thinkup.core.common.mo.n.o().m()) {
            return com.thinkup.core.common.mo.n.o().o(this.m, i2);
        }
        return n();
    }

    public final int o() {
        return this.f41934n;
    }

    public final void o(final Context context, final TUGDPRAuthCallback tUGDPRAuthCallback) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.n.oom.1
            @Override // java.lang.Runnable
            public final void run() {
                TUGdprAuthActivity.mCallback = tUGDPRAuthCallback;
                Intent intent = new Intent(context, (Class<?>) TUGdprAuthActivity.class);
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
        });
    }

    public final boolean m(int i2, boolean z2) {
        return this.om.get(Integer.valueOf(i2)) == null || this.om.get(Integer.valueOf(i2)).booleanValue() != z2;
    }

    public final void o(final NetTrafficeCallback netTrafficeCallback) {
        int iM = onm.m(this.m, oo0.m.o, "EU_INFO", -100);
        if (iM == -100) {
            new com.thinkup.core.common.n0.o00().o(0, new com.thinkup.core.common.n0.o0o() { // from class: com.thinkup.core.common.n.oom.2
                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadCanceled(int i2) {
                }

                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadError(int i2, String str, AdError adError) {
                    NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                    if (netTrafficeCallback2 != null) {
                        netTrafficeCallback2.onErrorCallback(adError.printStackTrace());
                    }
                }

                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadFinish(int i2, Object obj) {
                    try {
                        if (!(obj instanceof JSONObject)) {
                            NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                            if (netTrafficeCallback2 != null) {
                                netTrafficeCallback2.onErrorCallback("There is no result.");
                                return;
                            }
                            return;
                        }
                        JSONObject jSONObject = (JSONObject) obj;
                        if (!jSONObject.has("is_eu")) {
                            NetTrafficeCallback netTrafficeCallback3 = netTrafficeCallback;
                            if (netTrafficeCallback3 != null) {
                                netTrafficeCallback3.onErrorCallback("There is no result.");
                                return;
                            }
                            return;
                        }
                        if (jSONObject.optInt("is_eu") == 1) {
                            NetTrafficeCallback netTrafficeCallback4 = netTrafficeCallback;
                            if (netTrafficeCallback4 != null) {
                                netTrafficeCallback4.onResultCallback(true);
                                return;
                            }
                            return;
                        }
                        NetTrafficeCallback netTrafficeCallback5 = netTrafficeCallback;
                        if (netTrafficeCallback5 != null) {
                            netTrafficeCallback5.onResultCallback(false);
                        }
                    } catch (Throwable unused) {
                        NetTrafficeCallback netTrafficeCallback6 = netTrafficeCallback;
                        if (netTrafficeCallback6 != null) {
                            netTrafficeCallback6.onErrorCallback(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
                        }
                    }
                }

                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadStart(int i2) {
                }
            });
            return;
        }
        if (iM == 1) {
            if (netTrafficeCallback != null) {
                netTrafficeCallback.onResultCallback(true);
            }
        } else if (netTrafficeCallback != null) {
            netTrafficeCallback.onResultCallback(false);
        }
    }

    public final boolean n(int i2) {
        return this.om.get(Integer.valueOf(i2)) != null;
    }

    public final void o(final int i2, final boolean z2) {
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.n.oom.3
            @Override // java.lang.Runnable
            public final void run() {
                if (!oom.this.n(i2) || oom.this.m(i2, z2)) {
                    String unused = oom.this.o0;
                    oom oomVarO = oom.o(o0n.m().on());
                    com.thinkup.core.oo.m mVarH = a.h(a.i());
                    if (TextUtils.isEmpty(com.thinkup.core.common.mo.n.o().n())) {
                        if (oomVarO.f41934n == 2 && mVarH.non() == 1 && mVarH.mm0() == 0) {
                            com.thinkup.core.common.oo0.oo.o(1, oomVarO.f41934n, mVarH.non(), i2);
                        }
                        if (oomVarO.f41934n == 1 && mVarH.noo() == 0 && mVarH.non() == 0) {
                            com.thinkup.core.common.oo0.oo.o(2, oomVarO.f41934n, mVarH.non(), i2);
                        }
                    } else {
                        com.thinkup.core.common.oo0.oo.o(3, !z2 ? 1 : 0, mVarH.non(), i2);
                    }
                    oom.this.om.put(Integer.valueOf(i2), Boolean.valueOf(z2));
                }
            }
        }, 2);
    }
}
