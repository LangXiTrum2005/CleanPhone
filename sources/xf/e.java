package xf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f53792a;

    public e(int i10) {
        switch (i10) {
            case 1:
                this.f53792a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f53792a = new LinkedHashMap();
                break;
        }
    }

    public ShortBuffer a(int i10, String str) {
        LinkedHashMap linkedHashMap = this.f53792a;
        Object objAsShortBuffer = linkedHashMap.get(str);
        if (objAsShortBuffer == null || ((ShortBuffer) objAsShortBuffer).capacity() < i10) {
            objAsShortBuffer = ByteBuffer.allocateDirect(i10 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        n.c(objAsShortBuffer);
        ShortBuffer shortBuffer = (ShortBuffer) objAsShortBuffer;
        shortBuffer.clear();
        shortBuffer.limit(i10);
        linkedHashMap.put(str, objAsShortBuffer);
        return shortBuffer;
    }
}
