package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class trm extends itchy {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final clubfoot[] f31818dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f31819marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final timberyard[] f31820wireman;

    public /* synthetic */ trm(clubfoot[] clubfootVarArr, timberyard[] timberyardVarArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clubfootVarArr, timberyardVarArr, (i & 4) != 0 ? false : z);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public boolean beachfront() {
        return this.f31820wireman.length == 0;
    }

    public final clubfoot[] cutely() {
        return this.f31818dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public timberyard marial(oilcan key) {
        Intrinsics.checkNotNullParameter(key, "key");
        beachfront beachfrontVarWireman = key.setterwort().wireman();
        clubfoot clubfootVar = beachfrontVarWireman instanceof clubfoot ? (clubfoot) beachfrontVarWireman : null;
        if (clubfootVar == null) {
            return null;
        }
        int index = clubfootVar.getIndex();
        clubfoot[] clubfootVarArr = this.f31818dern;
        if (index >= clubfootVarArr.length || !Intrinsics.wireman(clubfootVarArr[index].impromptu(), clubfootVar.impromptu())) {
            return null;
        }
        return this.f31820wireman[index];
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public boolean saneness() {
        return this.f31819marial;
    }

    public final timberyard[] taiyuan() {
        return this.f31820wireman;
    }

    public trm(clubfoot[] parameters, timberyard[] arguments, boolean z) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f31818dern = parameters;
        this.f31820wireman = arguments;
        this.f31819marial = z;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public trm(List<? extends clubfoot> parameters, List<? extends timberyard> argumentsList) {
        this((clubfoot[]) parameters.toArray(new clubfoot[0]), (timberyard[]) argumentsList.toArray(new timberyard[0]), false, 4, null);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
    }
}
