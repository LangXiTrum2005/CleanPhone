package kotlinx.serialization.json.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcutwater/attabal;", "Lbristol/beachfront;", CampaignEx.JSON_KEY_DESC, "Lkotlinx/serialization/json/internal/WriteMode;", "saneness", "(Lcutwater/attabal;Lbristol/beachfront;)Lkotlinx/serialization/json/internal/WriteMode;", "Lcerebral/dern;", "module", "attabal", "(Lbristol/beachfront;Lcerebral/dern;)Lbristol/beachfront;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class dent {
    public static final bristol.beachfront attabal(bristol.beachfront beachfrontVar, cerebral.dern module) {
        bristol.beachfront beachfrontVarAttabal;
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.wireman(beachfrontVar.getKind(), bristol.impassible.attabal.f15155attabal)) {
            return beachfrontVar.getIsInline() ? attabal(beachfrontVar.competently(0), module) : beachfrontVar;
        }
        bristol.beachfront beachfrontVarSaneness = bristol.saneness.saneness(module, beachfrontVar);
        return (beachfrontVarSaneness == null || (beachfrontVarAttabal = attabal(beachfrontVarSaneness, module)) == null) ? beachfrontVar : beachfrontVarAttabal;
    }

    public static final WriteMode saneness(cutwater.attabal attabalVar, bristol.beachfront desc) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        bristol.impassible kind = desc.getKind();
        if (kind instanceof bristol.wireman) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.wireman(kind, bristol.triweekly.saneness.f15181attabal)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.wireman(kind, bristol.triweekly.dern.f15180attabal)) {
            return WriteMode.OBJ;
        }
        bristol.beachfront beachfrontVarAttabal = attabal(desc.competently(0), attabalVar.getSerializersModule());
        bristol.impassible kind2 = beachfrontVarAttabal.getKind();
        if ((kind2 instanceof bristol.marial) || Intrinsics.wireman(kind2, bristol.impassible.saneness.f15156attabal)) {
            return WriteMode.MAP;
        }
        if (attabalVar.getConfiguration().getAllowStructuredMapKeys()) {
            return WriteMode.LIST;
        }
        throw preprohormone.wireman(beachfrontVarAttabal);
    }
}
