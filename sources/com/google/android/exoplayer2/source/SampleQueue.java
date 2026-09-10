package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public class SampleQueue implements TrackOutput {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Format f18387A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Format f18388B;
    public boolean C;
    public boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SampleDataQueue f18389a;
    public final DrmSessionManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DrmSessionEventListener.EventDispatcher f18392e;
    public UpstreamFormatChangedListener f;
    public Format g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DrmSession f18393h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18397p;
    public int q;
    public int r;
    public int s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18399w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f18400z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SampleExtrasHolder f18390b = new SampleExtrasHolder();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18394i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f18396n = new long[1000];
    public int[] m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f18395l = new int[1000];
    public TrackOutput.CryptoData[] o = new TrackOutput.CryptoData[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SpannedData f18391c = new SpannedData(new i(0));
    public long t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f18398u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public static final class SampleExtrasHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TrackOutput.CryptoData f18403c;
    }

    public static final class SharedSampleMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f18404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DrmSessionManager.DrmSessionReference f18405b;

        public SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.f18404a = format;
            this.f18405b = drmSessionReference;
        }
    }

    public interface UpstreamFormatChangedListener {
    }

    public SampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.d = drmSessionManager;
        this.f18392e = eventDispatcher;
        this.f18389a = new SampleDataQueue(allocator);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int a(DataReader dataReader, int i2, boolean z2) throws EOFException {
        SampleDataQueue sampleDataQueue = this.f18389a;
        int iB = sampleDataQueue.b(i2);
        SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f;
        Allocation allocation = allocationNode.f18386c;
        int i3 = dataReader.read(allocation.f18721a, ((int) (sampleDataQueue.g - allocationNode.f18384a)) + allocation.f18722b, iB);
        if (i3 == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        long j = sampleDataQueue.g + ((long) i3);
        sampleDataQueue.g = j;
        SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.f;
        if (j == allocationNode2.f18385b) {
            sampleDataQueue.f = allocationNode2.d;
        }
        return i3;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void b(int i2, ParsableByteArray parsableByteArray) {
        while (true) {
            SampleDataQueue sampleDataQueue = this.f18389a;
            if (i2 <= 0) {
                sampleDataQueue.getClass();
                return;
            }
            int iB = sampleDataQueue.b(i2);
            SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f;
            Allocation allocation = allocationNode.f18386c;
            parsableByteArray.e(allocation.f18721a, ((int) (sampleDataQueue.g - allocationNode.f18384a)) + allocation.f18722b, iB);
            i2 -= iB;
            long j = sampleDataQueue.g + ((long) iB);
            sampleDataQueue.g = j;
            SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.f;
            if (j == allocationNode2.f18385b) {
                sampleDataQueue.f = allocationNode2.d;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0006, B:8:0x0012, B:13:0x0022, B:15:0x0039, B:19:0x0051, B:18:0x004f), top: B:29:0x0006 }] */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void c(Format format) {
        boolean z2 = false;
        this.f18400z = false;
        this.f18387A = format;
        synchronized (this) {
            try {
                this.y = false;
                if (!Util.a(format, this.f18388B)) {
                    if (this.f18391c.f18421b.size() == 0) {
                        this.f18388B = format;
                    } else {
                        SparseArray sparseArray = this.f18391c.f18421b;
                        if (((SharedSampleMetadata) sparseArray.valueAt(sparseArray.size() - 1)).f18404a.equals(format)) {
                            SparseArray sparseArray2 = this.f18391c.f18421b;
                            this.f18388B = ((SharedSampleMetadata) sparseArray2.valueAt(sparseArray2.size() - 1)).f18404a;
                        } else {
                            this.f18388B = format;
                        }
                    }
                    Format format2 = this.f18388B;
                    this.C = MimeTypes.a(format2.m0, format2.j0);
                    this.D = false;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.f;
        if (upstreamFormatChangedListener == null || !z2) {
            return;
        }
        ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) upstreamFormatChangedListener;
        progressiveMediaPeriod.q0.post(progressiveMediaPeriod.o0);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b1, B:67:0x0129, B:69:0x0132, B:46:0x00ca, B:48:0x00ce, B:50:0x00d9, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00d7), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b1, B:67:0x0129, B:69:0x0132, B:46:0x00ca, B:48:0x00ce, B:50:0x00d9, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00d7), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b1, B:67:0x0129, B:69:0x0132, B:46:0x00ca, B:48:0x00ce, B:50:0x00d9, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00d7), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b1, B:67:0x0129, B:69:0x0132, B:46:0x00ca, B:48:0x00ce, B:50:0x00d9, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00d7), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b1, B:67:0x0129, B:69:0x0132, B:46:0x00ca, B:48:0x00ce, B:50:0x00d9, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00d7), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b1, B:67:0x0129, B:69:0x0132, B:46:0x00ca, B:48:0x00ce, B:50:0x00d9, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00d7), top: B:74:0x0051 }] */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void f(long j, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
        DrmSessionManager drmSessionManager;
        DrmSessionManager.DrmSessionReference drmSessionReferenceD;
        SpannedData spannedData;
        int i5;
        int i6;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z2;
        boolean z3;
        if (this.f18400z) {
            Format format = this.f18387A;
            Assertions.e(format);
            c(format);
        }
        int i7 = i2 & 1;
        boolean z4 = i7 != 0;
        if (this.x) {
            if (!z4) {
                return;
            } else {
                this.x = false;
            }
        }
        if (this.C) {
            if (j < this.t) {
                return;
            }
            if (i7 == 0) {
                if (!this.D) {
                    Log.g("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f18388B);
                    this.D = true;
                }
                i2 |= 1;
            }
        }
        long j2 = (this.f18389a.g - ((long) i3)) - ((long) i4);
        synchronized (this) {
            try {
                int i8 = this.f18397p;
                if (i8 > 0) {
                    int iJ = j(i8 - 1);
                    Assertions.b(this.k[iJ] + ((long) this.f18395l[iJ]) <= j2);
                }
                this.f18399w = (536870912 & i2) != 0;
                this.v = Math.max(this.v, j);
                int iJ2 = j(this.f18397p);
                this.f18396n[iJ2] = j;
                this.k[iJ2] = j2;
                this.f18395l[iJ2] = i3;
                this.m[iJ2] = i2;
                this.o[iJ2] = cryptoData;
                this.j[iJ2] = 0;
                if (this.f18391c.f18421b.size() == 0) {
                    drmSessionManager = this.d;
                    if (drmSessionManager != null) {
                        drmSessionReferenceD = drmSessionManager.d(this.f18392e, this.f18388B);
                    } else {
                        drmSessionReferenceD = DrmSessionManager.DrmSessionReference.P8;
                    }
                    spannedData = this.f18391c;
                    i5 = this.q + this.f18397p;
                    Format format2 = this.f18388B;
                    format2.getClass();
                    SharedSampleMetadata sharedSampleMetadata = new SharedSampleMetadata(format2, drmSessionReferenceD);
                    i6 = spannedData.f18420a;
                    sparseArray = spannedData.f18421b;
                    if (i6 == -1) {
                        if (sparseArray.size() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Assertions.d(z3);
                        spannedData.f18420a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i5 >= iKeyAt) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Assertions.b(z2);
                        if (iKeyAt == i5) {
                            spannedData.f18422c.a(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i5, sharedSampleMetadata);
                } else {
                    SparseArray sparseArray2 = this.f18391c.f18421b;
                    if (!((SharedSampleMetadata) sparseArray2.valueAt(sparseArray2.size() - 1)).f18404a.equals(this.f18388B)) {
                        drmSessionManager = this.d;
                        if (drmSessionManager != null) {
                            drmSessionReferenceD = drmSessionManager.d(this.f18392e, this.f18388B);
                        } else {
                            drmSessionReferenceD = DrmSessionManager.DrmSessionReference.P8;
                        }
                        spannedData = this.f18391c;
                        i5 = this.q + this.f18397p;
                        Format format3 = this.f18388B;
                        format3.getClass();
                        SharedSampleMetadata sharedSampleMetadata2 = new SharedSampleMetadata(format3, drmSessionReferenceD);
                        i6 = spannedData.f18420a;
                        sparseArray = spannedData.f18421b;
                        if (i6 == -1) {
                            if (sparseArray.size() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            Assertions.d(z3);
                            spannedData.f18420a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i5 >= iKeyAt) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            Assertions.b(z2);
                            if (iKeyAt == i5) {
                                spannedData.f18422c.a(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i5, sharedSampleMetadata2);
                    }
                }
                int i9 = this.f18397p + 1;
                this.f18397p = i9;
                int i10 = this.f18394i;
                if (i9 == i10) {
                    int i11 = i10 + 1000;
                    int[] iArr = new int[i11];
                    long[] jArr = new long[i11];
                    long[] jArr2 = new long[i11];
                    int[] iArr2 = new int[i11];
                    int[] iArr3 = new int[i11];
                    TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i11];
                    int i12 = this.r;
                    int i13 = i10 - i12;
                    System.arraycopy(this.k, i12, jArr, 0, i13);
                    System.arraycopy(this.f18396n, this.r, jArr2, 0, i13);
                    System.arraycopy(this.m, this.r, iArr2, 0, i13);
                    System.arraycopy(this.f18395l, this.r, iArr3, 0, i13);
                    System.arraycopy(this.o, this.r, cryptoDataArr, 0, i13);
                    System.arraycopy(this.j, this.r, iArr, 0, i13);
                    int i14 = this.r;
                    System.arraycopy(this.k, 0, jArr, i13, i14);
                    System.arraycopy(this.f18396n, 0, jArr2, i13, i14);
                    System.arraycopy(this.m, 0, iArr2, i13, i14);
                    System.arraycopy(this.f18395l, 0, iArr3, i13, i14);
                    System.arraycopy(this.o, 0, cryptoDataArr, i13, i14);
                    System.arraycopy(this.j, 0, iArr, i13, i14);
                    this.k = jArr;
                    this.f18396n = jArr2;
                    this.m = iArr2;
                    this.f18395l = iArr3;
                    this.o = cryptoDataArr;
                    this.j = iArr;
                    this.r = 0;
                    this.f18394i = i11;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long g(int i2) {
        long j = this.f18398u;
        long jMax = Long.MIN_VALUE;
        if (i2 != 0) {
            int iJ = j(i2 - 1);
            for (int i3 = 0; i3 < i2; i3++) {
                jMax = Math.max(jMax, this.f18396n[iJ]);
                if ((this.m[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
                if (iJ == -1) {
                    iJ = this.f18394i - 1;
                }
            }
        }
        this.f18398u = Math.max(j, jMax);
        this.f18397p -= i2;
        int i4 = this.q + i2;
        this.q = i4;
        int i5 = this.r + i2;
        this.r = i5;
        int i6 = this.f18394i;
        if (i5 >= i6) {
            this.r = i5 - i6;
        }
        int i7 = this.s - i2;
        this.s = i7;
        int i8 = 0;
        if (i7 < 0) {
            this.s = 0;
        }
        while (true) {
            SpannedData spannedData = this.f18391c;
            SparseArray sparseArray = spannedData.f18421b;
            if (i8 >= sparseArray.size() - 1) {
                break;
            }
            int i9 = i8 + 1;
            if (i4 < sparseArray.keyAt(i9)) {
                break;
            }
            spannedData.f18422c.a(sparseArray.valueAt(i8));
            sparseArray.removeAt(i8);
            int i10 = spannedData.f18420a;
            if (i10 > 0) {
                spannedData.f18420a = i10 - 1;
            }
            i8 = i9;
        }
        if (this.f18397p != 0) {
            return this.k[this.r];
        }
        int i11 = this.r;
        if (i11 == 0) {
            i11 = this.f18394i;
        }
        int i12 = i11 - 1;
        return this.k[i12] + ((long) this.f18395l[i12]);
    }

    public final void h() {
        long jG;
        SampleDataQueue sampleDataQueue = this.f18389a;
        synchronized (this) {
            int i2 = this.f18397p;
            jG = i2 == 0 ? -1L : g(i2);
        }
        sampleDataQueue.a(jG);
    }

    public final int i(int i2, int i3, long j, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = this.f18396n[i2];
            if (j2 > j) {
                break;
            }
            if (!z2 || (this.m[i2] & 1) != 0) {
                if (j2 == j) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.f18394i) {
                i2 = 0;
            }
        }
        return i4;
    }

    public final int j(int i2) {
        int i3 = this.r + i2;
        int i4 = this.f18394i;
        return i3 < i4 ? i3 : i3 - i4;
    }

    public final synchronized boolean k(boolean z2) {
        Format format;
        int i2 = this.s;
        boolean z3 = false;
        if (i2 != this.f18397p) {
            if (((SharedSampleMetadata) this.f18391c.a(this.q + i2)).f18404a != this.g) {
                return true;
            }
            return l(j(this.s));
        }
        if (z2 || this.f18399w || ((format = this.f18388B) != null && format != this.g)) {
            z3 = true;
        }
        return z3;
    }

    public final boolean l(int i2) {
        DrmSession drmSession = this.f18393h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.m[i2] & 1073741824) == 0 && this.f18393h.b();
    }

    public final void m(Format format, FormatHolder formatHolder) {
        Format format2;
        Format format3 = this.g;
        boolean z2 = format3 == null;
        DrmInitData drmInitData = z2 ? null : format3.p0;
        this.g = format;
        DrmInitData drmInitData2 = format.p0;
        DrmSessionManager drmSessionManager = this.d;
        if (drmSessionManager != null) {
            int iA = drmSessionManager.a(format);
            Format.Builder builderA = format.a();
            builderA.f17080F = iA;
            format2 = new Format(builderA);
        } else {
            format2 = format;
        }
        formatHolder.f17094b = format2;
        formatHolder.f17093a = this.f18393h;
        if (drmSessionManager == null) {
            return;
        }
        if (z2 || !Util.a(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f18393h;
            DrmSessionEventListener.EventDispatcher eventDispatcher = this.f18392e;
            DrmSession drmSessionC = drmSessionManager.c(eventDispatcher, format);
            this.f18393h = drmSessionC;
            formatHolder.f17093a = drmSessionC;
            if (drmSession != null) {
                drmSession.f(eventDispatcher);
            }
        }
    }

    public final void n(boolean z2) {
        SpannedData spannedData;
        SparseArray sparseArray;
        SampleDataQueue sampleDataQueue = this.f18389a;
        SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.d;
        Allocation allocation = allocationNode.f18386c;
        Allocator allocator = sampleDataQueue.f18380a;
        if (allocation != null) {
            allocator.a(allocationNode);
            allocationNode.f18386c = null;
            allocationNode.d = null;
        }
        SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.d;
        int i2 = 0;
        Assertions.d(allocationNode2.f18386c == null);
        allocationNode2.f18384a = 0L;
        allocationNode2.f18385b = sampleDataQueue.f18381b;
        SampleDataQueue.AllocationNode allocationNode3 = sampleDataQueue.d;
        sampleDataQueue.f18383e = allocationNode3;
        sampleDataQueue.f = allocationNode3;
        sampleDataQueue.g = 0L;
        allocator.trim();
        this.f18397p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.f18398u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f18399w = false;
        while (true) {
            spannedData = this.f18391c;
            sparseArray = spannedData.f18421b;
            if (i2 >= sparseArray.size()) {
                break;
            }
            spannedData.f18422c.a(sparseArray.valueAt(i2));
            i2++;
        }
        spannedData.f18420a = -1;
        sparseArray.clear();
        if (z2) {
            this.f18387A = null;
            this.f18388B = null;
            this.y = true;
        }
    }

    public final synchronized boolean o(long j, boolean z2) throws Throwable {
        try {
            try {
                synchronized (this) {
                    try {
                        this.s = 0;
                        SampleDataQueue sampleDataQueue = this.f18389a;
                        sampleDataQueue.f18383e = sampleDataQueue.d;
                        int iJ = j(0);
                        int i2 = this.s;
                        int i3 = this.f18397p;
                        if (!(i2 != i3) || j < this.f18396n[iJ] || (j > this.v && !z2)) {
                            return false;
                        }
                        int i4 = i(iJ, i3 - i2, j, true);
                        if (i4 == -1) {
                            return false;
                        }
                        this.t = j;
                        this.s += i4;
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }
}
