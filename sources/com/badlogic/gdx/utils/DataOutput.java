package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class DataOutput extends DataOutputStream {
    public DataOutput(OutputStream outputStream) {
        super(outputStream);
    }

    private void writeString_slow(String str, int i, int i2) throws IOException {
        while (i2 < i) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                write((byte) cCharAt);
            } else if (cCharAt > 2047) {
                write((byte) (((cCharAt >> '\f') & 15) | 224));
                write((byte) (((cCharAt >> 6) & 63) | 128));
                write((byte) ((cCharAt & '?') | 128));
            } else {
                write((byte) (((cCharAt >> 6) & 31) | 192));
                write((byte) ((cCharAt & '?') | 128));
            }
            i2++;
        }
    }

    public int writeInt(int i, boolean z) throws IOException {
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        int i2 = i >>> 7;
        if (i2 == 0) {
            write((byte) i);
            return 1;
        }
        write((byte) ((i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
        int i3 = i >>> 14;
        if (i3 == 0) {
            write((byte) i2);
            return 2;
        }
        write((byte) (i2 | 128));
        int i4 = i >>> 21;
        if (i4 == 0) {
            write((byte) i3);
            return 3;
        }
        write((byte) (i3 | 128));
        int i5 = i >>> 28;
        if (i5 == 0) {
            write((byte) i4);
            return 4;
        }
        write((byte) (i4 | 128));
        write((byte) i5);
        return 5;
    }

    public void writeString(@Null String str) throws IOException {
        int i = 0;
        if (str == null) {
            write(0);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(1);
            return;
        }
        writeInt(length + 1, true);
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 127) {
                break;
            }
            write((byte) cCharAt);
            i++;
        }
        if (i < length) {
            writeString_slow(str, length, i);
        }
    }
}
