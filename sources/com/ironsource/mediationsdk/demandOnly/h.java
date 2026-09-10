package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC0397j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface h extends q {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f29450c;

        public a(String str, String str2, boolean z10) {
            this.f29448a = str;
            this.f29449b = str2;
            this.f29450c = z10;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String b() {
            return this.f29449b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.f29450c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String e() {
            return this.f29448a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f29451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Activity f29452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ISDemandOnlyBannerLayout f29453f;

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.a(this.f29451d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        public final Activity f() {
            return this.f29452e;
        }

        public final ISDemandOnlyBannerLayout g() {
            return this.f29453f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String adFormat, Activity activity, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str2, boolean z10) {
            super(str, str2, z10);
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f29451d = adFormat;
            this.f29452e = activity;
            this.f29453f = iSDemandOnlyBannerLayout;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29454a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f29455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f29456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f29457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f29458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ISDemandOnlyBannerLayout f29459f;

        public final c a(IronSource.a adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            String string = adFormat.toString();
            kotlin.jvm.internal.n.e(string, "adFormat.toString()");
            this.f29454a = string;
            return this;
        }

        public final c b(String str) {
            this.f29456c = str;
            return this;
        }

        public final c a(Activity activity) {
            this.f29455b = activity;
            return this;
        }

        public final d b() {
            return new d(this.f29454a, this.f29455b, this.f29456c, this.f29458e, this.f29457d);
        }

        public final c a(Activity activity, Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f29455b = activity;
            return this;
        }

        public final c a(boolean z10) {
            this.f29457d = z10;
            return this;
        }

        public final c a(String str) {
            this.f29458e = str;
            return this;
        }

        public final c a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f29459f = iSDemandOnlyBannerLayout;
            return this;
        }

        public final b a() {
            return new b(this.f29454a, this.f29455b, this.f29456c, this.f29459f, this.f29458e, this.f29457d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d extends a implements InterfaceC0397j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f29460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Activity f29461e;

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
            this(str, activity, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.b(this.f29460d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC0397j
        public Activity d() {
            return this.f29461e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String adFormat, Activity activity, String str, String str2, boolean z10) {
            super(str, str2, z10);
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f29460d = adFormat;
            this.f29461e = activity;
        }
    }

    String b();

    boolean c();

    String e();
}
