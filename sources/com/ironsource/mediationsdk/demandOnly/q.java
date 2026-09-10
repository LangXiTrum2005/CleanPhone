package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface q {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29504a;

        public a(String adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f29504a = adFormat;
        }

        public final IronSourceError a(h loadParams) {
            kotlin.jvm.internal.n.f(loadParams, "loadParams");
            h.b bVar = (h.b) loadParams;
            if (bVar.f() == null) {
                return new IronSourceError(1060, wi.d.h(this.f29504a, " was initialized and loaded without Activity"));
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if (com.ironsource.mediationsdk.j.f29558f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = bVar.b();
            if ((strB == null || strB.length() == 0) && loadParams.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29505a;

        public b(String adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f29505a = adFormat;
        }

        public final IronSourceError a(h.d loadParams) {
            kotlin.jvm.internal.n.f(loadParams, "loadParams");
            if (loadParams.d() == null) {
                return new IronSourceError(1060, wi.d.h(this.f29505a, " was initialized and loaded without Activity"));
            }
            if (loadParams.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = loadParams.b();
            if ((strB == null || strB.length() == 0) && loadParams.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    IronSourceError a();
}
