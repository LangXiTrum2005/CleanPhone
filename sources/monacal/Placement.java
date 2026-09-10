package monacal;

import asosan.formularize;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import kotlinx.serialization.UnknownFieldException;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.grimness;
import vinyl.hardpan;
import vinyl.immediately;
import vinyl.licking;
import vinyl.vesuvio;

/* JADX INFO: renamed from: monacal.impromptu, reason: from toString */
/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b#\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB=\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0017J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J0\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010#R*\u00107\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u00108\u0012\u0004\b=\u00101\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lmonacal/impromptu;", "", "", "referenceId", "", "headerBidding", "type", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/impromptu;Lfastidiously/wireman;Lbristol/beachfront;)V", "isNative", "()Z", "isInline", X3.w, "isMREC", "isInterstitial", "isAppOpen", "isRewardedVideo", "", "sleepTime", "snooze", "(J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lmonacal/impromptu;", "toString", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReferenceId", "getReferenceId$annotations", "()V", "Z", "getHeaderBidding", "getHeaderBidding$annotations", "getType", "getType$annotations", "wakeupTime", "Ljava/lang/Long;", "getWakeupTime", "()Ljava/lang/Long;", "setWakeupTime", "(Ljava/lang/Long;)V", "getWakeupTime$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@formularize
public final /* data */ class Placement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean headerBidding;
    private final String referenceId;
    private final String type;
    private Long wakeupTime;

    /* JADX INFO: renamed from: monacal.impromptu$attabal */
    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/Placement.$serializer", "Lvinyl/grimness;", "Lmonacal/impromptu;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/impromptu;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/impromptu;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @patroclinal.wireman
    public static final class attabal implements grimness<Placement> {
        public static final attabal INSTANCE;
        public static final /* synthetic */ bristol.beachfront descriptor;

        static {
            attabal attabalVar = new attabal();
            INSTANCE = attabalVar;
            vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.Placement", attabalVar, 3);
            vesuvioVar.kowloon("placement_ref_id", false);
            vesuvioVar.kowloon("is_hb", true);
            vesuvioVar.kowloon("type", true);
            descriptor = vesuvioVar;
        }

        private attabal() {
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] childSerializers() {
            licking lickingVar = licking.f39425attabal;
            return new asosan.wireman[]{lickingVar, vinyl.taiyuan.f39500attabal, defendable.attabal.graveside(lickingVar)};
        }

        @Override // asosan.wireman, asosan.impassible, asosan.dern
        public bristol.beachfront getDescriptor() {
            return descriptor;
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] typeParametersSerializers() {
            return grimness.attabal.attabal(this);
        }

        @Override // asosan.dern
        public Placement deserialize(fastidiously.marial decoder) {
            boolean z;
            int i;
            String str;
            Object objSealless;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
            if (dernVarSaneness.triweekly()) {
                String strFormularize = dernVarSaneness.formularize(descriptor2, 0);
                boolean zRotuma = dernVarSaneness.rotuma(descriptor2, 1);
                objSealless = dernVarSaneness.sealless(descriptor2, 2, licking.f39425attabal, null);
                str = strFormularize;
                z = zRotuma;
                i = 7;
            } else {
                boolean z2 = true;
                boolean zRotuma2 = false;
                String strFormularize2 = null;
                Object objSealless2 = null;
                int i2 = 0;
                while (z2) {
                    int iImpassible = dernVarSaneness.impassible(descriptor2);
                    if (iImpassible == -1) {
                        z2 = false;
                    } else if (iImpassible == 0) {
                        strFormularize2 = dernVarSaneness.formularize(descriptor2, 0);
                        i2 |= 1;
                    } else if (iImpassible == 1) {
                        zRotuma2 = dernVarSaneness.rotuma(descriptor2, 1);
                        i2 |= 2;
                    } else {
                        if (iImpassible != 2) {
                            throw new UnknownFieldException(iImpassible);
                        }
                        objSealless2 = dernVarSaneness.sealless(descriptor2, 2, licking.f39425attabal, objSealless2);
                        i2 |= 4;
                    }
                }
                z = zRotuma2;
                i = i2;
                str = strFormularize2;
                objSealless = objSealless2;
            }
            dernVarSaneness.dern(descriptor2);
            return new Placement(i, str, z, (String) objSealless, (immediately) null);
        }

        @Override // asosan.impassible
        public void serialize(fastidiously.beachfront encoder, Placement value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
            Placement.write$Self(value, wiremanVarSaneness, descriptor2);
            wiremanVarSaneness.dern(descriptor2);
        }
    }

    /* JADX INFO: renamed from: monacal.impromptu$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/impromptu$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/impromptu;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final asosan.wireman<Placement> serializer() {
            return attabal.INSTANCE;
        }

        private Companion() {
        }
    }

    @patroclinal.wireman
    public /* synthetic */ Placement(int i, String str, boolean z, String str2, immediately immediatelyVar) {
        if (1 != (i & 1)) {
            hardpan.attabal(i, 1, attabal.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        if ((i & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placement.referenceId;
        }
        if ((i & 2) != 0) {
            z = placement.headerBidding;
        }
        if ((i & 4) != 0) {
            str2 = placement.type;
        }
        return placement.copy(str, z, str2);
    }

    public static final void write$Self(Placement self, fastidiously.wireman output, bristol.beachfront serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.stratoscope(serialDesc, 0, self.referenceId);
        if (output.cuirassed(serialDesc, 1) || self.headerBidding) {
            output.kowloon(serialDesc, 1, self.headerBidding);
        }
        if (!output.cuirassed(serialDesc, 2) && self.type == null) {
            return;
        }
        output.taiyuan(serialDesc, 2, licking.f39425attabal, self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Placement copy(String referenceId, boolean headerBidding, String type) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        return new Placement(referenceId, headerBidding, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) other;
        return Intrinsics.wireman(this.referenceId, placement.referenceId) && this.headerBidding == placement.headerBidding && Intrinsics.wireman(this.type, placement.type);
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z = this.headerBidding;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        String str = this.type;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final boolean isAppOpen() {
        return Intrinsics.wireman(this.type, com.vungle.ads.internal.saneness.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return Intrinsics.wireman(this.type, "banner");
    }

    public final boolean isInline() {
        return Intrinsics.wireman(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return Intrinsics.wireman(this.type, "interstitial");
    }

    public final boolean isMREC() {
        return Intrinsics.wireman(this.type, "mrec");
    }

    public final boolean isNative() {
        return Intrinsics.wireman(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return Intrinsics.wireman(this.type, "rewarded");
    }

    public final void setWakeupTime(Long l) {
        this.wakeupTime = l;
    }

    public final void snooze(long sleepTime) {
        this.wakeupTime = Long.valueOf(System.currentTimeMillis() + (sleepTime * ((long) 1000)));
    }

    public String toString() {
        return "Placement(referenceId=" + this.referenceId + ", headerBidding=" + this.headerBidding + ", type=" + this.type + ')';
    }

    public Placement(String referenceId, boolean z, String str) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.referenceId = referenceId;
        this.headerBidding = z;
        this.type = str;
    }

    public /* synthetic */ Placement(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }
}
