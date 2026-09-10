package g8;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.internal.auth.o;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f41722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f41723c;

    public /* synthetic */ a(Context context, ArrayList arrayList, int i10) {
        this.f41721a = i10;
        this.f41722b = context;
        this.f41723c = arrayList;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f41721a) {
            case 0:
                n.f(cursor, "cursor");
                e8.a aVarY = o.y(cursor, this.f41722b, false, 10);
                if (aVarY != null) {
                    this.f41723c.add(aVarY);
                }
                break;
            default:
                n.f(cursor, "cursor");
                e8.a aVarY2 = o.y(cursor, this.f41722b, false, 10);
                if (aVarY2 != null) {
                    this.f41723c.add(aVarY2);
                }
                break;
        }
        return r.f53297a;
    }
}
