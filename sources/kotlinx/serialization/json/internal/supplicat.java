package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/serialization/json/internal/supplicat;", "Lkotlinx/serialization/json/internal/marial;", "Lcutwater/attabal;", "json", "Lkotlin/Function1;", "Lcutwater/impromptu;", "", "nodeConsumer", "<init>", "(Lcutwater/attabal;Lkotlin/jvm/functions/Function1;)V", "", X3.i.W, "element", "lightstruck", "(Ljava/lang/String;Lcutwater/impromptu;)V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lbristol/beachfront;", "descriptor", "", "index", "Lasosan/impassible;", "serializer", "value", "taiyuan", "(Lbristol/beachfront;ILasosan/impassible;Ljava/lang/Object;)V", "igbo", "()Lcutwater/impromptu;", "", "competently", "Ljava/util/Map;", "monroe", "()Ljava/util/Map;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class supplicat extends marial {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Map<String, cutwater.impromptu> content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public supplicat(cutwater.attabal json, Function1<? super cutwater.impromptu, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.content = new LinkedHashMap();
    }

    @Override // kotlinx.serialization.json.internal.marial
    public cutwater.impromptu igbo() {
        return new cutwater.trm(this.content);
    }

    @Override // kotlinx.serialization.json.internal.marial
    public void lightstruck(String key, cutwater.impromptu element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.content.put(key, element);
    }

    public final Map<String, cutwater.impromptu> monroe() {
        return this.content;
    }

    @Override // vinyl.pruinose, fastidiously.wireman
    public <T> void taiyuan(bristol.beachfront descriptor, int index, asosan.impassible<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.taiyuan(descriptor, index, serializer, value);
        }
    }
}
