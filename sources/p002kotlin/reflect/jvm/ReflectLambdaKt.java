package p002kotlin.reflect.jvm;

import foreshot.marial;
import foreshot.taiyuan;
import genesis.competently;
import kurbash.impromptu;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.KFunctionImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import p002kotlin.reflect.jvm.internal.molybdenite;
import patroclinal.beachfront;

/* JADX INFO: compiled from: reflectLambda.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"R", "Lpatroclinal/beachfront;", "Lkurbash/impromptu;", "attabal", "(Lpatroclinal/beachfront;)Lkurbash/impromptu;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ReflectLambdaKt {
    public static final <R> impromptu<R> attabal(beachfront<? extends R> beachfrontVar) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Metadata metadata = (Metadata) beachfrontVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        Pair<foreshot.beachfront, ProtoBuf$Function> pairCutely = taiyuan.cutely(strArrD1, metadata.d2());
        foreshot.beachfront beachfrontVarComponent1 = pairCutely.component1();
        ProtoBuf$Function protoBuf$FunctionComponent2 = pairCutely.component2();
        marial marialVar = new marial(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = beachfrontVar.getClass();
        ProtoBuf$TypeTable typeTable = protoBuf$FunctionComponent2.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        return new KFunctionImpl(p002kotlin.reflect.jvm.internal.marial.f31929polloi, (hydrovane) molybdenite.impromptu(cls, protoBuf$FunctionComponent2, beachfrontVarComponent1, new competently(typeTable), marialVar, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
    }
}
