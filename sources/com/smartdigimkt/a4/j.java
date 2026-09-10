package com.smartdigimkt.a4;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.smartdigimkt.a4.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface j<T extends i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f33647a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f33648b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f33649c = 1;
    public static final int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f33650e = 2;
    public static final int f = 3;

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f33651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33652b;

        public a(byte[] bArr, String str) {
            this.f33651a = bArr;
            this.f33652b = str;
        }

        @Override // com.smartdigimkt.a4.j.d
        public String a() {
            return this.f33652b;
        }

        @Override // com.smartdigimkt.a4.j.d
        public byte[] b() {
            return this.f33651a;
        }
    }

    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f33653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f33654b;

        public b(int i2, byte[] bArr) {
            this.f33653a = i2;
            this.f33654b = bArr;
        }

        @Override // com.smartdigimkt.a4.j.e
        public byte[] a() {
            return this.f33654b;
        }

        @Override // com.smartdigimkt.a4.j.e
        public int b() {
            return this.f33653a;
        }
    }

    public static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f33655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33656b;

        public c(byte[] bArr, String str) {
            this.f33655a = bArr;
            this.f33656b = str;
        }

        @Override // com.smartdigimkt.a4.j.h
        public String a() {
            return this.f33656b;
        }

        @Override // com.smartdigimkt.a4.j.h
        public byte[] b() {
            return this.f33655a;
        }
    }

    public interface d {
        String a();

        byte[] b();
    }

    public interface e {
        byte[] a();

        int b();
    }

    public interface f<T extends i> {
        void a(j<? extends T> jVar, byte[] bArr, int i2, int i3, byte[] bArr2);
    }

    public interface g<T extends i> {
        void a(j<? extends T> jVar, byte[] bArr, List<e> list, boolean z2);
    }

    public interface h {
        String a();

        byte[] b();
    }

    d a(byte[] bArr, byte[] bArr2, String str, int i2, HashMap<String, String> map) throws NotProvisionedException;

    h a();

    Map<String, String> a(byte[] bArr);

    void a(f<? super T> fVar);

    void a(g<? super T> gVar);

    void a(String str, String str2);

    void a(String str, byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    byte[] a(String str);

    String b(String str);

    void b(byte[] bArr);

    byte[] b() throws MediaDrmException;

    byte[] b(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    T c(byte[] bArr) throws MediaCryptoException;

    void d(byte[] bArr) throws DeniedByServerException;

    void release();
}
