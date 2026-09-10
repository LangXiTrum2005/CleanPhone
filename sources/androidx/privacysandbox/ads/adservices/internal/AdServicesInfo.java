package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo;", "", "Extensions30ExtImpl", "Extensions30Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdServicesInfo {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30ExtImpl;", "", "", "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Extensions30ExtImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Extensions30ExtImpl f7926a = new Extensions30ExtImpl();

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30Impl;", "", "", "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Extensions30Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Extensions30Impl f7927a = new Extensions30Impl();

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public static int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Extensions30Impl.f7927a.a();
        }
        return 0;
    }

    public static int b() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 31 || i2 == 32) {
            return Extensions30ExtImpl.f7926a.a();
        }
        return 0;
    }
}
