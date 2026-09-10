package vinyl;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvinyl/linendraper;", "Lasosan/wireman;", "Lpatroclinal/triweekly;", "Lvinyl/lampshade;", "Lpatroclinal/impassible;", "Lvinyl/sultanate;", "<init>", "()V", "", "dovishness", "([B)I", "preprohormone", "([B)Lvinyl/sultanate;", "gintrap", "()[B", "Lfastidiously/dern;", "decoder", "index", "builder", "", "checkIndex", "", "rotuma", "(Lfastidiously/dern;ILvinyl/sultanate;Z)V", "Lfastidiously/wireman;", "encoder", "content", "size", "cord", "(Lfastidiously/wireman;[BI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class linendraper extends lampshade<patroclinal.impassible, patroclinal.triweekly, sultanate> implements asosan.wireman<patroclinal.triweekly> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final linendraper f39429dern = new linendraper();

    public linendraper() {
        super(defendable.attabal.kattegat(patroclinal.impassible.INSTANCE));
    }

    @Override // vinyl.lampshade
    public /* bridge */ /* synthetic */ void adultoid(fastidiously.wireman wiremanVar, patroclinal.triweekly triweeklyVar, int i) {
        cord(wiremanVar, triweeklyVar.getCom.ironsource.X3.a.k java.lang.String(), i);
    }

    @Override // vinyl.attabal
    public /* bridge */ /* synthetic */ Object apical(Object obj) {
        return preprohormone(((patroclinal.triweekly) obj).getCom.ironsource.X3.a.k java.lang.String());
    }

    public void cord(fastidiously.wireman encoder, byte[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.adultoid(getDescriptor(), i).competently(patroclinal.triweekly.cutely(content, i));
        }
    }

    public int dovishness(byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return patroclinal.triweekly.triweekly(collectionSize);
    }

    public byte[] gintrap() {
        return patroclinal.triweekly.wireman(0);
    }

    @Override // vinyl.attabal
    public /* bridge */ /* synthetic */ int marial(Object obj) {
        return dovishness(((patroclinal.triweekly) obj).getCom.ironsource.X3.a.k java.lang.String());
    }

    @Override // vinyl.lampshade
    public /* bridge */ /* synthetic */ patroclinal.triweekly polloi() {
        return patroclinal.triweekly.saneness(gintrap());
    }

    public sultanate preprohormone(byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new sultanate(toBuilder, null);
    }

    @Override // vinyl.gintrap, vinyl.attabal
    /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
    public void impromptu(fastidiously.dern decoder, int index, sultanate builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.marial(patroclinal.impassible.dern(decoder.kowloon(getDescriptor(), index).kattegat()));
    }
}
