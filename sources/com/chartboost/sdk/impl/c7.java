package com.chartboost.sdk.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c7 {
    public static final String a(Exception exc) {
        String message;
        return (exc == null || (message = exc.getMessage()) == null) ? "Unknown error" : message;
    }
}
