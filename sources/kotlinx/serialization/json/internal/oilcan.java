package kotlinx.serialization.json.internal;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/json/internal/oilcan;", "Lkotlinx/serialization/json/internal/marial;", "Lcutwater/attabal;", "json", "Lkotlin/Function1;", "Lcutwater/impromptu;", "", "nodeConsumer", "<init>", "(Lcutwater/attabal;Lkotlin/jvm/functions/Function1;)V", "", X3.i.W, "element", "lightstruck", "(Ljava/lang/String;Lcutwater/impromptu;)V", "igbo", "()Lcutwater/impromptu;", "competently", "Lcutwater/impromptu;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class oilcan extends marial {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public cutwater.impromptu content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oilcan(cutwater.attabal json, Function1<? super cutwater.impromptu, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        permissivist("primitive");
    }

    @Override // kotlinx.serialization.json.internal.marial
    public cutwater.impromptu igbo() {
        cutwater.impromptu impromptuVar = this.content;
        if (impromptuVar != null) {
            return impromptuVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // kotlinx.serialization.json.internal.marial
    public void lightstruck(String key, cutwater.impromptu element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.content != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.content = element;
        gusty().invoke(element);
    }
}
