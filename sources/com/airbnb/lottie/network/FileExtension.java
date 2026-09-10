package com.airbnb.lottie.network;

/* JADX INFO: loaded from: classes.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");

    public final String X;

    FileExtension(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
