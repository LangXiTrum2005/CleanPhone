package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public class SampleQueue implements TrackOutput {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Format f6423A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Format f6424B;
    public boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SampleDataQueue f6425a;
    public final DrmSessionManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DrmSessionEventListener.EventDispatcher f6428e;
    public UpstreamFormatChangedListener f;
    public Format g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DrmSession f6429h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6433p;
    public int q;
    public int r;
    public int s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6435w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6436z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SampleExtrasHolder f6426b = new SampleExtrasHolder();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6430i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f6432n = new long[1000];
    public int[] m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f6431l = new int[1000];
    public TrackOutput.CryptoData[] o = new TrackOutput.CryptoData[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SpannedData f6427c = new SpannedData(new k(0));
    public long t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f6434u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean C = true;

    public static final class SampleExtrasHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TrackOutput.CryptoData f6439c;
    }

    public static final class SharedSampleMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f6440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DrmSessionManager.DrmSessionReference f6441b;

        public SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.f6440a = format;
            this.f6441b = drmSessionReference;
        }
    }

    public interface UpstreamFormatChangedListener {
    }

    public SampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.d = drmSessionManager;
        this.f6428e = eventDispatcher;
        this.f6425a = new SampleDataQueue(allocator);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void a(ParsableByteArray parsableByteArray, int i2, int i3) {
        while (true) {
            SampleDataQueue sampleDataQueue = this.f6425a;
            if (i2 <= 0) {
                sampleDataQueue.getClass();
                return;
            }
            int iB = sampleDataQueue.b(i2);
            SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f;
            Allocation allocation = allocationNode.f6422c;
            parsableByteArray.e(allocation.f6551a, ((int) (sampleDataQueue.g - allocationNode.f6420a)) + allocation.f6552b, iB);
            i2 -= iB;
            long j = sampleDataQueue.g + ((long) iB);
            sampleDataQueue.g = j;
            SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.f;
            if (j == allocationNode2.f6421b) {
                sampleDataQueue.f = allocationNode2.d;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0026, B:15:0x003d, B:19:0x0055, B:18:0x0053), top: B:29:0x000a }] */
    @Override // androidx.media3.extractor.TrackOutput
    public final void b(Format format) {
        Format formatJ = j(format);
        boolean z2 = false;
        this.f6436z = false;
        this.f6423A = format;
        synchronized (this) {
            try {
                this.y = false;
                if (!Util.a(formatJ, this.f6424B)) {
                    if (this.f6427c.f6458b.size() == 0) {
                        this.f6424B = formatJ;
                    } else {
                        SparseArray sparseArray = this.f6427c.f6458b;
                        if (((SharedSampleMetadata) sparseArray.valueAt(sparseArray.size() - 1)).f6440a.equals(formatJ)) {
                            SparseArray sparseArray2 = this.f6427c.f6458b;
                            this.f6424B = ((SharedSampleMetadata) sparseArray2.valueAt(sparseArray2.size() - 1)).f6440a;
                        } else {
                            this.f6424B = formatJ;
                        }
                    }
                    boolean z3 = this.C;
                    Format format2 = this.f6424B;
                    this.C = z3 & MimeTypes.a(format2.m, format2.j);
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
        progressiveMediaPeriod.r0.post(progressiveMediaPeriod.p0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int d(DataReader dataReader, int i2, boolean z2) throws EOFException {
        SampleDataQueue sampleDataQueue = this.f6425a;
        int iB = sampleDataQueue.b(i2);
        SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f;
        Allocation allocation = allocationNode.f6422c;
        int i3 = dataReader.read(allocation.f6551a, ((int) (sampleDataQueue.g - allocationNode.f6420a)) + allocation.f6552b, iB);
        if (i3 == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        long j = sampleDataQueue.g + ((long) i3);
        sampleDataQueue.g = j;
        SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.f;
        if (j == allocationNode2.f6421b) {
            sampleDataQueue.f = allocationNode2.d;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b3, B:67:0x0129, B:69:0x0132, B:46:0x00cc, B:48:0x00d5, B:50:0x00de, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00dc), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b3, B:67:0x0129, B:69:0x0132, B:46:0x00cc, B:48:0x00d5, B:50:0x00de, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00dc), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b3, B:67:0x0129, B:69:0x0132, B:46:0x00cc, B:48:0x00d5, B:50:0x00de, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00dc), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b3, B:67:0x0129, B:69:0x0132, B:46:0x00cc, B:48:0x00d5, B:50:0x00de, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00dc), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b3, B:67:0x0129, B:69:0x0132, B:46:0x00cc, B:48:0x00d5, B:50:0x00de, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00dc), top: B:74:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b3, B:67:0x0129, B:69:0x0132, B:46:0x00cc, B:48:0x00d5, B:50:0x00de, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00dc), top: B:74:0x0051 }] */
    @Override // androidx.media3.extractor.TrackOutput
    public void f(long j, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
        Format format;
        DrmSessionManager drmSessionManager;
        DrmSessionManager.DrmSessionReference drmSessionReferenceD;
        SpannedData spannedData;
        int i5;
        int i6;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z2;
        boolean z3;
        if (this.f6436z) {
            Format format2 = this.f6423A;
            Assertions.f(format2);
            b(format2);
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
                    Log.g("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f6424B);
                    this.D = true;
                }
                i2 |= 1;
            }
        }
        long j2 = (this.f6425a.g - ((long) i3)) - ((long) i4);
        synchronized (this) {
            try {
                int i8 = this.f6433p;
                if (i8 > 0) {
                    int iK = k(i8 - 1);
                    Assertions.b(this.k[iK] + ((long) this.f6431l[iK]) <= j2);
                }
                this.f6435w = (536870912 & i2) != 0;
                this.v = Math.max(this.v, j);
                int iK2 = k(this.f6433p);
                this.f6432n[iK2] = j;
                this.k[iK2] = j2;
                this.f6431l[iK2] = i3;
                this.m[iK2] = i2;
                this.o[iK2] = cryptoData;
                this.j[iK2] = 0;
                if (this.f6427c.f6458b.size() == 0) {
                    format = this.f6424B;
                    format.getClass();
                    drmSessionManager = this.d;
                    if (drmSessionManager != null) {
                        drmSessionReferenceD = drmSessionManager.d(this.f6428e, format);
                    } else {
                        drmSessionReferenceD = DrmSessionManager.DrmSessionReference.L8;
                    }
                    spannedData = this.f6427c;
                    i5 = this.q + this.f6433p;
                    SharedSampleMetadata sharedSampleMetadata = new SharedSampleMetadata(format, drmSessionReferenceD);
                    i6 = spannedData.f6457a;
                    sparseArray = spannedData.f6458b;
                    if (i6 == -1) {
                        if (sparseArray.size() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Assertions.e(z3);
                        spannedData.f6457a = 0;
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
                            spannedData.f6459c.accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i5, sharedSampleMetadata);
                } else {
                    SparseArray sparseArray2 = this.f6427c.f6458b;
                    if (!((SharedSampleMetadata) sparseArray2.valueAt(sparseArray2.size() - 1)).f6440a.equals(this.f6424B)) {
                        format = this.f6424B;
                        format.getClass();
                        drmSessionManager = this.d;
                        if (drmSessionManager != null) {
                            drmSessionReferenceD = drmSessionManager.d(this.f6428e, format);
                        } else {
                            drmSessionReferenceD = DrmSessionManager.DrmSessionReference.L8;
                        }
                        spannedData = this.f6427c;
                        i5 = this.q + this.f6433p;
                        SharedSampleMetadata sharedSampleMetadata2 = new SharedSampleMetadata(format, drmSessionReferenceD);
                        i6 = spannedData.f6457a;
                        sparseArray = spannedData.f6458b;
                        if (i6 == -1) {
                            if (sparseArray.size() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            Assertions.e(z3);
                            spannedData.f6457a = 0;
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
                                spannedData.f6459c.accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i5, sharedSampleMetadata2);
                    }
                }
                int i9 = this.f6433p + 1;
                this.f6433p = i9;
                int i10 = this.f6430i;
                if (i9 == i10) {
                    int i11 = i10 + 1000;
                    long[] jArr = new long[i11];
                    long[] jArr2 = new long[i11];
                    long[] jArr3 = new long[i11];
                    int[] iArr = new int[i11];
                    int[] iArr2 = new int[i11];
                    TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i11];
                    int i12 = this.r;
                    int i13 = i10 - i12;
                    System.arraycopy(this.k, i12, jArr2, 0, i13);
                    System.arraycopy(this.f6432n, this.r, jArr3, 0, i13);
                    System.arraycopy(this.m, this.r, iArr, 0, i13);
                    System.arraycopy(this.f6431l, this.r, iArr2, 0, i13);
                    System.arraycopy(this.o, this.r, cryptoDataArr, 0, i13);
                    System.arraycopy(this.j, this.r, jArr, 0, i13);
                    int i14 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i13, i14);
                    System.arraycopy(this.f6432n, 0, jArr3, i13, i14);
                    System.arraycopy(this.m, 0, iArr, i13, i14);
                    System.arraycopy(this.f6431l, 0, iArr2, i13, i14);
                    System.arraycopy(this.o, 0, cryptoDataArr, i13, i14);
                    System.arraycopy(this.j, 0, jArr, i13, i14);
                    this.k = jArr2;
                    this.f6432n = jArr3;
                    this.m = iArr;
                    this.f6431l = iArr2;
                    this.o = cryptoDataArr;
                    this.j = jArr;
                    this.r = 0;
                    this.f6430i = i11;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long g(int i2) {
        long j = this.f6434u;
        long jMax = Long.MIN_VALUE;
        if (i2 != 0) {
            int iK = k(i2 - 1);
            for (int i3 = 0; i3 < i2; i3++) {
                jMax = Math.max(jMax, this.f6432n[iK]);
                if ((this.m[iK] & 1) != 0) {
                    break;
                }
                iK--;
                if (iK == -1) {
                    iK = this.f6430i - 1;
                }
            }
        }
        this.f6434u = Math.max(j, jMax);
        this.f6433p -= i2;
        int i4 = this.q + i2;
        this.q = i4;
        int i5 = this.r + i2;
        this.r = i5;
        int i6 = this.f6430i;
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
            SpannedData spannedData = this.f6427c;
            SparseArray sparseArray = spannedData.f6458b;
            if (i8 >= sparseArray.size() - 1) {
                break;
            }
            int i9 = i8 + 1;
            if (i4 < sparseArray.keyAt(i9)) {
                break;
            }
            spannedData.f6459c.accept(sparseArray.valueAt(i8));
            sparseArray.removeAt(i8);
            int i10 = spannedData.f6457a;
            if (i10 > 0) {
                spannedData.f6457a = i10 - 1;
            }
            i8 = i9;
        }
        if (this.f6433p != 0) {
            return this.k[this.r];
        }
        int i11 = this.r;
        if (i11 == 0) {
            i11 = this.f6430i;
        }
        int i12 = i11 - 1;
        return this.k[i12] + ((long) this.f6431l[i12]);
    }

    public final void h() {
        long jG;
        SampleDataQueue sampleDataQueue = this.f6425a;
        synchronized (this) {
            int i2 = this.f6433p;
            jG = i2 == 0 ? -1L : g(i2);
        }
        sampleDataQueue.a(jG);
    }

    public final int i(int i2, int i3, long j, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = this.f6432n[i2];
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
            if (i2 == this.f6430i) {
                i2 = 0;
            }
        }
        return i4;
    }

    public Format j(Format format) {
        return format;
    }

    public final int k(int i2) {
        int i3 = this.r + i2;
        int i4 = this.f6430i;
        return i3 < i4 ? i3 : i3 - i4;
    }

    public final synchronized Format l() {
        return this.y ? null : this.f6424B;
    }

    public final synchronized boolean m(boolean z2) {
        Format format;
        int i2 = this.s;
        boolean z3 = false;
        if (i2 != this.f6433p) {
            if (((SharedSampleMetadata) this.f6427c.a(this.q + i2)).f6440a != this.g) {
                return true;
            }
            return n(k(this.s));
        }
        if (z2 || this.f6435w || ((format = this.f6424B) != null && format != this.g)) {
            z3 = true;
        }
        return z3;
    }

    public final boolean n(int i2) {
        DrmSession drmSession = this.f6429h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.m[i2] & 1073741824) == 0 && this.f6429h.b();
    }

    public final void o(Format format, FormatHolder formatHolder) {
        Format format2;
        Format format3 = this.g;
        boolean z2 = format3 == null;
        DrmInitData drmInitData = format3 == null ? null : format3.q;
        this.g = format;
        DrmInitData drmInitData2 = format.q;
        DrmSessionManager drmSessionManager = this.d;
        if (drmSessionManager != null) {
            int iC = drmSessionManager.c(format);
            Format.Builder builderA = format.a();
            builderA.f5422I = iC;
            format2 = new Format(builderA);
        } else {
            format2 = format;
        }
        formatHolder.f5911b = format2;
        formatHolder.f5910a = this.f6429h;
        if (drmSessionManager == null) {
            return;
        }
        if (z2 || !Util.a(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f6429h;
            DrmSessionEventListener.EventDispatcher eventDispatcher = this.f6428e;
            DrmSession drmSessionB = drmSessionManager.b(eventDispatcher, format);
            this.f6429h = drmSessionB;
            formatHolder.f5910a = drmSessionB;
            if (drmSession != null) {
                drmSession.g(eventDispatcher);
            }
        }
    }

    public final void p(boolean z2) {
        SpannedData spannedData;
        SparseArray sparseArray;
        SampleDataQueue sampleDataQueue = this.f6425a;
        SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.d;
        Allocation allocation = allocationNode.f6422c;
        Allocator allocator = sampleDataQueue.f6416a;
        if (allocation != null) {
            allocator.a(allocationNode);
            allocationNode.f6422c = null;
            allocationNode.d = null;
        }
        SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.d;
        int i2 = 0;
        Assertions.e(allocationNode2.f6422c == null);
        allocationNode2.f6420a = 0L;
        allocationNode2.f6421b = sampleDataQueue.f6417b;
        SampleDataQueue.AllocationNode allocationNode3 = sampleDataQueue.d;
        sampleDataQueue.f6419e = allocationNode3;
        sampleDataQueue.f = allocationNode3;
        sampleDataQueue.g = 0L;
        allocator.trim();
        this.f6433p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.f6434u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f6435w = false;
        while (true) {
            spannedData = this.f6427c;
            sparseArray = spannedData.f6458b;
            if (i2 >= sparseArray.size()) {
                break;
            }
            spannedData.f6459c.accept(sparseArray.valueAt(i2));
            i2++;
        }
        spannedData.f6457a = -1;
        sparseArray.clear();
        if (z2) {
            this.f6423A = null;
            this.f6424B = null;
            this.y = true;
            this.C = true;
        }
    }

    public final synchronized boolean q(long j, boolean z2) {
        Throwable th;
        SampleQueue sampleQueue;
        long j2;
        int i2;
        try {
            synchronized (this) {
                try {
                    try {
                        this.s = 0;
                        SampleDataQueue sampleDataQueue = this.f6425a;
                        sampleDataQueue.f6419e = sampleDataQueue.d;
                        int iK = k(0);
                        int i3 = this.s;
                        int i4 = this.f6433p;
                        if (!(i3 != i4) || j < this.f6432n[iK] || (j > this.v && !z2)) {
                            return false;
                        }
                        if (this.C) {
                            i2 = i4 - i3;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i2) {
                                    if (!z2) {
                                        i2 = -1;
                                        break;
                                    }
                                    break;
                                }
                                try {
                                    if (this.f6432n[iK] >= j) {
                                        i2 = i5;
                                        break;
                                    }
                                    iK++;
                                    if (iK == this.f6430i) {
                                        iK = 0;
                                    }
                                    i5++;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            sampleQueue = this;
                            j2 = j;
                        } else {
                            sampleQueue = this;
                            j2 = j;
                            i2 = sampleQueue.i(iK, i4 - i3, j2, true);
                        }
                        if (i2 == -1) {
                            return false;
                        }
                        sampleQueue.t = j2;
                        sampleQueue.s += i2;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
                th = th;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
