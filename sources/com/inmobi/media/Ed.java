package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class Ed extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fd f22803a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ed(Fd fd, int i2) {
        super(i2);
        this.f22803a = fd;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i2;
        i2 = ((ByteArrayOutputStream) this).count;
        if (i2 > 0) {
            int i3 = i2 - 1;
            if (((ByteArrayOutputStream) this).buf[i3] == 13) {
                i2 = i3;
            }
        }
        try {
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i2, this.f22803a.f22829b.name());
    }
}
