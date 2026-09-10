package mj;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import xi.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f46143d = new j();

    @Override // xi.u
    public final Object f(byte b10, ByteBuffer byteBuffer) {
        switch (b10) {
            case -127:
                Object objE = e(byteBuffer);
                if (objE == null) {
                    return null;
                }
                return g.values()[((Long) objE).intValue()];
            case -126:
                Object objE2 = e(byteBuffer);
                if (objE2 == null) {
                    return null;
                }
                return e.values()[((Long) objE2).intValue()];
            case -125:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                h hVar = new h();
                String str = (String) arrayList.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"reason\" is null.");
                }
                hVar.f46131a = str;
                String str2 = (String) arrayList.get(1);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"biometricHint\" is null.");
                }
                hVar.f46132b = str2;
                String str3 = (String) arrayList.get(2);
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"biometricNotRecognized\" is null.");
                }
                hVar.f46133c = str3;
                String str4 = (String) arrayList.get(3);
                if (str4 == null) {
                    throw new IllegalStateException("Nonnull field \"biometricRequiredTitle\" is null.");
                }
                hVar.f46134d = str4;
                String str5 = (String) arrayList.get(4);
                if (str5 == null) {
                    throw new IllegalStateException("Nonnull field \"cancelButton\" is null.");
                }
                hVar.f46135e = str5;
                String str6 = (String) arrayList.get(5);
                if (str6 == null) {
                    throw new IllegalStateException("Nonnull field \"deviceCredentialsRequiredTitle\" is null.");
                }
                hVar.f46136f = str6;
                String str7 = (String) arrayList.get(6);
                if (str7 == null) {
                    throw new IllegalStateException("Nonnull field \"deviceCredentialsSetupDescription\" is null.");
                }
                hVar.f46137g = str7;
                String str8 = (String) arrayList.get(7);
                if (str8 == null) {
                    throw new IllegalStateException("Nonnull field \"goToSettingsButton\" is null.");
                }
                hVar.f46138h = str8;
                String str9 = (String) arrayList.get(8);
                if (str9 == null) {
                    throw new IllegalStateException("Nonnull field \"goToSettingsDescription\" is null.");
                }
                hVar.f46139i = str9;
                String str10 = (String) arrayList.get(9);
                if (str10 == null) {
                    throw new IllegalStateException("Nonnull field \"signInTitle\" is null.");
                }
                hVar.f46140j = str10;
                return hVar;
            case -124:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                f fVar = new f();
                Boolean bool = (Boolean) arrayList2.get(0);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"biometricOnly\" is null.");
                }
                fVar.f46116a = bool;
                Boolean bool2 = (Boolean) arrayList2.get(1);
                if (bool2 == null) {
                    throw new IllegalStateException("Nonnull field \"sensitiveTransaction\" is null.");
                }
                fVar.f46117b = bool2;
                Boolean bool3 = (Boolean) arrayList2.get(2);
                if (bool3 == null) {
                    throw new IllegalStateException("Nonnull field \"sticky\" is null.");
                }
                fVar.f46118c = bool3;
                Boolean bool4 = (Boolean) arrayList2.get(3);
                if (bool4 == null) {
                    throw new IllegalStateException("Nonnull field \"useErrorDialgs\" is null.");
                }
                fVar.f46119d = bool4;
                return fVar;
            default:
                return super.f(b10, byteBuffer);
        }
    }

    @Override // xi.u
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof g) {
            byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_AC3);
            k(byteArrayOutputStream, Integer.valueOf(((g) obj).f46130a));
            return;
        }
        if (obj instanceof e) {
            byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            k(byteArrayOutputStream, Integer.valueOf(((e) obj).f46115a));
            return;
        }
        if (!(obj instanceof h)) {
            if (!(obj instanceof f)) {
                super.k(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(132);
            f fVar = (f) obj;
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(fVar.f46116a);
            arrayList.add(fVar.f46117b);
            arrayList.add(fVar.f46118c);
            arrayList.add(fVar.f46119d);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        byteArrayOutputStream.write(131);
        h hVar = (h) obj;
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(hVar.f46131a);
        arrayList2.add(hVar.f46132b);
        arrayList2.add(hVar.f46133c);
        arrayList2.add(hVar.f46134d);
        arrayList2.add(hVar.f46135e);
        arrayList2.add(hVar.f46136f);
        arrayList2.add(hVar.f46137g);
        arrayList2.add(hVar.f46138h);
        arrayList2.add(hVar.f46139i);
        arrayList2.add(hVar.f46140j);
        k(byteArrayOutputStream, arrayList2);
    }
}
