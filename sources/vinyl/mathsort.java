package vinyl;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvinyl/mathsort;", "Lasosan/wireman;", "", "Lvinyl/lampshade;", "", "Lvinyl/peridotite;", "<init>", "()V", "dovishness", "([I)I", "preprohormone", "([I)Lvinyl/peridotite;", "gintrap", "()[I", "Lfastidiously/dern;", "decoder", "index", "builder", "", "checkIndex", "", "rotuma", "(Lfastidiously/dern;ILvinyl/peridotite;Z)V", "Lfastidiously/wireman;", "encoder", "content", "size", "cord", "(Lfastidiously/wireman;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class mathsort extends lampshade<Integer, int[], peridotite> implements asosan.wireman<int[]> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final mathsort f39435dern = new mathsort();

    public mathsort() {
        super(defendable.attabal.cuirassed(p002kotlin.jvm.internal.triweekly.f29403attabal));
    }

    @Override // vinyl.lampshade
    /* JADX INFO: renamed from: cord, reason: merged with bridge method [inline-methods] */
    public void adultoid(fastidiously.wireman encoder, int[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.molybdenite(getDescriptor(), i, content[i]);
        }
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public int marial(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // vinyl.lampshade
    /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
    public int[] polloi() {
        return new int[0];
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: preprohormone, reason: merged with bridge method [inline-methods] */
    public peridotite apical(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new peridotite(iArr);
    }

    @Override // vinyl.gintrap, vinyl.attabal
    /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
    public void impromptu(fastidiously.dern decoder, int index, peridotite builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.marial(decoder.yemenite(getDescriptor(), index));
    }
}
