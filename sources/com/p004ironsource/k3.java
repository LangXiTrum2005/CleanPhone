package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001:\u0019\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u001d"}, d2 = {"Lcom/ironsource/k3;", "", "<init>", "()V", "a", "b", "c", "d", "e", com.smartdigimkt.h5.f.j, com.smartdigimkt.y4.g.f40227p, com.smartdigimkt.m3.h.f36614b, com.smartdigimkt.q8.i.f37957c, "j", "k", "l", "m", dc.q, "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k3 f25479a = new k3();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÂ\u0003J\u001c\u0010\u0004\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\u0017\u0010\u0004\u001a\u00020\u00002\f\b\u0002\u0010\n\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0018\u0010\n\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/ironsource/k3$a;", "Lcom/ironsource/l3;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", "a", "", "", "", "bundle", "", "value", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IronSource.AD_UNIT value;

        public a(IronSource.AD_UNIT value) {
            Intrinsics.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ a a(a aVar, IronSource.AD_UNIT ad_unit, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                ad_unit = aVar.value;
            }
            return aVar.a(ad_unit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.value == ((a) other).value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.value + ')';
        }

        public final a a(IronSource.AD_UNIT value) {
            Intrinsics.f(value, "value");
            return new a(value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final IronSource.AD_UNIT getValue() {
            return this.value;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(av.b(this.value)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$b;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "value", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public b(String value) {
            Intrinsics.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ b a(b bVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.value;
            }
            return bVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && Intrinsics.a(this.value, ((b) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("AdIdentifier(value="), this.value, ')');
        }

        public final b a(String value) {
            Intrinsics.f(value, "value");
            return new b(value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getValue() {
            return this.value;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.value);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/ironsource/k3$c;", "Lcom/ironsource/l3;", "", "", "", "bundle", "", "a", "Lcom/unity3d/ironsourceads/AdSize;", "Lcom/unity3d/ironsourceads/AdSize;", "size", "<init>", "(Lcom/unity3d/ironsourceads/AdSize;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AdSize size;

        public c(AdSize size) {
            Intrinsics.f(size, "size");
            this.size = size;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x004d  */
        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            int i2;
            Intrinsics.f(bundle, "bundle");
            String sizeDescription = this.size.getSizeDescription();
            int iHashCode = sizeDescription.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && sizeDescription.equals("BANNER")) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                    } else if (sizeDescription.equals(com.p004ironsource.mediationsdk.l.d)) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                } else if (sizeDescription.equals(com.p004ironsource.mediationsdk.l.f25925b)) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
            } else if (sizeDescription.equals(com.p004ironsource.mediationsdk.l.g)) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            bundle.put(com.p004ironsource.mediationsdk.l.f25928h, Integer.valueOf(i2));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$d;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "auctionId", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class d implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String auctionId;

        public d(String auctionId) {
            Intrinsics.f(auctionId, "auctionId");
            this.auctionId = auctionId;
        }

        public static /* synthetic */ d a(d dVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = dVar.auctionId;
            }
            return dVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Intrinsics.a(this.auctionId, ((d) other).auctionId);
        }

        public int hashCode() {
            return this.auctionId.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("AuctionId(auctionId="), this.auctionId, ')');
        }

        public final d a(String auctionId) {
            Intrinsics.f(auctionId, "auctionId");
            return new d(auctionId);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getAuctionId() {
            return this.auctionId;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("auctionId", this.auctionId);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$e;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", "value", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class e implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public e(int i2) {
            this.value = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.value == ((e) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return android.support.v4.media.a.p(new StringBuilder("DemandOnly(value="), this.value, ')');
        }

        public final e a(int value) {
            return new e(value);
        }

        public static /* synthetic */ e a(e eVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = eVar.value;
            }
            return eVar.a(i2);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.value));
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ironsource/k3$f;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", "duration", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "J", "<init>", "(J)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class f implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long duration;

        public f(long j) {
            this.duration = j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final long getDuration() {
            return this.duration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.duration == ((f) other).duration;
        }

        public int hashCode() {
            return Long.hashCode(this.duration);
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.o(new StringBuilder("Duration(duration="), this.duration, ')');
        }

        public final f a(long duration) {
            return new f(duration);
        }

        public static /* synthetic */ f a(f fVar, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = fVar.duration;
            }
            return fVar.a(j);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("duration", Long.valueOf(this.duration));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$g;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "dynamicSourceId", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class g implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String dynamicSourceId;

        public g(String dynamicSourceId) {
            Intrinsics.f(dynamicSourceId, "dynamicSourceId");
            this.dynamicSourceId = dynamicSourceId;
        }

        public static /* synthetic */ g a(g gVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = gVar.dynamicSourceId;
            }
            return gVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && Intrinsics.a(this.dynamicSourceId, ((g) other).dynamicSourceId);
        }

        public int hashCode() {
            return this.dynamicSourceId.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("DynamicDemandSourceId(dynamicSourceId="), this.dynamicSourceId, ')');
        }

        public final g a(String dynamicSourceId) {
            Intrinsics.f(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getDynamicSourceId() {
            return this.dynamicSourceId;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.dynamicSourceId);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$h;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "sourceId", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class h implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String sourceId;

        public h(String sourceId) {
            Intrinsics.f(sourceId, "sourceId");
            this.sourceId = sourceId;
        }

        public static /* synthetic */ h a(h hVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = hVar.sourceId;
            }
            return hVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && Intrinsics.a(this.sourceId, ((h) other).sourceId);
        }

        public int hashCode() {
            return this.sourceId.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("DynamicSourceId(sourceId="), this.sourceId, ')');
        }

        public final h a(String sourceId) {
            Intrinsics.f(sourceId, "sourceId");
            return new h(sourceId);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getSourceId() {
            return this.sourceId;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.sourceId);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ironsource/k3$i;", "Lcom/ironsource/l3;", "", "", "", "bundle", "", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class i implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f25488a = new i();

        private i() {
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$j;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", "code", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class j implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int code;

        public j(int i2) {
            this.code = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getCode() {
            return this.code;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.code == ((j) other).code;
        }

        public int hashCode() {
            return Integer.hashCode(this.code);
        }

        public String toString() {
            return android.support.v4.media.a.p(new StringBuilder("ErrorCode(code="), this.code, ')');
        }

        public final j a(int code) {
            return new j(code);
        }

        public static /* synthetic */ j a(j jVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = jVar.code;
            }
            return jVar.a(i2);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("errorCode", Integer.valueOf(this.code));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0015\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$k;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "reason", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class k implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String reason;

        public k(String str) {
            this.reason = str;
        }

        public static /* synthetic */ k a(k kVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = kVar.reason;
            }
            return kVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && Intrinsics.a(this.reason, ((k) other).reason);
        }

        public int hashCode() {
            String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("ErrorReason(reason="), this.reason, ')');
        }

        public final k a(String reason) {
            return new k(reason);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getReason() {
            return this.reason;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            String str = this.reason;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.reason);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$l;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "value", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class l implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public l(String value) {
            Intrinsics.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ l a(l lVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = lVar.value;
            }
            return lVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && Intrinsics.a(this.value, ((l) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("Ext1(value="), this.value, ')');
        }

        public final l a(String value) {
            Intrinsics.f(value, "value");
            return new l(value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getValue() {
            return this.value;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.value);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0015\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ironsource/k3$m;", "Lcom/ironsource/l3;", "Lorg/json/JSONObject;", "a", "", "", "", "bundle", "", "genericParams", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class m implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JSONObject genericParams;

        public m(JSONObject jSONObject) {
            this.genericParams = jSONObject;
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                jSONObject = mVar.genericParams;
            }
            return mVar.a(jSONObject);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && Intrinsics.a(this.genericParams, ((m) other).genericParams);
        }

        public int hashCode() {
            JSONObject jSONObject = this.genericParams;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.genericParams + ')';
        }

        public final m a(JSONObject genericParams) {
            return new m(genericParams);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final JSONObject getGenericParams() {
            return this.genericParams;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            JSONObject jSONObject = this.genericParams;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$n;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", "instanceType", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class n implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int instanceType;

        public n(int i2) {
            this.instanceType = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getInstanceType() {
            return this.instanceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && this.instanceType == ((n) other).instanceType;
        }

        public int hashCode() {
            return Integer.hashCode(this.instanceType);
        }

        public String toString() {
            return android.support.v4.media.a.p(new StringBuilder("InstanceType(instanceType="), this.instanceType, ')');
        }

        public final n a(int instanceType) {
            return new n(instanceType);
        }

        public static /* synthetic */ n a(n nVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = nVar.instanceType;
            }
            return nVar.a(i2);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.instanceType));
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$o;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", "value", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class o implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public o(int i2) {
            this.value = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && this.value == ((o) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return android.support.v4.media.a.p(new StringBuilder("MultipleAdObjects(value="), this.value, ')');
        }

        public final o a(int value) {
            return new o(value);
        }

        public static /* synthetic */ o a(o oVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = oVar.value;
            }
            return oVar.a(i2);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.value));
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$p;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", "value", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class p implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public p(int i2) {
            this.value = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && this.value == ((p) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return android.support.v4.media.a.p(new StringBuilder("OneFlow(value="), this.value, ')');
        }

        public final p a(int value) {
            return new p(value);
        }

        public static /* synthetic */ p a(p pVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = pVar.value;
            }
            return pVar.a(i2);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.value));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$q;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "value", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class q implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public q(String value) {
            Intrinsics.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ q a(q qVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = qVar.value;
            }
            return qVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof q) && Intrinsics.a(this.value, ((q) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("Placement(value="), this.value, ')');
        }

        public final q a(String value) {
            Intrinsics.f(value, "value");
            return new q(value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getValue() {
            return this.value;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("placement", this.value);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$r;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", IronSourceConstants.EVENTS_PROGRAMMATIC, "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class r implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int programmatic;

        public r(int i2) {
            this.programmatic = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getProgrammatic() {
            return this.programmatic;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r) && this.programmatic == ((r) other).programmatic;
        }

        public int hashCode() {
            return Integer.hashCode(this.programmatic);
        }

        public String toString() {
            return android.support.v4.media.a.p(new StringBuilder("Programmatic(programmatic="), this.programmatic, ')');
        }

        public final r a(int programmatic) {
            return new r(programmatic);
        }

        public static /* synthetic */ r a(r rVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = rVar.programmatic;
            }
            return rVar.a(i2);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.programmatic));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$s;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "sourceName", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class s implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String sourceName;

        public s(String sourceName) {
            Intrinsics.f(sourceName, "sourceName");
            this.sourceName = sourceName;
        }

        public static /* synthetic */ s a(s sVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = sVar.sourceName;
            }
            return sVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && Intrinsics.a(this.sourceName, ((s) other).sourceName);
        }

        public int hashCode() {
            return this.sourceName.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("Provider(sourceName="), this.sourceName, ')');
        }

        public final s a(String sourceName) {
            Intrinsics.f(sourceName, "sourceName");
            return new s(sourceName);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getSourceName() {
            return this.sourceName;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.sourceName);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$t;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", "value", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class t implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public t(int i2) {
            this.value = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof t) && this.value == ((t) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return android.support.v4.media.a.p(new StringBuilder("RewardAmount(value="), this.value, ')');
        }

        public final t a(int value) {
            return new t(value);
        }

        public static /* synthetic */ t a(t tVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = tVar.value;
            }
            return tVar.a(i2);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.value));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$u;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "value", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class u implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public u(String value) {
            Intrinsics.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ u a(u uVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = uVar.value;
            }
            return uVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof u) && Intrinsics.a(this.value, ((u) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("RewardName(value="), this.value, ')');
        }

        public final u a(String value) {
            Intrinsics.f(value, "value");
            return new u(value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getValue() {
            return this.value;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.value);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$v;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "version", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class v implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String version;

        public v(String version) {
            Intrinsics.f(version, "version");
            this.version = version;
        }

        public static /* synthetic */ v a(v vVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = vVar.version;
            }
            return vVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof v) && Intrinsics.a(this.version, ((v) other).version);
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("SdkVersion(version="), this.version, ')');
        }

        public final v a(String version) {
            Intrinsics.f(version, "version");
            return new v(version);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getVersion() {
            return this.version;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.version);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$w;", "Lcom/ironsource/l3;", "", "a", "", "", "", "bundle", "", "sessionDepth", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class w implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int sessionDepth;

        public w(int i2) {
            this.sessionDepth = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getSessionDepth() {
            return this.sessionDepth;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof w) && this.sessionDepth == ((w) other).sessionDepth;
        }

        public int hashCode() {
            return Integer.hashCode(this.sessionDepth);
        }

        public String toString() {
            return android.support.v4.media.a.p(new StringBuilder("SessionDepth(sessionDepth="), this.sessionDepth, ')');
        }

        public final w a(int sessionDepth) {
            return new w(sessionDepth);
        }

        public static /* synthetic */ w a(w wVar, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = wVar.sessionDepth;
            }
            return wVar.a(i2);
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.sessionDepth));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$x;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "subProviderId", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class x implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String subProviderId;

        public x(String subProviderId) {
            Intrinsics.f(subProviderId, "subProviderId");
            this.subProviderId = subProviderId;
        }

        public static /* synthetic */ x a(x xVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = xVar.subProviderId;
            }
            return xVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof x) && Intrinsics.a(this.subProviderId, ((x) other).subProviderId);
        }

        public int hashCode() {
            return this.subProviderId.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("SubProviderId(subProviderId="), this.subProviderId, ')');
        }

        public final x a(String subProviderId) {
            Intrinsics.f(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getSubProviderId() {
            return this.subProviderId;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put("spId", this.subProviderId);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/k3$y;", "Lcom/ironsource/l3;", "", "a", "", "", "bundle", "", "value", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class y implements l3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public y(String value) {
            Intrinsics.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ y a(y yVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = yVar.value;
            }
            return yVar.a(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof y) && Intrinsics.a(this.value, ((y) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("TransId(value="), this.value, ')');
        }

        public final y a(String value) {
            Intrinsics.f(value, "value");
            return new y(value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final String getValue() {
            return this.value;
        }

        @Override // com.p004ironsource.l3
        public void a(Map<String, Object> bundle) {
            Intrinsics.f(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.value);
        }
    }

    private k3() {
    }
}
