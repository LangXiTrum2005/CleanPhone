package vinyl;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lvinyl/hyalinization;", "Lasosan/wireman;", "Lpatroclinal/graveside;", "<init>", "()V", "Lfastidiously/beachfront;", "encoder", "value", "", "saneness", "(Lfastidiously/beachfront;S)V", "Lfastidiously/marial;", "decoder", "attabal", "(Lfastidiously/marial;)S", "Lbristol/beachfront;", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hyalinization implements asosan.wireman<patroclinal.graveside> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hyalinization f39403attabal = new hyalinization();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final bristol.beachfront descriptor = walach.attabal("kotlin.UShort", defendable.attabal.trm(p002kotlin.jvm.internal.adultoid.f29373attabal));

    public short attabal(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return patroclinal.graveside.dern(decoder.dovishness(getDescriptor()).arytenoidectomy());
    }

    @Override // asosan.dern
    public /* bridge */ /* synthetic */ Object deserialize(fastidiously.marial marialVar) {
        return patroclinal.graveside.attabal(attabal(marialVar));
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return descriptor;
    }

    public void saneness(fastidiously.beachfront encoder, short value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.trm(getDescriptor()).arytenoidectomy(value);
    }

    @Override // asosan.impassible
    public /* bridge */ /* synthetic */ void serialize(fastidiously.beachfront beachfrontVar, Object obj) {
        saneness(beachfrontVar, ((patroclinal.graveside) obj).getData());
    }
}
