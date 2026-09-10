package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3816x0 {
    public static final a r = new a(null);
    public static final int s = -1;
    private final C3538h0 a;
    private final boolean b;
    private final String c;
    private final List<NetworkSettings> d;
    private final C3583ja e;
    private final C3733s2 f;
    private int g;
    private final int h;
    private boolean i;
    private final int j;
    private final int k;
    private final O0 l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private boolean q;

    /* JADX INFO: renamed from: com.ironsource.x0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(C3538h0 adProperties, Sa sa, Function1<? super N3, ? extends AdFormatConfig> getAdFormatConfig, Function2<? super C3799w0, ? super AdFormatConfig, ? extends AdUnitData> createAdUnitData) {
            List<C3760tc> listFormularize;
            Ie ieD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            Intrinsics.checkNotNullParameter(getAdFormatConfig, "getAdFormatConfig");
            Intrinsics.checkNotNullParameter(createAdUnitData, "createAdUnitData");
            AdFormatConfig adformatconfigInvoke = getAdFormatConfig.invoke((sa == null || (ieD = sa.d()) == null) ? null : ieD.c());
            if (adformatconfigInvoke == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (sa == null || (listFormularize = sa.d(adProperties.e(), adProperties.c())) == null) {
                listFormularize = p002kotlin.collections.adultoid.formularize();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(listFormularize, 10));
            Iterator<T> it = listFormularize.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3760tc) it.next()).f());
            }
            C3583ja c3583jaB = C3583ja.b();
            Intrinsics.checkNotNullExpressionValue(c3583jaB, "getInstance()");
            return createAdUnitData.invoke(new C3799w0(strF, arrayList, c3583jaB), adformatconfigInvoke);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3816x0(C3538h0 adProperties, boolean z, String str, List<? extends NetworkSettings> providerList, C3583ja publisherDataHolder, C3733s2 auctionSettings, int i, int i2, boolean z2, int i3, int i4, O0 loadingData, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        this.a = adProperties;
        this.b = z;
        this.c = str;
        this.d = providerList;
        this.e = publisherDataHolder;
        this.f = auctionSettings;
        this.g = i;
        this.h = i2;
        this.i = z2;
        this.j = i3;
        this.k = i4;
        this.l = loadingData;
        this.m = j;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
    }

    public final void a(int i) {
        this.g = i;
    }

    public C3538h0 b() {
        return this.a;
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public abstract String c();

    public final boolean d() {
        return this.i;
    }

    public final C3733s2 e() {
        return this.f;
    }

    public final long f() {
        return this.m;
    }

    public final int g() {
        return this.j;
    }

    public final int h() {
        return this.h;
    }

    public final O0 i() {
        return this.l;
    }

    public abstract String j();

    public final int k() {
        return this.g;
    }

    public final String l() {
        String strC;
        C3461cd c3461cdF = b().f();
        return (c3461cdF == null || (strC = c3461cdF.c()) == null) ? "" : strC;
    }

    public final List<NetworkSettings> m() {
        return this.d;
    }

    public final boolean n() {
        return this.n;
    }

    public final C3583ja o() {
        return this.e;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    public final String r() {
        return this.c;
    }

    public final boolean s() {
        return this.o;
    }

    public final boolean t() {
        return this.f.g() > 0;
    }

    public boolean u() {
        return this.b;
    }

    public final String v() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, Integer.valueOf(this.g), com.ironsource.mediationsdk.d.y, Boolean.valueOf(this.i), com.ironsource.mediationsdk.d.z, Boolean.valueOf(this.q));
        Intrinsics.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    public final int a() {
        return this.k;
    }

    public final NetworkSettings a(String instanceName) {
        Object next;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                return (NetworkSettings) next;
            }
        }
        next = null;
        return (NetworkSettings) next;
    }

    public AdData a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), this.c);
        Intrinsics.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    public /* synthetic */ AbstractC3816x0(C3538h0 c3538h0, boolean z, String str, List list, C3583ja c3583ja, C3733s2 c3733s2, int i, int i2, boolean z2, int i3, int i4, O0 o0, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3538h0, z, str, list, c3583ja, c3733s2, i, i2, z2, i3, i4, o0, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }
}
