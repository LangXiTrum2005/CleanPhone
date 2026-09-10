package needler;

import byname.marial;
import discontentedly.dern;
import discontentedly.saneness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {
    public static final void attabal(dern dernVar, saneness from, wireman scopeOwner, marial name) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        if (dernVar == dern.attabal.f25322attabal) {
            return;
        }
        from.getLocation();
    }

    public static final void dern(dern dernVar, saneness from, String packageFqName, String name) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        if (dernVar == dern.attabal.f25322attabal) {
            return;
        }
        from.getLocation();
    }

    public static final void saneness(dern dernVar, saneness from, sealless scopeOwner, marial name) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        String strSaneness = scopeOwner.marial().saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        String strDern = name.dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        dern(dernVar, from, strSaneness, strDern);
    }
}
