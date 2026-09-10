package vinyl;

import com.ironsource.X3;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvinyl/libya;", "Lvinyl/attendance;", "Lpatroclinal/arytenoidectomy;", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "", "saneness", "(I)V", "Lpatroclinal/kowloon;", "c", "marial", "beachfront", "()[I", "attabal", "[I", "buffer", "value", "I", "wireman", "()I", X3.i.L, "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class libya extends attendance<patroclinal.arytenoidectomy> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int[] buffer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int position;

    public /* synthetic */ libya(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // vinyl.attendance
    public /* bridge */ /* synthetic */ patroclinal.arytenoidectomy attabal() {
        return patroclinal.arytenoidectomy.saneness(beachfront());
    }

    public int[] beachfront() {
        int[] iArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return patroclinal.arytenoidectomy.marial(iArrCopyOf);
    }

    public final void marial(int c) {
        attendance.dern(this, 0, 1, null);
        int[] iArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        patroclinal.arytenoidectomy.polloi(iArr, position, c);
    }

    @Override // vinyl.attendance
    public void saneness(int requiredCapacity) {
        if (patroclinal.arytenoidectomy.triweekly(this.buffer) < requiredCapacity) {
            int[] iArr = this.buffer;
            int[] iArrCopyOf = Arrays.copyOf(iArr, p002kotlin.ranges.wireman.wireman(requiredCapacity, patroclinal.arytenoidectomy.triweekly(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.buffer = patroclinal.arytenoidectomy.marial(iArrCopyOf);
        }
    }

    @Override // vinyl.attendance
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    public libya(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = patroclinal.arytenoidectomy.triweekly(bufferWithData);
        saneness(10);
    }
}
