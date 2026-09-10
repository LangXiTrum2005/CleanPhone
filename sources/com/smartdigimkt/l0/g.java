package com.smartdigimkt.l0;

import com.smartdigimkt.h0.j;
import com.smartdigimkt.h0.l;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public class g extends j<String> {
    private static final String m = "g";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f36318l;

    public g(int i2, String str, String str2, com.smartdigimkt.h0.e<String> eVar) {
        super(i2, str, eVar);
        this.f36318l = str2;
    }

    @Override // com.smartdigimkt.h0.j
    public l<String> a(com.smartdigimkt.n0.c cVar) {
        try {
            return l.a(new String(cVar.f36914b, com.smartdigimkt.o0.d.a(cVar.d)), cVar);
        } catch (UnsupportedEncodingException e2) {
            e2.getMessage();
            return l.a(new com.smartdigimkt.i0.a(8, cVar));
        }
    }

    @Override // com.smartdigimkt.h0.j
    public byte[] g() {
        try {
            String str = this.f36318l;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
