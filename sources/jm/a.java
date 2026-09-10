package jm;

import kotlin.jvm.internal.n;
import pm.y;
import yl.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends al.b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43986b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f43987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f43988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zk.b declarationDescriptor, y receiverType, f fVar) {
        super(receiverType);
        n.f(declarationDescriptor, "declarationDescriptor");
        n.f(receiverType, "receiverType");
        this.f43988d = declarationDescriptor;
        this.f43987c = fVar;
    }

    public final f H0() {
        switch (this.f43986b) {
            case 0:
                break;
        }
        return this.f43987c;
    }

    public final String toString() {
        switch (this.f43986b) {
            case 0:
                return getType() + ": Ctx { " + ((zk.e) this.f43988d) + " }";
            default:
                return "Cxt { " + ((zk.b) this.f43988d) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zk.e eVar, y receiverType, f fVar) {
        super(receiverType);
        n.f(receiverType, "receiverType");
        this.f43988d = eVar;
        this.f43987c = fVar;
    }
}
