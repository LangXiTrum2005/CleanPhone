package p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p002kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.itchy;
import p002kotlin.reflect.jvm.internal.impl.types.kowloon;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.reflect.jvm.internal.impl.types.trm;
import yeast.formularize;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CapturedTypeConstructorKt {

    /* JADX INFO: compiled from: CapturedTypeConstructor.kt */
    public static final class attabal extends kowloon {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ boolean f31306wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(itchy itchyVar, boolean z) {
            super(itchyVar);
            this.f31306wireman = z;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.kowloon, p002kotlin.reflect.jvm.internal.impl.types.itchy
        public timberyard marial(oilcan key) {
            Intrinsics.checkNotNullParameter(key, "key");
            timberyard timberyardVarMarial = super.marial(key);
            if (timberyardVarMarial == null) {
                return null;
            }
            beachfront beachfrontVarWireman = key.setterwort().wireman();
            return CapturedTypeConstructorKt.saneness(timberyardVarMarial, beachfrontVarWireman instanceof clubfoot ? (clubfoot) beachfrontVarWireman : null);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
        public boolean saneness() {
            return this.f31306wireman;
        }
    }

    public static /* synthetic */ itchy beachfront(itchy itchyVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return marial(itchyVar, z);
    }

    public static final oilcan dern(timberyard typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        return new p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.attabal(typeProjection, null, false, null, 14, null);
    }

    public static final itchy marial(itchy itchyVar, boolean z) {
        Intrinsics.checkNotNullParameter(itchyVar, "<this>");
        if (!(itchyVar instanceof trm)) {
            return new attabal(itchyVar, z);
        }
        trm trmVar = (trm) itchyVar;
        clubfoot[] clubfootVarArrCutely = trmVar.cutely();
        List<Pair> listSakeen = polloi.sakeen(trmVar.taiyuan(), trmVar.cutely());
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listSakeen, 10));
        for (Pair pair : listSakeen) {
            arrayList.add(saneness((timberyard) pair.getFirst(), (clubfoot) pair.getSecond()));
        }
        return new trm(clubfootVarArrCutely, (timberyard[]) arrayList.toArray(new timberyard[0]), z);
    }

    public static final timberyard saneness(final timberyard timberyardVar, clubfoot clubfootVar) {
        if (clubfootVar == null || timberyardVar.dern() == Variance.INVARIANT) {
            return timberyardVar;
        }
        if (clubfootVar.cutely() != timberyardVar.dern()) {
            return new treadless(dern(timberyardVar));
        }
        if (!timberyardVar.saneness()) {
            return new treadless(timberyardVar.getType());
        }
        formularize NO_LOCKS = LockBasedStorageManager.f31625marial;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new treadless(new LazyWrappedType(NO_LOCKS, new Function0<oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$createCapturedIfNeeded$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final oilcan invoke() {
                oilcan type = timberyardVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return type;
            }
        }));
    }

    public static final boolean wireman(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return oilcanVar.setterwort() instanceof saneness;
    }
}
