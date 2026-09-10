package ee;

import be.g;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40032b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Class cls, int i10) {
        super(cls);
        this.f40032b = i10;
    }

    @Override // be.g
    public final Date a(Date date) {
        switch (this.f40032b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
