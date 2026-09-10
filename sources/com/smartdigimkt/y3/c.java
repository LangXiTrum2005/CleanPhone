package com.smartdigimkt.y3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p004ironsource.d9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f40045c = new c(new int[]{2}, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f40046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40047b;

    public c(int[] iArr, int i2) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f40046a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f40046a = new int[0];
        }
        this.f40047b = i2;
    }

    public static c a(Context context) {
        return a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f40046a, cVar.f40046a) && this.f40047b == cVar.f40047b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f40046a) * 31) + this.f40047b;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f40047b + ", supportedEncodings=" + Arrays.toString(this.f40046a) + d9.i.f24752e;
    }

    public static c a(Intent intent) {
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new c(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
        }
        return f40045c;
    }

    public boolean a(int i2) {
        return Arrays.binarySearch(this.f40046a, i2) >= 0;
    }

    public int a() {
        return this.f40047b;
    }
}
