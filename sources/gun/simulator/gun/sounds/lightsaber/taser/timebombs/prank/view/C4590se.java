package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4590se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f4990a = new char[EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE];
    public static final byte[] b = new byte[EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            a('u', i2);
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = b;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = 127;
            i++;
        }
    }

    public static void a(char c, int i) {
        if (c != 'u') {
            f4990a[c] = (char) i;
        }
    }
}
