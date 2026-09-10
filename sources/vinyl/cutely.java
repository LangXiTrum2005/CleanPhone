package vinyl;

import com.ironsource.X3;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lvinyl/cutely;", "Lvinyl/attendance;", "", "bufferWithData", "<init>", "([B)V", "", "requiredCapacity", "", "saneness", "(I)V", "", "c", "marial", "(B)V", "beachfront", "()[B", "attabal", "[B", "buffer", "value", "I", "wireman", "()I", X3.i.L, "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cutely extends attendance<byte[]> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public byte[] buffer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int position;

    public cutely(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        saneness(10);
    }

    @Override // vinyl.attendance
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public byte[] attabal() {
        byte[] bArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final void marial(byte c) {
        attendance.dern(this, 0, 1, null);
        byte[] bArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        bArr[position] = c;
    }

    @Override // vinyl.attendance
    public void saneness(int requiredCapacity) {
        byte[] bArr = this.buffer;
        if (bArr.length < requiredCapacity) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, p002kotlin.ranges.wireman.wireman(requiredCapacity, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.buffer = bArrCopyOf;
        }
    }

    @Override // vinyl.attendance
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public int getPosition() {
        return this.position;
    }
}
