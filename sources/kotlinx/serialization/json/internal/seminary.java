package kotlinx.serialization.json.internal;

import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/json/internal/seminary;", "Lkotlinx/serialization/json/internal/supplicat;", "Lcutwater/attabal;", "json", "Lkotlin/Function1;", "Lcutwater/impromptu;", "", "nodeConsumer", "<init>", "(Lcutwater/attabal;Lkotlin/jvm/functions/Function1;)V", "", X3.i.W, "element", "lightstruck", "(Ljava/lang/String;Lcutwater/impromptu;)V", "igbo", "()Lcutwater/impromptu;", "impromptu", "Ljava/lang/String;", "tag", "", "taiyuan", "Z", "isKey", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class seminary extends supplicat {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public String tag;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public boolean isKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seminary(cutwater.attabal json, Function1<? super cutwater.impromptu, Unit> nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.supplicat, kotlinx.serialization.json.internal.marial
    public cutwater.impromptu igbo() {
        return new cutwater.trm(monroe());
    }

    @Override // kotlinx.serialization.json.internal.supplicat, kotlinx.serialization.json.internal.marial
    public void lightstruck(String key, cutwater.impromptu element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.isKey) {
            Map<String, cutwater.impromptu> mapMonroe = monroe();
            String str = this.tag;
            if (str == null) {
                Intrinsics.preprohormone("tag");
                str = null;
            }
            mapMonroe.put(str, element);
            this.isKey = true;
            return;
        }
        if (element instanceof cutwater.sealless) {
            this.tag = ((cutwater.sealless) element).getContent();
            this.isKey = false;
        } else {
            if (element instanceof cutwater.trm) {
                throw preprohormone.wireman(cutwater.yemenite.f24595attabal.getDescriptor());
            }
            if (!(element instanceof cutwater.saneness)) {
                throw new NoWhenBranchMatchedException();
            }
            throw preprohormone.wireman(cutwater.dern.f24560attabal.getDescriptor());
        }
    }
}
