package bristol;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import vinyl.deadwork;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "serialName", "", "Lbristol/beachfront;", "typeParameters", "Lkotlin/Function1;", "Lbristol/attabal;", "", "builderAction", "dern", "(Ljava/lang/String;[Lbristol/beachfront;Lkotlin/jvm/functions/Function1;)Lbristol/beachfront;", "Lbristol/marial;", "kind", "saneness", "(Ljava/lang/String;Lbristol/marial;)Lbristol/beachfront;", "Lbristol/impassible;", "builder", "wireman", "(Ljava/lang/String;Lbristol/impassible;[Lbristol/beachfront;Lkotlin/jvm/functions/Function1;)Lbristol/beachfront;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class formularize {
    public static final Unit beachfront(attabal attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        return Unit.f29295attabal;
    }

    public static final beachfront dern(String serialName, beachfront[] typeParameters, Function1<? super attabal, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.empress(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        attabal attabalVar = new attabal(serialName);
        builderAction.invoke(attabalVar);
        return new taiyuan(serialName, triweekly.attabal.f15179attabal, attabalVar.beachfront().size(), polloi.unconsolidated(typeParameters), attabalVar);
    }

    public static /* synthetic */ beachfront marial(String str, impassible impassibleVar, beachfront[] beachfrontVarArr, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: bristol.apical
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return formularize.beachfront((attabal) obj2);
                }
            };
        }
        return wireman(str, impassibleVar, beachfrontVarArr, function1);
    }

    public static final beachfront saneness(String serialName, marial kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.empress(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return deadwork.attabal(serialName, kind);
    }

    public static final beachfront wireman(String serialName, impassible kind, beachfront[] typeParameters, Function1<? super attabal, Unit> builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.empress(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.wireman(kind, triweekly.attabal.f15179attabal)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        attabal attabalVar = new attabal(serialName);
        builder.invoke(attabalVar);
        return new taiyuan(serialName, kind, attabalVar.beachfront().size(), polloi.unconsolidated(typeParameters), attabalVar);
    }
}
