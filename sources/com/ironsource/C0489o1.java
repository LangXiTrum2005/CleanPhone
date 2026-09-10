package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0489o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0489o1 f29883a = new C0489o1();

    /* JADX INFO: renamed from: com.ironsource.o1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IronSource.a f29884a;

        public a(IronSource.a value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f29884a = value;
        }

        private final IronSource.a a() {
            return this.f29884a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f29884a == ((a) obj).f29884a;
        }

        public int hashCode() {
            return this.f29884a.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.f29884a + ")";
        }

        public final a a(IronSource.a value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new a(value);
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar2 = aVar.f29884a;
            }
            return aVar.a(aVar2);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(If.c(this.f29884a)));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29885a;

        public b(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f29885a = value;
        }

        private final String a() {
            return this.f29885a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.n.a(this.f29885a, ((b) obj).f29885a);
        }

        public int hashCode() {
            return this.f29885a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("AdIdentifier(value=", this.f29885a, ")");
        }

        public final b a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new b(value);
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f29885a;
            }
            return bVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f29885a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdSize f29886a;

        public c(AdSize size) {
            kotlin.jvm.internal.n.f(size, "size");
            this.f29886a = size;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x004d  */
        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            int i10;
            kotlin.jvm.internal.n.f(bundle, "bundle");
            String sizeDescription = this.f29886a.getSizeDescription();
            int iHashCode = sizeDescription.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && sizeDescription.equals(com.ironsource.mediationsdk.j.f29553a)) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                    } else if (sizeDescription.equals(com.ironsource.mediationsdk.j.f29556d)) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                } else if (sizeDescription.equals(com.ironsource.mediationsdk.j.f29554b)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            } else if (sizeDescription.equals(com.ironsource.mediationsdk.j.f29559g)) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            bundle.put(com.ironsource.mediationsdk.j.f29560h, Integer.valueOf(i10));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29887a;

        public d(String auctionId) {
            kotlin.jvm.internal.n.f(auctionId, "auctionId");
            this.f29887a = auctionId;
        }

        private final String a() {
            return this.f29887a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.n.a(this.f29887a, ((d) obj).f29887a);
        }

        public int hashCode() {
            return this.f29887a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("AuctionId(auctionId=", this.f29887a, ")");
        }

        public final d a(String auctionId) {
            kotlin.jvm.internal.n.f(auctionId, "auctionId");
            return new d(auctionId);
        }

        public static /* synthetic */ d a(d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f29887a;
            }
            return dVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("auctionId", this.f29887a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class e implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29888a;

        public e(int i10) {
            this.f29888a = i10;
        }

        private final int a() {
            return this.f29888a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f29888a == ((e) obj).f29888a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29888a);
        }

        public String toString() {
            return defpackage.e.h(this.f29888a, "DemandOnly(value=", ")");
        }

        public final e a(int i10) {
            return new e(i10);
        }

        public static /* synthetic */ e a(e eVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = eVar.f29888a;
            }
            return eVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f29888a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$f */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class f implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f29889a;

        public f(long j10) {
            this.f29889a = j10;
        }

        private final long a() {
            return this.f29889a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f29889a == ((f) obj).f29889a;
        }

        public int hashCode() {
            return Long.hashCode(this.f29889a);
        }

        public String toString() {
            return defpackage.e.j(this.f29889a, "Duration(duration=", ")");
        }

        public final f a(long j10) {
            return new f(j10);
        }

        public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = fVar.f29889a;
            }
            return fVar.a(j10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.f29889a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$g */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class g implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29890a;

        public g(String dynamicSourceId) {
            kotlin.jvm.internal.n.f(dynamicSourceId, "dynamicSourceId");
            this.f29890a = dynamicSourceId;
        }

        private final String a() {
            return this.f29890a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.n.a(this.f29890a, ((g) obj).f29890a);
        }

        public int hashCode() {
            return this.f29890a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("DynamicDemandSourceId(dynamicSourceId=", this.f29890a, ")");
        }

        public final g a(String dynamicSourceId) {
            kotlin.jvm.internal.n.f(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        public static /* synthetic */ g a(g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.f29890a;
            }
            return gVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f29890a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$h */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class h implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29891a;

        public h(String sourceId) {
            kotlin.jvm.internal.n.f(sourceId, "sourceId");
            this.f29891a = sourceId;
        }

        private final String a() {
            return this.f29891a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.n.a(this.f29891a, ((h) obj).f29891a);
        }

        public int hashCode() {
            return this.f29891a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("DynamicSourceId(sourceId=", this.f29891a, ")");
        }

        public final h a(String sourceId) {
            kotlin.jvm.internal.n.f(sourceId, "sourceId");
            return new h(sourceId);
        }

        public static /* synthetic */ h a(h hVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hVar.f29891a;
            }
            return hVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f29891a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$i */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class i implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f29892a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$j */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class j implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29893a;

        public j(int i10) {
            this.f29893a = i10;
        }

        private final int a() {
            return this.f29893a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f29893a == ((j) obj).f29893a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29893a);
        }

        public String toString() {
            return defpackage.e.h(this.f29893a, "ErrorCode(code=", ")");
        }

        public final j a(int i10) {
            return new j(i10);
        }

        public static /* synthetic */ j a(j jVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = jVar.f29893a;
            }
            return jVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.f29893a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$k */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class k implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29894a;

        public k(String str) {
            this.f29894a = str;
        }

        private final String a() {
            return this.f29894a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && kotlin.jvm.internal.n.a(this.f29894a, ((k) obj).f29894a);
        }

        public int hashCode() {
            String str = this.f29894a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return defpackage.e.o("ErrorReason(reason=", this.f29894a, ")");
        }

        public final k a(String str) {
            return new k(str);
        }

        public static /* synthetic */ k a(k kVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = kVar.f29894a;
            }
            return kVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            String str = this.f29894a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f29894a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$l */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class l implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29895a;

        public l(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f29895a = value;
        }

        private final String a() {
            return this.f29895a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && kotlin.jvm.internal.n.a(this.f29895a, ((l) obj).f29895a);
        }

        public int hashCode() {
            return this.f29895a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("Ext1(value=", this.f29895a, ")");
        }

        public final l a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new l(value);
        }

        public static /* synthetic */ l a(l lVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = lVar.f29895a;
            }
            return lVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f29895a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$m */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class m implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f29896a;

        public m(JSONObject jSONObject) {
            this.f29896a = jSONObject;
        }

        private final JSONObject a() {
            return this.f29896a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && kotlin.jvm.internal.n.a(this.f29896a, ((m) obj).f29896a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f29896a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.f29896a + ")";
        }

        public final m a(JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jSONObject = mVar.f29896a;
            }
            return mVar.a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            JSONObject jSONObject = this.f29896a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$n */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class n implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29897a;

        public n(int i10) {
            this.f29897a = i10;
        }

        private final int a() {
            return this.f29897a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f29897a == ((n) obj).f29897a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29897a);
        }

        public String toString() {
            return defpackage.e.h(this.f29897a, "InstanceType(instanceType=", ")");
        }

        public final n a(int i10) {
            return new n(i10);
        }

        public static /* synthetic */ n a(n nVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = nVar.f29897a;
            }
            return nVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f29897a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$o */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class o implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29898a;

        public o(int i10) {
            this.f29898a = i10;
        }

        private final int a() {
            return this.f29898a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f29898a == ((o) obj).f29898a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29898a);
        }

        public String toString() {
            return defpackage.e.h(this.f29898a, "MultipleAdObjects(value=", ")");
        }

        public final o a(int i10) {
            return new o(i10);
        }

        public static /* synthetic */ o a(o oVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = oVar.f29898a;
            }
            return oVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f29898a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$p */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class p implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29899a;

        public p(int i10) {
            this.f29899a = i10;
        }

        private final int a() {
            return this.f29899a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f29899a == ((p) obj).f29899a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29899a);
        }

        public String toString() {
            return defpackage.e.h(this.f29899a, "OneFlow(value=", ")");
        }

        public final p a(int i10) {
            return new p(i10);
        }

        public static /* synthetic */ p a(p pVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = pVar.f29899a;
            }
            return pVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f29899a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$q */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class q implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29900a;

        public q(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f29900a = value;
        }

        private final String a() {
            return this.f29900a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && kotlin.jvm.internal.n.a(this.f29900a, ((q) obj).f29900a);
        }

        public int hashCode() {
            return this.f29900a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("Placement(value=", this.f29900a, ")");
        }

        public final q a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new q(value);
        }

        public static /* synthetic */ q a(q qVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = qVar.f29900a;
            }
            return qVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("placement", this.f29900a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$r */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class r implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29901a;

        public r(int i10) {
            this.f29901a = i10;
        }

        private final int a() {
            return this.f29901a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f29901a == ((r) obj).f29901a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29901a);
        }

        public String toString() {
            return defpackage.e.h(this.f29901a, "Programmatic(programmatic=", ")");
        }

        public final r a(int i10) {
            return new r(i10);
        }

        public static /* synthetic */ r a(r rVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = rVar.f29901a;
            }
            return rVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f29901a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$s */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class s implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29902a;

        public s(String sourceName) {
            kotlin.jvm.internal.n.f(sourceName, "sourceName");
            this.f29902a = sourceName;
        }

        private final String a() {
            return this.f29902a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && kotlin.jvm.internal.n.a(this.f29902a, ((s) obj).f29902a);
        }

        public int hashCode() {
            return this.f29902a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("Provider(sourceName=", this.f29902a, ")");
        }

        public final s a(String sourceName) {
            kotlin.jvm.internal.n.f(sourceName, "sourceName");
            return new s(sourceName);
        }

        public static /* synthetic */ s a(s sVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sVar.f29902a;
            }
            return sVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f29902a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$t */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class t implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29903a;

        public t(int i10) {
            this.f29903a = i10;
        }

        private final int a() {
            return this.f29903a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f29903a == ((t) obj).f29903a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29903a);
        }

        public String toString() {
            return defpackage.e.h(this.f29903a, "RewardAmount(value=", ")");
        }

        public final t a(int i10) {
            return new t(i10);
        }

        public static /* synthetic */ t a(t tVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tVar.f29903a;
            }
            return tVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f29903a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$u */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class u implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29904a;

        public u(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f29904a = value;
        }

        private final String a() {
            return this.f29904a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && kotlin.jvm.internal.n.a(this.f29904a, ((u) obj).f29904a);
        }

        public int hashCode() {
            return this.f29904a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("RewardName(value=", this.f29904a, ")");
        }

        public final u a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new u(value);
        }

        public static /* synthetic */ u a(u uVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uVar.f29904a;
            }
            return uVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f29904a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$v */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class v implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29905a;

        public v(String version) {
            kotlin.jvm.internal.n.f(version, "version");
            this.f29905a = version;
        }

        private final String a() {
            return this.f29905a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && kotlin.jvm.internal.n.a(this.f29905a, ((v) obj).f29905a);
        }

        public int hashCode() {
            return this.f29905a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("SdkVersion(version=", this.f29905a, ")");
        }

        public final v a(String version) {
            kotlin.jvm.internal.n.f(version, "version");
            return new v(version);
        }

        public static /* synthetic */ v a(v vVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = vVar.f29905a;
            }
            return vVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f29905a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$w */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class w implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29906a;

        public w(int i10) {
            this.f29906a = i10;
        }

        private final int a() {
            return this.f29906a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f29906a == ((w) obj).f29906a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29906a);
        }

        public String toString() {
            return defpackage.e.h(this.f29906a, "SessionDepth(sessionDepth=", ")");
        }

        public final w a(int i10) {
            return new w(i10);
        }

        public static /* synthetic */ w a(w wVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = wVar.f29906a;
            }
            return wVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f29906a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$x */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class x implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29907a;

        public x(String subProviderId) {
            kotlin.jvm.internal.n.f(subProviderId, "subProviderId");
            this.f29907a = subProviderId;
        }

        private final String a() {
            return this.f29907a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && kotlin.jvm.internal.n.a(this.f29907a, ((x) obj).f29907a);
        }

        public int hashCode() {
            return this.f29907a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("SubProviderId(subProviderId=", this.f29907a, ")");
        }

        public final x a(String subProviderId) {
            kotlin.jvm.internal.n.f(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        public static /* synthetic */ x a(x xVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = xVar.f29907a;
            }
            return xVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put("spId", this.f29907a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$y */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class y implements InterfaceC0507p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29908a;

        public y(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this.f29908a = value;
        }

        private final String a() {
            return this.f29908a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && kotlin.jvm.internal.n.a(this.f29908a, ((y) obj).f29908a);
        }

        public int hashCode() {
            return this.f29908a.hashCode();
        }

        public String toString() {
            return defpackage.e.o("TransId(value=", this.f29908a, ")");
        }

        public final y a(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            return new y(value);
        }

        public static /* synthetic */ y a(y yVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = yVar.f29908a;
            }
            return yVar.a(str);
        }

        @Override // com.ironsource.InterfaceC0507p1
        public void a(Map<String, Object> bundle) {
            kotlin.jvm.internal.n.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f29908a);
        }
    }

    private C0489o1() {
    }
}
