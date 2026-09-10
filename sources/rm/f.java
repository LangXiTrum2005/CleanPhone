package rm;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.n;
import pm.a1;
import pm.c0;
import pm.j0;
import pm.n0;
import pm.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f49663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f49664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f49665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f49666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f49668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49669h;

    public f(n0 n0Var, e eVar, h kind, List arguments, boolean z10, String... formatParams) {
        n.f(kind, "kind");
        n.f(arguments, "arguments");
        n.f(formatParams, "formatParams");
        this.f49663b = n0Var;
        this.f49664c = eVar;
        this.f49665d = kind;
        this.f49666e = arguments;
        this.f49667f = z10;
        this.f49668g = formatParams;
        String str = kind.f49696a;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f49669h = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // pm.y
    public final im.n A() {
        return this.f49664c;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        n.f(newAttributes, "newAttributes");
        return this;
    }

    @Override // pm.y
    public final j0 M() {
        j0.f48443b.getClass();
        return j0.f48444c;
    }

    @Override // pm.y
    public final n0 P() {
        return this.f49663b;
    }

    @Override // pm.y
    public final boolean Q() {
        return this.f49667f;
    }

    @Override // pm.y
    /* JADX INFO: renamed from: U */
    public final y j0(qm.f kotlinTypeRefiner) {
        n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // pm.a1
    public final a1 j0(qm.f kotlinTypeRefiner) {
        n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // pm.c0, pm.a1
    public final a1 m0(j0 newAttributes) {
        n.f(newAttributes, "newAttributes");
        return this;
    }

    @Override // pm.y
    public final List t() {
        return this.f49666e;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        String[] strArr = this.f49668g;
        return new f(this.f49663b, this.f49664c, this.f49665d, this.f49666e, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
