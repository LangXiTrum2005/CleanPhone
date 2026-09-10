package kg;

import android.media.MediaFormat;
import com.google.android.gms.internal.ads.ur1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ur1 f44623a;

    @Override // kg.e
    public final vf.b a(ArrayList arrayList, MediaFormat mediaFormat) {
        long integer;
        ur1 ur1Var = this.f44623a;
        int i10 = ur1Var.f20874a;
        if (i10 == -1) {
            Iterator it = arrayList.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, ((MediaFormat) it.next()).getInteger("channel-count"));
            }
            i10 = iMax;
        }
        int i11 = ur1Var.f20877d;
        if (i11 == -1) {
            Iterator it2 = arrayList.iterator();
            int iMin = Integer.MAX_VALUE;
            while (it2.hasNext()) {
                iMin = Math.min(iMin, ((MediaFormat) it2.next()).getInteger("sample-rate"));
            }
            i11 = iMin;
        }
        if (arrayList.size() == 1 && ur1Var.f20874a == -1 && ur1Var.f20877d == -1 && ur1Var.f20875b == Long.MIN_VALUE && ((MediaFormat) arrayList.get(0)).containsKey("bitrate")) {
            integer = ((MediaFormat) arrayList.get(0)).getInteger("bitrate");
        } else {
            integer = ur1Var.f20875b;
            if (integer == Long.MIN_VALUE) {
                integer = (long) (((long) 16) * ((long) i11) * ((long) i10) * 0.75d);
            }
        }
        mediaFormat.setString("mime", (String) ur1Var.f20876c);
        mediaFormat.setInteger("sample-rate", i11);
        mediaFormat.setInteger("channel-count", i10);
        mediaFormat.setInteger("bitrate", (int) integer);
        if (MimeTypes.AUDIO_AAC.equalsIgnoreCase((String) ur1Var.f20876c)) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        return vf.b.f52575d;
    }
}
