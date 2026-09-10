package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2545nu implements DD {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public H9 A00;
    public InterfaceC2482ms A01;
    public final HD A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, 26, 22, 12, 21, 29, 89, 11, 28, 24, 29, 89, 13, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 28, 89, 10, 13, 11, 28, 24, 20, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, RemoteControlWriter.BLOCK_CMDOK, 45, 46, RemoteControlWriter.BLOCK_CMDOK, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, Utf8.REPLACEMENT_BYTE, 108, 100};
    }

    static {
        A01();
    }

    public C2545nu(HD hd) {
        this.A02 = hd;
    }

    @Override // com.facebook.ads.redexgen.core.DD
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5y() {
    }

    @Override // com.facebook.ads.redexgen.core.DD
    public final long A7a() {
        if (this.A01 != null) {
            return this.A01.A8n();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @Override // com.facebook.ads.redexgen.core.DD
    public final void AAB(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") InterfaceC2627pF interfaceC2627pF, Uri uri, Map<String, List<String>> map, long j, long j2, HA ha) throws IOException {
        C10469f c10469f = new C10469f(interfaceC2627pF, j, j2);
        this.A01 = c10469f;
        if (this.A00 != null) {
            return;
        }
        H9[] extractors = this.A02.A5O(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            for (H9 h9 : extractors) {
                try {
                    if (h9.AK5(c10469f)) {
                        this.A00 = h9;
                        AbstractC09153y.A08(this.A00 != null || c10469f.A8n() == j);
                        c10469f.AIl();
                        break;
                    } else {
                        boolean z = this.A00 != null || c10469f.A8n() == j;
                        AbstractC09153y.A08(z);
                        c10469f.AIl();
                    }
                } catch (EOFException unused) {
                    if (this.A00 != null || c10469f.A8n() == j) {
                    }
                } catch (Throwable th) {
                    AbstractC09153y.A08(this.A00 != null || c10469f.A8n() == j);
                    c10469f.AIl();
                    throw th;
                }
                AbstractC09153y.A08(z);
                c10469f.AIl();
            }
            if (this.A00 == null) {
                throw new C2520nV(A00(24, 34, 2) + C5C.A0s(extractors) + A00(0, 24, 55), (Uri) AbstractC09153y.A01(uri));
            }
        }
        H9 h10 = this.A00;
        String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        h10.AAC(ha);
    }

    @Override // com.facebook.ads.redexgen.core.DD
    public final int AHM(HV hv) throws IOException {
        return ((H9) AbstractC09153y.A01(this.A00)).AHL((InterfaceC2482ms) AbstractC09153y.A01(this.A01), hv);
    }

    @Override // com.facebook.ads.redexgen.core.DD
    public final void AHb() {
        if (this.A00 != null) {
            this.A00.AHb();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.facebook.ads.redexgen.core.DD
    public final void AJ6(long j, long j2) {
        ((H9) AbstractC09153y.A01(this.A00)).AJ6(j, j2);
    }
}
