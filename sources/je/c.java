package je;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f43822a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f43823b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f43824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f43825d;

    static {
        int[] iArr = {5, NotificationCompat.FLAG_LOCAL_ONLY};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        f43824c = iArr2;
        iArr2[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f43824c[0][i10] = i10 - 63;
        }
        f43824c[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f43824c[1][i11] = i11 - 95;
        }
        f43824c[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f43824c[2][i12] = i12 - 46;
        }
        int[] iArr3 = f43824c[2];
        iArr3[44] = 12;
        iArr3[46] = 13;
        int[] iArr4 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, WebSocketProtocol.PAYLOAD_SHORT, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f43824c[3][iArr4[i13]] = i13;
        }
        int[] iArr5 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr5[i14];
            if (i15 > 0) {
                f43824c[4][i15] = i14;
            }
        }
        int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f43825d = iArr6;
        for (int[] iArr7 : iArr6) {
            Arrays.fill(iArr7, -1);
        }
        int[][] iArr8 = f43825d;
        iArr8[0][4] = 0;
        int[] iArr9 = iArr8[1];
        iArr9[4] = 0;
        iArr9[0] = 28;
        iArr8[3][4] = 0;
        int[] iArr10 = iArr8[2];
        iArr10[4] = 0;
        iArr10[0] = 15;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.add(eVar);
                    break;
                }
                e eVar2 = (e) it2.next();
                if (eVar2.c(eVar)) {
                    break;
                }
                if (eVar.c(eVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }
}
