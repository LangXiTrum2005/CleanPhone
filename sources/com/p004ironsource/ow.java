package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/ow;", "Lcom/ironsource/mw;", "", "b", "Lkotlin/Lazy;", "a", "()Ljava/lang/String;", "sdkVersion", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ow implements mw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ow f26420a = new ow();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy sdkVersion = LazyKt.b(a.f26422a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26422a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object objInvoke = UnityAds.class.getMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th) {
                q9.d().a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private ow() {
    }

    @Override // com.p004ironsource.mw
    public String a() {
        return (String) sdkVersion.getX();
    }
}
