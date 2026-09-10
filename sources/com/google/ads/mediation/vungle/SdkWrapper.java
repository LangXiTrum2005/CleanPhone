package com.google.ads.mediation.vungle;

import android.content.Context;
import com.ironsource.X3;
import com.vungle.ads.taiyuan;
import com.vungle.ads.triweekly;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: VungleSdkWrapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/ads/mediation/vungle/SdkWrapper;", "", "Landroid/content/Context;", "context", "Lcom/vungle/ads/taiyuan;", "callback", "", "getBiddingToken", "(Landroid/content/Context;Lcom/vungle/ads/taiyuan;)V", "", "getSdkVersion", "()Ljava/lang/String;", "appId", "Lcom/vungle/ads/triweekly;", "initializationListener", X3.a.f, "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/triweekly;)V", "", "isInitialized", "()Z", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SdkWrapper {
    void getBiddingToken(Context context, taiyuan callback);

    String getSdkVersion();

    void init(Context context, String appId, triweekly initializationListener);

    boolean isInitialized();
}
