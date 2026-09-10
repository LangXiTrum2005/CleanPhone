package kg;

import android.media.MediaFormat;
import com.google.android.gms.internal.ads.n3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ec.a f44629b = new ec.a("DefaultVideoStrategy");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f44630a;

    public c(b bVar) {
        this.f44630a = bVar;
    }

    @Override // kg.e
    public final vf.b a(ArrayList arrayList, MediaFormat mediaFormat) {
        b bVar;
        boolean z10;
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = this.f44630a;
            if (!zHasNext) {
                z10 = true;
                break;
            }
            if (!((MediaFormat) it.next()).getString("mime").equalsIgnoreCase(bVar.f44628e)) {
                z10 = false;
                break;
            }
        }
        int size = arrayList.size();
        float[] fArr = new float[size];
        boolean[] zArr = new boolean[size];
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i12 = 0;
        while (true) {
            str = "rotation-degrees";
            if (i12 >= size) {
                break;
            }
            MediaFormat mediaFormat2 = (MediaFormat) arrayList.get(i12);
            float integer = mediaFormat2.getInteger("width");
            float integer2 = mediaFormat2.getInteger("height");
            boolean z11 = (mediaFormat2.containsKey("rotation-degrees") ? mediaFormat2.getInteger("rotation-degrees") : 0) % 180 != 0;
            zArr[i12] = z11;
            float f11 = z11 ? integer2 / integer : integer / integer2;
            fArr[i12] = f11;
            f10 += f11;
            i12++;
        }
        float f12 = f10 / size;
        float f13 = Float.MAX_VALUE;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            float fAbs = Math.abs(fArr[i14] - f12);
            if (fAbs < f13) {
                i13 = i14;
                f13 = fAbs;
            }
        }
        MediaFormat mediaFormat3 = (MediaFormat) arrayList.get(i13);
        int integer3 = mediaFormat3.getInteger("width");
        int integer4 = mediaFormat3.getInteger("height");
        boolean z12 = zArr[i13];
        int i15 = z12 ? integer4 : integer3;
        if (!z12) {
            integer3 = integer4;
        }
        vf.a aVar = new vf.a(i15, integer3);
        int i16 = aVar.f17625b;
        StringBuilder sb2 = new StringBuilder("Input width&height: ");
        int i17 = aVar.f52570c;
        sb2.append(i17);
        sb2.append("x");
        int i18 = aVar.f52571d;
        sb2.append(i18);
        String string = sb2.toString();
        ec.a aVar2 = f44629b;
        aVar2.a(string);
        try {
            n3 n3VarA = bVar.f44624a.a(aVar);
            if (n3VarA instanceof vf.a) {
                vf.a aVar3 = (vf.a) n3VarA;
                i10 = aVar3.f52570c;
                i11 = aVar3.f52571d;
            } else if (i17 >= i18) {
                i10 = n3VarA.f17624a;
                i11 = n3VarA.f17625b;
            } else {
                i10 = n3VarA.f17625b;
                i11 = n3VarA.f17624a;
            }
            aVar2.a("Output width&height: " + i10 + "x" + i11);
            boolean z13 = i16 <= n3VarA.f17625b;
            Iterator it2 = arrayList.iterator();
            int iMin = Integer.MAX_VALUE;
            while (true) {
                str2 = "frame-rate";
                if (!it2.hasNext()) {
                    break;
                }
                boolean z14 = z10;
                MediaFormat mediaFormat4 = (MediaFormat) it2.next();
                if (mediaFormat4.containsKey("frame-rate")) {
                    iMin = Math.min(iMin, mediaFormat4.getInteger("frame-rate"));
                }
                z10 = z14;
            }
            boolean z15 = z10;
            if (iMin == Integer.MAX_VALUE) {
                iMin = -1;
            }
            int iMin2 = iMin > 0 ? Math.min(iMin, bVar.f44626c) : bVar.f44626c;
            boolean z16 = iMin <= iMin2;
            Iterator it3 = arrayList.iterator();
            boolean z17 = z13;
            int i19 = 0;
            int integer5 = 0;
            while (true) {
                str3 = str2;
                if (!it3.hasNext()) {
                    break;
                }
                String str4 = str;
                MediaFormat mediaFormat5 = (MediaFormat) it3.next();
                if (mediaFormat5.containsKey("i-frame-interval")) {
                    i19++;
                    integer5 += mediaFormat5.getInteger("i-frame-interval");
                }
                str2 = str3;
                str = str4;
            }
            String str5 = str;
            int iRound = i19 > 0 ? Math.round(integer5 / i19) : -1;
            boolean z18 = ((float) iRound) >= bVar.f44627d;
            if (arrayList.size() == 1 && z15 && z17 && z16 && z18) {
                StringBuilder sbU = defpackage.e.u(i16, "Input minSize: ", ", desired minSize: ");
                l1.d.o(sbU, n3VarA.f17625b, "\nInput frameRate: ", iMin, ", desired frameRate: ");
                l1.d.o(sbU, iMin2, "\nInput iFrameInterval: ", iRound, ", desired iFrameInterval: ");
                sbU.append(bVar.f44627d);
                aVar2.a(sbU.toString());
                return vf.b.f52574c;
            }
            mediaFormat.setString("mime", bVar.f44628e);
            mediaFormat.setInteger("width", i10);
            mediaFormat.setInteger("height", i11);
            mediaFormat.setInteger(str5, 0);
            mediaFormat.setInteger(str3, iMin2);
            mediaFormat.setFloat("i-frame-interval", bVar.f44627d);
            mediaFormat.setInteger("color-format", 2130708361);
            long j10 = bVar.f44625b;
            if (j10 == Long.MIN_VALUE) {
                j10 = (long) (i10 * 0.14f * i11 * iMin2);
            }
            mediaFormat.setInteger("bitrate", (int) j10);
            return vf.b.f52575d;
        } catch (Exception e10) {
            throw new RuntimeException("Resizer error:", e10);
        }
    }
}
