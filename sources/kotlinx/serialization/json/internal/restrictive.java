package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/json/internal/restrictive;", "Lkotlinx/serialization/json/internal/dern;", "Lcutwater/attabal;", "json", "Lcutwater/saneness;", "value", "<init>", "(Lcutwater/attabal;Lcutwater/saneness;)V", "Lbristol/beachfront;", "descriptor", "", "index", "", "itchy", "(Lbristol/beachfront;I)Ljava/lang/String;", "tag", "Lcutwater/impromptu;", "empress", "(Ljava/lang/String;)Lcutwater/impromptu;", "impassible", "(Lbristol/beachfront;)I", "Lcutwater/saneness;", "hardpan", "()Lcutwater/saneness;", "beachfront", "I", "size", "competently", "currentIndex", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class restrictive extends dern {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public int currentIndex;
    private final cutwater.saneness value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public restrictive(cutwater.attabal json, cutwater.saneness value) {
        super(json, value, null, 4, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.size = getValue().size();
        this.currentIndex = -1;
    }

    @Override // kotlinx.serialization.json.internal.dern
    public cutwater.impromptu empress(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return getValue().get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.json.internal.dern
    /* JADX INFO: renamed from: hardpan, reason: from getter */
    public cutwater.saneness getValue() {
        return this.value;
    }

    @Override // fastidiously.dern
    public int impassible(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.currentIndex;
        if (i >= this.size - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.currentIndex = i2;
        return i2;
    }

    @Override // vinyl.czestochowa
    public String itchy(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(index);
    }
}
