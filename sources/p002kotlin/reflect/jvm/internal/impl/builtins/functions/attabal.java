package p002kotlin.reflect.jvm.internal.impl.builtins.functions;

import byname.dern;
import byname.marial;
import discontentedness.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import yeast.formularize;

/* JADX INFO: compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final formularize f29784attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trm f29785saneness;

    public attabal(formularize storageManager, trm module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f29784attabal = storageManager;
        this.f29785saneness = module;
    }

    @Override // discontentedness.saneness
    public Collection<wireman> attabal(dern packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return creditor.marial();
    }

    @Override // discontentedness.saneness
    public wireman dern(byname.saneness classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.apical() || classId.formularize()) {
            return null;
        }
        String strSaneness = classId.taiyuan().saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        if (!StringsKt.overspeculate(strSaneness, "Function", false, 2, null)) {
            return null;
        }
        dern dernVarImpromptu = classId.impromptu();
        Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
        beachfront.saneness sanenessVarDern = beachfront.f29786dern.attabal().dern(dernVarImpromptu, strSaneness);
        if (sanenessVarDern == null) {
            return null;
        }
        marial marialVarAttabal = sanenessVarDern.attabal();
        int iSaneness = sanenessVarDern.saneness();
        List<sealless> listMilliradian = this.f29785saneness.hydrovane(dernVarImpromptu).milliradian();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMilliradian) {
            if (obj instanceof p002kotlin.reflect.jvm.internal.impl.builtins.attabal) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof p002kotlin.reflect.jvm.internal.impl.builtins.wireman) {
                arrayList2.add(obj2);
            }
        }
        sealless seallessVar = (p002kotlin.reflect.jvm.internal.impl.builtins.wireman) CollectionsKt.firstOrNull(arrayList2);
        if (seallessVar == null) {
            seallessVar = (p002kotlin.reflect.jvm.internal.impl.builtins.attabal) CollectionsKt.lerp(arrayList);
        }
        return new saneness(this.f29784attabal, seallessVar, marialVarAttabal, iSaneness);
    }

    @Override // discontentedness.saneness
    public boolean saneness(dern packageFqName, marial name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        String strDern = name.dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return (dovishness.starveling(strDern, "Function", false, 2, null) || dovishness.starveling(strDern, "KFunction", false, 2, null) || dovishness.starveling(strDern, "SuspendFunction", false, 2, null) || dovishness.starveling(strDern, "KSuspendFunction", false, 2, null)) && beachfront.f29786dern.attabal().dern(packageFqName, strDern) != null;
    }
}
