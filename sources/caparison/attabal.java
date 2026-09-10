package caparison;

import asosan.formularize;
import bristol.beachfront;
import com.ironsource.Y9;
import com.vungle.ads.fpd.AgeRange;
import com.vungle.ads.fpd.LiftoffGender;
import fastidiously.marial;
import kotlinx.serialization.UnknownFieldException;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.grimness;
import vinyl.immediately;
import vinyl.splinterproof;
import vinyl.vesuvio;

/* JADX INFO: compiled from: Demographic.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b \u0010\u0003R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u0012\u0004\b!\u0010\u0003¨\u0006%"}, d2 = {"Lcaparison/attabal;", "", "<init>", "()V", "", "seen1", "ageRange", "gender", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lcaparison/attabal;Lfastidiously/wireman;Lbristol/beachfront;)V", "Lcom/vungle/ads/fpd/LiftoffGender;", "setGender", "(Lcom/vungle/ads/fpd/LiftoffGender;)Lcaparison/attabal;", Y9.m, "setAgeRange", "(I)Lcaparison/attabal;", "lengthOfResidence", "setLengthOfResidence", "homeValue", "setMedianHomeValueUSD", "housingCost", "setMonthlyHousingCosts", "Ljava/lang/Integer;", "getAgeRange$annotations", "getGender$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@formularize
public final class attabal {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer ageRange;
    private Integer gender;

    /* JADX INFO: renamed from: caparison.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Demographic.kt */
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/fpd/Demographic.$serializer", "Lvinyl/grimness;", "Lcaparison/attabal;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lcaparison/attabal;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lcaparison/attabal;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @patroclinal.wireman
    public static final class C0137attabal implements grimness<attabal> {
        public static final C0137attabal INSTANCE;
        public static final /* synthetic */ beachfront descriptor;

        static {
            C0137attabal c0137attabal = new C0137attabal();
            INSTANCE = c0137attabal;
            vesuvio vesuvioVar = new vesuvio("com.vungle.ads.fpd.Demographic", c0137attabal, 2);
            vesuvioVar.kowloon("age_range", true);
            vesuvioVar.kowloon("gender", true);
            descriptor = vesuvioVar;
        }

        private C0137attabal() {
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] childSerializers() {
            splinterproof splinterproofVar = splinterproof.f39488attabal;
            return new asosan.wireman[]{defendable.attabal.graveside(splinterproofVar), defendable.attabal.graveside(splinterproofVar)};
        }

        @Override // asosan.dern
        public attabal deserialize(marial decoder) {
            Object objSealless;
            int i;
            Object objSealless2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            beachfront descriptor2 = getDescriptor();
            fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
            immediately immediatelyVar = null;
            if (dernVarSaneness.triweekly()) {
                splinterproof splinterproofVar = splinterproof.f39488attabal;
                objSealless2 = dernVarSaneness.sealless(descriptor2, 0, splinterproofVar, null);
                objSealless = dernVarSaneness.sealless(descriptor2, 1, splinterproofVar, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                objSealless = null;
                Object objSealless3 = null;
                while (z) {
                    int iImpassible = dernVarSaneness.impassible(descriptor2);
                    if (iImpassible == -1) {
                        z = false;
                    } else if (iImpassible == 0) {
                        objSealless3 = dernVarSaneness.sealless(descriptor2, 0, splinterproof.f39488attabal, objSealless3);
                        i2 |= 1;
                    } else {
                        if (iImpassible != 1) {
                            throw new UnknownFieldException(iImpassible);
                        }
                        objSealless = dernVarSaneness.sealless(descriptor2, 1, splinterproof.f39488attabal, objSealless);
                        i2 |= 2;
                    }
                }
                i = i2;
                objSealless2 = objSealless3;
            }
            dernVarSaneness.dern(descriptor2);
            return new attabal(i, (Integer) objSealless2, (Integer) objSealless, immediatelyVar);
        }

        @Override // asosan.wireman, asosan.impassible, asosan.dern
        public beachfront getDescriptor() {
            return descriptor;
        }

        @Override // asosan.impassible
        public void serialize(fastidiously.beachfront encoder, attabal value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            beachfront descriptor2 = getDescriptor();
            fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
            attabal.write$Self(value, wiremanVarSaneness, descriptor2);
            wiremanVarSaneness.dern(descriptor2);
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] typeParametersSerializers() {
            return grimness.attabal.attabal(this);
        }
    }

    /* JADX INFO: renamed from: caparison.attabal$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Demographic.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcaparison/attabal$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lcaparison/attabal;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final asosan.wireman<attabal> serializer() {
            return C0137attabal.INSTANCE;
        }

        private Companion() {
        }
    }

    public attabal() {
    }

    public static final void write$Self(attabal self, fastidiously.wireman output, beachfront serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.cuirassed(serialDesc, 0) || self.ageRange != null) {
            output.taiyuan(serialDesc, 0, splinterproof.f39488attabal, self.ageRange);
        }
        if (!output.cuirassed(serialDesc, 1) && self.gender == null) {
            return;
        }
        output.taiyuan(serialDesc, 1, splinterproof.f39488attabal, self.gender);
    }

    public final attabal setAgeRange(int age) {
        this.ageRange = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    public final attabal setGender(LiftoffGender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.gender = Integer.valueOf(gender.getValue());
        return this;
    }

    @patroclinal.wireman
    public /* synthetic */ attabal(int i, Integer num, Integer num2, immediately immediatelyVar) {
        if ((i & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num2;
        }
    }

    private static /* synthetic */ void getAgeRange$annotations() {
    }

    private static /* synthetic */ void getGender$annotations() {
    }

    @patroclinal.wireman
    public final attabal setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    @patroclinal.wireman
    public final attabal setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    @patroclinal.wireman
    public final attabal setMonthlyHousingCosts(int housingCost) {
        return this;
    }
}
