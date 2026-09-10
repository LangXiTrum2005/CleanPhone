package adjudge;

import ads_mobile_sdk.so0;
import android.os.Bundle;
import complexometry.formularize;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ladjudge/saneness;", "Lcomplexometry/formularize;", "", "signalType", "adUnitId", "", "categoryExclusions", "contentUrl", "", "customTargeting", "Landroid/os/Bundle;", "googleExtrasBundle", "keywords", "neighboringContentUrls", "adSourceExtrasBundles", "publisherProvidedId", "requestAgent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;Landroid/os/Bundle;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "formularize", "Ljava/lang/String;", "preprohormone", "()Ljava/lang/String;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class saneness extends formularize {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final String signalType;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final so0 f3279impassible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 int, still in use, count: 1, list:
  (r1v1 int) from 0x0045: IF  (r1v1 int) != (-376111084 int)  -> B:4:0x0047 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public saneness(String signalType, String str, Set<String> categoryExclusions, String str2, Map<String, String> customTargeting, Bundle googleExtrasBundle, Set<String> keywords, Set<String> neighboringContentUrls, Map<String, Bundle> adSourceExtrasBundles, String str3, String str4) {
        so0 so0Var;
        super(str, categoryExclusions, str2, customTargeting, googleExtrasBundle, keywords, neighboringContentUrls, adSourceExtrasBundles, str3, str4, 0L);
        Intrinsics.checkNotNullParameter(signalType, "signalType");
        Intrinsics.checkNotNullParameter(categoryExclusions, "categoryExclusions");
        Intrinsics.checkNotNullParameter(customTargeting, "customTargeting");
        Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(neighboringContentUrls, "neighboringContentUrls");
        Intrinsics.checkNotNullParameter(adSourceExtrasBundles, "adSourceExtrasBundles");
        this.signalType = signalType;
        if (signalType.hashCode() != -376111084) {
            switch (signalType) {
                case "requester_type_0":
                    so0Var = so0.SCAR_REQUEST_TYPE_ADMOB;
                    break;
                case "requester_type_1":
                    so0Var = so0.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                    break;
                case "requester_type_2":
                    so0Var = so0.SCAR_REQUEST_TYPE_GBID;
                    break;
                case "requester_type_3":
                    so0Var = so0.SCAR_REQUEST_TYPE_GOLDENEYE;
                    break;
                case "requester_type_4":
                    so0Var = so0.SCAR_REQUEST_TYPE_YAVIN;
                    break;
                case "requester_type_5":
                    so0Var = so0.SCAR_REQUEST_TYPE_UNITY;
                    break;
                case "requester_type_6":
                    so0Var = so0.SCAR_REQUEST_TYPE_PAW;
                    break;
                case "requester_type_7":
                    so0Var = so0.SCAR_REQUEST_TYPE_GUILDER;
                    break;
                default:
                    so0Var = so0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
            }
        } else if (signalType.equals("signal_type_ad_manager_s2s")) {
            so0Var = so0.SCAR_REQUEST_TYPE_GAM_S2S;
        } else {
            so0Var = so0.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        this.f3279impassible = so0Var;
    }

    /* JADX INFO: renamed from: preprohormone, reason: from getter */
    public final String getSignalType() {
        return this.signalType;
    }

    /* JADX INFO: renamed from: rotuma, reason: from getter */
    public final so0 getF3279impassible() {
        return this.f3279impassible;
    }
}
