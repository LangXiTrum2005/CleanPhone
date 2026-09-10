package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzld extends RuntimeException {
    public zzld(int i2) {
        super(i2 != 1 ? i2 != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
