package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum TrackingState {
    OPTED_OUT(1);

    private int value;

    TrackingState(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
