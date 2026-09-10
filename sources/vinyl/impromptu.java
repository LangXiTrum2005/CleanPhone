package vinyl;

import org.jacoco.core.internal.instr.InstrSupport;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvinyl/impromptu;", "Lasosan/wireman;", "", "Lvinyl/lampshade;", "", "Lvinyl/competently;", "<init>", "()V", "", "dovishness", "([Z)I", "preprohormone", "([Z)Lvinyl/competently;", "gintrap", InstrSupport.INITMETHOD_DESC, "Lfastidiously/dern;", "decoder", "index", "builder", "checkIndex", "", "rotuma", "(Lfastidiously/dern;ILvinyl/competently;Z)V", "Lfastidiously/wireman;", "encoder", "content", "size", "cord", "(Lfastidiously/wireman;[ZI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impromptu extends lampshade<Boolean, boolean[], competently> implements asosan.wireman<boolean[]> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final impromptu f39409dern = new impromptu();

    public impromptu() {
        super(defendable.attabal.dovishness(p002kotlin.jvm.internal.dern.f29388attabal));
    }

    @Override // vinyl.lampshade
    /* JADX INFO: renamed from: cord, reason: merged with bridge method [inline-methods] */
    public void adultoid(fastidiously.wireman encoder, boolean[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.kowloon(getDescriptor(), i, content[i]);
        }
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public int marial(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // vinyl.lampshade
    /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
    public boolean[] polloi() {
        return new boolean[0];
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: preprohormone, reason: merged with bridge method [inline-methods] */
    public competently apical(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new competently(zArr);
    }

    @Override // vinyl.gintrap, vinyl.attabal
    /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
    public void impromptu(fastidiously.dern decoder, int index, competently builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.marial(decoder.rotuma(getDescriptor(), index));
    }
}
