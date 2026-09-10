package tk;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f51030g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f51031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f51032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f51033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p1 f51034f;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f51030g = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(o0.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(o0.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(o0.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(o0.class), TtmlNode.TAG_METADATA, "getMetadata()Lkotlin/Triple;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(o0.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public o0(q0 q0Var) {
        super(q0Var);
        this.f51031c = q1.g(null, new l0(q0Var, 0));
        this.f51032d = q1.g(null, new n0(this, 1));
        this.f51033e = new p1(new m0(this, q0Var));
        this.f51034f = new p1(new n0(this, 0));
        q1.g(null, new m0(q0Var, this));
    }
}
