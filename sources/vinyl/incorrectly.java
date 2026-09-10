package vinyl;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvinyl/incorrectly;", "Lasosan/wireman;", "Lpatroclinal/adultoid;", "Lvinyl/lampshade;", "Lpatroclinal/graveside;", "Lvinyl/miliaria;", "<init>", "()V", "", "dovishness", "([S)I", "preprohormone", "([S)Lvinyl/miliaria;", "gintrap", "()[S", "Lfastidiously/dern;", "decoder", "index", "builder", "", "checkIndex", "", "rotuma", "(Lfastidiously/dern;ILvinyl/miliaria;Z)V", "Lfastidiously/wireman;", "encoder", "content", "size", "cord", "(Lfastidiously/wireman;[SI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class incorrectly extends lampshade<patroclinal.graveside, patroclinal.adultoid, miliaria> implements asosan.wireman<patroclinal.adultoid> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final incorrectly f39410dern = new incorrectly();

    public incorrectly() {
        super(defendable.attabal.merc(patroclinal.graveside.INSTANCE));
    }

    @Override // vinyl.lampshade
    public /* bridge */ /* synthetic */ void adultoid(fastidiously.wireman wiremanVar, patroclinal.adultoid adultoidVar, int i) {
        cord(wiremanVar, adultoidVar.getCom.ironsource.X3.a.k java.lang.String(), i);
    }

    @Override // vinyl.attabal
    public /* bridge */ /* synthetic */ Object apical(Object obj) {
        return preprohormone(((patroclinal.adultoid) obj).getCom.ironsource.X3.a.k java.lang.String());
    }

    public void cord(fastidiously.wireman encoder, short[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.adultoid(getDescriptor(), i).arytenoidectomy(patroclinal.adultoid.cutely(content, i));
        }
    }

    public int dovishness(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return patroclinal.adultoid.triweekly(collectionSize);
    }

    public short[] gintrap() {
        return patroclinal.adultoid.wireman(0);
    }

    @Override // vinyl.attabal
    public /* bridge */ /* synthetic */ int marial(Object obj) {
        return dovishness(((patroclinal.adultoid) obj).getCom.ironsource.X3.a.k java.lang.String());
    }

    @Override // vinyl.lampshade
    public /* bridge */ /* synthetic */ patroclinal.adultoid polloi() {
        return patroclinal.adultoid.saneness(gintrap());
    }

    public miliaria preprohormone(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new miliaria(toBuilder, null);
    }

    @Override // vinyl.gintrap, vinyl.attabal
    /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
    public void impromptu(fastidiously.dern decoder, int index, miliaria builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.marial(patroclinal.graveside.dern(decoder.kowloon(getDescriptor(), index).arytenoidectomy()));
    }
}
