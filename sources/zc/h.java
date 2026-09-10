package zc;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Continuation, o8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54834a;

    public /* synthetic */ h(int i10) {
        this.f54834a = i10;
    }

    public ze.a a(Context context, ye.e eVar) {
        switch (this.f54834a) {
            case 2:
                return new qd.i(context, eVar);
            case 3:
                return new ze.d(context, eVar);
            default:
                return new ze.c(context, eVar);
        }
    }

    @Override // o8.e
    public Object apply(Object obj) {
        ad.e eVar = (ad.e) obj;
        g9.k kVar = q.f54854a;
        kVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            kVar.g(byteArrayOutputStream, eVar);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return -1;
    }
}
