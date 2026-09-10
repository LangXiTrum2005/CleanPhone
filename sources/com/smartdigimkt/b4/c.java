package com.smartdigimkt.b4;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor<? extends e> f33911c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33913b;

    static {
        Constructor<? extends e> constructor = null;
        try {
            constructor = Class.forName("com.smartdigimkt.sdk.basead.exoplayer.ext.flac.FlacExtractor").asSubclass(e.class).getConstructor(null);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f33911c = constructor;
    }

    public synchronized c a(int i2) {
        this.f33913b = i2;
        return this;
    }

    public synchronized c b(int i2) {
        this.f33912a = i2;
        return this;
    }

    @Override // com.smartdigimkt.b4.h
    public synchronized e[] a() {
        e[] eVarArr;
        Constructor<? extends e> constructor = f33911c;
        eVarArr = new e[constructor == null ? 2 : 3];
        eVarArr[0] = new com.smartdigimkt.c4.e(this.f33913b);
        eVarArr[1] = new com.smartdigimkt.c4.g(this.f33912a);
        if (constructor != null) {
            try {
                eVarArr[2] = constructor.newInstance(null);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        }
        return eVarArr;
    }
}
