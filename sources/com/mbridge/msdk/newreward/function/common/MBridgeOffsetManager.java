package com.mbridge.msdk.newreward.function.common;

/* JADX INFO: loaded from: classes2.dex */
public class MBridgeOffsetManager {
    private int offset = 0;

    public int getOffset() {
        return Math.max(this.offset, 0);
    }

    public void increaseOffset(int i) {
        this.offset += i;
    }

    public void resetOffset() {
        this.offset = 0;
    }
}
