package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class cultivated extends itchy {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final attabal f31745dern = new attabal(null);

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.cultivated$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TypeSubstitution.kt */
        public static final class C0708attabal extends cultivated {

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public final /* synthetic */ boolean f31746marial;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ Map<permissivist, timberyard> f31747wireman;

            /* JADX WARN: Multi-variable type inference failed */
            public C0708attabal(Map<permissivist, ? extends timberyard> map, boolean z) {
                this.f31747wireman = map;
                this.f31746marial = z;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.types.cultivated
            public timberyard apical(permissivist key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return this.f31747wireman.get(key);
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
            public boolean attabal() {
                return this.f31746marial;
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
            public boolean beachfront() {
                return this.f31747wireman.isEmpty();
            }
        }

        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ cultivated marial(attabal attabalVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return attabalVar.wireman(map, z);
        }

        public final itchy attabal(oilcan kotlinType) {
            Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
            return saneness(kotlinType.setterwort(), kotlinType.dhss());
        }

        public final cultivated dern(Map<permissivist, ? extends timberyard> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return marial(this, map, false, 2, null);
        }

        public final itchy saneness(permissivist typeConstructor, List<? extends timberyard> arguments) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List<clubfoot> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            clubfoot clubfootVar = (clubfoot) CollectionsKt.picketboat(parameters);
            if (clubfootVar == null || !clubfootVar.grimness()) {
                return new trm(parameters, arguments);
            }
            List<clubfoot> parameters2 = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
            List<clubfoot> list = parameters2;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((clubfoot) it.next()).impromptu());
            }
            return marial(this, seminary.dovishness(CollectionsKt.fastrack(arrayList, arguments)), false, 2, null);
        }

        public final cultivated wireman(Map<permissivist, ? extends timberyard> map, boolean z) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new C0708attabal(map, z);
        }

        public attabal() {
        }
    }

    public static final cultivated cutely(Map<permissivist, ? extends timberyard> map) {
        return f31745dern.dern(map);
    }

    public static final itchy taiyuan(permissivist permissivistVar, List<? extends timberyard> list) {
        return f31745dern.saneness(permissivistVar, list);
    }

    public abstract timberyard apical(permissivist permissivistVar);

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public timberyard marial(oilcan key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return apical(key.setterwort());
    }
}
