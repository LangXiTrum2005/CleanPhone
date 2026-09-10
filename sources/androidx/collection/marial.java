package androidx.collection;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CircularIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/collection/marial;", "", "", "minCapacity", "<init>", "(I)V", "element", "", "attabal", "marial", "()I", "saneness", "()V", "", "wireman", "()Z", "dern", "", "elements", "[I", "I", TtmlNode.TAG_HEAD, "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int head;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int capacityBitmask;
    private int[] elements;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int tail;

    public marial() {
        this(0, 1, null);
    }

    public final void attabal(int element) {
        int[] iArr = this.elements;
        int i = this.tail;
        iArr[i] = element;
        int i2 = this.capacityBitmask & (i + 1);
        this.tail = i2;
        if (i2 == this.head) {
            dern();
        }
    }

    public final void dern() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i = this.head;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i3];
        p002kotlin.collections.arytenoidectomy.competently(iArr, iArr2, 0, i, length);
        p002kotlin.collections.arytenoidectomy.competently(this.elements, iArr2, i2, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i3 - 1;
    }

    public final int marial() {
        int i = this.head;
        if (i == this.tail) {
            beachfront beachfrontVar = beachfront.f5668attabal;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.elements[i];
        this.head = (i + 1) & this.capacityBitmask;
        return i2;
    }

    public final void saneness() {
        this.tail = this.head;
    }

    public final boolean wireman() {
        return this.head == this.tail;
    }

    public marial(int i) {
        if (!(i >= 1)) {
            molybdenite.wireman.attabal("capacity must be >= 1");
        }
        if (!(i <= 1073741824)) {
            molybdenite.wireman.attabal("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.capacityBitmask = i - 1;
        this.elements = new int[i];
    }

    public /* synthetic */ marial(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
