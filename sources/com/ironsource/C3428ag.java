package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3428ag implements Yf {
    public static final C3428ag a = new C3428ag();
    private static final patroclinal.taiyuan b = p002kotlin.saneness.saneness(a.a);

    /* JADX INFO: renamed from: com.ironsource.ag$a */
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object objInvoke = UnityAds.class.getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th) {
                C3631m4.d().a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C3428ag() {
    }

    @Override // com.ironsource.Yf
    public String a() {
        return (String) b.getValue();
    }
}
