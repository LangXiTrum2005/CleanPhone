package decarock;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CodecSpecificDataUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final byte[] f25114attabal = {0, 0, 0, 1};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String[] f25115saneness = {"", "A", "B", "C"};

    public static String attabal(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static boolean beachfront(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static String dern(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(grimness.sealless("hvc1.%s%d.%X.%c%d", f25115saneness[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static Pair<Integer, Integer> marial(byte[] bArr) {
        stratoscope stratoscopeVar = new stratoscope(bArr);
        stratoscopeVar.mathsort(9);
        int iSupplicat = stratoscopeVar.supplicat();
        stratoscopeVar.mathsort(20);
        return Pair.create(Integer.valueOf(stratoscopeVar.seminary()), Integer.valueOf(iSupplicat));
    }

    public static List<byte[]> saneness(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static byte[] wireman(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f25114attabal;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }
}
