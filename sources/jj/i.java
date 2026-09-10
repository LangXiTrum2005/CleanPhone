package jj;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import xi.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f43952d = new i();

    @Override // xi.u
    public final Object f(byte b10, ByteBuffer byteBuffer) {
        switch (b10) {
            case -127:
                Object objE = e(byteBuffer);
                if (objE == null) {
                    return null;
                }
                return k.values()[((Long) objE).intValue()];
            case -126:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                h hVar = new h();
                List list = (List) arrayList.get(0);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"scopes\" is null.");
                }
                hVar.f43945a = list;
                k kVar = (k) arrayList.get(1);
                if (kVar == null) {
                    throw new IllegalStateException("Nonnull field \"signInType\" is null.");
                }
                hVar.f43946b = kVar;
                hVar.f43947c = (String) arrayList.get(2);
                hVar.f43948d = (String) arrayList.get(3);
                hVar.f43949e = (String) arrayList.get(4);
                Boolean bool = (Boolean) arrayList.get(5);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
                }
                hVar.f43950f = bool;
                hVar.f43951g = (String) arrayList.get(6);
                return hVar;
            case -125:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                l lVar = new l();
                lVar.f43955a = (String) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"email\" is null.");
                }
                lVar.f43956b = str;
                String str2 = (String) arrayList2.get(2);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                lVar.f43957c = str2;
                lVar.f43958d = (String) arrayList2.get(3);
                lVar.f43959e = (String) arrayList2.get(4);
                lVar.f43960f = (String) arrayList2.get(5);
                return lVar;
            default:
                return super.f(b10, byteBuffer);
        }
    }

    @Override // xi.u
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof k) {
            byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_AC3);
            k(byteArrayOutputStream, Integer.valueOf(((k) obj).f43954a));
            return;
        }
        if (obj instanceof h) {
            byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            h hVar = (h) obj;
            ArrayList arrayList = new ArrayList(7);
            arrayList.add(hVar.f43945a);
            arrayList.add(hVar.f43946b);
            arrayList.add(hVar.f43947c);
            arrayList.add(hVar.f43948d);
            arrayList.add(hVar.f43949e);
            arrayList.add(hVar.f43950f);
            arrayList.add(hVar.f43951g);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof l)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(131);
        l lVar = (l) obj;
        ArrayList arrayList2 = new ArrayList(6);
        arrayList2.add(lVar.f43955a);
        arrayList2.add(lVar.f43956b);
        arrayList2.add(lVar.f43957c);
        arrayList2.add(lVar.f43958d);
        arrayList2.add(lVar.f43959e);
        arrayList2.add(lVar.f43960f);
        k(byteArrayOutputStream, arrayList2);
    }
}
