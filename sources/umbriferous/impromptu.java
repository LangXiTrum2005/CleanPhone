package umbriferous;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: CLSUUID.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f39120attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f39119saneness = CommonUtils.cuirassed(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final AtomicLong f39118dern = new AtomicLong(0);

    public impromptu() {
        byte[] bArr = new byte[10];
        beachfront(bArr);
        marial(bArr);
        wireman(bArr);
        String strAdultoid = CommonUtils.adultoid(bArr);
        Locale locale = Locale.US;
        this.f39120attabal = String.format(locale, "%s%s%s%s", strAdultoid.substring(0, 12), strAdultoid.substring(12, 16), strAdultoid.subSequence(16, 20), f39119saneness.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] attabal(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public static byte[] saneness(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final void beachfront(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrAttabal = attabal(time / 1000);
        bArr[0] = bArrAttabal[0];
        bArr[1] = bArrAttabal[1];
        bArr[2] = bArrAttabal[2];
        bArr[3] = bArrAttabal[3];
        byte[] bArrSaneness = saneness(time % 1000);
        bArr[4] = bArrSaneness[0];
        bArr[5] = bArrSaneness[1];
    }

    public String dern() {
        return this.f39120attabal;
    }

    public final void marial(byte[] bArr) {
        byte[] bArrSaneness = saneness(f39118dern.incrementAndGet());
        bArr[6] = bArrSaneness[0];
        bArr[7] = bArrSaneness[1];
    }

    public String toString() {
        return this.f39120attabal;
    }

    public final void wireman(byte[] bArr) {
        byte[] bArrSaneness = saneness(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrSaneness[0];
        bArr[9] = bArrSaneness[1];
    }
}
