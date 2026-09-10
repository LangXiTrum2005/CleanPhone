package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.marial;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.formularize;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import prescient.competently;

/* JADX INFO: compiled from: suspendFunctionTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dovishness f29813attabal;

    static {
        formularize formularizeVar = new formularize(competently.f35667attabal.taiyuan(), competently.f29679monoploid);
        ClassKind classKind = ClassKind.INTERFACE;
        marial marialVarCompetently = competently.f29673graveside.competently();
        walach walachVar = walach.f30274attabal;
        yeast.formularize formularizeVar2 = LockBasedStorageManager.f31625marial;
        dovishness dovishnessVar = new dovishness(formularizeVar, classKind, false, false, marialVarCompetently, walachVar, formularizeVar2);
        dovishnessVar.setterwort(Modality.ABSTRACT);
        dovishnessVar.attendance(polloi.f30212marial);
        dovishnessVar.mastfed(graveside.marial(kattegat.libyan(dovishnessVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), false, Variance.IN_VARIANCE, marial.cutely(RequestConfiguration.MAX_AD_CONTENT_RATING_T), 0, formularizeVar2)));
        dovishnessVar.dhss();
        f29813attabal = dovishnessVar;
    }

    public static final merc attabal(oilcan suspendFunType) {
        Intrinsics.checkNotNullParameter(suspendFunType, "suspendFunType");
        marial.polloi(suspendFunType);
        beachfront beachfrontVarTaiyuan = TypeUtilsKt.taiyuan(suspendFunType);
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations = suspendFunType.getAnnotations();
        oilcan oilcanVarApical = marial.apical(suspendFunType);
        List<oilcan> listMarial = marial.marial(suspendFunType);
        List<timberyard> listImpassible = marial.impassible(suspendFunType);
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(listImpassible, 10));
        Iterator<T> it = listImpassible.iterator();
        while (it.hasNext()) {
            arrayList.add(((timberyard) it.next()).getType());
        }
        overspeculate overspeculateVarTaiyuan = overspeculate.f31797arytenoidectomy.taiyuan();
        permissivist permissivistVarImpromptu = f29813attabal.impromptu();
        Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
        List listClaque = CollectionsKt.claque(arrayList, KotlinTypeFactory.formularize(overspeculateVarTaiyuan, permissivistVarImpromptu, graveside.marial(TypeUtilsKt.attabal(marial.formularize(suspendFunType))), false, null, 16, null));
        merc mercVarRestrictive = TypeUtilsKt.taiyuan(suspendFunType).restrictive();
        Intrinsics.checkNotNullExpressionValue(mercVarRestrictive, "getNullableAnyType(...)");
        return marial.saneness(beachfrontVarTaiyuan, annotations, oilcanVarApical, listMarial, listClaque, null, mercVarRestrictive, (128 & 128) != 0 ? false : false).lampshade(suspendFunType.mastfed());
    }
}
