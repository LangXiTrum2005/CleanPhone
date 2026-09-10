package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;

/* JADX INFO: renamed from: com.ironsource.tg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0593tg implements InterfaceC0557rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0593tg f30733a = new C0593tg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wj.d f30734b = r9.b.u(a.f30735a);

    /* JADX INFO: renamed from: com.ironsource.tg$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30735a = new a();

        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object objInvoke = UnityAds.class.getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                IronLog.INTERNAL.warning(th2.getMessage());
                return null;
            }
        }
    }

    private C0593tg() {
    }

    @Override // com.ironsource.InterfaceC0557rg
    public String a() {
        return (String) f30734b.getValue();
    }
}
