package wf;

import am.k;
import kotlin.jvm.internal.n;
import qk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements mk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f53175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53177c;

    public a(Object obj) {
        this.f53175a = obj;
    }

    @Override // mk.a
    public final Object getValue(Object obj, w property) {
        n.f(property, "property");
        return this.f53175a;
    }

    @Override // mk.b
    public final void setValue(Object obj, w property, Object obj2) {
        n.f(property, "property");
        Object obj3 = this.f53175a;
        switch (this.f53176b) {
            case 2:
                n.f(property, "property");
                if (((k) this.f53177c).f3728a) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                break;
            default:
                n.f(property, "property");
                break;
        }
        this.f53175a = obj2;
        switch (this.f53176b) {
            case 0:
                n.f(property, "property");
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                b bVar = (b) this.f53177c;
                ec.a aVar = bVar.f53181c;
                if (aVar != null) {
                    aVar.c(bVar.d());
                    return;
                }
                return;
            case 1:
                n.f(property, "property");
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                b bVar2 = (b) this.f53177c;
                ec.a aVar2 = bVar2.f53181c;
                if (aVar2 != null) {
                    aVar2.c(bVar2.d());
                    return;
                }
                return;
            default:
                n.f(property, "property");
                return;
        }
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f53175a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i10) {
        this(0);
        this.f53176b = i10;
        switch (i10) {
            case 1:
                this.f53177c = bVar;
                this(0);
                break;
            default:
                this.f53177c = bVar;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Object obj, k kVar) {
        this(obj);
        this.f53176b = 2;
        this.f53177c = kVar;
    }
}
