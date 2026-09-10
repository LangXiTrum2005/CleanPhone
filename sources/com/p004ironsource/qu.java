package com.p004ironsource;

import com.smartdigimkt.h5.f;
import com.smartdigimkt.q0.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0003j\u0002`\u000bH\u0016J:\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0004\u001a\u00060\u0003j\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0003j\u0002`\u000bH\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u001b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\n\u0010\u001d\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/ironsource/qu;", "Lcom/ironsource/nf;", "Lcom/ironsource/nf$a;", "", "identifier", "Lcom/ironsource/qu$a;", "c", "Lcom/ironsource/nu;", b.i0, "", "a", "Lcom/ironsource/services/capping/Identifier;", "Lcom/ironsource/n8;", "Lcom/ironsource/p8;", "cappingType", "Lcom/ironsource/lf;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/ironsource/p8;Lcom/ironsource/lf;)Ljava/lang/Object;", "b", "Lcom/ironsource/s9;", "Lcom/ironsource/s9;", "currentTimeProvider", "Lcom/ironsource/mi;", "Lcom/ironsource/mi;", "serviceDataRepository", "", "Ljava/util/Map;", "()Ljava/util/Map;", ch.f24532p, "<init>", "(Lcom/ironsource/s9;Lcom/ironsource/mi;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class qu implements nf, nf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s9 currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mi serviceDataRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, nu> configs;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0003\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0003\u0010\u0015R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0003\u0010\u0019R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u0003\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ironsource/qu$a;", "", "", "a", "", "b", "c", "()Ljava/lang/Long;", "currentNumberOfShows", "currentTime", "currentTimeThreshold", "(IJLjava/lang/Long;)Lcom/ironsource/qu$a;", "", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "d", "()I", "(I)V", "J", "e", "()J", "(J)V", "Ljava/lang/Long;", f.j, "(Ljava/lang/Long;)V", "<init>", "(IJLjava/lang/Long;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int currentNumberOfShows;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long currentTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Long currentTimeThreshold;

        public a(int i2, long j, Long l2) {
            this.currentNumberOfShows = i2;
            this.currentTime = j;
            this.currentTimeThreshold = l2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCurrentNumberOfShows() {
            return this.currentNumberOfShows;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getCurrentTime() {
            return this.currentTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getCurrentTimeThreshold() {
            return this.currentTimeThreshold;
        }

        public final int d() {
            return this.currentNumberOfShows;
        }

        public final long e() {
            return this.currentTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.currentNumberOfShows == aVar.currentNumberOfShows && this.currentTime == aVar.currentTime && Intrinsics.a(this.currentTimeThreshold, aVar.currentTimeThreshold);
        }

        public final Long f() {
            return this.currentTimeThreshold;
        }

        public int hashCode() {
            int iB = androidx.media3.extractor.text.ttml.a.b(Integer.hashCode(this.currentNumberOfShows) * 31, 31, this.currentTime);
            Long l2 = this.currentTimeThreshold;
            return iB + (l2 == null ? 0 : l2.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.currentNumberOfShows + ", currentTime=" + this.currentTime + ", currentTimeThreshold=" + this.currentTimeThreshold + ')';
        }

        public final a a(int currentNumberOfShows, long currentTime, Long currentTimeThreshold) {
            return new a(currentNumberOfShows, currentTime, currentTimeThreshold);
        }

        public static /* synthetic */ a a(a aVar, int i2, long j, Long l2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = aVar.currentNumberOfShows;
            }
            if ((i3 & 2) != 0) {
                j = aVar.currentTime;
            }
            if ((i3 & 4) != 0) {
                l2 = aVar.currentTimeThreshold;
            }
            return aVar.a(i2, j, l2);
        }

        public final void a(int i2) {
            this.currentNumberOfShows = i2;
        }

        public final void a(long j) {
            this.currentTime = j;
        }

        public final void a(Long l2) {
            this.currentTimeThreshold = l2;
        }
    }

    public qu(s9 currentTimeProvider, mi serviceDataRepository) {
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        Intrinsics.f(serviceDataRepository, "serviceDataRepository");
        this.currentTimeProvider = currentTimeProvider;
        this.serviceDataRepository = serviceDataRepository;
        this.configs = new LinkedHashMap();
    }

    private final a c(String identifier) {
        return new a(this.serviceDataRepository.a(identifier), this.currentTimeProvider.a(), this.serviceDataRepository.b(identifier));
    }

    @Override // com.p004ironsource.nf
    public n8 a(String identifier) {
        Intrinsics.f(identifier, "identifier");
        nu nuVar = this.configs.get(identifier);
        if (nuVar != null && a(nuVar, identifier)) {
            return new n8(true, p8.ShowCount);
        }
        return new n8(false, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @Override // com.ironsource.nf.a
    public void b(String identifier) {
        Intrinsics.f(identifier, "identifier");
        nu nuVar = this.configs.get(identifier);
        if (nuVar == null) {
            return;
        }
        a aVarC = c(identifier);
        if (aVarC.d() != 0) {
            long jE = aVarC.e();
            Long lF = aVarC.f();
            if (jE >= (lF != null ? lF.longValue() : 0L)) {
                this.serviceDataRepository.a(o8.a(nuVar.getUnit(), null, 1, null) + aVarC.e(), identifier);
                aVarC.a(0);
            }
        } else {
            this.serviceDataRepository.a(o8.a(nuVar.getUnit(), null, 1, null) + aVarC.e(), identifier);
            aVarC.a(0);
        }
        aVarC.a(aVarC.d() + 1);
        this.serviceDataRepository.a(aVarC.d(), identifier);
    }

    public final Map<String, nu> a() {
        return this.configs;
    }

    private final boolean a(nu config, String identifier) {
        a aVarC = c(identifier);
        Long lF = aVarC.f();
        if (lF != null) {
            long jLongValue = lF.longValue();
            if (aVarC.d() >= config.getMaxImpressions() && this.currentTimeProvider.a() < jLongValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.nf.a
    public Object a(String identifier, p8 cappingType, lf cappingConfig) {
        Intrinsics.f(identifier, "identifier");
        Intrinsics.f(cappingType, "cappingType");
        Intrinsics.f(cappingConfig, "cappingConfig");
        Object objC = cappingConfig.c();
        boolean z2 = objC instanceof Result.Failure;
        Unit unit = Unit.f43263a;
        if (z2) {
            Throwable thA = Result.a(objC);
            if (thA != null) {
                return ResultKt.a(thA);
            }
        } else {
            nu nuVar = (nu) objC;
            if (nuVar != null) {
                this.configs.put(identifier, nuVar);
                return unit;
            }
        }
        return unit;
    }
}
