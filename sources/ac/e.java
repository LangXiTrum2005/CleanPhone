package ac;

import an.h;
import android.os.Looper;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e extends k implements jk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, obj, cls, str, str2, i11);
        this.f3460b = i12;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f3460b) {
            case 0:
                ((f) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                n.e(name, "<get-threadName>(...)");
                return Boolean.valueOf(h.q0(name, "Firebase Background Thread #", false));
            case 1:
                ((f) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                n.e(name2, "<get-threadName>(...)");
                return Boolean.valueOf(h.q0(name2, "Firebase Blocking Thread #", false));
            default:
                ((f) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }
}
