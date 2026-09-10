package xi;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53815c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f53813a = i10;
        this.f53815c = obj;
        this.f53814b = obj2;
    }

    @Override // xi.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f53813a) {
            case 0:
                k5.g gVar = (k5.g) this.f53815c;
                try {
                    ((c) this.f53814b).e(((l) gVar.f44327c).b(byteBuffer));
                } catch (RuntimeException e10) {
                    Log.e("BasicMessageChannel#" + ((String) gVar.f44326b), "Failed to handle message reply", e10);
                    return;
                }
                break;
            default:
                p pVar = (p) this.f53815c;
                o oVar = (o) this.f53814b;
                try {
                    if (byteBuffer == null) {
                        oVar.c();
                    } else {
                        try {
                            oVar.a(pVar.f53826c.c(byteBuffer));
                        } catch (i e11) {
                            oVar.b(e11.f53818a, e11.getMessage(), e11.f53819b);
                        }
                    }
                } catch (RuntimeException e12) {
                    Log.e("MethodChannel#" + pVar.f53825b, "Failed to handle method call result", e12);
                    return;
                }
                break;
        }
    }
}
