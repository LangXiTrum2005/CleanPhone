package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.consent_sdk.n5;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4063a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4064b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterable f4066d;

    public e(com.google.android.gms.internal.auth.h0 h0Var) {
        this.f4066d = h0Var;
        this.f4065c = h0Var.m();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4063a) {
            case 0:
                return this.f4064b < this.f4065c;
            case 1:
                return this.f4064b < this.f4065c;
            case 2:
                return this.f4064b < this.f4065c;
            case 3:
                return this.f4064b < this.f4065c;
            case 4:
                return this.f4064b < this.f4065c;
            case 5:
                return this.f4064b < this.f4065c;
            default:
                return this.f4064b < this.f4065c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4063a) {
            case 0:
                int i10 = this.f4064b;
                if (i10 >= this.f4065c) {
                    throw new NoSuchElementException();
                }
                this.f4064b = i10 + 1;
                return Byte.valueOf(((h) this.f4066d).p(i10));
            case 1:
                int i11 = this.f4064b;
                if (i11 >= this.f4065c) {
                    throw new NoSuchElementException();
                }
                this.f4064b = i11 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.auth.h0) this.f4066d).h(i11));
            case 2:
                int i12 = this.f4064b;
                if (i12 >= this.f4065c) {
                    throw new NoSuchElementException();
                }
                this.f4064b = i12 + 1;
                return Byte.valueOf(((n5) this.f4066d).h(i12));
            case 3:
                int i13 = this.f4064b;
                if (i13 >= this.f4065c) {
                    throw new NoSuchElementException();
                }
                this.f4064b = i13 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.measurement.s0) this.f4066d).b(i13));
            case 4:
                int i14 = this.f4064b;
                if (i14 >= this.f4065c) {
                    throw new NoSuchElementException();
                }
                this.f4064b = i14 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.play_billing.i1) this.f4066d).h(i14));
            case 5:
                int i15 = this.f4064b;
                if (i15 >= this.f4065c) {
                    throw new NoSuchElementException();
                }
                this.f4064b = i15 + 1;
                return Byte.valueOf(((com.google.crypto.tink.shaded.protobuf.g) this.f4066d).p(i15));
            default:
                return Byte.valueOf(nextByte());
        }
    }

    public byte nextByte() {
        try {
            byte[] bArr = ((zl.t) this.f4066d).f55079b;
            int i10 = this.f4064b;
            this.f4064b = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4063a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public e(n5 n5Var) {
        this.f4066d = n5Var;
        this.f4065c = n5Var.m();
    }

    public e(com.google.android.gms.internal.measurement.s0 s0Var) {
        this.f4066d = s0Var;
        this.f4065c = s0Var.h();
    }

    public e(com.google.android.gms.internal.play_billing.i1 i1Var) {
        this.f4066d = i1Var;
        this.f4065c = i1Var.m();
    }

    public e(h hVar) {
        this.f4066d = hVar;
        this.f4065c = hVar.size();
    }

    public e(com.google.crypto.tink.shaded.protobuf.g gVar) {
        this.f4066d = gVar;
        this.f4065c = gVar.size();
    }

    public e(zl.t tVar) {
        this.f4066d = tVar;
        this.f4065c = tVar.f55079b.length;
    }
}
