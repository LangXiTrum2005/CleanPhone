package kotlinx.serialization.json.internal;

import com.ironsource.X3;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lkotlinx/serialization/json/internal/polder;", "Lkotlinx/serialization/json/internal/kattegat;", "Lcutwater/attabal;", "json", "Lcutwater/trm;", "value", "<init>", "(Lcutwater/attabal;Lcutwater/trm;)V", "Lbristol/beachfront;", "descriptor", "", "index", "", "itchy", "(Lbristol/beachfront;I)Ljava/lang/String;", "impassible", "(Lbristol/beachfront;)I", "tag", "Lcutwater/impromptu;", "empress", "(Ljava/lang/String;)Lcutwater/impromptu;", "", "dern", "(Lbristol/beachfront;)V", "Lcutwater/trm;", "technofreak", "()Lcutwater/trm;", "", "taiyuan", "Ljava/util/List;", "keys", "cutely", "I", "size", "apical", X3.i.L, "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class polder extends kattegat {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final List<String> keys;
    private final cutwater.trm value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public polder(cutwater.attabal json, cutwater.trm value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        List<String> listMolet = CollectionsKt.molet(getValue().keySet());
        this.keys = listMolet;
        this.size = listMolet.size() * 2;
        this.position = -1;
    }

    @Override // kotlinx.serialization.json.internal.kattegat, kotlinx.serialization.json.internal.dern, fastidiously.dern
    public void dern(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.kattegat, kotlinx.serialization.json.internal.dern
    public cutwater.impromptu empress(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.position % 2 == 0 ? cutwater.cutely.dern(tag) : (cutwater.impromptu) p002kotlin.collections.seminary.cutely(getValue(), tag);
    }

    @Override // kotlinx.serialization.json.internal.kattegat, fastidiously.dern
    public int impassible(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.position;
        if (i >= this.size - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.position = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.kattegat, vinyl.czestochowa
    public String itchy(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.keys.get(index / 2);
    }

    @Override // kotlinx.serialization.json.internal.kattegat, kotlinx.serialization.json.internal.dern
    /* JADX INFO: renamed from: technofreak, reason: from getter and merged with bridge method [inline-methods] */
    public cutwater.trm getValue() {
        return this.value;
    }
}
