package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySignature implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EmptySignature f12828b = new EmptySignature();

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
    }

    public final String toString() {
        return "EmptySignature";
    }
}
