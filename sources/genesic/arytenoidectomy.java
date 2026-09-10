package genesic;

import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: javaLoading.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class arytenoidectomy {
    public static final boolean attabal(polloi polloiVar) {
        byname.dern dernVarMarial;
        stratoscope stratoscopeVar = (stratoscope) CollectionsKt.outmarry(polloiVar.beachfront());
        rotuma type = stratoscopeVar != null ? stratoscopeVar.getType() : null;
        cutely cutelyVar = type instanceof cutely ? (cutely) type : null;
        if (cutelyVar == null) {
            return false;
        }
        taiyuan taiyuanVarDern = cutelyVar.dern();
        return (taiyuanVarDern instanceof competently) && (dernVarMarial = ((competently) taiyuanVarDern).marial()) != null && Intrinsics.wireman(dernVarMarial.saneness(), "java.lang.Object");
    }

    public static final boolean dern(monoploid monoploidVar) {
        Intrinsics.checkNotNullParameter(monoploidVar, "<this>");
        return monoploidVar.grimness().supplicat() && (monoploidVar instanceof polloi) && saneness((polloi) monoploidVar);
    }

    public static final boolean saneness(polloi polloiVar) {
        String strDern = polloiVar.getName().dern();
        int iHashCode = strDern.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strDern.equals("equals")) {
                    return attabal(polloiVar);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strDern.equals("hashCode")) {
                return false;
            }
        } else if (!strDern.equals("toString")) {
            return false;
        }
        return polloiVar.beachfront().isEmpty();
    }
}
