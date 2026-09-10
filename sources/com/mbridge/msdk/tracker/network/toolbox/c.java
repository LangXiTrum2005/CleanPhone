package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f36994e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f36995a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f36996b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36997c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36998d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f36998d = i10;
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f36996b.size(); i11++) {
            byte[] bArr = this.f36996b.get(i11);
            if (bArr.length >= i10) {
                this.f36997c -= bArr.length;
                this.f36996b.remove(i11);
                this.f36995a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f36998d) {
                this.f36995a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f36996b, bArr, f36994e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f36996b.add(iBinarySearch, bArr);
                this.f36997c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f36997c > this.f36998d) {
            byte[] bArrRemove = this.f36995a.remove(0);
            this.f36996b.remove(bArrRemove);
            this.f36997c -= bArrRemove.length;
        }
    }
}
