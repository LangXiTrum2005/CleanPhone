package p002kotlin.reflect.jvm.internal.impl.types;

import com.ironsource.X3;
import java.io.IOException;
import java.util.Iterator;
import p002kotlin.collections.CollectionsKt___CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.text.graveside;
import presbytery.impromptu;
import presbytery.taiyuan;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class merc extends empress implements impromptu, taiyuan {
    public merc() {
        super(null);
    }

    /* JADX INFO: renamed from: molet */
    public abstract merc lampshade(boolean z);

    /* JADX INFO: renamed from: sakeen */
    public abstract merc deadwork(overspeculate overspeculateVar);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator<dern> it = getAnnotations().iterator();
        while (it.hasNext()) {
            graveside.triweekly(sb, X3.j.d, DescriptorRenderer.monoploid(DescriptorRenderer.f31199cutely, it.next(), null, 2, null), "] ");
        }
        sb.append(setterwort());
        if (!dhss().isEmpty()) {
            CollectionsKt___CollectionsKt.czestochowa(dhss(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (mastfed()) {
            sb.append("?");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
