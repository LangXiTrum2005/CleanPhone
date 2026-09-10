package com.google.android.exoplayer2.metadata.dvbsi;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class AppInfoTableDecoder extends SimpleMetadataDecoder {
    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public final Metadata b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            ParsableBitArray parsableBitArray = new ParsableBitArray(byteBuffer.array(), byteBuffer.limit());
            parsableBitArray.n(12);
            int iD = (parsableBitArray.d() + parsableBitArray.g(12)) - 4;
            parsableBitArray.n(44);
            parsableBitArray.o(parsableBitArray.g(12));
            parsableBitArray.n(16);
            ArrayList arrayList = new ArrayList();
            while (parsableBitArray.d() < iD) {
                parsableBitArray.n(48);
                int iG = parsableBitArray.g(8);
                parsableBitArray.n(4);
                int iD2 = parsableBitArray.d() + parsableBitArray.g(12);
                String str = null;
                String str2 = null;
                while (parsableBitArray.d() < iD2) {
                    int iG2 = parsableBitArray.g(8);
                    int iG3 = parsableBitArray.g(8);
                    int iD3 = parsableBitArray.d() + iG3;
                    if (iG2 == 2) {
                        int iG4 = parsableBitArray.g(16);
                        parsableBitArray.n(8);
                        if (iG4 == 3) {
                            while (parsableBitArray.d() < iD3) {
                                int iG5 = parsableBitArray.g(8);
                                Charset charset = Charsets.f19703a;
                                byte[] bArr = new byte[iG5];
                                parsableBitArray.i(iG5, bArr);
                                str = new String(bArr, charset);
                                int iG6 = parsableBitArray.g(8);
                                for (int i2 = 0; i2 < iG6; i2++) {
                                    parsableBitArray.o(parsableBitArray.g(8));
                                }
                            }
                        }
                    } else if (iG2 == 21) {
                        Charset charset2 = Charsets.f19703a;
                        byte[] bArr2 = new byte[iG3];
                        parsableBitArray.i(iG3, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    parsableBitArray.l(iD3 * 8);
                }
                parsableBitArray.l(iD2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new AppInfoTable(iG, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
        }
        return null;
    }
}
