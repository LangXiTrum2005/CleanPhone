package com.vungle.ads.internal.network;

import android.os.Build;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleHeader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\rR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/network/cutely;", "", "<init>", "()V", "", "defaultHeader", "()Ljava/lang/String;", "", "reset", "headerUa", "Ljava/lang/String;", "getHeaderUa", "setHeaderUa", "(Ljava/lang/String;)V", "appId", "getAppId", "setAppId", X3.j.W, "getAppVersion", "setAppVersion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class cutely {
    public static final cutely INSTANCE;
    private static String appId;
    private static String appVersion;
    private static String headerUa;

    static {
        cutely cutelyVar = new cutely();
        INSTANCE = cutelyVar;
        headerUa = cutelyVar.defaultHeader();
    }

    private cutely() {
    }

    private final String defaultHeader() {
        StringBuilder sb = new StringBuilder();
        sb.append(Intrinsics.wireman("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb.append(com.vungle.ads.cutely.VERSION_NAME);
        return sb.toString();
    }

    public final String getAppId() {
        return appId;
    }

    public final String getAppVersion() {
        return appVersion;
    }

    public final String getHeaderUa() {
        return headerUa;
    }

    public final void reset() {
        headerUa = defaultHeader();
    }

    public final void setAppId(String str) {
        appId = str;
    }

    public final void setAppVersion(String str) {
        appVersion = str;
    }

    public final void setHeaderUa(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        headerUa = str;
    }
}
