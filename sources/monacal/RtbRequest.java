package monacal;

import asosan.formularize;
import com.ironsource.C3414a2;
import kotlinx.serialization.UnknownFieldException;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.grimness;
import vinyl.immediately;
import vinyl.licking;
import vinyl.vesuvio;

/* JADX INFO: renamed from: monacal.taiyuan, reason: from toString */
/* JADX INFO: compiled from: RtbToken.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014¨\u0006%"}, d2 = {"Lmonacal/taiyuan;", "", "", "sdkUserAgent", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/taiyuan;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lmonacal/taiyuan;", "toString", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSdkUserAgent", "getSdkUserAgent$annotations", "()V", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@formularize
public final /* data */ class RtbRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String sdkUserAgent;

    /* JADX INFO: renamed from: monacal.taiyuan$attabal */
    /* JADX INFO: compiled from: RtbToken.kt */
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/RtbRequest.$serializer", "Lvinyl/grimness;", "Lmonacal/taiyuan;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/taiyuan;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/taiyuan;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @patroclinal.wireman
    public static final class attabal implements grimness<RtbRequest> {
        public static final attabal INSTANCE;
        public static final /* synthetic */ bristol.beachfront descriptor;

        static {
            attabal attabalVar = new attabal();
            INSTANCE = attabalVar;
            vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.RtbRequest", attabalVar, 1);
            vesuvioVar.kowloon("sdk_user_agent", true);
            descriptor = vesuvioVar;
        }

        private attabal() {
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] childSerializers() {
            return new asosan.wireman[]{defendable.attabal.graveside(licking.f39425attabal)};
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
        public RtbRequest deserialize(fastidiously.marial decoder) {
            Object objSealless;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
            int i = 1;
            immediately immediatelyVar = null;
            if (dernVarSaneness.triweekly()) {
                objSealless = dernVarSaneness.sealless(descriptor2, 0, licking.f39425attabal, null);
            } else {
                boolean z = true;
                int i2 = 0;
                objSealless = null;
                while (z) {
                    int iImpassible = dernVarSaneness.impassible(descriptor2);
                    if (iImpassible == -1) {
                        z = false;
                    } else {
                        if (iImpassible != 0) {
                            throw new UnknownFieldException(iImpassible);
                        }
                        objSealless = dernVarSaneness.sealless(descriptor2, 0, licking.f39425attabal, objSealless);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            dernVarSaneness.dern(descriptor2);
            return new RtbRequest(i, (String) objSealless, immediatelyVar);
        }

        @Override // asosan.impassible
        public void serialize(fastidiously.beachfront encoder, RtbRequest value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
            RtbRequest.write$Self(value, wiremanVarSaneness, descriptor2);
            wiremanVarSaneness.dern(descriptor2);
        }
    }

    /* JADX INFO: renamed from: monacal.taiyuan$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RtbToken.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/taiyuan$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/taiyuan;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final asosan.wireman<RtbRequest> serializer() {
            return attabal.INSTANCE;
        }

        private Companion() {
        }
    }

    public RtbRequest() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ RtbRequest copy$default(RtbRequest rtbRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rtbRequest.sdkUserAgent;
        }
        return rtbRequest.copy(str);
    }

    public static final void write$Self(RtbRequest self, fastidiously.wireman output, bristol.beachfront serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.cuirassed(serialDesc, 0) && self.sdkUserAgent == null) {
            return;
        }
        output.taiyuan(serialDesc, 0, licking.f39425attabal, self.sdkUserAgent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public final RtbRequest copy(String sdkUserAgent) {
        return new RtbRequest(sdkUserAgent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RtbRequest) && Intrinsics.wireman(this.sdkUserAgent, ((RtbRequest) other).sdkUserAgent);
    }

    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "RtbRequest(sdkUserAgent=" + this.sdkUserAgent + ')';
    }

    @patroclinal.wireman
    public /* synthetic */ RtbRequest(int i, String str, immediately immediatelyVar) {
        if ((i & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public RtbRequest(String str) {
        this.sdkUserAgent = str;
    }

    public /* synthetic */ RtbRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }
}
