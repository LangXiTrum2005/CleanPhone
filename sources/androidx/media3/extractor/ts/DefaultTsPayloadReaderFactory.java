package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import com.google.common.base.Charsets;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7467a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory(List list) {
        this.f7467a = list;
    }

    public final List a(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i2;
        List list = this.f7467a;
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.d);
        while (parsableByteArray.a() > 0) {
            int iU = parsableByteArray.u();
            int iU2 = parsableByteArray.f5668b + parsableByteArray.u();
            if (iU == 134) {
                ArrayList arrayList = new ArrayList();
                int iU3 = parsableByteArray.u() & 31;
                for (int i3 = 0; i3 < iU3; i3++) {
                    String strS = parsableByteArray.s(3, Charsets.f19705c);
                    int iU4 = parsableByteArray.u();
                    boolean z2 = (iU4 & 128) != 0;
                    if (z2) {
                        i2 = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte bU = (byte) parsableByteArray.u();
                    parsableByteArray.H(1);
                    List listSingletonList = z2 ? Collections.singletonList((bU & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    Format.Builder builder = new Format.Builder();
                    builder.f5429l = MimeTypes.l(str);
                    builder.d = strS;
                    builder.f5420E = i2;
                    builder.o = listSingletonList;
                    arrayList.add(new Format(builder));
                }
                list = arrayList;
            }
            parsableByteArray.G(iU2);
        }
        return list;
    }
}
