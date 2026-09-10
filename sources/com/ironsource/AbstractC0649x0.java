package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0649x0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f30976r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f30977s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0363h0 f30978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<NetworkSettings> f30981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0462ma f30982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0561s2 f30983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f30985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f30987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f30988k;
    private final O0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f30989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f30990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f30991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f30992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f30993q;

    /* JADX INFO: renamed from: com.ironsource.x0$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(C0363h0 adProperties, Va va2, jk.b getAdFormatConfig, jk.c createAdUnitData) {
            List<C0679yc> listD;
            Ve veD;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            kotlin.jvm.internal.n.f(getAdFormatConfig, "getAdFormatConfig");
            kotlin.jvm.internal.n.f(createAdUnitData, "createAdUnitData");
            Object objInvoke = getAdFormatConfig.invoke((va2 == null || (veD = va2.d()) == null) ? null : veD.c());
            if (objInvoke == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (va2 == null || (listD = va2.d(adProperties.e(), adProperties.c())) == null) {
                listD = xj.v.f53866a;
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(xj.p.W(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0679yc) it.next()).f());
            }
            C0462ma c0462maB = C0462ma.b();
            kotlin.jvm.internal.n.e(c0462maB, "getInstance()");
            return (AdUnitData) createAdUnitData.invoke(new C0631w0(strF, arrayList, c0462maB), objInvoke);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0649x0(C0363h0 adProperties, boolean z10, String str, List<? extends NetworkSettings> providerList, C0462ma publisherDataHolder, C0561s2 auctionSettings, int i10, int i11, boolean z11, int i12, int i13, O0 loadingData, long j10, boolean z12, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(providerList, "providerList");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        kotlin.jvm.internal.n.f(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.n.f(loadingData, "loadingData");
        this.f30978a = adProperties;
        this.f30979b = z10;
        this.f30980c = str;
        this.f30981d = providerList;
        this.f30982e = publisherDataHolder;
        this.f30983f = auctionSettings;
        this.f30984g = i10;
        this.f30985h = i11;
        this.f30986i = z11;
        this.f30987j = i12;
        this.f30988k = i13;
        this.l = loadingData;
        this.f30989m = j10;
        this.f30990n = z12;
        this.f30991o = z13;
        this.f30992p = z14;
        this.f30993q = z15;
    }

    public final void a(int i10) {
        this.f30984g = i10;
    }

    public C0363h0 b() {
        return this.f30978a;
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public abstract String c();

    public final boolean d() {
        return this.f30986i;
    }

    public final C0561s2 e() {
        return this.f30983f;
    }

    public final long f() {
        return this.f30989m;
    }

    public final int g() {
        return this.f30987j;
    }

    public final int h() {
        return this.f30985h;
    }

    public final O0 i() {
        return this.l;
    }

    public abstract String j();

    public final int k() {
        return this.f30984g;
    }

    public final String l() {
        String strC;
        C0358gd c0358gdF = b().f();
        return (c0358gdF == null || (strC = c0358gdF.c()) == null) ? "" : strC;
    }

    public final List<NetworkSettings> m() {
        return this.f30981d;
    }

    public final boolean n() {
        return this.f30990n;
    }

    public final C0462ma o() {
        return this.f30982e;
    }

    public final boolean p() {
        return this.f30992p;
    }

    public final boolean q() {
        return this.f30993q;
    }

    public final String r() {
        return this.f30980c;
    }

    public final boolean s() {
        return this.f30991o;
    }

    public final boolean t() {
        return this.f30983f.g() > 0;
    }

    public boolean u() {
        return this.f30979b;
    }

    public final String v() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f29352x, Integer.valueOf(this.f30984g), com.ironsource.mediationsdk.d.f29353y, Boolean.valueOf(this.f30986i), com.ironsource.mediationsdk.d.f29354z, Boolean.valueOf(this.f30993q));
    }

    public final void a(boolean z10) {
        this.f30986i = z10;
    }

    public final void b(boolean z10) {
        this.f30993q = z10;
    }

    public final int a() {
        return this.f30988k;
    }

    public final NetworkSettings a(String instanceName) {
        Object next;
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        Iterator<T> it = this.f30981d.iterator();
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
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), this.f30980c);
        kotlin.jvm.internal.n.e(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    public /* synthetic */ AbstractC0649x0(C0363h0 c0363h0, boolean z10, String str, List list, C0462ma c0462ma, C0561s2 c0561s2, int i10, int i11, boolean z11, int i12, int i13, O0 o6, long j10, boolean z12, boolean z13, boolean z14, boolean z15, int i14, kotlin.jvm.internal.g gVar) {
        this(c0363h0, z10, str, list, c0462ma, c0561s2, i10, i11, z11, i12, i13, o6, j10, z12, z13, z14, (i14 & com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z15);
    }
}
