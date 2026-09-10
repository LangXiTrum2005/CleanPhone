package prescient;

import java.util.Arrays;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.gintrap;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;

/* JADX INFO: compiled from: ErrorType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial extends merc {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final String[] f35675adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final permissivist f35676arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final String f35677dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final boolean f35678graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final List<timberyard> f35679molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final MemberScope f35680monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final ErrorTypeKind f35681polloi;

    public /* synthetic */ marial(permissivist permissivistVar, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(permissivistVar, memberScope, errorTypeKind, (i & 8) != 0 ? adultoid.formularize() : list, (i & 16) != 0 ? false : z, strArr);
    }

    public final ErrorTypeKind basify() {
        return this.f35681polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public List<timberyard> dhss() {
        return this.f35679molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public MemberScope formularize() {
        return this.f35680monoploid;
    }

    public final String immediately() {
        return this.f35677dovishness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public boolean mastfed() {
        return this.f35678graveside;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: molet */
    public merc lampshade(boolean z) {
        permissivist permissivistVar = setterwort();
        MemberScope memberScopeFormularize = formularize();
        ErrorTypeKind errorTypeKind = this.f35681polloi;
        List<timberyard> listDhss = dhss();
        String[] strArr = this.f35675adultoid;
        return new marial(permissivistVar, memberScopeFormularize, errorTypeKind, listDhss, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final marial prefect(List<? extends timberyard> newArguments) {
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        permissivist permissivistVar = setterwort();
        MemberScope memberScopeFormularize = formularize();
        ErrorTypeKind errorTypeKind = this.f35681polloi;
        boolean zMastfed = mastfed();
        String[] strArr = this.f35675adultoid;
        return new marial(permissivistVar, memberScopeFormularize, errorTypeKind, newArguments, zMastfed, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: sakeen */
    public merc deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public permissivist setterwort() {
        return this.f35676arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: tectonization, reason: merged with bridge method [inline-methods] */
    public marial libyan(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public overspeculate vesuvio() {
        return overspeculate.f31797arytenoidectomy.taiyuan();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public marial(permissivist constructor, MemberScope memberScope, ErrorTypeKind kind, List<? extends timberyard> arguments, boolean z, String... formatParams) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f35676arytenoidectomy = constructor;
        this.f35680monoploid = memberScope;
        this.f35681polloi = kind;
        this.f35679molybdenite = arguments;
        this.f35678graveside = z;
        this.f35675adultoid = formatParams;
        gintrap gintrapVar = gintrap.f29390attabal;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.f35677dovishness = str;
    }
}
