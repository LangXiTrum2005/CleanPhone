package monacal;

import asosan.formularize;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C3414a2;
import com.ironsource.C3622ld;
import com.ironsource.Ta;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.coffeecake;
import vinyl.grimness;
import vinyl.hardpan;
import vinyl.immediately;
import vinyl.licking;
import vinyl.splinterproof;
import vinyl.trm;
import vinyl.vesuvio;

/* JADX INFO: renamed from: monacal.wireman, reason: from toString */
/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u000b?@ABCDEFGHIB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JJ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\"\"\u0004\b8\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010$\"\u0004\b<\u0010=¨\u0006J"}, d2 = {"Lmonacal/wireman;", "", "Lmonacal/marial;", X3.i.G, "Lmonacal/dern;", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "Lmonacal/wireman$apical;", "user", "Lmonacal/wireman$taiyuan;", "ext", "Lmonacal/wireman$cutely;", AdActivity.REQUEST_KEY_EXTRA, "<init>", "(Lmonacal/marial;Lmonacal/dern;Lmonacal/wireman$apical;Lmonacal/wireman$taiyuan;Lmonacal/wireman$cutely;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILmonacal/marial;Lmonacal/dern;Lmonacal/wireman$apical;Lmonacal/wireman$taiyuan;Lmonacal/wireman$cutely;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Lmonacal/marial;", "component2", "()Lmonacal/dern;", "component3", "()Lmonacal/wireman$apical;", "component4", "()Lmonacal/wireman$taiyuan;", "component5", "()Lmonacal/wireman$cutely;", "copy", "(Lmonacal/marial;Lmonacal/dern;Lmonacal/wireman$apical;Lmonacal/wireman$taiyuan;Lmonacal/wireman$cutely;)Lmonacal/wireman;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Lmonacal/marial;", "getDevice", "Lmonacal/dern;", "getApp", "Lmonacal/wireman$apical;", "getUser", "Lmonacal/wireman$taiyuan;", "getExt", "setExt", "(Lmonacal/wireman$taiyuan;)V", "Lmonacal/wireman$cutely;", "getRequest", "setRequest", "(Lmonacal/wireman$cutely;)V", "Companion", "attabal", "saneness", "dern", "wireman", "marial", "beachfront", "competently", "impromptu", "taiyuan", "cutely", "apical", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@formularize
public final /* data */ class CommonRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AppNode app;
    private final DeviceNode device;
    private RequestExt ext;
    private RequestParam request;
    private final User user;

    /* JADX INFO: renamed from: monacal.wireman$apical, reason: from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EFBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u00103R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u00107R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010 \"\u0004\b:\u0010;R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010?R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010$\"\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lmonacal/wireman$apical;", "", "Lmonacal/wireman$competently;", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "Lmonacal/wireman$dern;", "ccpa", "Lmonacal/wireman$wireman;", "coppa", "Lcom/vungle/ads/fpd/FirstPartyData;", "fpd", "Lmonacal/wireman$impromptu;", "iab", "<init>", "(Lmonacal/wireman$competently;Lmonacal/wireman$dern;Lmonacal/wireman$wireman;Lcom/vungle/ads/fpd/FirstPartyData;Lmonacal/wireman$impromptu;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILmonacal/wireman$competently;Lmonacal/wireman$dern;Lmonacal/wireman$wireman;Lcom/vungle/ads/fpd/FirstPartyData;Lmonacal/wireman$impromptu;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$apical;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Lmonacal/wireman$competently;", "component2", "()Lmonacal/wireman$dern;", "component3", "()Lmonacal/wireman$wireman;", "component4", "()Lcom/vungle/ads/fpd/FirstPartyData;", "component5", "()Lmonacal/wireman$impromptu;", "copy", "(Lmonacal/wireman$competently;Lmonacal/wireman$dern;Lmonacal/wireman$wireman;Lcom/vungle/ads/fpd/FirstPartyData;Lmonacal/wireman$impromptu;)Lmonacal/wireman$apical;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Lmonacal/wireman$competently;", "getGdpr", "setGdpr", "(Lmonacal/wireman$competently;)V", "Lmonacal/wireman$dern;", "getCcpa", "setCcpa", "(Lmonacal/wireman$dern;)V", "Lmonacal/wireman$wireman;", "getCoppa", "setCoppa", "(Lmonacal/wireman$wireman;)V", "Lcom/vungle/ads/fpd/FirstPartyData;", "getFpd", "setFpd", "(Lcom/vungle/ads/fpd/FirstPartyData;)V", "Lmonacal/wireman$impromptu;", "getIab", "setIab", "(Lmonacal/wireman$impromptu;)V", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class User {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private CCPA ccpa;
        private COPPA coppa;
        private FirstPartyData fpd;
        private GDPR gdpr;
        private IAB iab;

        /* JADX INFO: renamed from: monacal.wireman$apical$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.User.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$apical;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$apical;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$apical;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<User> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.User", attabalVar, 5);
                vesuvioVar.kowloon(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
                vesuvioVar.kowloon("ccpa", true);
                vesuvioVar.kowloon("coppa", true);
                vesuvioVar.kowloon("fpd", true);
                vesuvioVar.kowloon("iab", true);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                return new asosan.wireman[]{defendable.attabal.graveside(GDPR.attabal.INSTANCE), defendable.attabal.graveside(CCPA.attabal.INSTANCE), defendable.attabal.graveside(COPPA.attabal.INSTANCE), defendable.attabal.graveside(FirstPartyData.attabal.INSTANCE), defendable.attabal.graveside(IAB.attabal.INSTANCE)};
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
            public User deserialize(fastidiously.marial decoder) {
                int i;
                Object objSealless;
                Object objSealless2;
                Object objSealless3;
                Object objSealless4;
                Object objSealless5;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                Object objSealless6 = null;
                if (dernVarSaneness.triweekly()) {
                    objSealless = dernVarSaneness.sealless(descriptor2, 0, GDPR.attabal.INSTANCE, null);
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 1, CCPA.attabal.INSTANCE, null);
                    objSealless3 = dernVarSaneness.sealless(descriptor2, 2, COPPA.attabal.INSTANCE, null);
                    objSealless4 = dernVarSaneness.sealless(descriptor2, 3, FirstPartyData.attabal.INSTANCE, null);
                    objSealless5 = dernVarSaneness.sealless(descriptor2, 4, IAB.attabal.INSTANCE, null);
                    i = 31;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    Object objSealless7 = null;
                    Object objSealless8 = null;
                    Object objSealless9 = null;
                    Object objSealless10 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            objSealless6 = dernVarSaneness.sealless(descriptor2, 0, GDPR.attabal.INSTANCE, objSealless6);
                            i2 |= 1;
                        } else if (iImpassible == 1) {
                            objSealless7 = dernVarSaneness.sealless(descriptor2, 1, CCPA.attabal.INSTANCE, objSealless7);
                            i2 |= 2;
                        } else if (iImpassible == 2) {
                            objSealless8 = dernVarSaneness.sealless(descriptor2, 2, COPPA.attabal.INSTANCE, objSealless8);
                            i2 |= 4;
                        } else if (iImpassible == 3) {
                            objSealless9 = dernVarSaneness.sealless(descriptor2, 3, FirstPartyData.attabal.INSTANCE, objSealless9);
                            i2 |= 8;
                        } else {
                            if (iImpassible != 4) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless10 = dernVarSaneness.sealless(descriptor2, 4, IAB.attabal.INSTANCE, objSealless10);
                            i2 |= 16;
                        }
                    }
                    Object obj = objSealless6;
                    i = i2;
                    objSealless = obj;
                    objSealless2 = objSealless7;
                    objSealless3 = objSealless8;
                    objSealless4 = objSealless9;
                    objSealless5 = objSealless10;
                }
                dernVarSaneness.dern(descriptor2);
                return new User(i, (GDPR) objSealless, (CCPA) objSealless2, (COPPA) objSealless3, (FirstPartyData) objSealless4, (IAB) objSealless5, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, User value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                User.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$apical$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$apical$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$apical;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<User> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public User() {
            this((GDPR) null, (CCPA) null, (COPPA) null, (FirstPartyData) null, (IAB) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ User copy$default(User user, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i, Object obj) {
            if ((i & 1) != 0) {
                gdpr = user.gdpr;
            }
            if ((i & 2) != 0) {
                ccpa = user.ccpa;
            }
            if ((i & 4) != 0) {
                coppa = user.coppa;
            }
            if ((i & 8) != 0) {
                firstPartyData = user.fpd;
            }
            if ((i & 16) != 0) {
                iab = user.iab;
            }
            IAB iab2 = iab;
            COPPA coppa2 = coppa;
            return user.copy(gdpr, ccpa, coppa2, firstPartyData, iab2);
        }

        public static final void write$Self(User self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.gdpr != null) {
                output.taiyuan(serialDesc, 0, GDPR.attabal.INSTANCE, self.gdpr);
            }
            if (output.cuirassed(serialDesc, 1) || self.ccpa != null) {
                output.taiyuan(serialDesc, 1, CCPA.attabal.INSTANCE, self.ccpa);
            }
            if (output.cuirassed(serialDesc, 2) || self.coppa != null) {
                output.taiyuan(serialDesc, 2, COPPA.attabal.INSTANCE, self.coppa);
            }
            if (output.cuirassed(serialDesc, 3) || self.fpd != null) {
                output.taiyuan(serialDesc, 3, FirstPartyData.attabal.INSTANCE, self.fpd);
            }
            if (!output.cuirassed(serialDesc, 4) && self.iab == null) {
                return;
            }
            output.taiyuan(serialDesc, 4, IAB.attabal.INSTANCE, self.iab);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPR getGdpr() {
            return this.gdpr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CCPA getCcpa() {
            return this.ccpa;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final COPPA getCoppa() {
            return this.coppa;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final IAB getIab() {
            return this.iab;
        }

        public final User copy(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData fpd, IAB iab) {
            return new User(gdpr, ccpa, coppa, fpd, iab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.wireman(this.gdpr, user.gdpr) && Intrinsics.wireman(this.ccpa, user.ccpa) && Intrinsics.wireman(this.coppa, user.coppa) && Intrinsics.wireman(this.fpd, user.fpd) && Intrinsics.wireman(this.iab, user.iab);
        }

        public final CCPA getCcpa() {
            return this.ccpa;
        }

        public final COPPA getCoppa() {
            return this.coppa;
        }

        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        public final GDPR getGdpr() {
            return this.gdpr;
        }

        public final IAB getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPR gdpr = this.gdpr;
            int iHashCode = (gdpr == null ? 0 : gdpr.hashCode()) * 31;
            CCPA ccpa = this.ccpa;
            int iHashCode2 = (iHashCode + (ccpa == null ? 0 : ccpa.hashCode())) * 31;
            COPPA coppa = this.coppa;
            int iHashCode3 = (iHashCode2 + (coppa == null ? 0 : coppa.hashCode())) * 31;
            FirstPartyData firstPartyData = this.fpd;
            int iHashCode4 = (iHashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
            IAB iab = this.iab;
            return iHashCode4 + (iab != null ? iab.hashCode() : 0);
        }

        public final void setCcpa(CCPA ccpa) {
            this.ccpa = ccpa;
        }

        public final void setCoppa(COPPA coppa) {
            this.coppa = coppa;
        }

        public final void setFpd(FirstPartyData firstPartyData) {
            this.fpd = firstPartyData;
        }

        public final void setGdpr(GDPR gdpr) {
            this.gdpr = gdpr;
        }

        public final void setIab(IAB iab) {
            this.iab = iab;
        }

        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ User(int i, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gdpr;
            }
            if ((i & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = ccpa;
            }
            if ((i & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = coppa;
            }
            if ((i & 8) == 0) {
                this.fpd = null;
            } else {
                this.fpd = firstPartyData;
            }
            if ((i & 16) == 0) {
                this.iab = null;
            } else {
                this.iab = iab;
            }
        }

        public User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab) {
            this.gdpr = gdpr;
            this.ccpa = ccpa;
            this.coppa = coppa;
            this.fpd = firstPartyData;
            this.iab = iab;
        }

        public /* synthetic */ User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gdpr, (i & 2) != 0 ? null : ccpa, (i & 4) != 0 ? null : coppa, (i & 8) != 0 ? null : firstPartyData, (i & 16) != 0 ? null : iab);
        }
    }

    /* JADX INFO: renamed from: monacal.wireman$attabal */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @patroclinal.wireman
    public static final class attabal implements grimness<CommonRequestBody> {
        public static final attabal INSTANCE;
        public static final /* synthetic */ bristol.beachfront descriptor;

        static {
            attabal attabalVar = new attabal();
            INSTANCE = attabalVar;
            vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody", attabalVar, 5);
            vesuvioVar.kowloon(X3.i.G, false);
            vesuvioVar.kowloon(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
            vesuvioVar.kowloon("user", true);
            vesuvioVar.kowloon("ext", true);
            vesuvioVar.kowloon(AdActivity.REQUEST_KEY_EXTRA, true);
            descriptor = vesuvioVar;
        }

        private attabal() {
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] childSerializers() {
            return new asosan.wireman[]{DeviceNode.attabal.INSTANCE, defendable.attabal.graveside(AppNode.attabal.INSTANCE), defendable.attabal.graveside(User.attabal.INSTANCE), defendable.attabal.graveside(RequestExt.attabal.INSTANCE), defendable.attabal.graveside(RequestParam.attabal.INSTANCE)};
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
        public CommonRequestBody deserialize(fastidiously.marial decoder) {
            int i;
            Object objSupplicat;
            Object objSealless;
            Object objSealless2;
            Object objSealless3;
            Object objSealless4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
            Object objSupplicat2 = null;
            if (dernVarSaneness.triweekly()) {
                objSupplicat = dernVarSaneness.supplicat(descriptor2, 0, DeviceNode.attabal.INSTANCE, null);
                objSealless = dernVarSaneness.sealless(descriptor2, 1, AppNode.attabal.INSTANCE, null);
                objSealless2 = dernVarSaneness.sealless(descriptor2, 2, User.attabal.INSTANCE, null);
                objSealless3 = dernVarSaneness.sealless(descriptor2, 3, RequestExt.attabal.INSTANCE, null);
                objSealless4 = dernVarSaneness.sealless(descriptor2, 4, RequestParam.attabal.INSTANCE, null);
                i = 31;
            } else {
                boolean z = true;
                int i2 = 0;
                Object objSealless5 = null;
                Object objSealless6 = null;
                Object objSealless7 = null;
                Object objSealless8 = null;
                while (z) {
                    int iImpassible = dernVarSaneness.impassible(descriptor2);
                    if (iImpassible == -1) {
                        z = false;
                    } else if (iImpassible == 0) {
                        objSupplicat2 = dernVarSaneness.supplicat(descriptor2, 0, DeviceNode.attabal.INSTANCE, objSupplicat2);
                        i2 |= 1;
                    } else if (iImpassible == 1) {
                        objSealless5 = dernVarSaneness.sealless(descriptor2, 1, AppNode.attabal.INSTANCE, objSealless5);
                        i2 |= 2;
                    } else if (iImpassible == 2) {
                        objSealless6 = dernVarSaneness.sealless(descriptor2, 2, User.attabal.INSTANCE, objSealless6);
                        i2 |= 4;
                    } else if (iImpassible == 3) {
                        objSealless7 = dernVarSaneness.sealless(descriptor2, 3, RequestExt.attabal.INSTANCE, objSealless7);
                        i2 |= 8;
                    } else {
                        if (iImpassible != 4) {
                            throw new UnknownFieldException(iImpassible);
                        }
                        objSealless8 = dernVarSaneness.sealless(descriptor2, 4, RequestParam.attabal.INSTANCE, objSealless8);
                        i2 |= 16;
                    }
                }
                Object obj = objSupplicat2;
                i = i2;
                objSupplicat = obj;
                objSealless = objSealless5;
                objSealless2 = objSealless6;
                objSealless3 = objSealless7;
                objSealless4 = objSealless8;
            }
            dernVarSaneness.dern(descriptor2);
            return new CommonRequestBody(i, (DeviceNode) objSupplicat, (AppNode) objSealless, (User) objSealless2, (RequestExt) objSealless3, (RequestParam) objSealless4, (immediately) null);
        }

        @Override // asosan.impassible
        public void serialize(fastidiously.beachfront encoder, CommonRequestBody value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
            CommonRequestBody.write$Self(value, wiremanVarSaneness, descriptor2);
            wiremanVarSaneness.dern(descriptor2);
        }
    }

    /* JADX INFO: renamed from: monacal.wireman$beachfront, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$beachfront;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final asosan.wireman<CommonRequestBody> serializer() {
            return attabal.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: monacal.wireman$competently, reason: from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBI\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u0018¨\u00064"}, d2 = {"Lmonacal/wireman$competently;", "", "", "consentStatus", "consentSource", "", "consentTimestamp", "consentMessageVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$competently;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lmonacal/wireman$competently;", "toString", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConsentStatus", "getConsentStatus$annotations", "()V", "getConsentSource", "getConsentSource$annotations", "J", "getConsentTimestamp", "getConsentTimestamp$annotations", "getConsentMessageVersion", "getConsentMessageVersion$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class GDPR {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String consentMessageVersion;
        private final String consentSource;
        private final String consentStatus;
        private final long consentTimestamp;

        /* JADX INFO: renamed from: monacal.wireman$competently$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.GDPR.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$competently;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$competently;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$competently;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<GDPR> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.GDPR", attabalVar, 4);
                vesuvioVar.kowloon("consent_status", false);
                vesuvioVar.kowloon("consent_source", false);
                vesuvioVar.kowloon("consent_timestamp", false);
                vesuvioVar.kowloon("consent_message_version", false);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                licking lickingVar = licking.f39425attabal;
                return new asosan.wireman[]{lickingVar, lickingVar, coffeecake.f39367attabal, lickingVar};
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
            public GDPR deserialize(fastidiously.marial decoder) {
                String strFormularize;
                String strFormularize2;
                int i;
                String str;
                long j;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                if (dernVarSaneness.triweekly()) {
                    strFormularize = dernVarSaneness.formularize(descriptor2, 0);
                    String strFormularize3 = dernVarSaneness.formularize(descriptor2, 1);
                    long jMolybdenite = dernVarSaneness.molybdenite(descriptor2, 2);
                    strFormularize2 = dernVarSaneness.formularize(descriptor2, 3);
                    i = 15;
                    str = strFormularize3;
                    j = jMolybdenite;
                } else {
                    strFormularize = null;
                    String strFormularize4 = null;
                    boolean z = true;
                    long jMolybdenite2 = 0;
                    String strFormularize5 = null;
                    int i2 = 0;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            strFormularize = dernVarSaneness.formularize(descriptor2, 0);
                            i2 |= 1;
                        } else if (iImpassible == 1) {
                            strFormularize4 = dernVarSaneness.formularize(descriptor2, 1);
                            i2 |= 2;
                        } else if (iImpassible == 2) {
                            jMolybdenite2 = dernVarSaneness.molybdenite(descriptor2, 2);
                            i2 |= 4;
                        } else {
                            if (iImpassible != 3) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            strFormularize5 = dernVarSaneness.formularize(descriptor2, 3);
                            i2 |= 8;
                        }
                    }
                    strFormularize2 = strFormularize5;
                    i = i2;
                    str = strFormularize4;
                    j = jMolybdenite2;
                }
                String str2 = strFormularize;
                dernVarSaneness.dern(descriptor2);
                return new GDPR(i, str2, str, j, strFormularize2, null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, GDPR value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                GDPR.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$competently$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$competently$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$competently;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<GDPR> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        @patroclinal.wireman
        public /* synthetic */ GDPR(int i, String str, String str2, long j, String str3, immediately immediatelyVar) {
            if (15 != (i & 15)) {
                hardpan.attabal(i, 15, attabal.INSTANCE.getDescriptor());
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, long j, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gdpr.consentStatus;
            }
            if ((i & 2) != 0) {
                str2 = gdpr.consentSource;
            }
            if ((i & 4) != 0) {
                j = gdpr.consentTimestamp;
            }
            if ((i & 8) != 0) {
                str3 = gdpr.consentMessageVersion;
            }
            String str4 = str3;
            return gdpr.copy(str, str2, j, str4);
        }

        public static final void write$Self(GDPR self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.stratoscope(serialDesc, 0, self.consentStatus);
            output.stratoscope(serialDesc, 1, self.consentSource);
            output.cutely(serialDesc, 2, self.consentTimestamp);
            output.stratoscope(serialDesc, 3, self.consentMessageVersion);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentSource() {
            return this.consentSource;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final GDPR copy(String consentStatus, String consentSource, long consentTimestamp, String consentMessageVersion) {
            Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
            Intrinsics.checkNotNullParameter(consentSource, "consentSource");
            Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            return new GDPR(consentStatus, consentSource, consentTimestamp, consentMessageVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) other;
            return Intrinsics.wireman(this.consentStatus, gdpr.consentStatus) && Intrinsics.wireman(this.consentSource, gdpr.consentSource) && this.consentTimestamp == gdpr.consentTimestamp && Intrinsics.wireman(this.consentMessageVersion, gdpr.consentMessageVersion);
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentSource() {
            return this.consentSource;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public int hashCode() {
            return (((((this.consentStatus.hashCode() * 31) + this.consentSource.hashCode()) * 31) + Long.hashCode(this.consentTimestamp)) * 31) + this.consentMessageVersion.hashCode();
        }

        public String toString() {
            return "GDPR(consentStatus=" + this.consentStatus + ", consentSource=" + this.consentSource + ", consentTimestamp=" + this.consentTimestamp + ", consentMessageVersion=" + this.consentMessageVersion + ')';
        }

        public GDPR(String consentStatus, String consentSource, long j, String consentMessageVersion) {
            Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
            Intrinsics.checkNotNullParameter(consentSource, "consentSource");
            Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            this.consentStatus = consentStatus;
            this.consentSource = consentSource;
            this.consentTimestamp = j;
            this.consentMessageVersion = consentMessageVersion;
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentSource$annotations() {
        }

        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }
    }

    /* JADX INFO: renamed from: monacal.wireman$cutely, reason: from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBa\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(Jj\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010$J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u001eR*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00104\u0012\u0004\b8\u00109\u001a\u0004\b5\u0010 \"\u0004\b6\u00107R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bB\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010(¨\u0006H"}, d2 = {"Lmonacal/wireman$cutely;", "", "", "", C3622ld.c, "Lmonacal/wireman$saneness;", X3.i.O, "", "adStartTime", "advAppId", "placementReferenceId", "user", "Lmonacal/wireman$marial;", "csb", "<init>", "(Ljava/util/List;Lmonacal/wireman$saneness;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmonacal/wireman$marial;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/util/List;Lmonacal/wireman$saneness;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmonacal/wireman$marial;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$cutely;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/util/List;", "component2", "()Lmonacal/wireman$saneness;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Lmonacal/wireman$marial;", "copy", "(Ljava/util/List;Lmonacal/wireman$saneness;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmonacal/wireman$marial;)Lmonacal/wireman$cutely;", "toString", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlacements", "Lmonacal/wireman$saneness;", "getAdSize", "setAdSize", "(Lmonacal/wireman$saneness;)V", "getAdSize$annotations", "()V", "Ljava/lang/Long;", "getAdStartTime", "getAdStartTime$annotations", "Ljava/lang/String;", "getAdvAppId", "getAdvAppId$annotations", "getPlacementReferenceId", "getPlacementReferenceId$annotations", "getUser", "Lmonacal/wireman$marial;", "getCsb", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class RequestParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private AdSizeParam adSize;
        private final Long adStartTime;
        private final String advAppId;
        private final CSBParam csb;
        private final String placementReferenceId;
        private final List<String> placements;
        private final String user;

        /* JADX INFO: renamed from: monacal.wireman$cutely$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.RequestParam.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$cutely;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$cutely;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$cutely;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<RequestParam> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", attabalVar, 7);
                vesuvioVar.kowloon(C3622ld.c, true);
                vesuvioVar.kowloon("ad_size", true);
                vesuvioVar.kowloon("ad_start_time", true);
                vesuvioVar.kowloon("app_id", true);
                vesuvioVar.kowloon("placement_reference_id", true);
                vesuvioVar.kowloon("user", true);
                vesuvioVar.kowloon("csb", true);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                licking lickingVar = licking.f39425attabal;
                return new asosan.wireman[]{defendable.attabal.graveside(new vinyl.beachfront(lickingVar)), defendable.attabal.graveside(AdSizeParam.attabal.INSTANCE), defendable.attabal.graveside(coffeecake.f39367attabal), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(CSBParam.attabal.INSTANCE)};
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
            public RequestParam deserialize(fastidiously.marial decoder) {
                int i;
                Object objSealless;
                Object objSealless2;
                Object objSealless3;
                Object objSealless4;
                Object objSealless5;
                Object objSealless6;
                Object objSealless7;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                int i2 = 6;
                Object objSealless8 = null;
                if (dernVarSaneness.triweekly()) {
                    licking lickingVar = licking.f39425attabal;
                    objSealless = dernVarSaneness.sealless(descriptor2, 0, new vinyl.beachfront(lickingVar), null);
                    objSealless3 = dernVarSaneness.sealless(descriptor2, 1, AdSizeParam.attabal.INSTANCE, null);
                    objSealless4 = dernVarSaneness.sealless(descriptor2, 2, coffeecake.f39367attabal, null);
                    objSealless5 = dernVarSaneness.sealless(descriptor2, 3, lickingVar, null);
                    objSealless6 = dernVarSaneness.sealless(descriptor2, 4, lickingVar, null);
                    objSealless7 = dernVarSaneness.sealless(descriptor2, 5, lickingVar, null);
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 6, CSBParam.attabal.INSTANCE, null);
                    i = 127;
                } else {
                    boolean z = true;
                    int i3 = 0;
                    Object objSealless9 = null;
                    Object objSealless10 = null;
                    Object objSealless11 = null;
                    Object objSealless12 = null;
                    Object objSealless13 = null;
                    Object objSealless14 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        switch (iImpassible) {
                            case -1:
                                z = false;
                                i2 = 6;
                                break;
                            case 0:
                                objSealless8 = dernVarSaneness.sealless(descriptor2, 0, new vinyl.beachfront(licking.f39425attabal), objSealless8);
                                i3 |= 1;
                                i2 = 6;
                                break;
                            case 1:
                                objSealless10 = dernVarSaneness.sealless(descriptor2, 1, AdSizeParam.attabal.INSTANCE, objSealless10);
                                i3 |= 2;
                                i2 = 6;
                                break;
                            case 2:
                                objSealless11 = dernVarSaneness.sealless(descriptor2, 2, coffeecake.f39367attabal, objSealless11);
                                i3 |= 4;
                                break;
                            case 3:
                                objSealless12 = dernVarSaneness.sealless(descriptor2, 3, licking.f39425attabal, objSealless12);
                                i3 |= 8;
                                break;
                            case 4:
                                objSealless13 = dernVarSaneness.sealless(descriptor2, 4, licking.f39425attabal, objSealless13);
                                i3 |= 16;
                                break;
                            case 5:
                                objSealless14 = dernVarSaneness.sealless(descriptor2, 5, licking.f39425attabal, objSealless14);
                                i3 |= 32;
                                break;
                            case 6:
                                objSealless9 = dernVarSaneness.sealless(descriptor2, i2, CSBParam.attabal.INSTANCE, objSealless9);
                                i3 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(iImpassible);
                        }
                    }
                    Object obj = objSealless8;
                    i = i3;
                    objSealless = obj;
                    objSealless2 = objSealless9;
                    objSealless3 = objSealless10;
                    objSealless4 = objSealless11;
                    objSealless5 = objSealless12;
                    objSealless6 = objSealless13;
                    objSealless7 = objSealless14;
                }
                dernVarSaneness.dern(descriptor2);
                return new RequestParam(i, (List) objSealless, (AdSizeParam) objSealless3, (Long) objSealless4, (String) objSealless5, (String) objSealless6, (String) objSealless7, (CSBParam) objSealless2, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, RequestParam value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                RequestParam.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$cutely$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$cutely$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$cutely;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<RequestParam> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public RequestParam() {
            this((List) null, (AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, (CSBParam) null, 127, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RequestParam copy$default(RequestParam requestParam, List list, AdSizeParam adSizeParam, Long l, String str, String str2, String str3, CSBParam cSBParam, int i, Object obj) {
            if ((i & 1) != 0) {
                list = requestParam.placements;
            }
            if ((i & 2) != 0) {
                adSizeParam = requestParam.adSize;
            }
            if ((i & 4) != 0) {
                l = requestParam.adStartTime;
            }
            if ((i & 8) != 0) {
                str = requestParam.advAppId;
            }
            if ((i & 16) != 0) {
                str2 = requestParam.placementReferenceId;
            }
            if ((i & 32) != 0) {
                str3 = requestParam.user;
            }
            if ((i & 64) != 0) {
                cSBParam = requestParam.csb;
            }
            String str4 = str3;
            CSBParam cSBParam2 = cSBParam;
            String str5 = str2;
            Long l2 = l;
            return requestParam.copy(list, adSizeParam, l2, str, str5, str4, cSBParam2);
        }

        public static final void write$Self(RequestParam self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.placements != null) {
                output.taiyuan(serialDesc, 0, new vinyl.beachfront(licking.f39425attabal), self.placements);
            }
            if (output.cuirassed(serialDesc, 1) || self.adSize != null) {
                output.taiyuan(serialDesc, 1, AdSizeParam.attabal.INSTANCE, self.adSize);
            }
            if (output.cuirassed(serialDesc, 2) || self.adStartTime != null) {
                output.taiyuan(serialDesc, 2, coffeecake.f39367attabal, self.adStartTime);
            }
            if (output.cuirassed(serialDesc, 3) || self.advAppId != null) {
                output.taiyuan(serialDesc, 3, licking.f39425attabal, self.advAppId);
            }
            if (output.cuirassed(serialDesc, 4) || self.placementReferenceId != null) {
                output.taiyuan(serialDesc, 4, licking.f39425attabal, self.placementReferenceId);
            }
            if (output.cuirassed(serialDesc, 5) || self.user != null) {
                output.taiyuan(serialDesc, 5, licking.f39425attabal, self.user);
            }
            if (!output.cuirassed(serialDesc, 6) && self.csb == null) {
                return;
            }
            output.taiyuan(serialDesc, 6, CSBParam.attabal.INSTANCE, self.csb);
        }

        public final List<String> component1() {
            return this.placements;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getUser() {
            return this.user;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final CSBParam getCsb() {
            return this.csb;
        }

        public final RequestParam copy(List<String> placements, AdSizeParam adSize, Long adStartTime, String advAppId, String placementReferenceId, String user, CSBParam csb) {
            return new RequestParam(placements, adSize, adStartTime, advAppId, placementReferenceId, user, csb);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestParam)) {
                return false;
            }
            RequestParam requestParam = (RequestParam) other;
            return Intrinsics.wireman(this.placements, requestParam.placements) && Intrinsics.wireman(this.adSize, requestParam.adSize) && Intrinsics.wireman(this.adStartTime, requestParam.adStartTime) && Intrinsics.wireman(this.advAppId, requestParam.advAppId) && Intrinsics.wireman(this.placementReferenceId, requestParam.placementReferenceId) && Intrinsics.wireman(this.user, requestParam.user) && Intrinsics.wireman(this.csb, requestParam.csb);
        }

        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final CSBParam getCsb() {
            return this.csb;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final List<String> getPlacements() {
            return this.placements;
        }

        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            AdSizeParam adSizeParam = this.adSize;
            int iHashCode2 = (iHashCode + (adSizeParam == null ? 0 : adSizeParam.hashCode())) * 31;
            Long l = this.adStartTime;
            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.advAppId;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementReferenceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.user;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CSBParam cSBParam = this.csb;
            return iHashCode6 + (cSBParam != null ? cSBParam.hashCode() : 0);
        }

        public final void setAdSize(AdSizeParam adSizeParam) {
            this.adSize = adSizeParam;
        }

        public String toString() {
            return "RequestParam(placements=" + this.placements + ", adSize=" + this.adSize + ", adStartTime=" + this.adStartTime + ", advAppId=" + this.advAppId + ", placementReferenceId=" + this.placementReferenceId + ", user=" + this.user + ", csb=" + this.csb + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ RequestParam(int i, List list, AdSizeParam adSizeParam, Long l, String str, String str2, String str3, CSBParam cSBParam, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i & 2) == 0) {
                this.adSize = null;
            } else {
                this.adSize = adSizeParam;
            }
            if ((i & 4) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l;
            }
            if ((i & 8) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str;
            }
            if ((i & 16) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str2;
            }
            if ((i & 32) == 0) {
                this.user = null;
            } else {
                this.user = str3;
            }
            if ((i & 64) == 0) {
                this.csb = null;
            } else {
                this.csb = cSBParam;
            }
        }

        public RequestParam(List<String> list, AdSizeParam adSizeParam, Long l, String str, String str2, String str3, CSBParam cSBParam) {
            this.placements = list;
            this.adSize = adSizeParam;
            this.adStartTime = l;
            this.advAppId = str;
            this.placementReferenceId = str2;
            this.user = str3;
            this.csb = cSBParam;
        }

        public /* synthetic */ RequestParam(List list, AdSizeParam adSizeParam, Long l, String str, String str2, String str3, CSBParam cSBParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : adSizeParam, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : cSBParam);
        }

        public static /* synthetic */ void getAdSize$annotations() {
        }

        public static /* synthetic */ void getAdStartTime$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* JADX INFO: renamed from: monacal.wireman$dern, reason: from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006#"}, d2 = {"Lmonacal/wireman$dern;", "", "", "status", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$dern;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lmonacal/wireman$dern;", "toString", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class CCPA {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String status;

        /* JADX INFO: renamed from: monacal.wireman$dern$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.CCPA.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$dern;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$dern;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$dern;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<CCPA> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.CCPA", attabalVar, 1);
                vesuvioVar.kowloon("status", false);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                return new asosan.wireman[]{licking.f39425attabal};
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
            public CCPA deserialize(fastidiously.marial decoder) {
                String strFormularize;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                int i = 1;
                immediately immediatelyVar = null;
                if (dernVarSaneness.triweekly()) {
                    strFormularize = dernVarSaneness.formularize(descriptor2, 0);
                } else {
                    boolean z = true;
                    int i2 = 0;
                    strFormularize = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else {
                            if (iImpassible != 0) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            strFormularize = dernVarSaneness.formularize(descriptor2, 0);
                            i2 = 1;
                        }
                    }
                    i = i2;
                }
                dernVarSaneness.dern(descriptor2);
                return new CCPA(i, strFormularize, immediatelyVar);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, CCPA value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                CCPA.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$dern$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$dern$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$dern;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<CCPA> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        @patroclinal.wireman
        public /* synthetic */ CCPA(int i, String str, immediately immediatelyVar) {
            if (1 != (i & 1)) {
                hardpan.attabal(i, 1, attabal.INSTANCE.getDescriptor());
            }
            this.status = str;
        }

        public static /* synthetic */ CCPA copy$default(CCPA ccpa, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ccpa.status;
            }
            return ccpa.copy(str);
        }

        public static final void write$Self(CCPA self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.stratoscope(serialDesc, 0, self.status);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public final CCPA copy(String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new CCPA(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CCPA) && Intrinsics.wireman(this.status, ((CCPA) other).status);
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "CCPA(status=" + this.status + ')';
        }

        public CCPA(String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }
    }

    /* JADX INFO: renamed from: monacal.wireman$impromptu, reason: from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014¨\u0006%"}, d2 = {"Lmonacal/wireman$impromptu;", "", "", "tcf", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$impromptu;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lmonacal/wireman$impromptu;", "toString", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTcf", "getTcf$annotations", "()V", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class IAB {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String tcf;

        /* JADX INFO: renamed from: monacal.wireman$impromptu$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.IAB.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$impromptu;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$impromptu;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$impromptu;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<IAB> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.IAB", attabalVar, 1);
                vesuvioVar.kowloon("tcf", false);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                return new asosan.wireman[]{licking.f39425attabal};
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
            public IAB deserialize(fastidiously.marial decoder) {
                String strFormularize;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                int i = 1;
                immediately immediatelyVar = null;
                if (dernVarSaneness.triweekly()) {
                    strFormularize = dernVarSaneness.formularize(descriptor2, 0);
                } else {
                    boolean z = true;
                    int i2 = 0;
                    strFormularize = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else {
                            if (iImpassible != 0) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            strFormularize = dernVarSaneness.formularize(descriptor2, 0);
                            i2 = 1;
                        }
                    }
                    i = i2;
                }
                dernVarSaneness.dern(descriptor2);
                return new IAB(i, strFormularize, immediatelyVar);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, IAB value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                IAB.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$impromptu$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$impromptu$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$impromptu;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<IAB> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        @patroclinal.wireman
        public /* synthetic */ IAB(int i, String str, immediately immediatelyVar) {
            if (1 != (i & 1)) {
                hardpan.attabal(i, 1, attabal.INSTANCE.getDescriptor());
            }
            this.tcf = str;
        }

        public static /* synthetic */ IAB copy$default(IAB iab, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iab.tcf;
            }
            return iab.copy(str);
        }

        public static final void write$Self(IAB self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.stratoscope(serialDesc, 0, self.tcf);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTcf() {
            return this.tcf;
        }

        public final IAB copy(String tcf) {
            Intrinsics.checkNotNullParameter(tcf, "tcf");
            return new IAB(tcf);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IAB) && Intrinsics.wireman(this.tcf, ((IAB) other).tcf);
        }

        public final String getTcf() {
            return this.tcf;
        }

        public int hashCode() {
            return this.tcf.hashCode();
        }

        public String toString() {
            return "IAB(tcf=" + this.tcf + ')';
        }

        public IAB(String tcf) {
            Intrinsics.checkNotNullParameter(tcf, "tcf");
            this.tcf = tcf;
        }

        public static /* synthetic */ void getTcf$annotations() {
        }
    }

    /* JADX INFO: renamed from: monacal.wireman$taiyuan, reason: from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010*R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u001a¨\u00062"}, d2 = {"Lmonacal/wireman$taiyuan;", "", "", "configExtension", "signals", "", "configLastValidatedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$taiyuan;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lmonacal/wireman$taiyuan;", "toString", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConfigExtension", "getConfigExtension$annotations", "()V", "getSignals", "setSignals", "(Ljava/lang/String;)V", "getSignals$annotations", "Ljava/lang/Long;", "getConfigLastValidatedTimestamp", "getConfigLastValidatedTimestamp$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class RequestExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String configExtension;
        private final Long configLastValidatedTimestamp;
        private String signals;

        /* JADX INFO: renamed from: monacal.wireman$taiyuan$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.RequestExt.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$taiyuan;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$taiyuan;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$taiyuan;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<RequestExt> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.RequestExt", attabalVar, 3);
                vesuvioVar.kowloon("config_extension", true);
                vesuvioVar.kowloon("signals", true);
                vesuvioVar.kowloon("config_last_validated_ts", true);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                licking lickingVar = licking.f39425attabal;
                return new asosan.wireman[]{defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(coffeecake.f39367attabal)};
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
            public RequestExt deserialize(fastidiously.marial decoder) {
                int i;
                Object objSealless;
                Object objSealless2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                Object objSealless3 = null;
                if (dernVarSaneness.triweekly()) {
                    licking lickingVar = licking.f39425attabal;
                    Object objSealless4 = dernVarSaneness.sealless(descriptor2, 0, lickingVar, null);
                    objSealless = dernVarSaneness.sealless(descriptor2, 1, lickingVar, null);
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 2, coffeecake.f39367attabal, null);
                    objSealless3 = objSealless4;
                    i = 7;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    Object objSealless5 = null;
                    Object objSealless6 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            objSealless3 = dernVarSaneness.sealless(descriptor2, 0, licking.f39425attabal, objSealless3);
                            i2 |= 1;
                        } else if (iImpassible == 1) {
                            objSealless5 = dernVarSaneness.sealless(descriptor2, 1, licking.f39425attabal, objSealless5);
                            i2 |= 2;
                        } else {
                            if (iImpassible != 2) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless6 = dernVarSaneness.sealless(descriptor2, 2, coffeecake.f39367attabal, objSealless6);
                            i2 |= 4;
                        }
                    }
                    i = i2;
                    objSealless = objSealless5;
                    objSealless2 = objSealless6;
                }
                dernVarSaneness.dern(descriptor2);
                return new RequestExt(i, (String) objSealless3, (String) objSealless, (Long) objSealless2, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, RequestExt value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                RequestExt.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$taiyuan$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$taiyuan$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$taiyuan;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<RequestExt> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public RequestExt() {
            this((String) null, (String) null, (Long) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ RequestExt copy$default(RequestExt requestExt, String str, String str2, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestExt.configExtension;
            }
            if ((i & 2) != 0) {
                str2 = requestExt.signals;
            }
            if ((i & 4) != 0) {
                l = requestExt.configLastValidatedTimestamp;
            }
            return requestExt.copy(str, str2, l);
        }

        public static final void write$Self(RequestExt self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.configExtension != null) {
                output.taiyuan(serialDesc, 0, licking.f39425attabal, self.configExtension);
            }
            if (output.cuirassed(serialDesc, 1) || self.signals != null) {
                output.taiyuan(serialDesc, 1, licking.f39425attabal, self.signals);
            }
            if (!output.cuirassed(serialDesc, 2) && self.configLastValidatedTimestamp == null) {
                return;
            }
            output.taiyuan(serialDesc, 2, coffeecake.f39367attabal, self.configLastValidatedTimestamp);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConfigExtension() {
            return this.configExtension;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSignals() {
            return this.signals;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final RequestExt copy(String configExtension, String signals, Long configLastValidatedTimestamp) {
            return new RequestExt(configExtension, signals, configLastValidatedTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestExt)) {
                return false;
            }
            RequestExt requestExt = (RequestExt) other;
            return Intrinsics.wireman(this.configExtension, requestExt.configExtension) && Intrinsics.wireman(this.signals, requestExt.signals) && Intrinsics.wireman(this.configLastValidatedTimestamp, requestExt.configLastValidatedTimestamp);
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final String getSignals() {
            return this.signals;
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.configLastValidatedTimestamp;
            return iHashCode2 + (l != null ? l.hashCode() : 0);
        }

        public final void setSignals(String str) {
            this.signals = str;
        }

        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ RequestExt(int i, String str, String str2, Long l, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
            if ((i & 4) == 0) {
                this.configLastValidatedTimestamp = null;
            } else {
                this.configLastValidatedTimestamp = l;
            }
        }

        public RequestExt(String str, String str2, Long l) {
            this.configExtension = str;
            this.signals = str2;
            this.configLastValidatedTimestamp = l;
        }

        public /* synthetic */ RequestExt(String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l);
        }

        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
        }

        public static /* synthetic */ void getSignals$annotations() {
        }
    }

    /* JADX INFO: renamed from: monacal.wireman$wireman, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u0003\u0010\u0014¨\u0006%"}, d2 = {"Lmonacal/wireman$wireman;", "", "", "isCoppa", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$wireman;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lmonacal/wireman$wireman;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isCoppa$annotations", "()V", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class COPPA {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean isCoppa;

        /* JADX INFO: renamed from: monacal.wireman$wireman$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.COPPA.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$wireman;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$wireman;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$wireman;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<COPPA> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.COPPA", attabalVar, 1);
                vesuvioVar.kowloon(Ta.G, false);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                return new asosan.wireman[]{defendable.attabal.graveside(vinyl.taiyuan.f39500attabal)};
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
            public COPPA deserialize(fastidiously.marial decoder) {
                Object objSealless;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                int i = 1;
                immediately immediatelyVar = null;
                if (dernVarSaneness.triweekly()) {
                    objSealless = dernVarSaneness.sealless(descriptor2, 0, vinyl.taiyuan.f39500attabal, null);
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
                            objSealless = dernVarSaneness.sealless(descriptor2, 0, vinyl.taiyuan.f39500attabal, objSealless);
                            i2 = 1;
                        }
                    }
                    i = i2;
                }
                dernVarSaneness.dern(descriptor2);
                return new COPPA(i, (Boolean) objSealless, immediatelyVar);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, COPPA value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                COPPA.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$wireman$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$wireman$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$wireman;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<COPPA> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        @patroclinal.wireman
        public /* synthetic */ COPPA(int i, Boolean bool, immediately immediatelyVar) {
            if (1 != (i & 1)) {
                hardpan.attabal(i, 1, attabal.INSTANCE.getDescriptor());
            }
            this.isCoppa = bool;
        }

        public static /* synthetic */ COPPA copy$default(COPPA coppa, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = coppa.isCoppa;
            }
            return coppa.copy(bool);
        }

        public static final void write$Self(COPPA self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.taiyuan(serialDesc, 0, vinyl.taiyuan.f39500attabal, self.isCoppa);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCoppa() {
            return this.isCoppa;
        }

        public final COPPA copy(Boolean isCoppa) {
            return new COPPA(isCoppa);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof COPPA) && Intrinsics.wireman(this.isCoppa, ((COPPA) other).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        public COPPA(Boolean bool) {
            this.isCoppa = bool;
        }

        public static /* synthetic */ void isCoppa$annotations() {
        }
    }

    @patroclinal.wireman
    public /* synthetic */ CommonRequestBody(int i, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, immediately immediatelyVar) {
        if (1 != (i & 1)) {
            hardpan.attabal(i, 1, attabal.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i & 2) == 0) {
            this.app = null;
        } else {
            this.app = appNode;
        }
        if ((i & 4) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i & 16) == 0) {
            this.request = null;
        } else {
            this.request = requestParam;
        }
    }

    public static /* synthetic */ CommonRequestBody copy$default(CommonRequestBody commonRequestBody, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceNode = commonRequestBody.device;
        }
        if ((i & 2) != 0) {
            appNode = commonRequestBody.app;
        }
        if ((i & 4) != 0) {
            user = commonRequestBody.user;
        }
        if ((i & 8) != 0) {
            requestExt = commonRequestBody.ext;
        }
        if ((i & 16) != 0) {
            requestParam = commonRequestBody.request;
        }
        RequestParam requestParam2 = requestParam;
        User user2 = user;
        return commonRequestBody.copy(deviceNode, appNode, user2, requestExt, requestParam2);
    }

    public static final void write$Self(CommonRequestBody self, fastidiously.wireman output, bristol.beachfront serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.sealless(serialDesc, 0, DeviceNode.attabal.INSTANCE, self.device);
        if (output.cuirassed(serialDesc, 1) || self.app != null) {
            output.taiyuan(serialDesc, 1, AppNode.attabal.INSTANCE, self.app);
        }
        if (output.cuirassed(serialDesc, 2) || self.user != null) {
            output.taiyuan(serialDesc, 2, User.attabal.INSTANCE, self.user);
        }
        if (output.cuirassed(serialDesc, 3) || self.ext != null) {
            output.taiyuan(serialDesc, 3, RequestExt.attabal.INSTANCE, self.ext);
        }
        if (!output.cuirassed(serialDesc, 4) && self.request == null) {
            return;
        }
        output.taiyuan(serialDesc, 4, RequestParam.attabal.INSTANCE, self.request);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceNode getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppNode getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RequestExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RequestParam getRequest() {
        return this.request;
    }

    public final CommonRequestBody copy(DeviceNode device, AppNode app, User user, RequestExt ext, RequestParam request) {
        Intrinsics.checkNotNullParameter(device, "device");
        return new CommonRequestBody(device, app, user, ext, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequestBody)) {
            return false;
        }
        CommonRequestBody commonRequestBody = (CommonRequestBody) other;
        return Intrinsics.wireman(this.device, commonRequestBody.device) && Intrinsics.wireman(this.app, commonRequestBody.app) && Intrinsics.wireman(this.user, commonRequestBody.user) && Intrinsics.wireman(this.ext, commonRequestBody.ext) && Intrinsics.wireman(this.request, commonRequestBody.request);
    }

    public final AppNode getApp() {
        return this.app;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final RequestExt getExt() {
        return this.ext;
    }

    public final RequestParam getRequest() {
        return this.request;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        AppNode appNode = this.app;
        int iHashCode2 = (iHashCode + (appNode == null ? 0 : appNode.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        RequestExt requestExt = this.ext;
        int iHashCode4 = (iHashCode3 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RequestParam requestParam = this.request;
        return iHashCode4 + (requestParam != null ? requestParam.hashCode() : 0);
    }

    public final void setExt(RequestExt requestExt) {
        this.ext = requestExt;
    }

    public final void setRequest(RequestParam requestParam) {
        this.request = requestParam;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    /* JADX INFO: renamed from: monacal.wireman$saneness, reason: from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006)"}, d2 = {"Lmonacal/wireman$saneness;", "", "", "width", "height", "<init>", "(II)V", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(IIILvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$saneness;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()I", "component2", "copy", "(II)Lmonacal/wireman$saneness;", "", "toString", "()Ljava/lang/String;", "hashCode", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class AdSizeParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int height;
        private final int width;

        /* JADX INFO: renamed from: monacal.wireman$saneness$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.AdSizeParam.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$saneness;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$saneness;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$saneness;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<AdSizeParam> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", attabalVar, 2);
                vesuvioVar.kowloon("w", false);
                vesuvioVar.kowloon("h", false);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                splinterproof splinterproofVar = splinterproof.f39488attabal;
                return new asosan.wireman[]{splinterproofVar, splinterproofVar};
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
            public AdSizeParam deserialize(fastidiously.marial decoder) {
                int iYemenite;
                int iYemenite2;
                int i;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                if (dernVarSaneness.triweekly()) {
                    iYemenite = dernVarSaneness.yemenite(descriptor2, 0);
                    iYemenite2 = dernVarSaneness.yemenite(descriptor2, 1);
                    i = 3;
                } else {
                    boolean z = true;
                    iYemenite = 0;
                    int iYemenite3 = 0;
                    int i2 = 0;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            iYemenite = dernVarSaneness.yemenite(descriptor2, 0);
                            i2 |= 1;
                        } else {
                            if (iImpassible != 1) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            iYemenite3 = dernVarSaneness.yemenite(descriptor2, 1);
                            i2 |= 2;
                        }
                    }
                    iYemenite2 = iYemenite3;
                    i = i2;
                }
                dernVarSaneness.dern(descriptor2);
                return new AdSizeParam(i, iYemenite, iYemenite2, null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, AdSizeParam value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                AdSizeParam.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$saneness$saneness, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$saneness$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$saneness;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<AdSizeParam> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public AdSizeParam(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public static /* synthetic */ AdSizeParam copy$default(AdSizeParam adSizeParam, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = adSizeParam.width;
            }
            if ((i3 & 2) != 0) {
                i2 = adSizeParam.height;
            }
            return adSizeParam.copy(i, i2);
        }

        public static final void write$Self(AdSizeParam self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.molybdenite(serialDesc, 0, self.width);
            output.molybdenite(serialDesc, 1, self.height);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final AdSizeParam copy(int width, int height) {
            return new AdSizeParam(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeParam)) {
                return false;
            }
            AdSizeParam adSizeParam = (AdSizeParam) other;
            return this.width == adSizeParam.width && this.height == adSizeParam.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "AdSizeParam(width=" + this.width + ", height=" + this.height + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ AdSizeParam(int i, int i2, int i3, immediately immediatelyVar) {
            if (3 != (i & 3)) {
                hardpan.attabal(i, 3, attabal.INSTANCE.getDescriptor());
            }
            this.width = i2;
            this.height = i3;
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    public CommonRequestBody(DeviceNode device, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
        this.app = appNode;
        this.user = user;
        this.ext = requestExt;
        this.request = requestParam;
    }

    /* JADX INFO: renamed from: monacal.wireman$marial, reason: from toString */
    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eBc\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010\"JX\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b2\u00103\u001a\u0004\b\u0007\u0010 R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\"R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b8\u00103\u001a\u0004\b7\u0010\"R \u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b:\u00103\u001a\u0004\b9\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b;\u0010\"¨\u0006?"}, d2 = {"Lmonacal/wireman$marial;", "", "", "bidfloor", "", "phase", "", "isVXWinner", "", "parentAuctionId", "creativeId", "adUnitId", "ext", "<init>", "(DIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(IDIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/wireman$marial;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()D", "component2", "()I", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "copy", "(DIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lmonacal/wireman$marial;", "toString", "hashCode", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "D", "getBidfloor", "I", "getPhase", "Z", "isVXWinner$annotations", "()V", "Ljava/lang/String;", "getParentAuctionId", "getParentAuctionId$annotations", "getCreativeId", "getCreativeId$annotations", "getAdUnitId", "getAdUnitId$annotations", "getExt", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class CSBParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adUnitId;
        private final double bidfloor;
        private final String creativeId;
        private final String ext;
        private final boolean isVXWinner;
        private final String parentAuctionId;
        private final int phase;

        /* JADX INFO: renamed from: monacal.wireman$marial$attabal */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.CSBParam.$serializer", "Lvinyl/grimness;", "Lmonacal/wireman$marial;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/wireman$marial;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/wireman$marial;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class attabal implements grimness<CSBParam> {
            public static final attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                attabal attabalVar = new attabal();
                INSTANCE = attabalVar;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", attabalVar, 7);
                vesuvioVar.kowloon("bidfloor", false);
                vesuvioVar.kowloon("phase", false);
                vesuvioVar.kowloon("is_vx_winner", false);
                vesuvioVar.kowloon("parent_auction_id", false);
                vesuvioVar.kowloon(CampaignEx.JSON_KEY_CREATIVE_ID, false);
                vesuvioVar.kowloon("ad_unit_id", false);
                vesuvioVar.kowloon("ext", true);
                descriptor = vesuvioVar;
            }

            private attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                licking lickingVar = licking.f39425attabal;
                return new asosan.wireman[]{trm.f39509attabal, splinterproof.f39488attabal, vinyl.taiyuan.f39500attabal, lickingVar, lickingVar, lickingVar, defendable.attabal.graveside(lickingVar)};
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
            public CSBParam deserialize(fastidiously.marial decoder) {
                int iYemenite;
                boolean z;
                int i;
                String str;
                String str2;
                String str3;
                Object objSealless;
                double d;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                if (dernVarSaneness.triweekly()) {
                    double dMarial = dernVarSaneness.marial(descriptor2, 0);
                    iYemenite = dernVarSaneness.yemenite(descriptor2, 1);
                    boolean zRotuma = dernVarSaneness.rotuma(descriptor2, 2);
                    String strFormularize = dernVarSaneness.formularize(descriptor2, 3);
                    String strFormularize2 = dernVarSaneness.formularize(descriptor2, 4);
                    String strFormularize3 = dernVarSaneness.formularize(descriptor2, 5);
                    objSealless = dernVarSaneness.sealless(descriptor2, 6, licking.f39425attabal, null);
                    str3 = strFormularize3;
                    str = strFormularize;
                    str2 = strFormularize2;
                    z = zRotuma;
                    i = 127;
                    d = dMarial;
                } else {
                    boolean z2 = true;
                    iYemenite = 0;
                    String strFormularize4 = null;
                    String strFormularize5 = null;
                    Object objSealless2 = null;
                    double dMarial2 = 0.0d;
                    boolean zRotuma2 = false;
                    int i2 = 0;
                    String strFormularize6 = null;
                    while (z2) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        switch (iImpassible) {
                            case -1:
                                z2 = false;
                                continue;
                            case 0:
                                dMarial2 = dernVarSaneness.marial(descriptor2, 0);
                                i2 |= 1;
                                continue;
                            case 1:
                                iYemenite = dernVarSaneness.yemenite(descriptor2, 1);
                                i2 |= 2;
                                break;
                            case 2:
                                zRotuma2 = dernVarSaneness.rotuma(descriptor2, 2);
                                i2 |= 4;
                                break;
                            case 3:
                                strFormularize6 = dernVarSaneness.formularize(descriptor2, 3);
                                i2 |= 8;
                                break;
                            case 4:
                                strFormularize4 = dernVarSaneness.formularize(descriptor2, 4);
                                i2 |= 16;
                                break;
                            case 5:
                                strFormularize5 = dernVarSaneness.formularize(descriptor2, 5);
                                i2 |= 32;
                                break;
                            case 6:
                                objSealless2 = dernVarSaneness.sealless(descriptor2, 6, licking.f39425attabal, objSealless2);
                                i2 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(iImpassible);
                        }
                    }
                    z = zRotuma2;
                    i = i2;
                    str = strFormularize6;
                    str2 = strFormularize4;
                    str3 = strFormularize5;
                    objSealless = objSealless2;
                    d = dMarial2;
                }
                int i3 = iYemenite;
                dernVarSaneness.dern(descriptor2);
                return new CSBParam(i, d, i3, z, str, str2, str3, (String) objSealless, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, CSBParam value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                CSBParam.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.wireman$marial$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/wireman$marial$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/wireman$marial;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<CSBParam> serializer() {
                return attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public CSBParam(double d, int i, boolean z, String parentAuctionId, String creativeId, String adUnitId, String str) {
            Intrinsics.checkNotNullParameter(parentAuctionId, "parentAuctionId");
            Intrinsics.checkNotNullParameter(creativeId, "creativeId");
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.bidfloor = d;
            this.phase = i;
            this.isVXWinner = z;
            this.parentAuctionId = parentAuctionId;
            this.creativeId = creativeId;
            this.adUnitId = adUnitId;
            this.ext = str;
        }

        public static /* synthetic */ CSBParam copy$default(CSBParam cSBParam, double d, int i, boolean z, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = cSBParam.bidfloor;
            }
            double d2 = d;
            if ((i2 & 2) != 0) {
                i = cSBParam.phase;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = cSBParam.isVXWinner;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                str = cSBParam.parentAuctionId;
            }
            String str5 = str;
            if ((i2 & 16) != 0) {
                str2 = cSBParam.creativeId;
            }
            return cSBParam.copy(d2, i3, z2, str5, str2, (i2 & 32) != 0 ? cSBParam.adUnitId : str3, (i2 & 64) != 0 ? cSBParam.ext : str4);
        }

        public static final void write$Self(CSBParam self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.formularize(serialDesc, 0, self.bidfloor);
            output.molybdenite(serialDesc, 1, self.phase);
            output.kowloon(serialDesc, 2, self.isVXWinner);
            output.stratoscope(serialDesc, 3, self.parentAuctionId);
            output.stratoscope(serialDesc, 4, self.creativeId);
            output.stratoscope(serialDesc, 5, self.adUnitId);
            if (!output.cuirassed(serialDesc, 6) && self.ext == null) {
                return;
            }
            output.taiyuan(serialDesc, 6, licking.f39425attabal, self.ext);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getBidfloor() {
            return this.bidfloor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPhase() {
            return this.phase;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsVXWinner() {
            return this.isVXWinner;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getParentAuctionId() {
            return this.parentAuctionId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCreativeId() {
            return this.creativeId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getAdUnitId() {
            return this.adUnitId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getExt() {
            return this.ext;
        }

        public final CSBParam copy(double bidfloor, int phase, boolean isVXWinner, String parentAuctionId, String creativeId, String adUnitId, String ext) {
            Intrinsics.checkNotNullParameter(parentAuctionId, "parentAuctionId");
            Intrinsics.checkNotNullParameter(creativeId, "creativeId");
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            return new CSBParam(bidfloor, phase, isVXWinner, parentAuctionId, creativeId, adUnitId, ext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CSBParam)) {
                return false;
            }
            CSBParam cSBParam = (CSBParam) other;
            return Intrinsics.wireman(Double.valueOf(this.bidfloor), Double.valueOf(cSBParam.bidfloor)) && this.phase == cSBParam.phase && this.isVXWinner == cSBParam.isVXWinner && Intrinsics.wireman(this.parentAuctionId, cSBParam.parentAuctionId) && Intrinsics.wireman(this.creativeId, cSBParam.creativeId) && Intrinsics.wireman(this.adUnitId, cSBParam.adUnitId) && Intrinsics.wireman(this.ext, cSBParam.ext);
        }

        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public final double getBidfloor() {
            return this.bidfloor;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getExt() {
            return this.ext;
        }

        public final String getParentAuctionId() {
            return this.parentAuctionId;
        }

        public final int getPhase() {
            return this.phase;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        public int hashCode() {
            int iHashCode = ((Double.hashCode(this.bidfloor) * 31) + Integer.hashCode(this.phase)) * 31;
            boolean z = this.isVXWinner;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int iHashCode2 = (((((((iHashCode + r1) * 31) + this.parentAuctionId.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.adUnitId.hashCode()) * 31;
            String str = this.ext;
            return iHashCode2 + (str == null ? 0 : str.hashCode());
        }

        public final boolean isVXWinner() {
            return this.isVXWinner;
        }

        public String toString() {
            return "CSBParam(bidfloor=" + this.bidfloor + ", phase=" + this.phase + ", isVXWinner=" + this.isVXWinner + ", parentAuctionId=" + this.parentAuctionId + ", creativeId=" + this.creativeId + ", adUnitId=" + this.adUnitId + ", ext=" + this.ext + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ CSBParam(int i, double d, int i2, boolean z, String str, String str2, String str3, String str4, immediately immediatelyVar) {
            if (63 != (i & 63)) {
                hardpan.attabal(i, 63, attabal.INSTANCE.getDescriptor());
            }
            this.bidfloor = d;
            this.phase = i2;
            this.isVXWinner = z;
            this.parentAuctionId = str;
            this.creativeId = str2;
            this.adUnitId = str3;
            if ((i & 64) == 0) {
                this.ext = null;
            } else {
                this.ext = str4;
            }
        }

        public /* synthetic */ CSBParam(double d, int i, boolean z, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, i, z, str, str2, str3, (i2 & 64) != 0 ? null : str4);
        }

        public static /* synthetic */ void getAdUnitId$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getParentAuctionId$annotations() {
        }

        public static /* synthetic */ void isVXWinner$annotations() {
        }
    }

    public /* synthetic */ CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceNode, (i & 2) != 0 ? null : appNode, (i & 4) != 0 ? null : user, (i & 8) != 0 ? null : requestExt, (i & 16) != 0 ? null : requestParam);
    }
}
