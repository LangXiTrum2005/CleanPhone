package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/json/internal/polloi;", "Lkotlinx/serialization/json/internal/triweekly;", "Lkotlinx/serialization/json/internal/gintrap;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/gintrap;Z)V", "", "v", "", "taiyuan", "(I)V", "", "cutely", "(J)V", "", "marial", "(B)V", "", "formularize", "(S)V", "dern", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class polloi extends triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public polloi(gintrap writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z;
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void cutely(long v) {
        boolean z = this.forceQuoting;
        long jDern = patroclinal.monoploid.dern(v);
        if (z) {
            triweekly(impromptu.attabal(jDern, 10));
        } else {
            apical(impromptu.attabal(jDern, 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void formularize(short v) {
        boolean z = this.forceQuoting;
        String strTaiyuan = patroclinal.graveside.taiyuan(patroclinal.graveside.dern(v));
        if (z) {
            triweekly(strTaiyuan);
        } else {
            apical(strTaiyuan);
        }
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void marial(byte v) {
        boolean z = this.forceQuoting;
        String strTaiyuan = patroclinal.impassible.taiyuan(patroclinal.impassible.dern(v));
        if (z) {
            triweekly(strTaiyuan);
        } else {
            apical(strTaiyuan);
        }
    }

    @Override // kotlinx.serialization.json.internal.triweekly
    public void taiyuan(int v) {
        boolean z = this.forceQuoting;
        String string = Long.toString(((long) patroclinal.kowloon.dern(v)) & 4294967295L, 10);
        if (z) {
            triweekly(string);
        } else {
            apical(string);
        }
    }
}
