package com.kochava.tracker.privacy.internal;

/* JADX INFO: loaded from: classes5.dex */
public enum ConsentState {
    NOT_ANSWERED("not_answered"),
    GRANTED("granted"),
    DECLINED("declined");

    public final String X;

    ConsentState(String str) {
        this.X = str;
    }
}
