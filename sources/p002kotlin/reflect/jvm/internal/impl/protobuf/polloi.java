package p002kotlin.reflect.jvm.internal.impl.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: compiled from: RopeByteString.java */
/* JADX INFO: loaded from: classes5.dex */
public class polloi extends p002kotlin.reflect.jvm.internal.impl.protobuf.wireman {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final int[] f31161dovishness;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f31162adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f31163arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final int f31164graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final int f31165molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.protobuf.wireman f31166monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.protobuf.wireman f31167polloi;

    /* JADX INFO: compiled from: RopeByteString.java */
    public static class dern implements Iterator<impassible> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public impassible f31168arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Stack<polloi> f31169kowloon;

        public final impassible attabal(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar) {
            while (wiremanVar instanceof polloi) {
                polloi polloiVar = (polloi) wiremanVar;
                this.f31169kowloon.push(polloiVar);
                wiremanVar = polloiVar.f31166monoploid;
            }
            return (impassible) wiremanVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public impassible next() {
            impassible impassibleVar = this.f31168arytenoidectomy;
            if (impassibleVar == null) {
                throw new NoSuchElementException();
            }
            this.f31168arytenoidectomy = saneness();
            return impassibleVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31168arytenoidectomy != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public final impassible saneness() {
            while (!this.f31169kowloon.isEmpty()) {
                impassible impassibleVarAttabal = attabal(this.f31169kowloon.pop().f31167polloi);
                if (!impassibleVarAttabal.isEmpty()) {
                    return impassibleVarAttabal;
                }
            }
            return null;
        }

        public dern(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar) {
            this.f31169kowloon = new Stack<>();
            this.f31168arytenoidectomy = attabal(wiremanVar);
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Stack<p002kotlin.reflect.jvm.internal.impl.protobuf.wireman> f31177attabal;

        public saneness() {
            this.f31177attabal = new Stack<>();
        }

        public final void dern(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar) {
            if (wiremanVar.apical()) {
                marial(wiremanVar);
                return;
            }
            if (wiremanVar instanceof polloi) {
                polloi polloiVar = (polloi) wiremanVar;
                dern(polloiVar.f31166monoploid);
                dern(polloiVar.f31167polloi);
            } else {
                String strValueOf = String.valueOf(wiremanVar.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public final void marial(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar) {
            int iWireman = wireman(wiremanVar.size());
            int i = polloi.f31161dovishness[iWireman + 1];
            if (this.f31177attabal.isEmpty() || this.f31177attabal.peek().size() >= i) {
                this.f31177attabal.push(wiremanVar);
                return;
            }
            int i2 = polloi.f31161dovishness[iWireman];
            p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVarPop = this.f31177attabal.pop();
            while (true) {
                if (this.f31177attabal.isEmpty() || this.f31177attabal.peek().size() >= i2) {
                    break;
                } else {
                    wiremanVarPop = new polloi(this.f31177attabal.pop(), wiremanVarPop);
                }
            }
            polloi polloiVar = new polloi(wiremanVarPop, wiremanVar);
            while (!this.f31177attabal.isEmpty()) {
                if (this.f31177attabal.peek().size() >= polloi.f31161dovishness[wireman(polloiVar.size()) + 1]) {
                    break;
                } else {
                    polloiVar = new polloi(this.f31177attabal.pop(), polloiVar);
                }
            }
            this.f31177attabal.push(polloiVar);
        }

        public final p002kotlin.reflect.jvm.internal.impl.protobuf.wireman saneness(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar, p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar2) {
            dern(wiremanVar);
            dern(wiremanVar2);
            p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVarPop = this.f31177attabal.pop();
            while (!this.f31177attabal.isEmpty()) {
                wiremanVarPop = new polloi(this.f31177attabal.pop(), wiremanVarPop);
            }
            return wiremanVarPop;
        }

        public final int wireman(int i) {
            int iBinarySearch = Arrays.binarySearch(polloi.f31161dovishness, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public class wireman implements kotlin.reflect.jvm.internal.impl.protobuf.wireman.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.protobuf.wireman.attabal f31178arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final dern f31179kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f31180monoploid;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31180monoploid > 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.wireman.attabal
        public byte nextByte() {
            if (!this.f31178arytenoidectomy.hasNext()) {
                this.f31178arytenoidectomy = this.f31179kowloon.next().iterator();
            }
            this.f31180monoploid--;
            return this.f31178arytenoidectomy.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public wireman() {
            dern dernVar = new dern(polloi.this);
            this.f31179kowloon = dernVar;
            this.f31178arytenoidectomy = dernVar.next().iterator();
            this.f31180monoploid = polloi.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f31161dovishness = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f31161dovishness;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public static p002kotlin.reflect.jvm.internal.impl.protobuf.wireman stratoscope(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar, p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar2) {
        polloi polloiVar = wiremanVar instanceof polloi ? (polloi) wiremanVar : null;
        if (wiremanVar2.size() == 0) {
            return wiremanVar;
        }
        if (wiremanVar.size() == 0) {
            return wiremanVar2;
        }
        int size = wiremanVar.size() + wiremanVar2.size();
        if (size < 128) {
            return trm(wiremanVar, wiremanVar2);
        }
        if (polloiVar != null && polloiVar.f31167polloi.size() + wiremanVar2.size() < 128) {
            return new polloi(polloiVar.f31166monoploid, trm(polloiVar.f31167polloi, wiremanVar2));
        }
        if (polloiVar == null || polloiVar.f31166monoploid.cutely() <= polloiVar.f31167polloi.cutely() || polloiVar.cutely() <= wiremanVar2.cutely()) {
            return size >= f31161dovishness[Math.max(wiremanVar.cutely(), wiremanVar2.cutely()) + 1] ? new polloi(wiremanVar, wiremanVar2) : new saneness().saneness(wiremanVar, wiremanVar2);
        }
        return new polloi(polloiVar.f31166monoploid, new polloi(polloiVar.f31167polloi, wiremanVar2));
    }

    public static impassible trm(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar, p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar2) {
        int size = wiremanVar.size();
        int size2 = wiremanVar2.size();
        byte[] bArr = new byte[size + size2];
        wiremanVar.impromptu(bArr, 0, 0, size);
        wiremanVar2.impromptu(bArr, 0, size, size2);
        return new impassible(bArr);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public String adultoid(String str) throws UnsupportedEncodingException {
        return new String(graveside(), str);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public boolean apical() {
        return this.f31163arytenoidectomy >= f31161dovishness[this.f31164graveside];
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int cutely() {
        return this.f31164graveside;
    }

    public boolean equals(Object obj) {
        int iMolybdenite;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p002kotlin.reflect.jvm.internal.impl.protobuf.wireman)) {
            return false;
        }
        p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar = (p002kotlin.reflect.jvm.internal.impl.protobuf.wireman) obj;
        if (this.f31163arytenoidectomy != wiremanVar.size()) {
            return false;
        }
        if (this.f31163arytenoidectomy == 0) {
            return true;
        }
        if (this.f31162adultoid == 0 || (iMolybdenite = wiremanVar.molybdenite()) == 0 || this.f31162adultoid == iMolybdenite) {
            return oilcan(wiremanVar);
        }
        return false;
    }

    public int hashCode() {
        int iMonoploid = this.f31162adultoid;
        if (iMonoploid == 0) {
            int i = this.f31163arytenoidectomy;
            iMonoploid = monoploid(i, 0, i);
            if (iMonoploid == 0) {
                iMonoploid = 1;
            }
            this.f31162adultoid = iMonoploid;
        }
        return iMonoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public boolean impassible() {
        int iPolloi = this.f31166monoploid.polloi(0, 0, this.f31165molybdenite);
        p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar = this.f31167polloi;
        return wiremanVar.polloi(iPolloi, 0, wiremanVar.size()) == 0;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public p002kotlin.reflect.jvm.internal.impl.protobuf.marial kowloon() {
        return p002kotlin.reflect.jvm.internal.impl.protobuf.marial.competently(new marial());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int molybdenite() {
        return this.f31162adultoid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int monoploid(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f31165molybdenite;
        if (i4 <= i5) {
            return this.f31166monoploid.monoploid(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f31167polloi.monoploid(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f31167polloi.monoploid(this.f31166monoploid.monoploid(i, i2, i6), 0, i3 - i6);
    }

    public final boolean oilcan(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar) {
        dern dernVar = new dern(this);
        impassible next = dernVar.next();
        dern dernVar2 = new dern(wiremanVar);
        impassible next2 = dernVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next.cord(next2, i2, iMin) : next2.cord(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.f31163arytenoidectomy;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = dernVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = dernVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int polloi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f31165molybdenite;
        if (i4 <= i5) {
            return this.f31166monoploid.polloi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f31167polloi.polloi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f31167polloi.polloi(this.f31166monoploid.polloi(i, i2, i6), 0, i3 - i6);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public void rotuma(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f31165molybdenite;
        if (i3 <= i4) {
            this.f31166monoploid.rotuma(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.f31167polloi.rotuma(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.f31166monoploid.rotuma(outputStream, i, i5);
            this.f31167polloi.rotuma(outputStream, 0, i2 - i5);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int size() {
        return this.f31163arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public void taiyuan(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f31165molybdenite;
        if (i4 <= i5) {
            this.f31166monoploid.taiyuan(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f31167polloi.taiyuan(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.f31166monoploid.taiyuan(bArr, i, i2, i6);
            this.f31167polloi.taiyuan(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman, java.lang.Iterable
    /* JADX INFO: renamed from: triweekly */
    public kotlin.reflect.jvm.internal.impl.protobuf.wireman.attabal iterator() {
        return new wireman();
    }

    public polloi(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar, p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar2) {
        this.f31162adultoid = 0;
        this.f31166monoploid = wiremanVar;
        this.f31167polloi = wiremanVar2;
        int size = wiremanVar.size();
        this.f31165molybdenite = size;
        this.f31163arytenoidectomy = size + wiremanVar2.size();
        this.f31164graveside = Math.max(wiremanVar.cutely(), wiremanVar2.cutely()) + 1;
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public class marial extends InputStream {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public impassible f31171arytenoidectomy;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f31172graveside;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public dern f31173kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f31174molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f31175monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f31176polloi;

        public marial() {
            saneness();
        }

        public final void attabal() {
            if (this.f31171arytenoidectomy != null) {
                int i = this.f31176polloi;
                int i2 = this.f31175monoploid;
                if (i == i2) {
                    this.f31174molybdenite += i2;
                    this.f31176polloi = 0;
                    if (!this.f31173kowloon.hasNext()) {
                        this.f31171arytenoidectomy = null;
                        this.f31175monoploid = 0;
                    } else {
                        impassible next = this.f31173kowloon.next();
                        this.f31171arytenoidectomy = next;
                        this.f31175monoploid = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return polloi.this.size() - (this.f31174molybdenite + this.f31176polloi);
        }

        public final int dern(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                attabal();
                if (this.f31171arytenoidectomy == null) {
                    if (i3 != i2) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f31175monoploid - this.f31176polloi, i3);
                if (bArr != null) {
                    this.f31171arytenoidectomy.impromptu(bArr, this.f31176polloi, i, iMin);
                    i += iMin;
                }
                this.f31176polloi += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f31172graveside = this.f31174molybdenite + this.f31176polloi;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            return dern(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            saneness();
            dern(null, 0, this.f31172graveside);
        }

        public final void saneness() {
            dern dernVar = new dern(polloi.this);
            this.f31173kowloon = dernVar;
            impassible next = dernVar.next();
            this.f31171arytenoidectomy = next;
            this.f31175monoploid = next.size();
            this.f31176polloi = 0;
            this.f31174molybdenite = 0;
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return dern(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            attabal();
            impassible impassibleVar = this.f31171arytenoidectomy;
            if (impassibleVar == null) {
                return -1;
            }
            int i = this.f31176polloi;
            this.f31176polloi = i + 1;
            return impassibleVar.preprohormone(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
    }
}
