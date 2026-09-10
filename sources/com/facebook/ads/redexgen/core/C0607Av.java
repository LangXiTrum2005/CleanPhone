package com.facebook.ads.redexgen.core;

import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.extractor.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.extractor.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.extractor.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.extractor.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0607Av extends V4 {
    public static String[] A03 = {"19vB", "3X", "EIRRAej2pEV3OUg2Myb15fGgmDpSgQh5", "gj1tHcIkErwBAgCeuhOE7SbG4J7f6ERO", "aSF7AzokzDFszNe2ZtPe8WfXLNY5ZINi", "Sm4mXwWBzvBeJixiUGKIoDoEwOkS3Cdt", "7PbjfWVSdCpisRBjAgzd0S84WlXGN1Rp", "k88AwpLNrv74AAM"};
    public C1590g4 A00;
    public final C1576fq A02 = new C1576fq();
    public final C1575fp A01 = new C1575fp();

    @Override // com.facebook.ads.redexgen.core.V4
    public final Metadata A0R(Bi bi, ByteBuffer byteBuffer) {
        if (this.A00 == null || bi.A00 != this.A00.A04()) {
            this.A00 = new C1590g4(bi.A01);
            this.A00.A05(bi.A01 - bi.A00);
        }
        byte[] bArrArray = byteBuffer.array();
        int size = byteBuffer.limit();
        this.A02.A0j(bArrArray, size);
        this.A01.A0E(bArrArray, size);
        this.A01.A09(39);
        long ptsAdjustment = (((long) this.A01.A04(1)) << 32) | ((long) this.A01.A04(32));
        this.A01.A09(20);
        int iA04 = this.A01.A04(12);
        int spliceCommandLength = this.A01.A04(8);
        Metadata.Entry spliceNullCommand = null;
        this.A02.A0g(14);
        switch (spliceCommandLength) {
            case 0:
                spliceNullCommand = new SpliceNullCommand();
                break;
            case 4:
                spliceNullCommand = SpliceScheduleCommand.A00(this.A02);
                break;
            case 5:
                spliceNullCommand = SpliceInsertCommand.A00(this.A02, ptsAdjustment, this.A00);
                break;
            case 6:
                spliceNullCommand = TimeSignalCommand.A01(this.A02, ptsAdjustment, this.A00);
                break;
            case 255:
                spliceNullCommand = PrivateCommand.A00(this.A02, iA04, ptsAdjustment);
                break;
        }
        String[] strArr = A03;
        if (strArr[1].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "hexrkiKSzEY28p3DHKI338BcmoY5HlMe";
        strArr2[4] = "1VMPpg8ZzorUNeFpuNzYyuvTKk0wVrdW";
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
