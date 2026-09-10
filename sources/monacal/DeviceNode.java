package monacal;

import asosan.formularize;
import com.ironsource.C3414a2;
import com.ironsource.L6;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import kotlinx.serialization.UnknownFieldException;
import org.jacoco.core.runtime.AgentOptions;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.coffeecake;
import vinyl.grimness;
import vinyl.hardpan;
import vinyl.immediately;
import vinyl.licking;
import vinyl.seminary;
import vinyl.splinterproof;
import vinyl.vesuvio;

/* JADX INFO: renamed from: monacal.marial, reason: from toString */
/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0003OPQBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0085\u0001\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0088\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001fJ\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010%J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010%\"\u0004\b=\u0010>R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010;\u001a\u0004\b?\u0010%\"\u0004\b@\u0010>R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00105\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010CR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010CR$\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010*\"\u0004\bH\u0010IR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010,\"\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lmonacal/marial;", "", "", L6.t, L6.B, L6.G, L6.Q0, L6.F, "", "w", "h", L6.d0, "ifa", "lmt", "Lmonacal/marial$dern;", "ext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lmonacal/marial$dern;)V", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lmonacal/marial$dern;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/marial;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "component11", "()Lmonacal/marial$dern;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lmonacal/marial$dern;)Lmonacal/marial;", "toString", "hashCode", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMake", "getModel", "getOsv", "getCarrier", "getOs", "I", "getW", "setW", "(I)V", "getH", "setH", "getUa", "setUa", "(Ljava/lang/String;)V", "getIfa", "setIfa", "Ljava/lang/Integer;", "getLmt", "setLmt", "(Ljava/lang/Integer;)V", "Lmonacal/marial$dern;", "getExt", "setExt", "(Lmonacal/marial$dern;)V", "Companion", "attabal", "saneness", "dern", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@formularize
public final /* data */ class DeviceNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String carrier;
    private VungleExt ext;
    private int h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private String ua;
    private int w;

    /* JADX INFO: renamed from: monacal.marial$attabal */
    /* JADX INFO: compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.$serializer", "Lvinyl/grimness;", "Lmonacal/marial;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/marial;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/marial;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @patroclinal.wireman
    public static final class attabal implements grimness<DeviceNode> {
        public static final attabal INSTANCE;
        public static final /* synthetic */ bristol.beachfront descriptor;

        static {
            attabal attabalVar = new attabal();
            INSTANCE = attabalVar;
            vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.DeviceNode", attabalVar, 11);
            vesuvioVar.kowloon(L6.t, false);
            vesuvioVar.kowloon(L6.B, false);
            vesuvioVar.kowloon(L6.G, false);
            vesuvioVar.kowloon(L6.Q0, true);
            vesuvioVar.kowloon(L6.F, false);
            vesuvioVar.kowloon("w", false);
            vesuvioVar.kowloon("h", false);
            vesuvioVar.kowloon(L6.d0, true);
            vesuvioVar.kowloon("ifa", true);
            vesuvioVar.kowloon("lmt", true);
            vesuvioVar.kowloon("ext", true);
            descriptor = vesuvioVar;
        }

        private attabal() {
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] childSerializers() {
            licking lickingVar = licking.f39425attabal;
            asosan.wireman<?> wiremanVarGraveside = defendable.attabal.graveside(lickingVar);
            splinterproof splinterproofVar = splinterproof.f39488attabal;
            return new asosan.wireman[]{lickingVar, lickingVar, lickingVar, wiremanVarGraveside, lickingVar, splinterproofVar, splinterproofVar, defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(splinterproofVar), defendable.attabal.graveside(VungleExt.attabal.INSTANCE)};
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
        public DeviceNode deserialize(fastidiously.marial decoder) {
            int i;
            Object objSealless;
            Object objSealless2;
            Object objSealless3;
            Object objSealless4;
            Object objSealless5;
            int i2;
            int i3;
            String str;
            String str2;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
            int i4 = 10;
            int i5 = 9;
            if (dernVarSaneness.triweekly()) {
                String strFormularize = dernVarSaneness.formularize(descriptor2, 0);
                String strFormularize2 = dernVarSaneness.formularize(descriptor2, 1);
                String strFormularize3 = dernVarSaneness.formularize(descriptor2, 2);
                licking lickingVar = licking.f39425attabal;
                objSealless5 = dernVarSaneness.sealless(descriptor2, 3, lickingVar, null);
                String strFormularize4 = dernVarSaneness.formularize(descriptor2, 4);
                int iYemenite = dernVarSaneness.yemenite(descriptor2, 5);
                int iYemenite2 = dernVarSaneness.yemenite(descriptor2, 6);
                objSealless4 = dernVarSaneness.sealless(descriptor2, 7, lickingVar, null);
                objSealless3 = dernVarSaneness.sealless(descriptor2, 8, lickingVar, null);
                objSealless = dernVarSaneness.sealless(descriptor2, 9, splinterproof.f39488attabal, null);
                objSealless2 = dernVarSaneness.sealless(descriptor2, 10, VungleExt.attabal.INSTANCE, null);
                str = strFormularize;
                i = iYemenite2;
                i2 = iYemenite;
                str4 = strFormularize4;
                str3 = strFormularize3;
                str2 = strFormularize2;
                i3 = 2047;
            } else {
                boolean z = true;
                int iYemenite3 = 0;
                int i6 = 0;
                Object objSealless6 = null;
                Object objSealless7 = null;
                Object objSealless8 = null;
                Object objSealless9 = null;
                String strFormularize5 = null;
                String strFormularize6 = null;
                String strFormularize7 = null;
                String strFormularize8 = null;
                int iYemenite4 = 0;
                Object objSealless10 = null;
                while (z) {
                    int iImpassible = dernVarSaneness.impassible(descriptor2);
                    switch (iImpassible) {
                        case -1:
                            z = false;
                            i4 = 10;
                            break;
                        case 0:
                            strFormularize5 = dernVarSaneness.formularize(descriptor2, 0);
                            i6 |= 1;
                            i4 = 10;
                            i5 = 9;
                            break;
                        case 1:
                            strFormularize6 = dernVarSaneness.formularize(descriptor2, 1);
                            i6 |= 2;
                            i4 = 10;
                            i5 = 9;
                            break;
                        case 2:
                            strFormularize7 = dernVarSaneness.formularize(descriptor2, 2);
                            i6 |= 4;
                            i4 = 10;
                            i5 = 9;
                            break;
                        case 3:
                            objSealless10 = dernVarSaneness.sealless(descriptor2, 3, licking.f39425attabal, objSealless10);
                            i6 |= 8;
                            i4 = 10;
                            i5 = 9;
                            break;
                        case 4:
                            strFormularize8 = dernVarSaneness.formularize(descriptor2, 4);
                            i6 |= 16;
                            i4 = 10;
                            break;
                        case 5:
                            iYemenite4 = dernVarSaneness.yemenite(descriptor2, 5);
                            i6 |= 32;
                            break;
                        case 6:
                            iYemenite3 = dernVarSaneness.yemenite(descriptor2, 6);
                            i6 |= 64;
                            break;
                        case 7:
                            objSealless9 = dernVarSaneness.sealless(descriptor2, 7, licking.f39425attabal, objSealless9);
                            i6 |= 128;
                            break;
                        case 8:
                            objSealless8 = dernVarSaneness.sealless(descriptor2, 8, licking.f39425attabal, objSealless8);
                            i6 |= 256;
                            break;
                        case 9:
                            objSealless6 = dernVarSaneness.sealless(descriptor2, i5, splinterproof.f39488attabal, objSealless6);
                            i6 |= 512;
                            break;
                        case 10:
                            objSealless7 = dernVarSaneness.sealless(descriptor2, i4, VungleExt.attabal.INSTANCE, objSealless7);
                            i6 |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iImpassible);
                    }
                }
                i = iYemenite3;
                objSealless = objSealless6;
                objSealless2 = objSealless7;
                objSealless3 = objSealless8;
                objSealless4 = objSealless9;
                objSealless5 = objSealless10;
                i2 = iYemenite4;
                i3 = i6;
                str = strFormularize5;
                str2 = strFormularize6;
                str3 = strFormularize7;
                str4 = strFormularize8;
            }
            dernVarSaneness.dern(descriptor2);
            return new DeviceNode(i3, str, str2, str3, (String) objSealless5, str4, i2, i, (String) objSealless4, (String) objSealless3, (Integer) objSealless, (VungleExt) objSealless2, (immediately) null);
        }

        @Override // asosan.impassible
        public void serialize(fastidiously.beachfront encoder, DeviceNode value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
            DeviceNode.write$Self(value, wiremanVarSaneness, descriptor2);
            wiremanVarSaneness.dern(descriptor2);
        }
    }

    /* JADX INFO: renamed from: monacal.marial$dern, reason: from toString */
    /* JADX INFO: compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\by\b\u0087\b\u0018\u0000 \u009f\u00012\u00020\u0001:\u0004 \u0001¡\u0001B\u008b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fB\u009f\u0002\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0011\u001a\u00020\b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÇ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010/J\u0010\u00105\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010/J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010/J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010/J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010/J\u0010\u0010<\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b<\u00103J\u0010\u0010=\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b=\u00106J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u0010-J\u0010\u0010?\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b?\u00106J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010-J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bA\u0010/J\u0012\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bB\u0010/J\u0012\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bE\u0010DJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bF\u0010DJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bG\u0010DJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bH\u0010/J\u0094\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bK\u0010/J\u0010\u0010L\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bL\u00106J\u001a\u0010N\u001a\u00020\u00022\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010P\u0012\u0004\bS\u0010T\u001a\u0004\b\u0003\u0010-\"\u0004\bQ\u0010RR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010U\u0012\u0004\bY\u0010T\u001a\u0004\bV\u0010/\"\u0004\bW\u0010XR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010Z\u0012\u0004\b^\u0010T\u001a\u0004\b[\u00101\"\u0004\b\\\u0010]R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010_\u0012\u0004\bc\u0010T\u001a\u0004\b`\u00103\"\u0004\ba\u0010bR*\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010U\u0012\u0004\bf\u0010T\u001a\u0004\bd\u0010/\"\u0004\be\u0010XR(\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010g\u0012\u0004\bk\u0010T\u001a\u0004\bh\u00106\"\u0004\bi\u0010jR*\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010U\u0012\u0004\bn\u0010T\u001a\u0004\bl\u0010/\"\u0004\bm\u0010XR*\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010U\u0012\u0004\bq\u0010T\u001a\u0004\bo\u0010/\"\u0004\bp\u0010XR*\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010U\u0012\u0004\bt\u0010T\u001a\u0004\br\u0010/\"\u0004\bs\u0010XR*\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010U\u0012\u0004\bw\u0010T\u001a\u0004\bu\u0010/\"\u0004\bv\u0010XR*\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010U\u0012\u0004\bz\u0010T\u001a\u0004\bx\u0010/\"\u0004\by\u0010XR(\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010_\u0012\u0004\b}\u0010T\u001a\u0004\b{\u00103\"\u0004\b|\u0010bR)\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0004\b\u0012\u0010g\u0012\u0005\b\u0080\u0001\u0010T\u001a\u0004\b~\u00106\"\u0004\b\u007f\u0010jR*\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b\u0013\u0010P\u0012\u0005\b\u0082\u0001\u0010T\u001a\u0004\b\u0013\u0010-\"\u0005\b\u0081\u0001\u0010RR+\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0014\u0010g\u0012\u0005\b\u0085\u0001\u0010T\u001a\u0005\b\u0083\u0001\u00106\"\u0005\b\u0084\u0001\u0010jR*\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b\u0015\u0010P\u0012\u0005\b\u0087\u0001\u0010T\u001a\u0004\b\u0015\u0010-\"\u0005\b\u0086\u0001\u0010RR-\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0016\u0010U\u0012\u0005\b\u008a\u0001\u0010T\u001a\u0005\b\u0088\u0001\u0010/\"\u0005\b\u0089\u0001\u0010XR-\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0017\u0010U\u0012\u0005\b\u008d\u0001\u0010T\u001a\u0005\b\u008b\u0001\u0010/\"\u0005\b\u008c\u0001\u0010XR/\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0019\u0010\u008e\u0001\u0012\u0005\b\u0092\u0001\u0010T\u001a\u0005\b\u008f\u0001\u0010D\"\u0006\b\u0090\u0001\u0010\u0091\u0001R/\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001a\u0010\u008e\u0001\u0012\u0005\b\u0095\u0001\u0010T\u001a\u0005\b\u0093\u0001\u0010D\"\u0006\b\u0094\u0001\u0010\u0091\u0001R/\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001b\u0010\u008e\u0001\u0012\u0005\b\u0098\u0001\u0010T\u001a\u0005\b\u0096\u0001\u0010D\"\u0006\b\u0097\u0001\u0010\u0091\u0001R/\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001c\u0010\u008e\u0001\u0012\u0005\b\u009b\u0001\u0010T\u001a\u0005\b\u0099\u0001\u0010D\"\u0006\b\u009a\u0001\u0010\u0091\u0001R-\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001d\u0010U\u0012\u0005\b\u009e\u0001\u0010T\u001a\u0005\b\u009c\u0001\u0010/\"\u0005\b\u009d\u0001\u0010X¨\u0006¢\u0001"}, d2 = {"Lmonacal/marial$dern;", "", "", "isGooglePlayServicesAvailable", "", "appSetId", "", "appSetIdScope", "", X3.j.Y, "batteryState", "batterySaverEnabled", "connectionType", "connectionTypeDetail", "locale", "language", "timeZone", "volumeLevel", "soundEnabled", "isTv", X3.j.i0, "isSideloadEnabled", L6.V0, "amazonAdvertisingId", "", "sit", "oit", "ort", "obt", "gpVersion", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/marial$dern;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()F", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/Long;", "component20", "component21", "component22", "component23", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lmonacal/marial$dern;", "toString", "hashCode", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "Z", "setGooglePlayServicesAvailable", "(Z)V", "isGooglePlayServicesAvailable$annotations", "()V", "Ljava/lang/String;", "getAppSetId", "setAppSetId", "(Ljava/lang/String;)V", "getAppSetId$annotations", "Ljava/lang/Integer;", "getAppSetIdScope", "setAppSetIdScope", "(Ljava/lang/Integer;)V", "getAppSetIdScope$annotations", "F", "getBatteryLevel", "setBatteryLevel", "(F)V", "getBatteryLevel$annotations", "getBatteryState", "setBatteryState", "getBatteryState$annotations", "I", "getBatterySaverEnabled", "setBatterySaverEnabled", "(I)V", "getBatterySaverEnabled$annotations", "getConnectionType", "setConnectionType", "getConnectionType$annotations", "getConnectionTypeDetail", "setConnectionTypeDetail", "getConnectionTypeDetail$annotations", "getLocale", "setLocale", "getLocale$annotations", "getLanguage", "setLanguage", "getLanguage$annotations", "getTimeZone", "setTimeZone", "getTimeZone$annotations", "getVolumeLevel", "setVolumeLevel", "getVolumeLevel$annotations", "getSoundEnabled", "setSoundEnabled", "getSoundEnabled$annotations", "setTv", "isTv$annotations", "getSdCardAvailable", "setSdCardAvailable", "getSdCardAvailable$annotations", "setSideloadEnabled", "isSideloadEnabled$annotations", "getGaid", "setGaid", "getGaid$annotations", "getAmazonAdvertisingId", "setAmazonAdvertisingId", "getAmazonAdvertisingId$annotations", "Ljava/lang/Long;", "getSit", "setSit", "(Ljava/lang/Long;)V", "getSit$annotations", "getOit", "setOit", "getOit$annotations", "getOrt", "setOrt", "getOrt$annotations", "getObt", "setObt", "getObt$annotations", "getGpVersion", "setGpVersion", "getGpVersion$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class VungleExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String amazonAdvertisingId;
        private String appSetId;
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private String gaid;
        private String gpVersion;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private Long obt;
        private Long oit;
        private Long ort;
        private int sdCardAvailable;
        private Long sit;
        private int soundEnabled;
        private String timeZone;
        private float volumeLevel;

        /* JADX INFO: renamed from: monacal.marial$dern$attabal */
        /* JADX INFO: compiled from: DeviceNode.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "Lvinyl/grimness;", "Lmonacal/marial$dern;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/marial$dern;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/marial$dern;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<VungleExt> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.DeviceNode.VungleExt", attabalVar, 23);
                vesuvioVar.kowloon("is_google_play_services_available", true);
                vesuvioVar.kowloon("app_set_id", true);
                vesuvioVar.kowloon("app_set_id_scope", true);
                vesuvioVar.kowloon("battery_level", true);
                vesuvioVar.kowloon("battery_state", true);
                vesuvioVar.kowloon("battery_saver_enabled", true);
                vesuvioVar.kowloon("connection_type", true);
                vesuvioVar.kowloon("connection_type_detail", true);
                vesuvioVar.kowloon("locale", true);
                vesuvioVar.kowloon("language", true);
                vesuvioVar.kowloon("time_zone", true);
                vesuvioVar.kowloon("volume_level", true);
                vesuvioVar.kowloon("sound_enabled", true);
                vesuvioVar.kowloon("is_tv", true);
                vesuvioVar.kowloon("sd_card_available", true);
                vesuvioVar.kowloon("is_sideload_enabled", true);
                vesuvioVar.kowloon(L6.V0, true);
                vesuvioVar.kowloon("amazon_advertising_id", true);
                vesuvioVar.kowloon("sit", true);
                vesuvioVar.kowloon("oit", true);
                vesuvioVar.kowloon("ort", true);
                vesuvioVar.kowloon("obt", true);
                vesuvioVar.kowloon("gp_version", true);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                licking lickingVar = licking.f39425attabal;
                asosan.wireman<?> wiremanVarGraveside = defendable.attabal.graveside(lickingVar);
                splinterproof splinterproofVar = splinterproof.f39488attabal;
                asosan.wireman<?> wiremanVarGraveside2 = defendable.attabal.graveside(splinterproofVar);
                asosan.wireman<?> wiremanVarGraveside3 = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside4 = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside5 = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside6 = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside7 = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside8 = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside9 = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside10 = defendable.attabal.graveside(lickingVar);
                coffeecake coffeecakeVar = coffeecake.f39367attabal;
                asosan.wireman<?> wiremanVarGraveside11 = defendable.attabal.graveside(coffeecakeVar);
                asosan.wireman<?> wiremanVarGraveside12 = defendable.attabal.graveside(coffeecakeVar);
                asosan.wireman<?> wiremanVarGraveside13 = defendable.attabal.graveside(coffeecakeVar);
                asosan.wireman<?> wiremanVarGraveside14 = defendable.attabal.graveside(coffeecakeVar);
                asosan.wireman<?> wiremanVarGraveside15 = defendable.attabal.graveside(lickingVar);
                vinyl.taiyuan taiyuanVar = vinyl.taiyuan.f39500attabal;
                seminary seminaryVar = seminary.f39486attabal;
                return new asosan.wireman[]{taiyuanVar, wiremanVarGraveside, wiremanVarGraveside2, seminaryVar, wiremanVarGraveside3, splinterproofVar, wiremanVarGraveside4, wiremanVarGraveside5, wiremanVarGraveside6, wiremanVarGraveside7, wiremanVarGraveside8, seminaryVar, splinterproofVar, taiyuanVar, splinterproofVar, taiyuanVar, wiremanVarGraveside9, wiremanVarGraveside10, wiremanVarGraveside11, wiremanVarGraveside12, wiremanVarGraveside13, wiremanVarGraveside14, wiremanVarGraveside15};
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
            public VungleExt deserialize(fastidiously.marial decoder) {
                Object objSealless;
                Object objSealless2;
                Object objSealless3;
                Object obj;
                Object obj2;
                int i;
                Object obj3;
                Object objSealless4;
                Object objSealless5;
                Object objSealless6;
                Object objSealless7;
                boolean z;
                float f;
                Object objSealless8;
                Object objSealless9;
                int i2;
                boolean z2;
                boolean z3;
                int i3;
                int i4;
                float f2;
                Object objSealless10;
                Object objSealless11;
                Object objSealless12;
                int i5;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                int i6 = 0;
                if (dernVarSaneness.triweekly()) {
                    boolean zRotuma = dernVarSaneness.rotuma(descriptor2, 0);
                    licking lickingVar = licking.f39425attabal;
                    Object objSealless13 = dernVarSaneness.sealless(descriptor2, 1, lickingVar, null);
                    objSealless12 = dernVarSaneness.sealless(descriptor2, 2, splinterproof.f39488attabal, null);
                    float fCutely = dernVarSaneness.cutely(descriptor2, 3);
                    objSealless8 = dernVarSaneness.sealless(descriptor2, 4, lickingVar, null);
                    int iYemenite = dernVarSaneness.yemenite(descriptor2, 5);
                    objSealless10 = dernVarSaneness.sealless(descriptor2, 6, lickingVar, null);
                    objSealless9 = dernVarSaneness.sealless(descriptor2, 7, lickingVar, null);
                    objSealless7 = dernVarSaneness.sealless(descriptor2, 8, lickingVar, null);
                    objSealless6 = dernVarSaneness.sealless(descriptor2, 9, lickingVar, null);
                    objSealless5 = dernVarSaneness.sealless(descriptor2, 10, lickingVar, null);
                    float fCutely2 = dernVarSaneness.cutely(descriptor2, 11);
                    int iYemenite2 = dernVarSaneness.yemenite(descriptor2, 12);
                    boolean zRotuma2 = dernVarSaneness.rotuma(descriptor2, 13);
                    int iYemenite3 = dernVarSaneness.yemenite(descriptor2, 14);
                    boolean zRotuma3 = dernVarSaneness.rotuma(descriptor2, 15);
                    obj = objSealless13;
                    Object objSealless14 = dernVarSaneness.sealless(descriptor2, 16, lickingVar, null);
                    objSealless4 = dernVarSaneness.sealless(descriptor2, 17, lickingVar, null);
                    coffeecake coffeecakeVar = coffeecake.f39367attabal;
                    Object objSealless15 = dernVarSaneness.sealless(descriptor2, 18, coffeecakeVar, null);
                    Object objSealless16 = dernVarSaneness.sealless(descriptor2, 19, coffeecakeVar, null);
                    objSealless11 = dernVarSaneness.sealless(descriptor2, 20, coffeecakeVar, null);
                    Object objSealless17 = dernVarSaneness.sealless(descriptor2, 21, coffeecakeVar, null);
                    objSealless3 = dernVarSaneness.sealless(descriptor2, 22, lickingVar, null);
                    i = 8388607;
                    i2 = iYemenite2;
                    i4 = iYemenite;
                    f2 = fCutely2;
                    obj3 = objSealless15;
                    z = zRotuma3;
                    i3 = iYemenite3;
                    z3 = zRotuma2;
                    z2 = zRotuma;
                    f = fCutely;
                    objSealless = objSealless16;
                    objSealless2 = objSealless17;
                    obj2 = objSealless14;
                } else {
                    objSealless = null;
                    boolean z4 = true;
                    Object objSealless18 = null;
                    Object objSealless19 = null;
                    Object objSealless20 = null;
                    Object objSealless21 = null;
                    Object objSealless22 = null;
                    objSealless2 = null;
                    Object objSealless23 = null;
                    Object objSealless24 = null;
                    Object objSealless25 = null;
                    Object objSealless26 = null;
                    Object objSealless27 = null;
                    Object objSealless28 = null;
                    Object objSealless29 = null;
                    boolean zRotuma4 = false;
                    int iYemenite4 = 0;
                    boolean zRotuma5 = false;
                    boolean zRotuma6 = false;
                    int iYemenite5 = 0;
                    int iYemenite6 = 0;
                    float fCutely3 = 0.0f;
                    float fCutely4 = 0.0f;
                    Object objSealless30 = null;
                    while (z4) {
                        Object obj4 = objSealless22;
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        switch (iImpassible) {
                            case -1:
                                z4 = false;
                                objSealless18 = objSealless18;
                                objSealless28 = objSealless28;
                                objSealless19 = objSealless19;
                                objSealless22 = obj4;
                                break;
                            case 0:
                                zRotuma5 = dernVarSaneness.rotuma(descriptor2, 0);
                                i6 |= 1;
                                objSealless20 = objSealless20;
                                objSealless18 = objSealless18;
                                objSealless28 = objSealless28;
                                objSealless19 = objSealless19;
                                objSealless22 = obj4;
                                break;
                            case 1:
                                objSealless18 = objSealless18;
                                i6 |= 2;
                                objSealless19 = objSealless19;
                                objSealless29 = objSealless29;
                                objSealless22 = obj4;
                                objSealless20 = objSealless20;
                                objSealless28 = dernVarSaneness.sealless(descriptor2, 1, licking.f39425attabal, objSealless28);
                                objSealless18 = objSealless18;
                                break;
                            case 2:
                                objSealless29 = dernVarSaneness.sealless(descriptor2, 2, splinterproof.f39488attabal, objSealless29);
                                i6 |= 4;
                                objSealless19 = objSealless19;
                                objSealless22 = obj4;
                                objSealless20 = objSealless20;
                                objSealless18 = objSealless18;
                                break;
                            case 3:
                                fCutely3 = dernVarSaneness.cutely(descriptor2, 3);
                                i6 |= 8;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                objSealless20 = objSealless20;
                                objSealless18 = objSealless18;
                                break;
                            case 4:
                                objSealless18 = objSealless18;
                                i6 |= 16;
                                objSealless19 = objSealless19;
                                objSealless20 = objSealless20;
                                objSealless22 = dernVarSaneness.sealless(descriptor2, 4, licking.f39425attabal, obj4);
                                objSealless18 = objSealless18;
                                break;
                            case 5:
                                iYemenite6 = dernVarSaneness.yemenite(descriptor2, 5);
                                i6 |= 32;
                                objSealless19 = objSealless19;
                                objSealless18 = objSealless18;
                                objSealless22 = obj4;
                                break;
                            case 6:
                                objSealless19 = dernVarSaneness.sealless(descriptor2, 6, licking.f39425attabal, objSealless19);
                                i6 |= 64;
                                objSealless18 = objSealless18;
                                objSealless22 = obj4;
                                break;
                            case 7:
                                objSealless19 = objSealless19;
                                objSealless20 = dernVarSaneness.sealless(descriptor2, 7, licking.f39425attabal, objSealless20);
                                i6 |= 128;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 8:
                                objSealless19 = objSealless19;
                                objSealless27 = dernVarSaneness.sealless(descriptor2, 8, licking.f39425attabal, objSealless27);
                                i6 |= 256;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 9:
                                objSealless19 = objSealless19;
                                objSealless26 = dernVarSaneness.sealless(descriptor2, 9, licking.f39425attabal, objSealless26);
                                i6 |= 512;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 10:
                                objSealless19 = objSealless19;
                                objSealless25 = dernVarSaneness.sealless(descriptor2, 10, licking.f39425attabal, objSealless25);
                                i6 |= 1024;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 11:
                                objSealless19 = objSealless19;
                                fCutely4 = dernVarSaneness.cutely(descriptor2, 11);
                                i6 |= 2048;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 12:
                                objSealless19 = objSealless19;
                                iYemenite4 = dernVarSaneness.yemenite(descriptor2, 12);
                                i6 |= 4096;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 13:
                                objSealless19 = objSealless19;
                                zRotuma6 = dernVarSaneness.rotuma(descriptor2, 13);
                                i6 |= 8192;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 14:
                                objSealless19 = objSealless19;
                                iYemenite5 = dernVarSaneness.yemenite(descriptor2, 14);
                                i6 |= 16384;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 15:
                                objSealless19 = objSealless19;
                                zRotuma4 = dernVarSaneness.rotuma(descriptor2, 15);
                                i6 |= 32768;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 16:
                                objSealless21 = dernVarSaneness.sealless(descriptor2, 16, licking.f39425attabal, objSealless21);
                                i5 = 65536;
                                i6 |= i5;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 17:
                                objSealless24 = dernVarSaneness.sealless(descriptor2, 17, licking.f39425attabal, objSealless24);
                                i5 = 131072;
                                i6 |= i5;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 18:
                                objSealless23 = dernVarSaneness.sealless(descriptor2, 18, coffeecake.f39367attabal, objSealless23);
                                i5 = Opcodes.ASM4;
                                i6 |= i5;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 19:
                                objSealless = dernVarSaneness.sealless(descriptor2, 19, coffeecake.f39367attabal, objSealless);
                                i5 = Opcodes.ASM8;
                                i6 |= i5;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 20:
                                objSealless30 = dernVarSaneness.sealless(descriptor2, 20, coffeecake.f39367attabal, objSealless30);
                                i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                i6 |= i5;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 21:
                                objSealless2 = dernVarSaneness.sealless(descriptor2, 21, coffeecake.f39367attabal, objSealless2);
                                i5 = 2097152;
                                i6 |= i5;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            case 22:
                                objSealless18 = dernVarSaneness.sealless(descriptor2, 22, licking.f39425attabal, objSealless18);
                                i5 = 4194304;
                                i6 |= i5;
                                objSealless22 = obj4;
                                objSealless19 = objSealless19;
                                break;
                            default:
                                throw new UnknownFieldException(iImpassible);
                        }
                    }
                    objSealless3 = objSealless18;
                    Object obj5 = objSealless20;
                    Object obj6 = objSealless22;
                    Object obj7 = objSealless19;
                    obj = objSealless28;
                    obj2 = objSealless21;
                    i = i6;
                    obj3 = objSealless23;
                    objSealless4 = objSealless24;
                    objSealless5 = objSealless25;
                    objSealless6 = objSealless26;
                    objSealless7 = objSealless27;
                    z = zRotuma4;
                    f = fCutely3;
                    objSealless8 = obj6;
                    objSealless9 = obj5;
                    i2 = iYemenite4;
                    z2 = zRotuma5;
                    z3 = zRotuma6;
                    i3 = iYemenite5;
                    i4 = iYemenite6;
                    f2 = fCutely4;
                    objSealless10 = obj7;
                    objSealless11 = objSealless30;
                    objSealless12 = objSealless29;
                }
                dernVarSaneness.dern(descriptor2);
                return new VungleExt(i, z2, (String) obj, (Integer) objSealless12, f, (String) objSealless8, i4, (String) objSealless10, (String) objSealless9, (String) objSealless7, (String) objSealless6, (String) objSealless5, f2, i2, z3, i3, z, (String) obj2, (String) objSealless4, (Long) obj3, (Long) objSealless, (Long) objSealless11, (Long) objSealless2, (String) objSealless3, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, VungleExt value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                VungleExt.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.marial$dern$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: DeviceNode.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/marial$dern$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/marial$dern;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<VungleExt> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public VungleExt() {
            this(false, (String) null, (Integer) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ VungleExt copy$default(VungleExt vungleExt, boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10, int i4, Object obj) {
            String str11;
            Long l5;
            boolean z4 = (i4 & 1) != 0 ? vungleExt.isGooglePlayServicesAvailable : z;
            String str12 = (i4 & 2) != 0 ? vungleExt.appSetId : str;
            Integer num2 = (i4 & 4) != 0 ? vungleExt.appSetIdScope : num;
            float f3 = (i4 & 8) != 0 ? vungleExt.batteryLevel : f;
            String str13 = (i4 & 16) != 0 ? vungleExt.batteryState : str2;
            int i5 = (i4 & 32) != 0 ? vungleExt.batterySaverEnabled : i;
            String str14 = (i4 & 64) != 0 ? vungleExt.connectionType : str3;
            String str15 = (i4 & 128) != 0 ? vungleExt.connectionTypeDetail : str4;
            String str16 = (i4 & 256) != 0 ? vungleExt.locale : str5;
            String str17 = (i4 & 512) != 0 ? vungleExt.language : str6;
            String str18 = (i4 & 1024) != 0 ? vungleExt.timeZone : str7;
            float f4 = (i4 & 2048) != 0 ? vungleExt.volumeLevel : f2;
            int i6 = (i4 & 4096) != 0 ? vungleExt.soundEnabled : i2;
            boolean z5 = (i4 & 8192) != 0 ? vungleExt.isTv : z2;
            boolean z6 = z4;
            int i7 = (i4 & 16384) != 0 ? vungleExt.sdCardAvailable : i3;
            boolean z7 = (i4 & 32768) != 0 ? vungleExt.isSideloadEnabled : z3;
            String str19 = (i4 & 65536) != 0 ? vungleExt.gaid : str8;
            String str20 = (i4 & 131072) != 0 ? vungleExt.amazonAdvertisingId : str9;
            Long l6 = (i4 & Opcodes.ASM4) != 0 ? vungleExt.sit : l;
            Long l7 = (i4 & Opcodes.ASM8) != 0 ? vungleExt.oit : l2;
            Long l8 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? vungleExt.ort : l3;
            Long l9 = (i4 & 2097152) != 0 ? vungleExt.obt : l4;
            if ((i4 & 4194304) != 0) {
                l5 = l9;
                str11 = vungleExt.gpVersion;
            } else {
                str11 = str10;
                l5 = l9;
            }
            return vungleExt.copy(z6, str12, num2, f3, str13, i5, str14, str15, str16, str17, str18, f4, i6, z5, i7, z7, str19, str20, l6, l7, l8, l5, str11);
        }

        public static final void write$Self(VungleExt self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.isGooglePlayServicesAvailable) {
                output.kowloon(serialDesc, 0, self.isGooglePlayServicesAvailable);
            }
            if (output.cuirassed(serialDesc, 1) || self.appSetId != null) {
                output.taiyuan(serialDesc, 1, licking.f39425attabal, self.appSetId);
            }
            if (output.cuirassed(serialDesc, 2) || self.appSetIdScope != null) {
                output.taiyuan(serialDesc, 2, splinterproof.f39488attabal, self.appSetIdScope);
            }
            if (output.cuirassed(serialDesc, 3) || !Intrinsics.wireman(Float.valueOf(self.batteryLevel), fValueOf)) {
                output.triweekly(serialDesc, 3, self.batteryLevel);
            }
            if (output.cuirassed(serialDesc, 4) || self.batteryState != null) {
                output.taiyuan(serialDesc, 4, licking.f39425attabal, self.batteryState);
            }
            if (output.cuirassed(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.molybdenite(serialDesc, 5, self.batterySaverEnabled);
            }
            if (output.cuirassed(serialDesc, 6) || self.connectionType != null) {
                output.taiyuan(serialDesc, 6, licking.f39425attabal, self.connectionType);
            }
            if (output.cuirassed(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.taiyuan(serialDesc, 7, licking.f39425attabal, self.connectionTypeDetail);
            }
            if (output.cuirassed(serialDesc, 8) || self.locale != null) {
                output.taiyuan(serialDesc, 8, licking.f39425attabal, self.locale);
            }
            if (output.cuirassed(serialDesc, 9) || self.language != null) {
                output.taiyuan(serialDesc, 9, licking.f39425attabal, self.language);
            }
            if (output.cuirassed(serialDesc, 10) || self.timeZone != null) {
                output.taiyuan(serialDesc, 10, licking.f39425attabal, self.timeZone);
            }
            if (output.cuirassed(serialDesc, 11) || !Intrinsics.wireman(Float.valueOf(self.volumeLevel), fValueOf)) {
                output.triweekly(serialDesc, 11, self.volumeLevel);
            }
            if (output.cuirassed(serialDesc, 12) || self.soundEnabled != 1) {
                output.molybdenite(serialDesc, 12, self.soundEnabled);
            }
            if (output.cuirassed(serialDesc, 13) || self.isTv) {
                output.kowloon(serialDesc, 13, self.isTv);
            }
            if (output.cuirassed(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.molybdenite(serialDesc, 14, self.sdCardAvailable);
            }
            if (output.cuirassed(serialDesc, 15) || self.isSideloadEnabled) {
                output.kowloon(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.cuirassed(serialDesc, 16) || self.gaid != null) {
                output.taiyuan(serialDesc, 16, licking.f39425attabal, self.gaid);
            }
            if (output.cuirassed(serialDesc, 17) || self.amazonAdvertisingId != null) {
                output.taiyuan(serialDesc, 17, licking.f39425attabal, self.amazonAdvertisingId);
            }
            if (output.cuirassed(serialDesc, 18) || self.sit != null) {
                output.taiyuan(serialDesc, 18, coffeecake.f39367attabal, self.sit);
            }
            if (output.cuirassed(serialDesc, 19) || self.oit != null) {
                output.taiyuan(serialDesc, 19, coffeecake.f39367attabal, self.oit);
            }
            if (output.cuirassed(serialDesc, 20) || self.ort != null) {
                output.taiyuan(serialDesc, 20, coffeecake.f39367attabal, self.ort);
            }
            if (output.cuirassed(serialDesc, 21) || self.obt != null) {
                output.taiyuan(serialDesc, 21, coffeecake.f39367attabal, self.obt);
            }
            if (!output.cuirassed(serialDesc, 22) && self.gpVersion == null) {
                return;
            }
            output.taiyuan(serialDesc, 22, licking.f39425attabal, self.gpVersion);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTimeZone() {
            return this.timeZone;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getIsTv() {
            return this.isTv;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getIsSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getGaid() {
            return this.gaid;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Long getSit() {
            return this.sit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Long getOit() {
            return this.oit;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Long getOrt() {
            return this.ort;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Long getObt() {
            return this.obt;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getGpVersion() {
            return this.gpVersion;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBatteryState() {
            return this.batteryState;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getConnectionType() {
            return this.connectionType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        public final VungleExt copy(boolean isGooglePlayServicesAvailable, String appSetId, Integer appSetIdScope, float batteryLevel, String batteryState, int batterySaverEnabled, String connectionType, String connectionTypeDetail, String locale, String language, String timeZone, float volumeLevel, int soundEnabled, boolean isTv, int sdCardAvailable, boolean isSideloadEnabled, String gaid, String amazonAdvertisingId, Long sit, Long oit, Long ort, Long obt, String gpVersion) {
            return new VungleExt(isGooglePlayServicesAvailable, appSetId, appSetIdScope, batteryLevel, batteryState, batterySaverEnabled, connectionType, connectionTypeDetail, locale, language, timeZone, volumeLevel, soundEnabled, isTv, sdCardAvailable, isSideloadEnabled, gaid, amazonAdvertisingId, sit, oit, ort, obt, gpVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) other;
            return this.isGooglePlayServicesAvailable == vungleExt.isGooglePlayServicesAvailable && Intrinsics.wireman(this.appSetId, vungleExt.appSetId) && Intrinsics.wireman(this.appSetIdScope, vungleExt.appSetIdScope) && Intrinsics.wireman(Float.valueOf(this.batteryLevel), Float.valueOf(vungleExt.batteryLevel)) && Intrinsics.wireman(this.batteryState, vungleExt.batteryState) && this.batterySaverEnabled == vungleExt.batterySaverEnabled && Intrinsics.wireman(this.connectionType, vungleExt.connectionType) && Intrinsics.wireman(this.connectionTypeDetail, vungleExt.connectionTypeDetail) && Intrinsics.wireman(this.locale, vungleExt.locale) && Intrinsics.wireman(this.language, vungleExt.language) && Intrinsics.wireman(this.timeZone, vungleExt.timeZone) && Intrinsics.wireman(Float.valueOf(this.volumeLevel), Float.valueOf(vungleExt.volumeLevel)) && this.soundEnabled == vungleExt.soundEnabled && this.isTv == vungleExt.isTv && this.sdCardAvailable == vungleExt.sdCardAvailable && this.isSideloadEnabled == vungleExt.isSideloadEnabled && Intrinsics.wireman(this.gaid, vungleExt.gaid) && Intrinsics.wireman(this.amazonAdvertisingId, vungleExt.amazonAdvertisingId) && Intrinsics.wireman(this.sit, vungleExt.sit) && Intrinsics.wireman(this.oit, vungleExt.oit) && Intrinsics.wireman(this.ort, vungleExt.ort) && Intrinsics.wireman(this.obt, vungleExt.obt) && Intrinsics.wireman(this.gpVersion, vungleExt.gpVersion);
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public final String getGpVersion() {
            return this.gpVersion;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Long getObt() {
            return this.obt;
        }

        public final Long getOit() {
            return this.oit;
        }

        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v27, types: [int] */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r2v33, types: [int] */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v46 */
        public int hashCode() {
            boolean z = this.isGooglePlayServicesAvailable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.appSetId;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.hashCode(this.batteryLevel)) * 31;
            String str2 = this.batteryState;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.batterySaverEnabled)) * 31;
            String str3 = this.connectionType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.hashCode(this.volumeLevel)) * 31) + Integer.hashCode(this.soundEnabled)) * 31;
            boolean z2 = this.isTv;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int iHashCode9 = (((iHashCode8 + r2) * 31) + Integer.hashCode(this.sdCardAvailable)) * 31;
            boolean z3 = this.isSideloadEnabled;
            int i2 = (iHashCode9 + (z3 ? 1 : z3)) * 31;
            String str8 = this.gaid;
            int iHashCode10 = (i2 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l = this.sit;
            int iHashCode12 = (iHashCode11 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.oit;
            int iHashCode13 = (iHashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.ort;
            int iHashCode14 = (iHashCode13 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Long l4 = this.obt;
            int iHashCode15 = (iHashCode14 + (l4 == null ? 0 : l4.hashCode())) * 31;
            String str10 = this.gpVersion;
            return iHashCode15 + (str10 != null ? str10.hashCode() : 0);
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f) {
            this.batteryLevel = f;
        }

        public final void setBatterySaverEnabled(int i) {
            this.batterySaverEnabled = i;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z) {
            this.isGooglePlayServicesAvailable = z;
        }

        public final void setGpVersion(String str) {
            this.gpVersion = str;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final void setObt(Long l) {
            this.obt = l;
        }

        public final void setOit(Long l) {
            this.oit = l;
        }

        public final void setOrt(Long l) {
            this.ort = l;
        }

        public final void setSdCardAvailable(int i) {
            this.sdCardAvailable = i;
        }

        public final void setSideloadEnabled(boolean z) {
            this.isSideloadEnabled = z;
        }

        public final void setSit(Long l) {
            this.sit = l;
        }

        public final void setSoundEnabled(int i) {
            this.soundEnabled = i;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z) {
            this.isTv = z;
        }

        public final void setVolumeLevel(float f) {
            this.volumeLevel = f;
        }

        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ", gpVersion=" + this.gpVersion + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ VungleExt(int i, boolean z, String str, Integer num, float f, String str2, int i2, String str3, String str4, String str5, String str6, String str7, float f2, int i3, boolean z2, int i4, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z;
            }
            if ((i & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i & 8) == 0) {
                this.batteryLevel = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                this.batteryLevel = f;
            }
            if ((i & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i2;
            }
            if ((i & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i & 2048) == 0) {
                this.volumeLevel = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                this.volumeLevel = f2;
            }
            if ((i & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i3;
            }
            if ((i & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z2;
            }
            if ((i & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i4;
            }
            if ((32768 & i) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z3;
            }
            if ((65536 & i) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i) == 0) {
                this.sit = null;
            } else {
                this.sit = l;
            }
            if ((524288 & i) == 0) {
                this.oit = null;
            } else {
                this.oit = l2;
            }
            if ((1048576 & i) == 0) {
                this.ort = null;
            } else {
                this.ort = l3;
            }
            if ((2097152 & i) == 0) {
                this.obt = null;
            } else {
                this.obt = l4;
            }
            if ((i & 4194304) == 0) {
                this.gpVersion = null;
            } else {
                this.gpVersion = str10;
            }
        }

        public VungleExt(boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10) {
            this.isGooglePlayServicesAvailable = z;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f;
            this.batteryState = str2;
            this.batterySaverEnabled = i;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f2;
            this.soundEnabled = i2;
            this.isTv = z2;
            this.sdCardAvailable = i3;
            this.isSideloadEnabled = z3;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l;
            this.oit = l2;
            this.ort = l3;
            this.obt = l4;
            this.gpVersion = str10;
        }

        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getBatteryState$annotations() {
        }

        public static /* synthetic */ void getConnectionType$annotations() {
        }

        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        public static /* synthetic */ void getGaid$annotations() {
        }

        public static /* synthetic */ void getGpVersion$annotations() {
        }

        public static /* synthetic */ void getLanguage$annotations() {
        }

        public static /* synthetic */ void getLocale$annotations() {
        }

        public static /* synthetic */ void getObt$annotations() {
        }

        public static /* synthetic */ void getOit$annotations() {
        }

        public static /* synthetic */ void getOrt$annotations() {
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSit$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void getTimeZone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        public static /* synthetic */ void isTv$annotations() {
        }

        public /* synthetic */ VungleExt(boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : num, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : str5, (i4 & 512) != 0 ? null : str6, (i4 & 1024) != 0 ? null : str7, (i4 & 2048) == 0 ? f2 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i4 & 4096) != 0 ? 1 : i2, (i4 & 8192) != 0 ? false : z2, (i4 & 16384) == 0 ? i3 : 1, (32768 & i4) != 0 ? false : z3, (i4 & 65536) != 0 ? null : str8, (i4 & 131072) != 0 ? null : str9, (i4 & Opcodes.ASM4) != 0 ? null : l, (i4 & Opcodes.ASM8) != 0 ? null : l2, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : l3, (i4 & 2097152) != 0 ? null : l4, (i4 & 4194304) != 0 ? null : str10);
        }
    }

    /* JADX INFO: renamed from: monacal.marial$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/marial$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/marial;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final asosan.wireman<DeviceNode> serializer() {
            return attabal.INSTANCE;
        }

        private Companion() {
        }
    }

    @patroclinal.wireman
    public /* synthetic */ DeviceNode(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, VungleExt vungleExt, immediately immediatelyVar) {
        if (119 != (i & 119)) {
            hardpan.attabal(i, 119, attabal.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i2;
        this.h = i3;
        if ((i & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = vungleExt;
        }
    }

    public static /* synthetic */ DeviceNode copy$default(DeviceNode deviceNode, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, VungleExt vungleExt, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = deviceNode.make;
        }
        if ((i3 & 2) != 0) {
            str2 = deviceNode.model;
        }
        if ((i3 & 4) != 0) {
            str3 = deviceNode.osv;
        }
        if ((i3 & 8) != 0) {
            str4 = deviceNode.carrier;
        }
        if ((i3 & 16) != 0) {
            str5 = deviceNode.os;
        }
        if ((i3 & 32) != 0) {
            i = deviceNode.w;
        }
        if ((i3 & 64) != 0) {
            i2 = deviceNode.h;
        }
        if ((i3 & 128) != 0) {
            str6 = deviceNode.ua;
        }
        if ((i3 & 256) != 0) {
            str7 = deviceNode.ifa;
        }
        if ((i3 & 512) != 0) {
            num = deviceNode.lmt;
        }
        if ((i3 & 1024) != 0) {
            vungleExt = deviceNode.ext;
        }
        Integer num2 = num;
        VungleExt vungleExt2 = vungleExt;
        String str8 = str6;
        String str9 = str7;
        int i4 = i;
        int i5 = i2;
        String str10 = str5;
        String str11 = str3;
        return deviceNode.copy(str, str2, str11, str4, str10, i4, i5, str8, str9, num2, vungleExt2);
    }

    public static final void write$Self(DeviceNode self, fastidiously.wireman output, bristol.beachfront serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.stratoscope(serialDesc, 0, self.make);
        output.stratoscope(serialDesc, 1, self.model);
        output.stratoscope(serialDesc, 2, self.osv);
        if (output.cuirassed(serialDesc, 3) || self.carrier != null) {
            output.taiyuan(serialDesc, 3, licking.f39425attabal, self.carrier);
        }
        output.stratoscope(serialDesc, 4, self.os);
        output.molybdenite(serialDesc, 5, self.w);
        output.molybdenite(serialDesc, 6, self.h);
        if (output.cuirassed(serialDesc, 7) || self.ua != null) {
            output.taiyuan(serialDesc, 7, licking.f39425attabal, self.ua);
        }
        if (output.cuirassed(serialDesc, 8) || self.ifa != null) {
            output.taiyuan(serialDesc, 8, licking.f39425attabal, self.ifa);
        }
        if (output.cuirassed(serialDesc, 9) || self.lmt != null) {
            output.taiyuan(serialDesc, 9, splinterproof.f39488attabal, self.lmt);
        }
        if (!output.cuirassed(serialDesc, 10) && self.ext == null) {
            return;
        }
        output.taiyuan(serialDesc, 10, VungleExt.attabal.INSTANCE, self.ext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getLmt() {
        return this.lmt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VungleExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOsv() {
        return this.osv;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    public final DeviceNode copy(String make, String model, String osv, String carrier, String os, int w, int h, String ua, String ifa, Integer lmt, VungleExt ext) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        return new DeviceNode(make, model, osv, carrier, os, w, h, ua, ifa, lmt, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) other;
        return Intrinsics.wireman(this.make, deviceNode.make) && Intrinsics.wireman(this.model, deviceNode.model) && Intrinsics.wireman(this.osv, deviceNode.osv) && Intrinsics.wireman(this.carrier, deviceNode.carrier) && Intrinsics.wireman(this.os, deviceNode.os) && this.w == deviceNode.w && this.h == deviceNode.h && Intrinsics.wireman(this.ua, deviceNode.ua) && Intrinsics.wireman(this.ifa, deviceNode.ifa) && Intrinsics.wireman(this.lmt, deviceNode.lmt) && Intrinsics.wireman(this.ext, deviceNode.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final VungleExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        int iHashCode = ((((this.make.hashCode() * 31) + this.model.hashCode()) * 31) + this.osv.hashCode()) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.os.hashCode()) * 31) + Integer.hashCode(this.w)) * 31) + Integer.hashCode(this.h)) * 31;
        String str2 = this.ua;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        VungleExt vungleExt = this.ext;
        return iHashCode5 + (vungleExt != null ? vungleExt.hashCode() : 0);
    }

    public final void setExt(VungleExt vungleExt) {
        this.ext = vungleExt;
    }

    public final void setH(int i) {
        this.h = i;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.ua = str;
    }

    public final void setW(int i) {
        this.w = i;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public DeviceNode(String make, String model, String osv, String str, String os, int i, int i2, String str2, String str3, Integer num, VungleExt vungleExt) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.os = os;
        this.w = i;
        this.h = i2;
        this.ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = vungleExt;
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, VungleExt vungleExt, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : str4, str5, i, i2, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? null : vungleExt);
    }
}
