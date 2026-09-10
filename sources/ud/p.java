package ud;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f52135b;

    public /* synthetic */ p(Context context, int i10) {
        this.f52134a = i10;
        this.f52135b = context;
    }

    @Override // jk.a
    public final Object invoke() throws IOException {
        int i10 = this.f52134a;
        Context context = this.f52135b;
        switch (i10) {
            case 0:
                File fileL = x7.a.l(context, "firebaseSessions/sessionConfigsDataStore.data");
                q.c(fileL);
                return fileL;
            default:
                File fileL2 = x7.a.l(context, "firebaseSessions/sessionDataStore.data");
                q.c(fileL2);
                return fileL2;
        }
    }
}
