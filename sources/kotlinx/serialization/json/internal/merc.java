package kotlinx.serialization.json.internal;

import com.ironsource.X3;
import java.util.ArrayList;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0017j\b\u0012\u0004\u0012\u00020\u0005`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/merc;", "Lkotlinx/serialization/json/internal/marial;", "Lcutwater/attabal;", "json", "Lkotlin/Function1;", "Lcutwater/impromptu;", "", "nodeConsumer", "<init>", "(Lcutwater/attabal;Lkotlin/jvm/functions/Function1;)V", "Lbristol/beachfront;", "descriptor", "", "index", "", "premeiotic", "(Lbristol/beachfront;I)Ljava/lang/String;", X3.i.W, "element", "lightstruck", "(Ljava/lang/String;Lcutwater/impromptu;)V", "igbo", "()Lcutwater/impromptu;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "competently", "Ljava/util/ArrayList;", "array", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class merc extends marial {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final ArrayList<cutwater.impromptu> array;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public merc(cutwater.attabal json, Function1<? super cutwater.impromptu, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.array = new ArrayList<>();
    }

    @Override // kotlinx.serialization.json.internal.marial
    public cutwater.impromptu igbo() {
        return new cutwater.saneness(this.array);
    }

    @Override // kotlinx.serialization.json.internal.marial
    public void lightstruck(String key, cutwater.impromptu element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.array.add(Integer.parseInt(key), element);
    }

    @Override // kotlinx.serialization.json.internal.marial, vinyl.sensatory
    public String premeiotic(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(index);
    }
}
