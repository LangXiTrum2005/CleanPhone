package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.renderer.saneness;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p002kotlin.reflect.jvm.internal.impl.types.checker.marial;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.types.restrictive;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: RawType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RawTypeImpl extends preprohormone implements restrictive {
    public RawTypeImpl(merc mercVar, merc mercVar2, boolean z) {
        super(mercVar, mercVar2);
        if (z) {
            return;
        }
        marial.f31734attabal.wireman(mercVar, mercVar2);
    }

    public static final List<String> licking(DescriptorRenderer descriptorRenderer, oilcan oilcanVar) {
        List<timberyard> listDhss = oilcanVar.dhss();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listDhss, 10));
        Iterator<T> it = listDhss.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.dovishness((timberyard) it.next()));
        }
        return arrayList;
    }

    public static final String microchemistry(String str, String str2) {
        if (!StringsKt.splinterproof(str, '<', false, 2, null)) {
            return str;
        }
        return StringsKt.tarboosh(str, '<', null, 2, null) + '<' + str2 + '>' + StringsKt.microchemistry(str, '>', null, 2, null);
    }

    public static final boolean osteal(String str, String str2) {
        return Intrinsics.wireman(str, StringsKt.hardpan(str2, "out ")) || Intrinsics.wireman(str2, "*");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public String basify(DescriptorRenderer renderer, saneness options) {
        Pair pair;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        String strAdultoid = renderer.adultoid(sakeen());
        String strAdultoid2 = renderer.adultoid(immediately());
        if (options.getDebugMode()) {
            return "raw (" + strAdultoid + ".." + strAdultoid2 + ')';
        }
        if (immediately().dhss().isEmpty()) {
            return renderer.polloi(strAdultoid, strAdultoid2, TypeUtilsKt.taiyuan(this));
        }
        List<String> listLicking = licking(renderer, sakeen());
        List<String> listLicking2 = licking(renderer, immediately());
        List<String> list = listLicking;
        String strPreterite = CollectionsKt.preterite(list, ", ", null, null, 0, null, new Function1<String, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1
            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return "(raw) " + it;
            }
        }, 30, null);
        List listFastrack = CollectionsKt.fastrack(list, listLicking2);
        if (!(listFastrack instanceof Collection) || !listFastrack.isEmpty()) {
            Iterator it = listFastrack.iterator();
            do {
                if (!it.hasNext()) {
                    strAdultoid2 = microchemistry(strAdultoid2, strPreterite);
                    break;
                }
                pair = (Pair) it.next();
            } while (osteal((String) pair.getFirst(), (String) pair.getSecond()));
        } else {
            strAdultoid2 = microchemistry(strAdultoid2, strPreterite);
            break;
        }
        String strMicrochemistry = microchemistry(strAdultoid, strPreterite);
        return Intrinsics.wireman(strMicrochemistry, strAdultoid2) ? strMicrochemistry : renderer.polloi(strMicrochemistry, strAdultoid2, TypeUtilsKt.taiyuan(this));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: fastrack, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new RawTypeImpl(sakeen().deadwork(newAttributes), immediately().deadwork(newAttributes));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone, p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public MemberScope formularize() {
        beachfront beachfrontVarWireman = setterwort().wireman();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        byte b = 0;
        wireman wiremanVar = beachfrontVarWireman instanceof wireman ? (wireman) beachfrontVarWireman : null;
        if (wiremanVar != null) {
            MemberScope memberScopeCoi = wiremanVar.coi(new RawSubstitution(typeParameterUpperBoundEraser, 1, b == true ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue(memberScopeCoi, "getMemberScope(...)");
            return memberScopeCoi;
        }
        throw new IllegalStateException(("Incorrect classifier: " + setterwort().wireman()).toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.preprohormone
    public merc molet() {
        return sakeen();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: prefect, reason: merged with bridge method [inline-methods] */
    public preprohormone libyan(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        oilcan oilcanVarAttabal = kotlinTypeRefiner.attabal(sakeen());
        Intrinsics.competently(oilcanVarAttabal, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        oilcan oilcanVarAttabal2 = kotlinTypeRefiner.attabal(immediately());
        Intrinsics.competently(oilcanVarAttabal2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((merc) oilcanVarAttabal, (merc) oilcanVarAttabal2, true);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: tectonization, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl lampshade(boolean z) {
        return new RawTypeImpl(sakeen().lampshade(z), immediately().lampshade(z));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(merc lowerBound, merc upperBound) {
        this(lowerBound, upperBound, false);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }
}
