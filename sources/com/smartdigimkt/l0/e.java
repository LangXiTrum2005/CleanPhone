package com.smartdigimkt.l0;

import com.smartdigimkt.h0.j;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e<T> extends j<T> {
    private static final String m = "e";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f36315l;

    public e(int i2, String str, String str2, com.smartdigimkt.h0.e<T> eVar) {
        super(i2, str, eVar);
        this.f36315l = str2;
    }

    @Override // com.smartdigimkt.h0.j
    public byte[] g() {
        try {
            String str = this.f36315l;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public e(int i2, String str, String str2, com.smartdigimkt.h0.e<T> eVar, boolean z2) {
        super(i2, str, eVar, z2);
        this.f36315l = str2;
    }
}
