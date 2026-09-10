package vinyl;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lvinyl/puffin;", "Lasosan/wireman;", "", "<init>", "()V", "Lfastidiously/beachfront;", "encoder", "value", "saneness", "(Lfastidiously/beachfront;Lkotlin/Unit;)V", "Lfastidiously/marial;", "decoder", "attabal", "(Lfastidiously/marial;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class puffin implements asosan.wireman<Unit> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final puffin f39473saneness = new puffin();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final /* synthetic */ palmyra<Unit> f39474attabal = new palmyra<>("kotlin.Unit", Unit.f29295attabal);

    public void attabal(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f39474attabal.deserialize(decoder);
    }

    @Override // asosan.dern
    public /* bridge */ /* synthetic */ Object deserialize(fastidiously.marial marialVar) {
        attabal(marialVar);
        return Unit.f29295attabal;
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.f39474attabal.getDescriptor();
    }

    @Override // asosan.impassible
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public void serialize(fastidiously.beachfront encoder, Unit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f39474attabal.serialize(encoder, value);
    }
}
