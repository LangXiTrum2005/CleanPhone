package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0649x0 f26253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NetworkSettings f26254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wj.d f26255c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V0 f26256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I f26257b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V0 v4, I i10) {
            super(0);
            this.f26256a = v4;
            this.f26257b = i10;
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f26256a.a(this.f26257b.e(), this.f26257b.a(), this.f26257b.d());
        }
    }

    public I(V0 adTools, AbstractC0649x0 adUnitData, NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        this.f26253a = adUnitData;
        this.f26254b = providerSettings;
        this.f26255c = r9.b.u(new a(adTools, this));
    }

    public final IronSource.a a() {
        return this.f26253a.b().a();
    }

    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.f26255c.getValue();
    }

    public final String c() {
        String providerName = this.f26254b.getProviderName();
        kotlin.jvm.internal.n.e(providerName, "providerSettings.providerName");
        return providerName;
    }

    public final UUID d() {
        return this.f26253a.b().b();
    }

    public final NetworkSettings e() {
        return this.f26254b;
    }
}
