package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements p0 {
    protected int memoizedHashCode;

    public abstract int a(z0 z0Var);

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract v c();

    public final byte[] d() {
        try {
            int iA = ((x) this).a(null);
            byte[] bArr = new byte[iA];
            l lVar = new l(bArr, iA);
            f(lVar);
            if (iA - lVar.f24604d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(b("byte array"), e10);
        }
    }

    public final h e() {
        try {
            int iA = ((x) this).a(null);
            h hVar = i.f24569b;
            byte[] bArr = new byte[iA];
            l lVar = new l(bArr, iA);
            f(lVar);
            if (lVar.f24603c - lVar.f24604d == 0) {
                return new h(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(b("ByteString"), e10);
        }
    }

    public abstract void f(l lVar);
}
