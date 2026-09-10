package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Charsets;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17930a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory(List list) {
        this.f17930a = list;
    }

    public final List a(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i2;
        List list = this.f17930a;
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.f18096c);
        while (parsableByteArray.a() > 0) {
            int iU = parsableByteArray.u();
            int iU2 = parsableByteArray.f18957b + parsableByteArray.u();
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
                    parsableByteArray.G(1);
                    List listSingletonList = z2 ? Collections.singletonList((bU & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    Format.Builder builder = new Format.Builder();
                    builder.k = str;
                    builder.f17083c = strS;
                    builder.C = i2;
                    builder.m = listSingletonList;
                    arrayList.add(new Format(builder));
                }
                list = arrayList;
            }
            parsableByteArray.F(iU2);
        }
        return list;
    }
}
