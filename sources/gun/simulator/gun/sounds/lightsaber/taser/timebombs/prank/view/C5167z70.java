package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5167z70 extends DataInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f5315a;
    public String[] b;

    public C5167z70(InputStream inputStream) {
        super(inputStream);
        this.f5315a = new char[32];
    }

    public final String h() throws IOException {
        int i = readInt(true);
        if (i == 0) {
            return null;
        }
        return this.b[i - 1];
    }

    @Override // com.badlogic.gdx.utils.DataInput
    public final String readString() throws IOException {
        int i;
        int i2 = readInt(true);
        if (i2 == 0) {
            return null;
        }
        if (i2 == 1) {
            return "";
        }
        int i3 = i2 - 1;
        if (this.f5315a.length < i3) {
            this.f5315a = new char[i3];
        }
        char[] cArr = this.f5315a;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = read();
            int i7 = i6 >> 4;
            if (i7 == -1) {
                throw new EOFException();
            }
            switch (i7) {
                case 12:
                case 13:
                    i = i5 + 1;
                    cArr[i5] = (char) (((i6 & 31) << 6) | (read() & 63));
                    i4 += 2;
                    break;
                case 14:
                    i = i5 + 1;
                    cArr[i5] = (char) (((i6 & 15) << 12) | ((read() & 63) << 6) | (read() & 63));
                    i4 += 3;
                    break;
                default:
                    i = i5 + 1;
                    cArr[i5] = (char) i6;
                    i4++;
                    break;
            }
            i5 = i;
        }
        return new String(cArr, 0, i5);
    }
}
